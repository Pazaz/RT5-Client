import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	public static int anInt1721;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z")
	public static boolean method1821() throws IOException {
		if (Static335.aClass111_4 == null) {
			return false;
		}
		@Pc(15) int local15 = Static335.aClass111_4.method2795();
		if (local15 == 0) {
			return false;
		}
		@Pc(74) int local74;
		if (Static231.aClass89_164 == null) {
			if (Static69.aBoolean129) {
				local15--;
				Static335.aClass111_4.method2793(Static212.aClass2_Sub4_Sub2_3.aByteArray73, 1, 0);
				Static301.anInt5697++;
				Static69.aBoolean129 = false;
			}
			Static212.aClass2_Sub4_Sub2_3.anInt5300 = 0;
			if (Static212.aClass2_Sub4_Sub2_3.method4870()) {
				if (local15 == 0) {
					return false;
				}
				Static335.aClass111_4.method2793(Static212.aClass2_Sub4_Sub2_3.aByteArray73, 1, 1);
				local15--;
				Static301.anInt5697++;
			}
			Static69.aBoolean129 = true;
			@Pc(70) Class89[] local70 = Static166.method3188();
			local74 = Static212.aClass2_Sub4_Sub2_3.method4864();
			if (local74 < 0 || local70.length <= local74) {
				throw new IOException("invo:" + local74);
			}
			Static231.aClass89_164 = local70[local74];
			Static82.anInt1836 = Static231.aClass89_164.anInt2405;
		}
		if (Static82.anInt1836 == -1) {
			if (local15 <= 0) {
				return false;
			}
			Static335.aClass111_4.method2793(Static212.aClass2_Sub4_Sub2_3.aByteArray73, 1, 0);
			Static301.anInt5697++;
			Static82.anInt1836 = Static212.aClass2_Sub4_Sub2_3.aByteArray73[0] & 0xFF;
			local15--;
		}
		if (Static82.anInt1836 == -2) {
			if (local15 <= 1) {
				return false;
			}
			Static335.aClass111_4.method2793(Static212.aClass2_Sub4_Sub2_3.aByteArray73, 2, 0);
			Static212.aClass2_Sub4_Sub2_3.anInt5300 = 0;
			local15 -= 2;
			Static82.anInt1836 = Static212.aClass2_Sub4_Sub2_3.method4829();
			Static301.anInt5697 += 2;
		}
		if (Static82.anInt1836 > local15) {
			return false;
		}
		Static212.aClass2_Sub4_Sub2_3.anInt5300 = 0;
		Static335.aClass111_4.method2793(Static212.aClass2_Sub4_Sub2_3.aByteArray73, Static82.anInt1836, 0);
		Static268.anInt4955 = 0;
		Static39.aClass89_35 = Static66.aClass89_57;
		Static301.anInt5697 += Static82.anInt1836;
		Static66.aClass89_57 = Static334.aClass89_222;
		Static334.aClass89_222 = Static231.aClass89_164;
		if (Static299.aClass89_202 == Static231.aClass89_164) {
			Static235.method3339(Static328.aClass152_5, Static82.anInt1836, Static212.aClass2_Sub4_Sub2_3);
			Static231.aClass89_164 = null;
			return true;
		} else if (Static231.aClass89_164 == Static375.aClass89_246) {
			Static214.aClass226_1.method5781();
			Static231.aClass89_164 = null;
			Static12.anInt269 += 32;
			return true;
		} else {
			@Pc(228) int local228;
			@Pc(249) int local249;
			@Pc(220) int local220;
			if (Static231.aClass89_164 == Static320.aClass89_214) {
				local220 = Static212.aClass2_Sub4_Sub2_3.method4815();
				local74 = Static212.aClass2_Sub4_Sub2_3.method4803();
				local228 = Static212.aClass2_Sub4_Sub2_3.method4803();
				if (Static378.method6314(local228)) {
					if (local220 == 2) {
						Static90.method5953();
					}
					Static139.anInt2595 = local74;
					Static160.method2957(local74);
					Static60.method891(false);
					Static198.method3598(Static139.anInt2595);
					for (local249 = 0; local249 < 100; local249++) {
						Static357.aBooleanArray59[local249] = true;
					}
				}
				Static231.aClass89_164 = null;
				return true;
			}
			@Pc(272) byte local272;
			if (Static231.aClass89_164 == Static70.aClass89_58) {
				local272 = Static212.aClass2_Sub4_Sub2_3.method4854();
				local74 = Static212.aClass2_Sub4_Sub2_3.method4806();
				local228 = Static212.aClass2_Sub4_Sub2_3.method4853();
				if (Static378.method6314(local74)) {
					Static322.method5481(local228, local272);
				}
				Static231.aClass89_164 = null;
				return true;
			} else if (Static227.aClass89_161 == Static231.aClass89_164) {
				local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
				if (Static378.method6314(local220)) {
					Static117.method2369();
				}
				Static231.aClass89_164 = null;
				return true;
			} else {
				@Pc(344) Class2_Sub7 local344;
				if (Static231.aClass89_164 == Static297.aClass89_200) {
					local220 = Static212.aClass2_Sub4_Sub2_3.method4835();
					local74 = Static212.aClass2_Sub4_Sub2_3.method4835();
					local228 = Static212.aClass2_Sub4_Sub2_3.method4803();
					if (Static378.method6314(local228)) {
						@Pc(335) Class2_Sub7 local335 = (Class2_Sub7) Static329.aClass4_130.method90((long) local220);
						local344 = (Class2_Sub7) Static329.aClass4_130.method90((long) local74);
						if (local344 != null) {
							Static276.method4655(false, local344, local335 == null || local344.anInt1370 != local335.anInt1370);
						}
						if (local335 != null) {
							local335.method6468();
							Static329.aClass4_130.method87(local335, (long) local74);
						}
						@Pc(375) Class161 local375 = Static6.method140(local220);
						if (local375 != null) {
							Static200.method3645(local375);
						}
						local375 = Static6.method140(local74);
						if (local375 != null) {
							Static200.method3645(local375);
							Static85.method1911(true, local375);
						}
						if (Static139.anInt2595 != -1) {
							Static392.method6460(Static139.anInt2595, 1);
						}
					}
					Static231.aClass89_164 = null;
					return true;
				} else if (Static58.aClass89_49 == Static231.aClass89_164) {
					if (Static139.anInt2595 != -1) {
						Static392.method6460(Static139.anInt2595, 0);
					}
					Static231.aClass89_164 = null;
					return true;
				} else if (Static231.aClass89_164 == Static23.aClass89_22) {
					local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
					if (Static378.method6314(local220)) {
						Static351.method5859();
					}
					Static231.aClass89_164 = null;
					return true;
				} else {
					@Pc(452) String local452;
					@Pc(444) String local444;
					if (Static31.aClass89_27 == Static231.aClass89_164) {
						local444 = Static212.aClass2_Sub4_Sub2_3.method4809();
						local452 = Static153.method2772(Static308.method5276(Static212.aClass2_Sub4_Sub2_3));
						Static33.method4200(local444, 0, local452, 6, local444);
						Static231.aClass89_164 = null;
						return true;
					}
					@Pc(506) int local506;
					@Pc(512) int local512;
					@Pc(536) int local536;
					@Pc(542) int local542;
					@Pc(638) int local638;
					@Pc(497) int local497;
					@Pc(604) boolean local604;
					if (Static272.aClass89_186 == Static231.aClass89_164) {
						local220 = Static212.aClass2_Sub4_Sub2_3.method4806();
						local74 = Static212.aClass2_Sub4_Sub2_3.method4806();
						local228 = Static212.aClass2_Sub4_Sub2_3.method4836();
						local249 = Static212.aClass2_Sub4_Sub2_3.method4803();
						if (local228 >> 30 == 0) {
							@Pc(621) Class91 local621;
							@Pc(692) Class157 local692;
							@Pc(684) Class157 local684;
							@Pc(667) Class91 local667;
							@Pc(635) Class157 local635;
							if (local228 >> 29 != 0) {
								local497 = local228 & 0xFFFF;
								@Pc(790) Class11_Sub5_Sub2_Sub2 local790 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local497];
								if (local790 != null) {
									if (local220 == 65535) {
										local220 = -1;
									}
									local604 = true;
									if (local220 != -1 && local790.anInt4594 != -1) {
										if (local790.anInt4594 == local220) {
											local621 = Static322.aClass211_2.method5407(local220);
											if (local621.aBoolean177 && local621.anInt2448 != -1) {
												local635 = Static39.aClass85_1.method2371(local621.anInt2448);
												local638 = local635.anInt4022;
												if (local638 == 0 || local638 == 2) {
													local604 = false;
												} else if (local638 == 1) {
													local604 = true;
												}
											}
										} else {
											local621 = Static322.aClass211_2.method5407(local220);
											local667 = Static322.aClass211_2.method5407(local790.anInt4594);
											if (local621.anInt2448 != -1 && local667.anInt2448 != -1) {
												local684 = Static39.aClass85_1.method2371(local621.anInt2448);
												local692 = Static39.aClass85_1.method2371(local667.anInt2448);
												if (local692.anInt4023 > local684.anInt4023) {
													local604 = false;
												}
											}
										}
									}
									if (local604) {
										local790.anInt4594 = local220;
										local790.anInt4620 = 0;
										local790.anInt4582 = 0;
										local790.anInt4595 = local74 + Static114.anInt2348;
										local790.anInt4639 = local249;
										local790.anInt4612 = 1;
										if (Static114.anInt2348 < local790.anInt4595) {
											local790.anInt4582 = -1;
										}
										if (local790.anInt4594 != -1 && local790.anInt4595 == Static114.anInt2348) {
											local536 = Static322.aClass211_2.method5407(local790.anInt4594).anInt2448;
											if (local536 != -1) {
												local635 = Static39.aClass85_1.method2371(local536);
												if (local635 != null && local635.anIntArray262 != null) {
													Static1.method4(local635, false, local790.aByte78, local790.anInt6781, local790.anInt6783, 0);
												}
											}
										}
									}
								}
							} else if (local228 >> 28 != 0) {
								local497 = local228 & 0xFFFF;
								@Pc(589) Class11_Sub5_Sub2_Sub1 local589;
								if (Static234.anInt4226 == local497) {
									local589 = Static17.aClass11_Sub5_Sub2_Sub1_3;
								} else {
									local589 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local497];
								}
								if (local589 != null) {
									if (local220 == 65535) {
										local220 = -1;
									}
									local604 = true;
									if (local220 != -1 && local589.anInt4594 != -1) {
										if (local220 == local589.anInt4594) {
											local621 = Static322.aClass211_2.method5407(local220);
											if (local621.aBoolean177 && local621.anInt2448 != -1) {
												local635 = Static39.aClass85_1.method2371(local621.anInt2448);
												local638 = local635.anInt4022;
												if (local638 == 0 || local638 == 2) {
													local604 = false;
												} else if (local638 == 1) {
													local604 = true;
												}
											}
										} else {
											local621 = Static322.aClass211_2.method5407(local220);
											local667 = Static322.aClass211_2.method5407(local589.anInt4594);
											if (local621.anInt2448 != -1 && local667.anInt2448 != -1) {
												local684 = Static39.aClass85_1.method2371(local621.anInt2448);
												local692 = Static39.aClass85_1.method2371(local667.anInt2448);
												if (local692.anInt4023 > local684.anInt4023) {
													local604 = false;
												}
											}
										}
									}
									if (local604) {
										local589.anInt4620 = 0;
										local589.anInt4582 = 0;
										local589.anInt4612 = 1;
										local589.anInt4639 = local249;
										local589.anInt4594 = local220;
										local589.anInt4595 = local74 + Static114.anInt2348;
										if (local589.anInt4594 == 65535) {
											local589.anInt4594 = -1;
										}
										if (Static114.anInt2348 < local589.anInt4595) {
											local589.anInt4582 = -1;
										}
										if (local589.anInt4594 != -1 && Static114.anInt2348 == local589.anInt4595) {
											local536 = Static322.aClass211_2.method5407(local589.anInt4594).anInt2448;
											if (local536 != -1) {
												local635 = Static39.aClass85_1.method2371(local536);
												if (local635 != null && local635.anIntArray262 != null) {
													Static1.method4(local635, Static17.aClass11_Sub5_Sub2_Sub1_3 == local589, local589.aByte78, local589.anInt6781, local589.anInt6783, 0);
												}
											}
										}
									}
								}
							}
						} else {
							local497 = local228 >> 28 & 0x3;
							local506 = (local228 >> 14 & 0x3FFF) - Static164.anInt3140;
							local512 = (local228 & 0x3FFF) - Static148.anInt2719;
							if (local506 >= 0 && local512 >= 0 && Static373.anInt7033 > local506 && Static242.anInt4449 > local512) {
								local536 = local506 * 128 + 64;
								local542 = local512 * 128 + 64;
								@Pc(563) Class11_Sub5_Sub4 local563 = new Class11_Sub5_Sub4(local220, 0, Static114.anInt2348, local497, local536, Static386.method6032(local536, local542, local497) - local249, local542, local506, local506, local512, local512);
								Static129.aClass135_20.method3540(new Class2_Sub2_Sub1(local563));
							}
						}
						Static231.aClass89_164 = null;
						return true;
					} else if (Static305.aClass89_204 == Static231.aClass89_164) {
						local220 = Static212.aClass2_Sub4_Sub2_3.method4853();
						local74 = Static212.aClass2_Sub4_Sub2_3.method4852();
						local228 = Static212.aClass2_Sub4_Sub2_3.method4806();
						if (Static378.method6314(local228)) {
							Static7.method6469(local220, local74);
						}
						Static231.aClass89_164 = null;
						return true;
					} else if (Static120.aClass89_95 == Static231.aClass89_164) {
						local220 = Static212.aClass2_Sub4_Sub2_3.method4806();
						local74 = Static212.aClass2_Sub4_Sub2_3.method4804();
						if (Static378.method6314(local220)) {
							Static114.anInt2344 = local74;
						}
						Static231.aClass89_164 = null;
						return true;
					} else if (Static231.aClass89_164 == Static153.aClass89_119) {
						Static361.method6054(Static212.aClass2_Sub4_Sub2_3, Static82.anInt1836);
						Static231.aClass89_164 = null;
						return true;
					} else {
						@Pc(1101) long local1101;
						@Pc(1118) Class2_Sub10 local1118;
						@Pc(1109) Class2_Sub10 local1109;
						if (Static231.aClass89_164 == Static384.aClass89_253) {
							local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
							if (local220 == 65535) {
								local220 = -1;
							}
							local74 = Static212.aClass2_Sub4_Sub2_3.method4803();
							local228 = Static212.aClass2_Sub4_Sub2_3.method4806();
							if (local228 == 65535) {
								local228 = -1;
							}
							local249 = Static212.aClass2_Sub4_Sub2_3.method4829();
							local497 = Static212.aClass2_Sub4_Sub2_3.method4852();
							if (Static378.method6314(local249)) {
								for (local506 = local220; local506 <= local228; local506++) {
									local1101 = (long) local506 + ((long) local497 << 32);
									local1109 = (Class2_Sub10) Static327.aClass4_127.method90(local1101);
									if (local1109 != null) {
										local1118 = new Class2_Sub10(local1109.anInt1758, local74);
										local1109.method6468();
									} else if (local506 == -1) {
										local1118 = new Class2_Sub10(Static6.method140(local497).aClass2_Sub10_1.anInt1758, local74);
									} else {
										local1118 = new Class2_Sub10(0, local74);
									}
									Static327.aClass4_127.method87(local1118, local1101);
								}
							}
							Static231.aClass89_164 = null;
							return true;
						} else if (Static231.aClass89_164 == Static371.aClass89_243) {
							local220 = Static212.aClass2_Sub4_Sub2_3.method4844();
							local74 = Static212.aClass2_Sub4_Sub2_3.method4853();
							if (Static378.method6314(local74)) {
								Static190.method3501(-1, -1, 3, local220);
							}
							Static231.aClass89_164 = null;
							return true;
						} else if (Static98.aClass89_84 == Static231.aClass89_164) {
							local220 = Static212.aClass2_Sub4_Sub2_3.method4806();
							local74 = Static212.aClass2_Sub4_Sub2_3.method4811();
							local228 = Static212.aClass2_Sub4_Sub2_3.method4844();
							local249 = Static212.aClass2_Sub4_Sub2_3.method4829();
							if (Static378.method6314(local220)) {
								local344 = (Class2_Sub7) Static329.aClass4_130.method90((long) local228);
								if (local344 != null) {
									Static276.method4655(false, local344, local249 != local344.anInt1370);
								}
								Static382.method6365(local228, local74, false, local249);
							}
							Static231.aClass89_164 = null;
							return true;
						} else if (Static387.aClass89_120 == Static231.aClass89_164) {
							local220 = Static212.aClass2_Sub4_Sub2_3.method4836();
							local74 = Static212.aClass2_Sub4_Sub2_3.method4804();
							local228 = Static212.aClass2_Sub4_Sub2_3.method4811();
							Static80.anIntArray464[local74] = local220;
							Static268.anIntArray338[local74] = local228;
							Static325.anIntArray414[local74] = 1;
							local249 = Static287.anIntArray369[local74] - 1;
							for (local497 = 0; local497 < local249; local497++) {
								if (local220 >= Class12_Sub1_Sub1.anIntArray292[local497]) {
									Static325.anIntArray414[local74] = local497 + 2;
								}
							}
							Static208.anIntArray226[Static381.anInt7117++ & 0x1F] = local74;
							Static231.aClass89_164 = null;
							return true;
						} else if (Static231.aClass89_164 == Static153.aClass89_118) {
							local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
							local74 = Static212.aClass2_Sub4_Sub2_3.method4815();
							local228 = Static212.aClass2_Sub4_Sub2_3.method4815();
							local249 = Static212.aClass2_Sub4_Sub2_3.method4829();
							local497 = Static212.aClass2_Sub4_Sub2_3.method4815();
							local506 = Static212.aClass2_Sub4_Sub2_3.method4815();
							if (Static378.method6314(local220)) {
								Static51.method1545(local228, local497, local506, true, local249, local74);
							}
							Static231.aClass89_164 = null;
							return true;
						} else {
							@Pc(1371) boolean local1371;
							@Pc(1381) String local1381;
							@Pc(1627) String local1627;
							@Pc(1391) String local1391;
							@Pc(1663) String local1663;
							if (Static83.aClass89_69 == Static231.aClass89_164) {
								while (Static212.aClass2_Sub4_Sub2_3.anInt5300 < Static82.anInt1836) {
									local1371 = Static212.aClass2_Sub4_Sub2_3.method4815() == 1;
									local452 = Static212.aClass2_Sub4_Sub2_3.method4809();
									local1381 = Static212.aClass2_Sub4_Sub2_3.method4809();
									local249 = Static212.aClass2_Sub4_Sub2_3.method4829();
									local497 = Static212.aClass2_Sub4_Sub2_3.method4815();
									local1391 = "";
									local604 = false;
									if (local249 > 0) {
										local1391 = Static212.aClass2_Sub4_Sub2_3.method4809();
										local604 = Static212.aClass2_Sub4_Sub2_3.method4815() == 1;
									}
									for (local536 = 0; local536 < Static384.anInt7178; local536++) {
										if (local1371) {
											if (local1381.equals(Static17.aStringArray43[local536])) {
												Static17.aStringArray43[local536] = local452;
												Static319.aStringArray54[local536] = local1381;
												local452 = null;
												break;
											}
										} else if (local452.equals(Static17.aStringArray43[local536])) {
											if (Static265.anIntArray333[local536] != local249) {
												Static265.anIntArray333[local536] = local249;
												if (local249 > 0) {
													Static33.method4200("", 0, local452 + Static282.aClass79_112.method2267(Static295.anInt5581), 5, "");
												}
												if (local249 == 0) {
													Static33.method4200("", 0, local452 + Static359.aClass79_140.method2267(Static295.anInt5581), 5, "");
												}
											}
											Static319.aStringArray54[local536] = local1381;
											Static209.aStringArray32[local536] = local1391;
											Static114.anIntArray148[local536] = local497;
											local452 = null;
											Static302.aBooleanArray13[local536] = local604;
											break;
										}
									}
									if (local452 != null && Static384.anInt7178 < 200) {
										Static17.aStringArray43[Static384.anInt7178] = local452;
										Static319.aStringArray54[Static384.anInt7178] = local1381;
										Static265.anIntArray333[Static384.anInt7178] = local249;
										Static209.aStringArray32[Static384.anInt7178] = local1391;
										Static114.anIntArray148[Static384.anInt7178] = local497;
										Static302.aBooleanArray13[Static384.anInt7178] = local604;
										Static384.anInt7178++;
									}
								}
								Static235.anInt3363 = 2;
								Static53.anInt3971 = Static88.anInt1876;
								local74 = Static384.anInt7178;
								while (local74 > 0) {
									local1371 = true;
									local74--;
									for (local228 = 0; local228 < local74; local228++) {
										if (Static265.anIntArray333[local228] != Static120.anInt2385 && Static120.anInt2385 == Static265.anIntArray333[local228 + 1] || Static265.anIntArray333[local228] == 0 && Static265.anIntArray333[local228 + 1] != 0) {
											local249 = Static265.anIntArray333[local228];
											Static265.anIntArray333[local228] = Static265.anIntArray333[local228 + 1];
											Static265.anIntArray333[local228 + 1] = local249;
											local1627 = Static209.aStringArray32[local228];
											Static209.aStringArray32[local228] = Static209.aStringArray32[local228 + 1];
											Static209.aStringArray32[local228 + 1] = local1627;
											local1391 = Static17.aStringArray43[local228];
											Static17.aStringArray43[local228] = Static17.aStringArray43[local228 + 1];
											Static17.aStringArray43[local228 + 1] = local1391;
											local1663 = Static319.aStringArray54[local228];
											Static319.aStringArray54[local228] = Static319.aStringArray54[local228 + 1];
											Static319.aStringArray54[local228 + 1] = local1663;
											local536 = Static114.anIntArray148[local228];
											Static114.anIntArray148[local228] = Static114.anIntArray148[local228 + 1];
											Static114.anIntArray148[local228 + 1] = local536;
											@Pc(1699) boolean local1699 = Static302.aBooleanArray13[local228];
											Static302.aBooleanArray13[local228] = Static302.aBooleanArray13[local228 + 1];
											local1371 = false;
											Static302.aBooleanArray13[local228 + 1] = local1699;
										}
									}
									if (local1371) {
										break;
									}
								}
								Static231.aClass89_164 = null;
								return true;
							} else if (Static231.aClass89_164 == Static210.aClass89_156) {
								Static41.anInt1048 = Static212.aClass2_Sub4_Sub2_3.method4823();
								Static93.anInt1950 = Static88.anInt1876;
								Static231.aClass89_164 = null;
								return true;
							} else {
								@Pc(1780) long local1780;
								@Pc(1785) long local1785;
								if (Static231.aClass89_164 == Static220.aClass89_158) {
									local1371 = Static212.aClass2_Sub4_Sub2_3.method4815() == 1;
									local452 = Static212.aClass2_Sub4_Sub2_3.method4809();
									local1381 = local452;
									if (local1371) {
										local1381 = Static212.aClass2_Sub4_Sub2_3.method4809();
									}
									local1780 = Static212.aClass2_Sub4_Sub2_3.method4829();
									local1785 = Static212.aClass2_Sub4_Sub2_3.method4833();
									local536 = Static212.aClass2_Sub4_Sub2_3.method4815();
									@Pc(1796) long local1796 = (local1780 << 32) + local1785;
									@Pc(1798) boolean local1798 = false;
									@Pc(1800) int local1800 = 0;
									while (true) {
										if (local1800 >= 100) {
											if (local536 <= 1) {
												if (Static56.aBoolean123 && !Static101.aBoolean159 || Static109.aBoolean166) {
													local1798 = true;
												} else if (Static105.method2208(local1381)) {
													local1798 = true;
												}
											}
											break;
										}
										if (local1796 == Static358.aLongArray11[local1800]) {
											local1798 = true;
											break;
										}
										local1800++;
									}
									if (!local1798 && Static212.anInt3785 == 0) {
										Static358.aLongArray11[Static193.anInt3555] = local1796;
										Static193.anInt3555 = (Static193.anInt3555 + 1) % 100;
										@Pc(1866) String local1866 = Static153.method2772(Static308.method5276(Static212.aClass2_Sub4_Sub2_3));
										if (local536 == 2) {
											Static220.method3874(0, null, local1866, -1, 7, "<img=1>" + local1381, "<img=1>" + local452);
										} else if (local536 == 1) {
											Static220.method3874(0, null, local1866, -1, 7, "<img=0>" + local1381, "<img=0>" + local452);
										} else {
											Static220.method3874(0, null, local1866, -1, 3, local1381, local452);
										}
									}
									Static231.aClass89_164 = null;
									return true;
								} else if (Static231.aClass89_164 == Static79.aClass89_63) {
									local444 = Static212.aClass2_Sub4_Sub2_3.method4809();
									local74 = Static212.aClass2_Sub4_Sub2_3.method4829();
									local1381 = Static146.method2699(local74).method5602(Static212.aClass2_Sub4_Sub2_3);
									Static220.method3874(0, null, local1381, local74, 19, local444, local444);
									Static231.aClass89_164 = null;
									return true;
								} else if (Static231.aClass89_164 == Static10.aClass89_12) {
									Static99.method2144();
									Static231.aClass89_164 = null;
									return false;
								} else if (Static231.aClass89_164 == Static170.aClass89_136) {
									local220 = Static212.aClass2_Sub4_Sub2_3.method4853();
									local74 = Static212.aClass2_Sub4_Sub2_3.method4844();
									Static214.aClass226_1.method5785(local74, local220);
									Static231.aClass89_164 = null;
									return true;
								} else if (Static231.aClass89_164 == Static372.aClass89_245) {
									local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
									local74 = Static212.aClass2_Sub4_Sub2_3.method4815();
									local228 = Static212.aClass2_Sub4_Sub2_3.method4815();
									local249 = Static212.aClass2_Sub4_Sub2_3.method4829();
									local497 = Static212.aClass2_Sub4_Sub2_3.method4815();
									local506 = Static212.aClass2_Sub4_Sub2_3.method4815();
									if (Static378.method6314(local220)) {
										Static33.method4203(local497, local249, local228, local506, local74);
									}
									Static231.aClass89_164 = null;
									return true;
								} else if (Static106.aClass89_88 == Static231.aClass89_164) {
									local220 = Static212.aClass2_Sub4_Sub2_3.method4804();
									local74 = Static212.aClass2_Sub4_Sub2_3.method4811();
									if (local220 == 255) {
										local74 = -1;
										local220 = -1;
									}
									Static283.method4875(local220, local74);
									Static231.aClass89_164 = null;
									return true;
								} else if (Static231.aClass89_164 == Static183.aClass89_6) {
									Static330.method5656(Static333.aClass210_17);
									Static231.aClass89_164 = null;
									return true;
								} else if (Static6.aClass89_9 == Static231.aClass89_164) {
									local220 = Static212.aClass2_Sub4_Sub2_3.method4853();
									local74 = Static212.aClass2_Sub4_Sub2_3.method4844();
									local228 = Static212.aClass2_Sub4_Sub2_3.method4811();
									if (Static378.method6314(local220)) {
										Static17.method4208(local74, local228);
									}
									Static231.aClass89_164 = null;
									return true;
								} else if (Static118.aClass89_144 == Static231.aClass89_164) {
									for (local220 = 0; local220 < Static12.aClass11_Sub5_Sub2_Sub1Array1.length; local220++) {
										if (Static12.aClass11_Sub5_Sub2_Sub1Array1[local220] != null) {
											Static12.aClass11_Sub5_Sub2_Sub1Array1[local220].anInt4597 = -1;
										}
									}
									for (local74 = 0; local74 < Static365.aClass11_Sub5_Sub2_Sub2Array1.length; local74++) {
										if (Static365.aClass11_Sub5_Sub2_Sub2Array1[local74] != null) {
											Static365.aClass11_Sub5_Sub2_Sub2Array1[local74].anInt4597 = -1;
										}
									}
									Static231.aClass89_164 = null;
									return true;
								} else if (Static142.aClass89_110 == Static231.aClass89_164) {
									Static151.anInt2773 = Static212.aClass2_Sub4_Sub2_3.method4829() * 30;
									Static231.aClass89_164 = null;
									Static93.anInt1950 = Static88.anInt1876;
									return true;
								} else if (Static231.aClass89_164 == Static268.aClass89_180) {
									local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
									if (local220 == 65535) {
										local220 = -1;
									}
									local74 = Static212.aClass2_Sub4_Sub2_3.method4815();
									local228 = Static212.aClass2_Sub4_Sub2_3.method4829();
									local249 = Static212.aClass2_Sub4_Sub2_3.method4815();
									Static29.method939(local74, local249, local228, local220);
									Static231.aClass89_164 = null;
									return true;
								} else if (Static78.aClass89_224 == Static231.aClass89_164) {
									local220 = Static212.aClass2_Sub4_Sub2_3.method4836();
									local74 = Static212.aClass2_Sub4_Sub2_3.method4803();
									local228 = Static212.aClass2_Sub4_Sub2_3.method4806();
									if (Static378.method6314(local74)) {
										Static120.method2383(local228, local220);
									}
									Static231.aClass89_164 = null;
									return true;
								} else if (Static231.aClass89_164 == Static50.aClass89_46) {
									Static330.method5656(Static374.aClass210_16);
									Static231.aClass89_164 = null;
									return true;
								} else if (Static340.aClass89_227 == Static231.aClass89_164) {
									Static330.method5656(Static359.aClass210_14);
									Static231.aClass89_164 = null;
									return true;
								} else if (Static231.aClass89_164 == Static78.aClass89_223) {
									local220 = Static212.aClass2_Sub4_Sub2_3.method4853();
									local74 = Static212.aClass2_Sub4_Sub2_3.method4852();
									local228 = Static212.aClass2_Sub4_Sub2_3.method4829();
									local249 = Static212.aClass2_Sub4_Sub2_3.method4853();
									if (Static378.method6314(local228)) {
										Static375.method6282(local220 + (local249 << 16), local74);
									}
									Static231.aClass89_164 = null;
									return true;
								} else if (Static48.aClass89_43 == Static231.aClass89_164) {
									local220 = Static212.aClass2_Sub4_Sub2_3.method4836();
									local74 = Static212.aClass2_Sub4_Sub2_3.method4852();
									local228 = Static212.aClass2_Sub4_Sub2_3.method4806();
									local249 = Static212.aClass2_Sub4_Sub2_3.method4803();
									if (Static378.method6314(local228)) {
										Static190.method3501(local249, local74, 5, local220);
									}
									Static231.aClass89_164 = null;
									return true;
								} else {
									@Pc(2522) Class214 local2522;
									if (Static231.aClass89_164 == Static82.aClass89_67) {
										Static285.anInt5370 = Static88.anInt1876;
										if (Static82.anInt1836 == 0) {
											Static389.aString53 = null;
											Static186.anInt3730 = 0;
											Static169.aString25 = null;
											Static231.aClass89_164 = null;
											Static47.aClass214Array1 = null;
											return true;
										}
										Static169.aString25 = Static212.aClass2_Sub4_Sub2_3.method4809();
										local1371 = Static212.aClass2_Sub4_Sub2_3.method4815() == 1;
										if (local1371) {
											Static212.aClass2_Sub4_Sub2_3.method4809();
										}
										@Pc(2364) long local2364 = Static212.aClass2_Sub4_Sub2_3.method4798();
										Static389.aString53 = Static202.method3676(local2364);
										Static265.aByte54 = Static212.aClass2_Sub4_Sub2_3.method4825();
										local249 = Static212.aClass2_Sub4_Sub2_3.method4815();
										if (local249 == 255) {
											Static231.aClass89_164 = null;
											return true;
										}
										Static186.anInt3730 = local249;
										@Pc(2392) Class214[] local2392 = new Class214[100];
										for (local506 = 0; local506 < Static186.anInt3730; local506++) {
											local2392[local506] = new Class214();
											local2392[local506].aString58 = Static212.aClass2_Sub4_Sub2_3.method4809();
											local1371 = Static212.aClass2_Sub4_Sub2_3.method4815() == 1;
											if (local1371) {
												local2392[local506].aString60 = Static212.aClass2_Sub4_Sub2_3.method4809();
											} else {
												local2392[local506].aString60 = local2392[local506].aString58;
											}
											local2392[local506].aString59 = Static135.method2537(local2392[local506].aString60);
											local2392[local506].anInt5978 = Static212.aClass2_Sub4_Sub2_3.method4829();
											local2392[local506].aByte65 = Static212.aClass2_Sub4_Sub2_3.method4825();
											local2392[local506].aString61 = Static212.aClass2_Sub4_Sub2_3.method4809();
											if (local2392[local506].aString60.equals(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41)) {
												Static119.aByte25 = local2392[local506].aByte65;
											}
										}
										local542 = Static186.anInt3730;
										while (local542 > 0) {
											local542--;
											local604 = true;
											for (local638 = 0; local638 < local542; local638++) {
												if (local2392[local638].aString59.compareTo(local2392[local638 + 1].aString59) > 0) {
													local2522 = local2392[local638];
													local2392[local638] = local2392[local638 + 1];
													local2392[local638 + 1] = local2522;
													local604 = false;
												}
											}
											if (local604) {
												break;
											}
										}
										Static47.aClass214Array1 = local2392;
										Static231.aClass89_164 = null;
										return true;
									} else if (Static231.aClass89_164 == Static394.aClass89_258) {
										Static212.aClass2_Sub4_Sub2_3.anInt5300 += 28;
										if (Static212.aClass2_Sub4_Sub2_3.method4808()) {
											Static294.method5065(Static212.aClass2_Sub4_Sub2_3, Static212.aClass2_Sub4_Sub2_3.anInt5300 - 28);
										}
										Static231.aClass89_164 = null;
										return true;
									} else if (Static385.aClass89_255 == Static231.aClass89_164) {
										local220 = Static212.aClass2_Sub4_Sub2_3.method4815();
										if (Static212.aClass2_Sub4_Sub2_3.method4815() == 0) {
											Static290.aClass187Array1[local220] = new Class187();
										} else {
											Static212.aClass2_Sub4_Sub2_3.anInt5300--;
											Static290.aClass187Array1[local220] = new Class187(Static212.aClass2_Sub4_Sub2_3);
										}
										Static231.aClass89_164 = null;
										Static177.anInt3381 = Static88.anInt1876;
										return true;
									} else if (Static231.aClass89_164 == Static161.aClass89_123) {
										local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
										local74 = Static212.aClass2_Sub4_Sub2_3.method4829();
										local228 = Static212.aClass2_Sub4_Sub2_3.method4829();
										local249 = Static212.aClass2_Sub4_Sub2_3.method4829();
										if (Static378.method6314(local220) && Static26.aClass161ArrayArray1[local74] != null) {
											for (local497 = local228; local497 < local249; local497++) {
												local506 = Static212.aClass2_Sub4_Sub2_3.method4833();
												if (local497 < Static26.aClass161ArrayArray1[local74].length && Static26.aClass161ArrayArray1[local74][local497] != null) {
													Static26.aClass161ArrayArray1[local74][local497].anInt4246 = local506;
												}
											}
										}
										Static231.aClass89_164 = null;
										return true;
									} else if (Static353.aClass89_230 == Static231.aClass89_164) {
										Static330.method5656(Static143.aClass210_7);
										Static231.aClass89_164 = null;
										return true;
									} else if (Static231.aClass89_164 == Static200.aClass89_150) {
										Static330.method5656(Static285.aClass210_12);
										Static231.aClass89_164 = null;
										return true;
									} else if (Static89.aClass89_74 == Static231.aClass89_164) {
										Static146.anInt2703 = Static212.aClass2_Sub4_Sub2_3.method4815();
										Static231.aClass89_164 = null;
										return true;
									} else if (Static166.aClass89_134 == Static231.aClass89_164) {
										local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
										local74 = Static212.aClass2_Sub4_Sub2_3.method4815();
										local228 = Static212.aClass2_Sub4_Sub2_3.method4815();
										local249 = Static212.aClass2_Sub4_Sub2_3.method4815();
										local497 = Static212.aClass2_Sub4_Sub2_3.method4815();
										local506 = Static212.aClass2_Sub4_Sub2_3.method4829();
										if (Static378.method6314(local220)) {
											Static189.aBooleanArray33[local74] = true;
											Static134.anIntArray164[local74] = local228;
											Static105.anIntArray134[local74] = local249;
											Static43.anIntArray87[local74] = local497;
											Static116.anIntArray149[local74] = local506;
										}
										Static231.aClass89_164 = null;
										return true;
									} else if (Static231.aClass89_164 == Static82.aClass89_66) {
										if (Static363.aFrame2 != null) {
											Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
										}
										@Pc(2782) byte[] local2782 = new byte[Static82.anInt1836];
										Static212.aClass2_Sub4_Sub2_3.method4866(local2782, Static82.anInt1836);
										local452 = Static47.method1462(0, local2782, Static82.anInt1836);
										Static280.method4765(local452, Static328.aClass152_5, Static77.anInt1762 == 1, true);
										Static231.aClass89_164 = null;
										return true;
									} else if (Static380.aClass89_248 == Static231.aClass89_164) {
										Static330.method5656(Static72.aClass210_3);
										Static231.aClass89_164 = null;
										return true;
									} else if (Static235.aClass89_140 == Static231.aClass89_164) {
										Static67.anInt1637 = Static212.aClass2_Sub4_Sub2_3.method4815();
										Static7.anInt7240 = Static212.aClass2_Sub4_Sub2_3.method4804();
										Static243.anInt4502 = Static212.aClass2_Sub4_Sub2_3.method4863();
										for (@Pc(2839) Class2_Sub32 local2839 = (Class2_Sub32) Static120.aClass4_49.method80(); local2839 != null; local2839 = (Class2_Sub32) Static120.aClass4_49.method79()) {
											local74 = (int) (local2839.aLong232 & 0x3FFFL);
											local228 = (int) (local2839.aLong232 >> 14 & 0x3FFFL);
											local249 = (int) (local2839.aLong232 >> 28 & 0x3L);
											if (Static243.anInt4502 == local249 && Static67.anInt1637 <= local74 && Static67.anInt1637 + 8 > local74 && local228 >= Static7.anInt7240 && local228 < Static7.anInt7240 + 8) {
												local2839.method6468();
												Static165.method3154(local74, Static243.anInt4502, local228);
											}
										}
										for (@Pc(2914) Class2_Sub37 local2914 = (Class2_Sub37) Static207.aClass135_26.method3551(); local2914 != null; local2914 = (Class2_Sub37) Static207.aClass135_26.method3552()) {
											if (local2914.anInt6484 >= Static67.anInt1637 && local2914.anInt6484 < Static67.anInt1637 + 8 && local2914.anInt6486 >= Static7.anInt7240 && local2914.anInt6486 < Static7.anInt7240 + 8 && Static243.anInt4502 == local2914.anInt6481) {
												local2914.anInt6485 = 0;
											}
										}
										Static231.aClass89_164 = null;
										return true;
									} else if (Static231.aClass89_164 == Static39.aClass89_34) {
										local1371 = Static212.aClass2_Sub4_Sub2_3.method4815() == 1;
										local452 = Static212.aClass2_Sub4_Sub2_3.method4809();
										local1381 = local452;
										if (local1371) {
											local1381 = Static212.aClass2_Sub4_Sub2_3.method4809();
										}
										local1780 = Static212.aClass2_Sub4_Sub2_3.method4829();
										local1785 = Static212.aClass2_Sub4_Sub2_3.method4833();
										local536 = Static212.aClass2_Sub4_Sub2_3.method4815();
										local542 = Static212.aClass2_Sub4_Sub2_3.method4829();
										@Pc(3014) long local3014 = local1785 + (local1780 << 32);
										@Pc(3016) boolean local3016 = false;
										@Pc(3018) int local3018 = 0;
										while (true) {
											if (local3018 >= 100) {
												if (local536 <= 1 && Static105.method2208(local1381)) {
													local3016 = true;
												}
												break;
											}
											if (local3014 == Static358.aLongArray11[local3018]) {
												local3016 = true;
												break;
											}
											local3018++;
										}
										if (!local3016 && Static212.anInt3785 == 0) {
											Static358.aLongArray11[Static193.anInt3555] = local3014;
											Static193.anInt3555 = (Static193.anInt3555 + 1) % 100;
											@Pc(3071) String local3071 = Static146.method2699(local542).method5602(Static212.aClass2_Sub4_Sub2_3);
											if (local536 == 2) {
												Static220.method3874(0, null, local3071, local542, 18, "<img=1>" + local1381, "<img=1>" + local452);
											} else if (local536 == 1) {
												Static220.method3874(0, null, local3071, local542, 18, "<img=0>" + local1381, "<img=0>" + local452);
											} else {
												Static220.method3874(0, null, local3071, local542, 18, local1381, local452);
											}
										}
										Static231.aClass89_164 = null;
										return true;
									} else if (Static231.aClass89_164 == Static112.aClass89_91) {
										Static243.anInt4502 = Static212.aClass2_Sub4_Sub2_3.method4863();
										Static7.anInt7240 = Static212.aClass2_Sub4_Sub2_3.method4804();
										Static67.anInt1637 = Static212.aClass2_Sub4_Sub2_3.method4811();
										Static231.aClass89_164 = null;
										return true;
									} else if (Static241.aClass89_170 == Static231.aClass89_164) {
										Static235.anInt3363 = 1;
										Static53.anInt3971 = Static88.anInt1876;
										Static231.aClass89_164 = null;
										return true;
									} else if (Static144.aClass89_112 == Static231.aClass89_164) {
										local220 = Static212.aClass2_Sub4_Sub2_3.method4852();
										local74 = Static212.aClass2_Sub4_Sub2_3.method4803();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = Static212.aClass2_Sub4_Sub2_3.method4835();
										local249 = Static212.aClass2_Sub4_Sub2_3.method4806();
										if (local249 == 65535) {
											local249 = -1;
										}
										local497 = Static212.aClass2_Sub4_Sub2_3.method4803();
										if (Static378.method6314(local497)) {
											for (local506 = local74; local506 <= local249; local506++) {
												local1101 = ((long) local220 << 32) + ((long) local506);
												local1109 = (Class2_Sub10) Static327.aClass4_127.method90(local1101);
												if (local1109 != null) {
													local1118 = new Class2_Sub10(local228, local1109.anInt1759);
													local1109.method6468();
												} else if (local506 == -1) {
													local1118 = new Class2_Sub10(local228, Static6.method140(local220).aClass2_Sub10_1.anInt1759);
												} else {
													local1118 = new Class2_Sub10(local228, -1);
												}
												Static327.aClass4_127.method87(local1118, local1101);
											}
										}
										Static231.aClass89_164 = null;
										return true;
									} else if (Static394.aClass89_259 == Static231.aClass89_164) {
										Static301.anInt5700 = Static212.aClass2_Sub4_Sub2_3.method4815();
										for (local220 = 0; local220 < Static301.anInt5700; local220++) {
											Static226.aStringArray35[local220] = Static212.aClass2_Sub4_Sub2_3.method4809();
											Static234.aStringArray39[local220] = Static212.aClass2_Sub4_Sub2_3.method4809();
											if (Static234.aStringArray39[local220].equals("")) {
												Static234.aStringArray39[local220] = Static226.aStringArray35[local220];
											}
											Static371.aStringArray66[local220] = Static212.aClass2_Sub4_Sub2_3.method4809();
											Static190.aStringArray28[local220] = Static212.aClass2_Sub4_Sub2_3.method4809();
											if (Static190.aStringArray28[local220].equals("")) {
												Static190.aStringArray28[local220] = Static371.aStringArray66[local220];
											}
											Static196.aBooleanArray31[local220] = false;
										}
										Static231.aClass89_164 = null;
										Static53.anInt3971 = Static88.anInt1876;
										return true;
									} else if (Static231.aClass89_164 == Static210.aClass89_155) {
										local444 = Static212.aClass2_Sub4_Sub2_3.method4809();
										local74 = Static212.aClass2_Sub4_Sub2_3.method4806();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = Static212.aClass2_Sub4_Sub2_3.method4811();
										local249 = Static212.aClass2_Sub4_Sub2_3.method4811();
										if (local228 >= 1 && local228 <= 8) {
											if (local444.equalsIgnoreCase("null")) {
												local444 = null;
											}
											Static243.aStringArray44[local228 - 1] = local444;
											Static207.anIntArray225[local228 - 1] = local74;
											Static44.aBooleanArray11[local228 - 1] = local249 == 0;
										}
										Static231.aClass89_164 = null;
										return true;
									} else if (Static137.aClass89_106 == Static231.aClass89_164) {
										local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
										local74 = Static212.aClass2_Sub4_Sub2_3.method4806();
										local228 = Static212.aClass2_Sub4_Sub2_3.method4806();
										if (Static378.method6314(local74)) {
											Static231.method4022(local220, local228);
										}
										Static231.aClass89_164 = null;
										return true;
									} else if (Static88.aClass89_73 == Static231.aClass89_164) {
										local220 = Static212.aClass2_Sub4_Sub2_3.method4853();
										local74 = Static212.aClass2_Sub4_Sub2_3.method4803();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = Static212.aClass2_Sub4_Sub2_3.method4835();
										local249 = Static212.aClass2_Sub4_Sub2_3.method4852();
										if (Static378.method6314(local220)) {
											Static216.method3774(local74, local249, local228);
											@Pc(3499) Class188 local3499 = Static313.aClass107_2.method2759(local74);
											Static277.method4680(local3499.anInt5215, local3499.anInt5245, local249, local3499.anInt5241);
											Static376.method6287(local249, local3499.anInt5249, local3499.anInt5252, local3499.anInt5232);
										}
										Static231.aClass89_164 = null;
										return true;
									} else if (Static231.aClass89_164 == Static86.aClass89_72) {
										Static69.method1780(true);
										Static231.aClass89_164 = null;
										return true;
									} else {
										@Pc(3551) boolean local3551;
										if (Static231.aClass89_164 == Static386.aClass89_236) {
											local444 = Static212.aClass2_Sub4_Sub2_3.method4809();
											local3551 = Static212.aClass2_Sub4_Sub2_3.method4815() == 1;
											if (local3551) {
												local452 = Static212.aClass2_Sub4_Sub2_3.method4809();
											} else {
												local452 = local444;
											}
											local249 = Static212.aClass2_Sub4_Sub2_3.method4829();
											@Pc(3569) byte local3569 = Static212.aClass2_Sub4_Sub2_3.method4825();
											@Pc(3571) boolean local3571 = false;
											if (local3569 == -128) {
												local3571 = true;
											}
											if (local3571) {
												if (Static186.anInt3730 == 0) {
													Static231.aClass89_164 = null;
													return true;
												}
												for (local512 = 0; local512 < Static186.anInt3730 && (!Static47.aClass214Array1[local512].aString60.equals(local452) || Static47.aClass214Array1[local512].anInt5978 != local249); local512++) {
												}
												if (local512 < Static186.anInt3730) {
													while (local512 < Static186.anInt3730 - 1) {
														Static47.aClass214Array1[local512] = Static47.aClass214Array1[local512 + 1];
														local512++;
													}
													Static186.anInt3730--;
													Static47.aClass214Array1[Static186.anInt3730] = null;
												}
											} else {
												local1663 = Static212.aClass2_Sub4_Sub2_3.method4809();
												local2522 = new Class214();
												local2522.aString58 = local444;
												local2522.aString60 = local452;
												local2522.aString59 = Static135.method2537(local2522.aString60);
												local2522.aByte65 = local3569;
												local2522.aString61 = local1663;
												local2522.anInt5978 = local249;
												for (local542 = Static186.anInt3730 - 1; local542 >= 0; local542--) {
													local638 = Static47.aClass214Array1[local542].aString59.compareTo(local2522.aString59);
													if (local638 == 0) {
														Static47.aClass214Array1[local542].anInt5978 = local249;
														Static47.aClass214Array1[local542].aByte65 = local3569;
														Static47.aClass214Array1[local542].aString61 = local1663;
														if (local452.equals(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41)) {
															Static119.aByte25 = local3569;
														}
														Static285.anInt5370 = Static88.anInt1876;
														Static231.aClass89_164 = null;
														return true;
													}
													if (local638 < 0) {
														break;
													}
												}
												if (Static186.anInt3730 >= Static47.aClass214Array1.length) {
													Static231.aClass89_164 = null;
													return true;
												}
												for (local638 = Static186.anInt3730 - 1; local638 > local542; local638--) {
													Static47.aClass214Array1[local638 + 1] = Static47.aClass214Array1[local638];
												}
												if (Static186.anInt3730 == 0) {
													Static47.aClass214Array1 = new Class214[100];
												}
												Static47.aClass214Array1[local542 + 1] = local2522;
												Static186.anInt3730++;
												if (local452.equals(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41)) {
													Static119.aByte25 = local3569;
												}
											}
											Static231.aClass89_164 = null;
											Static285.anInt5370 = Static88.anInt1876;
											return true;
										}
										@Pc(3809) String local3809;
										if (Static153.aClass89_117 == Static231.aClass89_164) {
											local220 = Static212.aClass2_Sub4_Sub2_3.method4817();
											local74 = Static212.aClass2_Sub4_Sub2_3.method4836();
											local228 = Static212.aClass2_Sub4_Sub2_3.method4815();
											local3809 = "";
											local1627 = local3809;
											if ((local228 & 0x1) != 0) {
												local3809 = Static212.aClass2_Sub4_Sub2_3.method4809();
												if ((local228 & 0x2) == 0) {
													local1627 = local3809;
												} else {
													local1627 = Static212.aClass2_Sub4_Sub2_3.method4809();
												}
											}
											local1391 = Static212.aClass2_Sub4_Sub2_3.method4809();
											if (local220 == 99) {
												Static158.method2940(local1391);
											} else if (local1627.equals("") || !Static105.method2208(local1627)) {
												Static33.method4200(local3809, local74, local1391, local220, local1627);
											} else {
												Static231.aClass89_164 = null;
												return true;
											}
											Static231.aClass89_164 = null;
											return true;
										} else if (Static231.aClass89_164 == Static43.aClass89_39) {
											Static330.method5656(Static272.aClass210_11);
											Static231.aClass89_164 = null;
											return true;
										} else if (Static231.aClass89_164 == Static177.aClass89_141) {
											local220 = Static212.aClass2_Sub4_Sub2_3.method4836();
											Static354.aClass32_5 = Static328.aClass152_5.method3757(local220);
											Static231.aClass89_164 = null;
											return true;
										} else if (Static272.aClass89_184 == Static231.aClass89_164) {
											Static20.anInt545 = Static212.aClass2_Sub4_Sub2_3.method4863();
											Static331.anInt6206 = Static212.aClass2_Sub4_Sub2_3.method4811();
											Static231.aClass89_164 = null;
											return true;
										} else if (Static221.aClass89_175 == Static231.aClass89_164) {
											local220 = Static212.aClass2_Sub4_Sub2_3.method4815();
											local74 = Static212.aClass2_Sub4_Sub2_3.method4803();
											Static214.aClass226_1.method5786(local74, local220);
											Static231.aClass89_164 = null;
											return true;
										} else if (Static96.aClass89_81 == Static231.aClass89_164) {
											local220 = Static212.aClass2_Sub4_Sub2_3.method4803();
											local74 = Static212.aClass2_Sub4_Sub2_3.method4835();
											local228 = Static212.aClass2_Sub4_Sub2_3.method4803();
											if (local228 == 65535) {
												local228 = -1;
											}
											if (Static378.method6314(local220)) {
												Static139.method2595(local74, local228);
											}
											Static231.aClass89_164 = null;
											return true;
										} else if (Static231.aClass89_164 == Static81.aClass89_152) {
											Static330.method5656(Static242.aClass210_10);
											Static231.aClass89_164 = null;
											return true;
										} else if (Static238.aClass89_167 == Static231.aClass89_164) {
											Static96.anInt2002 = Static212.aClass2_Sub4_Sub2_3.method4815();
											Static93.anInt1950 = Static88.anInt1876;
											Static231.aClass89_164 = null;
											return true;
										} else if (Static165.aClass89_131 == Static231.aClass89_164) {
											local220 = Static212.aClass2_Sub4_Sub2_3.method4836();
											local74 = Static212.aClass2_Sub4_Sub2_3.method4853();
											local228 = Static212.aClass2_Sub4_Sub2_3.method4829();
											if (Static378.method6314(local228)) {
												Static150.method2737(local220, local74);
											}
											Static231.aClass89_164 = null;
											return true;
										} else if (Static231.aClass89_164 == Static261.aClass89_176) {
											local220 = Static212.aClass2_Sub4_Sub2_3.method4844();
											local74 = Static212.aClass2_Sub4_Sub2_3.method4803();
											Static214.aClass226_1.method5786(local74, local220);
											Static231.aClass89_164 = null;
											return true;
										} else if (Static231.aClass89_164 == Static271.aClass89_182) {
											local220 = Static212.aClass2_Sub4_Sub2_3.method4815();
											@Pc(4068) boolean local4068 = (local220 & 0x1) == 1;
											local1381 = Static212.aClass2_Sub4_Sub2_3.method4809();
											local3809 = Static212.aClass2_Sub4_Sub2_3.method4809();
											if (local3809.equals("")) {
												local3809 = local1381;
											}
											local1627 = Static212.aClass2_Sub4_Sub2_3.method4809();
											local1391 = Static212.aClass2_Sub4_Sub2_3.method4809();
											if (local1391.equals("")) {
												local1391 = local1627;
											}
											if (local4068) {
												for (local512 = 0; local512 < Static301.anInt5700; local512++) {
													if (Static234.aStringArray39[local512].equals(local1391)) {
														Static226.aStringArray35[local512] = local1381;
														Static234.aStringArray39[local512] = local3809;
														Static371.aStringArray66[local512] = local1627;
														Static190.aStringArray28[local512] = local1391;
														break;
													}
												}
											} else {
												Static226.aStringArray35[Static301.anInt5700] = local1381;
												Static234.aStringArray39[Static301.anInt5700] = local3809;
												Static371.aStringArray66[Static301.anInt5700] = local1627;
												Static190.aStringArray28[Static301.anInt5700] = local1391;
												Static196.aBooleanArray31[Static301.anInt5700] = (local220 & 0x2) == 2;
												Static301.anInt5700++;
											}
											Static231.aClass89_164 = null;
											Static53.anInt3971 = Static88.anInt1876;
											return true;
										} else if (Static146.aClass89_113 == Static231.aClass89_164) {
											local444 = Static212.aClass2_Sub4_Sub2_3.method4809();
											local74 = Static212.aClass2_Sub4_Sub2_3.method4853();
											local228 = Static212.aClass2_Sub4_Sub2_3.method4803();
											if (Static378.method6314(local228)) {
												Static10.method239(local74, local444);
											}
											Static231.aClass89_164 = null;
											return true;
										} else if (Static231.aClass89_164 == Static133.aClass89_103) {
											local220 = Static212.aClass2_Sub4_Sub2_3.method4811();
											local74 = Static212.aClass2_Sub4_Sub2_3.method4803();
											if (local74 == 65535) {
												local74 = -1;
											}
											local228 = Static212.aClass2_Sub4_Sub2_3.method4811();
											Static138.method2578(local220, local228, local74);
											Static231.aClass89_164 = null;
											return true;
										} else if (Static231.aClass89_164 == Static42.aClass89_226) {
											local220 = Static212.aClass2_Sub4_Sub2_3.method4863();
											local74 = Static212.aClass2_Sub4_Sub2_3.method4833();
											local228 = Static212.aClass2_Sub4_Sub2_3.method4829();
											if (local228 == 65535) {
												local228 = -1;
											}
											Static175.method3324(local228, local74, local220);
											Static231.aClass89_164 = null;
											return true;
										} else {
											@Pc(4300) long local4300;
											if (Static125.aClass89_249 == Static231.aClass89_164) {
												local1371 = Static212.aClass2_Sub4_Sub2_3.method4815() == 1;
												local452 = Static212.aClass2_Sub4_Sub2_3.method4809();
												local1381 = local452;
												if (local1371) {
													local1381 = Static212.aClass2_Sub4_Sub2_3.method4809();
												}
												local1780 = Static212.aClass2_Sub4_Sub2_3.method4798();
												local1785 = Static212.aClass2_Sub4_Sub2_3.method4829();
												local4300 = Static212.aClass2_Sub4_Sub2_3.method4833();
												local638 = Static212.aClass2_Sub4_Sub2_3.method4815();
												@Pc(4310) long local4310 = (local1785 << 32) + local4300;
												@Pc(4312) boolean local4312 = false;
												@Pc(4314) int local4314 = 0;
												while (true) {
													if (local4314 >= 100) {
														if (local638 <= 1) {
															if (Static56.aBoolean123 && !Static101.aBoolean159 || Static109.aBoolean166) {
																local4312 = true;
															} else if (Static105.method2208(local1381)) {
																local4312 = true;
															}
														}
														break;
													}
													if (Static358.aLongArray11[local4314] == local4310) {
														local4312 = true;
														break;
													}
													local4314++;
												}
												if (!local4312 && Static212.anInt3785 == 0) {
													Static358.aLongArray11[Static193.anInt3555] = local4310;
													Static193.anInt3555 = (Static193.anInt3555 + 1) % 100;
													@Pc(4372) String local4372 = Static153.method2772(Static308.method5276(Static212.aClass2_Sub4_Sub2_3));
													if (local638 == 2 || local638 == 3) {
														Static220.method3874(0, Static170.method3229(local1780), local4372, -1, 9, "<img=1>" + local1381, "<img=1>" + local452);
													} else if (local638 == 1) {
														Static220.method3874(0, Static170.method3229(local1780), local4372, -1, 9, "<img=0>" + local1381, "<img=0>" + local452);
													} else {
														Static220.method3874(0, Static170.method3229(local1780), local4372, -1, 9, local1381, local452);
													}
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static321.aClass89_216) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4815();
												local3551 = (local74 & 0x1) == 1;
												while (Static82.anInt1836 > Static212.aClass2_Sub4_Sub2_3.anInt5300) {
													local249 = Static212.aClass2_Sub4_Sub2_3.method4817();
													local497 = Static212.aClass2_Sub4_Sub2_3.method4829();
													local506 = 0;
													if (local497 != 0) {
														local506 = Static212.aClass2_Sub4_Sub2_3.method4815();
														if (local506 == 255) {
															local506 = Static212.aClass2_Sub4_Sub2_3.method4836();
														}
													}
													Static62.method2391(local249, local506, local220, local497 - 1, local3551);
												}
												Static106.anIntArray135[Static54.anInt1417++ & 0x1F] = local220;
												Static231.aClass89_164 = null;
												return true;
											} else if (Static207.aClass89_154 == Static231.aClass89_164) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4852();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4853();
												local228 = Static212.aClass2_Sub4_Sub2_3.method4829();
												if (local228 == 65535) {
													local228 = -1;
												}
												if (Static378.method6314(local74)) {
													Static190.method3501(local228, -1, 1, local220);
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static33.aClass89_171) {
												Static330.method5656(Static200.aClass210_9);
												Static231.aClass89_164 = null;
												return true;
											} else if (Static322.aClass89_217 == Static231.aClass89_164) {
												local444 = Static212.aClass2_Sub4_Sub2_3.method4809();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4803();
												local228 = Static212.aClass2_Sub4_Sub2_3.method4852();
												if (Static378.method6314(local74)) {
													Static319.method5432(local228, local444);
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static193.aClass89_146 == Static231.aClass89_164) {
												Static330.method5656(Static110.aClass210_5);
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static319.aClass89_211) {
												Static69.method1780(false);
												Static231.aClass89_164 = null;
												return true;
											} else if (Static164.aClass89_130 == Static231.aClass89_164) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4844();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4803();
												local228 = Static212.aClass2_Sub4_Sub2_3.method4850();
												local249 = Static212.aClass2_Sub4_Sub2_3.method4800();
												if (Static378.method6314(local74)) {
													Static129.method2438(local249, local228, local220);
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static296.aClass89_199 == Static231.aClass89_164) {
												Static181.method3375(false);
												Static231.aClass89_164 = null;
												return false;
											} else if (Static231.aClass89_164 == Static336.aClass89_225) {
												Static154.aClass170_2 = Static335.method5695(Static212.aClass2_Sub4_Sub2_3.method4815());
												Static231.aClass89_164 = null;
												return true;
											} else if (Static84.aClass89_70 == Static231.aClass89_164) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4804();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4853();
												local3551 = (local220 & 0x1) == 1;
												Static166.method3186(local3551, local74);
												Static106.anIntArray135[Static54.anInt1417++ & 0x1F] = local74;
												Static231.aClass89_164 = null;
												return true;
											} else if (Static11.aClass89_13 == Static231.aClass89_164) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4852();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4806();
												if (local74 == 65535) {
													local74 = -1;
												}
												local228 = Static212.aClass2_Sub4_Sub2_3.method4853();
												if (Static378.method6314(local228)) {
													Static190.method3501(local74, -1, 2, local220);
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static93.aClass89_76) {
												local272 = Static212.aClass2_Sub4_Sub2_3.method4801();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4829();
												Static214.aClass226_1.method5785(local272, local74);
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static98.aClass89_83) {
												Static383.method6379(Static212.aClass2_Sub4_Sub2_3.method4809());
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static7.aClass89_257) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4829();
												local228 = Static212.aClass2_Sub4_Sub2_3.method4829();
												local249 = Static212.aClass2_Sub4_Sub2_3.method4853();
												local497 = Static212.aClass2_Sub4_Sub2_3.method4844();
												if (Static378.method6314(local74)) {
													Static190.method3501(local228 | local249 << 16, local220, 7, local497);
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static113.aClass89_94 == Static231.aClass89_164) {
												local1371 = Static212.aClass2_Sub4_Sub2_3.method4815() == 1;
												local452 = Static212.aClass2_Sub4_Sub2_3.method4809();
												local1381 = local452;
												if (local1371) {
													local1381 = Static212.aClass2_Sub4_Sub2_3.method4809();
												}
												local1780 = Static212.aClass2_Sub4_Sub2_3.method4798();
												local1785 = Static212.aClass2_Sub4_Sub2_3.method4829();
												local4300 = Static212.aClass2_Sub4_Sub2_3.method4833();
												local638 = Static212.aClass2_Sub4_Sub2_3.method4815();
												@Pc(4892) int local4892 = Static212.aClass2_Sub4_Sub2_3.method4829();
												@Pc(4898) long local4898 = local4300 + (local1785 << 32);
												@Pc(4900) boolean local4900 = false;
												@Pc(4902) int local4902 = 0;
												while (true) {
													if (local4902 >= 100) {
														if (local638 <= 1 && Static105.method2208(local1381)) {
															local4900 = true;
														}
														break;
													}
													if (Static358.aLongArray11[local4902] == local4898) {
														local4900 = true;
														break;
													}
													local4902++;
												}
												if (!local4900 && Static212.anInt3785 == 0) {
													Static358.aLongArray11[Static193.anInt3555] = local4898;
													Static193.anInt3555 = (Static193.anInt3555 + 1) % 100;
													@Pc(4955) String local4955 = Static146.method2699(local4892).method5602(Static212.aClass2_Sub4_Sub2_3);
													if (local638 == 2) {
														Static220.method3874(0, Static170.method3229(local1780), local4955, local4892, 20, "<img=1>" + local1381, "<img=1>" + local452);
													} else if (local638 == 1) {
														Static220.method3874(0, Static170.method3229(local1780), local4955, local4892, 20, "<img=0>" + local1381, "<img=0>" + local452);
													} else {
														Static220.method3874(0, Static170.method3229(local1780), local4955, local4892, 20, local1381, local452);
													}
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static36.aClass89_31) {
												Static330.method5656(Static27.aClass210_2);
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static272.aClass89_185) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4806();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4852();
												if (Static378.method6314(local220)) {
													Static190.method3501(Static234.anInt4226, 0, 5, local74);
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static391.aClass89_256 == Static231.aClass89_164) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4815();
												local3551 = (local74 & 0x1) == 1;
												Static286.method4925(local3551, local220);
												local249 = Static212.aClass2_Sub4_Sub2_3.method4829();
												for (local497 = 0; local497 < local249; local497++) {
													local506 = Static212.aClass2_Sub4_Sub2_3.method4803();
													local512 = Static212.aClass2_Sub4_Sub2_3.method4815();
													if (local512 == 255) {
														local512 = Static212.aClass2_Sub4_Sub2_3.method4835();
													}
													Static62.method2391(local497, local512, local220, local506 - 1, local3551);
												}
												Static106.anIntArray135[Static54.anInt1417++ & 0x1F] = local220;
												Static231.aClass89_164 = null;
												return true;
											} else if (Static80.aClass89_234 == Static231.aClass89_164) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4803();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4815();
												local228 = Static212.aClass2_Sub4_Sub2_3.method4806();
												@Pc(5170) Class11_Sub5_Sub2_Sub2 local5170 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local220];
												if (local5170 != null) {
													Static307.method5256(local228, local5170, local74);
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static83.aClass89_68 == Static231.aClass89_164) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4836();
												local228 = Static212.aClass2_Sub4_Sub2_3.method4803();
												if (Static378.method6314(local220)) {
													Static322.method5481(local228, local74);
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static179.aClass89_143 == Static231.aClass89_164) {
												if (Static82.anInt1836 == 0) {
													Static330.aString62 = Static66.aClass79_34.method2267(Static295.anInt5581);
												} else {
													Static330.aString62 = Static212.aClass2_Sub4_Sub2_3.method4809();
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static30.aClass89_25) {
												Static181.method3375(true);
												Static231.aClass89_164 = null;
												return false;
											} else if (Static231.aClass89_164 == Static371.aClass89_244) {
												Static330.method5656(Static19.aClass210_1);
												Static231.aClass89_164 = null;
												return true;
											} else if (Static94.aClass89_79 == Static231.aClass89_164) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
												local452 = Static212.aClass2_Sub4_Sub2_3.method4809();
												local228 = Static212.aClass2_Sub4_Sub2_3.method4803();
												if (Static378.method6314(local228)) {
													Static10.method239(local220, local452);
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static354.aClass89_42) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4835();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4853();
												local228 = Static212.aClass2_Sub4_Sub2_3.method4806();
												local249 = Static212.aClass2_Sub4_Sub2_3.method4806();
												local497 = Static212.aClass2_Sub4_Sub2_3.method4806();
												if (Static378.method6314(local74)) {
													Static277.method4680(local497, local249, local220, local228);
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static201.aClass89_151 == Static231.aClass89_164) {
												Static330.method5656(Static109.aClass210_4);
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static30.aClass89_26) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4863();
												local74 = local220 >> 2;
												local228 = local220 & 0x3;
												local249 = Static150.anIntArray174[local74];
												local497 = Static212.aClass2_Sub4_Sub2_3.method4835();
												local506 = local497 >> 28 & 0x3;
												local512 = local497 >> 14 & 0x3FFF;
												local536 = local497 & 0x3FFF;
												local542 = Static212.aClass2_Sub4_Sub2_3.method4853();
												@Pc(5371) int local5371 = local536 - Static148.anInt2719;
												if (local542 == 65535) {
													local542 = -1;
												}
												local512 -= Static164.anInt3140;
												Static391.method6452(local74, local542, local5371, local249, local228, local512, local506);
												Static231.aClass89_164 = null;
												return true;
											} else if (Static139.aClass89_108 == Static231.aClass89_164) {
												Static67.anInt1637 = Static212.aClass2_Sub4_Sub2_3.method4811();
												Static243.anInt4502 = Static212.aClass2_Sub4_Sub2_3.method4815();
												Static7.anInt7240 = Static212.aClass2_Sub4_Sub2_3.method4804();
												while (Static212.aClass2_Sub4_Sub2_3.anInt5300 < Static82.anInt1836) {
													@Pc(5421) Class210 local5421 = Static324.method5539()[Static212.aClass2_Sub4_Sub2_3.method4815()];
													Static330.method5656(local5421);
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static230.aClass89_163 == Static231.aClass89_164) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4815();
												local74 = local220 >> 5;
												local228 = local220 & 0x1F;
												if (local228 == 0) {
													Static50.aClass84Array1[local74] = null;
													Static231.aClass89_164 = null;
													return true;
												}
												@Pc(5468) Class84 local5468 = new Class84();
												local5468.anInt2355 = local228;
												local5468.anInt2363 = Static212.aClass2_Sub4_Sub2_3.method4815();
												if (local5468.anInt2363 >= 0 && local5468.anInt2363 < Static230.aClass13Array16.length) {
													if (local5468.anInt2355 == 1 || local5468.anInt2355 == 10) {
														local5468.anInt2354 = Static212.aClass2_Sub4_Sub2_3.method4829();
														Static212.aClass2_Sub4_Sub2_3.anInt5300 += 6;
													} else if (local5468.anInt2355 >= 2 && local5468.anInt2355 <= 6) {
														if (local5468.anInt2355 == 2) {
															local5468.anInt2350 = 64;
															local5468.anInt2356 = 64;
														}
														if (local5468.anInt2355 == 3) {
															local5468.anInt2356 = 64;
															local5468.anInt2350 = 0;
														}
														if (local5468.anInt2355 == 4) {
															local5468.anInt2356 = 64;
															local5468.anInt2350 = 128;
														}
														if (local5468.anInt2355 == 5) {
															local5468.anInt2356 = 0;
															local5468.anInt2350 = 64;
														}
														if (local5468.anInt2355 == 6) {
															local5468.anInt2350 = 64;
															local5468.anInt2356 = 128;
														}
														local5468.anInt2355 = 2;
														local5468.anInt2359 = Static212.aClass2_Sub4_Sub2_3.method4815();
														local5468.anInt2352 = Static212.aClass2_Sub4_Sub2_3.method4829();
														local5468.anInt2364 = Static212.aClass2_Sub4_Sub2_3.method4829();
														local5468.anInt2362 = Static212.aClass2_Sub4_Sub2_3.method4815();
														local5468.anInt2349 = Static212.aClass2_Sub4_Sub2_3.method4829();
													}
													local5468.anInt2361 = Static212.aClass2_Sub4_Sub2_3.method4829();
													if (local5468.anInt2361 == 65535) {
														local5468.anInt2361 = -1;
													}
													Static50.aClass84Array1[local74] = local5468;
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static164.aClass89_129) {
												Static330.method5656(Static140.aClass210_6);
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static152.aClass89_116) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
												local452 = Static212.aClass2_Sub4_Sub2_3.method4809();
												@Pc(5648) Object[] local5648 = new Object[local452.length() + 1];
												for (local249 = local452.length() - 1; local249 >= 0; local249--) {
													if (local452.charAt(local249) == 's') {
														local5648[local249 + 1] = Static212.aClass2_Sub4_Sub2_3.method4809();
													} else {
														local5648[local249 + 1] = Integer.valueOf(Static212.aClass2_Sub4_Sub2_3.method4836());
													}
												}
												local5648[0] = Integer.valueOf(Static212.aClass2_Sub4_Sub2_3.method4836());
												if (Static378.method6314(local220)) {
													@Pc(5704) Class2_Sub13 local5704 = new Class2_Sub13();
													local5704.anObjectArray4 = local5648;
													Static198.method3591(local5704);
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static202.aClass89_153 == Static231.aClass89_164) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4829();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4836();
												if (Static378.method6314(local220)) {
													@Pc(5735) Class2_Sub7 local5735 = (Class2_Sub7) Static329.aClass4_130.method90((long) local74);
													if (local5735 != null) {
														Static276.method4655(false, local5735, true);
													}
													if (Static192.aClass161_8 != null) {
														Static200.method3645(Static192.aClass161_8);
														Static192.aClass161_8 = null;
													}
												}
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static247.aClass89_174) {
												Static330.method5656(Static164.aClass210_8);
												Static231.aClass89_164 = null;
												return true;
											} else if (Static231.aClass89_164 == Static97.aClass89_82) {
												local220 = Static212.aClass2_Sub4_Sub2_3.method4836();
												local74 = Static212.aClass2_Sub4_Sub2_3.method4803();
												local228 = Static212.aClass2_Sub4_Sub2_3.method4816();
												if (Static378.method6314(local74)) {
													Static53.method3952(local228, local220);
												}
												Static231.aClass89_164 = null;
												return true;
											} else {
												Static262.method6253(null, "T1 - " + (Static231.aClass89_164 == null ? -1 : Static231.aClass89_164.method2399()) + "," + (Static66.aClass89_57 == null ? -1 : Static66.aClass89_57.method2399()) + "," + (Static39.aClass89_35 == null ? -1 : Static39.aClass89_35.method2399()) + " - " + Static82.anInt1836);
												Static99.method2144();
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!nf;B)V")
	public static void method1822(@OriginalArg(0) Class12_Sub4 arg0) {
		arg0.aClass11_1 = null;
		@Pc(10) int local10 = arg0.aClass12_Sub2Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass12_Sub2Array1[local12].aBoolean29 = false;
		}
		@Pc(28) Class36[] local28 = Class2_Sub43.aClass36Array1;
		synchronized (Class2_Sub43.aClass36Array1) {
			if (local10 < Class2_Sub43.aClass36Array1.length && Static206.anIntArray224[local10] < 200) {
				Class2_Sub43.aClass36Array1[local10].method1418(arg0);
				@Pc(49) int local49 = Static206.anIntArray224[local10]++;
			}
		}
	}
}
