import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
	public static int anInt7756;

	@OriginalMember(owner = "client!qga", name = "i", descriptor = "Lclient!sia;")
	public static final Class339 aClass339_44 = new Class339();

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIZIII[IBIIILclient!eq;[III)I")
	public static int method6870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class110 arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(5) int local5 = 0; local5 < 128; local5++) {
			for (@Pc(8) int local8 = 0; local8 < 128; local8++) {
				Static352.anIntArrayArray141[local5][local8] = 0;
				Static668.anIntArrayArray244[local5][local8] = 99999999;
			}
		}
		@Pc(51) boolean local51;
		if (arg1 == 1) {
			local51 = Static188.method2858(arg7, arg5, arg9, arg10, arg4, arg8, arg12, arg0, arg13, arg3);
		} else if (arg1 == 2) {
			local51 = Static204.method3083(arg3, arg4, arg5, arg12, arg13, arg9, arg7, arg0, arg8, arg10);
		} else {
			local51 = Static434.method5854(arg13, arg10, arg4, arg7, arg9, arg8, arg3, arg12, arg0, arg1, arg5);
		}
		@Pc(87) int local87 = arg4 - 64;
		@Pc(91) int local91 = arg8 - 64;
		@Pc(93) int local93 = Static594.anInt8775;
		@Pc(95) int local95 = Static407.anInt6285;
		@Pc(106) int local106;
		@Pc(108) int local108;
		@Pc(114) int local114;
		if (!local51) {
			if (!arg2) {
				return -1;
			}
			local106 = Integer.MAX_VALUE;
			local108 = Integer.MAX_VALUE;
			for (local114 = arg12 - 10; local114 <= arg12 + 10; local114++) {
				for (@Pc(120) int local120 = arg0 - 10; local120 <= arg0 + 10; local120++) {
					@Pc(126) int local126 = local114 - local87;
					@Pc(131) int local131 = local120 - local91;
					if (local126 >= 0 && local131 >= 0 && local126 < 128 && local131 < 128 && Static668.anIntArrayArray244[local126][local131] < 100) {
						@Pc(163) int local163 = 0;
						if (local114 < arg12) {
							local163 = arg12 - local114;
						} else if (arg12 + arg7 - 1 < local114) {
							local163 = local114 + 1 - arg12 - arg7;
						}
						@Pc(198) int local198 = 0;
						if (local120 < arg0) {
							local198 = arg0 - local120;
						} else if (arg5 + arg0 - 1 < local120) {
							local198 = local120 + 1 - arg5 - arg0;
						}
						@Pc(235) int local235 = local163 * local163 + local198 * local198;
						if (local235 < local106 || local235 == local106 && local108 > Static668.anIntArrayArray244[local126][local131]) {
							local95 = local120;
							local93 = local114;
							local106 = local235;
							local108 = Static668.anIntArrayArray244[local126][local131];
						}
					}
				}
			}
			if (~local106 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg4 == local93 && local95 == arg8) {
			return 0;
		}
		@Pc(318) byte local318 = 0;
		Static507.anIntArray610[0] = local93;
		local106 = local318 + 1;
		Static428.anIntArray517[0] = local95;
		@Pc(340) int local340;
		local108 = local340 = Static352.anIntArrayArray141[local93 - local87][local95 - local91];
		while (local93 != arg4 || arg8 != local95) {
			if (local108 != local340) {
				local340 = local108;
				Static507.anIntArray610[local106] = local93;
				Static428.anIntArray517[local106++] = local95;
			}
			if ((local108 & 0x2) != 0) {
				local93++;
			} else if ((local108 & 0x8) != 0) {
				local93--;
			}
			if ((local108 & 0x1) != 0) {
				local95++;
			} else if ((local108 & 0x4) != 0) {
				local95--;
			}
			local108 = Static352.anIntArrayArray141[local93 - local87][local95 - local91];
		}
		local114 = 0;
		while (local106-- > 0) {
			arg11[local114] = Static507.anIntArray610[local106];
			arg6[local114++] = Static428.anIntArray517[local106];
			if (local114 >= arg11.length) {
				break;
			}
		}
		return local114;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIIIII)I")
	public static int method6874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(12) int local12 = arg4;
			arg4 = arg2;
			arg2 = local12;
		}
		@Pc(20) int local20 = arg0 & 0x3;
		if (local20 == 0) {
			return arg1;
		} else if (local20 == 1) {
			return 1 + 7 - arg4 - arg5;
		} else if (local20 == 2) {
			return 1 + 7 - arg2 - arg1;
		} else {
			return arg5;
		}
	}
}
