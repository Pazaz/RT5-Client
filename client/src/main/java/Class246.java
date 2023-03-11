import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class246 {

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!tl;")
	private Class2_Sub2 aClass2_Sub2_54;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!tl;")
	private final Class2_Sub2 aClass2_Sub2_53 = new Class2_Sub2();

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class246() {
		this.aClass2_Sub2_53.aClass2_Sub2_52 = this.aClass2_Sub2_53;
		this.aClass2_Sub2_53.aClass2_Sub2_51 = this.aClass2_Sub2_53;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lclient!tl;")
	public Class2_Sub2 method6336() {
		@Pc(6) Class2_Sub2 local6 = this.aClass2_Sub2_54;
		if (this.aClass2_Sub2_53 == local6) {
			this.aClass2_Sub2_54 = null;
			return null;
		} else {
			this.aClass2_Sub2_54 = local6.aClass2_Sub2_51;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lclient!tl;")
	public Class2_Sub2 method6337() {
		@Pc(14) Class2_Sub2 local14 = this.aClass2_Sub2_53.aClass2_Sub2_51;
		if (local14 == this.aClass2_Sub2_53) {
			this.aClass2_Sub2_54 = null;
			return null;
		} else {
			this.aClass2_Sub2_54 = local14.aClass2_Sub2_51;
			return local14;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
	public int method6338() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class2_Sub2 local11 = this.aClass2_Sub2_53.aClass2_Sub2_51; local11 != this.aClass2_Sub2_53; local11 = local11.aClass2_Sub2_51) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Lclient!tl;")
	public Class2_Sub2 method6339() {
		@Pc(7) Class2_Sub2 local7 = this.aClass2_Sub2_53.aClass2_Sub2_51;
		if (this.aClass2_Sub2_53 == local7) {
			return null;
		} else {
			local7.method6143();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!tl;)V")
	public void method6341(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_52 != null) {
			arg0.method6143();
		}
		arg0.aClass2_Sub2_52 = this.aClass2_Sub2_53.aClass2_Sub2_52;
		arg0.aClass2_Sub2_51 = this.aClass2_Sub2_53;
		arg0.aClass2_Sub2_52.aClass2_Sub2_51 = arg0;
		arg0.aClass2_Sub2_51.aClass2_Sub2_52 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	public void method6342() {
		while (true) {
			@Pc(9) Class2_Sub2 local9 = this.aClass2_Sub2_53.aClass2_Sub2_51;
			if (local9 == this.aClass2_Sub2_53) {
				this.aClass2_Sub2_54 = null;
				return;
			}
			local9.method6143();
		}
	}
}
