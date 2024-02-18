import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ama", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(II[F[II[FII[IIIII)V")
	public static void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		@Pc(17) int local17 = arg11 * arg4 + arg10;
		@Pc(23) int local23 = arg0 * arg6 + arg7;
		@Pc(28) int local28 = arg4 - arg1;
		@Pc(33) int local33 = arg6 - arg1;
		@Pc(41) int local41;
		@Pc(47) int local47;
		if (arg3 == null) {
			for (local41 = 0; local41 < arg9; local41++) {
				local47 = arg1 + local17;
				while (local17 < local47) {
					arg5[local23++] = arg2[local17++];
				}
				local17 += local28;
				local23 += local33;
			}
		} else if (arg2 == null) {
			for (local41 = 0; local41 < arg9; local41++) {
				local47 = local17 + arg1;
				while (local47 > local17) {
					arg8[local23++] = arg3[local17++];
				}
				local23 += local33;
				local17 += local28;
			}
		} else {
			for (local41 = 0; local41 < arg9; local41++) {
				local47 = arg1 + local17;
				while (local47 > local17) {
					arg8[local23] = arg3[local17];
					arg5[local23++] = arg2[local17++];
				}
				local17 += local28;
				local23 += local33;
			}
		}
	}
}
