import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "Lclient!cm;")
	public Class2_Sub2 aClass2_Sub2_66;

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "Lclient!cm;")
	public Class2_Sub2 aClass2_Sub2_67;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "J")
	public long aLong325;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	public final void method9260() {
		if (this.aClass2_Sub2_67 != null) {
			this.aClass2_Sub2_67.aClass2_Sub2_66 = this.aClass2_Sub2_66;
			this.aClass2_Sub2_66.aClass2_Sub2_67 = this.aClass2_Sub2_67;
			this.aClass2_Sub2_66 = null;
			this.aClass2_Sub2_67 = null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Z")
	public final boolean method9261() {
		return this.aClass2_Sub2_67 != null;
	}
}
