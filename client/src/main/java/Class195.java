import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class195 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Lclient!o;")
	private Class1 aClass1_212;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "Lclient!mi;")
	private Class130 aClass130_37;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class195() {
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!mi;)V")
	public Class195(@OriginalArg(0) Class130 arg0) {
		this.aClass130_37 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Lclient!o;")
	public Class1 method5278() {
		@Pc(8) Class1 local8 = this.aClass130_37.aClass1_138.aClass1_247;
		if (local8 == this.aClass130_37.aClass1_138) {
			this.aClass1_212 = null;
			return null;
		} else {
			this.aClass1_212 = local8.aClass1_247;
			return local8;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)Lclient!o;")
	public Class1 method5279() {
		@Pc(6) Class1 local6 = this.aClass1_212;
		if (this.aClass130_37.aClass1_138 == local6) {
			this.aClass1_212 = null;
			return null;
		} else {
			this.aClass1_212 = local6.aClass1_247;
			return local6;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!mi;B)V")
	public void method5282(@OriginalArg(0) Class130 arg0) {
		this.aClass130_37 = arg0;
	}
}
