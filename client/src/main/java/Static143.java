import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!jj", name = "N", descriptor = "C")
	public static char aChar2;

	@OriginalMember(owner = "client!jj", name = "I", descriptor = "Lclient!op;")
	public static final Class143 aClass143_6 = new Class143(64);

	@OriginalMember(owner = "client!jj", name = "Q", descriptor = "Lclient!sf;")
	public static final Class183 aClass183_13 = new Class183(32);

	@OriginalMember(owner = "client!jj", name = "R", descriptor = "J")
	public static long aLong104 = 0L;

	@OriginalMember(owner = "client!jj", name = "S", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!jj", name = "T", descriptor = "Ljava/lang/String;")
	public static final String aString125 = "scroll:";

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static261.anIntArrayArrayArray11[arg0][local16][local20] == -Static353.anInt7366) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static118.aClass77Array1[arg0].method3986(arg1, arg3) + arg5;
			if (!Static232.method4426(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static232.method4426(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static232.method4426(local20, local151, local177)) {
				return false;
			} else if (Static232.method4426(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static24.method587(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static232.method4426(local16 + 1, Static118.aClass77Array1[arg0].method3986(arg1, arg3) + arg5, local20 + 1) && Static232.method4426(local16 + 128 - 1, Static118.aClass77Array1[arg0].method3986(arg1 + 1, arg3) + arg5, local20 + 1) && Static232.method4426(local16 + 128 - 1, Static118.aClass77Array1[arg0].method3986(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static232.method4426(local16 + 1, Static118.aClass77Array1[arg0].method3986(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!im;BI)J")
	public static long method3166(@OriginalArg(0) int arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(20) Class189 local20 = Static83.method1840(arg1.method5686());
		@Pc(41) long local41 = (long) (arg1.method5684() << 14 | arg0 | arg2 << 7 | arg1.method5687() << 20 | 0x40000000);
		if (local20.anInt6170 == 0) {
			local41 |= local14;
		}
		if (local20.anInt6196 == 1) {
			local41 |= local5;
		}
		if (local20.aBoolean436) {
			local41 |= local7;
		}
		return local41 | (long) arg1.method5686() << 32;
	}
}
