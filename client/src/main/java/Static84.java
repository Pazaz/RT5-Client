import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	public static int anInt1775;

	// $FF: synthetic field
	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Ljava/lang/Class;")
	public static Class aClass5;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!pc;")
	public static final Class287 aClass287_6 = new Class287(11, 8);

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_36 = new Class225(28, 4);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1652() {
		@Pc(1) int local1 = Static338.anInt5564;
		@Pc(3) int[] local3 = Static210.anIntArray280;
		@Pc(9) int local9;
		if (Static1.anInt10798 == 3) {
			local9 = Static219.aClass236Array1.length;
		} else {
			local9 = Static353.aBoolean734 ? local1 : local1 + Static390.anInt6126;
		}
		for (@Pc(21) int local21 = 0; local21 < local9; local21++) {
			@Pc(36) Class8_Sub2_Sub1_Sub2 local36;
			if (Static1.anInt10798 == 3) {
				@Pc(29) Class236 local29 = Static219.aClass236Array1[local21];
				if (!local29.aBoolean455) {
					continue;
				}
				local36 = local29.method5363();
			} else {
				if (local21 < local1) {
					local36 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local3[local21]];
				} else {
					local36 = ((Class2_Sub45) Static18.aClass28_2.method738((long) Static103.anIntArray187[local21 - local1])).aClass8_Sub2_Sub1_Sub2_Sub2_2;
				}
				if (local36.anInt10739 < 0) {
					continue;
				}
			}
			@Pc(68) int local68 = local36.method9302((byte) 81);
			if ((local68 & 0x1) == 0) {
				if ((local36.anInt10690 & 0x1FF) == 0 && (local36.anInt10694 & 0x1FF) == 0) {
					continue;
				}
			} else if ((local36.anInt10690 & 0x1FF) == 256 && (local36.anInt10694 & 0x1FF) == 256) {
				continue;
			}
			local36.anInt10691 = Static102.method2025(local36.aByte144, -29754, local36.anInt10694, local36.anInt10690);
			Static102.method2026(local36, true);
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	public static void method1654(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static338.anInt5564;
		@Pc(3) int[] local3 = Static210.anIntArray280;
		@Pc(9) int local9;
		if (Static1.anInt10798 == 3) {
			local9 = Static219.aClass236Array1.length;
		} else {
			local9 = Static353.aBoolean734 ? local1 : local1 + Static390.anInt6126;
		}
		for (@Pc(21) int local21 = 0; local21 < local9; local21++) {
			@Pc(36) Class8_Sub2_Sub1_Sub2 local36;
			if (Static1.anInt10798 == 3) {
				@Pc(29) Class236 local29 = Static219.aClass236Array1[local21];
				if (!local29.aBoolean455) {
					continue;
				}
				local36 = local29.method5363();
			} else {
				if (local21 < local1) {
					local36 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local3[local21]];
				} else {
					local36 = ((Class2_Sub45) Static18.aClass28_2.method738((long) Static103.anIntArray187[local21 - local1])).aClass8_Sub2_Sub1_Sub2_Sub2_2;
				}
				if (local36.aByte144 != arg0) {
					continue;
				}
				if (local36.anInt10739 < 0) {
					local36.aBoolean816 = false;
					continue;
				}
			}
			local36.anInt10735 = 0;
			@Pc(80) int local80 = local36.method9302((byte) 121);
			if ((local80 & 0x1) == 0) {
				if ((local36.anInt10690 & 0x1FF) != 0 || (local36.anInt10694 & 0x1FF) != 0) {
					local36.aBoolean816 = false;
					continue;
				}
			} else if ((local36.anInt10690 & 0x1FF) != 256 || (local36.anInt10694 & 0x1FF) != 256) {
				local36.aBoolean816 = false;
				continue;
			}
			if (Static1.anInt10798 != 3) {
				@Pc(135) int local135;
				@Pc(140) int local140;
				@Pc(166) int local166;
				if (local80 == 1) {
					local135 = local36.anInt10690 >> 9;
					local140 = local36.anInt10694 >> 9;
					if (local36.anInt10739 != Static341.anIntArrayArray133[local135][local140]) {
						local36.aBoolean816 = true;
						continue;
					}
					if (Static148.anIntArrayArray64[local135][local140] > 1) {
						local166 = Static148.anIntArrayArray64[local135][local140]--;
						local36.aBoolean816 = true;
						continue;
					}
				} else {
					local135 = (local80 - 1) * 256 + 252;
					local140 = local36.anInt10690 - local135 >> 9;
					@Pc(196) int local196 = local36.anInt10694 - local135 >> 9;
					@Pc(203) int local203 = local36.anInt10690 + local135 >> 9;
					@Pc(210) int local210 = local36.anInt10694 + local135 >> 9;
					if (!Static426.method1017(local203, local210, local140, local196, local36.anInt10739)) {
						for (@Pc(221) int local221 = local140; local221 <= local203; local221++) {
							for (@Pc(224) int local224 = local196; local224 <= local210; local224++) {
								if (local36.anInt10739 == Static341.anIntArrayArray133[local221][local224]) {
									local166 = Static148.anIntArrayArray64[local221][local224]--;
								}
							}
						}
						local36.aBoolean816 = true;
						continue;
					}
				}
			}
			local36.aBoolean816 = false;
			local36.anInt10691 = Static102.method2025(local36.aByte144, -29754, local36.anInt10694, local36.anInt10690);
			Static102.method2026(local36, true);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1655() {
		@Pc(1) int local1 = Static338.anInt5564;
		@Pc(3) int[] local3 = Static210.anIntArray280;
		@Pc(8) int local8 = Static400.aClass2_Sub34_28.aClass57_Sub27_1.method7667();
		@Pc(30) boolean local30 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(103) int local103;
		for (@Pc(32) int local32 = 0; local32 < local1; local32++) {
			@Pc(39) Class8_Sub2_Sub1_Sub2_Sub1 local39 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local3[local32]];
			if (!local39.method1417()) {
				local39.anInt10739 = -1;
			} else if (local39.aBoolean124) {
				local39.anInt10739 = -1;
			} else {
				local39.method9294();
				if (local39.aShort131 >= 0 && local39.aShort132 >= 0 && local39.aShort134 < Static720.anInt10859 && local39.aShort133 < Static501.anInt7568) {
					local39.aBoolean129 = local39.aBoolean817 ? local30 : false;
					if (local39 == Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2) {
						local39.anInt10739 = Integer.MAX_VALUE;
					} else {
						local103 = 0;
						if (!local39.aBoolean816) {
							local103++;
						}
						if (local39.anInt10747 > Static333.anInt5455) {
							local103 += 2;
						}
						local103 += 5 - local39.method9302((byte) 67) << 2;
						if (local39.aBoolean128 || local39.aBoolean125) {
							local103 += 512;
						} else {
							if (Static150.anInt2632 == 0) {
								local103 += 32;
							} else {
								local103 += 128;
							}
							local103 += 256;
						}
						local39.anInt10739 = local103 + 1;
					}
				} else {
					local39.anInt10739 = -1;
				}
			}
		}
		for (@Pc(155) int local155 = 0; local155 < Static390.anInt6126; local155++) {
			@Pc(166) Class8_Sub2_Sub1_Sub2_Sub2 local166 = ((Class2_Sub45) Static18.aClass28_2.method738((long) Static103.anIntArray187[local155])).aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local166.method9322() && local166.aClass268_1.method5996(Static34.aClass304_1)) {
				local166.method9294();
				if (local166.aShort131 >= 0 && local166.aShort132 >= 0 && local166.aShort134 < Static720.anInt10859 && local166.aShort133 < Static501.anInt7568) {
					@Pc(213) int local213 = 0;
					if (!local166.aBoolean816) {
						local213++;
					}
					if (local166.anInt10747 > Static333.anInt5455) {
						local213 += 2;
					}
					local213 += 5 - local166.method9302((byte) 88) << 2;
					if (Static150.anInt2632 == 0) {
						if (local166.aClass268_1.aBoolean504) {
							local213 += 64;
						} else {
							local213 += 128;
						}
					} else if (Static150.anInt2632 == 1) {
						if (local166.aClass268_1.aBoolean504) {
							local213 += 32;
						} else {
							local213 += 64;
						}
					}
					if (local166.aClass268_1.aBoolean502) {
						local213 += 1024;
					} else if (!local166.aClass268_1.aBoolean503) {
						local213 += 256;
					}
					local166.anInt10739 = local213 + 1;
				} else {
					local166.anInt10739 = -1;
				}
			} else {
				local166.anInt10739 = -1;
			}
		}
		for (local103 = 0; local103 < Static527.aClass254Array1.length; local103++) {
			@Pc(292) Class254 local292 = Static527.aClass254Array1[local103];
			if (local292 != null) {
				if (local292.anInt6363 == 1) {
					@Pc(308) Class2_Sub45 local308 = (Class2_Sub45) Static18.aClass28_2.method738((long) local292.anInt6366);
					if (local308 != null) {
						@Pc(313) Class8_Sub2_Sub1_Sub2_Sub2 local313 = local308.aClass8_Sub2_Sub1_Sub2_Sub2_2;
						if (local313.anInt10739 >= 0) {
							local313.anInt10739 += 2048;
						}
					}
				} else if (local292.anInt6363 == 10) {
					@Pc(333) Class8_Sub2_Sub1_Sub2_Sub1 local333 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local292.anInt6366];
					if (local333 != null && local333 != Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 && local333.anInt10739 >= 0) {
						local333.anInt10739 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hda;)Lclient!hda;")
	public static Class158 method1657(@OriginalArg(0) Class158 arg0) {
		@Pc(4) int local4 = method1661(arg0).method6218();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4; local11++) {
			arg0 = Static145.method2412(arg0.anInt3743);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!hda;)Z")
	public static boolean method1660(@OriginalArg(0) Class158 arg0) {
		if (Static103.aBoolean195) {
			if (method1661(arg0).anInt6909 != 0) {
				return false;
			}
			if (arg0.anInt3820 == 0) {
				return false;
			}
		}
		return arg0.aBoolean284;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!hda;)Lclient!ofa;")
	public static Class2_Sub41 method1661(@OriginalArg(0) Class158 arg0) {
		@Pc(13) Class2_Sub41 local13 = (Class2_Sub41) Static291.aClass28_24.method738(((long) arg0.anInt3812 << 32) + (long) arg0.anInt3741);
		return local13 == null ? arg0.aClass2_Sub41_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!pg;)V")
	public static void method1662(@OriginalArg(1) Class2_Sub2_Sub16 arg0) {
		if (arg0 == null) {
			return;
		}
		Static693.aClass339_79.method7711(arg0);
		Static594.anInt8777++;
		@Pc(33) Class2_Sub2_Sub4 local33;
		if (arg0.aBoolean551 || "".equals(arg0.aString86)) {
			local33 = new Class2_Sub2_Sub4(arg0.aString86);
			Static31.anInt767++;
		} else {
			@Pc(41) long local41 = arg0.aLong234;
			for (local33 = (Class2_Sub2_Sub4) Static490.aClass28_34.method738(local41); local33 != null && !local33.aString10.equals(arg0.aString86); local33 = (Class2_Sub2_Sub4) Static490.aClass28_34.method744()) {
			}
			if (local33 == null) {
				local33 = (Class2_Sub2_Sub4) Static717.aClass82_232.method2156(local41);
				if (local33 != null && !local33.aString10.equals(arg0.aString86)) {
					local33 = null;
				}
				if (local33 == null) {
					local33 = new Class2_Sub2_Sub4(arg0.aString86);
				}
				Static490.aClass28_34.method735(local41, local33);
				Static31.anInt767++;
			}
		}
		if (local33.method1471(arg0)) {
			Static385.method5424(local33);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!hda;II)V")
	public static void method1663(@OriginalArg(0) Class158[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(11) Class158 local11 = arg0[local1];
			if (local11 != null) {
				if (local11.anInt3820 == 0) {
					if (local11.aClass158Array1 != null) {
						method1663(local11.aClass158Array1, arg1);
					}
					@Pc(38) Class2_Sub4 local38 = (Class2_Sub4) Static548.aClass28_40.method738((long) local11.anInt3812);
					if (local38 != null) {
						Static145.method2411(arg1, local38.anInt147);
					}
				}
				@Pc(58) Class2_Sub42 local58;
				if (arg1 == 0 && local11.anObjectArray20 != null) {
					local58 = new Class2_Sub42();
					local58.aClass158_14 = local11;
					local58.anObjectArray36 = local11.anObjectArray20;
					Static472.method6420(local58);
				}
				if (arg1 == 1 && local11.anObjectArray6 != null) {
					if (local11.anInt3741 >= 0) {
						@Pc(88) Class158 local88 = Static145.method2412(local11.anInt3812);
						if (local88 == null || local88.aClass158Array2 == null || local88.aClass158Array2.length <= local11.anInt3741 || local88.aClass158Array2[local11.anInt3741] != local11) {
							continue;
						}
					}
					local58 = new Class2_Sub42();
					local58.aClass158_14 = local11;
					local58.anObjectArray36 = local11.anObjectArray6;
					Static472.method6420(local58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1664() {
		Static172.anInt2893 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static390.anInt6126; local3++) {
			@Pc(14) Class8_Sub2_Sub1_Sub2_Sub2 local14 = ((Class2_Sub45) Static18.aClass28_2.method738((long) Static103.anIntArray187[local3])).aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local14.aBoolean816 && local14.method9304((byte) -123) != -1) {
				@Pc(34) int local34 = (local14.method9302((byte) 63) - 1) * 256 + 252;
				@Pc(41) int local41 = local14.anInt10690 - local34 >> 9;
				@Pc(48) int local48 = local14.anInt10694 - local34 >> 9;
				@Pc(55) Class8_Sub2_Sub1_Sub2 local55 = Static184.method2798(local41, local48, local14.aByte144);
				if (local55 != null) {
					@Pc(60) int local60 = local55.anInt10740;
					if (local55 instanceof Class8_Sub2_Sub1_Sub2_Sub2) {
						local60 += 2048;
					}
					if (local55.anInt10735 == 0 && local55.method9304((byte) -121) != -1) {
						Static324.anIntArray390[Static172.anInt2893] = local60;
						Static212.anIntArray283[Static172.anInt2893] = local60;
						Static172.anInt2893++;
						local55.anInt10735++;
					}
					Static324.anIntArray390[Static172.anInt2893] = local60;
					Static212.anIntArray283[Static172.anInt2893] = local14.anInt10740 + 2048;
					Static172.anInt2893++;
					local55.anInt10735++;
				}
			}
		}
		Static163.method8852(Static212.anIntArray283, Static172.anInt2893 - 1, Static324.anIntArray390, 0);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1665() {
		for (@Pc(1) int local1 = 0; local1 < Static720.anInt10859; local1++) {
			@Pc(6) int[] local6 = Static341.anIntArrayArray133[local1];
			for (@Pc(8) int local8 = 0; local8 < Static501.anInt7568; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!hda;IIIIIIIIIII)V")
	public static void method1669(@OriginalArg(0) Class158[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label908: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class158 local6 = arg0[local1];
			if (local6 != null && local6.anInt3743 == arg1) {
				@Pc(19) int local19 = local6.anInt3735 + arg6;
				@Pc(24) int local24 = local6.anInt3784 + arg7;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(36) int local36;
				@Pc(42) int local42;
				@Pc(47) int local47;
				if (local6.anInt3820 == 2) {
					local30 = arg2;
					local32 = arg3;
					local34 = arg4;
					local36 = arg5;
				} else {
					local42 = local19 + local6.anInt3802;
					local47 = local24 + local6.anInt3746;
					if (local6.anInt3820 == 9) {
						local42++;
						local47++;
					}
					local30 = local19 > arg2 ? local19 : arg2;
					local32 = local24 > arg3 ? local24 : arg3;
					local34 = local42 < arg4 ? local42 : arg4;
					local36 = local47 < arg5 ? local47 : arg5;
				}
				if (local6.anInt3820 == 0 || local6.aBoolean297 || method1661(local6).anInt6909 != 0 || local6 == Static354.aClass158_8 || local6.anInt3806 == Static496.anInt7433 || local6.anInt3806 == Static625.anInt9471 || local6.anInt3806 == Static188.anInt3104 || local6.anInt3806 == Static190.anInt3113) {
					if (!method1660(local6)) {
						local42 = 0;
						local47 = 0;
						if (Static137.aBoolean210) {
							local42 = Static130.method2283();
							local47 = Static422.method5771();
						}
						if (local6 == Static109.aClass158_3 && Static582.method7658(Static109.aClass158_3) != null) {
							Static702.aBoolean797 = true;
							Static655.anInt9763 = local19;
							Static115.anInt2258 = local24;
						}
						if (local6.aBoolean296 || local30 < local34 && local32 < local36) {
							if (local6.aBoolean300 && arg10 >= local30 && arg11 >= local32 && arg10 < local34 && arg11 < local36) {
								for (@Pc(220) Class2_Sub42 local220 = (Class2_Sub42) Static521.aClass339_44.method7699(65280); local220 != null; local220 = (Class2_Sub42) Static521.aClass339_44.method7706()) {
									if (local220.aBoolean544) {
										local220.method9457();
										local220.aClass158_14.aBoolean298 = false;
									}
								}
								if (Static181.anInt3003 == 0) {
									Static109.aClass158_3 = null;
									Static354.aClass158_8 = null;
								}
								Static460.anInt6964 = 0;
								Static95.aBoolean184 = false;
								Static118.aBoolean199 = false;
								if (!Static400.aBoolean622) {
									Static79.method1578();
								}
							}
							@Pc(308) boolean local308 = local6.aBoolean295 && local6.anInt3820 == 5 && local6.anInt3780 == 0 && local6.anInt3824 < 0 && local6.anInt3760 == -1 && local6.anInt3745 == -1 && !local6.aBoolean301 && local6.anInt3765 == 0;
							@Pc(310) boolean local310 = false;
							@Pc(402) int local402;
							if (Static189.aClass120_1.method8853() + local42 >= local30 && Static189.aClass120_1.method8854() + local47 >= local32 && Static189.aClass120_1.method8853() + local42 < local34 && Static189.aClass120_1.method8854() + local47 < local36) {
								if (local308) {
									@Pc(353) Class159 local353 = local6.method3393(Static163.aClass19_17);
									if (local353 != null && local353.anInt3832 == local6.anInt3802 && local353.anInt3833 == local6.anInt3746) {
										@Pc(380) int local380 = Static189.aClass120_1.method8853() + local42 - local19;
										@Pc(388) int local388 = Static189.aClass120_1.method8854() + local47 - local24;
										if (local388 >= 0 && local388 < local353.anIntArray303.length) {
											local402 = local353.anIntArray303[local388];
											if (local380 >= local402 && local380 <= local402 + local353.anIntArray302[local388]) {
												local310 = true;
											}
										}
									} else {
										local310 = true;
									}
								} else {
									local310 = true;
								}
							}
							if (!Static156.aBoolean223 && local310) {
								if (local6.anInt3783 >= 0) {
									Static442.anInt6699 = local6.anInt3783;
								} else if (local6.aBoolean300) {
									Static442.anInt6699 = -1;
								}
							}
							if (!Static400.aBoolean622 && local310) {
								Static420.method5758(local6, arg10 - local19, arg10 - local24);
							}
							@Pc(462) boolean local462 = false;
							if (Static189.aClass120_1.method8842() && local310) {
								local462 = true;
							}
							@Pc(474) boolean local474 = false;
							@Pc(479) Class2_Sub9 local479 = (Class2_Sub9) Static226.aClass339_58.method7699(65280);
							@Pc(549) int local549;
							@Pc(555) int local555;
							@Pc(569) int local569;
							@Pc(524) Class159 local524;
							if (local479 != null && local479.method5328() == 0 && local479.method5331() >= local30 && local479.method5333() >= local32 && local479.method5331() < local34 && local479.method5333() < local36) {
								if (local308) {
									local524 = local6.method3393(Static163.aClass19_17);
									if (local524 != null && local524.anInt3832 == local6.anInt3802 && local524.anInt3833 == local6.anInt3746) {
										local549 = local479.method5331() - local19;
										local555 = local479.method5333() - local24;
										if (local555 >= 0 && local555 < local524.anIntArray303.length) {
											local569 = local524.anIntArray303[local555];
											if (local549 >= local569 && local549 <= local569 + local524.anIntArray302[local555]) {
												local474 = true;
											}
										}
									} else {
										local474 = true;
									}
								} else {
									local474 = true;
								}
							}
							if (local6.aByteArray37 != null && !Static607.method8163()) {
								for (local402 = 0; local402 < local6.aByteArray37.length; local402++) {
									if (Static334.aClass319_1.method8479(local6.aByteArray37[local402])) {
										if (local6.anIntArray294 == null || Static333.anInt5455 >= local6.anIntArray294[local402]) {
											@Pc(634) byte local634 = local6.aByteArray36[local402];
											if (local634 == 0 || ((local634 & 0x8) == 0 || !Static334.aClass319_1.method8479(86) && !Static334.aClass319_1.method8479(82) && !Static334.aClass319_1.method8479(81)) && ((local634 & 0x2) == 0 || Static334.aClass319_1.method8479(86)) && ((local634 & 0x1) == 0 || Static334.aClass319_1.method8479(82)) && ((local634 & 0x4) == 0 || Static334.aClass319_1.method8479(81))) {
												if (local402 < 10) {
													Static120.method2193(local6.anInt3812, -1, "", local402 + 1);
												} else if (local402 == 10) {
													Static470.method6384();
													@Pc(726) Class2_Sub41 local726 = method1661(local6);
													Static389.method5476(local726.method6216(), local6, local726.anInt6904);
													Static153.aString27 = Static380.method5359(local6);
													if (Static153.aString27 == null) {
														Static153.aString27 = "Null";
													}
													Static128.aString108 = local6.aString41 + "<col=ffffff>";
												}
												local555 = local6.anIntArray293[local402];
												if (local6.anIntArray294 == null) {
													local6.anIntArray294 = new int[local6.aByteArray37.length];
												}
												if (local555 == 0) {
													local6.anIntArray294[local402] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray294[local402] = Static333.anInt5455 + local555;
												}
											}
										}
									} else if (local6.anIntArray294 != null) {
										local6.anIntArray294[local402] = 0;
									}
								}
							}
							if (local474) {
								Static597.method7824(local47 + local479.method5333() - local24, local6, local42 + local479.method5331() - local19);
							}
							if (Static109.aClass158_3 != null && Static109.aClass158_3 != local6 && local310 && method1661(local6).method6220()) {
								Static327.aClass158_7 = local6;
							}
							if (local6 == Static354.aClass158_8) {
								Static343.aBoolean428 = true;
								Static123.anInt2341 = local19;
								Static169.anInt2853 = local24;
							}
							if (local6.aBoolean297 || local6.anInt3806 != 0) {
								@Pc(877) Class2_Sub42 local877;
								if (local310 && Static611.anInt9341 != 0 && local6.anObjectArray11 != null) {
									local877 = new Class2_Sub42();
									local877.aBoolean544 = true;
									local877.aClass158_14 = local6;
									local877.anInt7214 = Static611.anInt9341;
									local877.anObjectArray36 = local6.anObjectArray11;
									Static521.aClass339_44.method7711(local877);
								}
								if (Static109.aClass158_3 != null) {
									local474 = false;
									local462 = false;
								} else if (Static400.aBoolean622 || local6.anInt3806 != Static58.anInt1177 && Static460.anInt6964 > 0) {
									local474 = false;
									local462 = false;
									local310 = false;
								}
								if (local6.anInt3806 != 0) {
									if (local6.anInt3806 == Static188.anInt3104 || local6.anInt3806 == Static190.anInt3113) {
										Static610.aClass158_16 = local6;
										if (Static456.aClass148_3 != null) {
											Static456.aClass148_3.method3168(Static400.aClass2_Sub34_28.aClass57_Sub2_1.method1989(), local6.anInt3746, Static163.aClass19_17);
										}
										if (local6.anInt3806 == Static188.anInt3104) {
											if (Static400.aBoolean622 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
												continue;
											}
											Static147.method2417(arg9, arg8, Static163.aClass19_17);
											@Pc(991) Class8_Sub1 local991 = (Class8_Sub1) Static149.aClass130_4.method2790();
											while (true) {
												if (local991 == null) {
													continue label908;
												}
												if (arg10 >= local991.anInt108 && arg10 < local991.anInt109 && arg11 >= local991.anInt112 && arg11 < local991.anInt111) {
													Static79.method1578();
													Static466.method6322(local991.aClass8_Sub2_Sub1_Sub2_1);
												}
												local991 = (Class8_Sub1) Static149.aClass130_4.method2785();
											}
										}
									}
									if (local6.anInt3806 == Static496.anInt7433) {
										local524 = local6.method3393(Static163.aClass19_17);
										if (local524 == null || Static578.anInt8595 != 0 && Static578.anInt8595 != 3 || Static400.aBoolean622 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
											continue;
										}
										local549 = arg10 - local19;
										local555 = arg11 - local24;
										local569 = local524.anIntArray303[local555];
										if (local549 < local569 || local549 > local569 + local524.anIntArray302[local555]) {
											continue;
										}
										local549 -= local6.anInt3802 / 2;
										local555 -= local6.anInt3746 / 2;
										@Pc(1125) int local1125;
										if (Static511.anInt7645 == 4) {
											local1125 = (int) Static171.aFloat64 & 0x3FFF;
										} else {
											local1125 = (int) Static171.aFloat64 + Static29.anInt723 & 0x3FFF;
										}
										@Pc(1137) int local1137 = Class361.anIntArray741[local1125];
										@Pc(1141) int local1141 = Class361.anIntArray740[local1125];
										if (Static511.anInt7645 != 4) {
											local1137 = local1137 * (Static660.anInt9835 + 256) >> 8;
											local1141 = local1141 * (Static660.anInt9835 + 256) >> 8;
										}
										@Pc(1170) int local1170 = local555 * local1137 + local549 * local1141 >> 14;
										@Pc(1180) int local1180 = local555 * local1141 - local549 * local1137 >> 14;
										@Pc(1191) int local1191;
										@Pc(1199) int local1199;
										if (Static511.anInt7645 == 4) {
											local1191 = (Static433.anInt6262 >> 9) + (local1170 >> 2);
											local1199 = (Static249.anInt4018 >> 9) - (local1180 >> 2);
										} else {
											@Pc(1208) int local1208 = (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9302((byte) 83) - 1) * 256;
											local1191 = (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690 - local1208 >> 9) + (local1170 >> 2);
											local1199 = (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694 - local1208 >> 9) - (local1180 >> 2);
										}
										if (Static156.aBoolean223 && (Static717.anInt10822 & 0x40) != 0) {
											@Pc(1243) Class158 local1243 = Static15.method186(Static77.anInt1614, Static450.anInt6819);
											if (local1243 == null) {
												Static470.method6384();
											} else {
												Static416.method5707(false, local6.anInt3760, 1L, local1191, local1199, Static153.aString27, 21, true, Static369.anInt4263, " ->", (long) (local6.anInt3741 << 0 | local6.anInt3812), true);
											}
											continue;
										}
										if (Static392.aClass377_4 == Static723.aClass377_9) {
											Static416.method5707(false, -1, 1L, local1191, local1199, Static32.aClass32_27.method877(Static51.anInt1052), 11, true, -1, "", 0L, true);
										}
										Static416.method5707(false, -1, 1L, local1191, local1199, Static331.aString52, 58, true, Static331.anInt5439, "", 0L, true);
										continue;
									}
									if (local6.anInt3806 == Static58.anInt1177) {
										Static210.aClass158_4 = local6;
										if (local310) {
											Static95.aBoolean184 = true;
										}
										if (local474) {
											local402 = (int) ((double) (local42 + local479.method5331() - local19 - local6.anInt3802 / 2) * 2.0D / (double) Static30.aFloat105);
											local549 = (int) -((double) (local47 + local479.method5333() - local24 - local6.anInt3746 / 2) * 2.0D / (double) Static30.aFloat105);
											local555 = Static164.anInt2809 + local402 + Static30.anInt5655;
											local569 = Static615.anInt9389 + local549 + Static30.anInt5648;
											@Pc(1383) Class2_Sub2_Sub13 local1383 = Static186.method2819();
											if (local1383 == null) {
												continue;
											}
											@Pc(1388) int[] local1388 = new int[3];
											local1383.method4091(local569, local555, local1388);
											if (local1388 != null) {
												if (Static334.aClass319_1.method8479(82) && Static608.anInt9290 > 0) {
													Static624.method8331(local1388[0], local1388[2], local1388[1]);
													continue;
												}
												Static118.aBoolean199 = true;
												Static688.anInt10356 = local1388[0];
												Static503.anInt7582 = local1388[1];
												Static614.anInt9373 = local1388[2];
											}
											Static460.anInt6964 = 1;
											Static1.aBoolean821 = false;
											Static378.anInt5941 = Static189.aClass120_1.method8853();
											Static150.anInt2631 = Static189.aClass120_1.method8854();
											continue;
										}
										if (local462 && Static460.anInt6964 > 0) {
											if (Static460.anInt6964 == 1 && (Static378.anInt5941 != Static189.aClass120_1.method8853() || Static150.anInt2631 != Static189.aClass120_1.method8854())) {
												Static661.anInt6055 = Static164.anInt2809;
												Static417.anInt6399 = Static615.anInt9389;
												Static460.anInt6964 = 2;
											}
											if (Static460.anInt6964 == 2) {
												Static1.aBoolean821 = true;
												Static669.method8711(Static661.anInt6055 + (int) ((double) (Static378.anInt5941 - Static189.aClass120_1.method8853()) * 2.0D / (double) Static30.aFloat106));
												Static182.method2786(Static417.anInt6399 - (int) ((double) (Static150.anInt2631 - Static189.aClass120_1.method8854()) * 2.0D / (double) Static30.aFloat106));
											}
											continue;
										}
										if (Static460.anInt6964 > 0 && !Static1.aBoolean821) {
											if ((Static219.anInt3549 == 1 || Static204.method3084()) && Static594.anInt8777 > 2) {
												Static455.method6223(Static378.anInt5941, Static150.anInt2631);
											} else if (Static77.method1559()) {
												Static455.method6223(Static378.anInt5941, Static150.anInt2631);
											}
										}
										Static460.anInt6964 = 0;
										continue;
									}
									if (local6.anInt3806 == Static146.anInt2567) {
										if (local462) {
											Static203.method3069(local6.anInt3802, local42 + Static189.aClass120_1.method8853() - local19, local47 + Static189.aClass120_1.method8854() - local24, local6.anInt3746);
										}
										continue;
									}
									if (local6.anInt3806 == Static625.anInt9471) {
										Static65.method1473(local19, local24, local6);
										continue;
									}
								}
								if (!local6.aBoolean290 && local474) {
									local6.aBoolean290 = true;
									if (local6.anObjectArray17 != null) {
										local877 = new Class2_Sub42();
										local877.aBoolean544 = true;
										local877.aClass158_14 = local6;
										local877.anInt7218 = local42 + local479.method5331() - local19;
										local877.anInt7214 = local47 + local479.method5333() - local24;
										local877.anObjectArray36 = local6.anObjectArray17;
										Static521.aClass339_44.method7711(local877);
									}
								}
								if (local6.aBoolean290 && local462 && local6.anObjectArray24 != null) {
									local877 = new Class2_Sub42();
									local877.aBoolean544 = true;
									local877.aClass158_14 = local6;
									local877.anInt7218 = local42 + Static189.aClass120_1.method8853() - local19;
									local877.anInt7214 = local47 + Static189.aClass120_1.method8854() - local24;
									local877.anObjectArray36 = local6.anObjectArray24;
									Static521.aClass339_44.method7711(local877);
								}
								if (local6.aBoolean290 && !local462) {
									local6.aBoolean290 = false;
									if (local6.anObjectArray1 != null) {
										local877 = new Class2_Sub42();
										local877.aBoolean544 = true;
										local877.aClass158_14 = local6;
										local877.anInt7218 = local42 + Static189.aClass120_1.method8853() - local19;
										local877.anInt7214 = local47 + Static189.aClass120_1.method8854() - local24;
										local877.anObjectArray36 = local6.anObjectArray1;
										Static59.aClass339_33.method7711(local877);
									}
								}
								if (local462 && local6.anObjectArray32 != null) {
									local877 = new Class2_Sub42();
									local877.aBoolean544 = true;
									local877.aClass158_14 = local6;
									local877.anInt7218 = local42 + Static189.aClass120_1.method8853() - local19;
									local877.anInt7214 = local47 + Static189.aClass120_1.method8854() - local24;
									local877.anObjectArray36 = local6.anObjectArray32;
									Static521.aClass339_44.method7711(local877);
								}
								if (!local6.aBoolean298 && local310) {
									local6.aBoolean298 = true;
									if (local6.anObjectArray4 != null) {
										local877 = new Class2_Sub42();
										local877.aBoolean544 = true;
										local877.aClass158_14 = local6;
										local877.anInt7218 = local42 + Static189.aClass120_1.method8853() - local19;
										local877.anInt7214 = local47 + Static189.aClass120_1.method8854() - local24;
										local877.anObjectArray36 = local6.anObjectArray4;
										Static521.aClass339_44.method7711(local877);
									}
								}
								if (local6.aBoolean298 && local310 && local6.anObjectArray28 != null) {
									local877 = new Class2_Sub42();
									local877.aBoolean544 = true;
									local877.aClass158_14 = local6;
									local877.anInt7218 = local42 + Static189.aClass120_1.method8853() - local19;
									local877.anInt7214 = local47 + Static189.aClass120_1.method8854() - local24;
									local877.anObjectArray36 = local6.anObjectArray28;
									Static521.aClass339_44.method7711(local877);
								}
								if (local6.aBoolean298 && !local310) {
									local6.aBoolean298 = false;
									if (local6.anObjectArray26 != null) {
										local877 = new Class2_Sub42();
										local877.aBoolean544 = true;
										local877.aClass158_14 = local6;
										local877.anInt7218 = local42 + Static189.aClass120_1.method8853() - local19;
										local877.anInt7214 = local47 + Static189.aClass120_1.method8854() - local24;
										local877.anObjectArray36 = local6.anObjectArray26;
										Static59.aClass339_33.method7711(local877);
									}
								}
								if (local6.anObjectArray3 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray3;
									Static618.aClass339_68.method7711(local877);
								}
								@Pc(2022) Class2_Sub42 local2022;
								if (local6.anObjectArray2 != null && Static52.anInt1065 > local6.anInt3805) {
									if (local6.anIntArray298 == null || Static52.anInt1065 - local6.anInt3805 > 32) {
										local877 = new Class2_Sub42();
										local877.aClass158_14 = local6;
										local877.anObjectArray36 = local6.anObjectArray2;
										Static521.aClass339_44.method7711(local877);
									} else {
										label768: for (local402 = local6.anInt3805; local402 < Static52.anInt1065; local402++) {
											local549 = Static278.anIntArray350[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray298.length; local555++) {
												if (local6.anIntArray298[local555] == local549) {
													local2022 = new Class2_Sub42();
													local2022.aClass158_14 = local6;
													local2022.anObjectArray36 = local6.anObjectArray2;
													Static521.aClass339_44.method7711(local2022);
													break label768;
												}
											}
										}
									}
									local6.anInt3805 = Static52.anInt1065;
								}
								if (local6.anObjectArray18 != null && Static455.anInt6917 > local6.anInt3801) {
									if (local6.anIntArray296 == null || Static455.anInt6917 - local6.anInt3801 > 32) {
										local877 = new Class2_Sub42();
										local877.aClass158_14 = local6;
										local877.anObjectArray36 = local6.anObjectArray18;
										Static521.aClass339_44.method7711(local877);
									} else {
										label744: for (local402 = local6.anInt3801; local402 < Static455.anInt6917; local402++) {
											local549 = Static268.anIntArray332[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray296.length; local555++) {
												if (local6.anIntArray296[local555] == local549) {
													local2022 = new Class2_Sub42();
													local2022.aClass158_14 = local6;
													local2022.anObjectArray36 = local6.anObjectArray18;
													Static521.aClass339_44.method7711(local2022);
													break label744;
												}
											}
										}
									}
									local6.anInt3801 = Static455.anInt6917;
								}
								if (local6.anObjectArray25 != null && Static635.anInt9525 > local6.anInt3761) {
									if (local6.anIntArray300 == null || Static635.anInt9525 - local6.anInt3761 > 32) {
										local877 = new Class2_Sub42();
										local877.aClass158_14 = local6;
										local877.anObjectArray36 = local6.anObjectArray25;
										Static521.aClass339_44.method7711(local877);
									} else {
										label720: for (local402 = local6.anInt3761; local402 < Static635.anInt9525; local402++) {
											local549 = Static142.anIntArray225[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray300.length; local555++) {
												if (local6.anIntArray300[local555] == local549) {
													local2022 = new Class2_Sub42();
													local2022.aClass158_14 = local6;
													local2022.anObjectArray36 = local6.anObjectArray25;
													Static521.aClass339_44.method7711(local2022);
													break label720;
												}
											}
										}
									}
									local6.anInt3761 = Static635.anInt9525;
								}
								if (local6.anObjectArray8 != null && Static451.anInt6851 > local6.anInt3775) {
									if (local6.anIntArray299 == null || Static451.anInt6851 - local6.anInt3775 > 32) {
										local877 = new Class2_Sub42();
										local877.aClass158_14 = local6;
										local877.anObjectArray36 = local6.anObjectArray8;
										Static521.aClass339_44.method7711(local877);
									} else {
										label696: for (local402 = local6.anInt3775; local402 < Static451.anInt6851; local402++) {
											local549 = Static322.anIntArray889[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray299.length; local555++) {
												if (local6.anIntArray299[local555] == local549) {
													local2022 = new Class2_Sub42();
													local2022.aClass158_14 = local6;
													local2022.anObjectArray36 = local6.anObjectArray8;
													Static521.aClass339_44.method7711(local2022);
													break label696;
												}
											}
										}
									}
									local6.anInt3775 = Static451.anInt6851;
								}
								if (local6.anObjectArray21 != null && Static366.anInt5858 > local6.anInt3803) {
									if (local6.anIntArray295 == null || Static366.anInt5858 - local6.anInt3803 > 32) {
										local877 = new Class2_Sub42();
										local877.aClass158_14 = local6;
										local877.anObjectArray36 = local6.anObjectArray21;
										Static521.aClass339_44.method7711(local877);
									} else {
										label672: for (local402 = local6.anInt3803; local402 < Static366.anInt5858; local402++) {
											local549 = Static395.anIntArray833[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray295.length; local555++) {
												if (local6.anIntArray295[local555] == local549) {
													local2022 = new Class2_Sub42();
													local2022.aClass158_14 = local6;
													local2022.anObjectArray36 = local6.anObjectArray21;
													Static521.aClass339_44.method7711(local2022);
													break label672;
												}
											}
										}
									}
									local6.anInt3803 = Static366.anInt5858;
								}
								if (local6.anObjectArray33 != null && Static710.anInt7554 > local6.anInt3791) {
									if (local6.anIntArray297 == null || Static710.anInt7554 - local6.anInt3791 > 32) {
										local877 = new Class2_Sub42();
										local877.aClass158_14 = local6;
										local877.anObjectArray36 = local6.anObjectArray33;
										Static521.aClass339_44.method7711(local877);
									} else {
										label648: for (local402 = local6.anInt3791; local402 < Static710.anInt7554; local402++) {
											local549 = Static265.anIntArray328[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray297.length; local555++) {
												if (local6.anIntArray297[local555] == local549) {
													local2022 = new Class2_Sub42();
													local2022.aClass158_14 = local6;
													local2022.anObjectArray36 = local6.anObjectArray33;
													Static521.aClass339_44.method7711(local2022);
													break label648;
												}
											}
										}
									}
									local6.anInt3791 = Static710.anInt7554;
								}
								if (Static716.anInt10815 > local6.lb && local6.anObjectArray7 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray7;
									Static521.aClass339_44.method7711(local877);
								}
								if (Static344.anInt5621 > local6.lb && local6.anObjectArray29 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray29;
									Static521.aClass339_44.method7711(local877);
								}
								if (Static352.anInt5754 > local6.lb && local6.anObjectArray27 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray27;
									Static521.aClass339_44.method7711(local877);
								}
								if (Static400.anInt8102 > local6.lb && local6.anObjectArray23 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray23;
									Static521.aClass339_44.method7711(local877);
								}
								if (Static39.anInt949 > local6.lb && local6.anObjectArray12 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray12;
									Static521.aClass339_44.method7711(local877);
								}
								if (Static526.anInt8067 > local6.lb && local6.anObjectArray9 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray9;
									Static521.aClass339_44.method7711(local877);
								}
								if (Static321.anInt5111 > local6.lb && local6.anObjectArray34 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray34;
									Static521.aClass339_44.method7711(local877);
								}
								local6.lb = Static642.anInt9599;
								if (local6.anObjectArray22 != null) {
									for (local402 = 0; local402 < Static671.anInt10026; local402++) {
										@Pc(2682) Class2_Sub42 local2682 = new Class2_Sub42();
										local2682.aClass158_14 = local6;
										local2682.anInt7216 = Static194.anInterface27Array1[local402].method2664();
										local2682.anInt7221 = Static194.anInterface27Array1[local402].method2666();
										local2682.anObjectArray36 = local6.anObjectArray22;
										Static521.aClass339_44.method7711(local2682);
									}
								}
								if (Static272.aBoolean337 && local6.anObjectArray31 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray31;
									Static521.aClass339_44.method7711(local877);
								}
							}
							if (local6.anInt3820 == 5 && local6.anInt3824 != -1) {
								local6.method3405(Static99.aClass78_1, Static324.aClass307_1).method3168(Static400.aClass2_Sub34_28.aClass57_Sub2_1.method1989(), local6.anInt3746, Static163.aClass19_17);
							}
							Static542.method7202(local6);
							if (local6.anInt3820 == 0) {
								method1669(arg0, local6.anInt3812, local30, local32, local34, local36, local19 - local6.anInt3809, local24 - local6.anInt3768, arg8, arg9, arg10, arg11);
								if (local6.aClass158Array1 != null) {
									method1669(local6.aClass158Array1, local6.anInt3812, local30, local32, local34, local36, local19 - local6.anInt3809, local24 - local6.anInt3768, arg8, arg9, arg10, arg11);
								}
								@Pc(2824) Class2_Sub4 local2824 = (Class2_Sub4) Static548.aClass28_40.method738((long) local6.anInt3812);
								if (local2824 != null) {
									if (Static392.aClass377_4 == Static673.aClass377_8 && local2824.anInt146 == 0 && !Static400.aBoolean622 && local310 && !Static103.aBoolean195) {
										Static79.method1578();
									}
									Static431.method5822(local36, local24, local32, arg9, arg11, local34, local19, local2824.anInt147, arg8, arg10, local30);
								}
							}
						}
					}
				} else if (local30 < local34 && local32 < local36) {
					Static542.method7202(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1670(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static338.anInt5564;
		@Pc(3) int[] local3 = Static210.anIntArray280;
		@Pc(9) int local9;
		if (Static1.anInt10798 == 3) {
			local9 = Static219.aClass236Array1.length;
		} else {
			local9 = local1 + Static390.anInt6126;
		}
		for (@Pc(16) int local16 = 0; local16 < local9; local16++) {
			@Pc(31) Class8_Sub2_Sub1_Sub2 local31;
			if (Static1.anInt10798 == 3) {
				@Pc(24) Class236 local24 = Static219.aClass236Array1[local16];
				if (!local24.aBoolean455) {
					continue;
				}
				local31 = local24.method5363();
			} else {
				if (local16 < local1) {
					local31 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local3[local16]];
				} else {
					local31 = ((Class2_Sub45) Static18.aClass28_2.method738((long) Static103.anIntArray187[local16 - local1])).aClass8_Sub2_Sub1_Sub2_Sub2_2;
				}
				if (local31.aByte144 != arg0 || local31.anInt10739 < 0) {
					continue;
				}
			}
			@Pc(69) int local69 = local31.method9302((byte) 102);
			if ((local69 & 0x1) == 0) {
				if ((local31.anInt10690 & 0x1FF) != 0 || (local31.anInt10694 & 0x1FF) != 0) {
					continue;
				}
			} else if ((local31.anInt10690 & 0x1FF) != 256 || (local31.anInt10694 & 0x1FF) != 256) {
				continue;
			}
			@Pc(113) int local113;
			@Pc(118) int local118;
			@Pc(155) int local155;
			if (local69 == 1) {
				local113 = local31.anInt10690 >> 9;
				local118 = local31.anInt10694 >> 9;
				if (local31.anInt10739 > Static341.anIntArrayArray133[local113][local118]) {
					Static341.anIntArrayArray133[local113][local118] = local31.anInt10739;
					Static148.anIntArrayArray64[local113][local118] = 1;
				} else if (local31.anInt10739 == Static341.anIntArrayArray133[local113][local118]) {
					local155 = Static148.anIntArrayArray64[local113][local118]++;
				}
			} else {
				local113 = (local69 - 1) * 256 + 60;
				local118 = local31.anInt10690 - local113 >> 9;
				@Pc(182) int local182 = local31.anInt10694 - local113 >> 9;
				@Pc(189) int local189 = local31.anInt10690 + local113 >> 9;
				@Pc(196) int local196 = local31.anInt10694 + local113 >> 9;
				for (@Pc(198) int local198 = local118; local198 <= local189; local198++) {
					for (@Pc(201) int local201 = local182; local201 <= local196; local201++) {
						if (local31.anInt10739 > Static341.anIntArrayArray133[local198][local201]) {
							Static341.anIntArrayArray133[local198][local201] = local31.anInt10739;
							Static148.anIntArrayArray64[local198][local201] = 1;
						} else if (local31.anInt10739 == Static341.anIntArrayArray133[local198][local201]) {
							local155 = Static148.anIntArrayArray64[local198][local201]++;
						}
					}
				}
			}
		}
	}
}
