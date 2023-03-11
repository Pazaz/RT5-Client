import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class199 {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!hu;")
	private final Class98 aClass98_43 = new Class98(64);

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!r;")
	private final Class197 aClass197_76;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public final int anInt5596;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class199(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_76 = arg2;
		if (this.aClass197_76 == null) {
			this.anInt5596 = 0;
		} else {
			this.anInt5596 = this.aClass197_76.method5081(16);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public void method5108() {
		@Pc(2) Class98 local2 = this.aClass98_43;
		synchronized (this.aClass98_43) {
			this.aClass98_43.method2614();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	public void method5109() {
		@Pc(14) Class98 local14 = this.aClass98_43;
		synchronized (this.aClass98_43) {
			this.aClass98_43.method2615(5);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public void method5112() {
		@Pc(14) Class98 local14 = this.aClass98_43;
		synchronized (this.aClass98_43) {
			this.aClass98_43.method2621();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Lclient!ok;")
	public Class171 method5114(@OriginalArg(0) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_43;
		@Pc(16) Class171 local16;
		synchronized (this.aClass98_43) {
			local16 = (Class171) this.aClass98_43.method2612((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_76.method5089(arg0, 16);
		local16 = new Class171();
		if (local33 != null) {
			local16.method4370(new Class2_Sub4(local33));
		}
		@Pc(49) Class98 local49 = this.aClass98_43;
		synchronized (this.aClass98_43) {
			this.aClass98_43.method2624((long) arg0, local16);
			return local16;
		}
	}
}
