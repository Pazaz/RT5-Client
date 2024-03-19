import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class130 {

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "Lclient!o;")
	private Class1 aClass1_139;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!o;")
	public final Class1 aClass1_138 = new Class1();

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class130() {
		this.aClass1_138.aClass1_248 = this.aClass1_138;
		this.aClass1_138.aClass1_247 = this.aClass1_138;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Lclient!o;")
	public Class1 method3747() {
		@Pc(7) Class1 local7 = this.aClass1_138.aClass1_247;
		if (this.aClass1_138 == local7) {
			return null;
		} else {
			local7.method6172();
			return local7;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Lclient!o;")
	public Class1 method3748() {
		@Pc(11) Class1 local11 = this.aClass1_139;
		if (local11 == this.aClass1_138) {
			this.aClass1_139 = null;
			return null;
		} else {
			this.aClass1_139 = local11.aClass1_248;
			return local11;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Lclient!o;")
	public Class1 method3749() {
		@Pc(7) Class1 local7 = this.aClass1_138.aClass1_247;
		if (local7 == this.aClass1_138) {
			this.aClass1_139 = null;
			return null;
		} else {
			this.aClass1_139 = local7.aClass1_247;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!mi;)V")
	public void method3751(@OriginalArg(1) Class130 arg0) {
		this.method3753(arg0, this.aClass1_138.aClass1_247);
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)I")
	public int method3752() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class1 local11 = this.aClass1_138.aClass1_247; local11 != this.aClass1_138; local11 = local11.aClass1_247) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!mi;Lclient!o;I)V")
	private void method3753(@OriginalArg(0) Class130 arg0, @OriginalArg(1) Class1 arg1) {
		@Pc(7) Class1 local7 = this.aClass1_138.aClass1_248;
		this.aClass1_138.aClass1_248 = arg1.aClass1_248;
		arg1.aClass1_248.aClass1_247 = this.aClass1_138;
		if (arg1 != this.aClass1_138) {
			arg1.aClass1_248 = arg0.aClass1_138.aClass1_248;
			arg1.aClass1_248.aClass1_247 = arg1;
			arg0.aClass1_138.aClass1_248 = local7;
			local7.aClass1_247 = arg0.aClass1_138;
		}
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V")
	public void method3754() {
		while (true) {
			@Pc(15) Class1 local15 = this.aClass1_138.aClass1_247;
			if (local15 == this.aClass1_138) {
				this.aClass1_139 = null;
				return;
			}
			local15.method6172();
		}
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)Lclient!o;")
	public Class1 method3756() {
		@Pc(10) Class1 local10 = this.aClass1_139;
		if (this.aClass1_138 == local10) {
			this.aClass1_139 = null;
			return null;
		} else {
			this.aClass1_139 = local10.aClass1_247;
			return local10;
		}
	}

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)Z")
	public boolean method3757() {
		return this.aClass1_138 == this.aClass1_138.aClass1_247;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!o;I)V")
	public void method3758(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_248 != null) {
			arg0.method6172();
		}
		arg0.aClass1_248 = this.aClass1_138;
		arg0.aClass1_247 = this.aClass1_138.aClass1_247;
		arg0.aClass1_248.aClass1_247 = arg0;
		arg0.aClass1_247.aClass1_248 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)Lclient!o;")
	public Class1 method3759() {
		@Pc(11) Class1 local11 = this.aClass1_138.aClass1_248;
		if (local11 == this.aClass1_138) {
			this.aClass1_139 = null;
			return null;
		} else {
			this.aClass1_139 = local11.aClass1_248;
			return local11;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!o;)V")
	public void method3760(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_248 != null) {
			arg0.method6172();
		}
		arg0.aClass1_247 = this.aClass1_138;
		arg0.aClass1_248 = this.aClass1_138.aClass1_248;
		arg0.aClass1_248.aClass1_247 = arg0;
		arg0.aClass1_247.aClass1_248 = arg0;
	}
}
