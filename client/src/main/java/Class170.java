import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class170 implements Runnable {

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Lclient!mi;")
	private final Class130 aClass130_34 = new Class130();

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	public Class170() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!o;)V")
	private void method4780(@OriginalArg(1) Class1 arg0) {
		@Pc(2) Class130 local2 = this.aClass130_34;
		synchronized (this.aClass130_34) {
			this.aClass130_34.method3760(arg0);
			this.aClass130_34.notify();
		}
	}

	@OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class130 local8 = this.aClass130_34;
			@Pc(38) Class1_Sub32 local38;
			synchronized (this.aClass130_34) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass130_34.method3747(); local15 == null; local15 = this.aClass130_34.method3747()) {
					try {
						this.aClass130_34.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub32)) {
					return;
				}
				local38 = (Class1_Sub32) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString220).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt5877 = local64;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public void method4786() {
		if (this.aThread2 == null) {
			return;
		}
		this.method4780(new Class1());
		try {
			this.aThread2.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!sa;")
	public Class1_Sub32 method4787(@OriginalArg(0) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class1_Sub32 local23 = new Class1_Sub32(arg0);
			this.method4780(local23);
			return local23;
		}
	}
}
