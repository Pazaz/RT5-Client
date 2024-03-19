import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString207 = "wave:";

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
	public static int anInt5700 = 1;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z[Lclient!ro;IIII)V")
	public static void method4864(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class177[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) Class177 local14 = arg1[local8];
			if (local14 != null && arg4 == local14.anInt5829) {
				Static330.method5796(arg3, arg2, arg0, local14);
				Static284.method5097(arg2, arg3, local14);
				if (local14.anInt5811 > local14.anInt5822 - local14.anInt5803) {
					local14.anInt5811 = local14.anInt5822 - local14.anInt5803;
				}
				if (local14.anInt5811 < 0) {
					local14.anInt5811 = 0;
				}
				if (local14.anInt5842 - local14.anInt5816 < local14.anInt5806) {
					local14.anInt5806 = local14.anInt5842 - local14.anInt5816;
				}
				if (local14.anInt5806 < 0) {
					local14.anInt5806 = 0;
				}
				if (local14.anInt5838 == 0) {
					Static140.method3081(local14, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
	public static void method4868() {
		if (Static118.anInt3015 == 5) {
			Static118.anInt3015 = 6;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[[I[[BLclient!gm;Lclient!gm;II[[B[[BLclient!nr;I[[BZ)V")
	public static void method4869(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class77 arg3, @OriginalArg(4) Class77 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) Class40 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) boolean arg11) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			@Pc(16) int local16 = arg0 - 1 <= local3 ? local3 : local3 + 1;
			for (@Pc(18) int local18 = 0; local18 < arg5; local18++) {
				@Pc(35) int local35 = local18 >= arg5 - 1 ? local18 : local18 + 1;
				if (Static13.method5497() || Static58.method1400(local3, local18, arg9, Static331.anInt6843)) {
					@Pc(49) boolean local49 = false;
					@Pc(51) boolean local51 = false;
					@Pc(54) boolean[] local54 = new boolean[4];
					@Pc(60) int local60 = arg2[local3][local18];
					@Pc(66) int local66 = arg7[local3][local18];
					@Pc(74) int local74 = arg6[local3][local18] & 0xFF;
					@Pc(82) int local82 = arg10[local3][local18] & 0xFF;
					@Pc(90) int local90 = arg10[local3][local35] & 0xFF;
					@Pc(98) int local98 = arg10[local16][local35] & 0xFF;
					@Pc(106) int local106 = arg10[local16][local18] & 0xFF;
					if (local74 != 0 || local82 != 0) {
						@Pc(126) Class191 local126 = local74 == 0 ? null : Static295.method5207(local74 - 1);
						if (local60 == 0 && local126 == null) {
							local60 = 12;
						}
						@Pc(145) Class119 local145 = local82 == 0 ? null : Static293.method5171(local82 - 1);
						@Pc(147) Class191 local147 = local126;
						if (local126 != null) {
							if (local126.anInt6235 == -1 && local126.anInt6243 == -1) {
								local147 = local126;
								local126 = null;
							} else if (local145 != null && local60 != 0) {
								local51 = local126.aBoolean447;
							}
						}
						@Pc(250) int local250;
						@Pc(271) int local271;
						@Pc(332) int local332;
						@Pc(345) int local345;
						if ((local60 == 0 || local60 == 12) && local3 > 0 && local18 > 0 && local3 < arg0 && local18 < arg5) {
							@Pc(214) int local214 = arg10[local16][local35] == local82 ? 1 : -1;
							@Pc(229) int local229 = local82 == arg10[local16][local18 - 1] ? 1 : -1;
							local250 = arg10[local3 - 1][local18 - 1] == local82 ? 1 : -1;
							local271 = local82 == arg10[local3 - 1][local35] ? 1 : -1;
							if (local82 == arg10[local3][local18 - 1]) {
								local229++;
								local250++;
							} else {
								local229--;
								local250--;
							}
							if (arg10[local16][local18] == local82) {
								local214++;
								local229++;
							} else {
								local214--;
								local229--;
							}
							if (arg10[local3][local35] == local82) {
								local271++;
								local214++;
							} else {
								local214--;
								local271--;
							}
							if (arg10[local3 - 1][local18] == local82) {
								local250++;
								local271++;
							} else {
								local250--;
								local271--;
							}
							local332 = local250 - local214;
							if (local332 < 0) {
								local332 = -local332;
							}
							local345 = local229 - local271;
							if (local345 < 0) {
								local345 = -local345;
							}
							if (local345 == local332) {
								local332 = arg3.method3986(local3, local18) - arg3.method3986(local16, local35);
								local345 = arg3.method3986(local16, local18) - arg3.method3986(local3, local35);
								if (local332 < 0) {
									local332 = -local332;
								}
								if (local345 < 0) {
									local345 = -local345;
								}
							}
							local66 = local345 <= local332 ? 0 : 1;
						}
						for (local250 = 0; local250 < 13; local250++) {
							Static84.anIntArray141[local250] = -1;
							Static328.anIntArray553[local250] = 1;
						}
						@Pc(428) boolean[] local428 = local126 != null && local126.aBoolean447 ? Static58.aBooleanArrayArray1[local60] : Static101.aBooleanArrayArray4[local60];
						Static327.method5689(arg2, local60, arg8, local54, local126, arg6, local66, arg5, arg7, local18, arg0, local145, local3);
						@Pc(458) boolean local458 = local126 != null && local126.anInt6235 != local126.anInt6243;
						if (!local458) {
							for (local271 = 0; local271 < 8; local271++) {
								if (Static84.anIntArray141[local271] >= 0 && Static147.anIntArray256[local271] != Static164.anIntArray281[local271]) {
									local458 = true;
									break;
								}
							}
						}
						if (!local428[local66 + 1 & 0x3]) {
							local54[1] = Static355.method3602(local54[1], (Static328.anIntArray553[4] & Static328.anIntArray553[2]) == 0);
						}
						if (!local428[local66 + 3 & 0x3]) {
							local54[3] = Static355.method3602(local54[3], (Static328.anIntArray553[0] & Static328.anIntArray553[6]) == 0);
						}
						if (!local428[local66 & 0x3]) {
							local54[0] = Static355.method3602(local54[0], (Static328.anIntArray553[2] & Static328.anIntArray553[0]) == 0);
						}
						if (!local428[local66 + 2 & 0x3]) {
							local54[2] = Static355.method3602(local54[2], (Static328.anIntArray553[4] & Static328.anIntArray553[6]) == 0);
						}
						if (!local51 && (local60 == 0 || local60 == 12)) {
							if (local54[0] && !local54[1] && !local54[2] && local54[3]) {
								local60 = local60 == 0 ? 13 : 14;
								local54[0] = local54[3] = false;
								local66 = 0;
							} else if (local54[0] && local54[1] && !local54[2] && !local54[3]) {
								local60 = local60 == 0 ? 13 : 14;
								local66 = 3;
								local54[0] = local54[1] = false;
							} else if (!local54[0] && local54[1] && local54[2] && !local54[3]) {
								local54[1] = local54[2] = false;
								local66 = 2;
								local60 = local60 == 0 ? 13 : 14;
							} else if (!local54[0] && !local54[1] && local54[2] && local54[3]) {
								local60 = local60 == 0 ? 13 : 14;
								local66 = 1;
								local54[2] = local54[3] = false;
							}
						}
						@Pc(769) boolean local769 = !local51 && !local54[0] && !local54[2] && !local54[1] && !local54[3];
						@Pc(771) int[] local771 = null;
						@Pc(779) int[] local779;
						@Pc(791) int[] local791;
						@Pc(807) int[] local807;
						if (local769) {
							local779 = Static36.anIntArrayArray4[local60];
							local345 = local126 == null ? 0 : Static334.anIntArray564[local60];
							local791 = Static143.anIntArrayArray18[local60];
							local807 = Static265.anIntArrayArray37[local60];
							local332 = local145 == null ? 0 : Static300.anIntArray484[local60];
						} else if (local51) {
							local345 = local126 == null ? 0 : Static171.anIntArray287[local60];
							local779 = Static95.anIntArrayArray10[local60];
							local771 = Static20.anIntArrayArray2[local60];
							local332 = local145 == null ? 0 : Static50.anIntArray99[local60];
							local807 = Static13.anIntArrayArray44[local60];
							local791 = Static292.anIntArrayArray41[local60];
						} else {
							local779 = Static177.anIntArrayArray24[local60];
							local345 = local126 == null ? 0 : Static142.anIntArray249[local60];
							local791 = Static295.anIntArrayArray42[local60];
							local332 = local145 == null ? 0 : Static107.anIntArray183[local60];
							local771 = Static41.anIntArrayArray5[local60];
							local807 = Static337.anIntArrayArray54[local60];
						}
						@Pc(873) int local873 = local345 + local332;
						if (local873 <= 0) {
							Static91.method1998(arg9, local3, local18);
						} else {
							if (local54[0]) {
								local873++;
							}
							if (local54[2]) {
								local873++;
							}
							if (local54[1]) {
								local873++;
							}
							if (local54[3]) {
								local873++;
							}
							@Pc(906) int local906 = 0;
							@Pc(908) int local908 = 0;
							@Pc(912) int local912 = local873 * 3;
							@Pc(919) int[] local919 = arg11 ? new int[local912] : null;
							@Pc(926) int[] local926 = local458 ? new int[local912] : null;
							@Pc(929) int[] local929 = new int[local912];
							@Pc(932) int[] local932 = new int[local912];
							@Pc(935) int[] local935 = new int[local912];
							@Pc(938) int[] local938 = new int[local912];
							@Pc(941) int[] local941 = new int[local912];
							@Pc(943) int local943 = -1;
							@Pc(945) int local945 = -1;
							@Pc(947) int local947 = 256;
							@Pc(1053) byte local1053;
							@Pc(997) int local997;
							@Pc(999) int local999;
							@Pc(1234) int local1234;
							@Pc(1240) int local1240;
							@Pc(1249) int local1249;
							@Pc(1253) int local1253;
							@Pc(1257) int local1257;
							@Pc(1333) int local1333;
							@Pc(1341) int local1341;
							if (local126 != null) {
								local943 = local126.anInt6235;
								local945 = arg8.method2767() ? local126.anInt6233 : local126.anInt6234;
								local947 = local126.anInt6242;
								local997 = Static190.method4601(arg8, local126);
								for (local999 = 0; local999 < local345; local999++) {
									if (local54[-local66 & 0x3] && local906 == local771[0]) {
										Static213.anIntArray126[0] = local779[local906];
										Static213.anIntArray126[1] = 1;
										Static213.anIntArray126[2] = local807[local906];
										Static213.anIntArray126[3] = 1;
										Static213.anIntArray126[4] = local791[local906];
										Static213.anIntArray126[5] = local807[local906];
										local1053 = 6;
									} else if (local54[2 - local66 & 0x3] && local906 == local771[2]) {
										Static213.anIntArray126[0] = local779[local906];
										Static213.anIntArray126[1] = 5;
										Static213.anIntArray126[2] = local807[local906];
										Static213.anIntArray126[3] = 5;
										Static213.anIntArray126[4] = local791[local906];
										local1053 = 6;
										Static213.anIntArray126[5] = local807[local906];
									} else if (local54[1 - local66 & 0x3] && local906 == local771[1]) {
										Static213.anIntArray126[0] = local779[local906];
										Static213.anIntArray126[1] = 3;
										Static213.anIntArray126[2] = local807[local906];
										Static213.anIntArray126[3] = 3;
										Static213.anIntArray126[4] = local791[local906];
										Static213.anIntArray126[5] = local807[local906];
										local1053 = 6;
									} else if (local54[3 - local66 & 0x3] && local771[3] == local906) {
										Static213.anIntArray126[0] = local779[local906];
										Static213.anIntArray126[1] = 7;
										Static213.anIntArray126[2] = local807[local906];
										Static213.anIntArray126[3] = 7;
										Static213.anIntArray126[4] = local791[local906];
										local1053 = 6;
										Static213.anIntArray126[5] = local807[local906];
									} else {
										Static213.anIntArray126[0] = local779[local906];
										Static213.anIntArray126[1] = local791[local906];
										local1053 = 3;
										Static213.anIntArray126[2] = local807[local906];
									}
									for (local1234 = 0; local1234 < local1053; local1234++) {
										local1240 = Static213.anIntArray126[local1234];
										local1249 = local1240 - local66 * 2 & 0x7;
										local1253 = Static332.anIntArray556[local1240];
										local1257 = Static105.anIntArray169[local1240];
										if (local66 == 1) {
											local929[local908] = local1257;
											local932[local908] = 128 - local1253;
										} else if (local66 == 2) {
											local929[local908] = 128 - local1253;
											local932[local908] = 128 - local1257;
										} else if (local66 == 3) {
											local929[local908] = 128 - local1257;
											local932[local908] = local1253;
										} else {
											local929[local908] = local1253;
											local932[local908] = local1257;
										}
										if (arg11 && Static59.aBooleanArrayArray9[local60][local1240]) {
											local1333 = (local3 << 7) + local929[local908];
											local1341 = local932[local908] + (local18 << 7);
											local919[local908] = arg4.method3994(local1333, local1341) - arg3.method3994(local1333, local1341);
										}
										if (local1240 < 8 && local126.anInt6245 < Static84.anIntArray141[local1249]) {
											if (local926 != null) {
												local926[local908] = Static164.anIntArray281[local1249];
											}
											local941[local908] = Static68.anIntArray124[local1249];
											local938[local908] = Static149.anIntArray265[local1249];
											local935[local908] = Static147.anIntArray256[local1249];
										} else {
											if (local926 != null) {
												local926[local908] = local997;
											}
											local938[local908] = arg8.method2767() ? local126.anInt6233 : local126.anInt6234;
											local941[local908] = local126.anInt6242;
											local935[local908] = local943;
										}
										local908++;
									}
									local906++;
								}
								if (!arg11 && arg9 == 0) {
									Static283.method5056(local3, local18, local126.anInt6244, local126.anInt6239 * 8);
								}
								if (local60 != 12 && local126.anInt6235 != -1 && local126.aBoolean446) {
									local49 = true;
								}
							} else if (local769) {
								local906 = Static334.anIntArray564[local60];
							} else if (local51) {
								local906 = Static171.anIntArray287[local60];
							} else {
								local906 = Static142.anIntArray249[local60];
							}
							if (local145 != null) {
								if (local106 == 0) {
									local106 = local82;
								}
								if (local90 == 0) {
									local90 = local82;
								}
								if (local98 == 0) {
									local98 = local82;
								}
								@Pc(1478) Class119 local1478 = Static293.method5171(local82 - 1);
								@Pc(1484) Class119 local1484 = Static293.method5171(local90 - 1);
								@Pc(1490) Class119 local1490 = Static293.method5171(local98 - 1);
								@Pc(1496) Class119 local1496 = Static293.method5171(local106 - 1);
								for (local1249 = 0; local1249 < local332; local1249++) {
									if (local54[-local66 & 0x3] && local906 == local771[0]) {
										Static213.anIntArray126[0] = local779[local906];
										Static213.anIntArray126[1] = 1;
										Static213.anIntArray126[2] = local807[local906];
										Static213.anIntArray126[3] = 1;
										Static213.anIntArray126[4] = local791[local906];
										Static213.anIntArray126[5] = local807[local906];
										local1053 = 6;
									} else if (local54[2 - local66 & 0x3] && local906 == local771[2]) {
										Static213.anIntArray126[0] = local779[local906];
										Static213.anIntArray126[1] = 5;
										Static213.anIntArray126[2] = local807[local906];
										Static213.anIntArray126[3] = 5;
										Static213.anIntArray126[4] = local791[local906];
										Static213.anIntArray126[5] = local807[local906];
										local1053 = 6;
									} else if (local54[1 - local66 & 0x3] && local906 == local771[1]) {
										Static213.anIntArray126[0] = local779[local906];
										Static213.anIntArray126[1] = 3;
										Static213.anIntArray126[2] = local807[local906];
										Static213.anIntArray126[3] = 3;
										Static213.anIntArray126[4] = local791[local906];
										local1053 = 6;
										Static213.anIntArray126[5] = local807[local906];
									} else if (local54[3 - local66 & 0x3] && local906 == local771[3]) {
										Static213.anIntArray126[0] = local779[local906];
										Static213.anIntArray126[1] = 7;
										Static213.anIntArray126[2] = local807[local906];
										Static213.anIntArray126[3] = 7;
										Static213.anIntArray126[4] = local791[local906];
										Static213.anIntArray126[5] = local807[local906];
										local1053 = 6;
									} else {
										Static213.anIntArray126[0] = local779[local906];
										Static213.anIntArray126[1] = local791[local906];
										local1053 = 3;
										Static213.anIntArray126[2] = local807[local906];
									}
									for (local1253 = 0; local1253 < local1053; local1253++) {
										local1257 = Static213.anIntArray126[local1253];
										local1333 = local1257 - local66 * 2 & 0x7;
										local1341 = Static332.anIntArray556[local1257];
										@Pc(1752) int local1752 = Static105.anIntArray169[local1257];
										@Pc(1765) int local1765;
										@Pc(1770) int local1770;
										if (local66 == 1) {
											local1770 = 128 - local1341;
											local1765 = local1752;
										} else if (local66 == 2) {
											local1765 = 128 - local1341;
											local1770 = 128 - local1752;
										} else if (local66 == 3) {
											local1765 = 128 - local1752;
											local1770 = local1341;
										} else {
											local1765 = local1341;
											local1770 = local1752;
										}
										local929[local908] = local1765;
										local932[local908] = local1770;
										@Pc(1819) int local1819;
										@Pc(1825) int local1825;
										if (arg11 && Static59.aBooleanArrayArray9[local60][local1257]) {
											local1819 = (local3 << 7) + local1765;
											local1825 = (local18 << 7) + local1770;
											local919[local908] = arg4.method3994(local1819, local1825) - arg3.method3994(local1819, local1825);
										}
										if (local1257 < 8 && Static84.anIntArray141[local1333] >= 0) {
											if (local926 != null) {
												local926[local908] = Static164.anIntArray281[local1333];
											}
											local941[local908] = Static68.anIntArray124[local1333];
											local938[local908] = Static149.anIntArray265[local1333];
											local935[local908] = Static147.anIntArray256[local1333];
										} else {
											if (local51 && Static59.aBooleanArrayArray9[local60][local1257]) {
												local938[local908] = local945;
												local941[local908] = local947;
												local935[local908] = local943;
											} else if (local1765 == 0 && local1770 == 0) {
												local935[local908] = arg1[local3][local18];
												local938[local908] = local1478.anInt4096;
												local941[local908] = local1478.anInt4102;
											} else if (local1765 == 0 && local1770 == 128) {
												local935[local908] = arg1[local3][local35];
												local938[local908] = local1484.anInt4096;
												local941[local908] = local1484.anInt4102;
											} else if (local1765 == 128 && local1770 == 128) {
												local935[local908] = arg1[local16][local35];
												local938[local908] = local1490.anInt4096;
												local941[local908] = local1490.anInt4102;
											} else if (local1765 == 128 && local1770 == 0) {
												local935[local908] = arg1[local16][local18];
												local938[local908] = local1496.anInt4096;
												local941[local908] = local1496.anInt4102;
											} else {
												if (local1765 >= 64) {
													if (local1770 >= 64) {
														local938[local908] = local1490.anInt4096;
														local941[local908] = local1490.anInt4102;
													} else {
														local938[local908] = local1496.anInt4096;
														local941[local908] = local1496.anInt4102;
													}
												} else if (local1770 >= 64) {
													local938[local908] = local1484.anInt4096;
													local941[local908] = local1484.anInt4102;
												} else {
													local938[local908] = local1478.anInt4096;
													local941[local908] = local1478.anInt4102;
												}
												local1819 = Static88.method1944(arg1[local16][local18], local1765 << 7 >> 7, arg1[local3][local18]);
												local1825 = Static88.method1944(arg1[local16][local35], local1765 << 7 >> 7, arg1[local3][local35]);
												local935[local908] = Static88.method1944(local1825, local1770 << 7 >> 7, local1819);
											}
											if (local926 != null) {
												local926[local908] = local935[local908];
											}
										}
										local908++;
									}
									local906++;
								}
								if (local60 != 0 && local145.aBoolean290) {
									local49 = true;
								}
							}
							local997 = arg3.method3986(local3, local18);
							local999 = arg3.method3986(local16, local18);
							local1234 = arg3.method3986(local16, local35);
							local1240 = arg3.method3986(local3, local35);
							if (arg9 > 0) {
								@Pc(2165) boolean local2165 = true;
								if (local82 == 0 && local60 != 0) {
									local2165 = false;
								}
								if (local74 > 0 && local147 != null && !local147.aBoolean445) {
									local2165 = false;
								}
								if (local2165 && local997 == local999 && local997 == local1234 && local997 == local1240) {
									Static190.aByteArrayArrayArray15[arg9][local3][local18] = (byte) (Static190.aByteArrayArrayArray15[arg9][local3][local18] | 0x4);
								}
							}
							local1249 = 0;
							local1253 = 0;
							if (arg11) {
								local1249 = Static159.method3982(local3, local18);
								local1253 = Static43.method1266(local3, local18);
							}
							arg3.method4000(local3, local18, local929, local919, local932, local935, local926, local938, local941, local1249, local1253, local49);
							Static91.method1998(arg9, local3, local18);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
	public static void method4870() {
		Static13.aClass1_Sub22_3 = new Class1_Sub22(Static285.aString222, "", Static161.anInt3951, 1001, 0L, 0, 0);
	}
}
