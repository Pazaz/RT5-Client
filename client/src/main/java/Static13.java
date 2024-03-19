import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "Lclient!mb;")
	public static Class1_Sub22 aClass1_Sub22_3;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	public static int anInt6489;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray44 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "Lclient!gk;")
	public static Applet_Sub1 anApplet_Sub1_3 = null;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[8];

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "[I")
	public static final int[] anIntArray498 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
	public static Object method5491(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static67.aBoolean12) {
			try {
				@Pc(35) Class152 local35 = (Class152) Class.forName("Class152_Sub1").getDeclaredConstructor().newInstance();
				local35.method4434(arg0);
				return local35;
			} catch (@Pc(42) Throwable local42) {
				Static67.aBoolean12 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)Z")
	public static boolean method5497() {
		return Static130.anInt6754 == 0 ? Static109.aBoolean182 : true;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIIIIILclient!bi;)Z")
	public static boolean method5498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class22 arg10) {
		@Pc(14) int local14 = arg9;
		@Pc(16) int local16 = arg6;
		@Pc(24) int local24 = arg9 - 64;
		@Pc(29) int local29 = arg6 - 64;
		client.lb[64][64] = 99;
		Static152.anIntArrayArray23[64][64] = 0;
		@Pc(43) byte local43 = 0;
		@Pc(45) int local45 = 0;
		Static289.anIntArray386[0] = arg9;
		@Pc(52) int local52 = local43 + 1;
		Static180.anIntArray299[0] = arg6;
		@Pc(57) int[][] local57 = arg10.anIntArrayArray3;
		while (true) {
			label282: while (true) {
				@Pc(78) int local78;
				@Pc(83) int local83;
				@Pc(89) int local89;
				@Pc(94) int local94;
				@Pc(251) int local251;
				@Pc(293) int local293;
				do {
					do {
						do {
							label259: do {
								if (local45 == local52) {
									Static118.anInt3014 = local16;
									Static213.anInt1927 = local14;
									return false;
								}
								local16 = Static180.anIntArray299[local45];
								local14 = Static289.anIntArray386[local45];
								local45 = local45 + 1 & 0xFFF;
								local78 = local14 - local24;
								local83 = local16 - local29;
								local89 = local14 - arg10.anInt719;
								local94 = local16 - arg10.anInt729;
								if (arg5 == -4) {
									if (arg8 == local14 && arg3 == local16) {
										Static213.anInt1927 = local14;
										Static118.anInt3014 = local16;
										return true;
									}
								} else if (arg5 == -3) {
									if (Static224.method4550(local16, arg8, local14, arg0, arg1, arg1, arg2, arg3)) {
										Static118.anInt3014 = local16;
										Static213.anInt1927 = local14;
										return true;
									}
								} else if (arg5 == -2) {
									if (arg10.method515(arg8, arg1, arg7, local16, local14, arg2, arg3, arg0, arg1)) {
										Static213.anInt1927 = local14;
										Static118.anInt3014 = local16;
										return true;
									}
								} else if (arg5 == -1) {
									if (arg10.method511(local14, arg0, arg3, arg7, local16, arg1, arg2, arg8)) {
										Static118.anInt3014 = local16;
										Static213.anInt1927 = local14;
										return true;
									}
								} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
									if (arg10.method523(arg3, arg1, arg4, arg8, arg5, local14, local16)) {
										Static118.anInt3014 = local16;
										Static213.anInt1927 = local14;
										return true;
									}
								} else if (arg10.method521(local16, arg4, arg1, arg5, arg3, arg8, local14)) {
									Static213.anInt1927 = local14;
									Static118.anInt3014 = local16;
									return true;
								}
								local251 = Static152.anIntArrayArray23[local78][local83] + 1;
								if (local78 > 0 && client.lb[local78 - 1][local83] == 0 && (local57[local89 - 1][local94] & 0x43A40000) == 0 && (local57[local89 - 1][arg1 + local94 - 1] & 0x4E240000) == 0) {
									local293 = 1;
									while (true) {
										if (arg1 - 1 <= local293) {
											Static289.anIntArray386[local52] = local14 - 1;
											Static180.anIntArray299[local52] = local16;
											local52 = local52 + 1 & 0xFFF;
											client.lb[local78 - 1][local83] = 2;
											Static152.anIntArrayArray23[local78 - 1][local83] = local251;
											break;
										}
										if ((local57[local89 - 1][local94 + local293] & 0x4FA40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (128 - arg1 > local78 && client.lb[local78 + 1][local83] == 0 && (local57[arg1 + local89][local94] & 0x60E40000) == 0 && (local57[local89 + arg1][local94 + arg1 - 1] & 0x78240000) == 0) {
									local293 = 1;
									while (true) {
										if (local293 >= arg1 - 1) {
											Static289.anIntArray386[local52] = local14 + 1;
											Static180.anIntArray299[local52] = local16;
											client.lb[local78 + 1][local83] = 8;
											local52 = local52 + 1 & 0xFFF;
											Static152.anIntArrayArray23[local78 + 1][local83] = local251;
											break;
										}
										if ((local57[arg1 + local89][local293 + local94] & 0x78E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local83 > 0 && client.lb[local78][local83 - 1] == 0 && (local57[local89][local94 - 1] & 0x43A40000) == 0 && (local57[local89 + arg1 - 1][local94 - 1] & 0x60E40000) == 0) {
									local293 = 1;
									while (true) {
										if (local293 >= arg1 - 1) {
											Static289.anIntArray386[local52] = local14;
											Static180.anIntArray299[local52] = local16 - 1;
											client.lb[local78][local83 - 1] = 1;
											local52 = local52 + 1 & 0xFFF;
											Static152.anIntArrayArray23[local78][local83 - 1] = local251;
											break;
										}
										if ((local57[local293 + local89][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (128 - arg1 > local83 && client.lb[local78][local83 + 1] == 0 && (local57[local89][arg1 + local94] & 0x4E240000) == 0 && (local57[local89 + arg1 - 1][arg1 + local94] & 0x78240000) == 0) {
									local293 = 1;
									while (true) {
										if (local293 >= arg1 - 1) {
											Static289.anIntArray386[local52] = local14;
											Static180.anIntArray299[local52] = local16 + 1;
											client.lb[local78][local83 + 1] = 4;
											local52 = local52 + 1 & 0xFFF;
											Static152.anIntArrayArray23[local78][local83 + 1] = local251;
											break;
										}
										if ((local57[local89 + local293][local94 + arg1] & 0x7E240000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local78 > 0 && local83 > 0 && client.lb[local78 - 1][local83 - 1] == 0 && (local57[local89 - 1][local94 - 1] & 0x43A40000) == 0) {
									local293 = 1;
									while (true) {
										if (arg1 <= local293) {
											Static289.anIntArray386[local52] = local14 - 1;
											Static180.anIntArray299[local52] = local16 - 1;
											client.lb[local78 - 1][local83 - 1] = 3;
											local52 = local52 + 1 & 0xFFF;
											Static152.anIntArrayArray23[local78 - 1][local83 - 1] = local251;
											break;
										}
										if ((local57[local89 - 1][local293 + local94 - 1] & 0x4FA40000) != 0 || (local57[local293 + local89 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local78 < 128 - arg1 && local83 > 0 && client.lb[local78 + 1][local83 - 1] == 0 && (local57[arg1 + local89][local94 - 1] & 0x60E40000) == 0) {
									local293 = 1;
									while (true) {
										if (local293 >= arg1) {
											Static289.anIntArray386[local52] = local14 + 1;
											Static180.anIntArray299[local52] = local16 - 1;
											client.lb[local78 + 1][local83 - 1] = 9;
											local52 = local52 + 1 & 0xFFF;
											Static152.anIntArrayArray23[local78 + 1][local83 - 1] = local251;
											break;
										}
										if ((local57[local89 + arg1][local293 + local94 - 1] & 0x78E40000) != 0 || (local57[local89 + local293][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local78 > 0 && 128 - arg1 > local83 && client.lb[local78 - 1][local83 + 1] == 0 && (local57[local89 - 1][arg1 + local94] & 0x4E240000) == 0) {
									for (local293 = 1; local293 < arg1; local293++) {
										if ((local57[local89 - 1][local293 + local94] & 0x4FA40000) != 0 || (local57[local293 + local89 - 1][arg1 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static289.anIntArray386[local52] = local14 - 1;
									Static180.anIntArray299[local52] = local16 + 1;
									client.lb[local78 - 1][local83 + 1] = 6;
									local52 = local52 + 1 & 0xFFF;
									Static152.anIntArrayArray23[local78 - 1][local83 + 1] = local251;
								}
							} while (128 - arg1 <= local78);
						} while (local83 >= 128 - arg1);
					} while (client.lb[local78 + 1][local83 + 1] != 0);
				} while ((local57[arg1 + local89][local94 + arg1] & 0x78240000) != 0);
				for (local293 = 1; local293 < arg1; local293++) {
					if ((local57[local89 + local293][arg1 + local94] & 0x7E240000) != 0 || (local57[local89 + arg1][local293 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static289.anIntArray386[local52] = local14 + 1;
				Static180.anIntArray299[local52] = local16 + 1;
				client.lb[local78 + 1][local83 + 1] = 12;
				local52 = local52 + 1 & 0xFFF;
				Static152.anIntArrayArray23[local78 + 1][local83 + 1] = local251;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)V")
	public static void method5500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static199.method3942(arg0)) {
			Static89.method1964(Class1_Sub2_Sub10.lb[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
	public static void method5502() {
		for (@Pc(10) Class1_Sub1_Sub7 local10 = (Class1_Sub1_Sub7) Static66.aClass130_5.method3749(); local10 != null; local10 = (Class1_Sub1_Sub7) Static66.aClass130_5.method3756()) {
			@Pc(23) Class7_Sub1_Sub4 local23 = local10.aClass7_Sub1_Sub4_1;
			if (local23.aByte72 != Static39.anInt1215 || local23.aBoolean256) {
				local10.method6172();
				local23.method3185();
			} else if (Static197.anInt4521 >= local23.anInt3610) {
				local23.method3191(Static55.anInt1622);
				if (local23.aBoolean256) {
					local10.method6172();
				} else {
					Static195.method3856(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIIII)V")
	public static void method5506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg4; local7 <= arg0; local7++) {
			Static12.method349(arg2, Static87.anIntArrayArray9[local7], arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
	public static void method5508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 + arg1;
		@Pc(13) int local13 = arg2 - arg1;
		for (@Pc(15) int local15 = arg4; local15 < local9; local15++) {
			Static12.method349(arg5, Static87.anIntArrayArray9[local15], arg0, arg3);
		}
		@Pc(38) int local38 = arg5 - arg1;
		for (@Pc(40) int local40 = arg2; local40 > local13; local40--) {
			Static12.method349(arg5, Static87.anIntArrayArray9[local40], arg0, arg3);
		}
		@Pc(63) int local63 = arg3 + arg1;
		for (@Pc(65) int local65 = local9; local65 <= local13; local65++) {
			@Pc(71) int[] local71 = Static87.anIntArrayArray9[local65];
			Static12.method349(local63, local71, arg0, arg3);
			Static12.method349(arg5, local71, arg0, local38);
		}
	}
}
