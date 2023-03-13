import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.zip.CRC32;

@OriginalClass("client!bl")
public final class Js5CachedResourceProvider extends Js5ResourceProvider {

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 crc32 = new CRC32();
	@OriginalMember(owner = "client!bl", name = "v", descriptor = "[B")
	private byte[] groupStatus;

	@OriginalMember(owner = "client!bl", name = "A", descriptor = "Lclient!ra;")
	private Js5Index index;

	@OriginalMember(owner = "client!bl", name = "L", descriptor = "Z")
	private boolean prefetchAll;

	@OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
	private int verifiedGroups = 0;

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "Lclient!ad;")
	private final HashTable requests = new HashTable(16);

	@OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
	private int group = 0;

	@OriginalMember(owner = "client!bl", name = "K", descriptor = "Lclient!ld;")
	private final LinkedList prefetchQueue = new LinkedList();

	@OriginalMember(owner = "client!bl", name = "P", descriptor = "J")
	private long orphanCheckTime = 0L;

	@OriginalMember(owner = "client!bl", name = "G", descriptor = "Lclient!rq;")
	private final Cache cache;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
	private final int archive;

	@OriginalMember(owner = "client!bl", name = "M", descriptor = "Z")
	private boolean verifyAll;

	@OriginalMember(owner = "client!bl", name = "J", descriptor = "Lclient!ld;")
	private LinkedList groupQueue;

	@OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
	private final int expectedVersion;

	@OriginalMember(owner = "client!bl", name = "N", descriptor = "Z")
	private final boolean aBoolean58;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "Lclient!rq;")
	private final Cache masterCache;

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "Lclient!pp;")
	private final Js5NetQueue netQueue;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "Lclient!ro;")
	private final Js5CacheQueue cacheQueue;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
	private final int expectedChecksum;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "Lclient!ut;")
	private Js5Request indexRequest;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILclient!rq;Lclient!rq;Lclient!pp;Lclient!ro;IIZ)V")
	public Js5CachedResourceProvider(@OriginalArg(0) int arg0, @OriginalArg(1) Cache arg1, @OriginalArg(2) Cache arg2, @OriginalArg(3) Js5NetQueue arg3, @OriginalArg(4) Js5CacheQueue arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.cache = arg1;
		this.archive = arg0;
		if (this.cache == null) {
			this.verifyAll = false;
		} else {
			this.verifyAll = true;
			this.groupQueue = new LinkedList();
		}
		this.expectedVersion = arg6;
		this.aBoolean58 = arg7;
		this.masterCache = arg2;
		this.netQueue = arg3;
		this.cacheQueue = arg4;
		this.expectedChecksum = arg5;
		if (this.masterCache != null) {
			this.indexRequest = this.cacheQueue.readSynchronous(this.archive, this.masterCache);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	public void method892() {
		if (this.groupQueue == null || this.fetchIndex() == null) {
			return;
		}
		for (@Pc(24) Node local24 = this.prefetchQueue.head(); local24 != null; local24 = this.prefetchQueue.next()) {
			@Pc(30) int local30 = (int) local24.key;
			if (local30 < 0 || local30 >= this.index.capacity || this.index.groupSizes[local30] == 0) {
				local24.unlink();
			} else {
				if (this.groupStatus[local30] == 0) {
					this.fetchGroupInner(local30, 1);
				}
				if (this.groupStatus[local30] == -1) {
					this.fetchGroupInner(local30, 2);
				}
				if (this.groupStatus[local30] == 1) {
					local24.unlink();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
	public void method894() {
		if (this.groupQueue != null) {
			if (this.fetchIndex() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Node local30;
			@Pc(36) int local36;
			@Pc(129) Node local129;
			if (this.verifyAll) {
				local25 = true;
				for (local30 = this.groupQueue.head(); local30 != null; local30 = this.groupQueue.next()) {
					local36 = (int) local30.key;
					if (this.groupStatus[local36] == 0) {
						this.fetchGroupInner(local36, 1);
					}
					if (this.groupStatus[local36] == 0) {
						local25 = false;
					} else {
						local30.unlink();
					}
				}
				while (this.group < this.index.groupSizes.length) {
					if (this.index.groupSizes[this.group] == 0) {
						this.group++;
					} else {
						if (this.cacheQueue.anInt5741 >= 250) {
							local25 = false;
							break;
						}
						if (this.groupStatus[this.group] == 0) {
							this.fetchGroupInner(this.group, 1);
						}
						if (this.groupStatus[this.group] == 0) {
							local129 = new Node();
							local129.key = this.group;
							this.groupQueue.addTail(local129);
							local25 = false;
						}
						this.group++;
					}
				}
				if (local25) {
					this.group = 0;
					this.verifyAll = false;
				}
			} else if (this.prefetchAll) {
				local25 = true;
				for (local30 = this.groupQueue.head(); local30 != null; local30 = this.groupQueue.next()) {
					local36 = (int) local30.key;
					if (this.groupStatus[local36] != 1) {
						this.fetchGroupInner(local36, 2);
					}
					if (this.groupStatus[local36] == 1) {
						local30.unlink();
					} else {
						local25 = false;
					}
				}
				while (this.group < this.index.groupSizes.length) {
					if (this.index.groupSizes[this.group] == 0) {
						this.group++;
					} else {
						if (this.netQueue.isPrefetchRequestQueueFull()) {
							local25 = false;
							break;
						}
						if (this.groupStatus[this.group] != 1) {
							this.fetchGroupInner(this.group, 2);
						}
						if (this.groupStatus[this.group] != 1) {
							local129 = new Node();
							local129.key = this.group;
							this.groupQueue.addTail(local129);
							local25 = false;
						}
						this.group++;
					}
				}
				if (local25) {
					this.group = 0;
					this.prefetchAll = false;
				}
			} else {
				this.groupQueue = null;
			}
		}
		if (!this.aBoolean58 || MonotonicClock.currentTimeMillis() < this.orphanCheckTime) {
			return;
		}
		for (@Pc(329) Js5Request local329 = (Js5Request) this.requests.head(); local329 != null; local329 = (Js5Request) this.requests.next()) {
			if (!local329.incomplete) {
				if (local329.orphan) {
					if (!local329.urgent) {
						throw new RuntimeException();
					}
					local329.unlink();
				} else {
					local329.orphan = true;
				}
			}
		}
		this.orphanCheckTime = MonotonicClock.currentTimeMillis() + 1000L;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)I")
	public int method895() {
		return this.index == null ? 0 : this.index.size;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)I")
	public int method896() {
		if (this.fetchIndex() == null) {
			return this.indexRequest == null ? 0 : this.indexRequest.getPercentageComplete();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] fetchGroup(@OriginalArg(0) int arg0) {
		@Pc(9) Js5Request local9 = this.fetchGroupInner(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.getData();
			local9.unlink();
			return local17;
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(Z)I")
	public int method897() {
		if (this.index == null) {
			return 0;
		} else if (this.verifyAll) {
			@Pc(20) Node local20 = this.groupQueue.head();
			return local20 == null ? 0 : (int) local20.key;
		} else {
			return this.index.size;
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I")
	public int method898() {
		return this.verifiedGroups;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
	public void method899() {
		if (this.cache != null) {
			this.prefetchAll = true;
			if (this.groupQueue == null) {
				this.groupQueue = new LinkedList();
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)Lclient!ut;")
	private Js5Request fetchGroupInner(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Js5Request local13 = (Js5Request) this.requests.get((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.urgent && local13.incomplete) {
			local13.unlink();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.cache == null || this.groupStatus[arg0] == -1) {
					if (this.netQueue.isUrgentRequestQueueFull()) {
						return null;
					}
					local13 = this.netQueue.read(true, this.archive, (byte) 2, arg0);
				} else {
					local13 = this.cacheQueue.readSynchronous(arg0, this.cache);
				}
			} else if (arg1 == 1) {
				if (this.cache == null) {
					throw new RuntimeException();
				}
				local13 = this.cacheQueue.read(arg0, this.cache);
			} else if (arg1 == 2) {
				if (this.cache == null) {
					throw new RuntimeException();
				}
				if (this.groupStatus[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.netQueue.isPrefetchRequestQueueFull()) {
					return null;
				}
				local13 = this.netQueue.read(false, this.archive, (byte) 2, arg0);
			} else {
				throw new RuntimeException();
			}
			this.requests.put(local13, (long) arg0);
		}
		if (local13.incomplete) {
			return null;
		}
		@Pc(162) byte[] local162 = local13.getData();
		@Pc(189) int local189;
		@Pc(292) Js5NetRequest local292;
		if (!(local13 instanceof Js5CacheRequest)) {
			try {
				if (local162 == null || local162.length <= 2) {
					throw new RuntimeException();
				}
				crc32.reset();
				crc32.update(local162, 0, local162.length - 2);
				local189 = (int) crc32.getValue();
				if (this.index.groupChecksums[arg0] != local189) {
					throw new RuntimeException();
				}
				this.netQueue.errors = 0;
				this.netQueue.response = 0;
			} catch (@Pc(350) RuntimeException local350) {
				this.netQueue.rekey();
				local13.unlink();
				if (local13.urgent && !this.netQueue.isUrgentRequestQueueFull()) {
					local292 = this.netQueue.read(true, this.archive, (byte) 2, arg0);
					this.requests.put(local292, (long) arg0);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.index.groupVersions[arg0] >>> 8);
			local162[local162.length - 1] = (byte) this.index.groupVersions[arg0];
			if (this.cache != null) {
				this.cacheQueue.write(local162, arg0, this.cache);
				if (this.groupStatus[arg0] != 1) {
					this.verifiedGroups++;
					this.groupStatus[arg0] = 1;
				}
			}
			if (!local13.urgent) {
				local13.unlink();
			}
			return local13;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			crc32.reset();
			crc32.update(local162, 0, local162.length - 2);
			local189 = (int) crc32.getValue();
			if (local189 != this.index.groupChecksums[arg0]) {
				throw new RuntimeException();
			}
			@Pc(225) int local225 = ((local162[local162.length - 2] & 0xFF) << 8) + (local162[local162.length - 1] & 0xFF);
			if ((this.index.groupVersions[arg0] & 0xFFFF) != local225) {
				throw new RuntimeException();
			}
			if (this.groupStatus[arg0] != 1) {
				this.verifiedGroups++;
				this.groupStatus[arg0] = 1;
			}
			if (!local13.urgent) {
				local13.unlink();
			}
			return local13;
		} catch (@Pc(266) Exception local266) {
			this.groupStatus[arg0] = -1;
			local13.unlink();
			if (local13.urgent && !this.netQueue.isUrgentRequestQueueFull()) {
				local292 = this.netQueue.read(true, this.archive, (byte) 2, arg0);
				this.requests.put(local292, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
	@Override
	public void prefetchGroup(@OriginalArg(0) int arg0) {
		if (this.cache == null) {
			return;
		}
		for (@Pc(20) Node local20 = this.prefetchQueue.head(); local20 != null; local20 = this.prefetchQueue.next()) {
			if ((long) arg0 == local20.key) {
				return;
			}
		}
		@Pc(46) Node local46 = new Node();
		local46.key = arg0;
		this.prefetchQueue.addTail(local46);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)I")
	@Override
	public int getPercentageComplete(@OriginalArg(0) int arg0) {
		@Pc(19) Js5Request local19 = (Js5Request) this.requests.get((long) arg0);
		return local19 == null ? 0 : local19.getPercentageComplete();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Lclient!ra;")
	@Override
	public Js5Index fetchIndex() {
		if (this.index != null) {
			return this.index;
		}
		if (this.indexRequest == null) {
			if (this.netQueue.isUrgentRequestQueueFull()) {
				return null;
			}
			this.indexRequest = this.netQueue.read(true, 255, (byte) 0, this.archive);
		}
		if (this.indexRequest.incomplete) {
			return null;
		}
		@Pc(48) byte[] local48 = this.indexRequest.getData();
		if (this.indexRequest instanceof Js5CacheRequest) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(local48, this.expectedChecksum);
				if (this.expectedVersion != this.index.version) {
					throw new RuntimeException();
				}
			} catch (@Pc(138) RuntimeException local138) {
				this.index = null;
				if (this.netQueue.isUrgentRequestQueueFull()) {
					this.indexRequest = null;
				} else {
					this.indexRequest = this.netQueue.read(true, 255, (byte) 0, this.archive);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(local48, this.expectedChecksum);
			} catch (@Pc(68) RuntimeException local68) {
				this.netQueue.rekey();
				this.index = null;
				if (this.netQueue.isUrgentRequestQueueFull()) {
					this.indexRequest = null;
				} else {
					this.indexRequest = this.netQueue.read(true, 255, (byte) 0, this.archive);
				}
				return null;
			}
			if (this.masterCache != null) {
				this.cacheQueue.write(local48, this.archive, this.masterCache);
			}
		}
		this.indexRequest = null;
		if (this.cache != null) {
			this.verifiedGroups = 0;
			this.groupStatus = new byte[this.index.capacity];
		}
		return this.index;
	}
}
