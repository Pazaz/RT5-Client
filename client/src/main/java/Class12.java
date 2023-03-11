import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class Class12 {

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "Lclient!ss;")
	public Class12 aClass12_23;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "Lclient!ss;")
	public Class12 aClass12_24;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
	public final void method5684() {
		if (this.aClass12_23 != null) {
			this.aClass12_23.aClass12_24 = this.aClass12_24;
			this.aClass12_24.aClass12_23 = this.aClass12_23;
			this.aClass12_23 = null;
			this.aClass12_24 = null;
		}
	}
}
