import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
	public static int anInt5225;

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
	public static int anInt5229;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
	public static int anInt5226 = -2;

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "Lclient!we;")
	public static final Class215 aClass215_72 = new Class215(16);

	@OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
	public static int anInt5231 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
	public static void method4460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static246.aBoolean472) {
			return;
		}
		Static150.aClass1_Sub16_Sub2_2.method5793(145);
		Static150.aClass1_Sub16_Sub2_2.method5768(arg0);
		Static150.aClass1_Sub16_Sub2_2.method5734(arg1);
		Static150.aClass1_Sub16_Sub2_2.method5780(Static139.anInt3442);
		Static150.aClass1_Sub16_Sub2_2.method5734(Static156.anInt3876);
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
	public static void method4462() {
		Static351.aClass215_101.method6060();
		Static18.aClass215_9.method6060();
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
	public static void method4463() {
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(34) int local34;
		if (Static305.anInt6393 == 15) {
			Static299.aClass1_Sub16_Sub2_3.method5761();
			local16 = Static299.aClass1_Sub16_Sub2_3.method5761();
			local24 = (local16 >> 4 & 0x7) + Static346.anInt7306;
			local30 = (local16 & 0x7) + Static320.anInt6611;
			local34 = Static299.aClass1_Sub16_Sub2_3.method5749();
			local40 = Static299.aClass1_Sub16_Sub2_3.method5761();
			local44 = Static299.aClass1_Sub16_Sub2_3.method5755();
			@Pc(48) String local48 = Static299.aClass1_Sub16_Sub2_3.method5776();
			Static295.method5221(local30, local34, local40, local44, local24, local48);
			return;
		}
		@Pc(97) int local97;
		@Pc(101) int local101;
		if (Static305.anInt6393 == 115) {
			local16 = Static299.aClass1_Sub16_Sub2_3.method5766();
			local24 = Static346.anInt7306 + (local16 >> 4 & 0x7);
			local30 = (local16 & 0x7) + Static320.anInt6611;
			local34 = Static299.aClass1_Sub16_Sub2_3.method5758();
			local40 = Static299.aClass1_Sub16_Sub2_3.method5766();
			local44 = local40 >> 2;
			local97 = local40 & 0x3;
			local101 = Static81.anIntArray574[local44];
			if (local24 >= 0 && local30 >= 0 && local24 < Static25.anInt850 && local30 < Static219.anInt4987) {
				Static130.method5759(local44, local24, -1, local101, local30, local97, 0, Static39.anInt1215, local34);
			}
		} else if (Static305.anInt6393 == 22) {
			local16 = Static299.aClass1_Sub16_Sub2_3.method5758();
			local24 = Static299.aClass1_Sub16_Sub2_3.method5749();
			local30 = Static299.aClass1_Sub16_Sub2_3.method5766();
			local34 = Static346.anInt7306 + (local30 >> 4 & 0x7);
			local40 = Static320.anInt6611 + (local30 & 0x7);
			if (local34 >= 0 && local40 >= 0 && Static25.anInt850 > local34 && Static219.anInt4987 > local40) {
				Static237.method4507(Static39.anInt1215, local40, local34, new Class1_Sub19(local24, local16));
				Static212.method6171(local40, Static39.anInt1215, local34);
			}
		} else {
			@Pc(261) int local261;
			@Pc(267) int local267;
			@Pc(271) int local271;
			@Pc(275) int local275;
			@Pc(279) int local279;
			@Pc(255) int local255;
			if (Static305.anInt6393 == 229) {
				local16 = Static299.aClass1_Sub16_Sub2_3.method5761();
				local24 = Static346.anInt7306 * 2 + (local16 >> 4 & 0xF);
				local30 = Static320.anInt6611 * 2 + (local16 & 0xF);
				local34 = Static299.aClass1_Sub16_Sub2_3.method5772() + local24;
				local40 = local30 + Static299.aClass1_Sub16_Sub2_3.method5772();
				local44 = Static299.aClass1_Sub16_Sub2_3.method5762();
				local97 = Static299.aClass1_Sub16_Sub2_3.method5762();
				local101 = Static299.aClass1_Sub16_Sub2_3.method5749();
				local255 = Static299.aClass1_Sub16_Sub2_3.method5772();
				local261 = Static299.aClass1_Sub16_Sub2_3.method5761() * 4;
				local267 = Static299.aClass1_Sub16_Sub2_3.method5749();
				local271 = Static299.aClass1_Sub16_Sub2_3.method5749();
				local275 = Static299.aClass1_Sub16_Sub2_3.method5761();
				local279 = Static299.aClass1_Sub16_Sub2_3.method5761();
				if (local275 == 255) {
					local275 = -1;
				}
				if (local24 >= 0 && local30 >= 0 && local24 < 208 && local30 < 208 && local34 >= 0 && local40 >= 0 && local34 < 208 && local40 < 208 && local101 != 65535) {
					local30 = local30 * 64;
					local34 = local34 * 64;
					local40 *= 64;
					local24 *= 64;
					if (local44 != 0) {
						@Pc(354) int local354;
						@Pc(361) Class7_Sub1_Sub1 local361;
						@Pc(344) int local344;
						@Pc(348) int local348;
						if (local44 < 0) {
							local344 = -local44 - 1;
							local348 = local344 & 0x7FF;
							local354 = local344 >> 11 & 0xF;
							if (local348 == Static172.anInt6634) {
								local361 = Static264.aClass7_Sub1_Sub1_Sub2_2;
							} else {
								local361 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local348];
							}
						} else {
							local344 = local44 - 1;
							local354 = local344 >> 11 & 0xF;
							local348 = local344 & 0x7FF;
							local361 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local348];
						}
						if (local361 != null) {
							@Pc(391) Class83 local391 = local361.method5982();
							if (local391.anIntArrayArray14 != null && local391.anIntArrayArray14[local354] != null) {
								local348 = local391.anIntArrayArray14[local354][0];
								@Pc(413) int local413 = local391.anIntArrayArray14[local354][2];
								@Pc(418) int local418 = local361.aClass175_7.method4862();
								@Pc(422) int local422 = Class39.anIntArray88[local418];
								@Pc(426) int local426 = Class39.anIntArray87[local418];
								@Pc(437) int local437 = local413 * local422 + local426 * local348 >> 15;
								@Pc(448) int local448 = local413 * local426 - local422 * local348 >> 15;
								local30 += local448;
								local255 -= local391.anIntArrayArray14[local354][1];
								local24 += local437;
							}
						}
					}
					@Pc(494) Class7_Sub1_Sub2 local494 = new Class7_Sub1_Sub2(local101, Static39.anInt1215, local24, local30, Static309.method5429(local30, local24, Static39.anInt1215) - local255, local267 - -Static197.anInt4521, Static197.anInt4521 + local271, local275, local279, local97, local261);
					local494.method1875(Static197.anInt4521 + local267, -local261 + Static309.method5429(local40, local34, Static39.anInt1215), local34, local40);
					Static77.aClass130_6.method3760(new Class1_Sub1_Sub5(local494));
				}
			} else {
				@Pc(681) Class7_Sub1_Sub2 local681;
				if (Static305.anInt6393 == 212) {
					local16 = Static299.aClass1_Sub16_Sub2_3.method5761();
					local24 = (local16 >> 4 & 0xF) + Static346.anInt7306 * 2;
					local30 = (local16 & 0xF) + Static320.anInt6611 * 2;
					local34 = Static299.aClass1_Sub16_Sub2_3.method5772() + local24;
					local40 = Static299.aClass1_Sub16_Sub2_3.method5772() + local30;
					local44 = Static299.aClass1_Sub16_Sub2_3.method5762();
					local97 = Static299.aClass1_Sub16_Sub2_3.method5749();
					local101 = Static299.aClass1_Sub16_Sub2_3.method5761() * 4;
					local255 = Static299.aClass1_Sub16_Sub2_3.method5761() * 4;
					local261 = Static299.aClass1_Sub16_Sub2_3.method5749();
					local267 = Static299.aClass1_Sub16_Sub2_3.method5749();
					local271 = Static299.aClass1_Sub16_Sub2_3.method5761();
					if (local271 == 255) {
						local271 = -1;
					}
					local275 = Static299.aClass1_Sub16_Sub2_3.method5761();
					if (local24 >= 0 && local30 >= 0 && local24 < 208 && local30 < 208 && local34 >= 0 && local40 >= 0 && local34 < 208 && local40 < 208 && local97 != 65535) {
						local40 = local40 * 64;
						local30 = local30 * 64;
						local34 *= 64;
						local24 = local24 * 64;
						local681 = new Class7_Sub1_Sub2(local97, Static39.anInt1215, local24, local30, Static309.method5429(local30, local24, Static39.anInt1215) - local101, local261 + Static197.anInt4521, local267 + Static197.anInt4521, local271, local275, local44, local255);
						local681.method1875(Static197.anInt4521 + local261, Static309.method5429(local40, local34, Static39.anInt1215) + -local255, local34, local40);
						Static77.aClass130_6.method3760(new Class1_Sub1_Sub5(local681));
					}
				} else {
					if (Static305.anInt6393 == 6) {
						local16 = Static299.aClass1_Sub16_Sub2_3.method5729();
						local24 = (local16 >> 4 & 0x7) + Static346.anInt7306;
						local30 = Static320.anInt6611 + (local16 & 0x7);
						@Pc(732) byte local732 = Static299.aClass1_Sub16_Sub2_3.method5736();
						local40 = Static299.aClass1_Sub16_Sub2_3.method5769();
						local44 = Static299.aClass1_Sub16_Sub2_3.method5747();
						@Pc(744) byte local744 = Static299.aClass1_Sub16_Sub2_3.method5737();
						@Pc(748) byte local748 = Static299.aClass1_Sub16_Sub2_3.method5736();
						@Pc(752) byte local752 = Static299.aClass1_Sub16_Sub2_3.method5739();
						local261 = Static299.aClass1_Sub16_Sub2_3.method5749();
						local267 = Static299.aClass1_Sub16_Sub2_3.method5769();
						local271 = Static299.aClass1_Sub16_Sub2_3.method5729();
						local275 = local271 >> 2;
						local279 = local271 & 0x3;
						if (!Static221.aClass40_6.method2767()) {
							Static272.method4896(local24, local752, local732, local261, local44, local267, local30, local275, local279, local748, local744, local40);
						}
					}
					if (Static305.anInt6393 == 221) {
						local16 = Static299.aClass1_Sub16_Sub2_3.method5729();
						local24 = Static346.anInt7306 + (local16 >> 4 & 0x7);
						local30 = Static320.anInt6611 + (local16 & 0x7);
						local34 = Static299.aClass1_Sub16_Sub2_3.method5749();
						if (local24 >= 0 && local30 >= 0 && Static25.anInt850 > local24 && local30 < Static219.anInt4987) {
							@Pc(856) Class1_Sub11 local856 = (Class1_Sub11) Static208.aClass183_24.method5053((long) (local24 | Static39.anInt1215 << 28 | local30 << 14));
							if (local856 != null) {
								for (@Pc(864) Class1_Sub19 local864 = (Class1_Sub19) local856.aClass130_11.method3749(); local864 != null; local864 = (Class1_Sub19) local856.aClass130_11.method3756()) {
									if ((local34 & 0x7FFF) == local864.anInt3991) {
										local864.method6172();
										break;
									}
								}
								if (local856.aClass130_11.method3757()) {
									local856.method6172();
								}
								Static212.method6171(local30, Static39.anInt1215, local24);
							}
						}
					} else if (Static305.anInt6393 == 27) {
						local16 = Static299.aClass1_Sub16_Sub2_3.method5738();
						local24 = (local16 >> 4 & 0x7) + Static346.anInt7306;
						local30 = Static320.anInt6611 + (local16 & 0x7);
						local34 = Static299.aClass1_Sub16_Sub2_3.method5766();
						local40 = local34 >> 2;
						local44 = local34 & 0x3;
						local97 = Static81.anIntArray574[local40];
						if (local24 >= 0 && local30 >= 0 && Static25.anInt850 > local24 && local30 < Static219.anInt4987) {
							Static130.method5759(local40, local24, -1, local97, local30, local44, 0, Static39.anInt1215, -1);
						}
					} else if (Static305.anInt6393 == 223) {
						local16 = Static299.aClass1_Sub16_Sub2_3.method5761();
						local24 = Static346.anInt7306 + (local16 >> 4 & 0x7);
						local30 = Static320.anInt6611 + (local16 & 0x7);
						local34 = Static299.aClass1_Sub16_Sub2_3.method5772() + local24;
						local40 = local30 + Static299.aClass1_Sub16_Sub2_3.method5772();
						local44 = Static299.aClass1_Sub16_Sub2_3.method5762();
						local97 = Static299.aClass1_Sub16_Sub2_3.method5749();
						local101 = Static299.aClass1_Sub16_Sub2_3.method5761() * 4;
						local255 = Static299.aClass1_Sub16_Sub2_3.method5761() * 4;
						local261 = Static299.aClass1_Sub16_Sub2_3.method5749();
						local267 = Static299.aClass1_Sub16_Sub2_3.method5749();
						local271 = Static299.aClass1_Sub16_Sub2_3.method5761();
						if (local271 == 255) {
							local271 = -1;
						}
						local275 = Static299.aClass1_Sub16_Sub2_3.method5761();
						if (local24 >= 0 && local30 >= 0 && Static25.anInt850 > local24 && local30 < Static219.anInt4987 && local34 >= 0 && local40 >= 0 && local34 < Static25.anInt850 && local40 < Static219.anInt4987 && local97 != 65535) {
							local30 = local30 * 128 + 64;
							local34 = local34 * 128 + 64;
							local40 = local40 * 128 + 64;
							local24 = local24 * 128 + 64;
							local681 = new Class7_Sub1_Sub2(local97, Static39.anInt1215, local24, local30, Static309.method5429(local30, local24, Static39.anInt1215) - local101, local261 + Static197.anInt4521, Static197.anInt4521 + local267, local271, local275, local44, local255);
							local681.method1875(Static197.anInt4521 + local261, Static309.method5429(local40, local34, Static39.anInt1215) + -local255, local34, local40);
							Static77.aClass130_6.method3760(new Class1_Sub1_Sub5(local681));
						}
					} else if (Static305.anInt6393 == 155) {
						local16 = Static299.aClass1_Sub16_Sub2_3.method5761();
						local24 = (local16 >> 4 & 0x7) + Static346.anInt7306;
						local30 = (local16 & 0x7) + Static320.anInt6611;
						local34 = Static299.aClass1_Sub16_Sub2_3.method5749();
						if (local34 == 65535) {
							local34 = -1;
						}
						local40 = Static299.aClass1_Sub16_Sub2_3.method5761();
						local44 = local40 >> 4 & 0xF;
						local97 = local40 & 0x7;
						local101 = Static299.aClass1_Sub16_Sub2_3.method5761();
						local255 = Static299.aClass1_Sub16_Sub2_3.method5761();
						if (local24 >= 0 && local30 >= 0 && local24 < Static25.anInt850 && Static219.anInt4987 > local30) {
							local261 = local44 + 1;
							if (local24 - local261 <= Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0] && Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0] <= local24 + local261 && local30 - local261 <= Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0] && Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0] <= local261 + local30 && Static183.anInt4317 != 0 && local97 > 0 && Static88.anInt2333 < 50 && local34 != -1) {
								Static246.anIntArray499[Static88.anInt2333] = local34;
								Static101.anIntArray161[Static88.anInt2333] = local97;
								Static187.anIntArray311[Static88.anInt2333] = local101;
								Static114.aClass19Array2[Static88.anInt2333] = null;
								Static183.anIntArray308[Static88.anInt2333] = (local30 << 8) + (local24 << 16) + local44;
								Static308.anIntArray494[Static88.anInt2333] = local255;
								Static88.anInt2333++;
							}
						}
					} else if (Static305.anInt6393 == 249) {
						local16 = Static299.aClass1_Sub16_Sub2_3.method5761();
						local24 = (local16 >> 4 & 0x7) + Static346.anInt7306;
						local30 = Static320.anInt6611 + (local16 & 0x7);
						local34 = Static299.aClass1_Sub16_Sub2_3.method5749();
						local40 = Static299.aClass1_Sub16_Sub2_3.method5761();
						local44 = Static299.aClass1_Sub16_Sub2_3.method5749();
						if (local24 >= 0 && local30 >= 0 && Static25.anInt850 > local24 && local30 < Static219.anInt4987) {
							local97 = local24 * 128 + 64;
							local101 = local30 * 128 + 64;
							@Pc(1423) Class7_Sub1_Sub4 local1423 = new Class7_Sub1_Sub4(local34, local44, Static197.anInt4521, Static39.anInt1215, local97, Static309.method5429(local101, local97, Static39.anInt1215) - local40, local101, local24, local24, local30, local30);
							Static66.aClass130_5.method3760(new Class1_Sub1_Sub7(local1423));
						}
					} else if (Static305.anInt6393 == 112) {
						local16 = Static299.aClass1_Sub16_Sub2_3.method5749();
						local24 = Static299.aClass1_Sub16_Sub2_3.method5766();
						local30 = Static346.anInt7306 + (local24 >> 4 & 0x7);
						local34 = (local24 & 0x7) + Static320.anInt6611;
						local40 = Static299.aClass1_Sub16_Sub2_3.method5748();
						local44 = Static299.aClass1_Sub16_Sub2_3.method5769();
						if (local30 >= 0 && local34 >= 0 && local30 < Static25.anInt850 && local34 < Static219.anInt4987 && local16 != Static172.anInt6634) {
							Static237.method4507(Static39.anInt1215, local34, local30, new Class1_Sub19(local40, local44));
							Static212.method6171(local34, Static39.anInt1215, local30);
						}
					} else if (Static305.anInt6393 == 82) {
						local16 = Static299.aClass1_Sub16_Sub2_3.method5761();
						local24 = (local16 >> 4 & 0x7) + Static346.anInt7306;
						local30 = (local16 & 0x7) + Static320.anInt6611;
						local34 = Static299.aClass1_Sub16_Sub2_3.method5749();
						local40 = Static299.aClass1_Sub16_Sub2_3.method5749();
						local44 = Static299.aClass1_Sub16_Sub2_3.method5749();
						if (Static208.aClass183_24 != null && local24 >= 0 && local30 >= 0 && local24 < Static25.anInt850 && local30 < Static219.anInt4987) {
							@Pc(1573) Class1_Sub11 local1573 = (Class1_Sub11) Static208.aClass183_24.method5053((long) (local30 << 14 | Static39.anInt1215 << 28 | local24));
							if (local1573 != null) {
								for (@Pc(1583) Class1_Sub19 local1583 = (Class1_Sub19) local1573.aClass130_11.method3749(); local1583 != null; local1583 = (Class1_Sub19) local1573.aClass130_11.method3756()) {
									if ((local34 & 0x7FFF) == local1583.anInt3991 && local40 == local1583.anInt3986) {
										local1583.method6172();
										local1583.anInt3986 = local44;
										Static237.method4507(Static39.anInt1215, local30, local24, local1583);
										break;
									}
								}
								Static212.method6171(local30, Static39.anInt1215, local24);
							}
						}
					} else if (Static305.anInt6393 == 254) {
						local16 = Static299.aClass1_Sub16_Sub2_3.method5749();
						if (local16 == 65535) {
							local16 = -1;
						}
						local24 = Static299.aClass1_Sub16_Sub2_3.method5761();
						local30 = local24 >> 2;
						local34 = local24 & 0x3;
						local40 = Static81.anIntArray574[local30];
						local44 = Static299.aClass1_Sub16_Sub2_3.method5738();
						local97 = Static346.anInt7306 + (local44 >> 4 & 0x7);
						local101 = (local44 & 0x7) + Static320.anInt6611;
						Static94.method2023(local16, local30, Static39.anInt1215, local101, local34, local40, local97);
					} else if (Static305.anInt6393 == 78) {
						local16 = Static299.aClass1_Sub16_Sub2_3.method5749();
						local24 = Static299.aClass1_Sub16_Sub2_3.method5761();
						Static83.method1840(local16).method5203(local24);
					}
				}
			}
		}
	}
}
