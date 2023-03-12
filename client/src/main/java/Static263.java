import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!pb", name = "T", descriptor = "Z")
	public static boolean aBoolean330;

	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "Z")
	public static boolean wallocc = false;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
	public static int anInt4834 = 503;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)I")
	public static int method4467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = (arg0 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
		@Pc(35) int local35 = 255 - arg0;
		return local21 + (((arg2 & 0xFF00FF) * local35 & 0xFF00FF00 | (arg2 & 0xFF00) * local35 & 0xFF0000) >>> 8);
	}
}
