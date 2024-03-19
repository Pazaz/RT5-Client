import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class Class2 {

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!aa;")
	public Class2 aClass2_23;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "Lclient!aa;")
	public Class2 aClass2_24;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public final void method5802() {
		if (this.aClass2_24 != null) {
			this.aClass2_24.aClass2_23 = this.aClass2_23;
			this.aClass2_23.aClass2_24 = this.aClass2_24;
			this.aClass2_24 = null;
			this.aClass2_23 = null;
		}
	}
}
