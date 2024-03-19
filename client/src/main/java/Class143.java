import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class143 {

	@OriginalMember(owner = "client!op", name = "e", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_51 = new Class1_Sub1();

	@OriginalMember(owner = "client!op", name = "m", descriptor = "Lclient!rr;")
	private final Class179 aClass179_6 = new Class179();

	@OriginalMember(owner = "client!op", name = "h", descriptor = "I")
	private final int anInt5053;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "I")
	private int anInt5055;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "Lclient!sf;")
	private final Class183 aClass183_28;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I)V")
	public Class143(@OriginalArg(0) int arg0) {
		this.anInt5053 = arg0;
		this.anInt5055 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass183_28 = new Class183(local19);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!w;ZJ)V")
	public void method4322(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt5055 == 0) {
			@Pc(14) Class1_Sub1 local14 = this.aClass179_6.method4926();
			local14.method6172();
			local14.method6158();
			if (this.aClass1_Sub1_51 == local14) {
				local14 = this.aClass179_6.method4926();
				local14.method6172();
				local14.method6158();
			}
		} else {
			this.anInt5055--;
		}
		this.aClass183_28.method5055(arg1, arg0);
		this.aClass179_6.method4927(arg0);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IJ)Lclient!w;")
	public Class1_Sub1 method4323(@OriginalArg(1) long arg0) {
		@Pc(25) Class1_Sub1 local25 = (Class1_Sub1) this.aClass183_28.method5053(arg0);
		if (local25 != null) {
			this.aClass179_6.method4927(local25);
		}
		return local25;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public void method4324() {
		this.aClass179_6.method4929();
		this.aClass183_28.method5051();
		this.aClass1_Sub1_51 = new Class1_Sub1();
		this.anInt5055 = this.anInt5053;
	}
}
