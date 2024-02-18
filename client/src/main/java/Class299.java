import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class299 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "Lclient!cm;")
	private Class2_Sub2 aClass2_Sub2_48;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "Lclient!jga;")
	private Class192 aClass192_14;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	private Class299() {
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!jga;)V")
	public Class299(@OriginalArg(0) Class192 arg0) {
		this.aClass192_14 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)Lclient!cm;")
	public Class2_Sub2 method6723() {
		@Pc(6) Class2_Sub2 local6 = this.aClass2_Sub2_48;
		if (local6 == this.aClass192_14.aClass2_Sub2_36) {
			this.aClass2_Sub2_48 = null;
			return null;
		} else {
			this.aClass2_Sub2_48 = local6.aClass2_Sub2_66;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Lclient!cm;")
	public Class2_Sub2 method6724() {
		@Pc(14) Class2_Sub2 local14 = this.aClass192_14.aClass2_Sub2_36.aClass2_Sub2_66;
		if (this.aClass192_14.aClass2_Sub2_36 == local14) {
			this.aClass2_Sub2_48 = null;
			return null;
		} else {
			this.aClass2_Sub2_48 = local14.aClass2_Sub2_66;
			return local14;
		}
	}
}
