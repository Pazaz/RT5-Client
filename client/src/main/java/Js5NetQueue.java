import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Js5NetQueue {

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "Lclient!iu;")
	private BufferedSocket socket;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
	private int latency;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "J")
	private long previousLoop;

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "Lclient!jj;")
	private Js5NetRequest current;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "Lclient!wc;")
	private final SecondaryLinkedList pendingUrgentRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "Lclient!wc;")
	private final SecondaryLinkedList inFlightUrgentRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "Lclient!wc;")
	private final SecondaryLinkedList pendingPrefetchRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "Lclient!wc;")
	private final SecondaryLinkedList inFlightPrefetchRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "Lclient!bt;")
	private final Buffer outBuffer = new Buffer(4);

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "B")
	private byte encryptionKey = 0;

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
	public volatile int errors = 0;

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
	public volatile int response = 0;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "Lclient!bt;")
	private final Buffer inBuffer = new Buffer(8);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	private void writeInitiating() {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.pos = 0;
			this.outBuffer.p1(6);
			this.outBuffer.p3(3);
			this.socket.write(4, this.outBuffer.data);
		} catch (@Pc(40) IOException local40) {
			try {
				this.socket.close();
			} catch (@Pc(46) Exception local46) {
			}
			this.response = -2;
			this.errors++;
			this.socket = null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public void breakConnection() {
		if (this.socket != null) {
			this.socket.breakConnection();
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public void writeTerminate() {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.pos = 0;
			this.outBuffer.p1(7);
			this.outBuffer.p3(0);
			this.socket.write(4, this.outBuffer.data);
		} catch (@Pc(34) IOException local34) {
			try {
				this.socket.close();
			} catch (@Pc(40) Exception local40) {
			}
			this.response = -2;
			this.socket = null;
			this.errors++;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)Z")
	public boolean isPrefetchRequestQueueFull() {
		return this.getPrefetchRequestCount() >= 20;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)I")
	public int getUrgentRequestCount() {
		return this.pendingUrgentRequests.method6338() + this.inFlightUrgentRequests.method6338();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!iu;ZI)V")
	public void method4639(@OriginalArg(0) BufferedSocket arg0, @OriginalArg(1) boolean arg1) {
		if (this.socket != null) {
			try {
				this.socket.close();
			} catch (@Pc(16) Exception local16) {
			}
			this.socket = null;
		}
		this.socket = arg0;
		this.writeInitiating();
		this.writeLoggedIn(arg1);
		this.inBuffer.pos = 0;
		this.current = null;
		while (true) {
			@Pc(44) Js5NetRequest local44 = (Js5NetRequest) this.inFlightUrgentRequests.method6339();
			if (local44 == null) {
				while (true) {
					local44 = (Js5NetRequest) this.inFlightPrefetchRequests.method6339();
					if (local44 == null) {
						if (this.encryptionKey != 0) {
							try {
								this.outBuffer.pos = 0;
								this.outBuffer.p1(4);
								this.outBuffer.p1(this.encryptionKey);
								this.outBuffer.p2(0);
								this.socket.write(4, this.outBuffer.data);
							} catch (@Pc(103) IOException local103) {
								try {
									this.socket.close();
								} catch (@Pc(111) Exception local111) {
								}
								this.socket = null;
								this.response = -2;
								this.errors++;
							}
						}
						this.latency = 0;
						this.previousLoop = MonotonicClock.currentTimeMillis();
						return;
					}
					this.pendingPrefetchRequests.addTail(local44);
				}
			}
			this.pendingUrgentRequests.addTail(local44);
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)Z")
	public boolean loop() {
		@Pc(18) int local18;
		if (this.socket != null) {
			@Pc(11) long local11 = MonotonicClock.currentTimeMillis();
			local18 = (int) (local11 - this.previousLoop);
			this.previousLoop = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.latency += local18;
			if (this.latency > 30000) {
				try {
					this.socket.close();
				} catch (@Pc(46) Exception local46) {
				}
				this.socket = null;
			}
		}
		if (this.socket == null) {
			return this.getUrgentRequestCount() == 0 && this.getPrefetchRequestCount() == 0;
		}
		try {
			this.socket.checkError();
			for (@Pc(74) Js5NetRequest local74 = (Js5NetRequest) this.pendingUrgentRequests.head(); local74 != null; local74 = (Js5NetRequest) this.pendingUrgentRequests.next()) {
				this.outBuffer.pos = 0;
				this.outBuffer.p1(1);
				this.outBuffer.p3((int) local74.secondaryKey);
				this.socket.write(4, this.outBuffer.data);
				this.inFlightUrgentRequests.addTail(local74);
			}
			for (@Pc(126) Js5NetRequest local126 = (Js5NetRequest) this.pendingPrefetchRequests.head(); local126 != null; local126 = (Js5NetRequest) this.pendingPrefetchRequests.next()) {
				this.outBuffer.pos = 0;
				this.outBuffer.p1(0);
				this.outBuffer.p3((int) local126.secondaryKey);
				this.socket.write(4, this.outBuffer.data);
				this.inFlightPrefetchRequests.addTail(local126);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(175) int local175 = this.socket.available();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.latency = 0;
				@Pc(191) byte local191 = 0;
				if (this.current == null) {
					local191 = 8;
				} else if (this.current.blockPosition == 0) {
					local191 = 1;
				}
				@Pc(219) int local219;
				@Pc(243) int local243;
				@Pc(301) int local301;
				if (local191 > 0) {
					local219 = local191 - this.inBuffer.pos;
					if (local175 < local219) {
						local219 = local175;
					}
					this.socket.read(this.inBuffer.data, local219, this.inBuffer.pos);
					if (this.encryptionKey != 0) {
						for (local243 = 0; local243 < local219; local243++) {
							this.inBuffer.data[this.inBuffer.pos + local243] = (byte) (this.inBuffer.data[this.inBuffer.pos + local243] ^ this.encryptionKey);
						}
					}
					this.inBuffer.pos += local219;
					if (this.inBuffer.pos >= local191) {
						if (this.current == null) {
							this.inBuffer.pos = 0;
							local243 = this.inBuffer.g1();
							local301 = this.inBuffer.g2();
							@Pc(306) int local306 = this.inBuffer.g1();
							@Pc(311) int local311 = this.inBuffer.g4();
							@Pc(315) int local315 = local306 & 0x7F;
							@Pc(326) boolean local326 = (local306 & 0x80) != 0;
							@Pc(333) long local333 = (long) ((local243 << 16) + local301);
							@Pc(343) Js5NetRequest local343;
							if (local326) {
								for (local343 = (Js5NetRequest) this.inFlightPrefetchRequests.head(); local343 != null && local333 != local343.secondaryKey; local343 = (Js5NetRequest) this.inFlightPrefetchRequests.next()) {
								}
							} else {
								for (local343 = (Js5NetRequest) this.inFlightUrgentRequests.head(); local343 != null && local343.secondaryKey != local333; local343 = (Js5NetRequest) this.inFlightUrgentRequests.next()) {
								}
							}
							if (local343 == null) {
								throw new IOException();
							}
							this.current = local343;
							@Pc(399) int local399 = local315 == 0 ? 5 : 9;
							this.current.buffer = new Buffer(local311 + local399 + this.current.trailerLen);
							this.current.buffer.p1(local315);
							this.current.buffer.p4(local311);
							this.current.blockPosition = 8;
							this.inBuffer.pos = 0;
						} else if (this.current.blockPosition != 0) {
							throw new IOException();
						} else if (this.inBuffer.data[0] == -1) {
							this.current.blockPosition = 1;
							this.inBuffer.pos = 0;
						} else {
							this.current = null;
						}
					}
				} else {
					local219 = this.current.buffer.data.length - this.current.trailerLen;
					local243 = 512 - this.current.blockPosition;
					if (local219 - this.current.buffer.pos < local243) {
						local243 = local219 - this.current.buffer.pos;
					}
					if (local175 < local243) {
						local243 = local175;
					}
					this.socket.read(this.current.buffer.data, local243, this.current.buffer.pos);
					if (this.encryptionKey != 0) {
						for (local301 = 0; local301 < local243; local301++) {
							this.current.buffer.data[local301 + this.current.buffer.pos] ^= this.encryptionKey;
						}
					}
					this.current.buffer.pos += local243;
					this.current.blockPosition += local243;
					if (local219 == this.current.buffer.pos) {
						this.current.unlinkSecondary();
						this.current.incomplete = false;
						this.current = null;
					} else if (this.current.blockPosition == 512) {
						this.current.blockPosition = 0;
					}
				}
			}
			return true;
		} catch (@Pc(619) IOException local619) {
			try {
				this.socket.close();
			} catch (@Pc(625) Exception local625) {
			}
			this.socket = null;
			this.errors++;
			this.response = -2;
			return this.getUrgentRequestCount() == 0 && this.getPrefetchRequestCount() == 0;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZIBBI)Lclient!jj;")
	public Js5NetRequest read(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) ((arg1 << 16) + arg3);
		@Pc(20) Js5NetRequest local20 = new Js5NetRequest();
		local20.urgent = arg0;
		local20.secondaryKey = local16;
		local20.trailerLen = arg2;
		if (arg0) {
			if (this.getUrgentRequestCount() >= 20) {
				throw new RuntimeException();
			}
			this.pendingUrgentRequests.addTail(local20);
		} else if (this.getPrefetchRequestCount() < 20) {
			this.pendingPrefetchRequests.addTail(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V")
	public void rekey() {
		try {
			this.socket.close();
		} catch (@Pc(9) Exception local9) {
		}
		this.response = -1;
		this.socket = null;
		this.errors++;
		this.encryptionKey = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)Z")
	public boolean isUrgentRequestQueueFull() {
		return this.getUrgentRequestCount() >= 20;
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)V")
	public void quit() {
		if (this.socket != null) {
			this.socket.close();
		}
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(Z)I")
	private int getPrefetchRequestCount() {
		return this.pendingPrefetchRequests.method6338() + this.inFlightPrefetchRequests.method6338();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)V")
	public void writeLoggedIn(@OriginalArg(0) boolean arg0) {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.pos = 0;
			this.outBuffer.p1(arg0 ? 2 : 3);
			this.outBuffer.p3(0);
			this.socket.write(4, this.outBuffer.data);
		} catch (@Pc(41) IOException local41) {
			try {
				this.socket.close();
			} catch (@Pc(49) Exception local49) {
			}
			this.response = -2;
			this.errors++;
			this.socket = null;
		}
	}
}
