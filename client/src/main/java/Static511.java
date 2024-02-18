import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	public static int anInt7645;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "[I")
	public static int[] anIntArray614;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "[Lclient!ci;")
	public static Class65[] aClass65Array1;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "[J")
	public static final long[] aLongArray17 = new long[100];

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray193 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIC)I")
	public static int method6770(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(18) char local18 = Character.toLowerCase(arg1);
			local7 = (local18 << 4) + 1;
		}
		return local7;
	}
}
