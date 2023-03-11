import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class Class2 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!ag;")
	public Class2 aClass2_243;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "J")
	public long aLong232;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!ag;")
	public Class2 aClass2_244;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Z")
	public final boolean method6462() {
		return this.aClass2_244 != null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public final void method6468() {
		if (this.aClass2_244 != null) {
			this.aClass2_244.aClass2_243 = this.aClass2_243;
			this.aClass2_243.aClass2_244 = this.aClass2_244;
			this.aClass2_244 = null;
			this.aClass2_243 = null;
		}
	}
}
