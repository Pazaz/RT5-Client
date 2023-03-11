import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class75 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "Lclient!ag;")
	private Class2 aClass2_69;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "Lclient!ld;")
	private Class135 aClass135_18;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class75() {
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!ld;)V")
	public Class75(@OriginalArg(0) Class135 arg0) {
		this.aClass135_18 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Lclient!ag;")
	public Class2 method2178() {
		@Pc(6) Class2 local6 = this.aClass2_69;
		if (this.aClass135_18.aClass2_130 == local6) {
			this.aClass2_69 = null;
			return null;
		} else {
			this.aClass2_69 = local6.aClass2_243;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ld;I)V")
	public void method2180(@OriginalArg(0) Class135 arg0) {
		this.aClass135_18 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)Lclient!ag;")
	public Class2 method2181() {
		@Pc(8) Class2 local8 = this.aClass135_18.aClass2_130.aClass2_243;
		if (this.aClass135_18.aClass2_130 == local8) {
			this.aClass2_69 = null;
			return null;
		} else {
			this.aClass2_69 = local8.aClass2_243;
			return local8;
		}
	}
}
