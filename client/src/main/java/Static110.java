import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!he", name = "y", descriptor = "Lclient!qj;")
	public static Class162 aClass162_113;

	@OriginalMember(owner = "client!he", name = "z", descriptor = "Lclient!mj;")
	public static Class23 aClass23_2;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "[Lclient!qa;")
	public static Class29[] aClass29Array6;

	@OriginalMember(owner = "client!he", name = "F", descriptor = "[I")
	public static int[] anIntArray232;

	@OriginalMember(owner = "client!he", name = "A", descriptor = "[I")
	public static final int[] anIntArray231 = new int[14];

	@OriginalMember(owner = "client!he", name = "G", descriptor = "[Lclient!kj;")
	public static final Class1_Sub1_Sub14[] aClass1_Sub1_Sub14Array3 = new Class1_Sub1_Sub14[14];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!nr;ILclient!dr;IZZIILclient!tb;ILclient!nr;)Lclient!qa;")
	public static Class29 method2667(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) Class30 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class190 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class40 arg10) {
		@Pc(15) Class29 local15 = Static318.method5596(arg1, arg3, arg0, arg8, arg9, arg7, arg6);
		if (local15 != null) {
			return local15;
		}
		@Pc(23) Class36 local23 = Static165.method3446(arg3);
		@Pc(33) int local33;
		if (arg9 > 1 && local23.anIntArray79 != null) {
			@Pc(31) int local31 = -1;
			for (local33 = 0; local33 < 10; local33++) {
				if (local23.anIntArray77[local33] <= arg9 && local23.anIntArray77[local33] != 0) {
					local31 = local23.anIntArray79[local33];
				}
			}
			if (local31 != -1) {
				local23 = Static165.method3446(local31);
			}
		}
		@Pc(73) Class126 local73 = Static216.method4218(local23.anInt1208, Static120.aClass162_104);
		if (local73 == null) {
			return null;
		}
		if (local23.aShortArray13 != null) {
			for (local33 = 0; local33 < local23.aShortArray13.length; local33++) {
				if (local23.aByteArray7 == null || local33 >= local23.aByteArray7.length) {
					local73.method3643(local23.aShortArray15[local33], local23.aShortArray13[local33]);
				} else {
					local73.method3643(Static257.aShortArray92[local23.aByteArray7[local33] & 0xFF], local23.aShortArray13[local33]);
				}
			}
		}
		if (local23.aShortArray14 != null) {
			for (local33 = 0; local33 < local23.aShortArray14.length; local33++) {
				local73.method3640(local23.aShortArray14[local33], local23.aShortArray16[local33]);
			}
		}
		if (arg8 != null) {
			for (local33 = 0; local33 < 5; local33++) {
				if (arg8.anIntArray478[local33] < Static104.aShortArrayArray2[local33].length) {
					local73.method3643(Static104.aShortArrayArray2[local33][arg8.anIntArray478[local33]], Static8.aShortArray1[local33]);
				}
				if (arg8.anIntArray478[local33] < Static95.aShortArrayArray1[local33].length) {
					local73.method3643(Static95.aShortArrayArray1[local33][arg8.anIntArray478[local33]], Static229.aShortArray90[local33]);
				}
			}
		}
		@Pc(216) short local216 = 1024;
		@Pc(218) boolean local218 = false;
		if (local23.anInt1248 != 128 || local23.anInt1244 != 128 || local23.anInt1265 != 128) {
			local218 = true;
			local216 = 1031;
		}
		@Pc(254) Class86 local254 = arg10.method2762(local73, local216, 0, local23.anInt1258 + 64, local23.anInt1241 + 768);
		if (!local254.method5564()) {
			return null;
		}
		if (local218) {
			local254.method5540(local23.anInt1248, local23.anInt1244, local23.anInt1265);
		}
		@Pc(271) Class29 local271 = null;
		if (local23.anInt1231 != -1) {
			local271 = method2667(0, arg1, arg2, local23.anInt1209, true, true, 1, 0, arg8, 10, arg10);
			if (local271 == null) {
				return null;
			}
		} else if (local23.anInt1224 != -1) {
			local271 = method2667(arg0, arg1, arg2, local23.anInt1263, true, false, arg6, 0, arg8, arg9, arg10);
			if (local271 == null) {
				return null;
			}
		}
		@Pc(321) int local321 = local23.anInt1245;
		arg10.method2737(16, 16, 512, 512);
		if (arg5) {
			local321 = (int) ((double) local321 * 1.5D);
		} else if (arg6 == 2) {
			local321 = (int) ((double) local321 * 1.04D);
		}
		@Pc(351) Class11 local351 = arg10.method2801();
		local351.method5504();
		arg10.method2804(local351);
		arg10.method2705(1.0F);
		arg10.method2776(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(370) Class11 local370 = arg10.method2782();
		local370.method5490(-local23.anInt1261 << 3);
		local370.method5507(local23.anInt1218 << 3);
		local370.method5489(local23.anInt1266, (Class39.anIntArray88[local23.anInt1230 << 3] * local321 >> 15) - (local254.method5534() / 2 - local23.anInt1264), local23.anInt1264 + (local321 * Class39.anIntArray87[local23.anInt1230 << 3] >> 15));
		local370.method5494(local23.anInt1230 << 3);
		@Pc(428) int local428 = arg10.method2805();
		@Pc(431) int local431 = arg10.method2708();
		arg10.method2774(50, Integer.MAX_VALUE);
		arg10.method2713();
		arg10.method2788();
		arg10.method2717(0, 0, 36, 32, 0, 0);
		local254.method5539(local370, null, 1);
		arg10.method2774(local428, local431);
		@Pc(463) int[] local463 = arg10.method2718();
		if (arg6 >= 1) {
			local463 = Static83.method1839(-16777215, local463);
			if (arg6 >= 2) {
				local463 = Static83.method1839(-1, local463);
			}
		}
		if (arg0 != 0) {
			Static64.method1506(local463, arg0);
		}
		arg10.method2791(local463, 36, 36, 32).method5845(0, 0);
		if (local23.anInt1231 != -1) {
			local271.method5845(0, 0);
		} else if (local23.anInt1224 != -1) {
			local271.method5845(0, 0);
		}
		if (arg7 == 1 || arg7 == 2 && (local23.anInt1219 == 1 || arg9 != 1) && arg9 != -1) {
			arg2.method4832(Static320.method5616(arg9), -256, 9, 0, -16777215);
		}
		local463 = arg10.method2718();
		for (@Pc(556) int local556 = 0; local556 < local463.length; local556++) {
			if ((local463[local556] & 0xFFFFFF) == 0) {
				local463[local556] = 0;
			} else {
				local463[local556] |= 0xFF000000;
			}
		}
		@Pc(593) Class29 local593;
		if (arg4) {
			local593 = arg10.method2791(local463, 36, 36, 32);
		} else {
			local593 = arg1.method2791(local463, 36, 36, 32);
		}
		if (!arg4) {
			@Pc(609) Class100 local609 = new Class100();
			local609.anInt3471 = arg6;
			local609.anInt3464 = arg0;
			local609.anInt3459 = arg9;
			local609.anInt3461 = arg3;
			local609.aBoolean240 = arg8 != null;
			local609.anInt3462 = arg1.anInt3191;
			local609.anInt3470 = arg7;
			Static299.aClass115_1.method3458(local609, local593);
		}
		return local593;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIZII)V")
	public static void method2669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(21) int local21 = arg0 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(45) int local45 = local21 * (Static95.aShort37 - Static142.aShort50) / 100 + Static142.aShort50;
		if (local45 < Static117.aShort49) {
			local45 = Static117.aShort49;
		} else if (Static29.aShort79 < local45) {
			local45 = Static29.aShort79;
		}
		@Pc(75) int local75 = arg0 * 512 * local45 / (arg1 * 334);
		@Pc(109) int local109;
		@Pc(116) int local116;
		@Pc(84) short local84;
		if (local75 < Static15.aShort14) {
			local84 = Static15.aShort14;
			local45 = local84 * 334 * arg1 / (arg0 * 512);
			if (Static29.aShort79 < local45) {
				local45 = Static29.aShort79;
				local109 = arg0 * local45 * 512 / (local84 * 334);
				local116 = (arg1 - local109) / 2;
				if (arg3) {
					Static221.aClass40_6.method2788();
					Static221.aClass40_6.method2745(local116, arg0, arg4, arg2, -16777216);
					Static221.aClass40_6.method2745(local116, arg0, arg1 + arg4 - local116, arg2, -16777216);
				}
				arg4 += local116;
				arg1 -= local116 * 2;
			}
		} else if (local75 > Static145.aShort55) {
			local84 = Static145.aShort55;
			local45 = arg1 * 334 * local84 / (arg0 * 512);
			if (Static117.aShort49 > local45) {
				local45 = Static117.aShort49;
				local109 = local84 * 334 * arg1 / (local45 * 512);
				local116 = (arg0 - local109) / 2;
				if (arg3) {
					Static221.aClass40_6.method2788();
					Static221.aClass40_6.method2745(arg1, local116, arg4, arg2, -16777216);
					Static221.aClass40_6.method2745(arg1, local116, arg4, arg0 + arg2 - local116, -16777216);
				}
				arg0 -= local116 * 2;
				arg2 += local116;
			}
		}
		Static233.anInt5203 = arg0 * local45 / 334;
		Static190.anInt5412 = arg2;
		Static54.anInt1612 = arg4;
		Static108.anInt2686 = (short) arg1;
		Static292.anInt6121 = (short) arg0;
	}
}
