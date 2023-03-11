import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class257 {

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "[I")
	public int[] anIntArray529 = new int[20];

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString73;

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "I")
	public final int anInt7272;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray69;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public final int anInt7271;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString72;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class257(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString73 = arg0;
		this.anInt7272 = arg3;
		this.aStringArray69 = arg2;
		this.anIntArray529 = arg5;
		this.anInt7271 = arg4;
		this.aString72 = arg1;
	}
}
