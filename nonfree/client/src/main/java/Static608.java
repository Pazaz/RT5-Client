import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Lclient!st;")
	public static Class23 aClass23_41;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "I")
	public static int anInt9289;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_222 = new Class225(67, 3);

	@OriginalMember(owner = "client!td", name = "n", descriptor = "I")
	public static int anInt9290 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method8176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static338.anInt5564;
		Static481.anInt7222 = 0;
		@Pc(11) int[] local11 = Static210.anIntArray280;
		@Pc(20) int local20;
		if (Static1.anInt10798 == 3) {
			local20 = Static219.aClass236Array1.length;
		} else {
			local20 = Static390.anInt6126 + local7;
		}
		@Pc(267) int local267;
		@Pc(321) int local321;
		@Pc(409) int local409;
		@Pc(412) int local412;
		@Pc(1274) int local1274;
		@Pc(1321) int local1321;
		@Pc(1323) int local1323;
		@Pc(1325) int local1325;
		@Pc(1327) int local1327;
		@Pc(233) int local233;
		@Pc(504) int local504;
		@Pc(1179) int local1179;
		@Pc(651) int local651;
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			@Pc(31) Class268 local31 = null;
			@Pc(51) Class8_Sub2_Sub1_Sub2 local51;
			if (Static1.anInt10798 == 3) {
				@Pc(111) Class236 local111 = Static219.aClass236Array1[local27];
				if (!local111.aBoolean455) {
					continue;
				}
				local51 = local111.method5363();
				if (Static198.anInt3276 != local51.anInt10704) {
					continue;
				}
				if (local111.anInt5980 >= 0) {
					local31 = ((Class8_Sub2_Sub1_Sub2_Sub2) local51).aClass268_1;
					if (local31.anIntArray532 != null) {
						local31 = local31.method5985(65535, Static34.aClass304_1);
						if (local31 == null) {
							continue;
						}
					}
				}
			} else {
				if (local27 < local7) {
					local51 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local11[local27]];
				} else {
					local51 = ((Class2_Sub45) Static18.aClass28_2.method738((long) Static103.anIntArray187[local27 - local7])).aClass8_Sub2_Sub1_Sub2_Sub2_2;
					local31 = ((Class8_Sub2_Sub1_Sub2_Sub2) local51).aClass268_1;
					if (local31.anIntArray532 != null) {
						local31 = local31.method5985(65535, Static34.aClass304_1);
						if (local31 == null) {
							continue;
						}
					}
				}
				if (local51.anInt10739 < 0 || local51.anInt10704 != Static198.anInt3276 && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 != local51.aByte144) {
					continue;
				}
			}
			Static716.method9350(local51, arg3 >> 1, local51.method9299(), arg1 >> 1);
			if (Static215.anIntArray284[0] >= 0) {
				if (local51.method9311()) {
					@Pc(182) Class80 local182 = local51.method9318(-3109);
					if (local182 != null && Static481.anInt7222 < Static352.anInt5752) {
						Static352.anIntArray446[Static481.anInt7222] = Static42.aClass381_4.method8744(local182.method2105()) / 2;
						Static352.anIntArray445[Static481.anInt7222] = Static215.anIntArray284[0];
						Static352.anIntArray444[Static481.anInt7222] = Static215.anIntArray284[1];
						Static352.aClass80Array1[Static481.anInt7222] = local182;
						Static481.anInt7222++;
					}
				}
				local233 = arg0 + Static215.anIntArray284[1];
				@Pc(306) Class23[] local306;
				@Pc(313) Class407[] local313;
				@Pc(381) Class23 local381;
				if (local51.aBoolean816 || Static333.anInt5455 >= local51.anInt10747) {
					local233 -= Math.max(Static42.aClass381_4.anInt10030, Static119.aClass23Array3[0].method8182());
				} else {
					@Pc(262) byte local262 = 1;
					if (local31 == null) {
						@Pc(283) Class8_Sub2_Sub1_Sub2_Sub1 local283 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local11[local27]];
						local267 = local51.method9317().anInt7257;
						if (local283.aBoolean128) {
							local262 = 2;
						}
					} else {
						local267 = local31.anInt6748;
						if (local267 == -1) {
							local267 = local51.method9317().anInt7257;
						}
					}
					@Pc(295) Class23[] local295 = Static119.aClass23Array3;
					if (local267 != -1) {
						local306 = (Class23[]) Static230.aClass82_81.method2156((long) local267);
						if (local306 == null) {
							local313 = Static735.method9375(Static721.aClass330_128, local267);
							if (local313 != null) {
								local306 = new Class23[local313.length];
								for (local321 = 0; local321 < local313.length; local321++) {
									local306[local321] = Static163.aClass19_17.method7948(local313[local321], true);
								}
								Static230.aClass82_81.method2150(local306, (long) local267);
							}
						}
						if (local306 != null && local306.length >= 2) {
							local295 = local306;
						}
					}
					if (local262 >= local295.length) {
						local262 = 1;
					}
					@Pc(377) Class23 local377 = local295[0];
					local381 = local295[local262];
					local233 -= Math.max(Static42.aClass381_4.anInt10030, local377.method8182());
					local321 = Static215.anIntArray284[0] + arg2 - (local377.method8199() >> 1);
					local409 = local377.method8199() * local51.anInt10726 / 255;
					local412 = local377.method8182();
					if (local51.anInt10726 > 0 && local409 < 2) {
						local409 = 2;
					}
					local377.method8202(local321, local233);
					Static163.aClass19_17.T(local321, local233, local409 + local321, local233 - -local412);
					local381.method8202(local321, local233);
					Static163.aClass19_17.KA(arg2, arg0, arg1 + arg2, arg0 + arg3);
					Static682.method8927(local233, local412 + local233, local321, local377.method8203() + local321);
				}
				local233 -= 2;
				if (!local51.aBoolean816) {
					@Pc(486) Class23 local486;
					@Pc(496) Class23 local496;
					if (local51.anInt10719 > Static333.anInt5455) {
						local486 = Static34.aClass23Array2[local51.aBoolean818 ? 2 : 0];
						local496 = Static34.aClass23Array2[local51.aBoolean818 ? 3 : 1];
						if (local51 instanceof Class8_Sub2_Sub1_Sub2_Sub2) {
							local504 = local31.anInt6720;
							if (local504 == -1) {
								local504 = local51.method9317().anInt7259;
							}
						} else {
							local504 = local51.method9317().anInt7259;
						}
						if (local504 != -1) {
							local306 = (Class23[]) Static669.aClass82_215.method2156((long) local504);
							if (local306 == null) {
								local313 = Static735.method9375(Static721.aClass330_128, local504);
								if (local313 != null) {
									local306 = new Class23[local313.length];
									for (local321 = 0; local321 < local313.length; local321++) {
										local306[local321] = Static163.aClass19_17.method7948(local313[local321], true);
									}
									Static669.aClass82_215.method2150(local306, (long) local504);
								}
							}
							if (local306 != null && local306.length == 4) {
								local486 = local306[local51.aBoolean818 ? 2 : 0];
								local496 = local306[local51.aBoolean818 ? 3 : 1];
							}
						}
						@Pc(612) int local612 = local51.anInt10719 - Static333.anInt5455;
						if (local51.anInt10738 < local612) {
							local612 -= local51.anInt10738;
							local321 = local51.anInt10731 == 0 ? 0 : (local51.anInt10737 - local612) / local51.anInt10731 * local51.anInt10731;
							local651 = local486.method8199() * local321 / local51.anInt10737;
						} else {
							local651 = local486.method8199();
						}
						local321 = local486.method8182();
						local233 -= local321;
						local409 = Static215.anIntArray284[0] + arg2 - (local486.method8199() >> 1);
						local486.method8202(local409, local233);
						Static163.aClass19_17.T(local409, local233, local651 + local409, local233 + local321);
						local496.method8202(local409, local233);
						Static163.aClass19_17.KA(arg2, arg0, arg2 + arg1, arg0 + arg3);
						Static682.method8927(local233, local321 + local233, local409, local486.method8203() + local409);
						local233 -= 2;
					}
					if (local31 == null) {
						@Pc(720) Class8_Sub2_Sub1_Sub2_Sub1 local720 = (Class8_Sub2_Sub1_Sub2_Sub1) local51;
						if (local720.anInt1430 != -1) {
							local496 = Static441.aClass23Array10[local720.anInt1430];
							local233 -= local496.method8182();
							local496.method8202(Static215.anIntArray284[0] + arg2 - 12, local233);
							Static682.method8927(local233, local496.method8192() + local233, Static215.anIntArray284[0] + arg2 + -12, Static215.anIntArray284[0] + arg2 + local496.method8203() - 12);
							local233 -= 2;
						}
						if (local720.anInt1431 != -1) {
							local496 = Static493.aClass23Array12[local720.anInt1431];
							local233 -= local496.method8182();
							local496.method8202(arg2 + Static215.anIntArray284[0] - 12, local233);
							Static682.method8927(local233, local233 + local496.method8192(), Static215.anIntArray284[0] + arg2 + -12, Static215.anIntArray284[0] + arg2 + local496.method8203() - 12);
							local233 -= 2;
						}
					} else if (local31.anInt6708 >= 0 && Static493.aClass23Array12.length > local31.anInt6708) {
						local486 = Static493.aClass23Array12[local31.anInt6708];
						local233 -= local486.method8182();
						local486.method8202(arg2 + Static215.anIntArray284[0] - (local486.method8199() >> 1), local233);
						Static682.method8927(local233, local486.method8192() + local233, arg2 + Static215.anIntArray284[0] - (local486.method8199() >> 1), Static215.anIntArray284[0] + arg2 - (local486.method8199() >> 1) + local486.method8203());
						local233 -= 2;
					}
				}
				@Pc(905) Class254[] local905;
				@Pc(913) Class254 local913;
				if (!(local51 instanceof Class8_Sub2_Sub1_Sub2_Sub1)) {
					local267 = 0;
					local905 = Static527.aClass254Array1;
					for (local504 = 0; local504 < local905.length; local504++) {
						local913 = local905[local504];
						if (local913 != null && local913.anInt6363 == 1 && Static103.anIntArray187[local27 - local7] == local913.anInt6366) {
							local381 = Static28.aClass23Array1[local913.anInt6367];
							if (local381.method8182() > local267) {
								local267 = local381.method8182();
							}
							@Pc(1071) boolean local1071;
							if (local913.anInt6360 == 0) {
								local1071 = true;
							} else {
								local409 = Static504.method6733() * 1000 / local913.anInt6360 / 2;
								local1071 = local409 > Static333.anInt5455 % (local409 * 2);
							}
							if (local1071) {
								local381.method8202(Static215.anIntArray284[0] + arg2 - 12, -local381.method8182() + local233);
								Static682.method8927(local233 - local381.method8182(), -local381.method8182() + (local233 - -local381.method8192()), arg2 + Static215.anIntArray284[0] - 12, arg2 + Static215.anIntArray284[0] - (12 - local381.method8203()));
							}
						}
					}
					if (local267 > 0) {
					}
				} else if (local27 >= 0) {
					local267 = 0;
					local905 = Static527.aClass254Array1;
					for (local504 = 0; local504 < local905.length; local504++) {
						local913 = local905[local504];
						if (local913 != null && local913.anInt6363 == 10 && local913.anInt6366 == local11[local27]) {
							local381 = Static28.aClass23Array1[local913.anInt6367];
							if (local267 < local381.method8182()) {
								local267 = local381.method8182();
							}
							local381.method8202(Static215.anIntArray284[0] + arg2 - 12, local233 - local381.method8182());
							Static682.method8927(local233 - local381.method8182(), local233 - local381.method8182() - -local381.method8192(), arg2 + Static215.anIntArray284[0] - 12, Static215.anIntArray284[0] + (arg2 - 12) - -local381.method8203());
						}
					}
					if (local267 > 0) {
					}
				}
				for (local267 = 0; local267 < Static65.aClass3_1.anInt86; local267++) {
					local1179 = local51.anIntArray871[local267];
					local504 = local51.anIntArray873[local267];
					@Pc(1186) Class285 local1186 = null;
					local651 = 0;
					if (local504 >= 0) {
						if (Static333.anInt5455 >= local1179) {
							continue;
						}
						local1186 = Static561.aClass220_2.method5186(local51.anIntArray873[local267]);
						local651 = local1186.anInt7192;
					} else if (local1179 < 0) {
						continue;
					}
					local321 = local51.anIntArray876[local267];
					@Pc(1218) Class285 local1218 = null;
					if (local321 >= 0) {
						local1218 = Static561.aClass220_2.method5186(local321);
					}
					if (local1179 - local651 <= Static333.anInt5455) {
						local412 = local51.anIntArray875[local267];
						if (local412 >= 0) {
							local51.anInt10747 = Static333.anInt5455 + 300;
							local51.anInt10726 = local412;
							local51.anIntArray875[local267] = -1;
						}
						if (local1186 == null) {
							local51.anIntArray871[local267] = -1;
						} else {
							local1274 = local51.method9299() / 2;
							Static716.method9350(local51, arg3 >> 1, local1274, arg1 >> 1);
							if (Static215.anIntArray284[0] > -1) {
								Static215.anIntArray284[0] += Static65.aClass3_1.anIntArray16[local267];
								Static215.anIntArray284[1] += Static65.aClass3_1.anIntArray14[local267];
								local1321 = 0;
								local1323 = 0;
								local1325 = 0;
								local1327 = 0;
								@Pc(1329) int local1329 = 0;
								@Pc(1331) int local1331 = 0;
								@Pc(1333) int local1333 = 0;
								@Pc(1335) int local1335 = 0;
								@Pc(1337) Class23 local1337 = null;
								@Pc(1339) Class23 local1339 = null;
								@Pc(1341) Class23 local1341 = null;
								@Pc(1343) Class23 local1343 = null;
								@Pc(1345) int local1345 = 0;
								@Pc(1347) int local1347 = 0;
								@Pc(1349) int local1349 = 0;
								@Pc(1351) int local1351 = 0;
								@Pc(1353) int local1353 = 0;
								@Pc(1355) int local1355 = 0;
								@Pc(1357) int local1357 = 0;
								@Pc(1359) int local1359 = 0;
								@Pc(1364) Class23 local1364 = local1186.method6454(Static163.aClass19_17);
								@Pc(1366) int local1366 = 0;
								@Pc(1374) int local1374;
								if (local1364 != null) {
									local1321 = local1364.method8199();
									local1374 = local1364.method8182();
									local1364.method8193(Static167.anIntArray248);
									if (local1374 > 0) {
										local1366 = local1374;
									}
									local1329 = Static167.anIntArray248[0];
								}
								@Pc(1391) Class23 local1391 = local1186.method6451(Static163.aClass19_17);
								if (local1391 != null) {
									local1323 = local1391.method8199();
									local1374 = local1391.method8182();
									if (local1374 > local1366) {
										local1366 = local1374;
									}
									local1391.method8193(Static167.anIntArray248);
									local1331 = Static167.anIntArray248[0];
								}
								@Pc(1420) Class23 local1420 = local1186.method6452(Static163.aClass19_17);
								if (local1420 != null) {
									local1325 = local1420.method8199();
									local1374 = local1420.method8182();
									if (local1374 > local1366) {
										local1366 = local1374;
									}
									local1420.method8193(Static167.anIntArray248);
									local1333 = Static167.anIntArray248[0];
								}
								@Pc(1449) Class23 local1449 = local1186.method6453(Static163.aClass19_17);
								if (local1449 != null) {
									local1327 = local1449.method8199();
									local1374 = local1449.method8182();
									local1449.method8193(Static167.anIntArray248);
									if (local1374 > local1366) {
										local1366 = local1374;
									}
									local1335 = Static167.anIntArray248[0];
								}
								if (local1218 != null) {
									local1337 = local1218.method6454(Static163.aClass19_17);
									if (local1337 != null) {
										local1345 = local1337.method8199();
										local1374 = local1337.method8182();
										if (local1366 < local1374) {
											local1366 = local1374;
										}
										local1337.method8193(Static167.anIntArray248);
										local1353 = Static167.anIntArray248[0];
									}
									local1339 = local1218.method6451(Static163.aClass19_17);
									if (local1339 != null) {
										local1347 = local1339.method8199();
										local1374 = local1339.method8182();
										if (local1374 > local1366) {
											local1366 = local1374;
										}
										local1339.method8193(Static167.anIntArray248);
										local1355 = Static167.anIntArray248[0];
									}
									local1341 = local1218.method6452(Static163.aClass19_17);
									if (local1341 != null) {
										local1349 = local1341.method8199();
										local1374 = local1341.method8182();
										local1341.method8193(Static167.anIntArray248);
										if (local1366 < local1374) {
											local1366 = local1374;
										}
										local1357 = Static167.anIntArray248[0];
									}
									local1343 = local1218.method6453(Static163.aClass19_17);
									if (local1343 != null) {
										local1351 = local1343.method8199();
										local1374 = local1343.method8182();
										local1343.method8193(Static167.anIntArray248);
										if (local1366 < local1374) {
											local1366 = local1374;
										}
										local1359 = Static167.anIntArray248[0];
									}
								}
								@Pc(1589) Class14 local1589 = Static665.aClass14_12;
								@Pc(1591) Class14 local1591 = Static665.aClass14_12;
								@Pc(1593) Class381 local1593 = Static154.aClass381_6;
								@Pc(1595) Class381 local1595 = Static154.aClass381_6;
								local1374 = local1186.anInt7196;
								@Pc(1607) Class14 local1607;
								@Pc(1612) Class381 local1612;
								if (local1374 >= 0) {
									local1607 = Static324.method4628(true, true, local1374, Static163.aClass19_17);
									local1612 = Static275.method3980(local1374, Static163.aClass19_17);
									if (local1607 != null && local1612 != null) {
										local1593 = local1612;
										local1589 = local1607;
									}
								}
								if (local1218 != null) {
									local1374 = local1218.anInt7196;
									if (local1374 >= 0) {
										local1607 = Static324.method4628(true, true, local1374, Static163.aClass19_17);
										local1612 = Static275.method3980(local1374, Static163.aClass19_17);
										if (local1607 != null && local1612 != null) {
											local1595 = local1612;
											local1591 = local1607;
										}
									}
								}
								@Pc(1658) String local1658 = null;
								@Pc(1662) int local1662 = 0;
								@Pc(1670) String local1670 = local1186.method6457(local51.anIntArray870[local267]);
								@Pc(1675) int local1675 = local1593.method8744(local1670);
								if (local1218 != null) {
									local1658 = local1218.method6457(local51.anIntArray874[local267]);
									local1662 = local1595.method8744(local1658);
								}
								@Pc(1692) int local1692 = 0;
								if (local1323 > 0) {
									local1692 = local1675 / local1323 + 1;
								}
								@Pc(1702) int local1702 = 0;
								if (local1218 != null && local1347 > 0) {
									local1702 = local1662 / local1347 + 1;
								}
								@Pc(1719) int local1719 = 0;
								if (local1321 > 0) {
									local1719 = local1321;
								}
								local1719 += 2;
								@Pc(1730) int local1730 = local1719;
								if (local1325 > 0) {
									local1719 += local1325;
								}
								@Pc(1741) int local1741 = local1719;
								@Pc(1743) int local1743 = local1719;
								@Pc(1752) int local1752;
								if (local1323 > 0) {
									local1752 = local1692 * local1323;
									local1719 += local1752;
									local1743 += (local1752 - local1675) / 2;
								} else {
									local1719 += local1675;
								}
								local1752 = local1719;
								if (local1327 > 0) {
									local1719 += local1327;
								}
								@Pc(1784) int local1784 = 0;
								@Pc(1786) int local1786 = 0;
								@Pc(1788) int local1788 = 0;
								@Pc(1790) int local1790 = 0;
								@Pc(1792) int local1792 = 0;
								@Pc(1831) int local1831;
								if (local1218 != null) {
									local1719 += 2;
									local1784 = local1719;
									if (local1345 > 0) {
										local1719 += local1345;
									}
									local1719 += 2;
									local1786 = local1719;
									if (local1349 > 0) {
										local1719 += local1349;
									}
									local1792 = local1719;
									local1788 = local1719;
									if (local1347 <= 0) {
										local1719 += local1662;
									} else {
										local1831 = local1702 * local1347;
										local1792 = local1719 + (local1831 - local1662) / 2;
										local1719 += local1831;
									}
									local1790 = local1719;
									if (local1351 > 0) {
										local1719 += local1351;
									}
								}
								local1831 = local51.anIntArray871[local267] - Static333.anInt5455;
								@Pc(1871) int local1871 = local1186.anInt7184 - local1186.anInt7184 * local1831 / local1186.anInt7192;
								@Pc(1884) int local1884 = local1831 * local1186.anInt7191 / local1186.anInt7192 - local1186.anInt7191;
								@Pc(1898) int local1898 = arg2 + Static215.anIntArray284[0] + local1871 - (local1719 >> 1);
								@Pc(1908) int local1908 = Static215.anIntArray284[1] + arg0 + local1884 - 12;
								@Pc(1910) int local1910 = local1908;
								@Pc(1915) int local1915 = local1908 + local1366;
								@Pc(1922) int local1922 = local1186.anInt7178 + local1908 + 15;
								@Pc(1928) int local1928 = local1922 - local1593.anInt10030;
								if (local1928 < local1908) {
									local1910 = local1928;
								}
								@Pc(1942) int local1942 = local1593.anInt10036 + local1922;
								if (local1915 < local1942) {
									local1915 = local1942;
								}
								@Pc(1949) int local1949 = 0;
								@Pc(1963) int local1963;
								@Pc(1969) int local1969;
								if (local1218 != null) {
									local1949 = local1218.anInt7178 + local1908 + 15;
									local1963 = local1949 - local1595.anInt10030;
									local1969 = local1949 + local1595.anInt10036;
									if (local1910 > local1963) {
										local1910 = local1963;
									}
									if (local1915 < local1969) {
										local1915 = local1969;
									}
								}
								local1963 = 255;
								if (local1186.anInt7179 >= 0) {
									local1963 = (local1831 << 8) / (local1186.anInt7192 - local1186.anInt7179);
								}
								if (local1963 >= 0 && local1963 < 255) {
									local1969 = local1963 << 24;
									@Pc(2017) int local2017 = local1969 | 0xFFFFFF;
									if (local1364 != null) {
										local1364.method8197(local1898 - local1329, local1908, 0, local2017, 1);
									}
									if (local1420 != null) {
										local1420.method8197(local1730 + local1898 - local1333, local1908, 0, local2017, 1);
									}
									@Pc(2053) int local2053;
									if (local1391 != null) {
										for (local2053 = 0; local2053 < local1692; local2053++) {
											local1391.method8197(local1741 + local1898 + local1323 * local2053 - local1331, local1908, 0, local2017, 1);
										}
									}
									if (local1449 != null) {
										local1449.method8197(local1898 + local1752 - local1335, local1908, 0, local2017, 1);
									}
									local1589.method8829(local1898 + local1743, local1922, local1670, 0, local1969 | local1186.anInt7190);
									if (local1218 != null) {
										if (local1337 != null) {
											local1337.method8197(local1784 + local1898 - local1353, local1908, 0, local2017, 1);
										}
										if (local1341 != null) {
											local1341.method8197(local1898 + local1786 - local1357, local1908, 0, local2017, 1);
										}
										if (local1339 != null) {
											for (local2053 = 0; local2053 < local1702; local2053++) {
												local1339.method8197(local1898 + local1788 + local1347 * local2053 - local1355, local1908, 0, local2017, 1);
											}
										}
										if (local1343 != null) {
											local1343.method8197(local1898 + local1790 - local1359, local1908, 0, local2017, 1);
										}
										local1591.method8829(local1792 + local1898, local1949, local1658, 0, local1218.anInt7190 | local1969);
									}
								} else {
									if (local1364 != null) {
										local1364.method8202(local1898 - local1329, local1908);
									}
									if (local1420 != null) {
										local1420.method8202(local1898 + local1730 - local1333, local1908);
									}
									if (local1391 != null) {
										for (local1969 = 0; local1969 < local1692; local1969++) {
											local1391.method8202(local1323 * local1969 + local1741 + local1898 - local1331, local1908);
										}
									}
									if (local1449 != null) {
										local1449.method8202(local1752 + local1898 - local1335, local1908);
									}
									local1589.method8829(local1898 + local1743, local1922, local1670, 0, local1186.anInt7190 | 0xFF000000);
									if (local1218 != null) {
										if (local1337 != null) {
											local1337.method8202(local1784 + local1898 - local1353, local1908);
										}
										if (local1341 != null) {
											local1341.method8202(local1898 + local1786 - local1357, local1908);
										}
										if (local1339 != null) {
											for (local1969 = 0; local1969 < local1702; local1969++) {
												local1339.method8202(local1898 + local1788 + local1347 * local1969 - local1355, local1908);
											}
										}
										if (local1343 != null) {
											local1343.method8202(local1790 + local1898 - local1359, local1908);
										}
										local1591.method8829(local1792 + local1898, local1949, local1658, 0, local1218.anInt7190 | 0xFF000000);
									}
								}
								Static682.method8927(local1910, local1915 + 1, local1898, local1719 + local1898);
							}
						}
					}
				}
			}
		}
		@Pc(2422) int local2422;
		for (@Pc(2403) int local2403 = 0; local2403 < Static172.anInt2893; local2403++) {
			local2422 = Static324.anIntArray390[local2403];
			@Pc(2429) Class8_Sub2_Sub1_Sub2 local2429;
			if (local2422 < 2048) {
				local2429 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local2422];
			} else {
				local2429 = ((Class2_Sub45) Static18.aClass28_2.method738((long) (local2422 - 2048))).aClass8_Sub2_Sub1_Sub2_Sub2_2;
			}
			local267 = Static212.anIntArray283[local2403];
			@Pc(2452) Class8_Sub2_Sub1_Sub2 local2452;
			if (local267 < 2048) {
				local2452 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local267];
			} else {
				local2452 = ((Class2_Sub45) Static18.aClass28_2.method738((long) (local267 - 2048))).aClass8_Sub2_Sub1_Sub2_Sub2_2;
			}
			Static397.method5557(arg2, local2429, local2452, arg3, arg1, arg0, --local2429.anInt10735);
		}
		local2422 = Static42.aClass381_4.anInt10030 + Static42.aClass381_4.anInt10036 + 2;
		for (local233 = 0; local233 < Static481.anInt7222; local233++) {
			local267 = Static352.anIntArray445[local233];
			local1179 = Static352.anIntArray444[local233];
			local504 = Static352.anIntArray446[local233];
			@Pc(2517) boolean local2517 = true;
			while (local2517) {
				local2517 = false;
				for (local651 = 0; local651 < local233; local651++) {
					if (local1179 + 2 > -local2422 + Static352.anIntArray444[local651] && local1179 - local2422 < Static352.anIntArray444[local651] - -2 && Static352.anIntArray445[local651] + Static352.anIntArray446[local651] > local267 - local504 && local267 + local504 > Static352.anIntArray445[local651] + -Static352.anIntArray446[local651] && local1179 > Static352.anIntArray444[local651] - local2422) {
						local1179 = Static352.anIntArray444[local651] - local2422;
						local2517 = true;
					}
				}
			}
			Static352.anIntArray444[local233] = local1179;
			@Pc(2627) String local2627 = Static352.aClass80Array1[local233].method2105();
			local321 = Static42.aClass381_4.method8744(local2627);
			local409 = local267 + arg2;
			local412 = local1179 + arg0 - Static42.aClass381_4.anInt10030;
			local1274 = local321 + local409;
			@Pc(2654) int local2654 = Static42.aClass381_4.anInt10036 + arg0 + local1179;
			if (Static55.anInt1124 == 0) {
				@Pc(2663) int local2663 = 16776960;
				@Pc(2669) int local2669 = Static352.aClass80Array1[local233].method2107();
				if (local2669 < 6) {
					local2663 = Static587.anIntArray689[local2669];
				}
				if (local2669 == 6) {
					local2663 = Static198.anInt3276 % 20 < 10 ? 16711680 : 16776960;
				}
				if (local2669 == 7) {
					local2663 = Static198.anInt3276 % 20 >= 10 ? 65535 : 255;
				}
				if (local2669 == 8) {
					local2663 = Static198.anInt3276 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2749) int local2749;
				if (local2669 == 9) {
					local2749 = 150 - Static352.aClass80Array1[local233].method2110() * 150 / Static352.aClass80Array1[local233].method2103();
					if (local2749 < 50) {
						local2663 = local2749 * 1280 + 16711680;
					} else if (local2749 < 100) {
						local2663 = 33160960 - local2749 * 327680;
					} else if (local2749 < 150) {
						local2663 = local2749 * 5 + 65280 - 500;
					}
				}
				if (local2669 == 10) {
					local2749 = 150 - Static352.aClass80Array1[local233].method2110() * 150 / Static352.aClass80Array1[local233].method2103();
					if (local2749 < 50) {
						local2663 = local2749 * 5 + 16711680;
					} else if (local2749 < 100) {
						local2663 = 16711935 - (local2749 - 50) * 327680;
					} else if (local2749 < 150) {
						local2663 = local2749 * 327680 + 500 + 255 - local2749 * 5 - 32768000;
					}
				}
				if (local2669 == 11) {
					local2749 = 150 - Static352.aClass80Array1[local233].method2110() * 150 / Static352.aClass80Array1[local233].method2103();
					if (local2749 < 50) {
						local2663 = 16777215 - local2749 * 327685;
					} else if (local2749 < 100) {
						local2663 = local2749 * 327685 + 65280 - 16384250;
					} else if (local2749 < 150) {
						local2663 = 16777215 - (local2749 - 100) * 327680;
					}
				}
				local2749 = local2663 | 0xFF000000;
				local1321 = Static352.aClass80Array1[local233].method2108();
				if (local1321 == 0) {
					Static180.aClass14_3.method8828(-16777216, local267 + arg2, local2627, local1179 + arg0, local2749);
					local1274 -= local321 >> 1;
					local409 -= local321 >> 1;
				}
				if (local1321 == 1) {
					local2654 += 5;
					Static180.aClass14_3.method8833(local2749, Static198.anInt3276, local2627, arg2 + local267, local1179 + arg0);
					local1274 -= local321 >> 1;
					local409 -= local321 >> 1;
					local412 -= 5;
				}
				if (local1321 == 2) {
					local412 -= 5;
					Static180.aClass14_3.method8832(Static198.anInt3276, local2627, arg2 + local267, local2749, arg0 + local1179);
					local2654 += 5;
					local409 -= (local321 >> 1) + 5;
					local1274 -= (local321 >> 1) - 5;
				}
				if (local1321 == 3) {
					local1323 = 150 - Static352.aClass80Array1[local233].method2110() * 150 / Static352.aClass80Array1[local233].method2103();
					local409 -= local321 >> 1;
					local2654 += 7;
					local412 -= 7;
					local1274 -= local321 >> 1;
					Static180.aClass14_3.method8818(local1323, local267 + arg2, Static198.anInt3276, arg0 + local1179, local2749, local2627);
				}
				if (local1321 == 4) {
					local1323 = 150 - Static352.aClass80Array1[local233].method2110() * 150 / Static352.aClass80Array1[local233].method2103();
					local1325 = (Static42.aClass381_4.method8744(local2627) + 100) * local1323 / 150;
					Static163.aClass19_17.T(arg2 + local267 - 50, arg0, local267 + arg2 + 50, arg0 - -arg3);
					local409 += 50 - local1325;
					local1274 += 50 - local1325;
					Static180.aClass14_3.method8829(arg2 + local267 + 50 - local1325, local1179 + arg0, local2627, -16777216, local2749);
					Static163.aClass19_17.KA(arg2, arg0, arg2 + arg1, arg3 + arg0);
				}
				if (local1321 == 5) {
					local1323 = 150 - Static352.aClass80Array1[local233].method2110() * 150 / Static352.aClass80Array1[local233].method2103();
					local1325 = 0;
					if (local1323 < 25) {
						local1325 = local1323 - 25;
					} else if (local1323 > 125) {
						local1325 = local1323 - 125;
					}
					local1327 = Static42.aClass381_4.anInt10036 + Static42.aClass381_4.anInt10030;
					Static163.aClass19_17.T(arg2, arg0 + local1179 - local1327 - 1, arg1 + arg2, local1179 + arg0 + 5);
					local2654 += local1325;
					local409 -= local321 >> 1;
					local1274 -= local321 >> 1;
					local412 += local1325;
					Static180.aClass14_3.method8828(-16777216, arg2 + local267, local2627, local1325 + local1179 + arg0, local2749);
					Static163.aClass19_17.KA(arg2, arg0, arg2 + arg1, arg0 + arg3);
				}
			} else {
				Static180.aClass14_3.method8828(-16777216, local267 + arg2, local2627, arg0 + local1179, -256);
				local409 -= local321 >> 1;
				local1274 -= local321 >> 1;
			}
			Static682.method8927(local412, local2654 + 1, local409, local1274 + 1);
		}
	}
}
