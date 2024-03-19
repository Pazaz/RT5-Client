import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
	public static int anInt6125 = 1;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "Z")
	public static final boolean aBoolean426 = false;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII[Lclient!ro;IIII)V")
	public static void method5170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class177[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static221.aClass40_6.method2732(arg4, arg2, arg6, arg0);
		for (@Pc(13) int local13 = 0; local13 < arg5.length; local13++) {
			@Pc(19) Class177 local19 = arg5[local13];
			if (local19 != null && (arg7 == local19.anInt5829 || arg7 == -1412584499 && Static158.aClass177_11 == local19)) {
				@Pc(59) int local59;
				if (arg3 == -1) {
					Class111.aRectangleArray2[Static266.anInt5654].setBounds(arg1 + local19.anInt5820, arg8 + local19.anInt5772, local19.anInt5803, local19.anInt5816);
					local59 = Static266.anInt5654++;
				} else {
					local59 = arg3;
				}
				local19.anInt5762 = local59;
				local19.anInt5779 = Static197.anInt4521;
				if (!local19.aBoolean404 || !Static37.method918(local19)) {
					if (local19.anInt5819 > 0) {
						Static41.method1008(local19);
					}
					@Pc(86) int local86 = arg1 + local19.anInt5820;
					@Pc(92) int local92 = local19.anInt5772 + arg8;
					@Pc(95) int local95 = local19.anInt5782;
					if (Static278.aBoolean279 && (Static37.method930(local19).anInt6604 != 0 || local19.anInt5838 == 0) && local95 > 127) {
						local95 = 127;
					}
					@Pc(147) int local147;
					@Pc(149) int local149;
					if (Static158.aClass177_11 == local19) {
						if (arg7 != -1412584499 && !local19.aBoolean417) {
							Static184.aClass177Array9 = arg5;
							Static11.anInt7265 = arg1;
							Static180.anInt4248 = arg8;
							continue;
						}
						if (!local19.aBoolean417) {
							local95 = 128;
						}
						if (Static109.aBoolean183 && Static12.aBoolean37) {
							local147 = Static229.anInt5102;
							local149 = Static85.anInt2268;
							local147 -= Static309.anInt6462;
							if (local147 < Static285.anInt6033) {
								local147 = Static285.anInt6033;
							}
							local149 -= Static60.anInt6015;
							if (local149 < Static24.anInt802) {
								local149 = Static24.anInt802;
							}
							if (local19.anInt5803 + local147 > Static285.anInt6033 - -Static337.aClass177_21.anInt5803) {
								local147 = Static337.aClass177_21.anInt5803 + Static285.anInt6033 - local19.anInt5803;
							}
							local86 = local147;
							if (local149 + local19.anInt5816 > Static24.anInt802 - -Static337.aClass177_21.anInt5816) {
								local149 = Static337.aClass177_21.anInt5816 + Static24.anInt802 - local19.anInt5816;
							}
							local92 = local149;
						}
					}
					@Pc(219) int local219;
					@Pc(225) int local225;
					@Pc(232) int local232;
					@Pc(237) int local237;
					if (local19.anInt5838 == 2) {
						local219 = arg6;
						local149 = arg2;
						local147 = arg4;
						local225 = arg0;
					} else {
						local232 = local86 + local19.anInt5803;
						local237 = local19.anInt5816 + local92;
						local149 = arg2 >= local92 ? arg2 : local92;
						if (local19.anInt5838 == 9) {
							local237++;
							local232++;
						}
						local147 = arg4 >= local86 ? arg4 : local86;
						local219 = arg6 <= local232 ? arg6 : local232;
						local225 = arg0 <= local237 ? arg0 : local237;
					}
					if (!local19.aBoolean404 || local147 < local219 && local149 < local225) {
						@Pc(487) int local487;
						@Pc(540) int local540;
						@Pc(542) int local542;
						@Pc(544) int local544;
						@Pc(546) int local546;
						@Pc(590) int local590;
						@Pc(516) int local516;
						@Pc(489) int local489;
						if (local19.anInt5819 != 0) {
							if (local19.anInt5819 == 1337 || local19.anInt5819 == 1403) {
								Static253.method4648(local92, local86, local19.anInt5816, local19.anInt5819 == 1403, local19.anInt5803);
								Static230.aBooleanArray16[local59] = true;
								Static221.aClass40_6.method2732(arg4, arg2, arg6, arg0);
								continue;
							}
							if (local19.anInt5819 == 1338) {
								if (local19.method4905(Static221.aClass40_6) != null) {
									Static56.method1395();
									Static128.method2889(local86, Static221.aClass40_6, local19, local92);
									Static31.aBooleanArray2[local59] = true;
									Static221.aClass40_6.method2732(arg4, arg2, arg6, arg0);
								}
								continue;
							}
							if (local19.anInt5819 == 1339) {
								if (local19.method4905(Static221.aClass40_6) != null) {
									Static230.method4383(local92, local19, local86);
									Static31.aBooleanArray2[local59] = true;
									Static221.aClass40_6.method2732(arg4, arg2, arg6, arg0);
								}
								continue;
							}
							if (local19.anInt5819 == 1400) {
								Static100.method3996(local19.anInt5803, local86, local92, Static221.aClass40_6, Static65.anInterface4_2, local19.anInt5816);
								Static230.aBooleanArray16[local59] = true;
								Static221.aClass40_6.method2732(arg4, arg2, arg6, arg0);
								continue;
							}
							if (local19.anInt5819 == 1401) {
								Static156.method3340(Static221.aClass40_6, local92, local19.anInt5803, local19.anInt5816, local86);
								Static230.aBooleanArray16[local59] = true;
								Static221.aClass40_6.method2732(arg4, arg2, arg6, arg0);
								continue;
							}
							if (local19.anInt5819 == 1405) {
								if (!Static263.aBoolean395 && !Static28.aBoolean55) {
									continue;
								}
								local232 = local86 + local19.anInt5803;
								local237 = local92 + 15;
								if (Static263.aBoolean395) {
									Static290.aClass30_3.method4842(local232, "Fps:" + Static354.anInt7382, -256, local237);
									local237 += 15;
									@Pc(478) Runtime local478 = Runtime.getRuntime();
									local487 = (int) ((local478.totalMemory() - local478.freeMemory()) / 1024L);
									local489 = -256;
									if (local487 > 65536) {
										local489 = -65536;
									}
									Static290.aClass30_3.method4842(local232, "Mem:" + local487 + "k", local489, local237);
									local237 += 15;
									local516 = Static221.aClass40_6.method2793() / 1024;
									Static290.aClass30_3.method4842(local232, "Offheap:" + local516 + "k", local516 <= 65536 ? -256 : -65536, local237);
									local237 += 15;
									local540 = 0;
									local542 = 0;
									local544 = 0;
									for (local546 = 0; local546 < 29; local546++) {
										local540 += Static265.aClass26_Sub1Array1[local546].method3380();
										local542 += Static265.aClass26_Sub1Array1[local546].method3371();
										local544 += Static265.aClass26_Sub1Array1[local546].method3382();
									}
									@Pc(584) int local584 = local544 * 100 / local540;
									local590 = local542 * 10000 / local540;
									@Pc(610) String local610 = "Cache:" + Static265.method4789(true, (long) local590, 0, 2) + "% (" + local584 + "%)";
									Static321.aClass30_4.method4842(local232, local610, -256, local237);
									local237 += 12;
								}
								if (Static164.anInt3992 > 0) {
									Static321.aClass30_4.method4842(local232, "Particles: " + Static155.anInt3856 + " / " + Static164.anInt3992, -256, local237);
								}
								local237 += 12;
								if (Static28.aBoolean55) {
									Static321.aClass30_4.method4842(local232, "Polys: " + Static221.aClass40_6.method2779() + " Models: " + Static221.aClass40_6.method2758(), -256, local237);
									local237 += 12;
									Static321.aClass30_4.method4842(local232, "Ls: " + Static202.anInt4684 + " La: " + Static96.anInt2444 + " NPC: " + Static339.anInt7350 + " Pl: " + Static116.anInt2957, -256, local237);
									local237 += 12;
									Static107.method2237();
								}
								Static230.aBooleanArray16[local59] = true;
								continue;
							}
						}
						if (local19.anInt5838 == 0) {
							if (!local19.aBoolean404 && Static37.method918(local19) && Static312.aClass177_19 != local19) {
								continue;
							}
							if (!local19.aBoolean404) {
								if (local19.anInt5806 > local19.anInt5842 - local19.anInt5816) {
									local19.anInt5806 = local19.anInt5842 - local19.anInt5816;
								}
								if (local19.anInt5806 < 0) {
									local19.anInt5806 = 0;
								}
							}
							if (local19.anInt5819 == 1407 && Static221.aClass40_6.method2719()) {
								Static221.aClass40_6.method2746(local86, local92, local19.anInt5803, local19.anInt5816);
							}
							method5170(local225, local86 - local19.anInt5811, local149, local59, local147, arg5, local219, local19.anInt5828, local92 - local19.anInt5806);
							if (local19.aClass177Array8 != null) {
								method5170(local225, local86 - local19.anInt5811, local149, local59, local147, local19.aClass177Array8, local219, local19.anInt5828, local92 - local19.anInt5806);
							}
							@Pc(813) Class1_Sub35 local813 = (Class1_Sub35) Static135.aClass183_33.method5053((long) local19.anInt5828);
							if (local813 != null) {
								Static149.method3228(local149, local813.anInt6079, local59, local86, local219, local225, local92, local147);
							}
							if (local19.anInt5819 == 1407 && Static221.aClass40_6.method2719()) {
								Static221.aClass40_6.method2726();
								Static38.aBoolean74 = true;
							}
							Static221.aClass40_6.method2732(arg4, arg2, arg6, arg0);
						}
						if (Static323.aBooleanArray26[local59] || Static73.anInt2040 > 1) {
							if (local19.anInt5838 == 0 && !local19.aBoolean404 && local19.anInt5816 < local19.anInt5842) {
								Static229.method4364(local19.anInt5803 + local86, local19.anInt5816, local92, local19.anInt5842, local19.anInt5806);
							}
							if (local19.anInt5838 != 1) {
								@Pc(900) int local900;
								if (local19.anInt5838 == 2) {
									local232 = 0;
									for (local237 = 0; local237 < local19.anInt5763; local237++) {
										for (local900 = 0; local900 < local19.anInt5818; local900++) {
											local487 = local900 * (local19.anInt5766 + 32) + local86;
											local489 = local92 + local237 * (local19.anInt5805 + 32);
											if (local232 < 20) {
												local489 += local19.anIntArray434[local232];
												local487 += local19.anIntArray433[local232];
											}
											if (local19.anIntArray439[local232] > 0) {
												local542 = local19.anIntArray439[local232] - 1;
												if (local487 + 32 > arg4 && arg6 > local487 && arg2 < local489 + 32 && arg0 > local489 || local19 == Static204.aClass177_13 && Static280.anInt5957 == local232) {
													@Pc(1042) Class29 local1042;
													if (Static234.anInt5231 == 1 && local232 == Static326.anInt6657 && Static285.anInt6031 == local19.anInt5828) {
														local1042 = Static318.method5596(Static221.aClass40_6, local542, 0, null, local19.anIntArray441[local232], local19.anInt5840, 2);
													} else {
														local1042 = Static318.method5596(Static221.aClass40_6, local542, -13623264, null, local19.anIntArray441[local232], local19.anInt5840, 1);
													}
													if (local1042 == null) {
														Static145.method3188(local19);
													} else if (Static204.aClass177_13 == local19 && local232 == Static280.anInt5957) {
														local540 = Static85.anInt2268 - Static140.anInt3458;
														local516 = Static229.anInt5102 - Static228.anInt5098;
														if (local516 < 5 && local516 > -5) {
															local516 = 0;
														}
														if (local540 < 5 && local540 > -5) {
															local540 = 0;
														}
														if (Static249.anInt5419 < 5) {
															local540 = 0;
															local516 = 0;
														}
														local1042.method5836(local516 + local487, local489 + local540, 0, -2013265920);
														if (arg7 != -1) {
															@Pc(1154) Class177 local1154 = arg5[arg7 & 0xFFFF];
															@Pc(1157) int[] local1157 = new int[4];
															Static221.aClass40_6.method2772(local1157);
															local590 = local1157[1];
															@Pc(1168) int local1168 = local1157[3];
															@Pc(1192) int local1192;
															if (local590 > local540 + local489 && local1154.anInt5806 > 0) {
																local1192 = Static55.anInt1622 * (local590 - local489 - local540) / 3;
																if (Static55.anInt1622 * 10 < local1192) {
																	local1192 = Static55.anInt1622 * 10;
																}
																if (local1154.anInt5806 < local1192) {
																	local1192 = local1154.anInt5806;
																}
																Static140.anInt3458 += local1192;
																local1154.anInt5806 -= local1192;
																Static145.method3188(local1154);
															}
															if (local489 + local540 + 32 > local1168 && local1154.anInt5842 - local1154.anInt5816 > local1154.anInt5806) {
																local1192 = Static55.anInt1622 * (local489 + local540 + 32 - local1168) / 3;
																if (local1192 > Static55.anInt1622 * 10) {
																	local1192 = Static55.anInt1622 * 10;
																}
																if (local1154.anInt5842 - local1154.anInt5806 - local1154.anInt5816 < local1192) {
																	local1192 = local1154.anInt5842 - local1154.anInt5806 - local1154.anInt5816;
																}
																Static140.anInt3458 -= local1192;
																local1154.anInt5806 += local1192;
																Static145.method3188(local1154);
															}
														}
													} else if (local19 == Static185.aClass177_12 && Static108.anInt2687 == local232) {
														local1042.method5836(local487, local489, 0, -2013265920);
													} else {
														local1042.method5845(local487, local489);
													}
												}
											} else if (local19.anIntArray442 != null && local232 < 20) {
												@Pc(960) Class29 local960 = local19.method4913(local232, Static221.aClass40_6);
												if (local960 != null) {
													local960.method5845(local487, local489);
												} else if (Static104.aBoolean174) {
													Static145.method3188(local19);
												}
											}
											local232++;
										}
									}
								} else if (local19.anInt5838 == 3) {
									if (Static57.method4835(local19)) {
										local232 = local19.anInt5810;
										if (local19 == Static312.aClass177_19 && local19.anInt5841 != 0) {
											local232 = local19.anInt5841;
										}
									} else {
										local232 = local19.anInt5836;
										if (Static312.aClass177_19 == local19 && local19.anInt5826 != 0) {
											local232 = local19.anInt5826;
										}
									}
									if (local95 == 0) {
										if (local19.aBoolean406) {
											Static221.aClass40_6.method2717(local86, local92, local19.anInt5803, local19.anInt5816, local232, 0);
										} else {
											Static221.aClass40_6.method2712(local86, local92, local19.anInt5803, local19.anInt5816, local232, 0);
										}
									} else if (local19.aBoolean406) {
										Static221.aClass40_6.method2717(local86, local92, local19.anInt5803, local19.anInt5816, 255 - (local95 & 0xFF) << 24 | local232 & 0xFFFFFF, 1);
									} else {
										Static221.aClass40_6.method2712(local86, local92, local19.anInt5803, local19.anInt5816, local232 & 0xFFFFFF | 255 - (local95 & 0xFF) << 24, 1);
									}
								} else {
									@Pc(1454) Class30 local1454;
									if (local19.anInt5838 == 4) {
										local1454 = local19.method4917(Static221.aClass40_6);
										if (local1454 != null) {
											@Pc(1466) String local1466 = local19.aString214;
											if (Static57.method4835(local19)) {
												local237 = local19.anInt5810;
												if (local19 == Static312.aClass177_19 && local19.anInt5841 != 0) {
													local237 = local19.anInt5841;
												}
												if (local19.aString213.length() > 0) {
													local1466 = local19.aString213;
												}
											} else {
												local237 = local19.anInt5836;
												if (Static312.aClass177_19 == local19 && local19.anInt5826 != 0) {
													local237 = local19.anInt5826;
												}
											}
											if (local19.aBoolean404 && local19.anInt5808 != -1) {
												@Pc(1522) Class36 local1522 = Static165.method3446(local19.anInt5808);
												local1466 = local1522.aString51;
												if (local1466 == null) {
													local1466 = "null";
												}
												if ((local1522.anInt1219 == 1 || local19.anInt5754 != 1) && local19.anInt5754 != -1) {
													local1466 = "<col=ff9040>" + local1466 + "</col> x" + Static45.method1277(local19.anInt5754);
												}
											}
											if (Static262.aClass177_15 == local19) {
												local1466 = Static200.aString168;
												local237 = local19.anInt5836;
											}
											if (!local19.aBoolean404) {
												local1466 = Static154.method3302(local1466, local19);
											}
											if (Static58.aBoolean117) {
												Static221.aClass40_6.method2792(local86, local92, local19.anInt5803 + local86, local19.anInt5816 + local92);
											}
											local1454.method4836(null, null, 0, local19.anInt5748, local92, local19.aBoolean405 ? -16777216 : -1, 0, local237 | 0xFF000000, local19.anInt5816, local19.anInt5780, local1466, Static316.aClass29Array15, local86, local19.anInt5803, local19.anInt5758);
											if (Static58.aBoolean117) {
												Static221.aClass40_6.method2732(arg4, arg2, arg6, arg0);
											}
										} else if (Static104.aBoolean174) {
											Static145.method3188(local19);
										}
									} else if (local19.anInt5838 == 5) {
										@Pc(1647) Class29 local1647;
										if (!local19.aBoolean404) {
											local1647 = local19.method4912(Static57.method4835(local19), Static221.aClass40_6);
											if (local1647 != null) {
												local1647.method5845(local86, local92);
											} else if (Static104.aBoolean174) {
												Static145.method3188(local19);
											}
										} else if (local19.anInt5827 >= 0) {
											local19.method4910().method5665(Static221.aClass40_6, local19.anInt5802 << 3, 0, local92, local19.anInt5750 << 3, 0, local86, local19.anInt5803, local19.anInt5816);
										} else {
											if (local19.anInt5808 == -1) {
												local1647 = local19.method4912(false, Static221.aClass40_6);
											} else {
												@Pc(1709) Class190 local1709 = local19.aBoolean409 ? Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2 : null;
												local1647 = Static318.method5596(Static221.aClass40_6, local19.anInt5808, local19.anInt5765 | 0xFF000000, local1709, local19.anInt5754, local19.anInt5840, local19.anInt5814);
											}
											if (local1647 != null) {
												local237 = local1647.method5850();
												local900 = local1647.method5832();
												if (local19.aBoolean416) {
													Static221.aClass40_6.method2792(local86, local92, local19.anInt5803 + local86, local19.anInt5816 + local92);
													if (local19.anInt5790 != 0) {
														local487 = (local237 + local19.anInt5803 - 1) / local237;
														local489 = (local19.anInt5816 + local900 - 1) / local900;
														for (local516 = 0; local516 < local487; local516++) {
															for (local540 = 0; local540 < local489; local540++) {
																local1647.method5843((float) local237 / 2.0F + (float) (local86 + local516 * local237), (float) (local540 * local900 + local92) + (float) local900 / 2.0F, 4096, local19.anInt5790);
															}
														}
													} else if (local95 == 0) {
														local1647.method5839(local86, local92, local19.anInt5803, local19.anInt5816, 0, 0);
													} else {
														local1647.method5839(local86, local92, local19.anInt5803, local19.anInt5816, 1, 255 - (local95 & 0xFF) << 24 | 0xFFFFFF);
													}
													Static221.aClass40_6.method2732(arg4, arg2, arg6, arg0);
												} else if (local95 != 0) {
													local487 = 255 - (local95 & 0xFF) << 24 | 0xFFFFFF;
													if (local19.anInt5790 != 0) {
														local1647.method5844((float) local19.anInt5803 / 2.0F + (float) local86, (float) local92 + (float) local19.anInt5816 / 2.0F, local19.anInt5803 * 4096 / local237, local19.anInt5790, local487);
													} else if (local237 == local19.anInt5803 && local900 == local19.anInt5816) {
														local1647.method5836(local86, local92, 1, local487);
													} else {
														local1647.method5835(local86, local92, local19.anInt5803, local19.anInt5816, 1, local487, 1);
													}
												} else if (local19.anInt5790 != 0) {
													local1647.method5843((float) local19.anInt5803 / 2.0F + (float) local86, (float) local19.anInt5816 / 2.0F + (float) local92, local19.anInt5803 * 4096 / local237, local19.anInt5790);
												} else if (local237 == local19.anInt5803 && local19.anInt5816 == local900) {
													local1647.method5845(local86, local92);
												} else {
													local1647.method5834(local86, local92, local19.anInt5803, local19.anInt5816);
												}
											} else if (Static104.aBoolean174) {
												Static145.method3188(local19);
											}
										}
									} else {
										@Pc(2051) Class36 local2051;
										if (local19.anInt5838 == 6) {
											@Pc(2025) boolean local2025 = Static57.method4835(local19);
											if (local2025) {
												local237 = local19.anInt5749;
											} else {
												local237 = local19.anInt5821;
											}
											Static114.method5268();
											@Pc(2039) Class86 local2039 = null;
											local487 = 0;
											@Pc(2076) Class190 local2076;
											@Pc(2068) Class165 local2068;
											if (local19.anInt5808 != -1) {
												local2051 = Static165.method3446(local19.anInt5808);
												if (local2051 != null) {
													local2051 = local2051.method948(local19.anInt5754);
													local2068 = local237 == -1 ? null : Static231.method4385(local237);
													local2076 = local19.aBoolean409 ? Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2 : null;
													local2039 = local2051.method954(1, Static221.aClass40_6, local19.anInt5769, local19.anInt5846, 1024, local2068, local2076, local19.anInt5844);
													if (local2039 == null) {
														Static145.method3188(local19);
													} else {
														local487 = -local2039.method5534() / 2;
													}
												}
											} else if (local19.anInt5807 == 5) {
												if (local19.lb == -1) {
													local2039 = Static138.aClass190_1.method5232(0, -1, -1, -1, Static221.aClass40_6, null, -1, 1024, null, null, 0);
												} else {
													local489 = local19.lb;
													@Pc(2234) Class7_Sub1_Sub1_Sub2 local2234;
													if (Static172.anInt6634 == local489) {
														local2234 = Static264.aClass7_Sub1_Sub1_Sub2_2;
													} else {
														local2234 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local489];
													}
													@Pc(2250) Class165 local2250 = local237 == -1 ? null : Static231.method4385(local237);
													if (local2234 != null && (local489 == 2047 || Static182.method3707(local2234.aString266) == local19.anInt5830)) {
														local2039 = local2234.aClass190_2.method5232(0, local19.anInt5846, -1, local19.anInt5844, Static221.aClass40_6, null, 0, 1024, null, local2250, local19.anInt5769);
													}
												}
											} else if (local19.anInt5807 == 8 || local19.anInt5807 == 9) {
												@Pc(2124) Class1_Sub14 local2124 = Static49.method1354(local19.lb);
												local2068 = local237 == -1 ? null : Static231.method4385(local237);
												if (local2124 != null) {
													local2076 = local19.aBoolean409 ? Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2 : null;
													local2039 = local2124.method2617(Static221.aClass40_6, local19.anInt5846, local2068, local19.anInt5830, local19.anInt5807 == 9, local19.anInt5844, local2076, local19.anInt5769);
												}
											} else if (local237 == -1) {
												local2039 = local19.method4907(local2025, -1, Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2, -1, Static221.aClass40_6, 0, 1024, null);
												if (local2039 == null && Static104.aBoolean174) {
													Static145.method3188(local19);
												}
											} else {
												@Pc(2198) Class165 local2198 = Static231.method4385(local237);
												local2039 = local19.method4907(local2025, local19.anInt5846, Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2, local19.anInt5844, Static221.aClass40_6, local19.anInt5769, 1024, local2198);
												if (local2039 == null && Static104.aBoolean174) {
													Static145.method3188(local19);
												}
											}
											if (local2039 != null) {
												if (local19.anInt5809 > 0) {
													local489 = (local19.anInt5803 << 9) / local19.anInt5809;
												} else {
													local489 = 512;
												}
												if (local19.anInt5799 > 0) {
													local516 = (local19.anInt5816 << 9) / local19.anInt5799;
												} else {
													local516 = 512;
												}
												local540 = local19.anInt5803 / 2 + local86 + (local19.anInt5843 * local489 >> 9);
												local542 = (local516 * local19.anInt5832 >> 9) + local92 + local19.anInt5816 / 2;
												Static202.aClass11_10.method5504();
												Static221.aClass40_6.method2804(Static202.aClass11_10);
												local544 = Class39.anIntArray88[local19.anInt5834 << 3] * local19.anInt5800 >> 15;
												local546 = local19.anInt5800 * Class39.anIntArray87[local19.anInt5834 << 3] >> 15;
												Static221.aClass40_6.method2737(local540, local542, local489, local516);
												Static221.aClass40_6.method2796((float) local19.aShort71, local19.aBoolean418 ? (float) local19.aShort70 : (float) local19.aShort70 * 1.5F);
												if (Static38.aBoolean74) {
													Static221.aClass40_6.method2788();
													Static221.aClass40_6.method2713();
													Static221.aClass40_6.method2732(arg4, arg2, arg6, arg0);
													Static38.aBoolean74 = false;
												}
												if (local19.aBoolean407) {
													Static221.aClass40_6.method2721(false);
												}
												if (local19.aBoolean404) {
													Static184.aClass11_12.method5490(-local19.anInt5756 << 3);
													Static184.aClass11_12.method5507(local19.anInt5845 << 3);
													Static184.aClass11_12.method5489(local19.anInt5804, local19.anInt5795 + local544 + local487, local19.anInt5795 + local546);
												} else {
													Static184.aClass11_12.method5492(local19.anInt5845 << 3);
													Static184.aClass11_12.method5489(0, local544, local546);
												}
												Static184.aClass11_12.method5494(local19.anInt5834 << 3);
												if (Static58.aBoolean117) {
													Static221.aClass40_6.method2792(local86, local92, local19.anInt5803 + local86, local92 - -local19.anInt5816);
												}
												if (local19.aBoolean418) {
													local2039.method5523(Static184.aClass11_12, null, local19.anInt5800);
												} else {
													local2039.method5539(Static184.aClass11_12, null, 1);
												}
												if (Static58.aBoolean117) {
													Static221.aClass40_6.method2732(arg4, arg2, arg6, arg0);
												}
												if (local19.aBoolean407) {
													Static221.aClass40_6.method2721(true);
												}
											}
										} else {
											if (local19.anInt5838 == 7) {
												local1454 = local19.method4917(Static221.aClass40_6);
												if (local1454 == null) {
													if (Static104.aBoolean174) {
														Static145.method3188(local19);
													}
													continue;
												}
												local237 = 0;
												for (local900 = 0; local900 < local19.anInt5763; local900++) {
													for (local487 = 0; local487 < local19.anInt5818; local487++) {
														if (local19.anIntArray439[local237] > 0) {
															local2051 = Static165.method3446(local19.anIntArray439[local237] - 1);
															@Pc(2605) String local2605;
															if (local2051.anInt1219 != 1 && local19.anIntArray441[local237] == 1) {
																local2605 = "<col=ff9040>" + local2051.aString51 + "</col>";
															} else {
																local2605 = "<col=ff9040>" + local2051.aString51 + "</col> x" + Static45.method1277(local19.anIntArray441[local237]);
															}
															local540 = (local19.anInt5766 + 115) * local487 + local86;
															local542 = local92 + local900 * (local19.anInt5805 + 12);
															if (local19.anInt5758 == 0) {
																local1454.method4850(local19.anInt5836 | 0xFF000000, local2605, Static316.aClass29Array15, null, local540, local19.aBoolean405 ? -16777216 : -1, local542);
															} else if (local19.anInt5758 == 1) {
																local1454.method4848(Static316.aClass29Array15, local19.anInt5836 | 0xFF000000, local540 + 57, null, local19.aBoolean405 ? -16777216 : -1, local2605, local542);
															} else {
																local1454.method4849(local2605, null, local542, local540 + 115 - 1, local19.aBoolean405 ? -16777216 : -1, local19.anInt5836 | 0xFF000000, Static316.aClass29Array15);
															}
														}
														local237++;
													}
												}
											}
											if (local19.anInt5838 == 8 && local19 == Static19.aClass177_1 && Static139.anInt3443 == Static311.anInt5201) {
												local232 = 0;
												local237 = 0;
												@Pc(2748) Class30 local2748 = Static290.aClass30_3;
												@Pc(2751) String local2751 = local19.aString214;
												local2751 = Static154.method3302(local2751, local19);
												@Pc(2767) String local2767;
												while (local2751.length() > 0) {
													local516 = local2751.indexOf("<br>");
													if (local516 == -1) {
														local2767 = local2751;
														local2751 = "";
													} else {
														local2767 = local2751.substring(0, local516);
														local2751 = local2751.substring(local516 + 4);
													}
													local540 = Static208.aClass63_6.method1849(local2767);
													local237 += Static208.aClass63_6.anInt2200 + 1;
													if (local540 > local232) {
														local232 = local540;
													}
												}
												local232 += 6;
												local237 += 7;
												local516 = local19.anInt5803 + local86 - local232 - 5;
												local540 = local19.anInt5816 + local92 + 5;
												if (local516 < local86 + 5) {
													local516 = local86 + 5;
												}
												if (arg0 < local237 + local540) {
													local540 = arg0 - local237;
												}
												if (arg6 < local232 + local516) {
													local516 = arg6 - local232;
												}
												Static221.aClass40_6.method2717(local516, local540, local232, local237, -96, 0);
												Static221.aClass40_6.method2712(local516, local540, local232, local237, -16777216, 0);
												local2751 = local19.aString214;
												local542 = Static208.aClass63_6.anInt2200 + local540 + 2;
												local2751 = Static154.method3302(local2751, local19);
												while (local2751.length() > 0) {
													local544 = local2751.indexOf("<br>");
													if (local544 == -1) {
														local2767 = local2751;
														local2751 = "";
													} else {
														local2767 = local2751.substring(0, local544);
														local2751 = local2751.substring(local544 + 4);
													}
													local2748.method4832(local2767, -16777216, local542, local516 + 3, -1);
													local542 += Static208.aClass63_6.anInt2200 + 1;
												}
											}
											if (local19.anInt5838 == 9) {
												if (local19.aBoolean401) {
													local487 = local92;
													local237 = local19.anInt5816 + local92;
													local900 = local86 + local19.anInt5803;
												} else {
													local487 = local92 + local19.anInt5816;
													local237 = local92;
													local900 = local86 + local19.anInt5803;
												}
												if (local19.anInt5839 == 1) {
													Static221.aClass40_6.method2724(local86, local237, local900, local487, local19.anInt5836, 0);
												} else {
													Static221.aClass40_6.method2771(local86, local237, local900, local487, local19.anInt5836, local19.anInt5839);
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
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)Lclient!lf;")
	public static Class119 method5171(@OriginalArg(1) int arg0) {
		@Pc(10) Class119 local10 = (Class119) Static20.aClass215_11.method6057((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static324.aClass162_227.method4636(arg0, 1);
		local10 = new Class119();
		if (local20 != null) {
			local10.method3503(new Class1_Sub16(local20), arg0);
		}
		Static20.aClass215_11.method6050(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5172(@OriginalArg(0) String arg0) {
		Static4.method149("", 0, "", 0, arg0);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I")
	public static int method5173() {
		return Static134.anInt3395;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)Lclient!s;")
	public static Class7_Sub5 method5174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class154 local7 = Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass7_Sub5_1 == null ? null : local7.aClass7_Sub5_1;
	}
}
