import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class99 implements Runnable {

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Lclient!rr;")
	private final Class179 aClass179_3 = new Class179();

	@OriginalMember(owner = "client!je", name = "w", descriptor = "I")
	public int anInt3446 = 0;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!ud;)V")
	public Class99(@OriginalArg(0) Class199 arg0) {
		@Pc(20) Class145 local20 = arg0.method5482(this, 5);
		while (local20.anInt5065 == 0) {
			Static295.method5212(10L);
		}
		if (local20.anInt5065 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject6;
	}

	@OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean239) {
			@Pc(6) Class179 local6 = this.aClass179_3;
			@Pc(14) Class1_Sub1_Sub2_Sub2 local14;
			synchronized (this.aClass179_3) {
				local14 = (Class1_Sub1_Sub2_Sub2) this.aClass179_3.method4926();
				if (local14 == null) {
					try {
						this.aClass179_3.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt3446--;
			}
			try {
				if (local14.anInt4218 == 2) {
					local14.aClass96_4.method3042((int) local14.aLong234, local14.aByteArray40.length, local14.aByteArray40);
				} else if (local14.anInt4218 == 3) {
					local14.aByteArray40 = local14.aClass96_4.method3045((int) local14.aLong234);
				}
			} catch (@Pc(74) Exception local74) {
				Static58.method1402(null, local74);
			}
			local14.aBoolean300 = false;
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
	public void method3061() {
		this.aBoolean239 = true;
		@Pc(9) Class179 local9 = this.aClass179_3;
		synchronized (this.aClass179_3) {
			this.aClass179_3.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!jb;I[B)Lclient!lq;")
	public Class1_Sub1_Sub2_Sub2 method3062(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class1_Sub1_Sub2_Sub2 local7 = new Class1_Sub1_Sub2_Sub2();
		local7.aClass96_4 = arg1;
		local7.aByteArray40 = arg2;
		local7.aBoolean299 = false;
		local7.aLong234 = arg0;
		local7.anInt4218 = 2;
		this.method3065(local7);
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BILclient!jb;)Lclient!lq;")
	public Class1_Sub1_Sub2_Sub2 method3064(@OriginalArg(1) int arg0, @OriginalArg(2) Class96 arg1) {
		@Pc(9) Class1_Sub1_Sub2_Sub2 local9 = new Class1_Sub1_Sub2_Sub2();
		local9.anInt4218 = 1;
		@Pc(15) Class179 local15 = this.aClass179_3;
		synchronized (this.aClass179_3) {
			@Pc(25) Class1_Sub1_Sub2_Sub2 local25 = (Class1_Sub1_Sub2_Sub2) this.aClass179_3.method4935();
			while (true) {
				if (local25 == null) {
					break;
				}
				if ((long) arg0 == local25.aLong234 && local25.aClass96_4 == arg1 && local25.anInt4218 == 2) {
					local9.aByteArray40 = local25.aByteArray40;
					local9.aBoolean300 = false;
					return local9;
				}
				local25 = (Class1_Sub1_Sub2_Sub2) this.aClass179_3.method4932();
			}
		}
		local9.aByteArray40 = arg1.method3045(arg0);
		local9.aBoolean300 = false;
		local9.aBoolean299 = true;
		return local9;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!lq;)V")
	private void method3065(@OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg0) {
		@Pc(2) Class179 local2 = this.aClass179_3;
		synchronized (this.aClass179_3) {
			this.aClass179_3.method4927(arg0);
			this.anInt3446++;
			this.aClass179_3.notifyAll();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILclient!jb;)Lclient!lq;")
	public Class1_Sub1_Sub2_Sub2 method3066(@OriginalArg(1) int arg0, @OriginalArg(2) Class96 arg1) {
		@Pc(7) Class1_Sub1_Sub2_Sub2 local7 = new Class1_Sub1_Sub2_Sub2();
		local7.aLong234 = arg0;
		local7.aBoolean299 = false;
		local7.aClass96_4 = arg1;
		local7.anInt4218 = 3;
		this.method3065(local7);
		return local7;
	}
}
