import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Lclient!w;")
	public Class1_Sub1 aClass1_Sub1_61;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "J")
	public long aLong234;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "Lclient!w;")
	public Class1_Sub1 aClass1_Sub1_62;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z")
	public final boolean method6157() {
		return this.aClass1_Sub1_62 != null;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public final void method6158() {
		if (this.aClass1_Sub1_62 != null) {
			this.aClass1_Sub1_62.aClass1_Sub1_61 = this.aClass1_Sub1_61;
			this.aClass1_Sub1_61.aClass1_Sub1_62 = this.aClass1_Sub1_62;
			this.aClass1_Sub1_62 = null;
			this.aClass1_Sub1_61 = null;
		}
	}
}
