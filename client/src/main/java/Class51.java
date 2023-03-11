import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class51 {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!hu;")
	private final Class98 aClass98_6 = new Class98(64);

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!r;")
	private final Class197 aClass197_15;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class51(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_15 = arg2;
		this.aClass197_15.method5081(5);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)Lclient!hl;")
	public Class2_Sub2_Sub8 method1706(@OriginalArg(0) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_6;
		@Pc(16) Class2_Sub2_Sub8 local16;
		synchronized (this.aClass98_6) {
			local16 = (Class2_Sub2_Sub8) this.aClass98_6.method2612((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass197_15.method5089(arg0, 5);
		local16 = new Class2_Sub2_Sub8();
		if (local38 != null) {
			local16.method2501(new Class2_Sub4(local38));
		}
		@Pc(54) Class98 local54 = this.aClass98_6;
		synchronized (this.aClass98_6) {
			this.aClass98_6.method2624((long) arg0, local16);
			return local16;
		}
	}
}
