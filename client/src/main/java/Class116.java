import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class116 {

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!tl;")
	private Class2_Sub2 aClass2_Sub2_32 = new Class2_Sub2();

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "Lclient!wc;")
	private final Class246 aClass246_3 = new Class246();

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	private final int anInt3150;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
	private int anInt3151;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Lclient!ad;")
	private final Class4 aClass4_69;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V")
	public Class116(@OriginalArg(0) int arg0) {
		this.anInt3150 = arg0;
		this.anInt3151 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass4_69 = new Class4(local19);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(JB)Lclient!tl;")
	public Class2_Sub2 method3152(@OriginalArg(0) long arg0) {
		@Pc(15) Class2_Sub2 local15 = (Class2_Sub2) this.aClass4_69.method90(arg0);
		if (local15 != null) {
			this.aClass246_3.method6341(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V")
	public void method3153() {
		this.aClass246_3.method6342();
		this.aClass4_69.method81();
		this.aClass2_Sub2_32 = new Class2_Sub2();
		this.anInt3151 = this.anInt3150;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!tl;J)V")
	public void method3155(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt3151 == 0) {
			@Pc(7) Class2_Sub2 local7 = this.aClass246_3.method6339();
			local7.method6468();
			local7.method6143();
			if (this.aClass2_Sub2_32 == local7) {
				local7 = this.aClass246_3.method6339();
				local7.method6468();
				local7.method6143();
			}
		} else {
			this.anInt3151--;
		}
		this.aClass4_69.method87(arg0, arg1);
		this.aClass246_3.method6341(arg0);
	}
}
