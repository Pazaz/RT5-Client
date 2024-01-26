import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cea", name = "p", descriptor = "I")
	public static int anInt1576;

	@OriginalMember(owner = "client!cea", name = "w", descriptor = "Ljava/lang/Object;")
	public static Object anObject4;

	@OriginalMember(owner = "client!cea", name = "u", descriptor = "Lclient!hda;")
	public static Class158 aClass158_2 = null;

	@OriginalMember(owner = "client!cea", name = "A", descriptor = "I")
	public static int anInt1581 = 0;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II[Lclient!hda;IIIIZIII)V")
	public static void method1522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static163.aClass19_17.KA(arg3, arg4, arg8, arg5);
		for (@Pc(13) int local13 = 0; local13 < arg2.length; local13++) {
			@Pc(19) Class158 local19 = arg2[local13];
			if (local19 != null && (arg0 == local19.anInt3743 || arg0 == -1412584499 && Static109.aClass158_3 == local19)) {
				@Pc(49) int local49 = local19.anInt3735 + arg1;
				@Pc(54) int local54 = arg9 + local19.anInt3784;
				@Pc(61) int local61 = local19.anInt3802 + local49 + 1;
				@Pc(69) int local69 = local54 + local19.anInt3746 + 1;
				@Pc(74) int local74;
				if (arg6 == -1) {
					Class2_Sub1_Sub28.aRectangleArray1[Static122.anInt2339].setBounds(local19.anInt3735 + arg1, arg9 + local19.anInt3784, local19.anInt3802, local19.anInt3746);
					local74 = Static122.anInt2339++;
				} else {
					local74 = arg6;
				}
				local19.anInt3752 = local74;
				local19.anInt3813 = Static333.anInt5455;
				if (!Static84.method1660(local19)) {
					if (local19.anInt3806 != 0) {
						Static523.method3449(local19);
					}
					@Pc(125) int local125 = arg1 + local19.anInt3735;
					@Pc(130) int local130 = arg9 + local19.anInt3784;
					@Pc(132) int local132 = 0;
					@Pc(134) int local134 = 0;
					if (Static137.aBoolean210) {
						local132 = Static130.method2283();
						local134 = Static422.method5771();
					}
					@Pc(145) int local145 = local19.anInt3780;
					if (Static103.aBoolean195 && (Static84.method1661(local19).anInt6909 != 0 || local19.anInt3820 == 0) && local145 > 127) {
						local145 = 127;
					}
					@Pc(216) int local216;
					@Pc(222) int local222;
					if (Static109.aClass158_3 == local19) {
						if (arg0 != -1412584499 && (Static237.anInt6524 == local19.anInt3830 || Static351.anInt5719 == local19.anInt3830)) {
							Static101.anInt2098 = arg9;
							Static438.aClass158Array3 = arg2;
							Static213.anInt3475 = arg1;
							continue;
						}
						if (Static172.aBoolean246 && Static343.aBoolean428) {
							local216 = local132 + Static189.aClass120_1.method8853();
							local222 = local134 + Static189.aClass120_1.method8854();
							local222 -= Static150.anInt2631;
							local216 -= Static378.anInt5941;
							if (Static123.anInt2341 > local216) {
								local216 = Static123.anInt2341;
							}
							if (local222 < Static169.anInt2853) {
								local222 = Static169.anInt2853;
							}
							if (Static123.anInt2341 + Static354.aClass158_8.anInt3802 < local216 - -local19.anInt3802) {
								local216 = Static123.anInt2341 + Static354.aClass158_8.anInt3802 - local19.anInt3802;
							}
							local125 = local216;
							if (Static169.anInt2853 + Static354.aClass158_8.anInt3746 < local222 + local19.anInt3746) {
								local222 = Static169.anInt2853 + Static354.aClass158_8.anInt3746 - local19.anInt3746;
							}
							local130 = local222;
						}
						if (local19.anInt3830 == Static351.anInt5719) {
							local145 = 128;
						}
					}
					@Pc(359) int local359;
					@Pc(371) int local371;
					@Pc(317) int local317;
					@Pc(323) int local323;
					if (local19.anInt3820 == 2) {
						local216 = arg3;
						local371 = arg5;
						local222 = arg4;
						local359 = arg8;
					} else {
						local317 = local125 + local19.anInt3802;
						local323 = local130 + local19.anInt3746;
						if (local19.anInt3820 == 9) {
							local323++;
							local317++;
						}
						local222 = arg4 >= local130 ? arg4 : local130;
						local216 = local125 > arg3 ? local125 : arg3;
						local359 = arg8 <= local317 ? arg8 : local317;
						local371 = local323 < arg5 ? local323 : arg5;
					}
					if (local359 > local216 && local222 < local371) {
						@Pc(744) int local744;
						@Pc(777) int local777;
						@Pc(792) int local792;
						@Pc(936) int local936;
						@Pc(938) int local938;
						@Pc(779) int local779;
						if (local19.anInt3806 != 0) {
							if (local19.anInt3806 == Static188.anInt3104 || local19.anInt3806 == Static190.anInt3113) {
								Static449.method6114(local130, local125, local19);
								if (!Static137.aBoolean210) {
									Static294.method4339(local130, local19.anInt3806 == Static190.anInt3113, local19.anInt3802, local19.anInt3746, local125);
									Static163.aClass19_17.KA(arg3, arg4, arg8, arg5);
								}
								Static364.aBooleanArray18[local74] = true;
								continue;
							}
							if (local19.anInt3806 == Static496.anInt7433 && Static1.anInt10798 == 0) {
								if (local19.method3393(Static163.aClass19_17) != null) {
									Static557.method7331();
									Static28.method746(local130, Static163.aClass19_17, local19, local125);
									Static469.aBooleanArray23[local74] = true;
									Static163.aClass19_17.KA(arg3, arg4, arg8, arg5);
									if (Static137.aBoolean210) {
										if (arg7) {
											Static682.method8927(local54, local69, local49, local61);
										} else {
											Static595.method7810(local54, local61, local69, local49);
										}
									}
								}
								continue;
							}
							if (local19.anInt3806 == Static149.anInt2630) {
								Static212.method3136(local19, local125, local130, Static163.aClass19_17);
								continue;
							}
							if (local19.anInt3806 == Static343.anInt5612) {
								Static393.method5509(Static163.aClass19_17, local19.anInt3779 % 64, local19, local125, local130);
								continue;
							}
							if (local19.anInt3806 == Static206.anInt3421) {
								if (local19.method3393(Static163.aClass19_17) != null) {
									Static646.method8454(local19, local125, local130);
									Static469.aBooleanArray23[local74] = true;
									Static163.aClass19_17.KA(arg3, arg4, arg8, arg5);
									if (Static137.aBoolean210) {
										if (arg7) {
											Static682.method8927(local54, local69, local49, local61);
										} else {
											Static595.method7810(local54, local61, local69, local49);
										}
									}
								}
								continue;
							}
							if (local19.anInt3806 == Static58.anInt1177) {
								Static93.method1832(local19.anInt3746, local125, local130, Static56.anInterface4_3, Static163.aClass19_17, local19.anInt3802);
								Static364.aBooleanArray18[local74] = true;
								Static163.aClass19_17.KA(arg3, arg4, arg8, arg5);
								continue;
							}
							if (local19.anInt3806 == Static146.anInt2567) {
								Static515.method6801(local19.anInt3802, Static163.aClass19_17, local19.anInt3746, local125, local130);
								Static364.aBooleanArray18[local74] = true;
								Static163.aClass19_17.KA(arg3, arg4, arg8, arg5);
								continue;
							}
							if (local19.anInt3806 == Static697.anInt10507) {
								if (!Static105.aBoolean196 && !Static354.aBoolean440) {
									continue;
								}
								local317 = local125 + local19.anInt3802;
								local323 = local130 + 15;
								if (Static137.aBoolean210) {
									if (arg7) {
										Static682.method8927(local54, local69, local49, local61);
									} else {
										Static595.method7810(local54, local61, local69, local49);
									}
								}
								if (Static105.aBoolean196) {
									local744 = -256;
									if (Static652.anInt9712 < 20) {
										local744 = -65536;
									}
									Static437.aClass14_9.method8834(local317, "Fps:" + Static652.anInt9712, local744, -1, local323);
									local323 += 15;
									@Pc(768) Runtime local768 = Runtime.getRuntime();
									local777 = (int) ((local768.totalMemory() - local768.freeMemory()) / 1024L);
									local779 = -256;
									if (local777 > 98304) {
										if (Static473.aBoolean539) {
											Static664.method8659();
											for (local792 = 0; local792 < 10; local792++) {
												System.gc();
											}
											local777 = (int) ((local768.totalMemory() - local768.freeMemory()) / 1024L);
											if (local777 > 65536) {
												Static67.method6098("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local779 = -65536;
									}
									Static437.aClass14_9.method8834(local317, "Mem:" + local777 + "k", local779, -1, local323);
									local323 += 15;
									Static437.aClass14_9.method8834(local317, "Game: In:" + Static405.aClass153_2.anInt3645 + "B/s Out:" + Static405.aClass153_2.anInt3643 + "B/s", -256, -1, local323);
									local323 += 15;
									Static437.aClass14_9.method8834(local317, "Lobby: In:" + Static405.aClass153_1.anInt3645 + "B/s Out:" + Static405.aClass153_1.anInt3643 + "B/s", -256, -1, local323);
									local323 += 15;
									local792 = Static163.aClass19_17.E() / 1024;
									Static437.aClass14_9.method8834(local317, "Offheap:" + local792 + "k", local792 > 65536 ? -65536 : -256, -1, local323);
									local323 += 15;
									local936 = 0;
									local938 = 0;
									@Pc(940) int local940 = 0;
									for (@Pc(942) int local942 = 0; local942 < 37; local942++) {
										if (Static226.aClass47_Sub1Array8[local942] != null) {
											local936 += Static226.aClass47_Sub1Array8[local942].method6645();
											local938 += Static226.aClass47_Sub1Array8[local942].method6649();
											local940 += Static226.aClass47_Sub1Array8[local942].method6647();
										}
									}
									@Pc(986) int local986 = local940 * 100 / local936;
									@Pc(992) int local992 = local938 * 10000 / local936;
									@Pc(1018) String local1018 = "Cache:" + Static573.method7571(0, true, (long) local992, 2) + "% (" + local986 + "%)";
									Static665.aClass14_12.method8834(local317, local1018, -256, -1, local323);
									local323 += 12;
								}
								if (Static530.anInt8093 > 0) {
									Static665.aClass14_12.method8834(local317, "Particles: " + Static111.anInt2220 + " / " + Static530.anInt8093, -256, -1, local323);
								}
								local323 += 12;
								if (Static354.aBoolean440) {
									Static665.aClass14_12.method8834(local317, "Polys: " + Static163.aClass19_17.I() + " Models: " + Static163.aClass19_17.M(), -256, -1, local323);
									local323 += 12;
									Static665.aClass14_12.method8834(local317, "Ls: " + Static606.anInt8954 + " La: " + Static577.anInt8587 + " NPC: " + Static480.anInt7206 + " Pl: " + Static179.anInt2984, -256, -1, local323);
									Static126.method2228();
									local323 += 12;
								}
								Static364.aBooleanArray18[local74] = true;
								continue;
							}
						}
						@Pc(1255) int local1255;
						@Pc(1214) Class2_Sub4 local1214;
						if (local19.anInt3820 == 0) {
							if (local19.anInt3806 == Static362.anInt5831 && Static163.aClass19_17.method8014()) {
								Static163.aClass19_17.method7959(local125, local130, local19.anInt3802, local19.anInt3746);
							}
							method1522(local19.anInt3812, local125 - local19.anInt3809, arg2, local216, local222, local371, local74, arg7, local359, local130 - local19.anInt3768);
							if (local19.aClass158Array1 != null) {
								method1522(local19.anInt3812, local125 - local19.anInt3809, local19.aClass158Array1, local216, local222, local371, local74, arg7, local359, local130 - local19.anInt3768);
							}
							local1214 = (Class2_Sub4) Static548.aClass28_40.method738((long) local19.anInt3812);
							if (local1214 != null) {
								Static534.method7120(local1214.anInt147, local216, local359, local222, local130, local74, local125, local371);
							}
							if (local19.anInt3806 == Static362.anInt5831) {
								if (Static163.aClass19_17.method8014()) {
									Static163.aClass19_17.method7974();
								}
								if (Static1.anInt10798 == 3) {
									local323 = Static399.anInt6215;
									local744 = Static337.anInt5556;
									local1255 = Static186.anInt3059;
									local777 = Static622.anInt7737;
									if (Static333.anInt5455 < Static4.anInt84) {
										@Pc(1276) float local1276 = (float) (Static333.anInt5455 - Static115.anInt2259) / (float) (Static4.anInt84 - Static115.anInt2259);
										local744 = (int) ((float) Static582.anInt8628 * (1.0F - local1276) + local1276 * (float) Static337.anInt5556);
										local1255 = (int) (local1276 * (float) Static186.anInt3059 + (float) Static493.anInt7370 * (1.0F - local1276));
										local323 = (int) (local1276 * (float) Static399.anInt6215 + (1.0F - local1276) * (float) Static323.anInt5120);
										local777 = (int) (local1276 * (float) Static622.anInt7737 + (1.0F - local1276) * (float) Static201.anInt8407);
									}
									if (local323 > 0) {
										Static163.aClass19_17.method7971(local359 - local216, -local222 + local371, local222, local216, local744 << 16 | local323 << 24 | local1255 << 8 | local777);
									}
								}
							}
							Static163.aClass19_17.KA(arg3, arg4, arg8, arg5);
						}
						if (Static359.aBooleanArray17[local74] || Static18.anInt251 > 1) {
							if (local19.anInt3820 == 3) {
								if (local145 == 0) {
									if (local19.aBoolean294) {
										Static163.aClass19_17.aa(local125, local130, local19.anInt3802, local19.anInt3746, local19.anInt3779, 0);
									} else {
										Static163.aClass19_17.method7976(local125, local130, local19.anInt3802, local19.anInt3746, local19.anInt3779, 0);
									}
								} else if (local19.aBoolean294) {
									Static163.aClass19_17.aa(local125, local130, local19.anInt3802, local19.anInt3746, 255 - (local145 & 0xFF) << 24 | local19.anInt3779 & 0xFFFFFF, 1);
								} else {
									Static163.aClass19_17.method7976(local125, local130, local19.anInt3802, local19.anInt3746, 255 - (local145 & 0xFF) << 24 | local19.anInt3779 & 0xFFFFFF, 1);
								}
								if (Static137.aBoolean210) {
									if (arg7) {
										Static682.method8927(local54, local69, local49, local61);
									} else {
										Static595.method7810(local54, local61, local69, local49);
									}
								}
							} else {
								@Pc(1543) Class382 local1543;
								if (local19.anInt3820 == 4) {
									@Pc(1514) Class14 local1514 = local19.method3403(Static163.aClass19_17);
									if (local1514 != null) {
										local323 = local19.anInt3779;
										@Pc(1533) String local1533 = local19.aString44;
										if (local19.anInt3760 != -1) {
											local1543 = Static419.aClass112_1.method2486(local19.anInt3760);
											local1533 = local1543.aString118;
											if (local1533 == null) {
												local1533 = "null";
											}
											if ((local1543.anInt10115 == 1 || local19.anInt3817 != 1) && local19.anInt3817 != -1) {
												local1533 = "<col=ff9040>" + local1533 + "</col> x" + Static360.method5233(local19.anInt3817);
											}
										}
										if (local19.anInt3745 != -1) {
											local1533 = Static146.method2414(local19.anInt3745);
											if (local1533 == null) {
												local1533 = "";
											}
										}
										if (local19 == Static390.aClass158_9) {
											local1533 = Static32.aClass32_31.method877(Static51.anInt1052);
											local323 = local19.anInt3779;
										}
										if (Static376.aBoolean452) {
											Static163.aClass19_17.T(local125, local130, local125 + local19.anInt3802, local19.anInt3746 + local130);
										}
										local1514.method8830(local19.anInt3814, local323 | 255 - (local145 & 0xFF) << 24, local19.aBoolean286 ? 255 - (local145 & 0xFF) << 24 : -1, Static679.aClass23Array14, local19.anInt3788, 0, local130, local19.anInt3746, 0, (Class1) null, local19.anInt3748, local19.anInt3802, local125, local19.anInt3818, (int[]) null, local1533);
										if (Static376.aBoolean452) {
											Static163.aClass19_17.KA(arg3, arg4, arg8, arg5);
										}
										if (local1533.trim().length() > 0) {
											if (!Static376.aBoolean452) {
												@Pc(1730) Class381 local1730 = Static275.method3980(local19.anInt3781, Static163.aClass19_17);
												local777 = local1730.method8741(Static679.aClass23Array14, local1533, local19.anInt3802);
												local779 = local1730.method8745(local19.anInt3802, local19.anInt3748, local1533, Static679.aClass23Array14);
												if (Static137.aBoolean210) {
													if (arg7) {
														Static682.method8927(local130, local130 + local779, local125, local125 + local777);
													} else {
														Static595.method7810(local130, local125 + local777, local779 + local130, local125);
													}
												}
											} else if (Static137.aBoolean210) {
												if (arg7) {
													Static682.method8927(local54, local69, local49, local61);
												} else {
													Static595.method7810(local54, local61, local69, local49);
												}
											}
										}
									} else if (Static544.aBoolean624) {
										Static178.method2729(local19);
									}
								} else if (local19.anInt3820 == 5) {
									if (local19.anInt3824 < 0) {
										@Pc(1816) Class23 local1816;
										if (local19.anInt3760 != -1) {
											@Pc(1836) Class201 local1836 = local19.aBoolean288 ? Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1 : null;
											local1816 = Static419.aClass112_1.method2483(local1836, Static163.aClass19_17, local19.anInt3757, local19.anInt3760, local19.anInt3773, local19.anInt3817, local19.anInt3798 | 0xFF000000);
										} else if (local19.anInt3745 == -1) {
											local1816 = local19.method3383(Static163.aClass19_17);
										} else {
											local1816 = Static651.method8512(local19.anInt3745, Static163.aClass19_17);
										}
										if (local1816 != null) {
											local323 = local1816.method8203();
											local744 = local1816.method8192();
											local1255 = 255 - (local145 & 0xFF) << 24 | (local19.anInt3779 == 0 ? 16777215 : local19.anInt3779 & 0xFFFFFF);
											if (local19.aBoolean301) {
												Static163.aClass19_17.T(local125, local130, local125 + local19.anInt3802, local130 - -local19.anInt3746);
												if (local19.anInt3765 != 0) {
													local777 = (local19.anInt3802 + local323 - 1) / local323;
													local779 = (local744 + local19.anInt3746 - 1) / local744;
													for (local792 = 0; local792 < local777; local792++) {
														for (local936 = 0; local936 < local779; local936++) {
															if (local19.anInt3779 == 0) {
																local1816.method8186((float) (local792 * local323 + local125) + (float) local323 / 2.0F, (float) (local130 + local744 * local936) + (float) local744 / 2.0F, 4096, local19.anInt3765);
															} else {
																local1816.method8187((float) (local792 * local323 + local125) + (float) local323 / 2.0F, (float) local744 / 2.0F + (float) (local936 * local744 + local130), 4096, local19.anInt3765, local1255);
															}
														}
													}
												} else if (local19.anInt3779 == 0 && local145 == 0) {
													local1816.method8198(local125, local130, local19.anInt3802, local19.anInt3746);
												} else {
													local1816.method8189(local125, local130, local19.anInt3802, local19.anInt3746, 0, local1255, 1);
												}
												Static163.aClass19_17.KA(arg3, arg4, arg8, arg5);
											} else if (local19.anInt3779 == 0 && local145 == 0) {
												if (local19.anInt3765 != 0) {
													local1816.method8186((float) local19.anInt3802 / 2.0F + (float) local125, (float) local130 + (float) local19.anInt3746 / 2.0F, local19.anInt3802 * 4096 / local323, local19.anInt3765);
												} else if (local323 == local19.anInt3802 && local19.anInt3746 == local744) {
													local1816.method8202(local125, local130);
												} else {
													local1816.method8206(local125, local130, local19.anInt3802, local19.anInt3746);
												}
											} else if (local19.anInt3765 != 0) {
												local1816.method8187((float) local19.anInt3802 / 2.0F + (float) local125, (float) local19.anInt3746 / 2.0F + (float) local130, local19.anInt3802 * 4096 / local323, local19.anInt3765, local1255);
											} else if (local323 == local19.anInt3802 && local19.anInt3746 == local744) {
												local1816.method8197(local125, local130, 0, local1255, 1);
											} else {
												local1816.method8205(local125, local130, local19.anInt3802, local19.anInt3746, 0, local1255, 1);
											}
										} else if (Static544.aBoolean624) {
											Static178.method2729(local19);
										}
									} else {
										local19.method3405(Static99.aClass78_1, Static324.aClass307_1).method3162(Static163.aClass19_17, local130, local125, local19.anInt3802, local19.anInt3815 << 3, local19.anInt3786 << 3, local19.anInt3746);
									}
									if (Static137.aBoolean210) {
										if (arg7) {
											Static682.method8927(local54, local69, local49, local61);
										} else {
											Static595.method7810(local54, local61, local69, local49);
										}
									}
								} else if (local19.anInt3820 == 6) {
									Static104.method2033();
									local1214 = null;
									@Pc(2313) Class114 local2313 = null;
									local744 = 0;
									if (local19.anInt3760 != -1) {
										local1543 = Static419.aClass112_1.method2486(local19.anInt3760);
										if (local1543 != null) {
											local1543 = local1543.method8790(local19.anInt3817);
											local2313 = local1543.method8805(local19.aClass152_6, 2048, local19.aBoolean288 ? Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1 : null, 1, Static163.aClass19_17);
											if (local2313 == null) {
												Static178.method2729(local19);
											} else {
												local744 = -local2313.fa() >> 1;
											}
										}
									} else if (local19.anInt3823 == 5) {
										local1255 = local19.anInt3831;
										if (local1255 >= 0 && local1255 < 2048) {
											@Pc(2341) Class8_Sub2_Sub1_Sub2_Sub1 local2341 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local1255];
											if (local2341 != null && (local1255 == Static312.anInt5000 || Static214.method3157(local2341.aString9) == local19.anInt3738)) {
												local2313 = local2341.aClass201_1.method4546(Static419.aClass112_1, local19.aClass152_6, Static574.aClass310_2, Static25.aClass50_1, 2048, (int[]) null, Static125.aClass388_1, Static68.aClass215_3, Static163.aClass19_17, Static690.aClass308_2, (Class152[]) null, 0, (Class152) null, Static34.aClass304_1);
											}
										}
									} else if (local19.anInt3823 == 8 || local19.anInt3823 == 9) {
										@Pc(2468) Class2_Sub22 local2468 = Static556.method7303(local19.anInt3831, false);
										if (local2468 != null) {
											local2313 = local2468.method3078(local19.anInt3738, Static163.aClass19_17, local19.anInt3823 == 9, local19.aClass152_6, local19.aBoolean288 ? Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1 : null);
										}
									} else if (local19.aClass152_6 != null && local19.aClass152_6.method9109()) {
										local2313 = local19.method3401(Static163.aClass19_17, local19.aClass152_6, Static574.aClass310_2, Static68.aClass215_3, Static25.aClass50_1, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1, Static34.aClass304_1, Static690.aClass308_2, Static419.aClass112_1, 2048, local1214);
										if (local2313 == null && Static544.aBoolean624) {
											Static178.method2729(local19);
										}
									} else {
										local2313 = local19.method3401(Static163.aClass19_17, (Class152) null, Static574.aClass310_2, Static68.aClass215_3, Static25.aClass50_1, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1, Static34.aClass304_1, Static690.aClass308_2, Static419.aClass112_1, 2048, local1214);
										if (local2313 == null && Static544.aBoolean624) {
											Static178.method2729(local19);
										}
									}
									if (local2313 != null) {
										if (local19.anInt3800 <= 0) {
											local1255 = 512;
										} else {
											local1255 = (local19.anInt3802 << 9) / local19.anInt3800;
										}
										if (local19.anInt3825 <= 0) {
											local777 = 512;
										} else {
											local777 = (local19.anInt3746 << 9) / local19.anInt3825;
										}
										local779 = local19.anInt3802 / 2 + local125;
										local792 = local19.anInt3746 / 2 + local130;
										if (!local19.aBoolean302) {
											local779 += local19.anInt3755 * local1255 >> 9;
											local792 += local19.anInt3799 * local777 >> 9;
										}
										Static460.aClass73_10.method7133();
										Static163.aClass19_17.method8000(Static460.aClass73_10);
										Static163.aClass19_17.DA(local779, local792, local1255, local777);
										Static163.aClass19_17.ya();
										if (local19.aBoolean289) {
											Static163.aClass19_17.C(false);
										}
										if (local19.aBoolean302) {
											Static59.aClass73_5.method7136(local19.anInt3807);
											Static59.aClass73_5.method7127(local19.anInt3811);
											Static59.aClass73_5.method7139(local19.anInt3737);
											Static59.aClass73_5.method7134(local19.anInt3755, local19.anInt3799, local19.anInt3821);
										} else {
											local936 = Class361.anIntArray741[local19.anInt3807 << 3] * (local19.anInt3793 << 2) >> 14;
											local938 = Class361.anIntArray740[local19.anInt3807 << 3] * (local19.anInt3793 << 2) >> 14;
											Static59.aClass73_5.method7132(-local19.anInt3737 << 3);
											Static59.aClass73_5.method7127(local19.anInt3811 << 3);
											Static59.aClass73_5.method7134(local19.anInt3736 << 2, local744 + (local19.anInt3804 << 2) + local936, (local19.anInt3804 << 2) + local938);
											Static59.aClass73_5.method7130(local19.anInt3807 << 3);
										}
										local19.method3384(Static163.aClass19_17, local2313, Static59.aClass73_5, Static333.anInt5455);
										if (Static376.aBoolean452) {
											Static163.aClass19_17.T(local125, local130, local125 + local19.anInt3802, local19.anInt3746 + local130);
										}
										if (local19.aBoolean302) {
											if (local19.aBoolean285) {
												local2313.method7484(Static59.aClass73_5, (Class8_Sub6) null, local19.anInt3793, 1);
											} else {
												local2313.method7473(Static59.aClass73_5, (Class8_Sub6) null, 1);
												if (local19.aClass8_Sub5_4 != null) {
													Static163.aClass19_17.method8021(local19.aClass8_Sub5_4.method3650());
												}
											}
										} else if (local19.aBoolean285) {
											local2313.method7484(Static59.aClass73_5, (Class8_Sub6) null, local19.anInt3793 << 2, 1);
										} else {
											local2313.method7473(Static59.aClass73_5, (Class8_Sub6) null, 1);
											if (local19.aClass8_Sub5_4 != null) {
												Static163.aClass19_17.method8021(local19.aClass8_Sub5_4.method3650());
											}
										}
										if (Static376.aBoolean452) {
											Static163.aClass19_17.KA(arg3, arg4, arg8, arg5);
										}
										if (local19.aBoolean289) {
											Static163.aClass19_17.C(true);
										}
									}
									if (Static137.aBoolean210) {
										if (arg7) {
											Static682.method8927(local54, local69, local49, local61);
										} else {
											Static595.method7810(local54, local61, local69, local49);
										}
									}
								} else if (local19.anInt3820 == 9) {
									if (local19.aBoolean287) {
										local323 = local19.anInt3746 + local130;
										local1255 = local130;
										local744 = local125 + local19.anInt3802;
									} else {
										local1255 = local19.anInt3746 + local130;
										local323 = local130;
										local744 = local125 + local19.anInt3802;
									}
									if (local19.anInt3778 == 1) {
										Static163.aClass19_17.method7951(local125, local323, local744, local1255, local19.anInt3779, 0);
									} else {
										Static163.aClass19_17.method7947(local125, local323, local744, local1255, local19.anInt3779, local19.anInt3778);
									}
									if (Static137.aBoolean210) {
										if (arg7) {
											Static682.method8927(local54, local69, local49, local61);
										} else {
											Static595.method7810(local54, local61, local69, local49);
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

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IB)V")
	public static void method1523(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub2_Sub2 local18 = Static440.method5963(21, (long) arg0);
		local18.method205();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1524(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static436.anInt3849; local16++) {
			if (arg0.equalsIgnoreCase(Static446.aStringArray35[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static316.aStringArray41[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)Z")
	public static boolean method1525() {
		@Pc(5) boolean local5 = true;
		if (Static414.aClass407_2 == null) {
			if (Static721.aClass330_128.method7581(Static456.anInt6929)) {
				Static414.aClass407_2 = Static735.method9379(Static721.aClass330_128, Static456.anInt6929);
			} else {
				local5 = false;
			}
		}
		if (Static535.aClass407_3 == null) {
			if (Static721.aClass330_128.method7581(Static362.anInt5828)) {
				Static535.aClass407_3 = Static735.method9379(Static721.aClass330_128, Static362.anInt5828);
			} else {
				local5 = false;
			}
		}
		if (Static74.aClass407_1 == null) {
			if (Static721.aClass330_128.method7581(Static11.anInt136)) {
				Static74.aClass407_1 = Static735.method9379(Static721.aClass330_128, Static11.anInt136);
			} else {
				local5 = false;
			}
		}
		if (Static16.aClass381_1 == null) {
			if (Static697.aClass330_123.method7581(Static723.anInt10929)) {
				Static16.aClass381_1 = Static238.method3468(Static723.anInt10929, Static697.aClass330_123);
			} else {
				local5 = false;
			}
		}
		if (Static627.aClass407Array1 == null) {
			if (Static721.aClass330_128.method7581(Static723.anInt10929)) {
				Static627.aClass407Array1 = Static735.method9387(Static721.aClass330_128, Static723.anInt10929);
			} else {
				local5 = false;
			}
		}
		return local5;
	}
}
