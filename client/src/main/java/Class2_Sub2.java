import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!uc;")
	public Class2_Sub2 aClass2_Sub2_7;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!uc;")
	public Class2_Sub2 aClass2_Sub2_8;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
	public final void method5084() {
		if (this.aClass2_Sub2_8 != null) {
			this.aClass2_Sub2_8.aClass2_Sub2_7 = this.aClass2_Sub2_7;
			this.aClass2_Sub2_7.aClass2_Sub2_8 = this.aClass2_Sub2_8;
			this.aClass2_Sub2_7 = null;
			this.aClass2_Sub2_8 = null;
		}
	}
}
