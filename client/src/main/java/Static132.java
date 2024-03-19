import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ip", name = "V", descriptor = "[I")
	public static final int[] anIntArray245 = new int[50];

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(II)V")
	public static void method3020(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub1_Sub10 local16 = Static122.method2624(3, arg0);
		local16.method2536();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!ro;BI)I")
	public static int method3022(@OriginalArg(0) Class177 arg0, @OriginalArg(2) int arg1) {
		if (!Static37.method930(arg0).method5618(arg1) && arg0.anObjectArray33 == null) {
			return -1;
		} else if (arg0.anIntArray432 == null || arg0.anIntArray432.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray432[arg1];
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZZ)V")
	public static void method3024(@OriginalArg(1) boolean arg0) {
		@Pc(7) int[] local7 = null;
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (arg0) {
			local11 = 1;
			local13 = Static32.aByteArrayArray56;
		} else {
			local11 = 4;
			local13 = Static93.aByteArrayArray22;
		}
		for (@Pc(25) int local25 = 0; local25 < local11; local25++) {
			Static56.method1395();
			for (@Pc(30) int local30 = 0; local30 < Static25.anInt850 >> 3; local30++) {
				for (@Pc(34) int local34 = 0; local34 < Static219.anInt4987 >> 3; local34++) {
					@Pc(38) boolean local38 = false;
					@Pc(46) int local46 = Static226.anIntArrayArrayArray10[local25][local30][local34];
					if (local46 != -1) {
						@Pc(55) int local55 = local46 >> 24 & 0x3;
						if (!arg0 || local55 == 0) {
							@Pc(68) int local68 = local46 >> 1 & 0x3;
							@Pc(74) int local74 = local46 >> 14 & 0x3FF;
							@Pc(80) int local80 = local46 >> 3 & 0x7FF;
							@Pc(91) int local91 = (local74 / 8 << 8) + (local80 / 8);
							for (@Pc(93) int local93 = 0; local93 < Static112.anIntArray204.length; local93++) {
								if (Static112.anIntArray204[local93] == local91 && local13[local93] != null) {
									@Pc(124) int[] local124 = Static65.method1532(Static66.aClass22Array1, local74, arg0, local55, local34 * 8, local13[local93], local68, local80, local25, local30 * 8, Static221.aClass40_6);
									if (local7 == null && local124 != null) {
										local7 = local124;
									}
									local38 = true;
									break;
								}
							}
						}
					}
					if (!local38) {
						Static326.method5663(8, local34 * 8, 8, local25, local30 * 8);
					}
				}
			}
		}
		if (local7 == null) {
			Static156.aClass210_1 = null;
		} else {
			Static156.aClass210_1 = Static209.method4127(local7[0], local7[1], local7[3], local7[2]);
			Static89.anInt2365 = local7[4];
		}
	}
}
