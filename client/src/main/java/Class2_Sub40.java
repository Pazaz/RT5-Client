import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub40(@OriginalArg(0) String arg0) {
		this.aString65 = arg0;
	}
}
