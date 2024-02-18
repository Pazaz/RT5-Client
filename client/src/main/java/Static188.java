import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "Lclient!hla;")
	public static final Class168 aClass168_1 = new Class168();

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
	public static int anInt3103 = 0;

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
	public static final int anInt3104 = 1337;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method2856(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg6 && arg0 == arg5 && arg4 == arg8 && arg2 == arg3) {
			Static418.method7862(arg8, arg2, arg7, arg1, arg0);
			return;
		}
		@Pc(32) int local32 = arg7;
		@Pc(34) int local34 = arg0;
		@Pc(38) int local38 = arg7 * 3;
		@Pc(42) int local42 = arg0 * 3;
		@Pc(46) int local46 = arg6 * 3;
		@Pc(50) int local50 = arg5 * 3;
		@Pc(54) int local54 = arg4 * 3;
		@Pc(58) int local58 = arg3 * 3;
		@Pc(67) int local67 = local46 + arg8 - arg7 - local54;
		@Pc(78) int local78 = arg2 + local50 - arg0 - local58;
		@Pc(87) int local87 = local54 + local38 - local46 - local46;
		@Pc(97) int local97 = local58 + local42 - local50 - local50;
		@Pc(102) int local102 = local46 - local38;
		@Pc(107) int local107 = local50 - local42;
		for (@Pc(109) int local109 = 128; local109 <= 4096; local109 += 128) {
			@Pc(117) int local117 = local109 * local109 >> 12;
			@Pc(123) int local123 = local117 * local109 >> 12;
			@Pc(127) int local127 = local67 * local123;
			@Pc(131) int local131 = local78 * local123;
			@Pc(135) int local135 = local117 * local87;
			@Pc(139) int local139 = local97 * local117;
			@Pc(143) int local143 = local109 * local102;
			@Pc(147) int local147 = local107 * local109;
			@Pc(157) int local157 = (local135 + local127 + local143 >> 12) + arg7;
			@Pc(168) int local168 = arg0 + (local139 + local131 + local147 >> 12);
			Static418.method7862(local157, local168, local32, arg1, local34);
			local32 = local157;
			local34 = local168;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)I")
	public static int method2857(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIILclient!eq;IIIIIII)Z")
	public static boolean method2858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class110 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4;
		@Pc(7) int local7 = arg5;
		@Pc(16) int local16 = arg4 - 64;
		Static352.anIntArrayArray141[64][64] = 99;
		@Pc(33) int local33 = arg5 - 64;
		Static668.anIntArrayArray244[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static507.anIntArray610[0] = arg4;
		@Pc(50) int local50 = local41 + 1;
		Static428.anIntArray517[0] = arg5;
		@Pc(55) int[][] local55 = arg3.anIntArrayArray65;
		while (local43 != local50) {
			local7 = Static428.anIntArray517[local43];
			local5 = Static507.anIntArray610[local43];
			@Pc(70) int local70 = local7 - arg3.anInt2645;
			@Pc(76) int local76 = local5 - arg3.anInt2647;
			local43 = local43 + 1 & 0xFFF;
			@Pc(86) int local86 = local7 - local33;
			@Pc(91) int local91 = local5 - local16;
			if (arg2 == -4) {
				if (arg6 == local5 && local7 == arg7) {
					Static594.anInt8775 = local5;
					Static407.anInt6285 = local7;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static275.method3979(arg6, 1, local5, arg0, arg1, local7, arg7, 1)) {
					Static594.anInt8775 = local5;
					Static407.anInt6285 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg3.method2460(1, arg7, 1, local5, arg6, arg9, arg1, local7, arg0)) {
					Static407.anInt6285 = local7;
					Static594.anInt8775 = local5;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg3.method2464(arg7, arg9, arg6, local5, 1, arg1, arg0, local7)) {
					Static407.anInt6285 = local7;
					Static594.anInt8775 = local5;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg3.method2465(1, arg2, arg7, local7, local5, arg6, arg8)) {
					Static594.anInt8775 = local5;
					Static407.anInt6285 = local7;
					return true;
				}
			} else if (arg3.method2458(local5, arg2, arg6, arg7, arg8, local7, 1)) {
				Static407.anInt6285 = local7;
				Static594.anInt8775 = local5;
				return true;
			}
			@Pc(273) int local273 = Static668.anIntArrayArray244[local91][local86] + 1;
			if (local91 > 0 && Static352.anIntArrayArray141[local91 - 1][local86] == 0 && (local55[local76 - 1][local70] & 0x42240000) == 0) {
				Static507.anIntArray610[local50] = local5 - 1;
				Static428.anIntArray517[local50] = local7;
				local50 = local50 + 1 & 0xFFF;
				Static352.anIntArrayArray141[local91 - 1][local86] = 2;
				Static668.anIntArrayArray244[local91 - 1][local86] = local273;
			}
			if (local91 < 127 && Static352.anIntArrayArray141[local91 + 1][local86] == 0 && (local55[local76 + 1][local70] & 0x60240000) == 0) {
				Static507.anIntArray610[local50] = local5 + 1;
				Static428.anIntArray517[local50] = local7;
				local50 = local50 + 1 & 0xFFF;
				Static352.anIntArrayArray141[local91 + 1][local86] = 8;
				Static668.anIntArrayArray244[local91 + 1][local86] = local273;
			}
			if (local86 > 0 && Static352.anIntArrayArray141[local91][local86 - 1] == 0 && (local55[local76][local70 - 1] & 0x40A40000) == 0) {
				Static507.anIntArray610[local50] = local5;
				Static428.anIntArray517[local50] = local7 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static352.anIntArrayArray141[local91][local86 - 1] = 1;
				Static668.anIntArrayArray244[local91][local86 - 1] = local273;
			}
			if (local86 < 127 && Static352.anIntArrayArray141[local91][local86 + 1] == 0 && (local55[local76][local70 + 1] & 0x48240000) == 0) {
				Static507.anIntArray610[local50] = local5;
				Static428.anIntArray517[local50] = local7 + 1;
				Static352.anIntArrayArray141[local91][local86 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static668.anIntArrayArray244[local91][local86 + 1] = local273;
			}
			if (local91 > 0 && local86 > 0 && Static352.anIntArrayArray141[local91 - 1][local86 - 1] == 0 && (local55[local76 - 1][local70 - 1] & 0x43A40000) == 0 && (local55[local76 - 1][local70] & 0x42240000) == 0 && (local55[local76][local70 - 1] & 0x40A40000) == 0) {
				Static507.anIntArray610[local50] = local5 - 1;
				Static428.anIntArray517[local50] = local7 - 1;
				Static352.anIntArrayArray141[local91 - 1][local86 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static668.anIntArrayArray244[local91 - 1][local86 - 1] = local273;
			}
			if (local91 < 127 && local86 > 0 && Static352.anIntArrayArray141[local91 + 1][local86 - 1] == 0 && (local55[local76 + 1][local70 - 1] & 0x60E40000) == 0 && (local55[local76 + 1][local70] & 0x60240000) == 0 && (local55[local76][local70 - 1] & 0x40A40000) == 0) {
				Static507.anIntArray610[local50] = local5 + 1;
				Static428.anIntArray517[local50] = local7 - 1;
				Static352.anIntArrayArray141[local91 + 1][local86 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static668.anIntArrayArray244[local91 + 1][local86 - 1] = local273;
			}
			if (local91 > 0 && local86 < 127 && Static352.anIntArrayArray141[local91 - 1][local86 + 1] == 0 && (local55[local76 - 1][local70 + 1] & 0x4E240000) == 0 && (local55[local76 - 1][local70] & 0x42240000) == 0 && (local55[local76][local70 + 1] & 0x48240000) == 0) {
				Static507.anIntArray610[local50] = local5 - 1;
				Static428.anIntArray517[local50] = local7 + 1;
				Static352.anIntArrayArray141[local91 - 1][local86 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static668.anIntArrayArray244[local91 - 1][local86 + 1] = local273;
			}
			if (local91 < 127 && local86 < 127 && Static352.anIntArrayArray141[local91 + 1][local86 + 1] == 0 && (local55[local76 + 1][local70 + 1] & 0x78240000) == 0 && (local55[local76 + 1][local70] & 0x60240000) == 0 && (local55[local76][local70 + 1] & 0x48240000) == 0) {
				Static507.anIntArray610[local50] = local5 + 1;
				Static428.anIntArray517[local50] = local7 + 1;
				Static352.anIntArrayArray141[local91 + 1][local86 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static668.anIntArrayArray244[local91 + 1][local86 + 1] = local273;
			}
		}
		Static407.anInt6285 = local7;
		Static594.anInt8775 = local5;
		return false;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!sb;)I")
	public static int method2860(@OriginalArg(1) Class330 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method7581(Static159.anInt2787)) {
			local5++;
		}
		if (arg0.method7581(Static434.anInt6579)) {
			local5++;
		}
		if (arg0.method7581(Static67.anInt6784)) {
			local5++;
		}
		if (arg0.method7581(Static304.anInt4876)) {
			local5++;
		}
		if (arg0.method7581(Static644.anInt9607)) {
			local5++;
		}
		if (arg0.method7581(Static699.anInt10540)) {
			local5++;
		}
		if (arg0.method7581(Static132.anInt2451)) {
			local5++;
		}
		if (arg0.method7581(Static270.anInt4355)) {
			local5++;
		}
		if (arg0.method7581(Static598.anInt8828)) {
			local5++;
		}
		if (arg0.method7581(Static305.anInt4883)) {
			local5++;
		}
		if (arg0.method7581(Static548.anInt8259)) {
			local5++;
		}
		if (arg0.method7581(Static113.anInt2238)) {
			local5++;
		}
		if (arg0.method7581(Static670.anInt10024)) {
			local5++;
		}
		if (arg0.method7581(Static286.anInt4592)) {
			local5++;
		}
		if (arg0.method7581(Static665.anInt9943)) {
			local5++;
		}
		return local5;
	}
}
