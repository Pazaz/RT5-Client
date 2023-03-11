import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class233 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!hu;")
	private final Class98 aClass98_60 = new Class98(64);

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Lclient!r;")
	private final Class197 aClass197_91;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class233(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_91 = arg2;
		if (this.aClass197_91 != null) {
			this.aClass197_91.method5081(35);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public void method5881() {
		@Pc(2) Class98 local2 = this.aClass98_60;
		synchronized (this.aClass98_60) {
			this.aClass98_60.method2614();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	public void method5882() {
		@Pc(10) Class98 local10 = this.aClass98_60;
		synchronized (this.aClass98_60) {
			this.aClass98_60.method2621();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
	public void method5884() {
		@Pc(2) Class98 local2 = this.aClass98_60;
		synchronized (this.aClass98_60) {
			this.aClass98_60.method2615(5);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Lclient!ud;")
	public Class230 method5885(@OriginalArg(1) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_60;
		@Pc(16) Class230 local16;
		synchronized (this.aClass98_60) {
			local16 = (Class230) this.aClass98_60.method2612((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_91.method5089(arg0, 35);
		local16 = new Class230();
		if (local33 != null) {
			local16.method5836(new Class2_Sub4(local33));
		}
		local16.method5834();
		@Pc(52) Class98 local52 = this.aClass98_60;
		synchronized (this.aClass98_60) {
			this.aClass98_60.method2624((long) arg0, local16);
			return local16;
		}
	}
}
