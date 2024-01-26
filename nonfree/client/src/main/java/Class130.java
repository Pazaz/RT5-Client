import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fla")
public final class Class130 {

	@OriginalMember(owner = "client!fla", name = "f", descriptor = "Lclient!ep;")
	private Class8 aClass8_28;

	@OriginalMember(owner = "client!fla", name = "j", descriptor = "Lclient!ep;")
	private final Class8 aClass8_27 = new Class8();

	@OriginalMember(owner = "client!fla", name = "<init>", descriptor = "()V")
	public Class130() {
		this.aClass8_27.aClass8_67 = this.aClass8_27;
		this.aClass8_27.aClass8_68 = this.aClass8_27;
	}

	@OriginalMember(owner = "client!fla", name = "d", descriptor = "(I)Z")
	public boolean method2782() {
		return this.aClass8_27 == this.aClass8_27.aClass8_68;
	}

	@OriginalMember(owner = "client!fla", name = "e", descriptor = "(I)Lclient!ep;")
	public Class8 method2783() {
		@Pc(15) Class8 local15 = this.aClass8_27.aClass8_68;
		if (local15 == this.aClass8_27) {
			return null;
		} else {
			local15.method9274();
			return local15;
		}
	}

	@OriginalMember(owner = "client!fla", name = "c", descriptor = "(I)I")
	public int method2784() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class8 local11 = this.aClass8_27.aClass8_68; local11 != this.aClass8_27; local11 = local11.aClass8_68) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(I)Lclient!ep;")
	public Class8 method2785() {
		@Pc(6) Class8 local6 = this.aClass8_28;
		if (this.aClass8_27 == local6) {
			this.aClass8_28 = null;
			return null;
		} else {
			this.aClass8_28 = local6.aClass8_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(ZLclient!ep;)V")
	public void method2787(@OriginalArg(1) Class8 arg0) {
		if (arg0.aClass8_67 != null) {
			arg0.method9274();
		}
		arg0.aClass8_67 = this.aClass8_27.aClass8_67;
		arg0.aClass8_68 = this.aClass8_27;
		arg0.aClass8_67.aClass8_68 = arg0;
		arg0.aClass8_68.aClass8_67 = arg0;
	}

	@OriginalMember(owner = "client!fla", name = "b", descriptor = "(I)Lclient!ep;")
	public Class8 method2788() {
		@Pc(15) Class8 local15 = this.aClass8_27.aClass8_67;
		if (local15 == this.aClass8_27) {
			this.aClass8_28 = null;
			return null;
		} else {
			this.aClass8_28 = local15.aClass8_67;
			return local15;
		}
	}

	@OriginalMember(owner = "client!fla", name = "b", descriptor = "(B)V")
	public void method2789() {
		while (true) {
			@Pc(11) Class8 local11 = this.aClass8_27.aClass8_68;
			if (local11 == this.aClass8_27) {
				this.aClass8_28 = null;
				return;
			}
			local11.method9274();
		}
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(B)Lclient!ep;")
	public Class8 method2790() {
		@Pc(15) Class8 local15 = this.aClass8_27.aClass8_68;
		if (local15 == this.aClass8_27) {
			this.aClass8_28 = null;
			return null;
		} else {
			this.aClass8_28 = local15.aClass8_68;
			return local15;
		}
	}
}
