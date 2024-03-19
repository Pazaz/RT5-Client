import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!qj;")
	public static Class162 aClass162_116;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "Lclient!lg;")
	public static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_1;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Z")
	public static boolean aBoolean231 = true;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	public static int anInt3239 = -1;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "[I")
	public static final int[] anIntArray238 = new int[14];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
	public static void method2885() {
		@Pc(5) Class215 local5 = Static87.aClass215_38;
		synchronized (Static87.aClass215_38) {
			Static87.aClass215_38.method6060();
		}
		local5 = Static209.aClass215_67;
		synchronized (Static209.aClass215_67) {
			Static209.aClass215_67.method6060();
		}
		local5 = Static286.aClass215_86;
		synchronized (Static286.aClass215_86) {
			Static286.aClass215_86.method6060();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIII)V")
	public static void method2887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Class1_Sub2_Sub17.lb = 0;
		@Pc(165) int local165;
		@Pc(208) int local208;
		@Pc(374) int local374;
		@Pc(487) int local487;
		@Pc(262) int local262;
		@Pc(603) int local603;
		@Pc(429) int local429;
		for (@Pc(9) int local9 = -1; local9 < Static329.anInt6733 + Static49.anInt1559; local9++) {
			@Pc(13) Class75 local13 = null;
			@Pc(30) Class7_Sub1_Sub1 local30;
			if (local9 < 0) {
				local30 = Static264.aClass7_Sub1_Sub1_Sub2_2;
			} else if (Static329.anInt6733 <= local9) {
				local30 = Static84.aClass7_Sub1_Sub1_Sub1Array1[Static185.anIntArray309[local9 - Static329.anInt6733]];
				local13 = ((Class7_Sub1_Sub1_Sub1) local30).aClass75_1;
				if (local13.anIntArray155 != null) {
					local13 = local13.method2064();
					if (local13 == null) {
						continue;
					}
				}
			} else {
				local30 = Static168.aClass7_Sub1_Sub1_Sub2Array1[Static238.anIntArray389[local9]];
			}
			if (local30.anInt7069 >= 0) {
				Static120.method2588(arg1 >> 1, arg3 >> 1, local30, local30.method5983());
				if (Static47.anIntArray96[0] >= 0) {
					if (local30.aString265 != null && (local9 >= Static329.anInt6733 || Static104.anInt2577 == 0 || Static104.anInt2577 == 3 || Static104.anInt2577 == 1 && Static9.method329(((Class7_Sub1_Sub1_Sub2) local30).aString266)) && Class1_Sub2_Sub17.lb < Static286.anInt6053) {
						Static286.anIntArray461[Class1_Sub2_Sub17.lb] = Static140.aClass63_4.method1849(local30.aString265) / 2;
						Static286.anIntArray458[Class1_Sub2_Sub17.lb] = Static47.anIntArray96[0];
						Static286.anIntArray460[Class1_Sub2_Sub17.lb] = Static47.anIntArray96[1];
						Static286.anIntArray463[Class1_Sub2_Sub17.lb] = local30.anInt7093;
						Static286.anIntArray462[Class1_Sub2_Sub17.lb] = local30.anInt7077;
						Static286.anIntArray459[Class1_Sub2_Sub17.lb] = local30.anInt7072;
						Static286.aStringArray40[Class1_Sub2_Sub17.lb] = local30.aString265;
						Class1_Sub2_Sub17.lb++;
					}
					@Pc(152) Class29 local152 = Static197.aClass29Array7[0];
					local165 = Static47.anIntArray96[1] + arg2 - Math.max(Static140.aClass63_4.anInt2197, local152.method5838());
					@Pc(176) Class29 local176;
					@Pc(274) int local274;
					if (!local30.aBoolean507 && local30.anInt7068 > Static197.anInt4521) {
						local176 = Static197.aClass29Array7[1];
						if (local30 instanceof Class7_Sub1_Sub1_Sub1) {
							@Pc(182) Class7_Sub1_Sub1_Sub1 local182 = (Class7_Sub1_Sub1_Sub1) local30;
							@Pc(191) Class29[] local191 = (Class29[]) Static286.aClass215_85.method6057((long) local182.aClass75_1.anInt2456);
							if (local191 == null) {
								@Pc(200) Class133[] local200 = Static363.method3883(Static203.aClass162_47, local182.aClass75_1.anInt2456);
								if (local200 != null) {
									local191 = new Class29[local200.length];
									for (local208 = 0; local208 < local200.length; local208++) {
										local191[local208] = Static221.aClass40_6.method2722(local200[local208]);
									}
									Static286.aClass215_85.method6050(local191, (long) local182.aClass75_1.anInt2456);
								}
							}
							if (local191 != null && local191.length == 2) {
								local152 = local191[0];
								local176 = local191[1];
							}
						}
						local262 = Static47.anIntArray96[0] + arg0 - (local152.method5840() >> 1);
						local152.method5845(local262, local165);
						local274 = local152.method5840() * local30.anInt7073 / 255;
						Static221.aClass40_6.method2792(local262, local165, local262 + local274, local152.method5838() + local165);
						local176.method5845(local262, local165);
						Static221.aClass40_6.method2732(arg0, arg2, arg3 + arg0, arg1 + arg2);
					}
					local165 -= 2;
					if (!local30.aBoolean507) {
						if (Static197.anInt4521 < local30.lb) {
							local176 = Static340.aClass29Array16[local30.aBoolean509 ? 2 : 0];
							@Pc(325) Class29 local325 = Static340.aClass29Array16[local30.aBoolean509 ? 3 : 1];
							if (local30 instanceof Class7_Sub1_Sub1_Sub1) {
								local274 = local13.anInt2480;
								if (local274 == -1) {
									local274 = local30.method5982().anInt2829;
								}
							} else {
								local274 = local30.method5982().anInt2829;
							}
							if (local274 != -1) {
								@Pc(359) Class29[] local359 = (Class29[]) Static43.aClass215_20.method6057((long) local274);
								if (local359 == null) {
									@Pc(366) Class133[] local366 = Static363.method3883(Static203.aClass162_47, local274);
									if (local366 != null) {
										local359 = new Class29[local366.length];
										for (local374 = 0; local374 < local366.length; local374++) {
											local359[local374] = Static221.aClass40_6.method2722(local366[local374]);
										}
										Static43.aClass215_20.method6050(local359, (long) local274);
									}
								}
								if (local359 != null && local359.length == 4) {
									local176 = local359[local30.aBoolean509 ? 2 : 0];
									local325 = local359[local30.aBoolean509 ? 3 : 1];
								}
							}
							local429 = local30.lb - Static197.anInt4521;
							if (local429 > local30.anInt7088) {
								local429 -= local30.anInt7088;
								local374 = local30.anInt7058 == 0 ? 0 : local30.anInt7058 * ((local30.anInt7094 - local429) / local30.anInt7058);
								local208 = local176.method5840() * local374 / local30.anInt7094;
							} else {
								local208 = local176.method5840();
							}
							local374 = local176.method5838();
							local165 -= local374;
							local487 = Static47.anIntArray96[0] + arg0 - (local176.method5840() >> 1);
							local176.method5845(local487, local165);
							Static221.aClass40_6.method2792(local487, local165, local208 + local487, local374 + local165);
							local325.method5845(local487, local165);
							Static221.aClass40_6.method2732(arg0, arg2, arg3 + arg0, arg2 - -arg1);
							local165 -= 2;
						}
						if (local9 < Static329.anInt6733) {
							@Pc(558) Class7_Sub1_Sub1_Sub2 local558 = (Class7_Sub1_Sub1_Sub2) local30;
							if (local558.anInt7146 != -1) {
								local165 -= 25;
								Static121.aClass29Array5[local558.anInt7146].method5845(Static47.anIntArray96[0] + arg0 - 12, local165);
								local165 -= 2;
							}
							if (local558.anInt7129 != -1) {
								local165 -= 25;
								Static222.aClass29Array8[local558.anInt7129].method5845(arg0 + Static47.anIntArray96[0] - 12, local165);
								local165 -= 2;
							}
						} else if (local13.anInt2478 >= 0 && local13.anInt2478 < Static222.aClass29Array8.length) {
							local176 = Static222.aClass29Array8[local13.anInt2478];
							local165 -= 25;
							local176.method5845(arg0 + Static47.anIntArray96[0] - (local176.method5840() >> 1), local165);
							local165 -= 2;
						}
					}
					@Pc(605) Class98[] local605;
					@Pc(613) Class98 local613;
					@Pc(632) Class29 local632;
					if (!(local30 instanceof Class7_Sub1_Sub1_Sub2)) {
						local603 = 0;
						local605 = Static36.aClass98Array1;
						for (local274 = 0; local274 < local605.length; local274++) {
							local613 = local605[local274];
							if (local613 != null && local613.anInt3425 == 1 && Static185.anIntArray309[local9 - Static329.anInt6733] == local613.anInt3417) {
								local632 = Static305.aClass29Array14[local613.anInt3430];
								if (local603 < local632.method5838()) {
									local603 = local632.method5838();
								}
								if (Static197.anInt4521 % 20 < 10) {
									local632.method5845(Static47.anIntArray96[0] + arg0 - 12, -local632.method5838() + local165);
								}
							}
						}
						if (local603 > 0) {
						}
					} else if (local9 >= 0) {
						local603 = 0;
						local605 = Static36.aClass98Array1;
						for (local274 = 0; local274 < local605.length; local274++) {
							local613 = local605[local274];
							if (local613 != null && local613.anInt3425 == 10 && local613.anInt3417 == Static238.anIntArray389[local9]) {
								local632 = Static305.aClass29Array14[local613.anInt3430];
								if (local603 < local632.method5838()) {
									local603 = local632.method5838();
								}
								local632.method5845(Static47.anIntArray96[0] + arg0 - 12, local165 - local632.method5838());
							}
						}
						if (local603 > 0) {
						}
					}
					for (local603 = 0; local603 < 4; local603++) {
						if (Static197.anInt4521 < local30.anIntArray576[local603]) {
							local262 = local30.method5983() / 2;
							Static120.method2588(arg1 >> 1, arg3 >> 1, local30, local262);
							if (Static47.anIntArray96[0] > -1) {
								if (local603 == 1) {
									Static47.anIntArray96[1] -= 20;
								}
								if (local603 == 2) {
									Static47.anIntArray96[0] -= 15;
									Static47.anIntArray96[1] -= 10;
								}
								if (local603 == 3) {
									Static47.anIntArray96[1] -= 10;
									Static47.anIntArray96[0] += 15;
								}
								Static67.aClass29Array2[local30.anIntArray575[local603]].method5845(arg0 + Static47.anIntArray96[0] - 12, arg2 + -12 + Static47.anIntArray96[1]);
								Static321.aClass30_4.method4831(0, Integer.toString(local30.anIntArray577[local603]), -1, arg0 + Static47.anIntArray96[0] - 1, arg2 + Static47.anIntArray96[1] - -3);
							}
						}
					}
				}
			}
		}
		@Pc(912) int local912;
		for (@Pc(906) int local906 = 0; local906 < Static263.anInt5598; local906++) {
			local912 = Static250.anIntArray400[local906];
			@Pc(923) Class7_Sub1_Sub1 local923;
			if (local912 >= 2048) {
				local923 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local912 - 2048];
			} else {
				local923 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local912];
			}
			local165 = Static36.anIntArray76[local906];
			@Pc(942) Class7_Sub1_Sub1 local942;
			if (local165 >= 2048) {
				local942 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local165 - 2048];
			} else {
				local942 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local165];
			}
			Static141.method3112(local923, local942, arg0, arg1, --local923.anInt7061, arg2, arg3);
		}
		local912 = Static140.aClass63_4.anInt2197 + Static140.aClass63_4.anInt2192 + 2;
		for (@Pc(982) int local982 = 0; local982 < Class1_Sub2_Sub17.lb; local982++) {
			local165 = Static286.anIntArray458[local982];
			local603 = Static286.anIntArray460[local982];
			local262 = Static286.anIntArray461[local982];
			@Pc(998) boolean local998 = true;
			while (local998) {
				local998 = false;
				for (local429 = 0; local429 < local982; local429++) {
					if (Static286.anIntArray460[local429] - local912 < local603 + 2 && Static286.anIntArray460[local429] + 2 > local603 - local912 && Static286.anIntArray461[local429] + Static286.anIntArray458[local429] > -local262 + local165 && local165 + local262 > -Static286.anIntArray461[local429] + Static286.anIntArray458[local429] && local603 > Static286.anIntArray460[local429] - local912) {
						local998 = true;
						local603 = Static286.anIntArray460[local429] - local912;
					}
				}
			}
			Static286.anIntArray460[local982] = local603;
			@Pc(1097) String local1097 = Static286.aStringArray40[local982];
			if (Static290.anInt6081 == 0) {
				local208 = 16776960;
				if (Static286.anIntArray463[local982] < 6) {
					local208 = Static20.anIntArray49[Static286.anIntArray463[local982]];
				}
				if (Static286.anIntArray463[local982] == 6) {
					local208 = Static135.anInt7217 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static286.anIntArray463[local982] == 7) {
					local208 = Static135.anInt7217 % 20 < 10 ? 255 : 65535;
				}
				if (Static286.anIntArray463[local982] == 8) {
					local208 = Static135.anInt7217 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static286.anIntArray463[local982] == 9) {
					local374 = 150 - Static286.anIntArray459[local982];
					if (local374 < 50) {
						local208 = local374 * 1280 + 16711680;
					} else if (local374 < 100) {
						local208 = 16776960 - (local374 - 50) * 327680;
					} else if (local374 < 150) {
						local208 = (local374 - 100) * 5 + 65280;
					}
				}
				if (Static286.anIntArray463[local982] == 10) {
					local374 = 150 - Static286.anIntArray459[local982];
					if (local374 < 50) {
						local208 = local374 * 5 + 16711680;
					} else if (local374 < 100) {
						local208 = 16711935 - (local374 - 50) * 327680;
					} else if (local374 < 150) {
						local208 = (local374 + -100) * 327680 + 255 - (local374 - 100) * 5;
					}
				}
				if (Static286.anIntArray463[local982] == 11) {
					local374 = 150 - Static286.anIntArray459[local982];
					if (local374 < 50) {
						local208 = 16777215 - local374 * 327685;
					} else if (local374 < 100) {
						local208 = (local374 - 50) * 327685 + 65280;
					} else if (local374 < 150) {
						local208 = 16777215 + 32768000 - local374 * 327680;
					}
				}
				local374 = local208 | 0xFF000000;
				if (Static286.anIntArray462[local982] == 0) {
					Static150.aClass30_2.method4831(-16777216, local1097, local374, local165 + arg0, local603 + arg2);
				}
				if (Static286.anIntArray462[local982] == 1) {
					Static150.aClass30_2.method4844(local603 + arg2, local374, Static135.anInt7217, local165 + arg0, local1097);
				}
				if (Static286.anIntArray462[local982] == 2) {
					Static150.aClass30_2.method4828(local603 + arg2, local1097, local165 + arg0, local374, Static135.anInt7217);
				}
				if (Static286.anIntArray462[local982] == 3) {
					Static150.aClass30_2.method4830(arg0 + local165, 150 - Static286.anIntArray459[local982], local374, local1097, local603 + arg2, Static135.anInt7217);
				}
				if (Static286.anIntArray462[local982] == 4) {
					local487 = (150 - Static286.anIntArray459[local982]) * (Static140.aClass63_4.method1849(local1097) + 100) / 150;
					Static221.aClass40_6.method2792(local165 + arg0 - 50, arg2, local165 + arg0 + 50, arg2 + arg1);
					Static150.aClass30_2.method4832(local1097, local374, local603 + arg2, arg0 + 50 + (local165 - local487), -16777216);
					Static221.aClass40_6.method2732(arg0, arg2, arg3 + arg0, arg2 - -arg1);
				}
				if (Static286.anIntArray462[local982] == 5) {
					local487 = 150 - Static286.anIntArray459[local982];
					@Pc(1488) int local1488 = 0;
					if (local487 < 25) {
						local1488 = local487 - 25;
					} else if (local487 > 125) {
						local1488 = local487 - 125;
					}
					@Pc(1514) int local1514 = Static140.aClass63_4.anInt2192 + Static140.aClass63_4.anInt2197;
					Static221.aClass40_6.method2792(arg0, arg2 + local603 - local1514 - 1, arg0 - -arg3, arg2 + local603 + 5);
					Static150.aClass30_2.method4831(-16777216, local1097, local374, local165 + arg0, local603 + (arg2 - -local1488));
					Static221.aClass40_6.method2732(arg0, arg2, arg3 + arg0, arg1 + arg2);
				}
			} else {
				Static150.aClass30_2.method4831(-16777216, local1097, -256, local165 + arg0, local603 + arg2);
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lclient!jr;")
	public static Class105 method2888(@OriginalArg(0) int arg0) {
		@Pc(12) Class105 local12 = (Class105) Static62.aClass215_22.method6057((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static214.aClass162_169.method4636(arg0, 31);
		local12 = new Class105();
		if (local22 != null) {
			local12.method3231(arg0, new Class1_Sub16(local22));
		}
		Static62.aClass215_22.method6050(local12, (long) arg0);
		return local12;
	}
}
