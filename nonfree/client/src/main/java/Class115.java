import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class115 implements Interface15 {

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString29;

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "Lclient!sb;")
	private final Class330 aClass330_30;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!sb;Ljava/lang/String;)V")
	public Class115(@OriginalArg(0) Class330 arg0, @OriginalArg(1) String arg1) {
		this.aString29 = arg1;
		this.aClass330_30 = arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)I")
	@Override
	public int method6465() {
		return this.aClass330_30.method7598(this.aString29) ? 100 : this.aClass330_30.method7593(this.aString29);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)Lclient!kf;")
	@Override
	public Class206 method6464() {
		return Static326.aClass206_3;
	}
}
