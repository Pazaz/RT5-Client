import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class148 {

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!uc;")
	private Class2_Sub2 aClass2_Sub2_6;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Lclient!uc;")
	public final Class2_Sub2 aClass2_Sub2_5 = new Class2_Sub2();

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class148() {
		this.aClass2_Sub2_5.aClass2_Sub2_8 = this.aClass2_Sub2_5;
		this.aClass2_Sub2_5.aClass2_Sub2_7 = this.aClass2_Sub2_5;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Lclient!uc;")
	public Class2_Sub2 method4345() {
		@Pc(11) Class2_Sub2 local11 = this.aClass2_Sub2_6;
		if (this.aClass2_Sub2_5 == local11) {
			this.aClass2_Sub2_6 = null;
			return null;
		} else {
			this.aClass2_Sub2_6 = local11.aClass2_Sub2_7;
			return local11;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!uc;)V")
	public void method4346(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_8 != null) {
			arg0.method5084();
		}
		arg0.aClass2_Sub2_7 = this.aClass2_Sub2_5;
		arg0.aClass2_Sub2_8 = this.aClass2_Sub2_5.aClass2_Sub2_8;
		arg0.aClass2_Sub2_8.aClass2_Sub2_7 = arg0;
		arg0.aClass2_Sub2_7.aClass2_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)Lclient!uc;")
	public Class2_Sub2 method4347() {
		@Pc(14) Class2_Sub2 local14 = this.aClass2_Sub2_5.aClass2_Sub2_7;
		if (this.aClass2_Sub2_5 == local14) {
			this.aClass2_Sub2_6 = null;
			return null;
		} else {
			this.aClass2_Sub2_6 = local14.aClass2_Sub2_7;
			return local14;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	public void method4348() {
		while (true) {
			@Pc(5) Class2_Sub2 local5 = this.aClass2_Sub2_5.aClass2_Sub2_7;
			if (this.aClass2_Sub2_5 == local5) {
				this.aClass2_Sub2_6 = null;
				return;
			}
			local5.method5084();
		}
	}
}
