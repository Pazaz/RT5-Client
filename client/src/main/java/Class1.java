import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class Class1 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Lclient!o;")
	public Class1 aClass1_247;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!o;")
	public Class1 aClass1_248;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "J")
	public long aLong235;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Z")
	public final boolean method6169() {
		return this.aClass1_248 != null;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public final void method6172() {
		if (this.aClass1_248 != null) {
			this.aClass1_248.aClass1_247 = this.aClass1_247;
			this.aClass1_247.aClass1_248 = this.aClass1_248;
			this.aClass1_248 = null;
			this.aClass1_247 = null;
		}
	}
}
