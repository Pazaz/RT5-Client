import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!el", name = "j", descriptor = "[I")
	public static final int[] anIntArray219 = new int[14];

	@OriginalMember(owner = "client!el", name = "l", descriptor = "I")
	public static int anInt3709 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!r;BLclient!r;)V")
	public static void method3665(@OriginalArg(0) Js5 arg0, @OriginalArg(2) Js5 arg1) {
		Static78.aClass197_89 = arg1;
		Static392.aClass197_97 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([[[Lclient!f;ZIIII)Z")
	public static boolean method3667(@OriginalArg(0) Class67[][][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static163.anInt3086 & 0xFF);
		if (Static230.aByteArrayArrayArray13[Static355.anInt6585][arg2][arg3] == local14) {
			return false;
		} else if ((Static359.aByteArrayArrayArray16[Static355.anInt6585][arg2][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) byte local42 = 0;
			Static343.anIntArray432[0] = arg2;
			@Pc(53) int local53 = 0;
			@Pc(56) int local56 = local42 + 1;
			Static364.anIntArray477[0] = arg3;
			Static230.aByteArrayArrayArray13[Static355.anInt6585][arg2][arg3] = local14;
			while (local56 != local53) {
				@Pc(74) int local74 = Static343.anIntArray432[local53] & 0xFFFF;
				@Pc(82) int local82 = Static343.anIntArray432[local53] >> 16 & 0xFF;
				@Pc(90) int local90 = Static343.anIntArray432[local53] >> 24 & 0xFF;
				@Pc(96) int local96 = Static364.anIntArray477[local53] & 0xFFFF;
				@Pc(104) int local104 = Static364.anIntArray477[local53] >> 16 & 0xFF;
				local53 = local53 + 1 & 0xFFF;
				@Pc(112) boolean local112 = false;
				if ((Static359.aByteArrayArrayArray16[Static355.anInt6585][local74][local96] & 0x4) == 0) {
					local112 = true;
				}
				@Pc(129) boolean local129 = false;
				@Pc(168) int local168;
				@Pc(210) int local210;
				label231: for (@Pc(133) int local133 = Static355.anInt6585 + 1; local133 <= 3; local133++) {
					if ((Static359.aByteArrayArrayArray16[local133][local74][local96] & 0x8) == 0) {
						@Pc(313) Class11_Sub5 local313;
						@Pc(325) int local325;
						@Pc(302) Class67 local302;
						@Pc(308) Class22 local308;
						if (local112 && arg0[local133][local74][local96] != null) {
							if (arg0[local133][local74][local96].aClass11_Sub1_3 != null) {
								local168 = Static233.method4063(local82);
								if (local168 == arg0[local133][local74][local96].aClass11_Sub1_3.anInt3482 || arg0[local133][local74][local96].aClass11_Sub1_2 != null && local168 == arg0[local133][local74][local96].aClass11_Sub1_2.anInt3482) {
									continue;
								}
								if (local90 != 0) {
									local210 = Static233.method4063(local90);
									if (arg0[local133][local74][local96].aClass11_Sub1_3.anInt3482 == local210 || arg0[local133][local74][local96].aClass11_Sub1_2 != null && local210 == arg0[local133][local74][local96].aClass11_Sub1_2.anInt3482) {
										continue;
									}
								}
								if (local104 != 0) {
									local210 = Static233.method4063(local104);
									if (arg0[local133][local74][local96].aClass11_Sub1_3.anInt3482 == local210 || arg0[local133][local74][local96].aClass11_Sub1_2 != null && local210 == arg0[local133][local74][local96].aClass11_Sub1_2.anInt3482) {
										continue;
									}
								}
							}
							local302 = arg0[local133][local74][local96];
							if (local302.aClass22_2 != null) {
								for (local308 = local302.aClass22_2; local308 != null; local308 = local308.aClass22_1) {
									local313 = local308.aClass11_Sub5_1;
									if (local313 instanceof Interface6) {
										@Pc(319) Interface6 local319 = (Interface6) local313;
										local325 = local319.method6081();
										if (local325 == 21) {
											local325 = 19;
										}
										@Pc(334) int local334 = local319.method6084();
										@Pc(340) int local340 = local325 | local334 << 6;
										if (local82 == local340 || local90 != 0 && local90 == local340 || local104 != 0 && local340 == local104) {
											continue label231;
										}
									}
								}
							}
						}
						local302 = arg0[local133][local74][local96];
						if (local302 != null && local302.aClass22_2 != null) {
							for (local308 = local302.aClass22_2; local308 != null; local308 = local308.aClass22_1) {
								local313 = local308.aClass11_Sub5_1;
								if (local313.aShort103 != local313.aShort104 || local313.aShort102 != local313.aShort101) {
									for (@Pc(401) int local401 = local313.aShort103; local401 <= local313.aShort104; local401++) {
										for (local325 = local313.aShort101; local325 <= local313.aShort102; local325++) {
											Static230.aByteArrayArrayArray13[local133][local401][local325] = local14;
										}
									}
								}
							}
						}
						local129 = true;
						Static230.aByteArrayArrayArray13[local133][local74][local96] = local14;
					}
				}
				if (local129) {
					local168 = Static365.aClass6Array4[Static355.anInt6585 + 1].method5719(local74, local96);
					if (Static353.anIntArray448[arg4] < local168) {
						Static353.anIntArray448[arg4] = local168;
					}
					local210 = local74 << 7;
					@Pc(477) int local477 = local96 << 7;
					if (Static107.anIntArray136[arg4] > local210) {
						Static107.anIntArray136[arg4] = local210;
					} else if (Static248.anIntArray318[arg4] < local210) {
						Static248.anIntArray318[arg4] = local210;
					}
					if (local477 < Static86.anIntArray122[arg4]) {
						Static86.anIntArray122[arg4] = local477;
					} else if (Static324.anIntArray409[arg4] < local477) {
						Static324.anIntArray409[arg4] = local477;
					}
				}
				if (!local112) {
					if (local74 >= 1 && Static230.aByteArrayArrayArray13[Static355.anInt6585][local74 - 1][local96] != local14) {
						Static343.anIntArray432[local56] = local74 - 1 | 0x120000 | 0xD3000000;
						Static364.anIntArray477[local56] = local96 | 0x130000;
						Static230.aByteArrayArrayArray13[Static355.anInt6585][local74 - 1][local96] = local14;
						local56 = local56 + 1 & 0xFFF;
					}
					local96++;
					if (Static242.anInt4449 > local96) {
						if (local74 - 1 >= 0 && Static230.aByteArrayArrayArray13[Static355.anInt6585][local74 - 1][local96] != local14 && (Static359.aByteArrayArrayArray16[Static355.anInt6585][local74][local96] & 0x4) == 0 && (Static359.aByteArrayArrayArray16[Static355.anInt6585][local74 - 1][local96 - 1] & 0x4) == 0) {
							Static343.anIntArray432[local56] = local74 - 1 | 0x120000 | 0x52000000;
							Static364.anIntArray477[local56] = local96 | 0x130000;
							local56 = local56 + 1 & 0xFFF;
							Static230.aByteArrayArrayArray13[Static355.anInt6585][local74 - 1][local96] = local14;
						}
						if (local14 != Static230.aByteArrayArrayArray13[Static355.anInt6585][local74][local96]) {
							Static343.anIntArray432[local56] = 0x13000000 | 0x520000 | local74;
							Static364.anIntArray477[local56] = local96 | 0x530000;
							Static230.aByteArrayArrayArray13[Static355.anInt6585][local74][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (Static373.anInt7033 > local74 + 1 && Static230.aByteArrayArrayArray13[Static355.anInt6585][local74 + 1][local96] != local14 && (Static359.aByteArrayArrayArray16[Static355.anInt6585][local74][local96] & 0x4) == 0 && (Static359.aByteArrayArrayArray16[Static355.anInt6585][local74 + 1][local96 - 1] & 0x4) == 0) {
							Static343.anIntArray432[local56] = local74 + 1 | 0x520000 | 0x92000000;
							Static364.anIntArray477[local56] = local96 | 0x530000;
							Static230.aByteArrayArrayArray13[Static355.anInt6585][local74 + 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
					}
					local96--;
					if (Static373.anInt7033 > local74 + 1 && local14 != Static230.aByteArrayArrayArray13[Static355.anInt6585][local74 + 1][local96]) {
						Static343.anIntArray432[local56] = 0x53000000 | 0x920000 | local74 + 1;
						Static364.anIntArray477[local56] = local96 | 0x930000;
						Static230.aByteArrayArrayArray13[Static355.anInt6585][local74 + 1][local96] = local14;
						local56 = local56 + 1 & 0xFFF;
					}
					local96--;
					if (local96 >= 0) {
						if (local74 - 1 >= 0 && local14 != Static230.aByteArrayArrayArray13[Static355.anInt6585][local74 - 1][local96] && (Static359.aByteArrayArrayArray16[Static355.anInt6585][local74][local96] & 0x4) == 0 && (Static359.aByteArrayArrayArray16[Static355.anInt6585][local74 - 1][local96 + 1] & 0x4) == 0) {
							Static343.anIntArray432[local56] = local74 - 1 | 0xD20000 | 0x12000000;
							Static364.anIntArray477[local56] = local96 | 0xD30000;
							Static230.aByteArrayArrayArray13[Static355.anInt6585][local74 - 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (Static230.aByteArrayArrayArray13[Static355.anInt6585][local74][local96] != local14) {
							Static343.anIntArray432[local56] = 0x93000000 | 0xD20000 | local74;
							Static364.anIntArray477[local56] = local96 | 0xD30000;
							local56 = local56 + 1 & 0xFFF;
							Static230.aByteArrayArrayArray13[Static355.anInt6585][local74][local96] = local14;
						}
						if (local74 + 1 < Static373.anInt7033 && local14 != Static230.aByteArrayArrayArray13[Static355.anInt6585][local74 + 1][local96] && (Static359.aByteArrayArrayArray16[Static355.anInt6585][local74][local96] & 0x4) == 0 && (Static359.aByteArrayArrayArray16[Static355.anInt6585][local74 + 1][local96 + 1] & 0x4) == 0) {
							Static343.anIntArray432[local56] = local74 + 1 | 0x920000 | 0xD2000000;
							Static364.anIntArray477[local56] = local96 | 0x930000;
							local56 = local56 + 1 & 0xFFF;
							Static230.aByteArrayArrayArray13[Static355.anInt6585][local74 + 1][local96] = local14;
						}
					}
				}
			}
			if (Static353.anIntArray448[arg4] != -1000000) {
				Static353.anIntArray448[arg4] += 10;
				Static107.anIntArray136[arg4] -= 50;
				Static248.anIntArray318[arg4] += 50;
				Static324.anIntArray409[arg4] += 50;
				Static86.anIntArray122[arg4] -= 50;
			}
			return true;
		}
	}
}
