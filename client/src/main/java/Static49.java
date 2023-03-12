import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_44 = new ClientProt(29, -1);

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_45 = new ClientProt(35, 3);

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
	public static void method1471() {
		Static182.anInt3423 = 0;
		Static376.anInt7054 = 0;
		Static326.anInt6235 = 0;
		Static347.anInt6443 = 0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLclient!wm;I)Z")
	public static boolean method1472(@OriginalArg(1) Class19 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static373.anInt7033 - 104) / 2;
		@Pc(17) int local17 = (Static242.anInt4449 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static142.method2661(local25, arg1, local29, local21)) {
						local40 = local29;
						if (Static325.method5545(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static235.method3340(local21, local40, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(89) int[] local89 = new int[262144];
		for (local29 = 0; local29 < local89.length; local29++) {
			local89[local29] = -16777216;
		}
		Static292.aClass13_15 = arg0.method2884(local89, 512, 512, 512);
		Static99.method2146();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 238 - 10 | 0xFF000000;
		@Pc(162) int local162 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(189) int local189 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(193) boolean[][] local193 = new boolean[Static285.anInt5368][Static285.anInt5368];
		@Pc(199) int local199;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(224) int local224;
		@Pc(277) int local277;
		@Pc(284) int local284;
		@Pc(288) int local288;
		@Pc(303) int local303;
		for (@Pc(195) int local195 = local11; local195 < local11 + 104; local195 += Static285.anInt5368) {
			for (local199 = local17; local199 < local17 + 104; local199 += Static285.anInt5368) {
				arg0.method2895(0, 0, Static285.anInt5368 * 4, Static285.anInt5368 * 4);
				arg0.method2867(-16777216);
				for (local216 = arg1; local216 <= 3; local216++) {
					for (local220 = 0; local220 < Static285.anInt5368; local220++) {
						for (local224 = 0; local224 < Static285.anInt5368; local224++) {
							local193[local220][local224] = Static142.method2661(local224 + local199, arg1, local216, local195 + local220);
						}
					}
					Static330.aClass6Array3[local216].method5722(local195, local199, local195 + Static285.anInt5368, Static285.anInt5368 + local199, local193);
					if (!Static46.aBoolean100) {
						for (local224 = -4; local224 < Static285.anInt5368; local224++) {
							for (local277 = -4; local277 < Static285.anInt5368; local277++) {
								local284 = local195 + local224;
								local288 = local277 + local199;
								if (local11 <= local284 && local17 <= local288 && Static142.method2661(local288, arg1, local216, local284)) {
									local303 = local216;
									if (Static325.method5545(local288, local284)) {
										local303 = local216 - 1;
									}
									if (local303 >= 0) {
										Static282.method4874(local162, local40, local224 * 4, arg0, local284, (Static285.anInt5368 - local277) * 4 - 4, local303, local288);
									}
								}
							}
						}
					}
				}
				if (Static46.aBoolean100) {
					@Pc(358) Class46 local358 = Static171.aClass46Array1[arg1];
					for (local224 = 0; local224 < Static285.anInt5368; local224++) {
						for (local277 = 0; local277 < Static285.anInt5368; local277++) {
							local284 = local224 + local195;
							local288 = local199 + local277;
							local303 = local358.anIntArrayArray14[local284 - local358.anInt1468][local288 - local358.anInt1484];
							if ((local303 & 0x40240000) != 0) {
								arg0.method2868(4, local224 * 4, (Static285.anInt5368 - local277) * 4 - 4, -1713569622, 4);
							} else if ((local303 & 0x800000) != 0) {
								arg0.method2890(local224 * 4, 4, (Static285.anInt5368 - local277) * 4 - 4, -1713569622);
							} else if ((local303 & 0x2000000) != 0) {
								arg0.method2810(-1713569622, local224 * 4 + 3, (Static285.anInt5368 + -local277) * 4 - 4, 4);
							} else if ((local303 & 0x8000000) != 0) {
								arg0.method2890(local224 * 4, 4, (Static285.anInt5368 - local277) * 4 + 3 - 4, -1713569622);
							} else if ((local303 & 0x20000000) != 0) {
								arg0.method2810(-1713569622, local224 * 4, (Static285.anInt5368 - local277) * 4 - 4, 4);
							}
						}
					}
				}
				arg0.method2901(0, 0, Static285.anInt5368 * 4, Static285.anInt5368 * 4, local189, 2);
				Static292.aClass13_15.method6390((local195 - local11) * 4 + 48, 464 - (-local17 + local199) * 4 - Static285.anInt5368 * 4, Static285.anInt5368 * 4, Static285.anInt5368 * 4);
			}
		}
		arg0.method2898();
		arg0.method2867(-16777215);
		Static98.method2107();
		Static387.anInt2831 = 0;
		Static56.aClass135_13.method3544();
		if (!Static46.aBoolean100) {
			for (local199 = local11; local199 < local11 + 104; local199++) {
				for (local216 = local17; local216 < local17 + 104; local216++) {
					for (local220 = arg1; local220 <= arg1 + 1 && local220 <= 3; local220++) {
						if (Static142.method2661(local216, arg1, local220, local199)) {
							@Pc(621) Interface6 local621 = (Interface6) Static26.method865(local220, local199, local216);
							if (local621 == null) {
								local621 = (Interface6) Static105.method2207(local220, local199, local216, Interface6.class);
							}
							if (local621 == null) {
								local621 = (Interface6) Static12.method283(local220, local199, local216);
							}
							if (local621 == null) {
								local621 = (Interface6) Static28.method893(local220, local199, local216);
							}
							if (local621 != null) {
								@Pc(662) Class41 local662 = Static359.LocTypeList.method5163(local621.method6085());
								if (!local662.aBoolean111 || LoginManager.mapMembers) {
									local284 = local662.anInt1306;
									if (local662.anIntArray94 != null) {
										for (local288 = 0; local288 < local662.anIntArray94.length; local288++) {
											if (local662.anIntArray94[local288] != -1) {
												@Pc(691) Class41 local691 = Static359.LocTypeList.method5163(local662.anIntArray94[local288]);
												if (local691.anInt1306 >= 0) {
													local284 = local691.anInt1306;
												}
											}
										}
									}
									if (local284 >= 0) {
										@Pc(713) boolean local713 = false;
										if (local284 >= 0) {
											@Pc(720) Class164 local720 = Static236.aClass125_1.method3379(local284);
											if (local720 != null && local720.aBoolean303) {
												local713 = true;
											}
										}
										local303 = local199;
										@Pc(731) int local731 = local216;
										if (local713) {
											@Pc(738) int[][] local738 = Static171.aClass46Array1[local220].anIntArrayArray14;
											@Pc(743) int local743 = Static171.aClass46Array1[local220].anInt1468;
											@Pc(748) int local748 = Static171.aClass46Array1[local220].anInt1484;
											for (@Pc(750) int local750 = 0; local750 < 10; local750++) {
												@Pc(757) int local757 = (int) (Math.random() * 4.0D);
												if (local757 == 0 && local303 > local11 && local303 > local199 - 3 && (local738[local303 - local743 - 1][local731 - local748] & 0x2C0108) == 0) {
													local303--;
												}
												if (local757 == 1 && local11 + 104 - 1 > local303 && local199 + 3 > local303 && (local738[local303 + 1 - local743][local731 - local748] & 0x2C0180) == 0) {
													local303++;
												}
												if (local757 == 2 && local17 < local731 && local731 > local216 - 3 && (local738[local303 - local743][local731 - local748 - 1] & 0x2C0102) == 0) {
													local731--;
												}
												if (local757 == 3 && local17 + 104 - 1 > local731 && local216 + 3 > local731 && (local738[local303 - local743][local731 + 1 - local748] & 0x2C0120) == 0) {
													local731++;
												}
											}
										}
										Static231.anIntArray265[Static387.anInt2831] = local662.anInt1351;
										Static388.anIntArray494[Static387.anInt2831] = local303;
										Static183.anIntArray2[Static387.anInt2831] = local731;
										Static387.anInt2831++;
									}
								}
							}
						}
					}
				}
			}
			if (Static34.aClass103_3 != null) {
				client.jsArchive2.anInt5558 = 1;
				Static236.aClass125_1.method3377(64, 1024);
				for (local216 = 0; local216 < Static34.aClass103_3.anInt2702; local216++) {
					local220 = Static34.aClass103_3.anIntArray170[local216];
					if (Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 == local220 >> 28) {
						local224 = (local220 >> 14 & 0x3FFF) - Static164.anInt3140;
						local277 = (local220 & 0x3FFF) - Static148.anInt2719;
						if (local224 >= 0 && local224 < Static373.anInt7033 && local277 >= 0 && Static242.anInt4449 > local277) {
							Static56.aClass135_13.method3540(new Class2_Sub39(local216));
						} else {
							@Pc(1018) Class164 local1018 = Static236.aClass125_1.method3379(Static34.aClass103_3.anIntArray171[local216]);
							if (local1018.anIntArray290 != null && local224 + local1018.anInt4419 >= 0 && local224 + local1018.anInt4434 < Static373.anInt7033 && local1018.anInt4428 + local277 >= 0 && Static242.anInt4449 > local277 + local1018.anInt4432) {
								Static56.aClass135_13.method3540(new Class2_Sub39(local216));
							}
						}
					}
				}
				Static236.aClass125_1.method3377(64, 128);
				client.jsArchive2.anInt5558 = 2;
				client.jsArchive2.method5068();
			}
		}
		return true;
	}
}
