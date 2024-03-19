import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!oe;")
	public static Class1_Sub28 aClass1_Sub28_2;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public static void method5224() {
		@Pc(5) Class215 local5 = Static159.aClass215_63;
		synchronized (Static159.aClass215_63) {
			Static159.aClass215_63.method6052();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z")
	public static boolean method5227() {
		if (Static208.aBoolean333) {
			try {
				Static358.method1001(Static184.aClass199_12.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public static void method5228() {
		for (@Pc(11) int local11 = 0; local11 < Static318.anInt6552; local11++) {
			@Pc(17) int local17 = Static31.anIntArray61[local11];
			@Pc(21) Class7_Sub1_Sub1_Sub1 local21 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local17];
			@Pc(25) int local25 = Static299.aClass1_Sub16_Sub2_3.method5761();
			if ((local25 & 0x20) != 0) {
				local25 += Static299.aClass1_Sub16_Sub2_3.method5761() << 8;
			}
			@Pc(51) int local51;
			@Pc(60) int local60;
			@Pc(130) int local130;
			if ((local25 & 0x10) != 0) {
				local51 = Static299.aClass1_Sub16_Sub2_3.method5748();
				if (local51 == 65535) {
					local51 = -1;
				}
				local60 = Static299.aClass1_Sub16_Sub2_3.method5735();
				@Pc(62) boolean local62 = true;
				@Pc(127) Class165 local127;
				if (local51 != -1 && local21.anInt7052 != -1) {
					@Pc(77) Class122 local77;
					if (local21.anInt7052 == local51) {
						local77 = Static243.method4561(local51);
						if (local77.aBoolean295 && local77.anInt4135 != -1) {
							local127 = Static231.method4385(local77.anInt4135);
							local130 = local127.anInt5575;
							if (local130 == 0) {
								local62 = false;
							} else if (local130 == 1) {
								local62 = true;
							} else if (local130 == 2) {
								local21.anInt7099 = 0;
								local62 = false;
							}
						}
					} else {
						local77 = Static243.method4561(local51);
						@Pc(82) Class122 local82 = Static243.method4561(local21.anInt7052);
						if (local77.anInt4135 != -1 && local82.anInt4135 != -1) {
							@Pc(97) Class165 local97 = Static231.method4385(local77.anInt4135);
							@Pc(102) Class165 local102 = Static231.method4385(local82.anInt4135);
							if (local97.anInt5568 < local102.anInt5568) {
								local62 = false;
							}
						}
					}
				}
				if (local62) {
					local21.anInt7052 = local51;
					local21.anInt7081 = Static197.anInt4521 + (local60 & 0xFFFF);
					local21.anInt7050 = 1;
					local21.anInt7080 = local60 >> 16;
					local21.anInt7060 = 0;
					local21.anInt7082 = 0;
					if (Static197.anInt4521 < local21.anInt7081) {
						local21.anInt7060 = -1;
					}
					if (local21.anInt7052 != -1 && local21.anInt7081 == Static197.anInt4521) {
						@Pc(206) int local206 = Static243.method4561(local21.anInt7052).anInt4135;
						if (local206 != -1) {
							local127 = Static231.method4385(local206);
							if (local127 != null && local127.anIntArray407 != null) {
								Static209.method4128(local21.anInt7027, false, 0, local21.anInt7032, local127);
							}
						}
					}
				}
			}
			if ((local25 & 0x4) != 0) {
				local21.aString265 = Static299.aClass1_Sub16_Sub2_3.method5776();
				local21.anInt7072 = 100;
			}
			if ((local25 & 0x2) != 0) {
				local51 = Static299.aClass1_Sub16_Sub2_3.method5744();
				local60 = Static299.aClass1_Sub16_Sub2_3.method5766();
				local21.method5975(local51, local60, Static197.anInt4521);
			}
			if ((local25 & 0x100) != 0) {
				local51 = Static299.aClass1_Sub16_Sub2_3.method5729();
				@Pc(274) int[] local274 = new int[local51];
				@Pc(277) int[] local277 = new int[local51];
				@Pc(280) int[] local280 = new int[local51];
				for (@Pc(282) int local282 = 0; local282 < local51; local282++) {
					local130 = Static299.aClass1_Sub16_Sub2_3.method5748();
					if (local130 == 65535) {
						local130 = -1;
					}
					local274[local282] = local130;
					local277[local282] = Static299.aClass1_Sub16_Sub2_3.method5729();
					local280[local282] = Static299.aClass1_Sub16_Sub2_3.method5748();
				}
				Static123.method2639(local274, local280, local277, local21);
			}
			if ((local25 & 0x400) != 0) {
				local21.anInt7045 = Static299.aClass1_Sub16_Sub2_3.method5769();
				local21.anInt7091 = Static299.aClass1_Sub16_Sub2_3.method5749();
			}
			if ((local25 & 0x40) != 0) {
				if (local21.aClass75_1.method2058()) {
					Static305.method5378(local21);
				}
				local21.method330(Static123.method2640(Static299.aClass1_Sub16_Sub2_3.method5758()));
				local21.method5978(local21.aClass75_1.anInt2458);
				local21.anInt7100 = local21.aClass75_1.anInt2465 << 3;
				if (local21.aClass75_1.method2058()) {
					Static67.method143(null, 0, local21.anIntArray579[0], local21, Static39.anInt1215, null, local21.anIntArray578[0]);
				}
			}
			if ((local25 & 0x80) != 0) {
				local51 = Static299.aClass1_Sub16_Sub2_3.method5758();
				if (local51 == 65535) {
					local51 = -1;
				}
				local60 = Static299.aClass1_Sub16_Sub2_3.method5738();
				Static78.method1784(local21, local51, local60);
			}
			if ((local25 & 0x1) != 0) {
				local21.anInt7054 = Static299.aClass1_Sub16_Sub2_3.method5748();
				if (local21.anInt7054 == 65535) {
					local21.anInt7054 = -1;
				}
			}
			if ((local25 & 0x200) != 0) {
				local51 = Static299.aClass1_Sub16_Sub2_3.method5749();
				local21.anInt7088 = Static299.aClass1_Sub16_Sub2_3.method5729();
				local21.anInt7058 = Static299.aClass1_Sub16_Sub2_3.method5729();
				local21.anInt7094 = local51 & 0x7FFF;
				local21.aBoolean509 = (local51 & 0x8000) != 0;
				local21.lb = Static197.anInt4521 + local21.anInt7094 + local21.anInt7088;
			}
			if ((local25 & 0x8) != 0) {
				local51 = Static299.aClass1_Sub16_Sub2_3.method5744();
				local60 = Static299.aClass1_Sub16_Sub2_3.method5761();
				local21.method5975(local51, local60, Static197.anInt4521);
				local21.anInt7068 = Static197.anInt4521 + 300;
				local21.anInt7073 = Static299.aClass1_Sub16_Sub2_3.method5761();
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5233(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static353.anInt7366++;
		Static160.anInt7325 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static75.anInt2068; local7 < Static214.anInt4867; local7++) {
			@Pc(12) Class154[][] local12 = Static241.aClass154ArrayArrayArray2[local7];
			for (local14 = Static76.anInt2086; local14 < Static53.anInt1599; local14++) {
				for (@Pc(17) int local17 = Static29.anInt6406; local17 < Static130.anInt6803; local17++) {
					@Pc(24) Class154 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static100.aBooleanArrayArray7[local14 + Static292.anInt6117 - Static328.anInt6714][local17 + Static292.anInt6117 - Static61.anInt1677] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean369 = true;
							local24.aBoolean370 = true;
							if (local24.aClass93_3 == null) {
								local24.aBoolean371 = false;
							} else {
								local24.aBoolean371 = true;
							}
							Static160.anInt7325++;
						} else {
							local24.aBoolean369 = false;
							local24.aBoolean370 = false;
							local24.aByte44 = 0;
							if (local14 >= Static328.anInt6714 - 16 && local14 <= Static328.anInt6714 + 16 && local17 >= Static61.anInt1677 - 16 && local17 <= Static61.anInt1677 + 16 && (local24.aClass7_Sub2_1 != null || local24.aClass7_Sub2_2 != null || local24.aClass7_Sub3_2 != null || local24.aClass7_Sub3_1 != null || local24.aClass7_Sub5_1 != null || local24.aClass93_3 != null)) {
								Static110.aClass23_2.method1373(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static137.aClass77Array2 == Static118.aClass77Array1;
		for (local14 = Static75.anInt2068; local14 < Static214.anInt4867; local14++) {
			@Pc(161) float local161 = local145 ? 202.0F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static332.aClass40_8.method2767() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static100.aBooleanArrayArray7.length;
				if (Static76.anInt2086 + Static100.aBooleanArrayArray7.length > Static328.anInt6717) {
					local172 -= Static76.anInt2086 + Static100.aBooleanArrayArray7.length - Static328.anInt6717;
				}
				@Pc(192) int local192 = Static100.aBooleanArrayArray7[0].length;
				if (Static29.anInt6406 + Static100.aBooleanArrayArray7[0].length > Static200.anInt4590) {
					local192 -= Static29.anInt6406 + Static100.aBooleanArrayArray7[0].length - Static200.anInt4590;
				}
				@Pc(213) int local213 = Static286.anInt6057;
				while (true) {
					if (local213 >= local172) {
						Static110.aClass23_2.method1377(Static118.aClass77Array1[local14], local161, true, local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static76.anInt2086 - Static286.anInt6057;
					for (@Pc(222) int local222 = Static224.anInt5350; local222 < local192; local222++) {
						Static161.aBooleanArrayArray5[local213][local222] = false;
						if (Static100.aBooleanArrayArray7[local213][local222]) {
							@Pc(241) int local241 = local222 + Static29.anInt6406 - Static224.anInt5350;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static241.aClass154ArrayArrayArray2[local243][local220][local241] != null && Static241.aClass154ArrayArrayArray2[local243][local220][local241].aByte46 == local14) {
									Static161.aBooleanArrayArray5[local213][local222] = Static241.aClass154ArrayArrayArray2[local243][local220][local241].aBoolean369;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static110.aClass23_2.method1377(Static118.aClass77Array1[local14], local161, false, local14);
			}
			Static110.aClass23_2.method1381();
		}
		if (!Static129.method2893(true)) {
			Static129.method2893(false);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)V")
	public static void method5234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Static140.aClass63_4.method1849(Static177.aString156);
		@Pc(21) int local21;
		for (@Pc(15) Class1_Sub22 local15 = (Class1_Sub22) Static97.aClass130_9.method3749(); local15 != null; local15 = (Class1_Sub22) Static97.aClass130_9.method3756()) {
			local21 = Static227.method4344(local15);
			if (local21 > local10) {
				local10 = local21;
			}
		}
		local10 += 8;
		local21 = Static237.anInt5285 * 16 + 21;
		@Pc(52) int local52 = arg0 - local10 / 2;
		if (Static107.anInt2674 < local10 + local52) {
			local52 = Static107.anInt2674 - local10;
		}
		if (local52 < 0) {
			local52 = 0;
		}
		@Pc(75) int local75 = arg1;
		if (Static350.anInt7318 < arg1 + local21) {
			local75 = Static350.anInt7318 - local21;
		}
		if (local75 < 0) {
			local75 = 0;
		}
		Static234.anInt5225 = local52;
		Static140.anInt3473 = local10;
		Static204.aBoolean329 = true;
		Static52.anInt1577 = local75;
		Static259.anInt4930 = Static237.anInt5285 * 16 + (Static236.aBoolean367 ? 26 : 22);
	}
}
