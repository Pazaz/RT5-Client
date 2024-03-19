import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
	public static int anInt4488 = 0;

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
	public static int anInt4494 = 0;

	@OriginalMember(owner = "client!mr", name = "w", descriptor = "Lclient!sf;")
	public static final Class183 aClass183_22 = new Class183(16);

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!bi;IIIIIIIIB)Z")
	public static boolean method3855(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg7 - 64;
		client.lb[64][64] = 99;
		@Pc(34) int local34 = arg3 - 64;
		Static152.anIntArrayArray23[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static289.anIntArray386[0] = arg7;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static180.anIntArray299[0] = arg3;
		@Pc(56) int[][] local56 = arg1.anIntArrayArray3;
		while (local51 != local48) {
			local9 = Static180.anIntArray299[local48];
			local7 = Static289.anIntArray386[local48];
			@Pc(72) int local72 = local9 - arg1.anInt729;
			@Pc(78) int local78 = local7 - arg1.anInt719;
			@Pc(83) int local83 = local7 - local18;
			@Pc(88) int local88 = local9 - local34;
			local48 = local48 + 1 & 0xFFF;
			if (arg0 == -4) {
				if (local7 == arg6 && local9 == arg4) {
					Static213.anInt1927 = local7;
					Static118.anInt3014 = local9;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static224.method4550(local9, arg6, local7, arg5, 1, 1, arg8, arg4)) {
					Static118.anInt3014 = local9;
					Static213.anInt1927 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg1.method515(arg6, 1, arg9, local9, local7, arg8, arg4, arg5, 1)) {
					Static118.anInt3014 = local9;
					Static213.anInt1927 = local7;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg1.method511(local7, arg5, arg4, arg9, local9, 1, arg8, arg6)) {
					Static213.anInt1927 = local7;
					Static118.anInt3014 = local9;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg1.method523(arg4, 1, arg2, arg6, arg0, local7, local9)) {
					Static118.anInt3014 = local9;
					Static213.anInt1927 = local7;
					return true;
				}
			} else if (arg1.method521(local9, arg2, 1, arg0, arg4, arg6, local7)) {
				Static118.anInt3014 = local9;
				Static213.anInt1927 = local7;
				return true;
			}
			@Pc(246) int local246 = Static152.anIntArrayArray23[local83][local88] + 1;
			if (local83 > 0 && client.lb[local83 - 1][local88] == 0 && (local56[local78 - 1][local72] & 0x42240000) == 0) {
				Static289.anIntArray386[local51] = local7 - 1;
				Static180.anIntArray299[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				client.lb[local83 - 1][local88] = 2;
				Static152.anIntArrayArray23[local83 - 1][local88] = local246;
			}
			if (local83 < 127 && client.lb[local83 + 1][local88] == 0 && (local56[local78 + 1][local72] & 0x60240000) == 0) {
				Static289.anIntArray386[local51] = local7 + 1;
				Static180.anIntArray299[local51] = local9;
				client.lb[local83 + 1][local88] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static152.anIntArrayArray23[local83 + 1][local88] = local246;
			}
			if (local88 > 0 && client.lb[local83][local88 - 1] == 0 && (local56[local78][local72 - 1] & 0x40A40000) == 0) {
				Static289.anIntArray386[local51] = local7;
				Static180.anIntArray299[local51] = local9 - 1;
				client.lb[local83][local88 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static152.anIntArrayArray23[local83][local88 - 1] = local246;
			}
			if (local88 < 127 && client.lb[local83][local88 + 1] == 0 && (local56[local78][local72 + 1] & 0x48240000) == 0) {
				Static289.anIntArray386[local51] = local7;
				Static180.anIntArray299[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				client.lb[local83][local88 + 1] = 4;
				Static152.anIntArrayArray23[local83][local88 + 1] = local246;
			}
			if (local83 > 0 && local88 > 0 && client.lb[local83 - 1][local88 - 1] == 0 && (local56[local78 - 1][local72 - 1] & 0x43A40000) == 0 && (local56[local78 - 1][local72] & 0x42240000) == 0 && (local56[local78][local72 - 1] & 0x40A40000) == 0) {
				Static289.anIntArray386[local51] = local7 - 1;
				Static180.anIntArray299[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				client.lb[local83 - 1][local88 - 1] = 3;
				Static152.anIntArrayArray23[local83 - 1][local88 - 1] = local246;
			}
			if (local83 < 127 && local88 > 0 && client.lb[local83 + 1][local88 - 1] == 0 && (local56[local78 + 1][local72 - 1] & 0x60E40000) == 0 && (local56[local78 + 1][local72] & 0x60240000) == 0 && (local56[local78][local72 - 1] & 0x40A40000) == 0) {
				Static289.anIntArray386[local51] = local7 + 1;
				Static180.anIntArray299[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				client.lb[local83 + 1][local88 - 1] = 9;
				Static152.anIntArrayArray23[local83 + 1][local88 - 1] = local246;
			}
			if (local83 > 0 && local88 < 127 && client.lb[local83 - 1][local88 + 1] == 0 && (local56[local78 - 1][local72 + 1] & 0x4E240000) == 0 && (local56[local78 - 1][local72] & 0x42240000) == 0 && (local56[local78][local72 + 1] & 0x48240000) == 0) {
				Static289.anIntArray386[local51] = local7 - 1;
				Static180.anIntArray299[local51] = local9 + 1;
				client.lb[local83 - 1][local88 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static152.anIntArrayArray23[local83 - 1][local88 + 1] = local246;
			}
			if (local83 < 127 && local88 < 127 && client.lb[local83 + 1][local88 + 1] == 0 && (local56[local78 + 1][local72 + 1] & 0x78240000) == 0 && (local56[local78 + 1][local72] & 0x60240000) == 0 && (local56[local78][local72 + 1] & 0x48240000) == 0) {
				Static289.anIntArray386[local51] = local7 + 1;
				Static180.anIntArray299[local51] = local9 + 1;
				client.lb[local83 + 1][local88 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static152.anIntArrayArray23[local83 + 1][local88 + 1] = local246;
			}
		}
		Static118.anInt3014 = local9;
		Static213.anInt1927 = local7;
		return false;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!me;Z)Z")
	public static boolean method3856(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static118.aClass77Array1 == Static137.aClass77Array2;
		@Pc(8) int local8 = 0;
		arg0.method5963();
		if (arg0.aShort93 < 0 || arg0.aShort91 < 0 || arg0.aShort92 >= Static328.anInt6717 || arg0.aShort90 >= Static200.anInt4590) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort93; local30 <= arg0.aShort92; local30++) {
			for (local34 = arg0.aShort91; local34 <= arg0.aShort90; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort93) {
					local37++;
				}
				if (local30 < arg0.aShort92) {
					local37 += 4;
				}
				if (local34 > arg0.aShort91) {
					local37 += 8;
				}
				if (local34 < arg0.aShort90) {
					local37 += 2;
				}
				Static91.method1998(arg0.aByte72, local30, local34);
				@Pc(71) Class154 local71 = Static241.aClass154ArrayArrayArray2[arg0.aByte72][local30][local34];
				@Pc(76) Class93 local76 = Static66.method1563(arg0, local37);
				@Pc(79) Class93 local79 = local71.aClass93_3;
				if (local79 == null) {
					local71.aClass93_3 = local76;
				} else {
					while (local79.aClass93_2 != null) {
						local79 = local79.aClass93_2;
					}
					local79.aClass93_2 = local76;
				}
				local71.aByte41 = (byte) (local71.aByte41 | local37);
				if (local6 && Static350.anIntArrayArray58[local30][local34] != 0) {
					local8 = Static350.anIntArrayArray58[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort93; local34 <= arg0.aShort92; local34++) {
				for (local37 = arg0.aShort91; local37 <= arg0.aShort90; local37++) {
					if (Static350.anIntArrayArray58[local34][local37] == 0) {
						Static350.anIntArrayArray58[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static283.aClass7_Sub1Array3[Static144.anInt3573++] = arg0;
		}
		return true;
	}
}
