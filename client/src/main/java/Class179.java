import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class179 {

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_55;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "Lclient!w;")
	private final Class1_Sub1 aClass1_Sub1_54 = new Class1_Sub1();

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	public Class179() {
		this.aClass1_Sub1_54.aClass1_Sub1_62 = this.aClass1_Sub1_54;
		this.aClass1_Sub1_54.aClass1_Sub1_61 = this.aClass1_Sub1_54;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)I")
	public int method4925() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class1_Sub1 local11 = this.aClass1_Sub1_54.aClass1_Sub1_61; local11 != this.aClass1_Sub1_54; local11 = local11.aClass1_Sub1_61) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Lclient!w;")
	public Class1_Sub1 method4926() {
		@Pc(12) Class1_Sub1 local12 = this.aClass1_Sub1_54.aClass1_Sub1_61;
		if (local12 == this.aClass1_Sub1_54) {
			return null;
		} else {
			local12.method6158();
			return local12;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!w;I)V")
	public void method4927(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_62 != null) {
			arg0.method6158();
		}
		arg0.aClass1_Sub1_61 = this.aClass1_Sub1_54;
		arg0.aClass1_Sub1_62 = this.aClass1_Sub1_54.aClass1_Sub1_62;
		arg0.aClass1_Sub1_62.aClass1_Sub1_61 = arg0;
		arg0.aClass1_Sub1_61.aClass1_Sub1_62 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
	public void method4929() {
		while (true) {
			@Pc(17) Class1_Sub1 local17 = this.aClass1_Sub1_54.aClass1_Sub1_61;
			if (this.aClass1_Sub1_54 == local17) {
				this.aClass1_Sub1_55 = null;
				return;
			}
			local17.method6158();
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)Lclient!w;")
	public Class1_Sub1 method4932() {
		@Pc(6) Class1_Sub1 local6 = this.aClass1_Sub1_55;
		if (local6 == this.aClass1_Sub1_54) {
			this.aClass1_Sub1_55 = null;
			return null;
		} else {
			this.aClass1_Sub1_55 = local6.aClass1_Sub1_61;
			return local6;
		}
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)Lclient!w;")
	public Class1_Sub1 method4935() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_54.aClass1_Sub1_61;
		if (local7 == this.aClass1_Sub1_54) {
			this.aClass1_Sub1_55 = null;
			return null;
		} else {
			this.aClass1_Sub1_55 = local7.aClass1_Sub1_61;
			return local7;
		}
	}
}
