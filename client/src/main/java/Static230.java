import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array16;

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "Lclient!h;")
	public static final Class89 aClass89_163 = new Class89(102, 12);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
	public static void method4012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static25.method861(Static28.anInt675, arg1 + arg0, Static82.anInt1837);
		@Pc(31) int local31 = Static25.method861(Static28.anInt675, arg1 - arg0, Static82.anInt1837);
		Static101.method2163(local22, Static357.anIntArrayArray58[arg2], arg3, local31);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(65) int local65;
			@Pc(70) int local70;
			@Pc(93) int local93;
			@Pc(101) int local101;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local65 = arg2 - local9;
				local70 = arg2 + local9;
				if (Static365.anInt6832 <= local70 && Static161.anInt2954 >= local65) {
					local93 = Static25.method861(Static28.anInt675, arg1 + local7, Static82.anInt1837);
					local101 = Static25.method861(Static28.anInt675, arg1 - local7, Static82.anInt1837);
					if (Static161.anInt2954 >= local70) {
						Static101.method2163(local93, Static357.anIntArrayArray58[local70], arg3, local101);
					}
					if (Static365.anInt6832 <= local65) {
						Static101.method2163(local93, Static357.anIntArrayArray58[local65], arg3, local101);
					}
				}
			}
			local7++;
			local65 = arg2 - local7;
			local70 = arg2 + local7;
			if (Static365.anInt6832 <= local70 && local65 <= Static161.anInt2954) {
				local93 = Static25.method861(Static28.anInt675, local9 + arg1, Static82.anInt1837);
				local101 = Static25.method861(Static28.anInt675, arg1 - local9, Static82.anInt1837);
				if (local70 <= Static161.anInt2954) {
					Static101.method2163(local93, Static357.anIntArrayArray58[local70], arg3, local101);
				}
				if (local65 >= Static365.anInt6832) {
					Static101.method2163(local93, Static357.anIntArrayArray58[local65], arg3, local101);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	public static void method4014() {
		Static182.anInt3420 = 0;
		Static101.aBoolean158 = false;
		Static360.anInt6186 = -1;
		Static216.anInt3800 = 0;
		Static347.anInt6441 = 1;
		Static47.anInt1248 = 0;
		Static41.anInt1046 = -3;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIII)V")
	public static void method4016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static93.anInt1951 == 1) {
			Static288.aClass13Array21[Static313.anInt5878 / 100].method6385(Static320.anInt6005 - 8, Static291.anInt5504 + -8);
		}
		if (Static93.anInt1951 == 2) {
			Static288.aClass13Array21[Static313.anInt5878 / 100 + 4].method6385(Static320.anInt6005 - 8, Static291.anInt5504 - 8);
		}
		Static290.method5025();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIILclient!dg;II)Z")
	public static boolean method4017(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class46 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg0;
		@Pc(18) int local18 = arg6 - 64;
		@Pc(23) int local23 = arg0 - 64;
		Static301.anIntArrayArray49[64][64] = 99;
		Static13.anIntArrayArray4[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static47.anIntArray90[0] = arg6;
		@Pc(51) int local51 = local37 + 1;
		Static257.anIntArray257[0] = arg0;
		@Pc(56) int[][] local56 = arg7.anIntArrayArray14;
		while (local39 != local51) {
			local7 = Static47.anIntArray90[local39];
			local9 = Static257.anIntArray257[local39];
			local39 = local39 + 1 & 0xFFF;
			@Pc(77) int local77 = local7 - local18;
			@Pc(82) int local82 = local9 - local23;
			@Pc(88) int local88 = local7 - arg7.anInt1468;
			@Pc(94) int local94 = local9 - arg7.anInt1484;
			if (arg8 == -4) {
				if (local7 == arg4 && local9 == arg1) {
					Static182.anInt3422 = local9;
					Static184.anInt3435 = local7;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static24.method856(arg5, local9, arg1, local7, arg4, 2, arg9, 2)) {
					Static184.anInt3435 = local7;
					Static182.anInt3422 = local9;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg7.method1637(arg5, local7, arg1, 2, arg2, arg4, local9, 2, arg9)) {
					Static184.anInt3435 = local7;
					Static182.anInt3422 = local9;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg7.method1640(arg2, arg4, arg5, local7, arg1, arg9, local9, 2)) {
					Static184.anInt3435 = local7;
					Static182.anInt3422 = local9;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg7.method1629(2, arg4, arg8, arg1, arg3, local9, local7)) {
					Static184.anInt3435 = local7;
					Static182.anInt3422 = local9;
					return true;
				}
			} else if (arg7.method1630(arg3, 2, local9, local7, arg8, arg1, arg4)) {
				Static184.anInt3435 = local7;
				Static182.anInt3422 = local9;
				return true;
			}
			@Pc(252) int local252 = Static13.anIntArrayArray4[local77][local82] + 1;
			if (local77 > 0 && Static301.anIntArrayArray49[local77 - 1][local82] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + 1] & 0x4E240000) == 0) {
				Static47.anIntArray90[local51] = local7 - 1;
				Static257.anIntArray257[local51] = local9;
				Static301.anIntArrayArray49[local77 - 1][local82] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static13.anIntArrayArray4[local77 - 1][local82] = local252;
			}
			if (local77 < 126 && Static301.anIntArrayArray49[local77 + 1][local82] == 0 && (local56[local88 + 2][local94] & 0x60E40000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78240000) == 0) {
				Static47.anIntArray90[local51] = local7 + 1;
				Static257.anIntArray257[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static301.anIntArrayArray49[local77 + 1][local82] = 8;
				Static13.anIntArrayArray4[local77 + 1][local82] = local252;
			}
			if (local82 > 0 && Static301.anIntArrayArray49[local77][local82 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + 1][local94 - 1] & 0x60E40000) == 0) {
				Static47.anIntArray90[local51] = local7;
				Static257.anIntArray257[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static301.anIntArrayArray49[local77][local82 - 1] = 1;
				Static13.anIntArrayArray4[local77][local82 - 1] = local252;
			}
			if (local82 < 126 && Static301.anIntArrayArray49[local77][local82 + 1] == 0 && (local56[local88][local94 + 2] & 0x4E240000) == 0 && (local56[local88 + 1][local94 + 2] & 0x78240000) == 0) {
				Static47.anIntArray90[local51] = local7;
				Static257.anIntArray257[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static301.anIntArrayArray49[local77][local82 + 1] = 4;
				Static13.anIntArrayArray4[local77][local82 + 1] = local252;
			}
			if (local77 > 0 && local82 > 0 && Static301.anIntArrayArray49[local77 - 1][local82 - 1] == 0 && (local56[local88 - 1][local94] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0 && (local56[local88][local94 - 1] & 0x63E40000) == 0) {
				Static47.anIntArray90[local51] = local7 - 1;
				Static257.anIntArray257[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static301.anIntArrayArray49[local77 - 1][local82 - 1] = 3;
				Static13.anIntArrayArray4[local77 - 1][local82 - 1] = local252;
			}
			if (local77 < 126 && local82 > 0 && Static301.anIntArrayArray49[local77 + 1][local82 - 1] == 0 && (local56[local88 + 1][local94 - 1] & 0x63E40000) == 0 && (local56[local88 + 2][local94 - 1] & 0x60E40000) == 0 && (local56[local88 + 2][local94] & 0x78E40000) == 0) {
				Static47.anIntArray90[local51] = local7 + 1;
				Static257.anIntArray257[local51] = local9 - 1;
				Static301.anIntArrayArray49[local77 + 1][local82 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static13.anIntArrayArray4[local77 + 1][local82 - 1] = local252;
			}
			if (local77 > 0 && local82 < 126 && Static301.anIntArrayArray49[local77 - 1][local82 + 1] == 0 && (local56[local88 - 1][local94 + 1] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 + 2] & 0x4E240000) == 0 && (local56[local88][local94 + 2] & 0x7E240000) == 0) {
				Static47.anIntArray90[local51] = local7 - 1;
				Static257.anIntArray257[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static301.anIntArrayArray49[local77 - 1][local82 + 1] = 6;
				Static13.anIntArrayArray4[local77 - 1][local82 + 1] = local252;
			}
			if (local77 < 126 && local82 < 126 && Static301.anIntArrayArray49[local77 + 1][local82 + 1] == 0 && (local56[local88 + 1][local94 + 2] & 0x7E240000) == 0 && (local56[local88 + 2][local94 + 2] & 0x78240000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78E40000) == 0) {
				Static47.anIntArray90[local51] = local7 + 1;
				Static257.anIntArray257[local51] = local9 + 1;
				Static301.anIntArrayArray49[local77 + 1][local82 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static13.anIntArrayArray4[local77 + 1][local82 + 1] = local252;
			}
		}
		Static184.anInt3435 = local7;
		Static182.anInt3422 = local9;
		return false;
	}
}
