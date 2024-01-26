import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!mt", name = "O", descriptor = "Lclient!sb;")
	public static Class330 aClass330_85;

	@OriginalMember(owner = "client!mt", name = "P", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!mt", name = "L", descriptor = "[Lclient!eka;")
	public static Class104[] aClass104Array1 = new Class104[50];

	@OriginalMember(owner = "client!mt", name = "N", descriptor = "[I")
	public static final int[] anIntArray494 = new int[2048];

	@OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
	public static int anInt6318 = -1;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!cm;Lclient!cm;)V")
	public static void method5654(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg1.aClass2_Sub2_67 != null) {
			arg1.method9260();
		}
		arg1.aClass2_Sub2_66 = arg0.aClass2_Sub2_66;
		arg1.aClass2_Sub2_67 = arg0;
		arg1.aClass2_Sub2_67.aClass2_Sub2_66 = arg1;
		arg1.aClass2_Sub2_66.aClass2_Sub2_67 = arg1;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II[[[Lclient!pha;IIZ)Z")
	public static boolean method5656(@OriginalArg(1) int arg0, @OriginalArg(2) Class291[][][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(21) byte local21 = arg4 ? 1 : (byte) (Static198.anInt3276 & 0xFF);
		if (Static328.aByteArrayArrayArray4[Static394.anInt6176][arg3][arg0] == local21) {
			return false;
		} else if ((Static280.aByteArrayArrayArray3[Static394.anInt6176][arg3][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(52) byte local52 = 0;
			Static278.anIntArray351[0] = arg3;
			@Pc(58) int local58 = 0;
			@Pc(61) int local61 = local52 + 1;
			Static98.anIntArray176[0] = arg0;
			Static328.aByteArrayArrayArray4[Static394.anInt6176][arg3][arg0] = local21;
			while (local58 != local61) {
				@Pc(78) int local78 = Static278.anIntArray351[local58] & 0xFFFF;
				@Pc(86) int local86 = Static278.anIntArray351[local58] >> 16 & 0xFF;
				@Pc(94) int local94 = Static278.anIntArray351[local58] >> 24 & 0xFF;
				@Pc(100) int local100 = Static98.anIntArray176[local58] & 0xFFFF;
				@Pc(108) int local108 = Static98.anIntArray176[local58] >> 16 & 0xFF;
				local58 = local58 + 1 & 0xFFF;
				@Pc(116) boolean local116 = false;
				if ((Static280.aByteArrayArrayArray3[Static394.anInt6176][local78][local100] & 0x4) == 0) {
					local116 = true;
				}
				@Pc(133) boolean local133 = false;
				@Pc(139) int local139;
				@Pc(185) int local185;
				@Pc(235) int local235;
				if (arg1 != null) {
					label237: for (local139 = Static394.anInt6176 + 1; local139 <= 3; local139++) {
						if (arg1[local139] != null && (Static280.aByteArrayArrayArray3[local139][local78][local100] & 0x8) == 0) {
							@Pc(341) Class8_Sub2_Sub1 local341;
							@Pc(351) int local351;
							@Pc(331) Class291 local331;
							@Pc(337) Class286 local337;
							if (local116 && arg1[local139][local78][local100] != null) {
								if (arg1[local139][local78][local100].aClass8_Sub2_Sub3_2 != null) {
									local185 = Static239.method3474(local86);
									if (arg1[local139][local78][local100].aClass8_Sub2_Sub3_2.aShort58 == local185 || arg1[local139][local78][local100].aClass8_Sub2_Sub3_1 != null && local185 == arg1[local139][local78][local100].aClass8_Sub2_Sub3_1.aShort58) {
										continue;
									}
									if (local94 != 0) {
										local235 = Static239.method3474(local94);
										if (arg1[local139][local78][local100].aClass8_Sub2_Sub3_2.aShort58 == local235 || arg1[local139][local78][local100].aClass8_Sub2_Sub3_1 != null && local235 == arg1[local139][local78][local100].aClass8_Sub2_Sub3_1.aShort58) {
											continue;
										}
									}
									if (local108 != 0) {
										local235 = Static239.method3474(local108);
										if (arg1[local139][local78][local100].aClass8_Sub2_Sub3_2.aShort58 == local235 || arg1[local139][local78][local100].aClass8_Sub2_Sub3_1 != null && arg1[local139][local78][local100].aClass8_Sub2_Sub3_1.aShort58 == local235) {
											continue;
										}
									}
								}
								local331 = arg1[local139][local78][local100];
								if (local331.aClass286_2 != null) {
									for (local337 = local331.aClass286_2; local337 != null; local337 = local337.aClass286_1) {
										local341 = local337.aClass8_Sub2_Sub1_1;
										if (local341 instanceof Interface25) {
											@Pc(347) Interface25 local347 = (Interface25) local341;
											local351 = local347.method6858();
											@Pc(355) int local355 = local347.method6855(23796);
											if (local351 == 21) {
												local351 = 19;
											}
											@Pc(368) int local368 = local351 | local355 << 6;
											if (local368 == local86 || local94 != 0 && local94 == local368 || local108 != 0 && local368 == local108) {
												continue label237;
											}
										}
									}
								}
							}
							local331 = arg1[local139][local78][local100];
							if (local331 != null && local331.aClass286_2 != null) {
								for (local337 = local331.aClass286_2; local337 != null; local337 = local337.aClass286_1) {
									local341 = local337.aClass8_Sub2_Sub1_1;
									if (local341.aShort134 != local341.aShort131 || local341.aShort132 != local341.aShort133) {
										for (@Pc(444) int local444 = local341.aShort131; local444 <= local341.aShort134; local444++) {
											for (local351 = local341.aShort132; local351 <= local341.aShort133; local351++) {
												Static328.aByteArrayArrayArray4[local139][local444][local351] = local21;
											}
										}
									}
								}
							}
							Static328.aByteArrayArrayArray4[local139][local78][local100] = local21;
							local133 = true;
						}
					}
				}
				if (local133) {
					local139 = Static246.aClass178Array1[Static394.anInt6176 + 1].method7869(local100, local78);
					if (Static482.anIntArray588[arg2] < local139) {
						Static482.anIntArray588[arg2] = local139;
					}
					local185 = local78 << 9;
					local235 = local100 << 9;
					if (Static9.anIntArray18[arg2] > local185) {
						Static9.anIntArray18[arg2] = local185;
					} else if (Static457.anIntArray552[arg2] < local185) {
						Static457.anIntArray552[arg2] = local185;
					}
					if (local235 < Static682.anIntArray817[arg2]) {
						Static682.anIntArray817[arg2] = local235;
					} else if (local235 > Static153.anIntArray235[arg2]) {
						Static153.anIntArray235[arg2] = local235;
					}
				}
				if (!local116) {
					if (local78 >= 1 && local21 != Static328.aByteArrayArrayArray4[Static394.anInt6176][local78 - 1][local100]) {
						Static278.anIntArray351[local61] = 0xD3000000 | 0x120000 | local78 - 1;
						Static98.anIntArray176[local61] = local100 | 0x130000;
						Static328.aByteArrayArrayArray4[Static394.anInt6176][local78 - 1][local100] = local21;
						local61 = local61 + 1 & 0xFFF;
					}
					local100++;
					if (local100 < Static501.anInt7568) {
						if (local78 - 1 >= 0 && local21 != Static328.aByteArrayArrayArray4[Static394.anInt6176][local78 - 1][local100] && (Static280.aByteArrayArrayArray3[Static394.anInt6176][local78][local100] & 0x4) == 0 && (Static280.aByteArrayArrayArray3[Static394.anInt6176][local78 - 1][local100 - 1] & 0x4) == 0) {
							Static278.anIntArray351[local61] = local78 - 1 | 0x120000 | 0x52000000;
							Static98.anIntArray176[local61] = local100 | 0x130000;
							local61 = local61 + 1 & 0xFFF;
							Static328.aByteArrayArrayArray4[Static394.anInt6176][local78 - 1][local100] = local21;
						}
						if (local21 != Static328.aByteArrayArrayArray4[Static394.anInt6176][local78][local100]) {
							Static278.anIntArray351[local61] = 0x13000000 | 0x520000 | local78;
							Static98.anIntArray176[local61] = local100 | 0x530000;
							Static328.aByteArrayArrayArray4[Static394.anInt6176][local78][local100] = local21;
							local61 = local61 + 1 & 0xFFF;
						}
						if (Static720.anInt10859 > local78 + 1 && local21 != Static328.aByteArrayArrayArray4[Static394.anInt6176][local78 + 1][local100] && (Static280.aByteArrayArrayArray3[Static394.anInt6176][local78][local100] & 0x4) == 0 && (Static280.aByteArrayArrayArray3[Static394.anInt6176][local78 + 1][local100 - 1] & 0x4) == 0) {
							Static278.anIntArray351[local61] = 0x92000000 | 0x520000 | local78 + 1;
							Static98.anIntArray176[local61] = local100 | 0x530000;
							Static328.aByteArrayArrayArray4[Static394.anInt6176][local78 + 1][local100] = local21;
							local61 = local61 + 1 & 0xFFF;
						}
					}
					local100--;
					if (local78 + 1 < Static720.anInt10859 && Static328.aByteArrayArrayArray4[Static394.anInt6176][local78 + 1][local100] != local21) {
						Static278.anIntArray351[local61] = local78 + 1 | 0x920000 | 0x53000000;
						Static98.anIntArray176[local61] = local100 | 0x930000;
						Static328.aByteArrayArrayArray4[Static394.anInt6176][local78 + 1][local100] = local21;
						local61 = local61 + 1 & 0xFFF;
					}
					local100--;
					if (local100 >= 0) {
						if (local78 - 1 >= 0 && Static328.aByteArrayArrayArray4[Static394.anInt6176][local78 - 1][local100] != local21 && (Static280.aByteArrayArrayArray3[Static394.anInt6176][local78][local100] & 0x4) == 0 && (Static280.aByteArrayArrayArray3[Static394.anInt6176][local78 - 1][local100 + 1] & 0x4) == 0) {
							Static278.anIntArray351[local61] = local78 - 1 | 0xD20000 | 0x12000000;
							Static98.anIntArray176[local61] = local100 | 0xD30000;
							local61 = local61 + 1 & 0xFFF;
							Static328.aByteArrayArrayArray4[Static394.anInt6176][local78 - 1][local100] = local21;
						}
						if (Static328.aByteArrayArrayArray4[Static394.anInt6176][local78][local100] != local21) {
							Static278.anIntArray351[local61] = 0x93000000 | 0xD20000 | local78;
							Static98.anIntArray176[local61] = local100 | 0xD30000;
							Static328.aByteArrayArrayArray4[Static394.anInt6176][local78][local100] = local21;
							local61 = local61 + 1 & 0xFFF;
						}
						if (local78 + 1 < Static720.anInt10859 && Static328.aByteArrayArrayArray4[Static394.anInt6176][local78 + 1][local100] != local21 && (Static280.aByteArrayArrayArray3[Static394.anInt6176][local78][local100] & 0x4) == 0 && (Static280.aByteArrayArrayArray3[Static394.anInt6176][local78 + 1][local100 + 1] & 0x4) == 0) {
							Static278.anIntArray351[local61] = local78 + 1 | 0x920000 | 0xD2000000;
							Static98.anIntArray176[local61] = local100 | 0x930000;
							Static328.aByteArrayArrayArray4[Static394.anInt6176][local78 + 1][local100] = local21;
							local61 = local61 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static482.anIntArray588[arg2] != -1000000) {
				Static482.anIntArray588[arg2] += 40;
				Static9.anIntArray18[arg2] -= 512;
				Static457.anIntArray552[arg2] += 512;
				Static153.anIntArray235[arg2] += 512;
				Static682.anIntArray817[arg2] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIZI)V")
	public static void method5657(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static498.method6646();
		Static297.aLong153 = 0L;
		@Pc(10) int local10 = Static36.method978(3);
		if (arg0 == 3 || local10 == 3) {
			arg2 = true;
		}
		if (!Static163.aClass19_17.method7983()) {
			arg2 = true;
		}
		Static363.method6236(local10, arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIBII)V")
	public static void method5658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 - arg4;
		@Pc(13) int local13 = arg1 - arg0;
		if (local13 == 0) {
			if (local8 != 0) {
				Static87.method1692(arg3, arg4, arg2, arg0);
			}
		} else if (local8 == 0) {
			Static297.method4371(arg4, arg1, arg2, arg0);
		} else {
			if (local13 < 0) {
				local13 = -local13;
			}
			if (local8 < 0) {
				local8 = -local8;
			}
			@Pc(62) boolean local62 = local8 > local13;
			@Pc(66) int local66;
			@Pc(68) int local68;
			if (local62) {
				local66 = arg0;
				local68 = arg1;
				arg0 = arg4;
				arg4 = local66;
				arg1 = arg3;
				arg3 = local68;
			}
			if (arg0 > arg1) {
				local66 = arg0;
				arg0 = arg1;
				local68 = arg4;
				arg4 = arg3;
				arg1 = local66;
				arg3 = local68;
			}
			local66 = arg4;
			local68 = arg1 - arg0;
			@Pc(111) int local111 = arg3 - arg4;
			@Pc(116) int local116 = -(local68 >> 1);
			@Pc(124) int local124 = arg3 > arg4 ? 1 : -1;
			if (local111 < 0) {
				local111 = -local111;
			}
			@Pc(133) int local133;
			if (local62) {
				for (local133 = arg0; local133 <= arg1; local133++) {
					Static723.anIntArrayArray266[local133][local66] = arg2;
					local116 += local111;
					if (local116 > 0) {
						local116 -= local68;
						local66 += local124;
					}
				}
			} else {
				for (local133 = arg0; local133 <= arg1; local133++) {
					Static723.anIntArrayArray266[local66][local133] = arg2;
					local116 += local111;
					if (local116 > 0) {
						local116 -= local68;
						local66 += local124;
					}
				}
			}
		}
	}
}
