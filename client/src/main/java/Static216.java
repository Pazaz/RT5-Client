import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "[I")
	public static final int[] anIntArray231 = new int[3];

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
	public static int anInt3798 = 0;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V")
	public static void method3774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static316.method5413(9, arg1);
		local8.method2311();
		local8.anInt2289 = arg0;
		local8.anInt2290 = arg2;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!nk;ILclient!wm;IILclient!kf;II)V")
	public static void method3776(@OriginalArg(0) int arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class78 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) Class164 local14 = Static236.aClass125_1.method3379(arg2);
		if (local14 == null || !local14.aBoolean304 || !local14.method4180(Static214.aClass226_1)) {
			return;
		}
		@Pc(34) int local34;
		if (local14.anIntArray290 != null) {
			@Pc(32) int[] local32 = new int[local14.anIntArray290.length];
			@Pc(44) int local44;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static314.anInt5911 == 4) {
					local44 = (int) Static277.aFloat67 & 0x3FFF;
				} else {
					local44 = (int) Static277.aFloat67 + Static6.anInt158 & 0x3FFF;
				}
				@Pc(58) int local58 = Class19.anIntArray178[local44];
				@Pc(62) int local62 = Class19.anIntArray177[local44];
				if (Static314.anInt5911 != 4) {
					local62 = local62 * 256 / (Static97.anInt2005 + 256);
					local58 = local58 * 256 / (Static97.anInt2005 + 256);
				}
				local32[local34 * 2] = ((local14.anIntArray290[local34 * 2] * 4 + arg6) * local62 + (local14.anIntArray290[local34 * 2 + 1] * 4 + arg4) * local58 >> 15) + arg1.anInt4248 / 2 + arg0;
				local32[local34 * 2 + 1] = arg7 + arg1.anInt4261 / 2 - (local62 * (arg4 + local14.anIntArray290[local34 * 2 + 1] * 4) - (local14.anIntArray290[local34 * 2] * 4 + arg6) * local58 >> 15);
			}
			Static293.method5047(arg3, local32, local14.anInt4414, arg1.anIntArray282, arg1.anIntArray280);
			for (local44 = 0; local44 < local32.length / 2 - 1; local44++) {
				arg3.method2815(local32[local44 * 2], local32[local44 * 2 + 1], local32[(local44 + 1) * 2], local32[local44 * 2 + 1 + 2], local14.anInt4422, arg5, arg0, arg7);
			}
			arg3.method2815(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local14.anInt4422, arg5, arg0, arg7);
		}
		@Pc(267) Class13 local267 = null;
		if (local14.anInt4420 != -1) {
			local267 = local14.method4189(arg3, false);
			if (local267 != null) {
				Static376.method6288(arg5, arg6, arg0, arg4, local267, arg7, arg1);
			}
		}
		if (local14.aString48 == null) {
			return;
		}
		local34 = 0;
		if (local267 != null) {
			local34 = local267.method6382();
		}
		@Pc(301) Class130 local301 = Static200.aClass130_3;
		@Pc(303) Class239 local303 = Static52.aClass239_1;
		if (local14.anInt4418 == 1) {
			local303 = Static165.aClass239_3;
			local301 = Static276.aClass130_4;
		}
		if (local14.anInt4418 == 2) {
			local301 = Static52.aClass130_1;
			local303 = Static113.aClass239_2;
		}
		Static164.method3147(arg0, arg4, arg7, local14.anInt4431, arg6, local34, local301, local303, arg5, local14.aString48, arg1);
		return;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public static void method3777() {
		for (@Pc(7) int local7 = 0; local7 < Static243.anInt4503; local7++) {
			@Pc(15) int local15 = Static237.anIntArray283[local7]--;
			if (Static237.anIntArray283[local7] >= -10) {
				@Pc(90) Class247 local90 = Static196.aClass247Array2[local7];
				if (local90 == null) {
					local90 = Static409.method6435(client.jsArchive4, Static256.anIntArray321[local7], 0);
					if (local90 == null) {
						continue;
					}
					Static237.anIntArray283[local7] += local90.method6436();
					Static196.aClass247Array2[local7] = local90;
				}
				if (Static237.anIntArray283[local7] < 0) {
					@Pc(143) int local143;
					if (Static162.anIntArray188[local7] == 0) {
						local143 = client.preferences.anInt4888 * Static223.anIntArray256[local7] >> 8;
					} else {
						@Pc(133) int local133 = Static162.anIntArray188[local7] >> 24 & 0x3;
						if (Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 == local133) {
							@Pc(153) int local153 = (Static162.anIntArray188[local7] & 0xFF) * 128;
							@Pc(161) int local161 = Static162.anIntArray188[local7] >> 16 & 0xFF;
							@Pc(171) int local171 = local161 * 128 + 64 - Static17.aClass11_Sub5_Sub2_Sub1_3.xFine;
							if (local171 < 0) {
								local171 = -local171;
							}
							@Pc(187) int local187 = Static162.anIntArray188[local7] >> 8 & 0xFF;
							@Pc(197) int local197 = local187 * 128 + 64 - Static17.aClass11_Sub5_Sub2_Sub1_3.zFine;
							if (local197 < 0) {
								local197 = -local197;
							}
							@Pc(211) int local211 = local197 + local171 - 128;
							if (local153 < local211) {
								Static237.anIntArray283[local7] = -100;
								continue;
							}
							if (local211 < 0) {
								local211 = 0;
							}
							local143 = Static223.anIntArray256[local7] * (local153 - local211) * client.preferences.anInt4882 / local153 >> 8;
						} else {
							local143 = 0;
						}
					}
					if (local143 > 0) {
						@Pc(264) Class2_Sub21_Sub1 local264 = local90.method6434().method3179(Static300.aClass249_1);
						@Pc(269) Class2_Sub12_Sub4 local269 = Static406.method5006(local264, local143);
						local269.method4984(Static329.anIntArray419[local7] - 1);
						Static227.aClass2_Sub12_Sub2_2.method2083(local269);
					}
					Static237.anIntArray283[local7] = -100;
				}
			} else {
				Static243.anInt4503--;
				for (@Pc(29) int local29 = local7; local29 < Static243.anInt4503; local29++) {
					Static256.anIntArray321[local29] = Static256.anIntArray321[local29 + 1];
					Static196.aClass247Array2[local29] = Static196.aClass247Array2[local29 + 1];
					Static329.anIntArray419[local29] = Static329.anIntArray419[local29 + 1];
					Static237.anIntArray283[local29] = Static237.anIntArray283[local29 + 1];
					Static162.anIntArray188[local29] = Static162.anIntArray188[local29 + 1];
					Static223.anIntArray256[local29] = Static223.anIntArray256[local29 + 1];
				}
				local7--;
			}
		}
		if (Static393.aBoolean486 && !Static64.method1704()) {
			if (client.preferences.anInt4889 != 0 && Static171.anInt3268 != -1) {
				Static94.method2042(client.preferences.anInt4889, Static171.anInt3268, client.jsArchive6);
			}
			Static393.aBoolean486 = false;
		} else if (client.preferences.anInt4889 != 0 && Static171.anInt3268 != -1 && !Static64.method1704()) {
			Protocol.method1960(Static67.aClass145_56);
			Protocol.outboundBuffer.p4(Static171.anInt3268);
			Static171.anInt3268 = -1;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	public static void method3778(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub7 local12 = Static316.method5413(7, arg0);
		local12.method2312();
	}
}
