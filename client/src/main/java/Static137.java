import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array13;

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "Lclient!r;")
	public static Class197 aClass197_33;

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "Lclient!h;")
	public static final Class89 aClass89_106 = new Class89(14, 6);

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	public static void method2549() {
		if (Static86.anInt1870 > 0) {
			Static86.anInt1870--;
		}
		if (Static151.anInt2773 > 1) {
			Static151.anInt2773--;
			Static93.anInt1950 = Static88.anInt1876;
		}
		if (Static101.aBoolean158) {
			Static101.aBoolean158 = false;
			Static211.method3725();
			return;
		}
		if (!Static375.aBoolean477) {
			Static147.method2703();
		}
		for (@Pc(36) int local36 = 0; local36 < 100 && Static235.method3341(); local36++) {
		}
		if (Static347.anInt6442 != 30) {
			return;
		}
		Static5.method88(Static257.aClass2_Sub4_Sub2_4, Static163.aClass145_116.method3702());
		if (Static385.aClass2_Sub16_2 == null) {
			if (Static204.method3685() >= Static375.aLong222) {
				Static385.aClass2_Sub16_2 = Static4.aClass162_1.method4114(Static216.aString36);
			}
		} else if (Static385.aClass2_Sub16_2.anInt2419 != -1) {
			Static91.method1960(Static168.aClass145_268);
			Static257.aClass2_Sub4_Sub2_4.method4843(Static385.aClass2_Sub16_2.anInt2419);
			Static385.aClass2_Sub16_2 = null;
			Static375.aLong222 = Static204.method3685() + 30000L;
		}
		@Pc(112) int local112;
		@Pc(135) int local135;
		@Pc(153) int local153;
		@Pc(169) boolean local169;
		@Pc(219) int local219;
		@Pc(225) int local225;
		@Pc(236) int local236;
		if (Static370.aClass2_Sub24_1 != null || Static368.aLong217 < Static204.method3685() - 2000L) {
			@Pc(109) boolean local109 = false;
			local112 = Static257.aClass2_Sub4_Sub2_4.anInt5300;
			for (@Pc(117) Class2_Sub24 local117 = (Class2_Sub24) Static277.aClass135_31.method3551(); local117 != null && Static257.aClass2_Sub4_Sub2_4.anInt5300 - local112 < 240; local117 = (Class2_Sub24) Static277.aClass135_31.method3552()) {
				local117.method6468();
				local135 = local117.method5242();
				if (local135 < 0) {
					local135 = 0;
				} else if (local135 > 65534) {
					local135 = 65534;
				}
				local153 = local117.method5243();
				if (local153 < 0) {
					local153 = 0;
				} else if (local153 > 65534) {
					local153 = 65534;
				}
				local169 = false;
				if (local117.method5242() == -1 && local117.method5243() == -1) {
					local153 = -1;
					local169 = true;
					local135 = -1;
				}
				if (Static289.anInt5495 != local153 || local135 != Static117.anInt2376) {
					if (!local109) {
						Static91.method1960(Static91.aClass145_69);
						Static257.aClass2_Sub4_Sub2_4.method4842(0);
						local112 = Static257.aClass2_Sub4_Sub2_4.anInt5300;
						local109 = true;
					}
					local219 = local153 - Static289.anInt5495;
					Static289.anInt5495 = local153;
					local225 = local135 - Static117.anInt2376;
					Static117.anInt2376 = local135;
					local236 = (int) ((local117.method5248() - Static368.aLong217) / 20L);
					if (local236 < 8 && local219 >= -32 && local219 <= 31 && local225 >= -32 && local225 <= 31) {
						local219 += 32;
						local225 += 32;
						Static257.aClass2_Sub4_Sub2_4.method4843((local219 << 6) + (local236 << 12) + local225);
					} else if (local236 < 32 && local219 >= -128 && local219 <= 127 && local225 >= -128 && local225 <= 127) {
						local225 += 128;
						local219 += 128;
						Static257.aClass2_Sub4_Sub2_4.method4842(local236 + 128);
						Static257.aClass2_Sub4_Sub2_4.method4843((local219 << 8) + local225);
					} else if (local236 >= 32) {
						Static257.aClass2_Sub4_Sub2_4.method4843(local236 + 57344);
						if (local169) {
							Static257.aClass2_Sub4_Sub2_4.method4813(Integer.MIN_VALUE);
						} else {
							Static257.aClass2_Sub4_Sub2_4.method4813(local153 | local135 << 16);
						}
					} else {
						Static257.aClass2_Sub4_Sub2_4.method4842(local236 + 192);
						if (local169) {
							Static257.aClass2_Sub4_Sub2_4.method4813(Integer.MIN_VALUE);
						} else {
							Static257.aClass2_Sub4_Sub2_4.method4813(local135 << 16 | local153);
						}
					}
					Static368.aLong217 = local117.method5248();
				}
			}
			if (local109) {
				Static257.aClass2_Sub4_Sub2_4.method4861(Static257.aClass2_Sub4_Sub2_4.anInt5300 - local112);
			}
		}
		@Pc(410) int local410;
		@Pc(463) int local463;
		if (Static370.aClass2_Sub24_1 != null) {
			@Pc(394) long local394 = (Static370.aClass2_Sub24_1.method5248() - Static271.aLong146) / 50L;
			if (local394 > 32767L) {
				local394 = 32767L;
			}
			Static271.aLong146 = Static370.aClass2_Sub24_1.method5248();
			local410 = Static370.aClass2_Sub24_1.method5242();
			if (local410 < 0) {
				local410 = 0;
			} else if (local410 > 65535) {
				local410 = 65535;
			}
			local135 = Static370.aClass2_Sub24_1.method5243();
			if (local135 < 0) {
				local135 = 0;
			} else if (local135 > 65535) {
				local135 = 65535;
			}
			@Pc(446) byte local446 = 0;
			if (Static370.aClass2_Sub24_1.method5247() == 2) {
				local446 = 1;
			}
			Static91.method1960(Static363.aClass145_240);
			local463 = (int) local394;
			Static257.aClass2_Sub4_Sub2_4.method4843(local446 << 15 | local463);
			Static257.aClass2_Sub4_Sub2_4.method4848(local135 | local410 << 16);
		}
		@Pc(483) int local483;
		if (Static6.anInt159 > 0) {
			local483 = 0;
			for (local112 = 0; local112 < Static6.anInt159; local112++) {
				if (Static156.aClass37Array1[local112].method1459()) {
					local483++;
				}
			}
			if (local483 > 0) {
				Static91.method1960(Static388.aClass145_266);
				if (local483 > 75) {
					local483 = 75;
				}
				Static257.aClass2_Sub4_Sub2_4.method4842(local483 * 3);
				for (local410 = 0; local410 < Static6.anInt159; local410++) {
					@Pc(531) Class37 local531 = Static156.aClass37Array1[local410];
					if (local531.method1459()) {
						@Pc(544) long local544 = (local531.method1457() - Static352.aLong202) / 50L;
						Static352.aLong202 = local531.method1457();
						if (local544 > 65535L) {
							local544 = 65535L;
						}
						Static257.aClass2_Sub4_Sub2_4.method4842(local531.method1461());
						Static257.aClass2_Sub4_Sub2_4.method4843((int) local544);
					}
				}
			}
		}
		if (Static383.anInt7153 > 0) {
			Static383.anInt7153--;
		}
		if (Static100.aBoolean156 && Static383.anInt7153 <= 0) {
			Static100.aBoolean156 = false;
			Static383.anInt7153 = 20;
			Static91.method1960(Static304.aClass145_200);
			Static257.aClass2_Sub4_Sub2_4.method4843((int) Static277.aFloat67 >> 3);
			Static257.aClass2_Sub4_Sub2_4.method4830((int) Static31.aFloat28 >> 3);
		}
		if (Static242.aBoolean306 && !Static343.aBoolean431) {
			Static343.aBoolean431 = true;
			Static91.method1960(Static242.aClass145_159);
			Static257.aClass2_Sub4_Sub2_4.method4842(1);
		}
		if (!Static242.aBoolean306 && Static343.aBoolean431) {
			Static343.aBoolean431 = false;
			Static91.method1960(Static242.aClass145_159);
			Static257.aClass2_Sub4_Sub2_4.method4842(0);
		}
		if (!Static236.aBoolean288) {
			Static91.method1960(Static253.aClass145_166);
			Static257.aClass2_Sub4_Sub2_4.method4842(0);
			local483 = Static257.aClass2_Sub4_Sub2_4.anInt5300;
			@Pc(672) Class2_Sub4 local672 = Static218.aClass177_Sub1_2.method4494();
			Static257.aClass2_Sub4_Sub2_4.method4857(local672.aByteArray73, local672.anInt5300);
			Static257.aClass2_Sub4_Sub2_4.method4861(Static257.aClass2_Sub4_Sub2_4.anInt5300 - local483);
			Static236.aBoolean288 = true;
		}
		if (Static330.aClass67ArrayArrayArray3 != null) {
			if (Static314.anInt5911 == 2) {
				Static222.method3917();
			} else if (Static314.anInt5911 == 3) {
				Static199.method5249();
			}
		}
		if (Static140.aBoolean187) {
			Static140.aBoolean187 = false;
		} else {
			Static296.aFloat68 /= 2.0F;
		}
		if (Static369.aBoolean471) {
			Static369.aBoolean471 = false;
		} else {
			Static184.aFloat39 /= 2.0F;
		}
		Static183.method68();
		if (Static347.anInt6442 != 30) {
			return;
		}
		Static56.method1611();
		Static308.method5274();
		Static111.method2274();
		Static216.method3777();
		Static268.anInt4955++;
		if (Static268.anInt4955 > 750) {
			Static211.method3725();
			return;
		}
		Static386.method6029();
		Static61.method1673();
		Static303.method5210();
		for (local483 = Static214.aClass226_1.method5783(true); local483 != -1; local483 = Static214.aClass226_1.method5783(false)) {
			Static75.method1835(local483);
			Static41.anIntArray85[Static12.anInt269++ & 0x1F] = local483;
		}
		@Pc(830) Class161 local830;
		for (@Pc(790) Class2_Sub2_Sub7 local790 = Static129.method2437(); local790 != null; local790 = Static129.method2437()) {
			local410 = local790.method2307();
			local135 = local790.method2309();
			if (local410 == 1) {
				Static75.anIntArray117[local135] = local790.anInt2289;
				Static273.aBoolean374 |= Static89.aBooleanArray18[local135];
				Static140.anIntArray167[Static217.anInt3818++ & 0x1F] = local135;
			} else if (local410 == 2) {
				Static75.aStringArray11[local135] = local790.aString21;
				Static349.anIntArray444[Static58.anInt1483++ & 0x1F] = local135;
			} else if (local410 == 3) {
				local830 = Static6.method140(local135);
				if (!local790.aString21.equals(local830.aString47)) {
					local830.aString47 = local790.aString21;
					Static200.method3645(local830);
				}
			} else if (local410 == 4) {
				local830 = Static6.method140(local135);
				local463 = local790.anInt2289;
				local219 = local790.anInt2290;
				local225 = local790.anInt2284;
				if (local830.anInt4288 != local463 || local219 != local830.anInt4313 || local830.anInt4236 != local225) {
					local830.anInt4313 = local219;
					local830.anInt4236 = local225;
					local830.anInt4288 = local463;
					Static200.method3645(local830);
				}
			} else if (local410 == 5) {
				local830 = Static6.method140(local135);
				if (local790.anInt2289 != local830.anInt4299 || local790.anInt2289 == -1) {
					local830.anInt4316 = 1;
					local830.anInt4247 = 0;
					local830.anInt4299 = local790.anInt2289;
					local830.anInt4283 = 0;
					Static200.method3645(local830);
				}
			} else if (local410 == 6) {
				local153 = local790.anInt2289;
				local463 = local153 >> 10 & 0x1F;
				local219 = local153 >> 5 & 0x1F;
				local225 = local153 & 0x1F;
				local236 = (local463 << 19) + ((local219 << 11) + (local225 << 3));
				@Pc(1214) Class161 local1214 = Static6.method140(local135);
				if (local1214.anInt4290 != local236) {
					local1214.anInt4290 = local236;
					Static200.method3645(local1214);
				}
			} else if (local410 == 7) {
				local830 = Static6.method140(local135);
				local169 = local790.anInt2289 == 1;
				if (local830.aBoolean284 != local169) {
					local830.aBoolean284 = local169;
					Static200.method3645(local830);
				}
			} else if (local410 == 8) {
				local830 = Static6.method140(local135);
				if (local790.anInt2289 != local830.anInt4320 || local830.anInt4274 != local790.anInt2290 || local790.anInt2284 != local830.anInt4255) {
					local830.anInt4255 = local790.anInt2284;
					local830.anInt4274 = local790.anInt2290;
					local830.anInt4320 = local790.anInt2289;
					if (local830.anInt4300 != -1) {
						if (local830.anInt4251 > 0) {
							local830.anInt4255 = local830.anInt4255 * 32 / local830.anInt4251;
						} else if (local830.anInt4294 > 0) {
							local830.anInt4255 = local830.anInt4255 * 32 / local830.anInt4294;
						}
					}
					Static200.method3645(local830);
				}
			} else if (local410 == 9) {
				local830 = Static6.method140(local135);
				if (local830.anInt4300 != local790.anInt2289 || local830.anInt4240 != local790.anInt2290) {
					local830.anInt4240 = local790.anInt2290;
					local830.anInt4300 = local790.anInt2289;
					Static200.method3645(local830);
				}
			} else if (local410 == 10) {
				local830 = Static6.method140(local135);
				if (local790.anInt2289 != local830.anInt4278 || local790.anInt2290 != local830.anInt4250 || local830.anInt4319 != local790.anInt2284) {
					local830.anInt4319 = local790.anInt2284;
					local830.anInt4278 = local790.anInt2289;
					local830.anInt4250 = local790.anInt2290;
					Static200.method3645(local830);
				}
			} else if (local410 == 11) {
				local830 = Static6.method140(local135);
				local830.aByte46 = 0;
				local830.aByte45 = 0;
				local830.anInt4254 = local830.anInt4249 = local790.anInt2290;
				local830.anInt4305 = local830.anInt4241 = local790.anInt2289;
				Static200.method3645(local830);
			} else if (local410 == 12) {
				local830 = Static6.method140(local135);
				local463 = local790.anInt2289;
				if (local830 != null && local830.anInt4272 == 0) {
					if (local463 > local830.anInt4266 - local830.anInt4261) {
						local463 = local830.anInt4266 - local830.anInt4261;
					}
					if (local463 < 0) {
						local463 = 0;
					}
					if (local463 != local830.anInt4259) {
						local830.anInt4259 = local463;
						Static200.method3645(local830);
					}
				}
			} else if (local410 == 14) {
				local830 = Static6.method140(local135);
				local830.anInt4295 = local790.anInt2289;
			} else if (local410 == 15) {
				Static312.anInt5844 = local790.anInt2290;
				Static370.aBoolean474 = true;
				Static358.anInt6550 = local790.anInt2289;
			} else if (local410 == 16) {
				local830 = Static6.method140(local135);
				local830.anInt4318 = local790.anInt2289;
			}
		}
		if (Static93.anInt1951 != 0) {
			Static313.anInt5878 += 20;
			if (Static313.anInt5878 >= 400) {
				Static93.anInt1951 = 0;
			}
		}
		Static165.anInt3148++;
		if (Static64.aClass161_2 != null) {
			Static112.anInt2293++;
			if (Static112.anInt2293 >= 15) {
				Static200.method3645(Static64.aClass161_2);
				Static64.aClass161_2 = null;
			}
		}
		Static227.aClass161_11 = null;
		Static182.aClass161_7 = null;
		Static278.aBoolean377 = false;
		Static301.aBoolean403 = false;
		Static374.method6274(-1, null, -1);
		Static65.method1735(-1, null, -1);
		Static309.method5278();
		Static88.anInt1876++;
		if (Static332.aBoolean427) {
			Static91.method1960(Static372.aClass145_252);
			Static257.aClass2_Sub4_Sub2_4.method4848(Static283.anInt5351 << 28 | Static282.anInt5347 << 14 | Static4.anInt89);
			Static332.aBoolean427 = false;
		}
		while (true) {
			@Pc(1416) Class2_Sub13 local1416;
			@Pc(1421) Class161 local1421;
			do {
				local1416 = (Class2_Sub13) Static378.aClass135_43.method3549();
				if (local1416 == null) {
					while (true) {
						do {
							local1416 = (Class2_Sub13) Static207.aClass135_25.method3549();
							if (local1416 == null) {
								while (true) {
									do {
										local1416 = (Class2_Sub13) Static274.aClass135_30.method3549();
										if (local1416 == null) {
											if (Static227.aClass161_11 == null) {
												Static348.anInt6449 = 0;
											}
											if (Static375.aClass161_14 != null) {
												Static122.method2398();
											}
											if (Static4.anInt90 > 0 && Static174.aClass123_2.method3343(82) && Static174.aClass123_2.method3343(81) && Static323.anInt6063 != 0) {
												local410 = Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 - Static323.anInt6063;
												if (local410 < 0) {
													local410 = 0;
												} else if (local410 > 3) {
													local410 = 3;
												}
												Static6.method141(local410, Static148.anInt2719 + Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray317[0], Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray316[0] + Static164.anInt3140);
											}
											Static315.method5381();
											for (local410 = 0; local410 < 5; local410++) {
												@Pc(1612) int local1612 = Static116.anIntArray149[local410]++;
											}
											if (Static273.aBoolean374 && Static375.aLong221 < Static204.method3685() - 60000L) {
												Static340.method5765();
											}
											Static2.anInt28++;
											if (Static2.anInt28 > 500) {
												Static2.anInt28 = 0;
												local135 = (int) (Math.random() * 8.0D);
												if ((local135 & 0x4) == 4) {
													Static53.anInt3966 += Static9.anInt213;
												}
												if ((local135 & 0x1) == 1) {
													Static24.anInt642 += Static146.anInt2705;
												}
												if ((local135 & 0x2) == 2) {
													Static14.anInt327 += Static389.anInt4897;
												}
											}
											if (Static24.anInt642 < -50) {
												Static146.anInt2705 = 2;
											}
											if (Static14.anInt327 < -55) {
												Static389.anInt4897 = 2;
											}
											if (Static24.anInt642 > 50) {
												Static146.anInt2705 = -2;
											}
											if (Static53.anInt3966 < -40) {
												Static9.anInt213 = 1;
											}
											if (Static14.anInt327 > 55) {
												Static389.anInt4897 = -2;
											}
											Static285.anInt5375++;
											if (Static53.anInt3966 > 40) {
												Static9.anInt213 = -1;
											}
											if (Static285.anInt5375 > 500) {
												Static285.anInt5375 = 0;
												local135 = (int) (Math.random() * 8.0D);
												if ((local135 & 0x1) == 1) {
													Static6.anInt158 += Static262.anInt6999;
												}
												if ((local135 & 0x2) == 2) {
													Static97.anInt2005 += Static37.anInt949;
												}
											}
											if (Static6.anInt158 < -60) {
												Static262.anInt6999 = 2;
											}
											if (Static6.anInt158 > 60) {
												Static262.anInt6999 = -2;
											}
											if (Static97.anInt2005 < -20) {
												Static37.anInt949 = 1;
											}
											Static367.anInt6876++;
											if (Static97.anInt2005 > 10) {
												Static37.anInt949 = -1;
											}
											if (Static367.anInt6876 > 50) {
												Static91.method1960(Static326.aClass145_228);
											}
											if (Static1.aBoolean1) {
												Static128.method2432();
												Static1.aBoolean1 = false;
											}
											try {
												if (Static335.aClass111_4 != null && Static257.aClass2_Sub4_Sub2_4.anInt5300 > 0) {
													Static175.anInt3348 += Static257.aClass2_Sub4_Sub2_4.anInt5300;
													Static335.aClass111_4.method2797(Static257.aClass2_Sub4_Sub2_4.anInt5300, Static257.aClass2_Sub4_Sub2_4.aByteArray73);
													Static367.anInt6876 = 0;
													Static257.aClass2_Sub4_Sub2_4.anInt5300 = 0;
													return;
												}
												return;
											} catch (@Pc(1823) IOException local1823) {
												Static211.method3725();
												return;
											}
										}
										local1421 = local1416.aClass161_3;
										if (local1421.anInt4297 < 0) {
											break;
										}
										local830 = Static6.method140(local1421.anInt4275);
									} while (local830 == null || local830.aClass161Array2 == null || local830.aClass161Array2.length <= local1421.anInt4297 || local1421 != local830.aClass161Array2[local1421.anInt4297]);
									Static198.method3591(local1416);
								}
							}
							local1421 = local1416.aClass161_3;
							if (local1421.anInt4297 < 0) {
								break;
							}
							local830 = Static6.method140(local1421.anInt4275);
						} while (local830 == null || local830.aClass161Array2 == null || local830.aClass161Array2.length <= local1421.anInt4297 || local1421 != local830.aClass161Array2[local1421.anInt4297]);
						Static198.method3591(local1416);
					}
				}
				local1421 = local1416.aClass161_3;
				if (local1421.anInt4297 < 0) {
					break;
				}
				local830 = Static6.method140(local1421.anInt4275);
			} while (local830 == null || local830.aClass161Array2 == null || local830.aClass161Array2.length <= local1421.anInt4297 || local1421 != local830.aClass161Array2[local1421.anInt4297]);
			Static198.method3591(local1416);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIILclient!ed;I)V")
	public static void method2550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub8 arg2, @OriginalArg(4) int arg3) {
		@Pc(25) long local25 = (long) (arg1 | arg3 << 28 | arg0 << 14);
		@Pc(31) Class2_Sub32 local31 = (Class2_Sub32) Static120.aClass4_49.method90(local25);
		if (local31 == null) {
			local31 = new Class2_Sub32();
			Static120.aClass4_49.method87(local31, local25);
			local31.aClass135_34.method3540(arg2);
			return;
		}
		@Pc(54) Class188 local54 = Static313.aClass107_2.method2759(arg2.anInt1717);
		@Pc(57) int local57 = local54.anInt5220;
		if (local54.anInt5247 == 1) {
			local57 *= arg2.anInt1719 + 1;
		}
		for (@Pc(76) Class2_Sub8 local76 = (Class2_Sub8) local31.aClass135_34.method3551(); local76 != null; local76 = (Class2_Sub8) local31.aClass135_34.method3552()) {
			local54 = Static313.aClass107_2.method2759(local76.anInt1717);
			@Pc(87) int local87 = local54.anInt5220;
			if (local54.anInt5247 == 1) {
				local87 *= local76.anInt1719 + 1;
			}
			if (local57 > local87) {
				Static97.method2100(arg2, local76);
				return;
			}
		}
		local31.aClass135_34.method3540(arg2);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)V")
	public static void method2552(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static316.method5413(14, arg0);
		local8.method2312();
	}
}
