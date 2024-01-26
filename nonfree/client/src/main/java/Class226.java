import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class226 implements Runnable {

	@OriginalMember(owner = "client!lha", name = "h", descriptor = "Lclient!sia;")
	private final Class339 aClass339_32 = new Class339();

	@OriginalMember(owner = "client!lha", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4 = new Thread(this);

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "()V")
	public Class226() {
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!lha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class339 local8 = this.aClass339_32;
			@Pc(43) Class2_Sub12 local43;
			synchronized (this.aClass339_32) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass339_32.method7705(); local15 == null; local15 = this.aClass339_32.method7705()) {
					try {
						this.aClass339_32.wait();
					} catch (@Pc(23) InterruptedException local23) {
					}
				}
				if (!(local15 instanceof Class2_Sub12)) {
					return;
				}
				local43 = (Class2_Sub12) local15;
			}
			@Pc(69) int local69;
			try {
				@Pc(54) byte[] local54 = InetAddress.getByName(local43.aString14).getAddress();
				local69 = jagmisc.ping(local54[0], local54[1], local54[2], local54[3], 1000L);
			} catch (@Pc(71) Throwable local71) {
				local69 = 1000;
			}
			local43.anInt1631 = local69;
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V")
	public void method5243() {
		if (this.aThread4 == null) {
			return;
		}
		this.method5244(new Class2());
		try {
			this.aThread4.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILclient!ie;)V")
	private void method5244(@OriginalArg(1) Class2 arg0) {
		@Pc(2) Class339 local2 = this.aClass339_32;
		synchronized (this.aClass339_32) {
			this.aClass339_32.method7711(arg0);
			this.aClass339_32.notify();
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(BLjava/lang/String;)Lclient!cja;")
	public Class2_Sub12 method5245(@OriginalArg(1) String arg0) {
		if (this.aThread4 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(32) Class2_Sub12 local32 = new Class2_Sub12(arg0);
			this.method5244(local32);
			return local32;
		}
	}
}
