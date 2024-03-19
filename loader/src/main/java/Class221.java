import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public final class Class221 {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "[I")
	public int[] anIntArray606 = new int[20];

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString276;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString277;

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray46;

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "I")
	public final int anInt7385;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "I")
	public final int anInt7384;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class221(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray606 = arg5;
		this.aString276 = arg0;
		this.aString277 = arg1;
		this.aStringArray46 = arg2;
		this.anInt7385 = arg3;
		this.anInt7384 = arg4;
	}
}
