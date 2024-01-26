import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vka")
public final class Class387 {

	@OriginalMember(owner = "client!vka", name = "j", descriptor = "Lclient!dla;")
	private final Class82 aClass82_223 = new Class82(128);

	@OriginalMember(owner = "client!vka", name = "d", descriptor = "Lclient!sb;")
	private final Class330 aClass330_122;

	@OriginalMember(owner = "client!vka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class387(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
		this.aClass330_122 = arg2;
		if (this.aClass330_122 != null) {
			@Pc(20) int local20 = this.aClass330_122.method7597() - 1;
			this.aClass330_122.method7608(local20);
		}
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(II)Lclient!bt;")
	public Class53 method8925(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_223;
		@Pc(16) Class53 local16;
		synchronized (this.aClass82_223) {
			local16 = (Class53) this.aClass82_223.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) byte[] local40 = this.aClass330_122.method7595(Static61.method1313(arg0), Static188.method2857(arg0));
		local16 = new Class53();
		if (local40 != null) {
			local16.method1222(new Class2_Sub21(local40));
		}
		@Pc(66) Class82 local66 = this.aClass82_223;
		synchronized (this.aClass82_223) {
			this.aClass82_223.method2150(local16, (long) arg0);
			return local16;
		}
	}
}
