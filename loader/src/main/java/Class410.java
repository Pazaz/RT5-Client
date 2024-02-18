import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!c")
public final class Class410 {

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "[I")
	public int[] anIntArray892 = new int[20];

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString130;

	@OriginalMember(owner = "loader!c", name = "f", descriptor = "I")
	public final int anInt10943;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "I")
	public final int anInt10942;

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString131;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray49;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class410(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString130 = arg1;
		this.anInt10943 = arg4;
		this.anInt10942 = arg3;
		this.anIntArray892 = arg5;
		this.aString131 = arg0;
		this.aStringArray49 = arg2;
	}
}
