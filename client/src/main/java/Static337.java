import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!vp", name = "dd", descriptor = "Lclient!ro;")
	public static Class177 aClass177_21 = null;

	@OriginalMember(owner = "client!vp", name = "pd", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IBII)I")
	public static int method5990(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(30) int local30 = Static101.method2096(local7, local17);
		@Pc(37) int local37 = Static101.method2096(local7 + 1, local17);
		@Pc(44) int local44 = Static101.method2096(local7, local17 + 1);
		@Pc(53) int local53 = Static101.method2096(local7 + 1, local17 + 1);
		@Pc(60) int local60 = Static222.method4320(local30, arg2, local13, local37);
		@Pc(74) int local74 = Static222.method4320(local44, arg2, local13, local53);
		return Static222.method4320(local60, arg2, local23, local74);
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(II)Z")
	public static boolean method5995(@OriginalArg(0) int arg0) {
		if (arg0 == 30 || arg0 == 26 || arg0 == 42 || arg0 == 31 || arg0 == 2 || arg0 == 11 || arg0 == 35 || arg0 == 18) {
			return true;
		} else if (arg0 == 36 || arg0 == 22 || arg0 == 1012 || arg0 == 1006) {
			return true;
		} else if (arg0 == 6 || arg0 == 3 || arg0 == 48 || arg0 == 15 || arg0 == 19) {
			return true;
		} else {
			return arg0 == 29 || arg0 == 4 || arg0 == 40 || arg0 == 34 || arg0 == 38 || arg0 == 24;
		}
	}
}
