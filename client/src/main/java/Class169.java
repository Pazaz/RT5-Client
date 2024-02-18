import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class169 {

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "Lclient!dla;")
	private final Class82 aClass82_85 = new Class82(256);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_4;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_17;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!qha;Lclient!d;)V")
	public Class169(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_4 = arg1;
		this.aClass19_Sub3_17 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public void method3527() {
		this.aClass82_85.method2157();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V")
	public void method3528() {
		this.aClass82_85.method2147(5);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)Lclient!rq;")
	public Class93_Sub2 method3529(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass82_85.method2156((long) arg0);
		if (local10 != null) {
			return (Class93_Sub2) local10;
		} else if (this.anInterface4_4.method6814(arg0)) {
			@Pc(33) Class118 local33 = this.anInterface4_4.method6817(arg0);
			@Pc(52) int local52 = local33.aBoolean233 ? 64 : this.aClass19_Sub3_17.anInt7981;
			@Pc(90) Class93_Sub2 local90;
			if (local33.aBoolean237 && this.aClass19_Sub3_17.method8014()) {
				@Pc(71) float[] local71 = this.anInterface4_4.method6816(local52, arg0, 0.7F, local52);
				local90 = new Class93_Sub2(this.aClass19_Sub3_17, 3553, 34842, local52, local52, local33.aByte53 != 0, local71, 6408);
			} else {
				@Pc(114) int[] local114;
				if (local33.anInt2796 != 2 && Static501.method6715(local33.aByte56)) {
					local114 = this.anInterface4_4.method6818(local52, true, local52, arg0, 0.7F);
				} else {
					local114 = this.anInterface4_4.method6815(0.7F, arg0, local52, local52);
				}
				local90 = new Class93_Sub2(this.aClass19_Sub3_17, 3553, 6408, local52, local52, local33.aByte53 != 0, local114, 0, 0, false);
			}
			local90.method2946(local33.aBoolean236, local33.aBoolean235);
			this.aClass82_85.method2150(local90, (long) arg0);
			return local90;
		} else {
			return null;
		}
	}
}
