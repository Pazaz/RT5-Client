import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class334 {

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!dla;")
	private final Class82 aClass82_187 = new Class82(256);

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_9;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "Lclient!am;")
	private final Class19_Sub1 aClass19_Sub1_20;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!am;Lclient!d;)V")
	public Class334(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_9 = arg1;
		this.aClass19_Sub1_20 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	public void method7653() {
		this.aClass82_187.method2157();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)Lclient!og;")
	public Interface18 method7654(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass82_187.method2156((long) arg0);
		if (local12 != null) {
			return (Interface18) local12;
		} else if (this.anInterface4_9.method6814(arg0)) {
			@Pc(35) Class118 local35 = this.anInterface4_9.method6817(arg0);
			@Pc(45) int local45 = local35.aBoolean233 ? 64 : this.aClass19_Sub1_20.anInt9183;
			@Pc(105) Interface18 local105;
			if (local35.aBoolean237 && this.aClass19_Sub1_20.method8014()) {
				@Pc(116) float[] local116 = this.anInterface4_9.method6816(local45, arg0, 0.7F, local45);
				local105 = this.aClass19_Sub1_20.method8121(local45, local116, Static172.aClass92_8, local35.aByte53 != 0, local45);
			} else {
				@Pc(79) int[] local79;
				if (local35.anInt2796 != 2 && Static501.method6715(local35.aByte56)) {
					local79 = this.anInterface4_9.method6818(local45, true, local45, arg0, 0.7F);
				} else {
					local79 = this.anInterface4_9.method6815(0.7F, arg0, local45, local45);
				}
				local105 = this.aClass19_Sub1_20.method8034(local35.aByte53 != 0, local45, local45, local79);
			}
			local105.method9052(local35.aBoolean236, local35.aBoolean235);
			this.aClass82_187.method2150(local105, (long) arg0);
			return local105;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public void method7655() {
		this.aClass82_187.method2147(5);
	}
}
