import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "Lclient!fi;")
	public Class8_Sub4 aClass8_Sub4_9;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Lclient!fi;")
	public Class8_Sub4 aClass8_Sub4_10;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
	public final void method6686() {
		if (this.aClass8_Sub4_9 != null) {
			this.aClass8_Sub4_9.aClass8_Sub4_10 = this.aClass8_Sub4_10;
			this.aClass8_Sub4_10.aClass8_Sub4_9 = this.aClass8_Sub4_9;
			this.aClass8_Sub4_9 = null;
			this.aClass8_Sub4_10 = null;
		}
	}
}
