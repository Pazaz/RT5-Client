import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!wi;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	public static int anInt1188;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	public static volatile int anInt1171 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ro;)Lclient!ro;")
	public static Class177 method917(@OriginalArg(0) Class177 arg0) {
		@Pc(4) int local4 = method930(arg0).method5625();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static298.method5252(arg0.anInt5829);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ro;)Z")
	public static boolean method918(@OriginalArg(0) Class177 arg0) {
		if (Static278.aBoolean279) {
			if (method930(arg0).anInt6604 != 0) {
				return false;
			}
			if (arg0.anInt5838 == 0) {
				return false;
			}
		}
		return arg0.aBoolean411;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Lclient!dc;")
	public static Class28 method921() {
		try {
			return (Class28) Class.forName("Class28_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method922() {
		for (@Pc(1) int local1 = -1; local1 < Static329.anInt6733 + Static49.anInt1559; local1++) {
			@Pc(6) Class7_Sub1_Sub1 local6;
			if (local1 < 0) {
				local6 = Static264.aClass7_Sub1_Sub1_Sub2_2;
			} else if (local1 < Static329.anInt6733) {
				local6 = Static168.aClass7_Sub1_Sub1_Sub2Array1[Static238.anIntArray389[local1]];
			} else {
				local6 = Static84.aClass7_Sub1_Sub1_Sub1Array1[Static185.anIntArray309[local1 - Static329.anInt6733]];
			}
			if (local6.anInt7069 >= 0) {
				@Pc(32) int local32 = local6.method5973();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt7027 & 0x7F) != 0 || (local6.anInt7032 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt7027 & 0x7F) != 64 || (local6.anInt7032 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt7027 >> 7;
					local73 = local6.anInt7032 >> 7;
					if (local6.anInt7069 > Static346.anIntArrayArray56[local68][local73]) {
						Static346.anIntArrayArray56[local68][local73] = local6.anInt7069;
						Static243.anIntArrayArray35[local68][local73] = 1;
					} else if (local6.anInt7069 == Static346.anIntArrayArray56[local68][local73]) {
						local109 = Static243.anIntArrayArray35[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt7027 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt7032 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt7027 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt7032 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt7069 > Static346.anIntArrayArray56[local151][local154]) {
								Static346.anIntArrayArray56[local151][local154] = local6.anInt7069;
								Static243.anIntArrayArray35[local151][local154] = 1;
							} else if (local6.anInt7069 == Static346.anIntArrayArray56[local151][local154]) {
								local109 = Static243.anIntArrayArray35[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!qj;)V")
	public static void method925(@OriginalArg(1) Class162 arg0) {
		Static156.aClass162_132 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method926() {
		Static4.aClass183_1.method5051();
		Static10.aClass183_2.method5051();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;)Ljava/lang/String;")
	public static String method928(@OriginalArg(1) Class1_Sub22 arg0) {
		return arg0.aString159 == null || arg0.aString159.length() <= 0 ? arg0.aString158 : arg0.aString158 + Static319.aString252 + arg0.aString159;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method929() {
		@Pc(7) int local7 = Static129.aBoolean232 ? Static329.anInt6733 : Static329.anInt6733 + Static49.anInt1559;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class7_Sub1_Sub1 local14;
			if (local9 < 0) {
				local14 = Static264.aClass7_Sub1_Sub1_Sub2_2;
			} else if (local9 < Static329.anInt6733) {
				local14 = Static168.aClass7_Sub1_Sub1_Sub2Array1[Static238.anIntArray389[local9]];
			} else {
				local14 = Static84.aClass7_Sub1_Sub1_Sub1Array1[Static185.anIntArray309[local9 - Static329.anInt6733]];
			}
			local14.anInt7061 = 0;
			if (local14.anInt7069 < 0) {
				local14.aBoolean507 = false;
			} else {
				@Pc(47) int local47 = local14.method5973();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt7027 & 0x7F) != 0 || (local14.anInt7032 & 0x7F) != 0) {
						local14.aBoolean507 = false;
						continue;
					}
				} else if ((local14.anInt7027 & 0x7F) != 64 || (local14.anInt7032 & 0x7F) != 64) {
					local14.aBoolean507 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt7027 >> 7;
					local94 = local14.anInt7032 >> 7;
					if (local14.anInt7069 != Static346.anIntArrayArray56[local89][local94]) {
						local14.aBoolean507 = true;
						continue;
					}
					if (Static243.anIntArrayArray35[local89][local94] > 1) {
						local119 = Static243.anIntArrayArray35[local89][local94]--;
						local14.aBoolean507 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt7027 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt7032 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt7027 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt7032 + local89 >> 7;
					if (!Static197.method3896(local155, local14.anInt7069, local94, local148, local162)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt7069 == Static346.anIntArrayArray56[local173][local176]) {
									local119 = Static243.anIntArrayArray35[local173][local176]--;
								}
							}
						}
						local14.aBoolean507 = true;
						continue;
					}
				}
				if (local14 instanceof Class7_Sub1_Sub1_Sub2 && local14.anInterface6_3 != null && Static197.anInt4521 >= local14.anInt7108 && Static197.anInt4521 < local14.anInt7112) {
					((Class7_Sub1_Sub1_Sub2) local14).aBoolean511 = false;
				}
				local14.aBoolean507 = false;
				local14.anInt7031 = Static309.method5429(local14.anInt7032, local14.anInt7027, Static39.anInt1215);
				Static195.method3856(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ro;)Lclient!um;")
	public static Class1_Sub39 method930(@OriginalArg(0) Class177 arg0) {
		@Pc(13) Class1_Sub39 local13 = (Class1_Sub39) Static273.aClass183_30.method5053(((long) arg0.anInt5828 << 32) + (long) arg0.anInt5776);
		return local13 == null ? arg0.aClass1_Sub39_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method931() {
		@Pc(14) boolean local14 = Static271.anInt5700 == 1 && Static329.anInt6733 > 200 || Static271.anInt5700 == 0 && Static329.anInt6733 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static329.anInt6733; local16++) {
			@Pc(23) Class7_Sub1_Sub1_Sub2 local23 = Static168.aClass7_Sub1_Sub1_Sub2Array1[Static238.anIntArray389[local16]];
			if (local23.method5989()) {
				local23.method5963();
				if (local23.aShort93 >= 0 && local23.aShort91 >= 0 && local23.aShort92 < Static25.anInt850 && local23.aShort90 < Static219.anInt4987) {
					local23.aBoolean511 = local23.aBoolean506 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean507) {
						local62++;
					}
					if (local23.anInt7068 > Static197.anInt4521) {
						local62 += 2;
					}
					local62 += 5 - local23.method5973() << 2;
					if (Static73.anInt2038 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt7069 = local62 + 1;
				} else {
					local23.anInt7069 = -1;
				}
			} else {
				local23.anInt7069 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static49.anInt1559; local98++) {
			@Pc(105) Class7_Sub1_Sub1_Sub1 local105 = Static84.aClass7_Sub1_Sub1_Sub1Array1[Static185.anIntArray309[local98]];
			if (local105.method331() && local105.aClass75_1.method2057()) {
				local105.method5963();
				if (local105.aShort93 >= 0 && local105.aShort91 >= 0 && local105.aShort92 < Static25.anInt850 && local105.aShort90 < Static219.anInt4987) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean507) {
						local141++;
					}
					if (local105.anInt7068 > Static197.anInt4521) {
						local141 += 2;
					}
					local141 += 5 - local105.method5973() << 2;
					if (Static73.anInt2038 == 0) {
						if (local105.aClass75_1.aBoolean165) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static73.anInt2038 == 1) {
						if (local105.aClass75_1.aBoolean165) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass75_1.aBoolean169) {
						local141 += 512;
					} else if (!local105.aClass75_1.aBoolean167) {
						local141 += 256;
					}
					local105.anInt7069 = local141 + 1;
				} else {
					local105.anInt7069 = -1;
				}
			} else {
				local105.anInt7069 = -1;
			}
		}
		for (local62 = 0; local62 < Static36.aClass98Array1.length; local62++) {
			@Pc(207) Class98 local207 = Static36.aClass98Array1[local62];
			if (local207 != null) {
				if (local207.anInt3425 == 1) {
					@Pc(218) Class7_Sub1_Sub1_Sub1 local218 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local207.anInt3417];
					if (local218 != null && local218.anInt7069 >= 0) {
						local218.anInt7069 += 1024;
					}
				} else if (local207.anInt3425 == 10) {
					@Pc(239) Class7_Sub1_Sub1_Sub2 local239 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local207.anInt3417];
					if (local239 != null && local239.anInt7069 >= 0) {
						local239.anInt7069 += 1024;
					}
				}
			}
		}
		Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7069 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Object;ILclient!ud;)V")
	public static void method932(@OriginalArg(0) Object arg0, @OriginalArg(2) Class199 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static295.method5212(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method933() {
		Static263.anInt5598 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static49.anInt1559; local3++) {
			@Pc(10) Class7_Sub1_Sub1_Sub1 local10 = Static84.aClass7_Sub1_Sub1_Sub1Array1[Static185.anIntArray309[local3]];
			if (local10.aBoolean507 && local10.method5984() != -1) {
				@Pc(28) int local28 = (local10.method5973() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt7027 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt7032 - local28 >> 7;
				@Pc(48) Class7_Sub1_Sub1 local48 = Static79.method3957(local35, Static39.anInt1215, local42);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt7070;
					if (local48 instanceof Class7_Sub1_Sub1_Sub1) {
						local53 += 2048;
					}
					if (local48.anInt7061 == 0 && local48.method5984() != -1) {
						Static250.anIntArray400[Static263.anInt5598] = local53;
						Static36.anIntArray76[Static263.anInt5598] = local53;
						Static263.anInt5598++;
						local48.anInt7061++;
					}
					Static250.anIntArray400[Static263.anInt5598] = local53;
					Static36.anIntArray76[Static263.anInt5598] = local10.anInt7070 + 2048;
					Static263.anInt5598++;
					local48.anInt7061++;
				}
			}
		}
		Static342.method6039(0, Static250.anIntArray400, Static36.anIntArray76, Static263.anInt5598 - 1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ro;IIIIIIIII)V")
	public static void method934(@OriginalArg(0) Class177[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class177 local6 = arg0[local1];
			if (local6 != null && local6.anInt5829 == arg1) {
				@Pc(17) int local17 = local6.anInt5820 + arg6;
				@Pc(22) int local22 = local6.anInt5772 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt5838 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt5803;
					@Pc(45) int local45 = local22 + local6.anInt5816;
					if (local6.anInt5838 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (!local6.aBoolean404 || local6.anInt5838 == 0 || local6.aBoolean403 || method930(local6).anInt6604 != 0 || local6 == Static337.aClass177_21 || local6.anInt5819 == 1338) {
					if (!local6.aBoolean404 || !method918(local6)) {
						if (local6 == Static158.aClass177_11) {
							Static43.aBoolean94 = true;
							Static227.anInt5079 = local17;
							Static183.anInt4314 = local22;
						}
						if (!local6.aBoolean404 || local6.aBoolean410 || local28 < local32 && local30 < local34) {
							if (local6.anInt5838 == 0) {
								if (!local6.aBoolean404 && method918(local6) && Static312.aClass177_19 != local6) {
									continue;
								}
								if (local6.aBoolean415 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
									for (@Pc(175) Class1_Sub15 local175 = (Class1_Sub15) Static138.aClass130_20.method3749(); local175 != null; local175 = (Class1_Sub15) Static138.aClass130_20.method3756()) {
										if (local175.aBoolean204) {
											local175.method6172();
											local175.aClass177_9.aBoolean412 = false;
										}
									}
									if (Static13.anInt6489 == 0) {
										Static158.aClass177_11 = null;
										Static337.aClass177_21 = null;
									}
									Static161.anInt3962 = 0;
									Static114.aBoolean452 = false;
									Static18.aBoolean45 = false;
									if (!Static204.aBoolean329) {
										Static339.method6154();
									}
								}
							}
							@Pc(223) boolean local223;
							if (Static229.anInt5102 >= local28 && Static85.anInt2268 >= local30 && Static229.anInt5102 < local32 && Static85.anInt2268 < local34) {
								local223 = true;
							} else {
								local223 = false;
							}
							if (!Static204.aBoolean329 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static170.method3499(arg9 - local22, arg8 - local17, local6);
							}
							if (local6.aBoolean404) {
								@Pc(254) boolean local254 = false;
								if (Static237.anInt5288 == 1 && local223) {
									local254 = true;
								}
								@Pc(263) boolean local263 = false;
								if (Static195.anInt4494 == 1 && Static324.anInt6648 >= local28 && Static121.anInt3045 >= local30 && Static324.anInt6648 < local32 && Static121.anInt3045 < local34) {
									local263 = true;
								}
								@Pc(285) int local285;
								@Pc(374) int local374;
								if (local6.aByteArray72 != null) {
									for (local285 = 0; local285 < local6.aByteArray72.length; local285++) {
										if (Static345.aBooleanArray30[local6.aByteArray72[local285]]) {
											if (local6.anIntArray436 == null || Static197.anInt4521 >= local6.anIntArray436[local285]) {
												@Pc(316) byte local316 = local6.aByteArray73[local285];
												if (local316 == 0 || ((local316 & 0x8) == 0 || !Static345.aBooleanArray30[86] && !Static345.aBooleanArray30[82] && !Static345.aBooleanArray30[81]) && ((local316 & 0x2) == 0 || Static345.aBooleanArray30[86]) && ((local316 & 0x1) == 0 || Static345.aBooleanArray30[82]) && ((local316 & 0x4) == 0 || Static345.aBooleanArray30[81])) {
													Static8.method230("", local6.anInt5828, local285 + 1, -1);
													local374 = local6.anIntArray443[local285];
													if (local6.anIntArray436 == null) {
														local6.anIntArray436 = new int[local6.aByteArray72.length];
													}
													if (local374 == 0) {
														local6.anIntArray436[local285] = Integer.MAX_VALUE;
													} else {
														local6.anIntArray436[local285] = Static197.anInt4521 + local374;
													}
												}
											}
										} else if (local6.anIntArray436 != null) {
											local6.anIntArray436[local285] = 0;
										}
									}
								}
								if (local263) {
									Static91.method2001(local6, Static324.anInt6648 - local17, Static121.anInt3045 - local22);
								}
								if (Static158.aClass177_11 != null && Static158.aClass177_11 != local6 && local223 && method930(local6).method5617()) {
									Static43.aClass177_2 = local6;
								}
								if (local6 == Static337.aClass177_21) {
									Static12.aBoolean37 = true;
									Static285.anInt6033 = local17;
									Static24.anInt802 = local22;
								}
								if (local6.aBoolean403 || local6.anInt5819 != 0) {
									@Pc(455) Class1_Sub15 local455;
									if (local223 && Static91.anInt2408 != 0 && local6.anObjectArray16 != null) {
										local455 = new Class1_Sub15();
										local455.aBoolean204 = true;
										local455.aClass177_9 = local6;
										local455.anInt3117 = Static91.anInt2408;
										local455.anObjectArray4 = local6.anObjectArray16;
										Static138.aClass130_20.method3760(local455);
									}
									if (Static158.aClass177_11 != null || Static204.aClass177_13 != null || Static204.aBoolean329 || local6.anInt5819 != 1400 && Static161.anInt3962 > 0) {
										local263 = false;
										local254 = false;
										local223 = false;
									}
									@Pc(612) int local612;
									if (local6.anInt5819 != 0) {
										if (local6.anInt5819 == 1337 || local6.anInt5819 == 1403) {
											Static206.aClass177_14 = local6;
											if (Static156.aClass210_1 != null) {
												Static156.aClass210_1.method5659(local6.anInt5816, Static221.aClass40_6);
											}
											if (local6.anInt5819 == 1337) {
												if (!Static204.aBoolean329 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
													Static60.method5086(Static221.aClass40_6, arg9, arg8);
													for (@Pc(540) Class2_Sub5 local540 = (Class2_Sub5) Static19.aClass58_1.method1672(); local540 != null; local540 = (Class2_Sub5) Static19.aClass58_1.method1675()) {
														if (arg8 >= local540.anInt4799 && arg8 < local540.anInt4797 && arg9 >= local540.anInt4796 && arg9 < local540.anInt4794) {
															Static339.method6154();
															Static96.method2037(local540.aClass7_Sub1_Sub1_1);
														}
													}
												}
												Static93.method2011(local17, local6, local22);
												continue;
											}
										}
										@Pc(651) int local651;
										if (local6.anInt5819 == 1338) {
											if (local6.method4905(Static221.aClass40_6) == null || Static286.anInt6044 != 0 && Static286.anInt6044 != 3 || Static204.aBoolean329 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
												continue;
											}
											local285 = arg8 - local17;
											local612 = arg9 - local22;
											local374 = local6.anIntArray446[local612];
											if (local285 < local374 || local285 > local374 + local6.anIntArray431[local612]) {
												continue;
											}
											local285 -= local6.anInt5803 / 2;
											local612 -= local6.anInt5816 / 2;
											if (Static303.anInt6342 == 4) {
												local651 = (int) Static188.aFloat17 & 0x3FFF;
											} else {
												local651 = (int) Static188.aFloat17 + Static238.anInt5295 & 0x3FFF;
											}
											@Pc(663) int local663 = Class39.anIntArray88[local651];
											@Pc(667) int local667 = Class39.anIntArray87[local651];
											if (Static303.anInt6342 != 4) {
												local663 = local663 * (Static312.anInt6009 + 256) >> 8;
												local667 = local667 * (Static312.anInt6009 + 256) >> 8;
											}
											@Pc(696) int local696 = local612 * local663 + local285 * local667 >> 15;
											@Pc(706) int local706 = local612 * local667 - local285 * local663 >> 15;
											@Pc(717) int local717;
											@Pc(725) int local725;
											if (Static303.anInt6342 == 4) {
												local717 = (Static327.anInt6692 >> 7) + (local696 >> 2);
												local725 = (Static72.anInt1985 >> 7) - (local706 >> 2);
											} else {
												@Pc(734) int local734 = (Static264.aClass7_Sub1_Sub1_Sub2_2.method5973() - 1) * 64;
												local717 = (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 - local734 >> 7) + (local696 >> 2);
												local725 = (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 - local734 >> 7) - (local706 >> 2);
											}
											if (Static246.aBoolean472 && (Static302.anInt6307 & 0x40) != 0) {
												@Pc(767) Class177 local767 = Static183.method3720(Static156.anInt3876, Static139.anInt3442);
												if (local767 == null) {
													Static95.method2033();
												} else {
													Static286.method5110(Static355.anInt4215, 1L, Static49.aString57, local717, " ->", local725, 50);
												}
												continue;
											}
											if (Static199.anInt4559 == 1) {
												Static286.method5110(-1, 1L, Static229.aString179, local717, "", local725, 17);
											}
											Static286.method5110(-1, 1L, Static228.aString178, local717, "", local725, 57);
											continue;
										}
										if (local6.anInt5819 == 1400) {
											Static244.aClass177_6 = local6;
											if (local223) {
												Static114.aBoolean452 = true;
											}
											if (local263) {
												local285 = (int) ((double) (Static324.anInt6648 - local17 - local6.anInt5803 / 2) * 2.0D / (double) Static201.aFloat54);
												local612 = (int) -((double) (Static121.anInt3045 - local22 - local6.anInt5816 / 2) * 2.0D / (double) Static201.aFloat54);
												local374 = Static286.anInt6050 + local285 + Static201.anInt4281;
												local651 = Static311.anInt5198 + local612 + Static201.anInt4283;
												@Pc(864) Class1_Sub1_Sub3 local864 = Static183.method3711();
												if (local864 == null) {
													continue;
												}
												@Pc(869) int[] local869 = new int[3];
												local864.method418(local374, local869, local651);
												if (local869 != null) {
													if (Static345.aBooleanArray30[82] && Static87.anInt2332 > 0) {
														Static53.method1383(local869[0], local869[2], local869[1]);
														continue;
													}
													Static18.aBoolean45 = true;
													Static101.anInt2511 = local869[0];
													Static222.anInt5036 = local869[1];
													Static79.anInt4575 = local869[2];
												}
												Static161.anInt3962 = 1;
												Static183.aBoolean304 = false;
												Static309.anInt6462 = Static229.anInt5102;
												Static60.anInt6015 = Static85.anInt2268;
												continue;
											}
											if (local254 && Static161.anInt3962 > 0) {
												if (Static161.anInt3962 == 1 && (Static309.anInt6462 != Static229.anInt5102 || Static60.anInt6015 != Static85.anInt2268)) {
													Static76.anInt2085 = Static286.anInt6050;
													Static250.anInt5420 = Static311.anInt5198;
													Static161.anInt3962 = 2;
												}
												if (Static161.anInt3962 == 2) {
													Static183.aBoolean304 = true;
													Static219.method4287(Static76.anInt2085 + (int) ((double) (Static309.anInt6462 - Static229.anInt5102) * 2.0D / (double) Static201.aFloat53));
													Static105.method2186(Static250.anInt5420 - (int) ((double) (Static60.anInt6015 - Static85.anInt2268) * 2.0D / (double) Static201.aFloat53));
												}
												continue;
											}
											if (Static161.anInt3962 > 0 && !Static183.aBoolean304) {
												if ((Static255.anInt5508 == 1 || Static353.method6159()) && Static237.anInt5285 > 2) {
													Static260.method4750(2);
												} else if (Static156.method3334()) {
													Static260.method4750(1);
												}
											}
											Static161.anInt3962 = 0;
											continue;
										}
										if (local6.anInt5819 == 1401) {
											if (local254) {
												Static109.method2265(local6.anInt5803, local6.anInt5816, Static229.anInt5102 - local17, Static85.anInt2268 - local22);
											}
											continue;
										}
										if (local6.anInt5819 == 1402) {
											Static145.method3188(local6);
											continue;
										}
										if (local6.anInt5819 == 1406) {
											Static346.method6109(local6, local17, local22);
											continue;
										}
									}
									if (!local6.aBoolean408 && local263) {
										local6.aBoolean408 = true;
										if (local6.anObjectArray8 != null) {
											local455 = new Class1_Sub15();
											local455.aBoolean204 = true;
											local455.aClass177_9 = local6;
											local455.anInt3114 = Static324.anInt6648 - local17;
											local455.anInt3117 = Static121.anInt3045 - local22;
											local455.anObjectArray4 = local6.anObjectArray8;
											Static138.aClass130_20.method3760(local455);
										}
									}
									if (local6.aBoolean408 && local254 && local6.anObjectArray10 != null) {
										local455 = new Class1_Sub15();
										local455.aBoolean204 = true;
										local455.aClass177_9 = local6;
										local455.anInt3114 = Static229.anInt5102 - local17;
										local455.anInt3117 = Static85.anInt2268 - local22;
										local455.anObjectArray4 = local6.anObjectArray10;
										Static138.aClass130_20.method3760(local455);
									}
									if (local6.aBoolean408 && !local254) {
										local6.aBoolean408 = false;
										if (local6.anObjectArray11 != null) {
											local455 = new Class1_Sub15();
											local455.aBoolean204 = true;
											local455.aClass177_9 = local6;
											local455.anInt3114 = Static229.anInt5102 - local17;
											local455.anInt3117 = Static85.anInt2268 - local22;
											local455.anObjectArray4 = local6.anObjectArray11;
											Static208.aClass130_31.method3760(local455);
										}
									}
									if (local254 && local6.anObjectArray20 != null) {
										local455 = new Class1_Sub15();
										local455.aBoolean204 = true;
										local455.aClass177_9 = local6;
										local455.anInt3114 = Static229.anInt5102 - local17;
										local455.anInt3117 = Static85.anInt2268 - local22;
										local455.anObjectArray4 = local6.anObjectArray20;
										Static138.aClass130_20.method3760(local455);
									}
									if (!local6.aBoolean412 && local223) {
										local6.aBoolean412 = true;
										if (local6.anObjectArray31 != null) {
											local455 = new Class1_Sub15();
											local455.aBoolean204 = true;
											local455.aClass177_9 = local6;
											local455.anInt3114 = Static229.anInt5102 - local17;
											local455.anInt3117 = Static85.anInt2268 - local22;
											local455.anObjectArray4 = local6.anObjectArray31;
											Static138.aClass130_20.method3760(local455);
										}
									}
									if (local6.aBoolean412 && local223 && local6.anObjectArray28 != null) {
										local455 = new Class1_Sub15();
										local455.aBoolean204 = true;
										local455.aClass177_9 = local6;
										local455.anInt3114 = Static229.anInt5102 - local17;
										local455.anInt3117 = Static85.anInt2268 - local22;
										local455.anObjectArray4 = local6.anObjectArray28;
										Static138.aClass130_20.method3760(local455);
									}
									if (local6.aBoolean412 && !local223) {
										local6.aBoolean412 = false;
										if (local6.anObjectArray22 != null) {
											local455 = new Class1_Sub15();
											local455.aBoolean204 = true;
											local455.aClass177_9 = local6;
											local455.anInt3114 = Static229.anInt5102 - local17;
											local455.anInt3117 = Static85.anInt2268 - local22;
											local455.anObjectArray4 = local6.anObjectArray22;
											Static208.aClass130_31.method3760(local455);
										}
									}
									if (local6.anObjectArray9 != null) {
										local455 = new Class1_Sub15();
										local455.aClass177_9 = local6;
										local455.anObjectArray4 = local6.anObjectArray9;
										Static273.aClass130_36.method3760(local455);
									}
									@Pc(1369) Class1_Sub15 local1369;
									if (local6.anObjectArray7 != null && Static302.anInt6306 > local6.anInt5815) {
										if (local6.anIntArray438 == null || Static302.anInt6306 - local6.anInt5815 > 32) {
											local455 = new Class1_Sub15();
											local455.aClass177_9 = local6;
											local455.anObjectArray4 = local6.anObjectArray7;
											Static138.aClass130_20.method3760(local455);
										} else {
											label696: for (local285 = local6.anInt5815; local285 < Static302.anInt6306; local285++) {
												local612 = Static60.anIntArray456[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray438.length; local374++) {
													if (local6.anIntArray438[local374] == local612) {
														local1369 = new Class1_Sub15();
														local1369.aClass177_9 = local6;
														local1369.anObjectArray4 = local6.anObjectArray7;
														Static138.aClass130_20.method3760(local1369);
														break label696;
													}
												}
											}
										}
										local6.anInt5815 = Static302.anInt6306;
									}
									if (local6.anObjectArray6 != null && Static204.anInt4726 > local6.anInt5767) {
										if (local6.anIntArray430 == null || Static204.anInt4726 - local6.anInt5767 > 32) {
											local455 = new Class1_Sub15();
											local455.aClass177_9 = local6;
											local455.anObjectArray4 = local6.anObjectArray6;
											Static138.aClass130_20.method3760(local455);
										} else {
											label676: for (local285 = local6.anInt5767; local285 < Static204.anInt4726; local285++) {
												local612 = Static125.anIntArray234[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray430.length; local374++) {
													if (local6.anIntArray430[local374] == local612) {
														local1369 = new Class1_Sub15();
														local1369.aClass177_9 = local6;
														local1369.anObjectArray4 = local6.anObjectArray6;
														Static138.aClass130_20.method3760(local1369);
														break label676;
													}
												}
											}
										}
										local6.anInt5767 = Static204.anInt4726;
									}
									if (local6.anObjectArray27 != null && Static340.anInt7188 > local6.anInt5794) {
										if (local6.anIntArray444 == null || Static340.anInt7188 - local6.anInt5794 > 32) {
											local455 = new Class1_Sub15();
											local455.aClass177_9 = local6;
											local455.anObjectArray4 = local6.anObjectArray27;
											Static138.aClass130_20.method3760(local455);
										} else {
											label656: for (local285 = local6.anInt5794; local285 < Static340.anInt7188; local285++) {
												local612 = Static253.anIntArray401[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray444.length; local374++) {
													if (local6.anIntArray444[local374] == local612) {
														local1369 = new Class1_Sub15();
														local1369.aClass177_9 = local6;
														local1369.anObjectArray4 = local6.anObjectArray27;
														Static138.aClass130_20.method3760(local1369);
														break label656;
													}
												}
											}
										}
										local6.anInt5794 = Static340.anInt7188;
									}
									if (local6.anObjectArray30 != null && Static354.anInt7379 > local6.anInt5798) {
										if (local6.anIntArray445 == null || Static354.anInt7379 - local6.anInt5798 > 32) {
											local455 = new Class1_Sub15();
											local455.aClass177_9 = local6;
											local455.anObjectArray4 = local6.anObjectArray30;
											Static138.aClass130_20.method3760(local455);
										} else {
											label636: for (local285 = local6.anInt5798; local285 < Static354.anInt7379; local285++) {
												local612 = Static298.anIntArray480[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray445.length; local374++) {
													if (local6.anIntArray445[local374] == local612) {
														local1369 = new Class1_Sub15();
														local1369.aClass177_9 = local6;
														local1369.anObjectArray4 = local6.anObjectArray30;
														Static138.aClass130_20.method3760(local1369);
														break label636;
													}
												}
											}
										}
										local6.anInt5798 = Static354.anInt7379;
									}
									if (local6.anObjectArray25 != null && Static11.anInt7274 > local6.anInt5774) {
										if (local6.anIntArray435 == null || Static11.anInt7274 - local6.anInt5774 > 32) {
											local455 = new Class1_Sub15();
											local455.aClass177_9 = local6;
											local455.anObjectArray4 = local6.anObjectArray25;
											Static138.aClass130_20.method3760(local455);
										} else {
											label616: for (local285 = local6.anInt5774; local285 < Static11.anInt7274; local285++) {
												local612 = Static335.anIntArray569[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray435.length; local374++) {
													if (local6.anIntArray435[local374] == local612) {
														local1369 = new Class1_Sub15();
														local1369.aClass177_9 = local6;
														local1369.anObjectArray4 = local6.anObjectArray25;
														Static138.aClass130_20.method3760(local1369);
														break label616;
													}
												}
											}
										}
										local6.anInt5774 = Static11.anInt7274;
									}
									if (Static148.anInt3660 > local6.anInt5781 && local6.anObjectArray14 != null) {
										local455 = new Class1_Sub15();
										local455.aClass177_9 = local6;
										local455.anObjectArray4 = local6.anObjectArray14;
										Static138.aClass130_20.method3760(local455);
									}
									if (Static305.anInt6396 > local6.anInt5781 && local6.anObjectArray32 != null) {
										local455 = new Class1_Sub15();
										local455.aClass177_9 = local6;
										local455.anObjectArray4 = local6.anObjectArray32;
										Static138.aClass130_20.method3760(local455);
									}
									if (Static199.anInt4555 > local6.anInt5781 && local6.anObjectArray35 != null) {
										local455 = new Class1_Sub15();
										local455.aClass177_9 = local6;
										local455.anObjectArray4 = local6.anObjectArray35;
										Static138.aClass130_20.method3760(local455);
									}
									if (Static353.anInt7361 > local6.anInt5781 && local6.anObjectArray21 != null) {
										local455 = new Class1_Sub15();
										local455.aClass177_9 = local6;
										local455.anObjectArray4 = local6.anObjectArray21;
										Static138.aClass130_20.method3760(local455);
									}
									if (Static345.anInt7277 > local6.anInt5781 && local6.anObjectArray13 != null) {
										local455 = new Class1_Sub15();
										local455.aClass177_9 = local6;
										local455.anObjectArray4 = local6.anObjectArray13;
										Static138.aClass130_20.method3760(local455);
									}
									local6.anInt5781 = Class7_Sub5.anInt3948;
									if (local6.anObjectArray29 != null) {
										for (local285 = 0; local285 < Static30.anInt3904; local285++) {
											@Pc(1837) Class1_Sub15 local1837 = new Class1_Sub15();
											local1837.aClass177_9 = local6;
											local1837.anInt3122 = Static64.anIntArray117[local285];
											local1837.anInt3115 = Static93.anIntArray151[local285];
											local1837.anObjectArray4 = local6.anObjectArray29;
											Static138.aClass130_20.method3760(local1837);
										}
									}
									if (Static287.aBoolean422 && local6.anObjectArray15 != null) {
										local455 = new Class1_Sub15();
										local455.aClass177_9 = local6;
										local455.anObjectArray4 = local6.anObjectArray15;
										Static138.aClass130_20.method3760(local455);
									}
								}
								if (local6.anInt5838 == 5 && local6.anInt5827 != -1) {
									local6.method4910().method5659(local6.anInt5816, Static221.aClass40_6);
								}
							}
							if (!local6.aBoolean404 && Static158.aClass177_11 == null && Static204.aClass177_13 == null && !Static204.aBoolean329) {
								if ((local6.anInt5824 >= 0 || local6.anInt5826 != 0) && Static229.anInt5102 >= local28 && Static85.anInt2268 >= local30 && Static229.anInt5102 < local32 && Static85.anInt2268 < local34) {
									if (local6.anInt5824 >= 0) {
										Static312.aClass177_19 = arg0[local6.anInt5824];
									} else {
										Static312.aClass177_19 = local6;
									}
								}
								if (local6.anInt5838 == 8 && Static229.anInt5102 >= local28 && Static85.anInt2268 >= local30 && Static229.anInt5102 < local32 && Static85.anInt2268 < local34) {
									Static19.aClass177_1 = local6;
								}
								if (local6.anInt5842 > local6.anInt5816) {
									Static93.method2009(local22, Static229.anInt5102, local6, local6.anInt5816, local17 + local6.anInt5803, local6.anInt5842, Static85.anInt2268);
								}
							}
							Static189.method3783(arg2, local17, arg5, arg4, local22, arg3, local6);
							if (local6.anInt5838 == 0) {
								method934(arg0, local6.anInt5828, local28, local30, local32, local34, local17 - local6.anInt5811, local22 - local6.anInt5806, arg8, arg9);
								if (local6.aClass177Array8 != null) {
									method934(local6.aClass177Array8, local6.anInt5828, local28, local30, local32, local34, local17 - local6.anInt5811, local22 - local6.anInt5806, arg8, arg9);
								}
								@Pc(2034) Class1_Sub35 local2034 = (Class1_Sub35) Static135.aClass183_33.method5053((long) local6.anInt5828);
								if (local2034 != null) {
									if (local2034.anInt6078 == 0 && !Static204.aBoolean329 && local223 && !Static278.aBoolean279) {
										Static339.method6154();
									}
									Static228.method4358(local30, local22, local28, local17, local34, arg9, local32, arg8, local2034.anInt6079);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static189.method3783(arg2, local17, arg5, arg4, local22, arg3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method935() {
		@Pc(7) int local7 = Static129.aBoolean232 ? Static329.anInt6733 : Static329.anInt6733 + Static49.anInt1559;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class7_Sub1_Sub1 local14;
			if (local9 < 0) {
				local14 = Static264.aClass7_Sub1_Sub1_Sub2_2;
			} else if (local9 < Static329.anInt6733) {
				local14 = Static168.aClass7_Sub1_Sub1_Sub2Array1[Static238.anIntArray389[local9]];
			} else {
				local14 = Static84.aClass7_Sub1_Sub1_Sub1Array1[Static185.anIntArray309[local9 - Static329.anInt6733]];
			}
			if (local14.anInt7069 >= 0) {
				@Pc(40) int local40 = local14.method5973();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt7027 & 0x7F) == 0 && (local14.anInt7032 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt7027 & 0x7F) == 64 && (local14.anInt7032 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class7_Sub1_Sub1_Sub2 && local14.anInterface6_3 != null && Static197.anInt4521 >= local14.anInt7108 && Static197.anInt4521 < local14.anInt7112) {
					((Class7_Sub1_Sub1_Sub2) local14).aBoolean511 = false;
				}
				local14.anInt7031 = Static309.method5429(local14.anInt7032, local14.anInt7027, Static39.anInt1215);
				Static195.method3856(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method936() {
		for (@Pc(1) int local1 = 0; local1 < Static25.anInt850; local1++) {
			@Pc(6) int[] local6 = Static346.anIntArrayArray56[local1];
			for (@Pc(8) int local8 = 0; local8 < Static219.anInt4987; local8++) {
				local6[local8] = 0;
			}
		}
	}
}
