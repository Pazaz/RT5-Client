import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class Class8 {

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!ep;")
	public Class8 aClass8_67;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!ep;")
	public Class8 aClass8_68;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
	public final void method9274() {
		if (this.aClass8_67 != null) {
			this.aClass8_67.aClass8_68 = this.aClass8_68;
			this.aClass8_68.aClass8_67 = this.aClass8_67;
			this.aClass8_68 = null;
			this.aClass8_67 = null;
		}
	}
}
