import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!eka", name = "l", descriptor = "Lclient!sb;")
	public static Class330 aClass330_26;

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "[I")
	public static final int[] anIntArray226 = new int[2];

	@OriginalMember(owner = "client!eka", name = "h", descriptor = "[I")
	public static final int[] anIntArray227 = new int[8];

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IIILclient!ha;)V")
	public static void method2417(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static240.anInt3955 == 0 || Static275.anInt4424 == 0) {
			return;
		}
		@Pc(38) Class73 local38;
		@Pc(57) int local57;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(63) int local63;
		@Pc(69) int local69;
		if (Static137.aBoolean210) {
			Static713.method9331(false);
			local38 = arg2.method8017();
			@Pc(41) int[] local41 = arg2.Y();
			local45 = local41[1];
			local49 = local41[2];
			local53 = local41[3];
			local57 = local41[0];
			local63 = Static242.method3503(false) + arg1;
			local69 = Static580.method7649(false) + arg0;
		} else {
			arg2.DA(Static168.anInt2842, Static232.anInt3829, Static240.anInt3955, Static275.anInt4424);
			local49 = Static240.anInt3955;
			local53 = Static275.anInt4424;
			local45 = Static232.anInt3829;
			local57 = Static168.anInt2842;
			arg2.KA(Static725.anInt10936, Static192.anInt3123, Static240.anInt3955, Static275.anInt4424);
			local38 = arg2.method7953();
			local38.method7135(Static428.anInt6487, Static427.anInt6480, Static523.anInt3888, Static524.anInt8044, Static271.anInt4363, Static707.anInt10641);
			local63 = arg1;
			arg2.method8000(local38);
			local69 = arg0;
		}
		Static501.method6716(true);
		if (local53 == 0) {
			local53 = 1;
		}
		if (local49 == 0) {
			local49 = 1;
		}
		@Pc(148) int local148;
		@Pc(177) int local177;
		@Pc(186) int local186;
		@Pc(286) int local286;
		@Pc(295) int local295;
		@Pc(306) int local306;
		@Pc(317) int local317;
		@Pc(140) int local140;
		@Pc(370) int local370;
		if (Static706.aClass178Array3 != null && (!Static156.aBoolean223 || (Static717.anInt10822 & 0x40) != 0)) {
			local140 = -1;
			@Pc(142) int local142 = -1;
			@Pc(145) int local145 = arg2.i();
			local148 = arg2.XA();
			@Pc(159) int local159;
			@Pc(168) int local168;
			if (Static504.aBoolean579) {
				local177 = local168 = Static582.anInt8627 * (local63 - local57) / local49;
				local159 = local186 = Static582.anInt8627 * (local69 - local45) / local53;
			} else {
				local159 = (local69 - local45) * local145 / local53;
				local168 = local148 * (local63 - local57) / local49;
				local177 = (local63 - local57) * local145 / local49;
				local186 = (local69 - local45) * local148 / local53;
			}
			@Pc(224) int[] local224 = new int[] { local177, local159, local145 };
			@Pc(239) int[] local239 = new int[] { local168, local186, local148 };
			local38.method7126(local224);
			local38.method7126(local239);
			@Pc(273) float local273 = Static394.method5543((float) local224[0], (float) local239[2], 4, (float) local224[2], (float) local239[1], (float) local224[1], (float) local239[0]);
			if (local273 > 0.0F) {
				local286 = local239[0] - local224[0];
				local295 = local239[2] - local224[2];
				local306 = (int) ((float) local224[0] + local273 * (float) local286);
				local317 = (int) ((float) local224[2] + local273 * (float) local295);
				local140 = local306 + (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9302((byte) 111) - 1 << 8) >> 9;
				local142 = local317 + (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9302((byte) 102) - 1 << 8) >> 9;
				@Pc(345) byte local345 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144;
				if (local345 < 3 && (Static280.aByteArrayArrayArray3[1][local306 >> 9][local317 >> 9] & 0x2) != 0) {
					local370 = local345 + 1;
				}
			}
			if (local140 != -1 && local142 != -1) {
				if (Static156.aBoolean223 && (Static717.anInt10822 & 0x40) != 0) {
					@Pc(453) Class158 local453 = Static15.method186(Static77.anInt1614, Static450.anInt6819);
					if (local453 == null) {
						Static470.method6384();
					} else {
						Static416.method5707(false, -1, 0L, local140, local142, Static153.aString27, 21, true, Static369.anInt4263, " ->", (long) (local140 << 0 | local142), true);
					}
				} else {
					if (Static501.aBoolean576) {
						Static416.method5707(false, -1, 0L, local140, local142, Static32.aClass32_27.method877(Static51.anInt1052), 11, true, -1, "", (long) (local142 | local140 << 0), true);
					}
					Static416.method5707(false, -1, 0L, local140, local142, Static331.aString52, 58, true, Static331.anInt5439, "", (long) (local142 | local140 << 0), true);
				}
			}
		}
		if (Static137.aBoolean210) {
			Static480.method6469();
		}
		for (local140 = 0; local140 < (Static137.aBoolean210 ? 2 : 1); local140++) {
			@Pc(503) boolean local503 = local140 == 0;
			@Pc(510) Class213 local510 = local503 ? Static514.aClass213_2 : Static10.aClass213_1;
			local148 = arg1;
			local177 = arg0;
			if (Static137.aBoolean210) {
				Static713.method9331(local503);
				local148 = arg1 + Static242.method3503(local503);
				local177 = arg0 + Static580.method7649(local503);
			}
			@Pc(538) Class130 local538 = local510.aClass130_8;
			for (@Pc(543) Class8_Sub7 local543 = (Class8_Sub7) local538.method2790(); local543 != null; local543 = (Class8_Sub7) local538.method2785()) {
				if ((Static273.aBoolean340 || local543.aClass8_Sub2_18.aByte144 == Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144) && local543.method6496(arg2, local177, local148)) {
					@Pc(584) int local584;
					if (local543.aClass8_Sub2_18 instanceof Class8_Sub2_Sub1) {
						local186 = ((Class8_Sub2_Sub1) local543.aClass8_Sub2_18).aShort131;
						local584 = ((Class8_Sub2_Sub1) local543.aClass8_Sub2_18).aShort132;
					} else {
						local584 = local543.aClass8_Sub2_18.anInt10694 >> 9;
						local186 = local543.aClass8_Sub2_18.anInt10690 >> 9;
					}
					@Pc(723) int local723;
					@Pc(735) int local735;
					@Pc(864) int local864;
					@Pc(614) int local614;
					if (local543.aClass8_Sub2_18 instanceof Class8_Sub2_Sub1_Sub2_Sub1) {
						@Pc(610) Class8_Sub2_Sub1_Sub2_Sub1 local610 = (Class8_Sub2_Sub1_Sub2_Sub1) local543.aClass8_Sub2_18;
						local614 = local610.method9302((byte) 50);
						if ((local614 & 0x1) == 0 && (local610.anInt10690 & 0x1FF) == 0 && (local610.anInt10694 & 0x1FF) == 0 || (local614 & 0x1) == 1 && (local610.anInt10690 & 0x1FF) == 256 && (local610.anInt10694 & 0x1FF) == 256) {
							local286 = local610.anInt10690 - (local610.method9302((byte) 79) - 1 << 8);
							local295 = local610.anInt10694 - (local610.method9302((byte) 61) - 1 << 8);
							for (local306 = 0; local306 < Static390.anInt6126; local306++) {
								@Pc(690) Class2_Sub45 local690 = (Class2_Sub45) Static18.aClass28_2.method738((long) Static103.anIntArray187[local306]);
								if (local690 != null) {
									@Pc(695) Class8_Sub2_Sub1_Sub2_Sub2 local695 = local690.aClass8_Sub2_Sub1_Sub2_Sub2_2;
									if (Static333.anInt5455 != local695.anInt10743 && local695.aBoolean816) {
										local723 = local695.anInt10690 - (local695.aClass268_1.anInt6713 - 1 << 8);
										local735 = local695.anInt10694 - (local695.aClass268_1.anInt6713 - 1 << 8);
										if (local286 <= local723 && local695.aClass268_1.anInt6713 <= local610.method9302((byte) 126) - (local723 - local286 >> 9) && local735 >= local295 && local695.aClass268_1.anInt6713 <= local610.method9302((byte) 121) - (local735 - local295 >> 9)) {
											Static651.method8517(local543.aClass8_Sub2_18.aByte144 != Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144, local695);
											local695.anInt10743 = Static333.anInt5455;
										}
									}
								}
							}
							local317 = Static338.anInt5564;
							@Pc(820) int[] local820 = Static210.anIntArray280;
							for (local723 = 0; local723 < local317; local723++) {
								@Pc(830) Class8_Sub2_Sub1_Sub2_Sub1 local830 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local820[local723]];
								if (local830 != null && local830.anInt10743 != Static333.anInt5455 && local830 != local610 && local830.aBoolean816) {
									local864 = local830.anInt10690 - (local830.method9302((byte) 123) - 1 << 8);
									@Pc(876) int local876 = local830.anInt10694 - (local830.method9302((byte) 67) - 1 << 8);
									if (local864 >= local286 && local830.method9302((byte) 71) <= local610.method9302((byte) 110) - (local864 - local286 >> 9) && local876 >= local295 && local830.method9302((byte) 79) <= local610.method9302((byte) 100) - (local876 - local295 >> 9)) {
										Static414.method5696(local543.aClass8_Sub2_18.aByte144 != Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144, local830);
										local830.anInt10743 = Static333.anInt5455;
									}
								}
							}
						}
						if (Static333.anInt5455 == local610.anInt10743) {
							continue;
						}
						Static414.method5696(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 != local543.aClass8_Sub2_18.aByte144, local610);
						local610.anInt10743 = Static333.anInt5455;
					}
					if (local543.aClass8_Sub2_18 instanceof Class8_Sub2_Sub1_Sub2_Sub2) {
						@Pc(988) Class8_Sub2_Sub1_Sub2_Sub2 local988 = (Class8_Sub2_Sub1_Sub2_Sub2) local543.aClass8_Sub2_18;
						if (local988.aClass268_1 != null) {
							if ((local988.aClass268_1.anInt6713 & 0x1) == 0 && (local988.anInt10690 & 0x1FF) == 0 && (local988.anInt10694 & 0x1FF) == 0 || (local988.aClass268_1.anInt6713 & 0x1) == 1 && (local988.anInt10690 & 0x1FF) == 256 && (local988.anInt10694 & 0x1FF) == 256) {
								local614 = local988.anInt10690 - (local988.aClass268_1.anInt6713 - 1 << 8);
								local286 = local988.anInt10694 - (local988.aClass268_1.anInt6713 - 1 << 8);
								for (local295 = 0; local295 < Static390.anInt6126; local295++) {
									@Pc(1081) Class2_Sub45 local1081 = (Class2_Sub45) Static18.aClass28_2.method738((long) Static103.anIntArray187[local295]);
									if (local1081 != null) {
										@Pc(1086) Class8_Sub2_Sub1_Sub2_Sub2 local1086 = local1081.aClass8_Sub2_Sub1_Sub2_Sub2_2;
										if (local1086.anInt10743 != Static333.anInt5455 && local1086 != local988 && local1086.aBoolean816) {
											local370 = local1086.anInt10690 - (local1086.aClass268_1.anInt6713 - 1 << 8);
											local723 = local1086.anInt10694 - (local1086.aClass268_1.anInt6713 - 1 << 8);
											if (local614 <= local370 && local988.aClass268_1.anInt6713 - (local370 - local614 >> 9) >= local1086.aClass268_1.anInt6713 && local723 >= local286 && local1086.aClass268_1.anInt6713 <= local988.aClass268_1.anInt6713 - (local723 - local286 >> 9)) {
												Static651.method8517(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 != local543.aClass8_Sub2_18.aByte144, local1086);
												local1086.anInt10743 = Static333.anInt5455;
											}
										}
									}
								}
								local306 = Static338.anInt5564;
								@Pc(1216) int[] local1216 = Static210.anIntArray280;
								for (local370 = 0; local370 < local306; local370++) {
									@Pc(1226) Class8_Sub2_Sub1_Sub2_Sub1 local1226 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local1216[local370]];
									if (local1226 != null && local1226.anInt10743 != Static333.anInt5455 && local1226.aBoolean816) {
										local735 = local1226.anInt10690 - (local1226.method9302((byte) 125) - 1 << 8);
										local864 = local1226.anInt10694 - (local1226.method9302((byte) 76) - 1 << 8);
										if (local614 <= local735 && local1226.method9302((byte) 98) <= local988.aClass268_1.anInt6713 - (local735 - local614 >> 9) && local286 <= local864 && local1226.method9302((byte) 127) <= local988.aClass268_1.anInt6713 - (local864 - local286 >> 9)) {
											Static414.method5696(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 != local543.aClass8_Sub2_18.aByte144, local1226);
											local1226.anInt10743 = Static333.anInt5455;
										}
									}
								}
							}
							if (Static333.anInt5455 == local988.anInt10743) {
								continue;
							}
							Static651.method8517(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 != local543.aClass8_Sub2_18.aByte144, local988);
							local988.anInt10743 = Static333.anInt5455;
						}
					}
					if (local543.aClass8_Sub2_18 instanceof Class8_Sub2_Sub5_Sub1) {
						@Pc(1385) int local1385 = local186 + Static691.anInt10367;
						local614 = Static116.anInt2270 + local584;
						@Pc(1406) Class2_Sub17 local1406 = (Class2_Sub17) Static497.aClass28_35.method738((long) (local614 << 14 | local543.aClass8_Sub2_18.aByte144 << 28 | local1385));
						if (local1406 != null) {
							local295 = 0;
							for (@Pc(1416) Class2_Sub15 local1416 = (Class2_Sub15) local1406.aClass339_12.method7708(); local1416 != null; local1416 = (Class2_Sub15) local1406.aClass339_12.method7709()) {
								@Pc(1424) Class382 local1424 = Static419.aClass112_1.method2486(local1416.anInt1958);
								if (Static156.aBoolean223 && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 == local543.aClass8_Sub2_18.aByte144) {
									@Pc(1451) Class296 local1451 = Static610.anInt9329 == -1 ? null : Static386.aClass49_2.method1161(Static610.anInt9329);
									if ((Static717.anInt10822 & 0x1) != 0 && (local1451 == null || local1424.method8794(Static610.anInt9329, local1451.anInt7509) != local1451.anInt7509)) {
										Static416.method5707(false, -1, (long) local1416.anInt1958, local186, local584, Static153.aString27, 17, true, Static369.anInt4263, Static128.aString108 + " -> <col=ff9040>" + local1424.aString118, (long) local295, false);
									}
								}
								if (local543.aClass8_Sub2_18.aByte144 == Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144) {
									@Pc(1525) String[] local1525 = local1424.aStringArray46;
									for (local723 = local1525.length - 1; local723 >= 0; local723--) {
										if (local1525[local723] != null) {
											@Pc(1540) short local1540 = 0;
											local864 = Static39.anInt950;
											if (local723 == 0) {
												local1540 = 25;
											}
											if (local723 == 1) {
												local1540 = 5;
											}
											if (local723 == 2) {
												local1540 = 50;
											}
											if (local723 == 3) {
												local1540 = 6;
											}
											if (local723 == 4) {
												local1540 = 45;
											}
											if (local723 == 5) {
												local1540 = 1007;
											}
											if (local723 == local1424.anInt10129) {
												local864 = local1424.anInt10112;
											}
											if (local723 == local1424.anInt10081) {
												local864 = local1424.anInt10082;
											}
											Static416.method5707(false, -1, (long) local1416.anInt1958, local186, local584, local1525[local723], local1540, true, local864, "<col=ff9040>" + local1424.aString118, (long) local295, false);
										}
									}
								}
								local295++;
							}
						}
					}
					if (local543.aClass8_Sub2_18 instanceof Interface25) {
						@Pc(1654) Interface25 local1654 = (Interface25) local543.aClass8_Sub2_18;
						@Pc(1661) Class54 local1661 = Static354.aClass142_4.method3063(local1654.method6859(-32136), 102);
						if (local1661.anIntArray113 != null) {
							local1661 = local1661.method1301(13, Static34.aClass304_1);
						}
						if (local1661 != null) {
							if (Static156.aBoolean223 && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 == local543.aClass8_Sub2_18.aByte144) {
								@Pc(1697) Class296 local1697 = Static610.anInt9329 == -1 ? null : Static386.aClass49_2.method1161(Static610.anInt9329);
								if ((Static717.anInt10822 & 0x4) != 0 && (local1697 == null || local1661.method1316(local1697.anInt7509, Static610.anInt9329) != local1697.anInt7509)) {
									Static416.method5707(false, -1, Static277.method4042(local1654, local584, local186), local186, local584, Static153.aString27, 60, true, Static369.anInt4263, Static128.aString108 + " -> <col=00ffff>" + local1661.aString7, (long) local1654.hashCode(), false);
								}
							}
							if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 == local543.aClass8_Sub2_18.aByte144) {
								@Pc(1763) String[] local1763 = local1661.aStringArray6;
								if (local1763 != null) {
									for (local295 = local1763.length - 1; local295 >= 0; local295--) {
										if (local1763[local295] != null) {
											@Pc(1780) short local1780 = 0;
											local317 = Static39.anInt950;
											if (local295 == 0) {
												local1780 = 19;
											}
											if (local295 == 1) {
												local1780 = 13;
											}
											if (local295 == 2) {
												local1780 = 46;
											}
											if (local295 == 3) {
												local1780 = 8;
											}
											if (local295 == 4) {
												local1780 = 1010;
											}
											if (local295 == local1661.anInt1230) {
												local317 = local1661.anInt1240;
											}
											if (local295 == 5) {
												local1780 = 1008;
											}
											if (local1661.anInt1260 == local295) {
												local317 = local1661.anInt1245;
											}
											Static416.method5707(false, -1, Static277.method4042(local1654, local584, local186), local186, local584, local1763[local295], local1780, true, local317, "<col=00ffff>" + local1661.aString7, (long) local1654.hashCode(), false);
										}
									}
								}
							}
						}
					}
				}
			}
			if (Static137.aBoolean210) {
				Static480.method6469();
			}
		}
		Static501.method6716(false);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IIIZIIIII)Z")
	public static boolean method2419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray879[0];
		@Pc(21) int local21 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray878[0];
		if (local16 < 0 || local16 >= Static720.anInt10859 || local21 < 0 || Static501.anInt7568 <= local21) {
			return false;
		} else if (arg4 >= 0 && Static720.anInt10859 > arg4 && arg1 >= 0 && arg1 < Static501.anInt7568) {
			@Pc(98) int local98 = Static521.method6870(arg1, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9302((byte) 107), arg3, arg5, local16, arg2, Static480.anIntArray583, arg7, local21, arg6, Static577.aClass110Array1[Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144], Static70.anIntArray147, arg4, arg0);
			if (local98 < 1) {
				return false;
			}
			Static675.anInt10156 = Static70.anIntArray147[local98 - 1];
			Static212.anInt3466 = Static480.anIntArray583[local98 - 1];
			Static266.aBoolean583 = false;
			Static444.method5988();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IIB)V")
	public static void method2420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class2_Sub2_Sub2 local9 = Static440.method5963(5, (long) arg0);
		local9.method202();
		local9.anInt197 = arg1;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(JILclient!ha;)V")
	public static void method2421(@OriginalArg(0) long arg0, @OriginalArg(2) Class19 arg1) {
		Static452.anInt6869 = Static530.anInt8093;
		Static424.anInt6459 = 0;
		Static111.anInt2220 = 0;
		Static530.anInt8093 = 0;
		@Pc(16) long local16 = Static588.method7715();
		for (@Pc(21) Class8_Sub5 local21 = (Class8_Sub5) Static342.aClass130_7.method2790(); local21 != null; local21 = (Class8_Sub5) Static342.aClass130_7.method2785()) {
			if (local21.method3653(arg1, arg0)) {
				Static111.anInt2220++;
			}
		}
		if (Static615.aBoolean719 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static342.aClass130_7.method2784() + ", running: " + Static111.anInt2220);
			System.out.println("Emitters: " + Static424.anInt6459 + " Particles: " + Static530.anInt8093 + ". Time taken: " + (Static588.method7715() - local16) + "ms");
		}
	}
}
