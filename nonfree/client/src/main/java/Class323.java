import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class323 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString104;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString102;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString103;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class323(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString104 = arg1;
		this.aString102 = arg2;
		this.aString103 = arg0;
	}
}
