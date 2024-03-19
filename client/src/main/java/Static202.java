import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
	public static int anInt4679;

	@OriginalMember(owner = "client!nh", name = "X", descriptor = "Lclient!ao;")
	public static Class11 aClass11_10;

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "J")
	public static long aLong139 = 0L;

	@OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
	public static int anInt4684 = 0;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
	public static void method4037() {
		Static158.method3369(Static86.aCanvas2);
		Static320.method5624(Static86.aCanvas2);
		if (Static262.aClass28_1 != null) {
			Static262.aClass28_1.method712(Static86.aCanvas2);
		}
		Static345.aClient1.method905();
		Static86.aCanvas2.setBackground(Color.black);
		Static95.anInt2438 = -1;
		Static12.method346(Static86.aCanvas2);
		Static167.method3465(Static86.aCanvas2);
		if (Static262.aClass28_1 != null) {
			Static262.aClass28_1.method709(Static86.aCanvas2);
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)V")
	public static void method4038() {
		if (Static257.anInt5551 > 1) {
			Static345.anInt7277 = Class7_Sub5.anInt3948;
			Static257.anInt5551--;
		}
		if (Static43.anInt1466 > 0) {
			Static43.anInt1466--;
		}
		if (Static228.aBoolean354) {
			Static228.aBoolean354 = false;
			Static224.method4551();
			return;
		}
		if (!Static204.aBoolean329) {
			Static339.method6154();
		}
		for (@Pc(33) int local33 = 0; local33 < 100 && Static102.method2128(); local33++) {
		}
		if (Static214.anInt4865 != 30) {
			return;
		}
		Static287.method5124(Static150.aClass1_Sub16_Sub2_2);
		@Pc(55) Object local55 = Static10.aClass64_1.anObject4;
		@Pc(80) int local80;
		@Pc(82) int local82;
		@Pc(84) int local84;
		@Pc(99) int local99;
		@Pc(118) int local118;
		@Pc(181) int local181;
		synchronized (Static10.aClass64_1.anObject4) {
			if (!Static248.aBoolean377) {
				Static10.aClass64_1.anInt2331 = 0;
			} else if (Static195.anInt4494 != 0 || Static10.aClass64_1.anInt2331 >= 40) {
				Static150.aClass1_Sub16_Sub2_2.method5793(158);
				Static150.aClass1_Sub16_Sub2_2.method5771(0);
				local80 = Static150.aClass1_Sub16_Sub2_2.anInt6813;
				local82 = 0;
				for (local84 = 0; local84 < Static10.aClass64_1.anInt2331 && Static150.aClass1_Sub16_Sub2_2.anInt6813 - local80 < 240; local84++) {
					local82++;
					local99 = Static10.aClass64_1.anIntArray146[local84];
					if (local99 < 0) {
						local99 = 0;
					} else if (local99 > 65534) {
						local99 = 65534;
					}
					local118 = Static10.aClass64_1.anIntArray147[local84];
					if (local118 < 0) {
						local118 = 0;
					} else if (local118 > 65534) {
						local118 = 65534;
					}
					@Pc(136) boolean local136 = false;
					if (Static10.aClass64_1.anIntArray146[local84] == -1 && Static10.aClass64_1.anIntArray147[local84] == -1) {
						local136 = true;
						local118 = -1;
						local99 = -1;
					}
					if (Static1.anInt82 != local118 || Static4.anInt208 != local99) {
						local181 = local118 - Static1.anInt82;
						Static1.anInt82 = local118;
						@Pc(188) int local188 = local99 - Static4.anInt208;
						Static4.anInt208 = local99;
						if (Static90.anInt2382 < 8 && local181 >= -32 && local181 <= 31 && local188 >= -32 && local188 <= 31) {
							local188 += 32;
							local181 += 32;
							Static150.aClass1_Sub16_Sub2_2.method5757(local188 + (Static90.anInt2382 << 12) + (local181 << 6));
							Static90.anInt2382 = 0;
						} else if (Static90.anInt2382 < 32 && local181 >= -128 && local181 <= 127 && local188 >= -128 && local188 <= 127) {
							Static150.aClass1_Sub16_Sub2_2.method5771(Static90.anInt2382 + 128);
							local181 += 128;
							local188 += 128;
							Static150.aClass1_Sub16_Sub2_2.method5757(local188 + (local181 << 8));
							Static90.anInt2382 = 0;
						} else if (Static90.anInt2382 < 32) {
							Static150.aClass1_Sub16_Sub2_2.method5771(Static90.anInt2382 + 192);
							if (local136) {
								Static150.aClass1_Sub16_Sub2_2.method5768(Integer.MIN_VALUE);
							} else {
								Static150.aClass1_Sub16_Sub2_2.method5768(local118 | local99 << 16);
							}
							Static90.anInt2382 = 0;
						} else {
							Static150.aClass1_Sub16_Sub2_2.method5757(Static90.anInt2382 + 57344);
							if (local136) {
								Static150.aClass1_Sub16_Sub2_2.method5768(Integer.MIN_VALUE);
							} else {
								Static150.aClass1_Sub16_Sub2_2.method5768(local118 | local99 << 16);
							}
							Static90.anInt2382 = 0;
						}
					} else if (Static90.anInt2382 < 2047) {
						Static90.anInt2382++;
					}
				}
				Static150.aClass1_Sub16_Sub2_2.method5733(Static150.aClass1_Sub16_Sub2_2.anInt6813 - local80);
				if (local82 < Static10.aClass64_1.anInt2331) {
					Static10.aClass64_1.anInt2331 -= local82;
					for (local99 = 0; local99 < Static10.aClass64_1.anInt2331; local99++) {
						Static10.aClass64_1.anIntArray147[local99] = Static10.aClass64_1.anIntArray147[local99 + local82];
						Static10.aClass64_1.anIntArray146[local99] = Static10.aClass64_1.anIntArray146[local99 + local82];
					}
				} else {
					Static10.aClass64_1.anInt2331 = 0;
				}
			}
		}
		if (Static195.anInt4494 != 0) {
			@Pc(412) long local412 = (aLong139 - Static335.aLong222) / 50L;
			Static335.aLong222 = aLong139;
			if (local412 > 32767L) {
				local412 = 32767L;
			}
			local80 = Static121.anInt3045;
			if (local80 < 0) {
				local80 = 0;
			} else if (local80 > 65535) {
				local80 = 65535;
			}
			local82 = Static324.anInt6648;
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 > 65535) {
				local82 = 65535;
			}
			@Pc(450) byte local450 = 0;
			if (Static195.anInt4494 == 2) {
				local450 = 1;
			}
			local99 = (int) local412;
			Static150.aClass1_Sub16_Sub2_2.method5793(87);
			Static150.aClass1_Sub16_Sub2_2.method5734(local450 << 15 | local99);
			Static150.aClass1_Sub16_Sub2_2.method5756(local82 | local80 << 16);
		}
		if (Static209.anInt4823 > 0) {
			Static209.anInt4823--;
		}
		if (Static326.aBoolean480 && Static209.anInt4823 <= 0) {
			Static209.anInt4823 = 20;
			Static326.aBoolean480 = false;
			Static150.aClass1_Sub16_Sub2_2.method5793(235);
			Static150.aClass1_Sub16_Sub2_2.method5757((int) Static188.aFloat17 >> 3);
			Static150.aClass1_Sub16_Sub2_2.method5734((int) Static189.aFloat55 >> 3);
		}
		if (Static120.aBoolean201 && !Static259.aBoolean340) {
			Static259.aBoolean340 = true;
			Static150.aClass1_Sub16_Sub2_2.method5793(4);
			Static150.aClass1_Sub16_Sub2_2.method5771(1);
		}
		if (!Static120.aBoolean201 && Static259.aBoolean340) {
			Static259.aBoolean340 = false;
			Static150.aClass1_Sub16_Sub2_2.method5793(4);
			Static150.aClass1_Sub16_Sub2_2.method5771(0);
		}
		if (!Static329.aBoolean490) {
			Static150.aClass1_Sub16_Sub2_2.method5793(41);
			Static150.aClass1_Sub16_Sub2_2.method5756(Static167.method3464());
			Static329.aBoolean490 = true;
		}
		if (Static241.aClass154ArrayArrayArray2 != null) {
			if (Static303.anInt6342 == 2) {
				Static27.method658();
			} else if (Static303.anInt6342 == 3) {
				Static101.method2097();
			}
		}
		if (Static194.aBoolean316) {
			Static194.aBoolean316 = false;
		} else {
			Static220.aFloat63 /= 2.0F;
		}
		if (Static133.aBoolean236) {
			Static133.aBoolean236 = false;
		} else {
			Static164.aFloat50 /= 2.0F;
		}
		Static87.method1937();
		if (Static214.anInt4865 != 30) {
			return;
		}
		Static139.method3057();
		Static138.method3054();
		Static22.method553();
		Static195.anInt4488++;
		if (Static195.anInt4488 > 750) {
			Static224.method4551();
			return;
		}
		Static160.method6134();
		Static286.method5113();
		Static344.method6053();
		for (@Pc(651) int local651 = Static330.method5788(true); local651 != -1; local651 = Static330.method5788(false)) {
			Static200.method3963(local651);
			Static253.anIntArray401[Static340.anInt7188++ & 0x1F] = local651;
		}
		@Pc(763) Class177 local763;
		@Pc(1088) int local1088;
		for (@Pc(677) Class1_Sub1_Sub10 local677 = Static138.method3051(); local677 != null; local677 = Static138.method3051()) {
			local80 = local677.method2540();
			local82 = local677.method2542();
			if (local80 == 1) {
				Static294.anIntArray469[local82] = local677.anInt2960;
				Static69.aBoolean134 |= Static56.aBooleanArray5[local82];
				Static60.anIntArray456[Static302.anInt6306++ & 0x1F] = local82;
			} else if (local80 == 2) {
				Static119.aStringArray17[local82] = local677.aString107;
				Static125.anIntArray234[Static204.anInt4726++ & 0x1F] = local82;
			} else if (local80 == 3) {
				local763 = Static298.method5252(local82);
				if (!local677.aString107.equals(local763.aString214)) {
					local763.aString214 = local677.aString107;
					Static145.method3188(local763);
				}
			} else if (local80 == 4) {
				local763 = Static298.method5252(local82);
				local99 = local677.anInt2960;
				local118 = local677.anInt2952;
				local1088 = local677.anInt2954;
				if (local763.anInt5807 != local99 || local118 != local763.lb || local763.anInt5830 != local1088) {
					local763.anInt5807 = local99;
					local763.lb = local118;
					local763.anInt5830 = local1088;
					Static145.method3188(local763);
				}
			} else if (local80 == 5) {
				local763 = Static298.method5252(local82);
				if (local763.anInt5821 != local677.anInt2960 || local677.anInt2960 == -1) {
					local763.anInt5821 = local677.anInt2960;
					local763.anInt5844 = 1;
					local763.anInt5846 = 0;
					local763.anInt5769 = 0;
					Static145.method3188(local763);
				}
			} else if (local80 == 6) {
				local84 = local677.anInt2960;
				local99 = local84 >> 10 & 0x1F;
				local118 = local84 >> 5 & 0x1F;
				local1088 = local84 & 0x1F;
				local181 = (local1088 << 3) + (local118 << 11) + (local99 << 19);
				@Pc(1104) Class177 local1104 = Static298.method5252(local82);
				if (local1104.anInt5836 != local181) {
					local1104.anInt5836 = local181;
					Static145.method3188(local1104);
				}
			} else if (local80 == 7) {
				local763 = Static298.method5252(local82);
				@Pc(1057) boolean local1057 = local677.anInt2960 == 1;
				if (local763.aBoolean411 != local1057) {
					local763.aBoolean411 = local1057;
					Static145.method3188(local763);
				}
			} else if (local80 == 8) {
				local763 = Static298.method5252(local82);
				if (local677.anInt2960 != local763.anInt5834 || local677.anInt2952 != local763.anInt5845 || local763.anInt5800 != local677.anInt2954) {
					local763.anInt5834 = local677.anInt2960;
					local763.anInt5800 = local677.anInt2954;
					local763.anInt5845 = local677.anInt2952;
					if (local763.anInt5808 != -1) {
						if (local763.anInt5809 > 0) {
							local763.anInt5800 = local763.anInt5800 * 32 / local763.anInt5809;
						} else if (local763.anInt5818 > 0) {
							local763.anInt5800 = local763.anInt5800 * 32 / local763.anInt5818;
						}
					}
					Static145.method3188(local763);
				}
			} else if (local80 == 9) {
				local763 = Static298.method5252(local82);
				if (local763.anInt5808 != local677.anInt2960 || local763.anInt5754 != local677.anInt2952) {
					local763.anInt5808 = local677.anInt2960;
					local763.anInt5754 = local677.anInt2952;
					Static145.method3188(local763);
				}
			} else if (local80 == 10) {
				local763 = Static298.method5252(local82);
				if (local677.anInt2960 != local763.anInt5804 || local763.anInt5795 != local677.anInt2952 || local763.anInt5756 != local677.anInt2954) {
					local763.anInt5804 = local677.anInt2960;
					local763.anInt5756 = local677.anInt2954;
					local763.anInt5795 = local677.anInt2952;
					Static145.method3188(local763);
				}
			} else if (local80 == 11) {
				local763 = Static298.method5252(local82);
				local763.aByte56 = 0;
				local763.anInt5772 = local763.anInt5813 = local677.anInt2952;
				local763.anInt5820 = local763.anInt5823 = local677.anInt2960;
				local763.aByte53 = 0;
				Static145.method3188(local763);
			} else if (local80 == 12) {
				local763 = Static298.method5252(local82);
				local99 = local677.anInt2960;
				if (local763 != null && local763.anInt5838 == 0) {
					if (local763.anInt5842 - local763.anInt5816 < local99) {
						local99 = local763.anInt5842 - local763.anInt5816;
					}
					if (local99 < 0) {
						local99 = 0;
					}
					if (local763.anInt5806 != local99) {
						local763.anInt5806 = local99;
						Static145.method3188(local763);
					}
				}
			} else if (local80 == 13) {
				local763 = Static298.method5252(local82);
				local763.anInt5825 = local677.anInt2960;
			} else if (local80 == 14) {
				local763 = Static298.method5252(local82);
				local763.anInt5788 = local677.anInt2960;
			} else if (local80 == 15) {
				Static268.anInt5668 = local677.anInt2952;
				Static127.aBoolean231 = true;
				Static47.anInt1523 = local677.anInt2960;
			}
		}
		Static55.anInt1622++;
		if (Static146.anInt3616 != 0) {
			Static145.anInt3605 += 20;
			if (Static145.anInt3605 >= 400) {
				Static146.anInt3616 = 0;
			}
		}
		if (Static185.aClass177_12 != null) {
			Static15.anInt632++;
			if (Static15.anInt632 >= 15) {
				Static145.method3188(Static185.aClass177_12);
				Static185.aClass177_12 = null;
			}
		}
		@Pc(1252) Class177 local1252 = Static312.aClass177_19;
		Static312.aClass177_19 = null;
		@Pc(1256) Class177 local1256 = Static19.aClass177_1;
		Static19.aClass177_1 = null;
		Static12.aBoolean37 = false;
		Static43.aClass177_2 = null;
		Static30.anInt3904 = 0;
		Static43.aBoolean94 = false;
		while (Static242.method4553() && Static30.anInt3904 < 128) {
			if (!Static229.method4363() || Static143.aChar2 != '`' && Static143.aChar2 != '§') {
				Static64.anIntArray117[Static30.anInt3904] = Static15.anInt634;
				Static93.anIntArray151[Static30.anInt3904] = Static143.aChar2;
				Static30.anInt3904++;
			} else if (Static216.method4220()) {
				Static118.method2582();
			} else {
				Static239.method4515();
			}
		}
		if (Static216.method4220()) {
			Static91.method1997();
		}
		Static244.aClass177_6 = null;
		Static93.method2011(-1, null, -1);
		Static346.method6109(null, -1, -1);
		Static215.method4208();
		Class7_Sub5.anInt3948++;
		if (Static18.aBoolean45) {
			Static150.aClass1_Sub16_Sub2_2.method5793(148);
			Static150.aClass1_Sub16_Sub2_2.method5780(Static79.anInt4575 | Static222.anInt5036 << 14 | Static101.anInt2511 << 28);
			Static18.aBoolean45 = false;
		}
		while (true) {
			@Pc(1376) Class177 local1376;
			@Pc(1360) Class1_Sub15 local1360;
			@Pc(1365) Class177 local1365;
			do {
				local1360 = (Class1_Sub15) Static273.aClass130_36.method3747();
				if (local1360 == null) {
					while (true) {
						do {
							local1360 = (Class1_Sub15) Static208.aClass130_31.method3747();
							if (local1360 == null) {
								while (true) {
									do {
										local1360 = (Class1_Sub15) Static138.aClass130_20.method3747();
										if (local1360 == null) {
											if (Static244.aClass177_6 == null) {
												Static161.anInt3962 = 0;
											}
											if (Static158.aClass177_11 != null) {
												Static211.method2744();
											}
											if (Static87.anInt2332 > 0 && Static345.aBooleanArray30[82] && Static345.aBooleanArray30[81] && Static91.anInt2408 != 0) {
												local84 = Static39.anInt1215 - Static91.anInt2408;
												if (local84 < 0) {
													local84 = 0;
												} else if (local84 > 3) {
													local84 = 3;
												}
												Static53.method1383(local84, Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0] + Static96.anInt2446, Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0] + Static149.anInt3667);
											}
											Static276.method4933();
											if (Static204.aClass177_13 != null) {
												Static145.method3188(Static204.aClass177_13);
												if (Static229.anInt5102 > Static228.anInt5098 + 5 || Static229.anInt5102 < Static228.anInt5098 - 5 || Static140.anInt3458 + 5 < Static85.anInt2268 || Static85.anInt2268 < Static140.anInt3458 - 5) {
													Static67.aBoolean11 = true;
												}
												Static249.anInt5419++;
												if (Static237.anInt5288 == 0) {
													if (Static67.aBoolean11 && Static249.anInt5419 >= 5) {
														if (Static204.aClass177_13 == Static122.aClass177_8 && Static44.anInt947 != Static280.anInt5957) {
															local763 = Static204.aClass177_13;
															@Pc(1642) byte local1642 = 0;
															if (Static352.anInt7341 == 1 && local763.anInt5819 == 206) {
																local1642 = 1;
															}
															if (local763.anIntArray439[Static44.anInt947] <= 0) {
																local1642 = 0;
															}
															if (local1642 == 1) {
																local118 = Static280.anInt5957;
																local1088 = Static44.anInt947;
																while (local118 != local1088) {
																	if (local118 > local1088) {
																		local763.method4919(local118 - 1, local118);
																		local118--;
																	} else if (local118 < local1088) {
																		local763.method4919(local118 + 1, local118);
																		local118++;
																	}
																}
															} else {
																local763.method4919(Static44.anInt947, Static280.anInt5957);
															}
															Static150.aClass1_Sub16_Sub2_2.method5793(253);
															Static150.aClass1_Sub16_Sub2_2.method5768(Static204.aClass177_13.anInt5828);
															Static150.aClass1_Sub16_Sub2_2.method5751(local1642);
															Static150.aClass1_Sub16_Sub2_2.method5782(Static44.anInt947);
															Static150.aClass1_Sub16_Sub2_2.method5782(Static280.anInt5957);
														}
													} else if ((Static255.anInt5508 == 1 || Static353.method6159()) && Static237.anInt5285 > 2) {
														Static296.method5234(Static229.anInt5102, Static85.anInt2268);
													} else if (Static156.method3334()) {
														Static98.method900();
													}
													Static204.aClass177_13 = null;
													Static195.anInt4494 = 0;
													Static15.anInt632 = 10;
												}
											}
											if (local1252 != Static312.aClass177_19) {
												if (local1252 != null) {
													Static145.method3188(local1252);
												}
												if (Static312.aClass177_19 != null) {
													Static145.method3188(Static312.aClass177_19);
												}
											}
											if (local1256 != Static19.aClass177_1 && Static311.anInt5201 == Static139.anInt3443) {
												if (local1256 != null) {
													Static145.method3188(local1256);
												}
												if (Static19.aClass177_1 != null) {
													Static145.method3188(Static19.aClass177_1);
												}
											}
											if (Static19.aClass177_1 == null) {
												if (Static139.anInt3443 > 0) {
													Static139.anInt3443--;
												}
											} else if (Static311.anInt5201 > Static139.anInt3443) {
												Static139.anInt3443++;
												if (Static139.anInt3443 == Static311.anInt5201) {
													Static145.method3188(Static19.aClass177_1);
												}
											}
											for (local84 = 0; local84 < 5; local84++) {
												@Pc(1805) int local1805 = Static265.anIntArray415[local84]++;
											}
											local99 = Static139.method3059();
											local118 = Static32.method5954();
											if (local99 > 15000 && local118 > 15000) {
												Static43.anInt1466 = 250;
												Static152.method3265(14500);
												Static150.aClass1_Sub16_Sub2_2.method5793(244);
											}
											if (Static69.aBoolean134 && Static325.method5658() - 60000L > Static49.aLong47) {
												Static329.method5714();
											}
											Static167.anInt4041++;
											if (Static167.anInt4041 > 500) {
												Static167.anInt4041 = 0;
												local1088 = (int) (Math.random() * 8.0D);
												if ((local1088 & 0x4) == 4) {
													Static61.anInt1679 += Static105.anInt2618;
												}
												if ((local1088 & 0x2) == 2) {
													Static205.anInt4774 += Static24.anInt803;
												}
												if ((local1088 & 0x1) == 1) {
													Static341.anInt7192 += Static280.anInt5955;
												}
											}
											if (Static341.anInt7192 < -50) {
												Static280.anInt5955 = 2;
											}
											if (Static205.anInt4774 < -55) {
												Static24.anInt803 = 2;
											}
											if (Static341.anInt7192 > 50) {
												Static280.anInt5955 = -2;
											}
											if (Static205.anInt4774 > 55) {
												Static24.anInt803 = -2;
											}
											if (Static61.anInt1679 < -40) {
												Static105.anInt2618 = 1;
											}
											Static38.anInt1196++;
											if (Static61.anInt1679 > 40) {
												Static105.anInt2618 = -1;
											}
											if (Static38.anInt1196 > 500) {
												Static38.anInt1196 = 0;
												local1088 = (int) (Math.random() * 8.0D);
												if ((local1088 & 0x1) == 1) {
													Static238.anInt5295 += Static139.anInt3444;
												}
												if ((local1088 & 0x2) == 2) {
													Static312.anInt6009 += Static293.anInt6125;
												}
											}
											if (Static238.anInt5295 < -60) {
												Static139.anInt3444 = 2;
											}
											if (Static312.anInt6009 < -20) {
												Static293.anInt6125 = 1;
											}
											if (Static238.anInt5295 > 60) {
												Static139.anInt3444 = -2;
											}
											Static303.anInt6340++;
											if (Static312.anInt6009 > 10) {
												Static293.anInt6125 = -1;
											}
											if (Static303.anInt6340 > 50) {
												Static150.aClass1_Sub16_Sub2_2.method5793(255);
											}
											if (Static289.aBoolean359) {
												Static203.method695();
												Static289.aBoolean359 = false;
											}
											try {
												if (Static31.aClass42_1 != null && Static150.aClass1_Sub16_Sub2_2.anInt6813 > 0) {
													Static31.aClass42_1.method1273(Static150.aClass1_Sub16_Sub2_2.anInt6813, Static150.aClass1_Sub16_Sub2_2.aByteArray86);
													Static303.anInt6340 = 0;
													Static150.aClass1_Sub16_Sub2_2.anInt6813 = 0;
													return;
												}
												return;
											} catch (@Pc(2031) IOException local2031) {
												Static224.method4551();
												return;
											}
										}
										local1365 = local1360.aClass177_9;
										if (local1365.anInt5776 < 0) {
											break;
										}
										local1376 = Static298.method5252(local1365.anInt5829);
									} while (local1376 == null || local1376.aClass177Array8 == null || local1365.anInt5776 >= local1376.aClass177Array8.length || local1365 != local1376.aClass177Array8[local1365.anInt5776]);
									Static267.method4825(local1360);
								}
							}
							local1365 = local1360.aClass177_9;
							if (local1365.anInt5776 < 0) {
								break;
							}
							local1376 = Static298.method5252(local1365.anInt5829);
						} while (local1376 == null || local1376.aClass177Array8 == null || local1376.aClass177Array8.length <= local1365.anInt5776 || local1376.aClass177Array8[local1365.anInt5776] != local1365);
						Static267.method4825(local1360);
					}
				}
				local1365 = local1360.aClass177_9;
				if (local1365.anInt5776 < 0) {
					break;
				}
				local1376 = Static298.method5252(local1365.anInt5829);
			} while (local1376 == null || local1376.aClass177Array8 == null || local1376.aClass177Array8.length <= local1365.anInt5776 || local1376.aClass177Array8[local1365.anInt5776] != local1365);
			Static267.method4825(local1360);
		}
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)Z")
	public static boolean method4039() throws IOException {
		if (Static31.aClass42_1 == null) {
			return false;
		}
		@Pc(13) int local13 = Static31.aClass42_1.method1269();
		if (local13 == 0) {
			return false;
		}
		if (Static305.anInt6393 == -1) {
			Static31.aClass42_1.method1270(0, Static299.aClass1_Sub16_Sub2_3.aByteArray86, 1);
			Static299.aClass1_Sub16_Sub2_3.anInt6813 = 0;
			Static305.anInt6393 = Static299.aClass1_Sub16_Sub2_3.method5797();
			Static200.anInt4591 = Static166.anIntArray283[Static305.anInt6393];
			local13--;
		}
		if (Static200.anInt4591 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static31.aClass42_1.method1270(0, Static299.aClass1_Sub16_Sub2_3.aByteArray86, 1);
			Static200.anInt4591 = Static299.aClass1_Sub16_Sub2_3.aByteArray86[0] & 0xFF;
			local13--;
		}
		if (Static200.anInt4591 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static31.aClass42_1.method1270(0, Static299.aClass1_Sub16_Sub2_3.aByteArray86, 2);
			Static299.aClass1_Sub16_Sub2_3.anInt6813 = 0;
			local13 -= 2;
			Static200.anInt4591 = Static299.aClass1_Sub16_Sub2_3.method5749();
		}
		if (Static200.anInt4591 > local13) {
			return false;
		}
		Static299.aClass1_Sub16_Sub2_3.anInt6813 = 0;
		Static31.aClass42_1.method1270(0, Static299.aClass1_Sub16_Sub2_3.aByteArray86, Static200.anInt4591);
		Static346.anInt7304 = Static87.anInt2328;
		Static195.anInt4488 = 0;
		Static87.anInt2328 = Static146.anInt3615;
		Static146.anInt3615 = Static305.anInt6393;
		@Pc(127) int local127;
		@Pc(133) int local133;
		if (Static305.anInt6393 == 233) {
			local127 = Static299.aClass1_Sub16_Sub2_3.method5730();
			@Pc(131) Class177 local131 = Static298.method5252(local127);
			for (local133 = 0; local133 < local131.anIntArray439.length; local133++) {
				local131.anIntArray439[local133] = -1;
				local131.anIntArray439[local133] = 0;
			}
			Static145.method3188(local131);
			Static305.anInt6393 = -1;
			return true;
		}
		@Pc(175) int local175;
		@Pc(197) int local197;
		@Pc(199) int local199;
		if (Static305.anInt6393 == 38) {
			Static338.method6025();
			local127 = Static299.aClass1_Sub16_Sub2_3.method5738();
			local175 = Static299.aClass1_Sub16_Sub2_3.method5746();
			local133 = Static299.aClass1_Sub16_Sub2_3.method5766();
			Static4.anIntArray9[local133] = local175;
			Static3.anIntArray1[local133] = local127;
			Static241.anIntArray391[local133] = 1;
			local197 = Static309.anIntArray495[local133] - 1;
			for (local199 = 0; local199 < local197; local199++) {
				if (local175 >= Class7_Sub1_Sub1_Sub2.anIntArray580[local199]) {
					Static241.anIntArray391[local133] = local199 + 2;
				}
			}
			Static335.anIntArray569[Static11.anInt7274++ & 0x1F] = local133;
			Static305.anInt6393 = -1;
			return true;
		} else if (Static305.anInt6393 == 164) {
			local127 = Static299.aClass1_Sub16_Sub2_3.method5758();
			@Pc(243) byte local243 = Static299.aClass1_Sub16_Sub2_3.method5772();
			local133 = Static299.aClass1_Sub16_Sub2_3.method5748();
			if (Static189.method3782(local127)) {
				Static192.method3829(local243, local133);
			}
			Static305.anInt6393 = -1;
			return true;
		} else {
			@Pc(302) int local302;
			@Pc(329) int local329;
			@Pc(406) boolean local406;
			@Pc(309) int local309;
			@Pc(481) int local481;
			@Pc(335) int local335;
			if (Static305.anInt6393 == 109) {
				local127 = Static299.aClass1_Sub16_Sub2_3.method5758();
				local175 = Static299.aClass1_Sub16_Sub2_3.method5735();
				local133 = Static299.aClass1_Sub16_Sub2_3.method5769();
				local197 = Static299.aClass1_Sub16_Sub2_3.method5758();
				if (local175 >> 30 == 0) {
					@Pc(425) Class122 local425;
					@Pc(448) Class165 local448;
					@Pc(443) Class165 local443;
					@Pc(478) Class165 local478;
					@Pc(430) Class122 local430;
					if (local175 >> 29 != 0) {
						local199 = local175 & 0xFFFF;
						@Pc(590) Class7_Sub1_Sub1_Sub1 local590 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local199];
						if (local590 != null) {
							if (local133 == 65535) {
								local133 = -1;
							}
							local406 = true;
							if (local133 != -1 && local590.anInt7052 != -1) {
								if (local133 == local590.anInt7052) {
									local425 = Static243.method4561(local133);
									if (local425.aBoolean295 && local425.anInt4135 != -1) {
										local478 = Static231.method4385(local425.anInt4135);
										local481 = local478.anInt5575;
										if (local481 == 0 || local481 == 2) {
											local406 = false;
										} else if (local481 == 1) {
											local406 = true;
										}
									}
								} else {
									local425 = Static243.method4561(local133);
									local430 = Static243.method4561(local590.anInt7052);
									if (local425.anInt4135 != -1 && local430.anInt4135 != -1) {
										local443 = Static231.method4385(local425.anInt4135);
										local448 = Static231.method4385(local430.anInt4135);
										if (local448.anInt5568 > local443.anInt5568) {
											local406 = false;
										}
									}
								}
							}
							if (local406) {
								local590.anInt7081 = Static197.anInt4521 + local197;
								local590.anInt7052 = local133;
								local590.anInt7060 = 0;
								local590.anInt7080 = local127;
								local590.anInt7050 = 1;
								local590.anInt7082 = 0;
								if (Static197.anInt4521 < local590.anInt7081) {
									local590.anInt7060 = -1;
								}
								if (local590.anInt7052 != -1 && Static197.anInt4521 == local590.anInt7081) {
									local329 = Static243.method4561(local590.anInt7052).anInt4135;
									if (local329 != -1) {
										local478 = Static231.method4385(local329);
										if (local478 != null && local478.anIntArray407 != null) {
											Static209.method4128(local590.anInt7027, false, 0, local590.anInt7032, local478);
										}
									}
								}
							}
						}
					} else if (local175 >> 28 != 0) {
						local199 = local175 & 0xFFFF;
						@Pc(391) Class7_Sub1_Sub1_Sub2 local391;
						if (Static172.anInt6634 == local199) {
							local391 = Static264.aClass7_Sub1_Sub1_Sub2_2;
						} else {
							local391 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local199];
						}
						if (local391 != null) {
							if (local133 == 65535) {
								local133 = -1;
							}
							local406 = true;
							if (local133 != -1 && local391.anInt7052 != -1) {
								if (local133 == local391.anInt7052) {
									local425 = Static243.method4561(local133);
									if (local425.aBoolean295 && local425.anInt4135 != -1) {
										local478 = Static231.method4385(local425.anInt4135);
										local481 = local478.anInt5575;
										if (local481 == 0 || local481 == 2) {
											local406 = false;
										} else if (local481 == 1) {
											local406 = true;
										}
									}
								} else {
									local425 = Static243.method4561(local133);
									local430 = Static243.method4561(local391.anInt7052);
									if (local425.anInt4135 != -1 && local430.anInt4135 != -1) {
										local443 = Static231.method4385(local425.anInt4135);
										local448 = Static231.method4385(local430.anInt4135);
										if (local443.anInt5568 < local448.anInt5568) {
											local406 = false;
										}
									}
								}
							}
							if (local406) {
								local391.anInt7082 = 0;
								local391.anInt7052 = local133;
								local391.anInt7050 = 1;
								local391.anInt7060 = 0;
								local391.anInt7081 = local197 + Static197.anInt4521;
								local391.anInt7080 = local127;
								if (local391.anInt7052 == 65535) {
									local391.anInt7052 = -1;
								}
								if (Static197.anInt4521 < local391.anInt7081) {
									local391.anInt7060 = -1;
								}
								if (local391.anInt7052 != -1 && local391.anInt7081 == Static197.anInt4521) {
									local329 = Static243.method4561(local391.anInt7052).anInt4135;
									if (local329 != -1) {
										local478 = Static231.method4385(local329);
										if (local478 != null && local478.anIntArray407 != null) {
											Static209.method4128(local391.anInt7027, local391 == Static264.aClass7_Sub1_Sub1_Sub2_2, 0, local391.anInt7032, local478);
										}
									}
								}
							}
						}
					}
				} else {
					local199 = local175 >> 28 & 0x3;
					local302 = (local175 >> 14 & 0x3FFF) - Static149.anInt3667;
					local309 = (local175 & 0x3FFF) - Static96.anInt2446;
					if (local302 >= 0 && local309 >= 0 && Static25.anInt850 > local302 && Static219.anInt4987 > local309) {
						local329 = local302 * 128 + 64;
						local335 = local309 * 128 + 64;
						@Pc(357) Class7_Sub1_Sub4 local357 = new Class7_Sub1_Sub4(local133, 0, Static197.anInt4521, local199, local329, Static309.method5429(local335, local329, local199) - local127, local335, local302, local302, local309, local309);
						Static66.aClass130_5.method3760(new Class1_Sub1_Sub7(local357));
					}
				}
				Static305.anInt6393 = -1;
				return true;
			} else if (Static305.anInt6393 == 50) {
				local127 = Static299.aClass1_Sub16_Sub2_3.method5769();
				local175 = Static299.aClass1_Sub16_Sub2_3.method5749();
				local133 = Static299.aClass1_Sub16_Sub2_3.method5729();
				if (Static189.method3782(local175)) {
					if (local133 == 2) {
						Static353.method6163();
					}
					Static295.anInt6177 = local127;
					Static190.method4603(local127);
					Static53.method1384(false);
					Static267.method4821(Static295.anInt6177);
					for (local197 = 0; local197 < 100; local197++) {
						Static230.aBooleanArray16[local197] = true;
					}
				}
				Static305.anInt6393 = -1;
				return true;
			} else if (Static305.anInt6393 == 198) {
				for (local127 = 0; local127 < Static78.anIntArray137.length; local127++) {
					if (Static78.anIntArray137[local127] != Static128.anIntArray239[local127]) {
						Static78.anIntArray137[local127] = Static128.anIntArray239[local127];
						Static200.method3963(local127);
						Static253.anIntArray401[Static340.anInt7188++ & 0x1F] = local127;
					}
				}
				Static305.anInt6393 = -1;
				return true;
			} else {
				@Pc(959) String local959;
				@Pc(877) String local877;
				@Pc(879) String local879;
				@Pc(873) boolean local873;
				@Pc(890) long local890;
				@Pc(895) long local895;
				if (Static305.anInt6393 == 26) {
					local873 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
					local877 = Static299.aClass1_Sub16_Sub2_3.method5776();
					local879 = local877;
					if (local873) {
						local879 = Static299.aClass1_Sub16_Sub2_3.method5776();
					}
					local890 = Static299.aClass1_Sub16_Sub2_3.method5749();
					local895 = Static299.aClass1_Sub16_Sub2_3.method5755();
					local329 = Static299.aClass1_Sub16_Sub2_3.method5761();
					local335 = Static299.aClass1_Sub16_Sub2_3.method5749();
					@Pc(909) long local909 = local895 + (local890 << 32);
					@Pc(911) boolean local911 = false;
					@Pc(913) int local913 = 0;
					while (true) {
						if (local913 >= 100) {
							if (local329 <= 1 && Static344.method6064(local879)) {
								local911 = true;
							}
							break;
						}
						if (Static332.aLongArray9[local913] == local909) {
							local911 = true;
							break;
						}
						local913++;
					}
					if (!local911 && Static319.anInt6579 == 0) {
						Static332.aLongArray9[Static249.anInt5418] = local909;
						Static249.anInt5418 = (Static249.anInt5418 + 1) % 100;
						local959 = Static17.method457(local335).method2692(Static299.aClass1_Sub16_Sub2_3);
						if (local329 == 2) {
							Static85.method1902("<img=1>" + local877, "<img=1>" + local879, 18, local959, 0, null, local335);
						} else if (local329 == 1) {
							Static85.method1902("<img=0>" + local877, "<img=0>" + local879, 18, local959, 0, null, local335);
						} else {
							Static85.method1902(local877, local879, 18, local959, 0, null, local335);
						}
					}
					Static305.anInt6393 = -1;
					return true;
				}
				@Pc(1053) Class177 local1053;
				if (Static305.anInt6393 == 120) {
					local127 = Static299.aClass1_Sub16_Sub2_3.method5730();
					local175 = Static299.aClass1_Sub16_Sub2_3.method5749();
					if (local127 < -70000) {
						local175 += 32768;
					}
					if (local127 < 0) {
						local1053 = null;
					} else {
						local1053 = Static298.method5252(local127);
					}
					if (local1053 != null) {
						for (local197 = 0; local197 < local1053.anIntArray439.length; local197++) {
							local1053.anIntArray439[local197] = 0;
							local1053.anIntArray441[local197] = 0;
						}
					}
					Static264.method4783(local175);
					local197 = Static299.aClass1_Sub16_Sub2_3.method5749();
					for (local199 = 0; local199 < local197; local199++) {
						local302 = Static299.aClass1_Sub16_Sub2_3.method5766();
						if (local302 == 255) {
							local302 = Static299.aClass1_Sub16_Sub2_3.method5746();
						}
						local309 = Static299.aClass1_Sub16_Sub2_3.method5748();
						if (local1053 != null && local1053.anIntArray439.length > local199) {
							local1053.anIntArray439[local199] = local309;
							local1053.anIntArray441[local199] = local302;
						}
						Static45.method1279(local302, local175, local199, local309 - 1);
					}
					if (local1053 != null) {
						Static145.method3188(local1053);
					}
					Static338.method6025();
					Static298.anIntArray480[Static354.anInt7379++ & 0x1F] = local175 & 0x7FFF;
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 39) {
					for (local127 = 0; local127 < Static168.aClass7_Sub1_Sub1_Sub2Array1.length; local127++) {
						if (Static168.aClass7_Sub1_Sub1_Sub2Array1[local127] != null) {
							Static168.aClass7_Sub1_Sub1_Sub2Array1[local127].anInt7046 = -1;
						}
					}
					for (local175 = 0; local175 < Static84.aClass7_Sub1_Sub1_Sub1Array1.length; local175++) {
						if (Static84.aClass7_Sub1_Sub1_Sub1Array1[local175] != null) {
							Static84.aClass7_Sub1_Sub1_Sub1Array1[local175].anInt7046 = -1;
						}
					}
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 186) {
					@Pc(1219) byte local1219 = Static299.aClass1_Sub16_Sub2_3.method5739();
					local175 = Static299.aClass1_Sub16_Sub2_3.method5758();
					Static302.method5276(local175, local1219);
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 235) {
					local127 = Static299.aClass1_Sub16_Sub2_3.method5749();
					if (local127 == 65535) {
						local127 = -1;
					}
					local175 = Static299.aClass1_Sub16_Sub2_3.method5746();
					local133 = Static299.aClass1_Sub16_Sub2_3.method5749();
					if (Static189.method3782(local133)) {
						Static352.method6146(-1, 1, local175, local127);
					}
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 21) {
					local127 = Static299.aClass1_Sub16_Sub2_3.method5758();
					local175 = Static299.aClass1_Sub16_Sub2_3.method5746();
					local133 = Static299.aClass1_Sub16_Sub2_3.method5749();
					if (Static189.method3782(local133)) {
						Static192.method3829(local175, local127);
					}
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 151) {
					local127 = Static299.aClass1_Sub16_Sub2_3.method5735();
					local175 = Static299.aClass1_Sub16_Sub2_3.method5749();
					Static302.method5276(local175, local127);
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 192) {
					local127 = Static299.aClass1_Sub16_Sub2_3.method5773();
					local175 = Static299.aClass1_Sub16_Sub2_3.method5758();
					local133 = Static299.aClass1_Sub16_Sub2_3.method5758();
					local197 = Static299.aClass1_Sub16_Sub2_3.method5758();
					local199 = Static299.aClass1_Sub16_Sub2_3.method5769();
					if (Static189.method3782(local175)) {
						Static352.method6146(local197, 7, local127, local199 | local133 << 16);
					}
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 15 || Static305.anInt6393 == 78 || Static305.anInt6393 == 229 || Static305.anInt6393 == 212 || Static305.anInt6393 == 155 || Static305.anInt6393 == 82 || Static305.anInt6393 == 6 || Static305.anInt6393 == 112 || Static305.anInt6393 == 249 || Static305.anInt6393 == 223 || Static305.anInt6393 == 221 || Static305.anInt6393 == 22 || Static305.anInt6393 == 254 || Static305.anInt6393 == 27 || Static305.anInt6393 == 115) {
					Static234.method4463();
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 248) {
					local127 = Static299.aClass1_Sub16_Sub2_3.method5758();
					local175 = Static299.aClass1_Sub16_Sub2_3.method5758();
					local133 = Static299.aClass1_Sub16_Sub2_3.method5748();
					if (Static189.method3782(local175)) {
						Static354.method6174(local127, local133);
					}
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 202) {
					Static186.anInt4356 = Static299.aClass1_Sub16_Sub2_3.method5761();
					for (local127 = 0; local127 < Static186.anInt4356; local127++) {
						Static140.aStringArray21[local127] = Static299.aClass1_Sub16_Sub2_3.method5776();
						Static19.aStringArray5[local127] = Static299.aClass1_Sub16_Sub2_3.method5776();
						if (Static19.aStringArray5[local127].equals("")) {
							Static19.aStringArray5[local127] = Static140.aStringArray21[local127];
						}
						Static189.aStringArray27[local127] = Static299.aClass1_Sub16_Sub2_3.method5776();
						Static347.aStringArray43[local127] = Static299.aClass1_Sub16_Sub2_3.method5776();
						if (Static347.aStringArray43[local127].equals("")) {
							Static347.aStringArray43[local127] = Static189.aStringArray27[local127];
						}
						Static173.aBooleanArray10[local127] = false;
					}
					Static305.anInt6396 = Class7_Sub5.anInt3948;
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 231) {
					Static257.anInt5551 = Static299.aClass1_Sub16_Sub2_3.method5748() * 30;
					Static305.anInt6393 = -1;
					Static345.anInt7277 = Class7_Sub5.anInt3948;
					return true;
				} else if (Static305.anInt6393 == 63) {
					Static338.method6025();
					Static221.anInt5016 = Static299.aClass1_Sub16_Sub2_3.method5761();
					Static345.anInt7277 = Class7_Sub5.anInt3948;
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 170) {
					local127 = Static299.aClass1_Sub16_Sub2_3.method5730();
					local175 = Static299.aClass1_Sub16_Sub2_3.method5748();
					if (Static189.method3782(local175)) {
						Static352.method6146(0, 5, local127, 2047);
					}
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 250) {
					Static330.method5795();
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 246) {
					if (Static200.anInt4591 == 0) {
						Static228.aString178 = Static25.aString36;
					} else {
						Static228.aString178 = Static299.aClass1_Sub16_Sub2_3.method5776();
					}
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 189) {
					local127 = Static299.aClass1_Sub16_Sub2_3.method5758();
					local175 = Static299.aClass1_Sub16_Sub2_3.method5748();
					local133 = Static299.aClass1_Sub16_Sub2_3.method5769();
					local197 = Static299.aClass1_Sub16_Sub2_3.method5746();
					local199 = Static299.aClass1_Sub16_Sub2_3.method5749();
					if (Static189.method3782(local199)) {
						Static274.method4911(local127, local175, local133, local197);
					}
					Static305.anInt6393 = -1;
					return true;
				} else if (Static305.anInt6393 == 207) {
					Static320.anInt6611 = Static299.aClass1_Sub16_Sub2_3.method5729();
					Static346.anInt7306 = Static299.aClass1_Sub16_Sub2_3.method5761();
					Static305.anInt6393 = -1;
					return true;
				} else {
					@Pc(1722) int local1722;
					if (Static305.anInt6393 == 226) {
						local873 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
						local877 = Static299.aClass1_Sub16_Sub2_3.method5776();
						local879 = local877;
						if (local873) {
							local879 = Static299.aClass1_Sub16_Sub2_3.method5776();
						}
						local890 = Static299.aClass1_Sub16_Sub2_3.method5749();
						local895 = Static299.aClass1_Sub16_Sub2_3.method5755();
						local329 = Static299.aClass1_Sub16_Sub2_3.method5761();
						@Pc(1718) long local1718 = local895 + (local890 << 32);
						@Pc(1720) boolean local1720 = false;
						local1722 = 0;
						while (true) {
							if (local1722 >= 100) {
								if (local329 <= 1) {
									if (Static166.aBoolean286 && !Static93.aBoolean158 || Static221.aBoolean352) {
										local1720 = true;
									} else if (Static344.method6064(local879)) {
										local1720 = true;
									}
								}
								break;
							}
							if (Static332.aLongArray9[local1722] == local1718) {
								local1720 = true;
								break;
							}
							local1722++;
						}
						if (!local1720 && Static319.anInt6579 == 0) {
							Static332.aLongArray9[Static249.anInt5418] = local1718;
							Static249.anInt5418 = (Static249.anInt5418 + 1) % 100;
							@Pc(1785) String local1785 = Static179.method3632(Static334.method5893(Static162.method3412(Static299.aClass1_Sub16_Sub2_3)));
							if (local329 == 2) {
								Static85.method1902("<img=1>" + local877, "<img=1>" + local879, 7, local1785, 0, null, -1);
							} else if (local329 == 1) {
								Static85.method1902("<img=0>" + local877, "<img=0>" + local879, 7, local1785, 0, null, -1);
							} else {
								Static85.method1902(local877, local879, 3, local1785, 0, null, -1);
							}
						}
						Static305.anInt6393 = -1;
						return true;
					} else if (Static305.anInt6393 == 73) {
						local127 = Static299.aClass1_Sub16_Sub2_3.method5758();
						if (local127 == 65535) {
							local127 = -1;
						}
						local877 = Static299.aClass1_Sub16_Sub2_3.method5776();
						local133 = Static299.aClass1_Sub16_Sub2_3.method5766();
						local197 = Static299.aClass1_Sub16_Sub2_3.method5729();
						if (local197 >= 1 && local197 <= 8) {
							if (local877.equalsIgnoreCase("null")) {
								local877 = null;
							}
							Static6.aStringArray2[local197 - 1] = local877;
							Static254.anIntArray405[local197 - 1] = local127;
							Static55.aBooleanArray4[local197 - 1] = local133 == 0;
						}
						Static305.anInt6393 = -1;
						return true;
					} else if (Static305.anInt6393 == 130) {
						local127 = Static299.aClass1_Sub16_Sub2_3.method5735();
						local175 = Static299.aClass1_Sub16_Sub2_3.method5749();
						local133 = Static299.aClass1_Sub16_Sub2_3.method5769();
						if (Static189.method3782(local175)) {
							Static145.method3186(local127, local133);
						}
						Static305.anInt6393 = -1;
						return true;
					} else {
						@Pc(2143) Class186 local2143;
						if (Static305.anInt6393 == 91) {
							Static199.anInt4555 = Class7_Sub5.anInt3948;
							if (Static200.anInt4591 == 0) {
								Static255.aString197 = null;
								Static305.anInt6393 = -1;
								Static302.aString237 = null;
								Static129.aClass186Array1 = null;
								Static112.anInt2867 = 0;
								return true;
							}
							Static255.aString197 = Static299.aClass1_Sub16_Sub2_3.method5776();
							local873 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
							if (local873) {
								Static299.aClass1_Sub16_Sub2_3.method5776();
							}
							@Pc(1998) long local1998 = Static299.aClass1_Sub16_Sub2_3.method5784();
							Static302.aString237 = Static7.method227(local1998);
							Static324.aByte67 = Static299.aClass1_Sub16_Sub2_3.method5772();
							local197 = Static299.aClass1_Sub16_Sub2_3.method5761();
							if (local197 == 255) {
								Static305.anInt6393 = -1;
								return true;
							}
							Static112.anInt2867 = local197;
							@Pc(2022) Class186[] local2022 = new Class186[100];
							for (local302 = 0; local302 < Static112.anInt2867; local302++) {
								local2022[local302] = new Class186();
								local2022[local302].aString228 = Static299.aClass1_Sub16_Sub2_3.method5776();
								local873 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
								if (local873) {
									local2022[local302].aString225 = Static299.aClass1_Sub16_Sub2_3.method5776();
								} else {
									local2022[local302].aString225 = local2022[local302].aString228;
								}
								local2022[local302].anInt6084 = Static299.aClass1_Sub16_Sub2_3.method5749();
								local2022[local302].aByte59 = Static299.aClass1_Sub16_Sub2_3.method5772();
								local2022[local302].aString229 = Static299.aClass1_Sub16_Sub2_3.method5776();
								if (local2022[local302].aString225.equals(Static264.aClass7_Sub1_Sub1_Sub2_2.aString266)) {
									Static137.aByte34 = local2022[local302].aByte59;
								}
							}
							local335 = Static112.anInt2867;
							while (local335 > 0) {
								local335--;
								local406 = true;
								for (local481 = 0; local481 < local335; local481++) {
									if (local2022[local481].aString228.compareTo(local2022[local481 + 1].aString228) > 0) {
										local2143 = local2022[local481];
										local2022[local481] = local2022[local481 + 1];
										local2022[local481 + 1] = local2143;
										local406 = false;
									}
								}
								if (local406) {
									break;
								}
							}
							Static129.aClass186Array1 = local2022;
							Static305.anInt6393 = -1;
							return true;
						} else if (Static305.anInt6393 == 163) {
							local127 = Static299.aClass1_Sub16_Sub2_3.method5749();
							Static255.method4691(local127);
							Static298.anIntArray480[Static354.anInt7379++ & 0x1F] = local127 & 0x7FFF;
							Static305.anInt6393 = -1;
							return true;
						} else if (Static305.anInt6393 == 145) {
							local127 = Static299.aClass1_Sub16_Sub2_3.method5730();
							local175 = Static299.aClass1_Sub16_Sub2_3.method5746();
							local133 = Static299.aClass1_Sub16_Sub2_3.method5758();
							local197 = Static299.aClass1_Sub16_Sub2_3.method5758();
							if (local197 == 65535) {
								local197 = -1;
							}
							if (Static189.method3782(local133)) {
								@Pc(2241) Class177 local2241 = Static298.method5252(local127);
								@Pc(2259) Class36 local2259;
								if (local2241.aBoolean404) {
									Static20.method505(local127, local175, local197);
									local2259 = Static165.method3446(local197);
									Static274.method4911(local2259.anInt1218, local2259.anInt1245, local2259.anInt1230, local127);
									Static1.method56(local2259.anInt1261, local2259.anInt1266, local2259.anInt1264, local127);
								} else if (local197 == -1) {
									local2241.anInt5807 = 0;
									Static305.anInt6393 = -1;
									return true;
								} else {
									local2259 = Static165.method3446(local197);
									local2241.anInt5845 = local2259.anInt1218;
									local2241.lb = local197;
									local2241.anInt5807 = 4;
									local2241.anInt5800 = local2259.anInt1245 * 100 / local175;
									local2241.anInt5834 = local2259.anInt1230;
									Static145.method3188(local2241);
								}
							}
							Static305.anInt6393 = -1;
							return true;
						} else if (Static305.anInt6393 == 139) {
							local127 = Static299.aClass1_Sub16_Sub2_3.method5758();
							local175 = Static299.aClass1_Sub16_Sub2_3.method5758();
							local879 = Static299.aClass1_Sub16_Sub2_3.method5776();
							if (Static189.method3782(local175)) {
								Static165.method3447(local127, local879);
							}
							Static305.anInt6393 = -1;
							return true;
						} else if (Static305.anInt6393 == 54) {
							local127 = Static299.aClass1_Sub16_Sub2_3.method5758();
							if (local127 == 65535) {
								local127 = -1;
							}
							local175 = Static299.aClass1_Sub16_Sub2_3.method5766();
							local133 = local175 >> 2;
							local197 = local175 & 0x3;
							local199 = Static81.anIntArray574[local133];
							local302 = Static299.aClass1_Sub16_Sub2_3.method5746();
							local309 = local302 >> 28 & 0x3;
							local329 = local302 >> 14 & 0x3FFF;
							local329 -= Static149.anInt3667;
							local335 = local302 & 0x3FFF;
							local335 -= Static96.anInt2446;
							Static94.method2023(local127, local133, local309, local335, local197, local199, local329);
							Static305.anInt6393 = -1;
							return true;
						} else if (Static305.anInt6393 == 66) {
							Static320.anInt6611 = Static299.aClass1_Sub16_Sub2_3.method5761();
							Static346.anInt7306 = Static299.aClass1_Sub16_Sub2_3.method5729();
							for (@Pc(2437) Class1_Sub11 local2437 = (Class1_Sub11) Static208.aClass183_24.method5052(); local2437 != null; local2437 = (Class1_Sub11) Static208.aClass183_24.method5050()) {
								local175 = (int) (local2437.aLong235 & 0x3FFFL);
								local133 = (int) (local2437.aLong235 >> 14 & 0x3FFFL);
								local197 = (int) (local2437.aLong235 >> 28 & 0x3L);
								if (local197 == Static39.anInt1215 && local175 >= Static346.anInt7306 && local175 < Static346.anInt7306 + 8 && Static320.anInt6611 <= local133 && local133 < Static320.anInt6611 + 8) {
									local2437.method6172();
									Static212.method6171(local133, Static39.anInt1215, local175);
								}
							}
							for (@Pc(2504) Class1_Sub4 local2504 = (Class1_Sub4) Static12.aClass130_1.method3749(); local2504 != null; local2504 = (Class1_Sub4) Static12.aClass130_1.method3756()) {
								if (Static346.anInt7306 <= local2504.anInt526 && local2504.anInt526 < Static346.anInt7306 + 8 && Static320.anInt6611 <= local2504.anInt519 && local2504.anInt519 < Static320.anInt6611 + 8 && local2504.anInt534 == Static39.anInt1215) {
									local2504.anInt523 = 0;
								}
							}
							Static305.anInt6393 = -1;
							return true;
						} else {
							@Pc(2667) String local2667;
							@Pc(2586) long local2586;
							if (Static305.anInt6393 == 137) {
								local873 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
								local877 = Static299.aClass1_Sub16_Sub2_3.method5776();
								local879 = local877;
								if (local873) {
									local879 = Static299.aClass1_Sub16_Sub2_3.method5776();
								}
								local890 = Static299.aClass1_Sub16_Sub2_3.method5784();
								local895 = Static299.aClass1_Sub16_Sub2_3.method5749();
								local2586 = Static299.aClass1_Sub16_Sub2_3.method5755();
								local481 = Static299.aClass1_Sub16_Sub2_3.method5761();
								@Pc(2597) long local2597 = (local895 << 32) + local2586;
								@Pc(2599) boolean local2599 = false;
								@Pc(2601) int local2601 = 0;
								while (true) {
									if (local2601 >= 100) {
										if (local481 <= 1) {
											if (Static166.aBoolean286 && !Static93.aBoolean158 || Static221.aBoolean352) {
												local2599 = true;
											} else if (Static344.method6064(local879)) {
												local2599 = true;
											}
										}
										break;
									}
									if (Static332.aLongArray9[local2601] == local2597) {
										local2599 = true;
										break;
									}
									local2601++;
								}
								if (!local2599 && Static319.anInt6579 == 0) {
									Static332.aLongArray9[Static249.anInt5418] = local2597;
									Static249.anInt5418 = (Static249.anInt5418 + 1) % 100;
									local2667 = Static179.method3632(Static334.method5893(Static162.method3412(Static299.aClass1_Sub16_Sub2_3)));
									if (local481 == 2 || local481 == 3) {
										Static85.method1902("<img=1>" + local877, "<img=1>" + local879, 9, local2667, 0, Static75.method1741(local890), -1);
									} else if (local481 == 1) {
										Static85.method1902("<img=0>" + local877, "<img=0>" + local879, 9, local2667, 0, Static75.method1741(local890), -1);
									} else {
										Static85.method1902(local877, local879, 9, local2667, 0, Static75.method1741(local890), -1);
									}
								}
								Static305.anInt6393 = -1;
								return true;
							}
							@Pc(2777) Class1_Sub35 local2777;
							if (Static305.anInt6393 == 56) {
								local127 = Static299.aClass1_Sub16_Sub2_3.method5749();
								local175 = Static299.aClass1_Sub16_Sub2_3.method5729();
								local133 = Static299.aClass1_Sub16_Sub2_3.method5749();
								local197 = Static299.aClass1_Sub16_Sub2_3.method5735();
								if (Static189.method3782(local133)) {
									local2777 = (Class1_Sub35) Static135.aClass183_33.method5053((long) local197);
									if (local2777 != null) {
										Static321.method5630(local127 != local2777.anInt6079, local2777, false);
									}
									Static74.method1738(local127, local175, false, local197);
								}
								Static305.anInt6393 = -1;
								return true;
							}
							@Pc(2850) long local2850;
							@Pc(2872) Class1_Sub39 local2872;
							@Pc(2856) Class1_Sub39 local2856;
							if (Static305.anInt6393 == 140) {
								local127 = Static299.aClass1_Sub16_Sub2_3.method5746();
								local175 = Static299.aClass1_Sub16_Sub2_3.method5758();
								local133 = Static299.aClass1_Sub16_Sub2_3.method5769();
								if (local133 == 65535) {
									local133 = -1;
								}
								local197 = Static299.aClass1_Sub16_Sub2_3.method5758();
								if (local197 == 65535) {
									local197 = -1;
								}
								local199 = Static299.aClass1_Sub16_Sub2_3.method5748();
								if (Static189.method3782(local175)) {
									for (local302 = local197; local302 <= local133; local302++) {
										local2850 = (long) local302 + ((long) local127 << 32);
										local2856 = (Class1_Sub39) Static273.aClass183_30.method5053(local2850);
										if (local2856 != null) {
											local2872 = new Class1_Sub39(local2856.anInt6604, local199);
											local2856.method6172();
										} else if (local302 == -1) {
											local2872 = new Class1_Sub39(Static298.method5252(local127).aClass1_Sub39_2.anInt6604, local199);
										} else {
											local2872 = new Class1_Sub39(0, local199);
										}
										Static273.aClass183_30.method5055(local2850, local2872);
									}
								}
								Static305.anInt6393 = -1;
								return true;
							} else if (Static305.anInt6393 == 128) {
								if (Static112.aFrame1 != null) {
									Static238.method4510(Static146.anInt3619, -1, -1, false);
								}
								@Pc(2923) byte[] local2923 = new byte[Static200.anInt4591];
								Static299.aClass1_Sub16_Sub2_3.method5791(Static200.anInt4591, local2923);
								local877 = Static200.method3962(Static200.anInt4591, 0, local2923);
								Static268.method4826(local877, Static130.anInt6754 == 1, Static184.aClass199_12, true);
								Static305.anInt6393 = -1;
								return true;
							} else if (Static305.anInt6393 == 124) {
								local127 = Static299.aClass1_Sub16_Sub2_3.method5761();
								local175 = Static299.aClass1_Sub16_Sub2_3.method5769();
								Static94.method2024(local175, local127);
								Static305.anInt6393 = -1;
								return true;
							} else {
								@Pc(3019) int local3019;
								@Pc(3087) String local3087;
								if (Static305.anInt6393 == 75) {
									local873 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
									local877 = Static299.aClass1_Sub16_Sub2_3.method5776();
									local879 = local877;
									if (local873) {
										local879 = Static299.aClass1_Sub16_Sub2_3.method5776();
									}
									local890 = Static299.aClass1_Sub16_Sub2_3.method5784();
									local895 = Static299.aClass1_Sub16_Sub2_3.method5749();
									local2586 = Static299.aClass1_Sub16_Sub2_3.method5755();
									local481 = Static299.aClass1_Sub16_Sub2_3.method5761();
									local3019 = Static299.aClass1_Sub16_Sub2_3.method5749();
									@Pc(3026) long local3026 = (local895 << 32) + local2586;
									@Pc(3028) boolean local3028 = false;
									@Pc(3030) int local3030 = 0;
									while (true) {
										if (local3030 >= 100) {
											if (local481 <= 1 && Static344.method6064(local879)) {
												local3028 = true;
											}
											break;
										}
										if (Static332.aLongArray9[local3030] == local3026) {
											local3028 = true;
											break;
										}
										local3030++;
									}
									if (!local3028 && Static319.anInt6579 == 0) {
										Static332.aLongArray9[Static249.anInt5418] = local3026;
										Static249.anInt5418 = (Static249.anInt5418 + 1) % 100;
										local3087 = Static17.method457(local3019).method2692(Static299.aClass1_Sub16_Sub2_3);
										if (local481 == 2) {
											Static85.method1902("<img=1>" + local877, "<img=1>" + local879, 20, local3087, 0, Static75.method1741(local890), local3019);
										} else if (local481 == 1) {
											Static85.method1902("<img=0>" + local877, "<img=0>" + local879, 20, local3087, 0, Static75.method1741(local890), local3019);
										} else {
											Static85.method1902(local877, local879, 20, local3087, 0, Static75.method1741(local890), local3019);
										}
									}
									Static305.anInt6393 = -1;
									return true;
								} else if (Static305.anInt6393 == 72) {
									local127 = Static299.aClass1_Sub16_Sub2_3.method5769();
									local175 = Static299.aClass1_Sub16_Sub2_3.method5749();
									local133 = Static299.aClass1_Sub16_Sub2_3.method5730();
									local197 = Static299.aClass1_Sub16_Sub2_3.method5758();
									if (Static189.method3782(local197)) {
										Static69.method1638((local127 << 16) + local175, local133);
									}
									Static305.anInt6393 = -1;
									return true;
								} else if (Static305.anInt6393 == 158) {
									local127 = Static299.aClass1_Sub16_Sub2_3.method5758();
									if (local127 == 65535) {
										local127 = -1;
									}
									local175 = Static299.aClass1_Sub16_Sub2_3.method5749();
									local133 = Static299.aClass1_Sub16_Sub2_3.method5773();
									if (Static189.method3782(local175)) {
										Static352.method6146(-1, 2, local133, local127);
									}
									Static305.anInt6393 = -1;
									return true;
								} else if (Static305.anInt6393 == 203) {
									local127 = Static299.aClass1_Sub16_Sub2_3.method5749();
									local175 = Static299.aClass1_Sub16_Sub2_3.method5730();
									if (Static189.method3782(local127)) {
										@Pc(3252) Class1_Sub35 local3252 = (Class1_Sub35) Static135.aClass183_33.method5053((long) local175);
										if (local3252 != null) {
											Static321.method5630(true, local3252, false);
										}
										if (Static262.aClass177_15 != null) {
											Static145.method3188(Static262.aClass177_15);
											Static262.aClass177_15 = null;
										}
									}
									Static305.anInt6393 = -1;
									return true;
								} else {
									@Pc(3277) String local3277;
									if (Static305.anInt6393 == 228) {
										local3277 = Static299.aClass1_Sub16_Sub2_3.method5776();
										@Pc(3288) boolean local3288 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
										if (local3288) {
											local877 = Static299.aClass1_Sub16_Sub2_3.method5776();
										} else {
											local877 = local3277;
										}
										local197 = Static299.aClass1_Sub16_Sub2_3.method5749();
										@Pc(3306) byte local3306 = Static299.aClass1_Sub16_Sub2_3.method5772();
										@Pc(3308) boolean local3308 = false;
										if (local3306 == -128) {
											local3308 = true;
										}
										if (local3308) {
											if (Static112.anInt2867 == 0) {
												Static305.anInt6393 = -1;
												return true;
											}
											for (local309 = 0; Static112.anInt2867 > local309 && (!Static129.aClass186Array1[local309].aString225.equals(local877) || Static129.aClass186Array1[local309].anInt6084 != local197); local309++) {
											}
											if (Static112.anInt2867 > local309) {
												while (local309 < Static112.anInt2867 - 1) {
													Static129.aClass186Array1[local309] = Static129.aClass186Array1[local309 + 1];
													local309++;
												}
												Static112.anInt2867--;
												Static129.aClass186Array1[Static112.anInt2867] = null;
											}
										} else {
											@Pc(3319) String local3319 = Static299.aClass1_Sub16_Sub2_3.method5776();
											local2143 = new Class186();
											local2143.aString225 = local877;
											local2143.aByte59 = local3306;
											local2143.anInt6084 = local197;
											local2143.aString229 = local3319;
											local2143.aString228 = local3277;
											for (local335 = Static112.anInt2867 - 1; local335 >= 0; local335--) {
												local481 = Static129.aClass186Array1[local335].aString225.compareTo(local2143.aString225);
												if (local481 == 0) {
													Static129.aClass186Array1[local335].anInt6084 = local197;
													Static129.aClass186Array1[local335].aByte59 = local3306;
													Static129.aClass186Array1[local335].aString229 = local3319;
													if (local877.equals(Static264.aClass7_Sub1_Sub1_Sub2_2.aString266)) {
														Static137.aByte34 = local3306;
													}
													Static199.anInt4555 = Class7_Sub5.anInt3948;
													Static305.anInt6393 = -1;
													return true;
												}
												if (local481 < 0) {
													break;
												}
											}
											if (Static112.anInt2867 >= Static129.aClass186Array1.length) {
												Static305.anInt6393 = -1;
												return true;
											}
											for (local481 = Static112.anInt2867 - 1; local481 > local335; local481--) {
												Static129.aClass186Array1[local481 + 1] = Static129.aClass186Array1[local481];
											}
											if (Static112.anInt2867 == 0) {
												Static129.aClass186Array1 = new Class186[100];
											}
											Static129.aClass186Array1[local335 + 1] = local2143;
											Static112.anInt2867++;
											if (local877.equals(Static264.aClass7_Sub1_Sub1_Sub2_2.aString266)) {
												Static137.aByte34 = local3306;
											}
										}
										Static199.anInt4555 = Class7_Sub5.anInt3948;
										Static305.anInt6393 = -1;
										return true;
									} else if (Static305.anInt6393 == 58) {
										local127 = Static299.aClass1_Sub16_Sub2_3.method5730();
										local175 = Static299.aClass1_Sub16_Sub2_3.method5749();
										if (local127 < -70000) {
											local175 += 32768;
										}
										if (local127 >= 0) {
											local1053 = Static298.method5252(local127);
										} else {
											local1053 = null;
										}
										while (Static200.anInt4591 > Static299.aClass1_Sub16_Sub2_3.anInt6813) {
											local197 = Static299.aClass1_Sub16_Sub2_3.method5744();
											local199 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local302 = 0;
											if (local199 != 0) {
												local302 = Static299.aClass1_Sub16_Sub2_3.method5761();
												if (local302 == 255) {
													local302 = Static299.aClass1_Sub16_Sub2_3.method5730();
												}
											}
											if (local1053 != null && local197 >= 0 && local197 < local1053.anIntArray439.length) {
												local1053.anIntArray439[local197] = local199;
												local1053.anIntArray441[local197] = local302;
											}
											Static45.method1279(local302, local175, local197, local199 - 1);
										}
										if (local1053 != null) {
											Static145.method3188(local1053);
										}
										Static338.method6025();
										Static298.anIntArray480[Static354.anInt7379++ & 0x1F] = local175 & 0x7FFF;
										Static305.anInt6393 = -1;
										return true;
									} else if (Static305.anInt6393 == 107) {
										Static55.method1391();
										Static305.anInt6393 = -1;
										return true;
									} else if (Static305.anInt6393 == 106) {
										local127 = Static299.aClass1_Sub16_Sub2_3.method5758();
										local877 = Static299.aClass1_Sub16_Sub2_3.method5776();
										local133 = Static299.aClass1_Sub16_Sub2_3.method5773();
										if (Static189.method3782(local127)) {
											Static307.method5403(local877, local133);
										}
										Static305.anInt6393 = -1;
										return true;
									} else if (Static305.anInt6393 == 183) {
										local127 = Static299.aClass1_Sub16_Sub2_3.method5730();
										Static221.aClass145_7 = Static184.aClass199_12.method5475(local127);
										Static305.anInt6393 = -1;
										return true;
									} else if (Static305.anInt6393 == 7) {
										local127 = Static299.aClass1_Sub16_Sub2_3.method5748();
										local175 = Static299.aClass1_Sub16_Sub2_3.method5748();
										local133 = Static299.aClass1_Sub16_Sub2_3.method5773();
										if (Static189.method3782(local175)) {
											Static266.method4816(local133, local127);
										}
										Static305.anInt6393 = -1;
										return true;
									} else {
										@Pc(3769) String local3769;
										@Pc(3773) String local3773;
										@Pc(3777) String local3777;
										if (Static305.anInt6393 == 25) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5761();
											@Pc(3761) boolean local3761 = (local127 & 0x1) == 1;
											local879 = Static299.aClass1_Sub16_Sub2_3.method5776();
											local3769 = Static299.aClass1_Sub16_Sub2_3.method5776();
											local3773 = Static299.aClass1_Sub16_Sub2_3.method5776();
											local3777 = Static299.aClass1_Sub16_Sub2_3.method5776();
											if (local3761) {
												for (local309 = 0; local309 < Static186.anInt4356; local309++) {
													if (Static19.aStringArray5[local309].equals(local3777)) {
														Static140.aStringArray21[local309] = local879;
														if (local3769.equals("")) {
															Static19.aStringArray5[local309] = local879;
														} else {
															Static19.aStringArray5[local309] = local3769;
														}
														Static189.aStringArray27[local309] = local3773;
														if (local3777.equals("")) {
															Static347.aStringArray43[local309] = local3773;
														} else {
															Static347.aStringArray43[local309] = local3777;
														}
														break;
													}
												}
											} else {
												Static140.aStringArray21[Static186.anInt4356] = local879;
												if (local3769.equals("")) {
													Static19.aStringArray5[Static186.anInt4356] = local879;
												} else {
													Static19.aStringArray5[Static186.anInt4356] = local3769;
												}
												Static189.aStringArray27[Static186.anInt4356] = local3773;
												if (local3777.equals("")) {
													Static347.aStringArray43[Static186.anInt4356] = local3773;
												} else {
													Static347.aStringArray43[Static186.anInt4356] = local3777;
												}
												Static173.aBooleanArray10[Static186.anInt4356] = (local127 & 0x2) == 2;
												Static186.anInt4356++;
											}
											Static305.anInt6396 = Class7_Sub5.anInt3948;
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 195) {
											if (Static295.anInt6177 != -1) {
												Static13.method5500(Static295.anInt6177, 0);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 159) {
											Static55.method1393(Static299.aClass1_Sub16_Sub2_3.method5776());
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 65) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5766();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5749();
											if (Static189.method3782(local175)) {
												Static73.anInt2038 = local127;
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 244) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5749();
											if (Static189.method3782(local127)) {
												Static298.method5250();
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 134) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5761();
											if (Static299.aClass1_Sub16_Sub2_3.method5761() == 0) {
												Static29.aClass60Array3[local127] = new Class60();
											} else {
												Static299.aClass1_Sub16_Sub2_3.anInt6813--;
												Static29.aClass60Array3[local127] = new Class60(Static299.aClass1_Sub16_Sub2_3);
											}
											Static305.anInt6393 = -1;
											Static353.anInt7361 = Class7_Sub5.anInt3948;
											return true;
										} else if (Static305.anInt6393 == 157) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local197 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local199 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local302 = Static299.aClass1_Sub16_Sub2_3.method5749();
											if (Static189.method3782(local127)) {
												Static187.aBooleanArray12[local175] = true;
												Static297.anIntArray479[local175] = local133;
												Static243.anIntArray395[local175] = local197;
												Static32.anIntArray572[local175] = local199;
												Static265.anIntArray415[local175] = local302;
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 219) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5769();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5746();
											if (Static189.method3782(local127)) {
												Static352.method6146(-1, 3, local175, -1);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 122) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local175 = local127 >> 5;
											local133 = local127 & 0x1F;
											if (local133 == 0) {
												Static36.aClass98Array1[local175] = null;
												Static305.anInt6393 = -1;
												return true;
											}
											@Pc(4120) Class98 local4120 = new Class98();
											local4120.anInt3425 = local133;
											local4120.anInt3430 = Static299.aClass1_Sub16_Sub2_3.method5761();
											if (local4120.anInt3430 >= 0 && Static305.aClass29Array14.length > local4120.anInt3430) {
												if (local4120.anInt3425 == 1 || local4120.anInt3425 == 10) {
													local4120.anInt3417 = Static299.aClass1_Sub16_Sub2_3.method5749();
													Static299.aClass1_Sub16_Sub2_3.anInt6813 += 5;
												} else if (local4120.anInt3425 >= 2 && local4120.anInt3425 <= 6) {
													if (local4120.anInt3425 == 2) {
														local4120.anInt3421 = 64;
														local4120.anInt3426 = 64;
													}
													if (local4120.anInt3425 == 3) {
														local4120.anInt3426 = 64;
														local4120.anInt3421 = 0;
													}
													if (local4120.anInt3425 == 4) {
														local4120.anInt3421 = 128;
														local4120.anInt3426 = 64;
													}
													if (local4120.anInt3425 == 5) {
														local4120.anInt3421 = 64;
														local4120.anInt3426 = 0;
													}
													if (local4120.anInt3425 == 6) {
														local4120.anInt3426 = 128;
														local4120.anInt3421 = 64;
													}
													local4120.anInt3425 = 2;
													local4120.anInt3418 = Static299.aClass1_Sub16_Sub2_3.method5749();
													local4120.anInt3427 = Static299.aClass1_Sub16_Sub2_3.method5749();
													local4120.anInt3422 = Static299.aClass1_Sub16_Sub2_3.method5761();
													local4120.anInt3424 = Static299.aClass1_Sub16_Sub2_3.method5749();
												}
												local4120.anInt3428 = Static299.aClass1_Sub16_Sub2_3.method5749();
												if (local4120.anInt3428 == 65535) {
													local4120.anInt3428 = -1;
												}
												Static36.aClass98Array1[local175] = local4120;
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 208) {
											Static286.anInt6044 = Static299.aClass1_Sub16_Sub2_3.method5761();
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 61) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5773();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5728();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5758();
											if (Static189.method3782(local133)) {
												Static340.method6028(local127, local175);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 74) {
											Static104.anInt2577 = Static299.aClass1_Sub16_Sub2_3.method5761();
											Static231.anInt5141 = Static299.aClass1_Sub16_Sub2_3.method5761();
											Static20.anInt709 = Static299.aClass1_Sub16_Sub2_3.method5761();
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 169) {
											Static49.method1351();
											Static338.method6025();
											Static340.anInt7188 += 32;
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 20) {
											local873 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
											local877 = Static299.aClass1_Sub16_Sub2_3.method5776();
											local879 = Static299.aClass1_Sub16_Sub2_3.method5776();
											local197 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local199 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local3777 = "";
											local406 = false;
											if (local197 > 0) {
												local3777 = Static299.aClass1_Sub16_Sub2_3.method5776();
												local406 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
											}
											for (local329 = 0; local329 < Static43.anInt1459; local329++) {
												if (local873) {
													if (local879.equals(Static46.aStringArray42[local329])) {
														Static46.aStringArray42[local329] = local877;
														local877 = null;
														Static210.aStringArray29[local329] = local879;
														break;
													}
												} else if (local877.equals(Static46.aStringArray42[local329])) {
													if (Static228.anIntArray381[local329] != local197) {
														Static228.anIntArray381[local329] = local197;
														if (local197 > 0) {
															Static4.method149("", 5, "", 0, local877 + Static147.aString129);
														}
														if (local197 == 0) {
															Static4.method149("", 5, "", 0, local877 + Static11.aString269);
														}
													}
													Static210.aStringArray29[local329] = local879;
													Static140.aStringArray22[local329] = local3777;
													Static27.anIntArray56[local329] = local199;
													Static221.aBooleanArray15[local329] = local406;
													local877 = null;
													break;
												}
											}
											if (local877 != null && Static43.anInt1459 < 200) {
												Static46.aStringArray42[Static43.anInt1459] = local877;
												Static210.aStringArray29[Static43.anInt1459] = local879;
												Static228.anIntArray381[Static43.anInt1459] = local197;
												Static140.aStringArray22[Static43.anInt1459] = local3777;
												Static27.anIntArray56[Static43.anInt1459] = local199;
												Static221.aBooleanArray15[Static43.anInt1459] = local406;
												Static43.anInt1459++;
											}
											Static305.anInt6396 = Class7_Sub5.anInt3948;
											local481 = Static43.anInt1459;
											while (local481 > 0) {
												local481--;
												@Pc(4538) boolean local4538 = true;
												for (local3019 = 0; local3019 < local481; local3019++) {
													if (Static154.anInt3814 != Static228.anIntArray381[local3019] && Static154.anInt3814 == Static228.anIntArray381[local3019 + 1] || Static228.anIntArray381[local3019] == 0 && Static228.anIntArray381[local3019 + 1] != 0) {
														local1722 = Static228.anIntArray381[local3019];
														Static228.anIntArray381[local3019] = Static228.anIntArray381[local3019 + 1];
														Static228.anIntArray381[local3019 + 1] = local1722;
														local959 = Static140.aStringArray22[local3019];
														Static140.aStringArray22[local3019] = Static140.aStringArray22[local3019 + 1];
														Static140.aStringArray22[local3019 + 1] = local959;
														local2667 = Static46.aStringArray42[local3019];
														Static46.aStringArray42[local3019] = Static46.aStringArray42[local3019 + 1];
														Static46.aStringArray42[local3019 + 1] = local2667;
														local3087 = Static210.aStringArray29[local3019];
														Static210.aStringArray29[local3019] = Static210.aStringArray29[local3019 + 1];
														Static210.aStringArray29[local3019 + 1] = local3087;
														@Pc(4648) int local4648 = Static27.anIntArray56[local3019];
														Static27.anIntArray56[local3019] = Static27.anIntArray56[local3019 + 1];
														Static27.anIntArray56[local3019 + 1] = local4648;
														@Pc(4666) boolean local4666 = Static221.aBooleanArray15[local3019];
														Static221.aBooleanArray15[local3019] = Static221.aBooleanArray15[local3019 + 1];
														Static221.aBooleanArray15[local3019 + 1] = local4666;
														local4538 = false;
													}
												}
												if (local4538) {
													break;
												}
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 206) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5748();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5735();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5773();
											if (Static189.method3782(local127)) {
												@Pc(4729) Class1_Sub35 local4729 = (Class1_Sub35) Static135.aClass183_33.method5053((long) local175);
												local2777 = (Class1_Sub35) Static135.aClass183_33.method5053((long) local133);
												if (local2777 != null) {
													Static321.method5630(local4729 == null || local4729.anInt6079 != local2777.anInt6079, local2777, false);
												}
												if (local4729 != null) {
													local4729.method6172();
													Static135.aClass183_33.method5055((long) local133, local4729);
												}
												@Pc(4767) Class177 local4767 = Static298.method5252(local175);
												if (local4767 != null) {
													Static145.method3188(local4767);
												}
												local4767 = Static298.method5252(local133);
												if (local4767 != null) {
													Static145.method3188(local4767);
													Static140.method3081(local4767, true);
												}
												if (Static295.anInt6177 != -1) {
													Static13.method5500(Static295.anInt6177, 1);
												}
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 127) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5761();
											if (local127 == 255) {
												local127 = -1;
												local175 = -1;
											}
											Static61.method1434(local175, local127);
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 81) {
											Static299.aClass1_Sub16_Sub2_3.anInt6813 += 28;
											if (Static299.aClass1_Sub16_Sub2_3.method5786()) {
												Static266.method4818(Static299.aClass1_Sub16_Sub2_3, Static299.aClass1_Sub16_Sub2_3.anInt6813 - 28);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 41) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5729();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5748();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5748();
											@Pc(4872) Class7_Sub1_Sub1_Sub1 local4872 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local133];
											if (local4872 != null) {
												Static78.method1784(local4872, local175, local127);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 44) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local197 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local199 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local302 = Static299.aClass1_Sub16_Sub2_3.method5761();
											if (Static189.method3782(local127)) {
												Static166.method3461(local133, local197, local302, local175, local199);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 141) {
											local3277 = Static299.aClass1_Sub16_Sub2_3.method5776();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local879 = Static17.method457(local175).method2692(Static299.aClass1_Sub16_Sub2_3);
											Static85.method1902(local3277, local3277, 19, local879, 0, null, local175);
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 146) {
											Static235.method4608(true);
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 131) {
											local3277 = Static299.aClass1_Sub16_Sub2_3.method5776();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5758();
											if (Static189.method3782(local133)) {
												Static165.method3447(local175, local3277);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 147) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local197 = Static299.aClass1_Sub16_Sub2_3.method5749();
											if (Static189.method3782(local127) && Class1_Sub2_Sub10.lb[local175] != null) {
												for (local199 = local133; local199 < local197; local199++) {
													local302 = Static299.aClass1_Sub16_Sub2_3.method5755();
													if (Class1_Sub2_Sub10.lb[local175].length > local199 && Class1_Sub2_Sub10.lb[local175][local199] != null) {
														Class1_Sub2_Sub10.lb[local175][local199].anInt5771 = local302;
													}
												}
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 3) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5769();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5729();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5773();
											if (Static189.method3782(local127)) {
												Static14.method413(local175, local133);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 188) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5758();
											if (local127 == 65535) {
												local127 = -1;
											}
											local175 = Static299.aClass1_Sub16_Sub2_3.method5729();
											Static173.method3533(local127, local175);
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 30) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5765();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5758();
											if (local133 == 65535) {
												local133 = -1;
											}
											Static218.method4246(local133, local127, local175);
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 104) {
											Static199.method3941(Static299.aClass1_Sub16_Sub2_3, Static184.aClass199_12, Static200.anInt4591);
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 200) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5749();
											if (Static189.method3782(local127)) {
												Static326.method5660();
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 53) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5773();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5769();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5748();
											if (Static189.method3782(local175)) {
												Static210.method4143(local133, local127);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 83) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5738();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5738();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5761();
											Static39.anInt1215 = local133 >> 1;
											Static264.aClass7_Sub1_Sub1_Sub2_2.method5988((local133 & 0x1) == 1, local127, Static39.anInt1215, local175);
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 118) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5735();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5773();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5748();
											local197 = Static299.aClass1_Sub16_Sub2_3.method5749();
											if (Static189.method3782(local197)) {
												Static352.method6146(local175, 5, local127, local133);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 70) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local877 = Static299.aClass1_Sub16_Sub2_3.method5776();
											@Pc(5308) Object[] local5308 = new Object[local877.length() + 1];
											for (local197 = local877.length() - 1; local197 >= 0; local197--) {
												if (local877.charAt(local197) == 's') {
													local5308[local197 + 1] = Static299.aClass1_Sub16_Sub2_3.method5776();
												} else {
													local5308[local197 + 1] = Integer.valueOf(Static299.aClass1_Sub16_Sub2_3.method5730());
												}
											}
											local5308[0] = Integer.valueOf(Static299.aClass1_Sub16_Sub2_3.method5730());
											if (Static189.method3782(local127)) {
												@Pc(5364) Class1_Sub15 local5364 = new Class1_Sub15();
												local5364.anObjectArray4 = local5308;
												Static267.method4825(local5364);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 160) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5758();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5735();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5728();
											local197 = Static299.aClass1_Sub16_Sub2_3.method5725();
											if (Static189.method3782(local127)) {
												Static255.method4694(local197, local133, local175);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 76) {
											Static235.method4608(false);
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 243) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5735();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5749();
											Static94.method2024(local175, local127);
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 136) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5749();
											if (local127 == 65535) {
												local127 = -1;
											}
											local175 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local197 = Static299.aClass1_Sub16_Sub2_3.method5761();
											Static78.method1785(local197, local133, local127, local175);
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 92) {
											local3277 = Static299.aClass1_Sub16_Sub2_3.method5776();
											local877 = Static179.method3632(Static334.method5893(Static162.method3412(Static299.aClass1_Sub16_Sub2_3)));
											Static4.method149(local3277, 6, local3277, 0, local877);
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 2) {
											Static320.anInt6611 = Static299.aClass1_Sub16_Sub2_3.method5729();
											Static346.anInt7306 = Static299.aClass1_Sub16_Sub2_3.method5729();
											while (Static200.anInt4591 > Static299.aClass1_Sub16_Sub2_3.anInt6813) {
												Static305.anInt6393 = Static299.aClass1_Sub16_Sub2_3.method5761();
												Static234.method4463();
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 193) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5744();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5730();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local3769 = "";
											local3773 = local3769;
											if ((local133 & 0x1) != 0) {
												local3769 = Static299.aClass1_Sub16_Sub2_3.method5776();
												if ((local133 & 0x2) == 0) {
													local3773 = local3769;
												} else {
													local3773 = Static299.aClass1_Sub16_Sub2_3.method5776();
												}
											}
											local3777 = Static299.aClass1_Sub16_Sub2_3.method5776();
											if (local127 == 99) {
												Static86.method1931(local3777);
											} else if (local3773.equals("") || !Static344.method6064(local3773)) {
												Static4.method149(local3773, local127, local3769, local175, local3777);
											} else {
												Static305.anInt6393 = -1;
												return true;
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 236) {
											Static54.method1385();
											Static305.anInt6393 = -1;
											return false;
										} else if (Static305.anInt6393 == 121) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local133 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local197 = Static299.aClass1_Sub16_Sub2_3.method5749();
											local199 = Static299.aClass1_Sub16_Sub2_3.method5761();
											local302 = Static299.aClass1_Sub16_Sub2_3.method5761();
											if (Static189.method3782(local127)) {
												Static321.method5631(true, local199, local197, local175, local302, local133);
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 113) {
											local127 = Static299.aClass1_Sub16_Sub2_3.method5730();
											local175 = Static299.aClass1_Sub16_Sub2_3.method5748();
											if (local175 == 65535) {
												local175 = -1;
											}
											local133 = Static299.aClass1_Sub16_Sub2_3.method5748();
											if (local133 == 65535) {
												local133 = -1;
											}
											local197 = Static299.aClass1_Sub16_Sub2_3.method5758();
											local199 = Static299.aClass1_Sub16_Sub2_3.method5735();
											if (Static189.method3782(local197)) {
												for (local302 = local133; local302 <= local175; local302++) {
													local2850 = (long) local302 + ((long) local199 << 32);
													local2856 = (Class1_Sub39) Static273.aClass183_30.method5053(local2850);
													if (local2856 != null) {
														local2872 = new Class1_Sub39(local127, local2856.anInt6605);
														local2856.method6172();
													} else if (local302 == -1) {
														local2872 = new Class1_Sub39(local127, Static298.method5252(local199).aClass1_Sub39_2.anInt6605);
													} else {
														local2872 = new Class1_Sub39(local127, -1);
													}
													Static273.aClass183_30.method5055(local2850, local2872);
												}
											}
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 5) {
											Static98.anInt1150 = Static299.aClass1_Sub16_Sub2_3.method5761();
											Static305.anInt6396 = Class7_Sub5.anInt3948;
											Static305.anInt6393 = -1;
											return true;
										} else if (Static305.anInt6393 == 0) {
											Static338.method6025();
											Static67.anInt203 = Static299.aClass1_Sub16_Sub2_3.method5762();
											Static345.anInt7277 = Class7_Sub5.anInt3948;
											Static305.anInt6393 = -1;
											return true;
										} else {
											Static58.method1402("T1 - " + Static305.anInt6393 + "," + Static87.anInt2328 + "," + Static346.anInt7304 + " - " + Static200.anInt4591, null);
											Static54.method1385();
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

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!nr;)V")
	public static void method4040(@OriginalArg(0) int arg0, @OriginalArg(2) Class40 arg1) {
		Static257.method4730(arg1);
		@Pc(12) int local12;
		@Pc(16) int local16;
		if (arg0 > 1) {
			for (local12 = 0; local12 < Static25.anInt850; local12++) {
				for (local16 = 0; local16 < Static219.anInt4987; local16++) {
					if ((Static62.aByteArrayArrayArray3[1][local12][local16] & 0x2) == 2) {
						Static31.method699(local12, local16);
					}
				}
			}
		}
		for (local12 = 0; local12 < arg0; local12++) {
			for (local16 = 0; local16 <= Static219.anInt4987; local16++) {
				for (@Pc(54) int local54 = 0; local54 <= Static25.anInt850; local54++) {
					@Pc(71) int local71;
					@Pc(73) int local73;
					@Pc(75) int local75;
					@Pc(77) int local77;
					@Pc(122) int local122;
					@Pc(214) int local214;
					@Pc(222) int local222;
					@Pc(242) int local242;
					@Pc(246) int local246;
					if ((Static190.aByteArrayArrayArray15[local12][local54][local16] & 0x1) != 0) {
						local71 = local16;
						local73 = local16;
						local75 = local12;
						local77 = local12;
						while (Static219.anInt4987 > local73 && (Static190.aByteArrayArrayArray15[local12][local54][local73 + 1] & 0x1) != 0) {
							local73++;
						}
						while (local71 > 0 && (Static190.aByteArrayArrayArray15[local12][local54][local71 - 1] & 0x1) != 0) {
							local71--;
						}
						label164: while (local75 > 0) {
							for (local122 = local71; local122 <= local73; local122++) {
								if ((Static190.aByteArrayArrayArray15[local75 - 1][local54][local122] & 0x1) == 0) {
									break label164;
								}
							}
							local75--;
						}
						label153: while (local77 < 3) {
							for (local122 = local71; local122 <= local73; local122++) {
								if ((Static190.aByteArrayArrayArray15[local77 + 1][local54][local122] & 0x1) == 0) {
									break label153;
								}
							}
							local77++;
						}
						local122 = (local73 + 1 - local71) * (local77 + 1 - local75);
						if (local122 >= 2) {
							local214 = Static220.anIntArrayArrayArray9[local77][local54][local71] - 240;
							local222 = Static220.anIntArrayArrayArray9[local75][local54][local71];
							Static302.method5281(1, local54 * 128, local54 * 128, local71 * 128, local73 * 128 + 128, local214, local222);
							for (local242 = local75; local242 <= local77; local242++) {
								for (local246 = local71; local246 <= local73; local246++) {
									Static190.aByteArrayArrayArray15[local242][local54][local246] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static190.aByteArrayArrayArray15[local12][local54][local16] & 0x2) != 0) {
						local71 = local54;
						local73 = local54;
						local75 = local12;
						local77 = local12;
						while (local71 > 0 && (Static190.aByteArrayArrayArray15[local12][local71 - 1][local16] & 0x2) != 0) {
							local71--;
						}
						while (Static25.anInt850 > local73 && (Static190.aByteArrayArrayArray15[local12][local73 + 1][local16] & 0x2) != 0) {
							local73++;
						}
						label217: while (local75 > 0) {
							for (local122 = local71; local122 <= local73; local122++) {
								if ((Static190.aByteArrayArrayArray15[local75 - 1][local122][local16] & 0x2) == 0) {
									break label217;
								}
							}
							local75--;
						}
						label206: while (local77 < 3) {
							for (local122 = local71; local122 <= local73; local122++) {
								if ((Static190.aByteArrayArrayArray15[local77 + 1][local122][local16] & 0x2) == 0) {
									break label206;
								}
							}
							local77++;
						}
						local122 = (local77 + 1 - local75) * ((local73 - local71) + 1);
						if (local122 >= 2) {
							local214 = Static220.anIntArrayArrayArray9[local77][local71][local16] - 240;
							local222 = Static220.anIntArrayArrayArray9[local75][local71][local16];
							Static302.method5281(2, local71 * 128, local73 * 128 + 128, local16 * 128, local16 * 128, local214, local222);
							for (local242 = local75; local242 <= local77; local242++) {
								for (local246 = local71; local246 <= local73; local246++) {
									Static190.aByteArrayArrayArray15[local242][local246][local16] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static190.aByteArrayArrayArray15[local12][local54][local16] & 0x4) != 0) {
						local71 = local54;
						local73 = local54;
						for (local75 = local16; local75 > 0 && (Static190.aByteArrayArrayArray15[local12][local54][local75 - 1] & 0x4) != 0; local75--) {
						}
						for (local77 = local16; Static219.anInt4987 > local77 && (Static190.aByteArrayArrayArray15[local12][local54][local77 + 1] & 0x4) != 0; local77++) {
						}
						label270: while (local71 > 0) {
							for (local122 = local75; local122 <= local77; local122++) {
								if ((Static190.aByteArrayArrayArray15[local12][local71 - 1][local122] & 0x4) == 0) {
									break label270;
								}
							}
							local71--;
						}
						label259: while (Static25.anInt850 > local73) {
							for (local122 = local75; local122 <= local77; local122++) {
								if ((Static190.aByteArrayArrayArray15[local12][local73 + 1][local122] & 0x4) == 0) {
									break label259;
								}
							}
							local73++;
						}
						if ((local73 + 1 - local71) * (local77 + -local75 + 1) >= 4) {
							local122 = Static220.anIntArrayArrayArray9[local12][local71][local75];
							Static302.method5281(4, local71 * 128, local73 * 128 + 128, local75 * 128, local77 * 128 + 128, local122, local122);
							for (@Pc(668) int local668 = local71; local668 <= local73; local668++) {
								for (local214 = local75; local214 <= local77; local214++) {
									Static190.aByteArrayArrayArray15[local12][local668][local214] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}
}
