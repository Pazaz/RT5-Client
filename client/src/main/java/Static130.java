import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!il", name = "O", descriptor = "I")
	public static int anInt6778;

	@OriginalMember(owner = "client!il", name = "pb", descriptor = "I")
	public static int anInt6803;

	@OriginalMember(owner = "client!il", name = "q", descriptor = "I")
	public static int anInt6754 = 0;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIZIII)V")
	public static void method5724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg4;
		@Pc(15) int local15 = arg1 - arg0;
		if (local15 == 0) {
			if (local10 != 0) {
				Static49.method1352(arg2, arg0, arg4, arg3);
			}
		} else if (local10 == 0) {
			Static272.method4898(arg0, arg4, arg1, arg3);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(64) boolean local64 = local15 < local10;
			@Pc(68) int local68;
			@Pc(70) int local70;
			if (local64) {
				local68 = arg0;
				local70 = arg1;
				arg0 = arg4;
				arg4 = local68;
				arg1 = arg2;
				arg2 = local70;
			}
			if (arg1 < arg0) {
				local68 = arg0;
				local70 = arg4;
				arg0 = arg1;
				arg4 = arg2;
				arg1 = local68;
				arg2 = local70;
			}
			local68 = arg4;
			local70 = arg1 - arg0;
			@Pc(105) int local105 = arg2 - arg4;
			@Pc(110) int local110 = -(local70 >> 1);
			@Pc(121) int local121 = arg2 <= arg4 ? -1 : 1;
			if (local105 < 0) {
				local105 = -local105;
			}
			@Pc(133) int local133;
			if (local64) {
				for (local133 = arg0; local133 <= arg1; local133++) {
					Static87.anIntArrayArray9[local133][local68] = arg3;
					local110 += local105;
					if (local110 > 0) {
						local68 += local121;
						local110 -= local70;
					}
				}
			} else {
				for (local133 = arg0; local133 <= arg1; local133++) {
					Static87.anIntArrayArray9[local68][local133] = arg3;
					local110 += local105;
					if (local110 > 0) {
						local110 -= local70;
						local68 += local121;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5742(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + Static57.method4845(arg0.charAt(local17)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class1_Sub4 local7 = null;
		for (@Pc(12) Class1_Sub4 local12 = (Class1_Sub4) Static12.aClass130_1.method3749(); local12 != null; local12 = (Class1_Sub4) Static12.aClass130_1.method3756()) {
			if (local12.anInt534 == arg7 && arg1 == local12.anInt526 && arg4 == local12.anInt519 && local12.anInt532 == arg3) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub4();
			local7.anInt534 = arg7;
			local7.anInt526 = arg1;
			local7.anInt532 = arg3;
			local7.anInt519 = arg4;
			Static256.method4723(local7);
			Static12.aClass130_1.method3760(local7);
		}
		local7.anInt521 = arg0;
		local7.anInt523 = arg2;
		local7.anInt528 = arg8;
		local7.anInt530 = arg6;
		local7.anInt533 = arg5;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!bi;IIIIIIIII)Z")
	public static boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg4;
		@Pc(17) int local17 = arg3 - 64;
		client.lb[64][64] = 99;
		@Pc(28) int local28 = arg4 - 64;
		Static152.anIntArrayArray23[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static289.anIntArray386[0] = arg3;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static180.anIntArray299[0] = arg4;
		@Pc(50) int[][] local50 = arg1.anIntArrayArray3;
		while (local42 != local45) {
			local7 = Static289.anIntArray386[local42];
			local9 = Static180.anIntArray299[local42];
			@Pc(65) int local65 = local7 - local17;
			local42 = local42 + 1 & 0xFFF;
			@Pc(76) int local76 = local9 - local28;
			@Pc(82) int local82 = local7 - arg1.anInt719;
			@Pc(88) int local88 = local9 - arg1.anInt729;
			if (arg2 == -4) {
				if (local7 == arg0 && local9 == arg8) {
					Static213.anInt1927 = local7;
					Static118.anInt3014 = local9;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static224.method4550(local9, arg0, local7, arg7, 2, 2, arg6, arg8)) {
					Static213.anInt1927 = local7;
					Static118.anInt3014 = local9;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg1.method515(arg0, 2, arg5, local9, local7, arg6, arg8, arg7, 2)) {
					Static118.anInt3014 = local9;
					Static213.anInt1927 = local7;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg1.method511(local7, arg7, arg8, arg5, local9, 2, arg6, arg0)) {
					Static118.anInt3014 = local9;
					Static213.anInt1927 = local7;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg1.method523(arg8, 2, arg9, arg0, arg2, local7, local9)) {
					Static213.anInt1927 = local7;
					Static118.anInt3014 = local9;
					return true;
				}
			} else if (arg1.method521(local9, arg9, 2, arg2, arg8, arg0, local7)) {
				Static213.anInt1927 = local7;
				Static118.anInt3014 = local9;
				return true;
			}
			@Pc(241) int local241 = Static152.anIntArrayArray23[local65][local76] + 1;
			if (local65 > 0 && client.lb[local65 - 1][local76] == 0 && (local50[local82 - 1][local88] & 0x43A40000) == 0 && (local50[local82 - 1][local88 + 1] & 0x4E240000) == 0) {
				Static289.anIntArray386[local45] = local7 - 1;
				Static180.anIntArray299[local45] = local9;
				client.lb[local65 - 1][local76] = 2;
				local45 = local45 + 1 & 0xFFF;
				Static152.anIntArrayArray23[local65 - 1][local76] = local241;
			}
			if (local65 < 126 && client.lb[local65 + 1][local76] == 0 && (local50[local82 + 2][local88] & 0x60E40000) == 0 && (local50[local82 + 2][local88 + 1] & 0x78240000) == 0) {
				Static289.anIntArray386[local45] = local7 + 1;
				Static180.anIntArray299[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				client.lb[local65 + 1][local76] = 8;
				Static152.anIntArrayArray23[local65 + 1][local76] = local241;
			}
			if (local76 > 0 && client.lb[local65][local76 - 1] == 0 && (local50[local82][local88 - 1] & 0x43A40000) == 0 && (local50[local82 + 1][local88 - 1] & 0x60E40000) == 0) {
				Static289.anIntArray386[local45] = local7;
				Static180.anIntArray299[local45] = local9 - 1;
				client.lb[local65][local76 - 1] = 1;
				local45 = local45 + 1 & 0xFFF;
				Static152.anIntArrayArray23[local65][local76 - 1] = local241;
			}
			if (local76 < 126 && client.lb[local65][local76 + 1] == 0 && (local50[local82][local88 + 2] & 0x4E240000) == 0 && (local50[local82 + 1][local88 + 2] & 0x78240000) == 0) {
				Static289.anIntArray386[local45] = local7;
				Static180.anIntArray299[local45] = local9 + 1;
				client.lb[local65][local76 + 1] = 4;
				local45 = local45 + 1 & 0xFFF;
				Static152.anIntArrayArray23[local65][local76 + 1] = local241;
			}
			if (local65 > 0 && local76 > 0 && client.lb[local65 - 1][local76 - 1] == 0 && (local50[local82 - 1][local88] & 0x4FA40000) == 0 && (local50[local82 - 1][local88 - 1] & 0x43A40000) == 0 && (local50[local82][local88 - 1] & 0x63E40000) == 0) {
				Static289.anIntArray386[local45] = local7 - 1;
				Static180.anIntArray299[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				client.lb[local65 - 1][local76 - 1] = 3;
				Static152.anIntArrayArray23[local65 - 1][local76 - 1] = local241;
			}
			if (local65 < 126 && local76 > 0 && client.lb[local65 + 1][local76 - 1] == 0 && (local50[local82 + 1][local88 - 1] & 0x63E40000) == 0 && (local50[local82 + 2][local88 - 1] & 0x60E40000) == 0 && (local50[local82 + 2][local88] & 0x78E40000) == 0) {
				Static289.anIntArray386[local45] = local7 + 1;
				Static180.anIntArray299[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				client.lb[local65 + 1][local76 - 1] = 9;
				Static152.anIntArrayArray23[local65 + 1][local76 - 1] = local241;
			}
			if (local65 > 0 && local76 < 126 && client.lb[local65 - 1][local76 + 1] == 0 && (local50[local82 - 1][local88 + 1] & 0x4FA40000) == 0 && (local50[local82 - 1][local88 + 2] & 0x4E240000) == 0 && (local50[local82][local88 + 2] & 0x7E240000) == 0) {
				Static289.anIntArray386[local45] = local7 - 1;
				Static180.anIntArray299[local45] = local9 + 1;
				client.lb[local65 - 1][local76 + 1] = 6;
				local45 = local45 + 1 & 0xFFF;
				Static152.anIntArrayArray23[local65 - 1][local76 + 1] = local241;
			}
			if (local65 < 126 && local76 < 126 && client.lb[local65 + 1][local76 + 1] == 0 && (local50[local82 + 1][local88 + 2] & 0x7E240000) == 0 && (local50[local82 + 2][local88 + 2] & 0x78240000) == 0 && (local50[local82 + 2][local88 + 1] & 0x78E40000) == 0) {
				Static289.anIntArray386[local45] = local7 + 1;
				Static180.anIntArray299[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				client.lb[local65 + 1][local76 + 1] = 12;
				Static152.anIntArrayArray23[local65 + 1][local76 + 1] = local241;
			}
		}
		Static118.anInt3014 = local9;
		Static213.anInt1927 = local7;
		return false;
	}
}
