import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array10;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
	public static int anInt2420;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "Lclient!r;")
	public static Class197 aClass197_30;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
	public static final int anInt2421 = -1;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method2412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg3;
		@Pc(21) int local21 = arg5 - arg3;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = (1 - local57) * local25 + local41;
		@Pc(78) int local78 = local29 - (local57 - 1) * local45;
		@Pc(86) int local86 = local49 + local33 * (1 - local61);
		@Pc(95) int local95 = local37 - local53 * (local61 - 1);
		@Pc(99) int local99 = local25 << 2;
		@Pc(103) int local103 = local29 << 2;
		@Pc(107) int local107 = local33 << 2;
		@Pc(111) int local111 = local37 << 2;
		@Pc(115) int local115 = local41 * 3;
		@Pc(121) int local121 = (local57 - 3) * local45;
		@Pc(125) int local125 = local49 * 3;
		@Pc(131) int local131 = (local61 - 3) * local53;
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = local99 * (arg5 - 1);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local107 * (local21 - 1);
		@Pc(171) int local171;
		@Pc(179) int local179;
		@Pc(188) int local188;
		@Pc(197) int local197;
		if (arg0 >= Static365.anInt6832 && arg0 <= Static161.anInt2954) {
			@Pc(162) int[] local162 = Static357.anIntArrayArray58[arg0];
			local171 = Static25.method861(Static28.anInt675, arg4 - arg6, Static82.anInt1837);
			local179 = Static25.method861(Static28.anInt675, arg6 + arg4, Static82.anInt1837);
			local188 = Static25.method861(Static28.anInt675, arg4 - local16, Static82.anInt1837);
			local197 = Static25.method861(Static28.anInt675, arg4 + local16, Static82.anInt1837);
			Static101.method2163(local188, local162, arg2, local171);
			Static101.method2163(local197, local162, arg1, local188);
			Static101.method2163(local179, local162, arg2, local197);
		}
		while (local9 > 0) {
			@Pc(224) boolean local224 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local78 += local133;
					local70 += local115;
					local7++;
					local133 += local103;
					local115 += local103;
				}
			}
			if (local224) {
				if (local86 < 0) {
					while (local86 < 0) {
						local86 += local125;
						local95 += local141;
						local11++;
						local141 += local111;
						local125 += local111;
					}
				}
				if (local95 < 0) {
					local86 += local125;
					local95 += local141;
					local141 += local111;
					local125 += local111;
					local11++;
				}
				local86 += -local147;
				local95 += -local131;
				local131 -= local107;
				local147 -= local107;
			}
			if (local78 < 0) {
				local70 += local115;
				local78 += local133;
				local115 += local103;
				local7++;
				local133 += local103;
			}
			local78 += -local121;
			local70 += -local139;
			local9--;
			local121 -= local99;
			local139 -= local99;
			local171 = arg0 - local9;
			local179 = arg0 + local9;
			if (Static365.anInt6832 <= local179 && local171 <= Static161.anInt2954) {
				local188 = Static25.method861(Static28.anInt675, arg4 + local7, Static82.anInt1837);
				local197 = Static25.method861(Static28.anInt675, arg4 - local7, Static82.anInt1837);
				if (local224) {
					@Pc(395) int local395 = Static25.method861(Static28.anInt675, arg4 + local11, Static82.anInt1837);
					@Pc(404) int local404 = Static25.method861(Static28.anInt675, arg4 - local11, Static82.anInt1837);
					@Pc(411) int[] local411;
					if (local171 >= Static365.anInt6832) {
						local411 = Static357.anIntArrayArray58[local171];
						Static101.method2163(local404, local411, arg2, local197);
						Static101.method2163(local395, local411, arg1, local404);
						Static101.method2163(local188, local411, arg2, local395);
					}
					if (Static161.anInt2954 >= local179) {
						local411 = Static357.anIntArrayArray58[local179];
						Static101.method2163(local404, local411, arg2, local197);
						Static101.method2163(local395, local411, arg1, local404);
						Static101.method2163(local188, local411, arg2, local395);
					}
				} else {
					if (Static365.anInt6832 <= local171) {
						Static101.method2163(local188, Static357.anIntArrayArray58[local171], arg2, local197);
					}
					if (local179 <= Static161.anInt2954) {
						Static101.method2163(local188, Static357.anIntArrayArray58[local179], arg2, local197);
					}
				}
			}
		}
	}
}
