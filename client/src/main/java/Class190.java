import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class190 {

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!hu;")
	private final Class98 aClass98_41 = new Class98(64);

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Lclient!r;")
	private final Class197 aClass197_69;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class190(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_69 = arg2;
		this.aClass197_69.method5081(31);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!et;")
	public Class66 method4878(@OriginalArg(0) int arg0) {
		@Pc(11) Class98 local11 = this.aClass98_41;
		@Pc(21) Class66 local21;
		synchronized (this.aClass98_41) {
			local21 = (Class66) this.aClass98_41.method2612((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass197_69.method5089(arg0, 31);
		local21 = new Class66();
		if (local38 != null) {
			local21.method1936(new Buffer(local38));
		}
		@Pc(54) Class98 local54 = this.aClass98_41;
		synchronized (this.aClass98_41) {
			this.aClass98_41.method2624((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)V")
	public void method4879() {
		@Pc(6) Class98 local6 = this.aClass98_41;
		synchronized (this.aClass98_41) {
			this.aClass98_41.method2615(5);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	public void method4884() {
		@Pc(2) Class98 local2 = this.aClass98_41;
		synchronized (this.aClass98_41) {
			this.aClass98_41.method2621();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public void method4885() {
		@Pc(2) Class98 local2 = this.aClass98_41;
		synchronized (this.aClass98_41) {
			this.aClass98_41.method2614();
		}
	}
}
