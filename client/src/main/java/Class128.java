import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class128 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!we;")
	private final Class215 aClass215_61 = new Class215(256);

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_24;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!fl;")
	private final Interface4 anInterface4_6;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!ih;Lclient!fl;)V")
	public Class128(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass40_Sub2_24 = arg0;
		this.anInterface4_6 = arg1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Lclient!eq;")
	public Class44_Sub1 method3709(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.aClass215_61.method6057((long) arg0);
		if (local6 != null) {
			return (Class44_Sub1) local6;
		} else if (this.anInterface4_6.method166(arg0)) {
			@Pc(26) Class50 local26 = this.anInterface4_6.method165(arg0);
			@Pc(33) int local33 = local26.aBoolean112 ? 64 : 128;
			@Pc(71) Class44_Sub1 local71;
			if (local26.aBoolean116 && this.aClass40_Sub2_24.method2719()) {
				@Pc(50) float[] local50 = this.anInterface4_6.method168(local33, 0.7F, arg0, local33);
				local71 = new Class44_Sub1(this.aClass40_Sub2_24, 3553, 34842, local33, local33, local26.aByte17 != 0, local50, 6408);
			} else {
				@Pc(82) int[] local82 = this.anInterface4_6.method167(local33, arg0, 0.7F, local33);
				local71 = new Class44_Sub1(this.aClass40_Sub2_24, 3553, 6408, local33, local33, local26.aByte17 != 0, local82, false);
			}
			local71.method4162(local26.aBoolean111, local26.aBoolean113);
			this.aClass215_61.method6050(local71, (long) arg0);
			return local71;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public void method3710() {
		this.aClass215_61.method6060();
	}
}
