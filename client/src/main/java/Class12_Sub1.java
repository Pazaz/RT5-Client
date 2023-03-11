import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "Lclient!bs;")
	public Class12_Sub1 aClass12_Sub1_5;

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "Lclient!bs;")
	public Class12_Sub1 aClass12_Sub1_6;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V")
	public final void method4206() {
		if (this.aClass12_Sub1_6 != null) {
			this.aClass12_Sub1_6.aClass12_Sub1_5 = this.aClass12_Sub1_5;
			this.aClass12_Sub1_5.aClass12_Sub1_6 = this.aClass12_Sub1_6;
			this.aClass12_Sub1_5 = null;
			this.aClass12_Sub1_6 = null;
		}
	}
}
