import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!qk", name = "hb", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!qk", name = "jb", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(Z)V")
	public static void method4920() {
		for (@Pc(23) ParticleSystem local23 = (ParticleSystem) Static131.aClass36_4.method1415(); local23 != null; local23 = (ParticleSystem) Static131.aClass36_4.method1420()) {
			local23.method4350();
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
	public static void method4921() {
		Static254.aClass98_39.method2614();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!jg;ILclient!wm;Lclient!np;BI)Z")
	public static boolean method4923(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) TextureProvider arg1, @OriginalArg(3) MelType arg2) {
		@Pc(24) int local24 = Integer.MAX_VALUE;
		@Pc(26) int local26 = Integer.MIN_VALUE;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		if (arg2.anIntArray290 != null) {
			local24 = (MapList.anInt6051 - MapList.anInt6050) * (arg0.anInt2949 + arg2.anInt4434 - MapList.anInt6058) / (MapList.anInt6054 - MapList.anInt6058) + MapList.anInt6050;
			local30 = MapList.anInt6061 - (arg0.anInt2952 + arg2.anInt4432 - MapList.anInt6059) * (-MapList.anInt6053 + MapList.anInt6061) / (MapList.anInt6060 - MapList.anInt6059);
			local26 = MapList.anInt6050 + (arg2.anInt4419 + arg0.anInt2949 - MapList.anInt6058) * (-MapList.anInt6050 + MapList.anInt6051) / (MapList.anInt6054 - MapList.anInt6058);
			local28 = MapList.anInt6061 - (MapList.anInt6061 - MapList.anInt6053) * (-MapList.anInt6059 + arg0.anInt2952 + arg2.anInt4428) / (MapList.anInt6060 - MapList.anInt6059);
		}
		@Pc(123) Sprite local123 = null;
		@Pc(125) int local125 = 0;
		@Pc(127) int local127 = 0;
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		if (arg2.anInt4420 != -1) {
			if (arg0.aBoolean207 && arg2.anInt4438 != -1) {
				local123 = arg2.method4189(arg1, true);
			} else {
				local123 = arg2.method4189(arg1, false);
			}
			if (local123 != null) {
				local125 = arg0.anInt2948 - (local123.method6399() + 1 >> 1);
				local127 = arg0.anInt2948 + (local123.method6399() + 1 >> 1);
				if (local125 < local24) {
					local24 = local125;
				}
				local129 = arg0.anInt2944 - (local123.method6384() + 1 >> 1);
				if (local127 > local26) {
					local26 = local127;
				}
				if (local28 > local129) {
					local28 = local129;
				}
				local131 = arg0.anInt2944 + (local123.method6384() + 1 >> 1);
				if (local131 > local30) {
					local30 = local131;
				}
			}
		}
		@Pc(232) Class113 local232 = null;
		@Pc(234) int local234 = 0;
		@Pc(236) int local236 = 0;
		@Pc(238) int local238 = 0;
		@Pc(240) int local240 = 0;
		@Pc(242) int local242 = 0;
		@Pc(244) int local244 = 0;
		@Pc(246) int local246 = 0;
		@Pc(296) int local296;
		@Pc(323) int local323;
		if (arg2.aString48 != null) {
			local232 = Static212.method3729(arg2.anInt4418);
			if (local232 != null) {
				local234 = Static52.aClass239_1.method6119(Static287.aStringArray52, arg2.aString48, null, null);
				local236 = arg0.anInt2944;
				if (local123 == null) {
					local236 -= local234 * local232.method2947() / 2;
				} else {
					local236 -= (local123.method6384() >> 1) + (local234 * local232.method2948());
				}
				for (local296 = 0; local296 < local234; local296++) {
					@Pc(302) String local302 = Static287.aStringArray52[local296];
					if (local296 < local234 - 1) {
						local302 = local302.substring(0, local302.length() - 4);
					}
					local323 = local232.method2950(local302);
					if (local238 < local323) {
						local238 = local323;
					}
				}
				local240 = arg0.anInt2948 - local238 / 2;
				local242 = local238 / 2 + arg0.anInt2948;
				if (local24 > local240) {
					local24 = local240;
				}
				if (local26 < local242) {
					local26 = local242;
				}
				local244 = local236;
				if (local244 < local28) {
					local28 = local244;
				}
				local246 = local236 + local232.method2948() * local234;
				if (local30 < local246) {
					local30 = local246;
				}
			}
		}
		if (MapList.anInt6050 > local26 || MapList.anInt6051 < local24 || local30 < MapList.anInt6053 || local28 > MapList.anInt6061) {
			return true;
		}
		@Pc(439) int local439;
		if (arg2.anIntArray290 != null) {
			@Pc(437) int[] local437 = new int[arg2.anIntArray290.length];
			for (local439 = 0; local439 < local437.length / 2; local439++) {
				local323 = arg2.anIntArray290[local439 * 2] + arg0.anInt2949;
				@Pc(464) int local464 = arg2.anIntArray290[local439 * 2 + 1] + arg0.anInt2952;
				local437[local439 * 2] = (local323 - MapList.anInt6058) * (MapList.anInt6051 + -MapList.anInt6050) / (MapList.anInt6054 - MapList.anInt6058) + MapList.anInt6050;
				local437[local439 * 2 + 1] = MapList.anInt6061 - (local464 - MapList.anInt6059) * (MapList.anInt6061 + -MapList.anInt6053) / (MapList.anInt6060 - MapList.anInt6059);
			}
			Static293.method5046(arg1, local437, arg2.anInt4414);
			for (local323 = 0; local323 < local437.length / 2 - 1; local323++) {
				arg1.method2844(local437[local323 * 2 + 1], local437[local323 * 2 + 2], local437[local323 * 2], arg2.anInt4422, local437[local323 * 2 + 3]);
			}
			arg1.method2844(local437[local437.length - 1], local437[0], local437[local437.length - 2], arg2.anInt4422, local437[1]);
		}
		if (local123 != null) {
			if (Static243.anInt4495 > 0 && (Static225.anInt3979 != -1 && Static225.anInt3979 == arg0.anInt2947 || Static236.anInt4301 != -1 && Static236.anInt4301 == arg2.anInt4424)) {
				if (Static90.anInt6637 <= 50) {
					local296 = Static90.anInt6637 * 2;
				} else {
					local296 = (100 - Static90.anInt6637) * 2;
				}
				local439 = local296 << 24 | 0xFFFF00;
				arg1.method2861(arg0.anInt2948, local123.method6389() / 2 + 7, local439, arg0.anInt2944);
				arg1.method2861(arg0.anInt2948, local123.method6389() / 2 + 5, local439, arg0.anInt2944);
				arg1.method2861(arg0.anInt2948, local123.method6389() / 2 + 3, local439, arg0.anInt2944);
				arg1.method2861(arg0.anInt2948, local123.method6389() / 2 + 1, local439, arg0.anInt2944);
				arg1.method2861(arg0.anInt2948, local123.method6389() / 2, local439, arg0.anInt2944);
			}
			local123.method6385(arg0.anInt2948 - (local123.method6399() >> 1), arg0.anInt2944 + -(local123.method6384() >> 1));
		}
		if (arg2.aString48 != null && local232 != null) {
			Static212.method3727(local238, local234, local236, local232, arg1, arg0, arg2);
		}
		if (arg2.anInt4420 != -1 || arg2.aString48 != null) {
			@Pc(760) Class2_Sub15 local760 = new Class2_Sub15(arg0);
			local760.anInt2343 = local246;
			local760.anInt2334 = local244;
			local760.anInt2335 = local240;
			local760.anInt2336 = local131;
			local760.anInt2338 = local125;
			local760.anInt2340 = local127;
			local760.anInt2342 = local242;
			local760.anInt2341 = local129;
			Static197.aClass135_24.addTail(local760);
		}
		return false;
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(IZI)V")
	public static void method4925(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub41 local10 = Static374.method6275(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray489.length; local15++) {
				local10.anIntArray489[local15] = -1;
				local10.anIntArray488[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIBIILclient!dg;IIII)Z")
	public static boolean method4927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class46 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg10;
		@Pc(9) int local9 = arg9;
		@Pc(17) int local17 = arg10 - 64;
		@Pc(22) int local22 = arg9 - 64;
		Static301.anIntArrayArray49[64][64] = 99;
		Static13.anIntArrayArray4[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static47.anIntArray90[0] = arg10;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static257.anIntArray257[0] = arg9;
		@Pc(50) int[][] local50 = arg6.anIntArrayArray14;
		while (true) {
			label282: while (true) {
				@Pc(79) int local79;
				@Pc(74) int local74;
				@Pc(84) int local84;
				@Pc(90) int local90;
				@Pc(237) int local237;
				@Pc(274) int local274;
				do {
					do {
						do {
							label259: do {
								if (local45 == local42) {
									Static184.anInt3435 = local7;
									Static182.anInt3422 = local9;
									return false;
								}
								local7 = Static47.anIntArray90[local42];
								local9 = Static257.anIntArray257[local42];
								local42 = local42 + 1 & 0xFFF;
								local74 = local9 - local22;
								local79 = local7 - local17;
								local84 = local7 - arg6.anInt1468;
								local90 = local9 - arg6.anInt1484;
								if (arg0 == -4) {
									if (local7 == arg5 && local9 == arg4) {
										Static184.anInt3435 = local7;
										Static182.anInt3422 = local9;
										return true;
									}
								} else if (arg0 == -3) {
									if (Static24.method856(arg7, local9, arg4, local7, arg5, arg1, arg8, arg1)) {
										Static184.anInt3435 = local7;
										Static182.anInt3422 = local9;
										return true;
									}
								} else if (arg0 == -2) {
									if (arg6.method1637(arg7, local7, arg4, arg1, arg2, arg5, local9, arg1, arg8)) {
										Static184.anInt3435 = local7;
										Static182.anInt3422 = local9;
										return true;
									}
								} else if (arg0 == -1) {
									if (arg6.method1640(arg2, arg5, arg7, local7, arg4, arg8, local9, arg1)) {
										Static182.anInt3422 = local9;
										Static184.anInt3435 = local7;
										return true;
									}
								} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
									if (arg6.method1629(arg1, arg5, arg0, arg4, arg3, local9, local7)) {
										Static184.anInt3435 = local7;
										Static182.anInt3422 = local9;
										return true;
									}
								} else if (arg6.method1630(arg3, arg1, local9, local7, arg0, arg4, arg5)) {
									Static184.anInt3435 = local7;
									Static182.anInt3422 = local9;
									return true;
								}
								local237 = Static13.anIntArrayArray4[local79][local74] + 1;
								if (local79 > 0 && Static301.anIntArrayArray49[local79 - 1][local74] == 0 && (local50[local84 - 1][local90] & 0x43A40000) == 0 && (local50[local84 - 1][local90 + arg1 - 1] & 0x4E240000) == 0) {
									local274 = 1;
									while (true) {
										if (arg1 - 1 <= local274) {
											Static47.anIntArray90[local45] = local7 - 1;
											Static257.anIntArray257[local45] = local9;
											local45 = local45 + 1 & 0xFFF;
											Static301.anIntArrayArray49[local79 - 1][local74] = 2;
											Static13.anIntArrayArray4[local79 - 1][local74] = local237;
											break;
										}
										if ((local50[local84 - 1][local90 + local274] & 0x4FA40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local79 < 128 - arg1 && Static301.anIntArrayArray49[local79 + 1][local74] == 0 && (local50[arg1 + local84][local90] & 0x60E40000) == 0 && (local50[local84 + arg1][local90 + arg1 - 1] & 0x78240000) == 0) {
									local274 = 1;
									while (true) {
										if (local274 >= arg1 - 1) {
											Static47.anIntArray90[local45] = local7 + 1;
											Static257.anIntArray257[local45] = local9;
											Static301.anIntArrayArray49[local79 + 1][local74] = 8;
											local45 = local45 + 1 & 0xFFF;
											Static13.anIntArrayArray4[local79 + 1][local74] = local237;
											break;
										}
										if ((local50[local84 + arg1][local90 + local274] & 0x78E40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local74 > 0 && Static301.anIntArrayArray49[local79][local74 - 1] == 0 && (local50[local84][local90 - 1] & 0x43A40000) == 0 && (local50[local84 + arg1 - 1][local90 - 1] & 0x60E40000) == 0) {
									local274 = 1;
									while (true) {
										if (arg1 - 1 <= local274) {
											Static47.anIntArray90[local45] = local7;
											Static257.anIntArray257[local45] = local9 - 1;
											local45 = local45 + 1 & 0xFFF;
											Static301.anIntArrayArray49[local79][local74 - 1] = 1;
											Static13.anIntArrayArray4[local79][local74 - 1] = local237;
											break;
										}
										if ((local50[local84 + local274][local90 - 1] & 0x63E40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local74 < 128 - arg1 && Static301.anIntArrayArray49[local79][local74 + 1] == 0 && (local50[local84][local90 + arg1] & 0x4E240000) == 0 && (local50[local84 + arg1 - 1][arg1 + local90] & 0x78240000) == 0) {
									local274 = 1;
									while (true) {
										if (arg1 - 1 <= local274) {
											Static47.anIntArray90[local45] = local7;
											Static257.anIntArray257[local45] = local9 + 1;
											Static301.anIntArrayArray49[local79][local74 + 1] = 4;
											local45 = local45 + 1 & 0xFFF;
											Static13.anIntArrayArray4[local79][local74 + 1] = local237;
											break;
										}
										if ((local50[local274 + local84][local90 + arg1] & 0x7E240000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local79 > 0 && local74 > 0 && Static301.anIntArrayArray49[local79 - 1][local74 - 1] == 0 && (local50[local84 - 1][local90 - 1] & 0x43A40000) == 0) {
									local274 = 1;
									while (true) {
										if (arg1 <= local274) {
											Static47.anIntArray90[local45] = local7 - 1;
											Static257.anIntArray257[local45] = local9 - 1;
											Static301.anIntArrayArray49[local79 - 1][local74 - 1] = 3;
											local45 = local45 + 1 & 0xFFF;
											Static13.anIntArrayArray4[local79 - 1][local74 - 1] = local237;
											break;
										}
										if ((local50[local84 - 1][local90 + local274 - 1] & 0x4FA40000) != 0 || (local50[local274 + local84 - 1][local90 - 1] & 0x63E40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (128 - arg1 > local79 && local74 > 0 && Static301.anIntArrayArray49[local79 + 1][local74 - 1] == 0 && (local50[arg1 + local84][local90 - 1] & 0x60E40000) == 0) {
									local274 = 1;
									while (true) {
										if (local274 >= arg1) {
											Static47.anIntArray90[local45] = local7 + 1;
											Static257.anIntArray257[local45] = local9 - 1;
											Static301.anIntArrayArray49[local79 + 1][local74 - 1] = 9;
											local45 = local45 + 1 & 0xFFF;
											Static13.anIntArrayArray4[local79 + 1][local74 - 1] = local237;
											break;
										}
										if ((local50[arg1 + local84][local274 + local90 - 1] & 0x78E40000) != 0 || (local50[local84 + local274][local90 - 1] & 0x63E40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local79 > 0 && local74 < 128 - arg1 && Static301.anIntArrayArray49[local79 - 1][local74 + 1] == 0 && (local50[local84 - 1][arg1 + local90] & 0x4E240000) == 0) {
									for (local274 = 1; local274 < arg1; local274++) {
										if ((local50[local84 - 1][local90 + local274] & 0x4FA40000) != 0 || (local50[local84 + local274 - 1][local90 + arg1] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static47.anIntArray90[local45] = local7 - 1;
									Static257.anIntArray257[local45] = local9 + 1;
									local45 = local45 + 1 & 0xFFF;
									Static301.anIntArrayArray49[local79 - 1][local74 + 1] = 6;
									Static13.anIntArrayArray4[local79 - 1][local74 + 1] = local237;
								}
							} while (128 - arg1 <= local79);
						} while (local74 >= 128 - arg1);
					} while (Static301.anIntArrayArray49[local79 + 1][local74 + 1] != 0);
				} while ((local50[arg1 + local84][arg1 + local90] & 0x78240000) != 0);
				for (local274 = 1; local274 < arg1; local274++) {
					if ((local50[local274 + local84][arg1 + local90] & 0x7E240000) != 0 || (local50[local84 + arg1][local90 + local274] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static47.anIntArray90[local45] = local7 + 1;
				Static257.anIntArray257[local45] = local9 + 1;
				Static301.anIntArrayArray49[local79 + 1][local74 + 1] = 12;
				local45 = local45 + 1 & 0xFFF;
				Static13.anIntArrayArray4[local79 + 1][local74 + 1] = local237;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!bt;I)Lclient!jq;")
	public static TextureOp method4928(@OriginalArg(0) Buffer arg0) {
		arg0.g1();
		@Pc(13) int local13 = arg0.g1();
		@Pc(17) TextureOp local17 = Texture.create(local13);
		local17.anInt7251 = arg0.g1();
		@Pc(26) int local26 = arg0.g1();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.g1();
			local17.decode(local34, arg0);
		}
		local17.postDecode();
		return local17;
	}
}
