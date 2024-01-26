import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
	public static int anInt6357;

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_74 = new Class345(77, 3);

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
	public static final int anInt6358 = 5000;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIIBIII)V")
	public static void method5692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg1 >= Static180.anInt2995 && arg1 + arg4 <= Static111.anInt2219 && Static724.anInt10930 <= arg3 - arg1 && arg1 + arg3 <= Static273.anInt4395) {
			Static123.method2210(arg2, arg5, arg3, arg1, arg4, arg0);
		} else {
			Static51.method1146(arg0, arg5, arg2, arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V")
	public static void method5693() {
		@Pc(9) int[] local9 = new int[Static419.aClass112_1.anInt2670];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static419.aClass112_1.anInt2670; local13++) {
			@Pc(20) Class382 local20 = Static419.aClass112_1.method2486(local13);
			if (local20.anInt10084 >= 0 || local20.anInt10104 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static349.anIntArray426 = new int[local11];
		for (@Pc(58) int local58 = 0; local58 < local11; local58++) {
			Static349.anIntArray426[local58] = local9[local58];
		}
	}
}
