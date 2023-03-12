import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Js5CacheQueue implements Runnable {

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "Lclient!wc;")
	private final SecondaryLinkedList aClass246_9 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "Z")
	private boolean aBoolean404 = false;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
	public int anInt5741 = 0;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Js5CacheQueue(@OriginalArg(0) Signlink arg0) {
		@Pc(20) PrivilegedRequest local20 = arg0.startThread(5, this);
		while (local20.status == 0) {
			ThreadUtils.sleep(10L);
		}
		if (local20.status == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.result;
	}

	@OriginalMember(owner = "client!ro", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean404) {
			@Pc(6) SecondaryLinkedList local6 = this.aClass246_9;
			@Pc(14) Js5CacheRequest local14;
			synchronized (this.aClass246_9) {
				local14 = (Js5CacheRequest) this.aClass246_9.method6339();
				if (local14 == null) {
					try {
						this.aClass246_9.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt5741--;
			}
			try {
				if (local14.anInt6199 == 2) {
					local14.aClass207_4.method5259(local14.aByteArray91.length, local14.aByteArray91, (int) local14.secondaryKey);
				} else if (local14.anInt6199 == 3) {
					local14.aByteArray91 = local14.aClass207_4.method5261((int) local14.secondaryKey);
				}
			} catch (@Pc(74) Exception local74) {
				Static262.report(local74, null);
			}
			local14.incomplete = false;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!td;)V")
	private void method5224(@OriginalArg(1) Js5CacheRequest arg0) {
		@Pc(2) SecondaryLinkedList local2 = this.aClass246_9;
		synchronized (this.aClass246_9) {
			this.aClass246_9.addTail(arg0);
			this.anInt5741++;
			this.aClass246_9.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBLclient!rq;)Lclient!td;")
	public Js5CacheRequest readSynchronous(@OriginalArg(0) int arg0, @OriginalArg(2) Cache arg1) {
		@Pc(15) Js5CacheRequest local15 = new Js5CacheRequest();
		local15.anInt6199 = 1;
		@Pc(21) SecondaryLinkedList local21 = this.aClass246_9;
		synchronized (this.aClass246_9) {
			@Pc(29) Js5CacheRequest local29 = (Js5CacheRequest) this.aClass246_9.head();
			while (true) {
				if (local29 == null) {
					break;
				}
				if (local29.secondaryKey == (long) arg0 && local29.aClass207_4 == arg1 && local29.anInt6199 == 2) {
					local15.aByteArray91 = local29.aByteArray91;
					local15.incomplete = false;
					return local15;
				}
				local29 = (Js5CacheRequest) this.aClass246_9.next();
			}
		}
		local15.aByteArray91 = arg1.method5261(arg0);
		local15.incomplete = false;
		local15.urgent = true;
		return local15;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!rq;Z)Lclient!td;")
	public Js5CacheRequest read(@OriginalArg(0) int arg0, @OriginalArg(1) Cache arg1) {
		@Pc(12) Js5CacheRequest local12 = new Js5CacheRequest();
		local12.aClass207_4 = arg1;
		local12.anInt6199 = 3;
		local12.urgent = false;
		local12.secondaryKey = arg0;
		this.method5224(local12);
		return local12;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V")
	public void method5228() {
		this.aBoolean404 = true;
		@Pc(9) SecondaryLinkedList local9 = this.aClass246_9;
		synchronized (this.aClass246_9) {
			this.aClass246_9.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([BILclient!rq;I)Lclient!td;")
	public Js5CacheRequest write(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Cache arg2) {
		@Pc(13) Js5CacheRequest local13 = new Js5CacheRequest();
		local13.aByteArray91 = arg0;
		local13.urgent = false;
		local13.secondaryKey = arg1;
		local13.aClass207_4 = arg2;
		local13.anInt6199 = 2;
		this.method5224(local13);
		return local13;
	}
}
