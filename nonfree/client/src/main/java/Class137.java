import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class137 implements Interface15 {

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "Lclient!sb;")
	private final Class330 aClass330_39;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class137(@OriginalArg(0) Class330 arg0) {
		this.aClass330_39 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)I")
	@Override
	public int method6465() {
		return this.aClass330_39.method7591() ? 100 : this.aClass330_39.method7582();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)Lclient!kf;")
	@Override
	public Class206 method6464() {
		return Static326.aClass206_1;
	}
}
