import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public static int anInt4324;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "Lclient!r;")
	public static Class197 aClass197_63;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "Z")
	public static boolean aBoolean297 = false;

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
	public static final int[] anIntArray283 = new int[50];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg5 - arg1;
		@Pc(20) int local20 = arg2 - arg1;
		@Pc(24) int local24 = arg5 * arg5;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(44) int local44 = local15 * local15;
		@Pc(48) int local48 = local20 * local20;
		@Pc(52) int local52 = local28 << 1;
		@Pc(56) int local56 = local24 << 1;
		@Pc(60) int local60 = local48 << 1;
		@Pc(64) int local64 = local44 << 1;
		@Pc(68) int local68 = arg2 << 1;
		@Pc(72) int local72 = local20 << 1;
		@Pc(80) int local80 = local52 + local24 * (1 - local68);
		@Pc(89) int local89 = local28 - (local68 - 1) * local56;
		@Pc(99) int local99 = (1 - local72) * local44 + local60;
		@Pc(107) int local107 = local48 - local64 * (local72 - 1);
		@Pc(111) int local111 = local24 << 2;
		@Pc(115) int local115 = local28 << 2;
		@Pc(119) int local119 = local44 << 2;
		@Pc(123) int local123 = local48 << 2;
		@Pc(127) int local127 = local52 * 3;
		@Pc(133) int local133 = local56 * (local68 - 3);
		@Pc(137) int local137 = local60 * 3;
		@Pc(143) int local143 = (local72 - 3) * local64;
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = local111 * (arg2 - 1);
		@Pc(153) int local153 = local123;
		@Pc(159) int local159 = (local20 - 1) * local119;
		@Pc(163) int[] local163 = Static357.anIntArrayArray58[arg4];
		Static101.method2163(arg6 - local15, local163, arg3, arg6 - arg5);
		Static101.method2163(local15 + arg6, local163, arg0, arg6 - local15);
		Static101.method2163(arg5 + arg6, local163, arg3, arg6 + local15);
		while (local9 > 0) {
			@Pc(209) boolean local209 = local20 >= local9;
			if (local80 < 0) {
				while (local80 < 0) {
					local80 += local127;
					local89 += local145;
					local145 += local115;
					local7++;
					local127 += local115;
				}
			}
			if (local209) {
				if (local99 < 0) {
					while (local99 < 0) {
						local99 += local137;
						local107 += local153;
						local137 += local123;
						local11++;
						local153 += local123;
					}
				}
				if (local107 < 0) {
					local99 += local137;
					local107 += local153;
					local11++;
					local153 += local123;
					local137 += local123;
				}
				local107 += -local143;
				local99 += -local159;
				local143 -= local119;
				local159 -= local119;
			}
			if (local89 < 0) {
				local80 += local127;
				local89 += local145;
				local7++;
				local127 += local115;
				local145 += local115;
			}
			local80 += -local151;
			local89 += -local133;
			local9--;
			local133 -= local111;
			local151 -= local111;
			@Pc(349) int local349 = arg4 - local9;
			@Pc(353) int local353 = local9 + arg4;
			@Pc(358) int local358 = arg6 + local7;
			@Pc(363) int local363 = arg6 - local7;
			if (local209) {
				@Pc(369) int local369 = arg6 + local11;
				@Pc(373) int local373 = arg6 - local11;
				Static101.method2163(local373, Static357.anIntArrayArray58[local349], arg3, local363);
				Static101.method2163(local369, Static357.anIntArrayArray58[local349], arg0, local373);
				Static101.method2163(local358, Static357.anIntArrayArray58[local349], arg3, local369);
				Static101.method2163(local373, Static357.anIntArrayArray58[local353], arg3, local363);
				Static101.method2163(local369, Static357.anIntArrayArray58[local353], arg0, local373);
				Static101.method2163(local358, Static357.anIntArrayArray58[local353], arg3, local369);
			} else {
				Static101.method2163(local358, Static357.anIntArrayArray58[local349], arg3, local363);
				Static101.method2163(local358, Static357.anIntArrayArray58[local353], arg3, local363);
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
	public static void method4119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static330.aClass67ArrayArrayArray3[0][arg1][arg2] != null && Static330.aClass67ArrayArrayArray3[0][arg1][arg2].aClass67_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static330.aClass67ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class67 local46 = Static330.aClass67ArrayArrayArray3[local22][arg1][arg2] = new Class67(local22, arg1, arg2);
				if (local20) {
					local46.aByte7++;
				}
			}
		}
	}
}
