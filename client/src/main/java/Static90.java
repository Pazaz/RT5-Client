import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!eu", name = "B", descriptor = "Ljava/awt/Font;")
	public static Font aFont3;

	@OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
	public static int anInt6637;

	@OriginalMember(owner = "client!eu", name = "G", descriptor = "[[[Lclient!f;")
	public static Class67[][][] aClass67ArrayArrayArray4;

	@OriginalMember(owner = "client!eu", name = "H", descriptor = "Lclient!qi;")
	public static Class190 aClass190_3;

	@OriginalMember(owner = "client!eu", name = "E", descriptor = "[I")
	public static final int[] anIntArray460 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!hc;Lclient!f;)V")
	public static void method5950(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class67 arg1) {
		if (!arg1.aBoolean136) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort23;
		@Pc(9) short local9 = arg1.aShort22;
		@Pc(12) byte local12 = arg1.aByte10;
		@Pc(15) byte local15 = arg1.aByte7;
		@Pc(21) int local21 = (local6 << Static322.anInt6029) + Static253.anInt4693;
		@Pc(27) int local27 = (local9 << Static322.anInt6029) + Static253.anInt4693;
		@Pc(31) Class67[][] local31 = Static330.aClass67ArrayArrayArray3[local12];
		@Pc(53) float local53;
		if (Static186.aClass6Array2 == Static365.aClass6Array4) {
			Static16.aClass19_10.method2866(Static330.aClass6Array3[0].method5728(local21, local27), Static357.method5987(local6, local9), Static168.method6476(local6, local9), Static51.method1548(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static16.aClass19_10.method2823(3000.0F, local53 * 1.5F);
		@Pc(86) Class67 local86;
		@Pc(616) Class12_Sub4 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class12_Sub4 local377;
		@Pc(408) int local408;
		@Pc(411) Class11_Sub1 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean138) {
			if (Static79.aBoolean131) {
				if (local12 > 0) {
					local86 = Static330.aClass67ArrayArrayArray3[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean136) {
						return;
					}
				}
				if (local6 <= Static248.anInt4650 && local6 > Static162.anInt2960) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean136 && (local86.aBoolean138 || (arg1.aByte8 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static248.anInt4650 && local6 < Static221.anInt4637 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean136 && (local86.aBoolean138 || (arg1.aByte8 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static211.anInt3780 && local9 > Static222.anInt3949) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean136 && (local86.aBoolean138 || (arg1.aByte8 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static211.anInt3780 && local9 < Static29.anInt722 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean136 && (local86.aBoolean138 || (arg1.aByte8 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static79.aBoolean131 = true;
			}
			arg1.aBoolean138 = false;
			if (arg1.aClass67_1 != null) {
				local86 = arg1.aClass67_1;
				Static16.aClass19_10.method2823(3000.0F, (201.5F - (float) (local86.aByte7 + 1) * 50.0F) * 1.5F);
				if (!Static35.method1106(local86.aByte7, local6, local9)) {
					Static365.aClass6Array4[local86.aByte7].method5720(local6, local9);
				}
				@Pc(249) Class11_Sub1 local249 = local86.aClass11_Sub1_3;
				if (local249 != null) {
					if (Static161.aBoolean208) {
						if ((local249.anInt3482 & arg1.aShort21) == 0) {
							Static156.method2796(arg0, local12, local6, local9);
						} else {
							Static173.method3316(arg0, local249.anInt3482, local15, local6, local9);
						}
						Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
					}
					local249.method6073(Static16.aClass19_10);
				}
				for (@Pc(286) Class22 local286 = local86.aClass22_2; local286 != null; local286 = local286.aClass22_1) {
					@Pc(290) Class11_Sub5 local290 = local286.aClass11_Sub5_1;
					if (local290 != null) {
						if (Static161.aBoolean208) {
							Static156.method2796(arg0, local12, local6, local9);
							Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
						}
						local290.method6073(Static16.aClass19_10);
					}
				}
				Static16.aClass19_10.method2823(3000.0F, local53 * 1.5F);
			}
			local330 = !Static35.method1106(local15, local6, local9);
			if (local330) {
				Static365.aClass6Array4[local15].method5720(local6, local9);
				@Pc(341) Class11_Sub2 local341 = arg1.aClass11_Sub2_2;
				if (local341 != null && local341.aBoolean238) {
					if (local341.aBoolean239) {
						Static16.aClass19_10.method2823(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static161.aBoolean208) {
						Static156.method2796(arg0, local12, local6, local9);
						Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
					}
					local377 = local341.method6073(Static16.aClass19_10);
					if (local377 != null) {
						local377.aClass11_1 = local341;
						local377.anInt4073 = local12;
						local377.anInt4076 = local6;
						local377.anInt4075 = local9;
						Static34.aClass36_6.method1418(local377);
					}
					if (local341.aBoolean239) {
						Static16.aClass19_10.method2823(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass11_Sub1_3;
			@Pc(414) Class11_Sub3 local414 = arg1.aClass11_Sub3_2;
			if (local411 != null || local414 != null) {
				if (Static248.anInt4650 == local6) {
					local406++;
				} else if (Static248.anInt4650 < local6) {
					local406 += 2;
				}
				if (Static211.anInt3780 == local9) {
					local406 += 3;
				} else if (Static211.anInt3780 > local9) {
					local406 += 6;
				}
				local408 = Static306.anIntArray387[local406];
				arg1.aShort21 = Static124.aShortArray128[local406];
			}
			if (local411 != null) {
				if ((local411.anInt3482 & Static188.anIntArray206[local406]) == 0) {
					arg1.aByte9 = 0;
				} else if (local411.anInt3482 == 16) {
					arg1.aByte9 = 3;
					arg1.aByte12 = Static348.aByteArray94[local406];
					arg1.aByte11 = (byte) (3 - arg1.aByte12);
				} else if (local411.anInt3482 == 32) {
					arg1.aByte9 = 6;
					arg1.aByte12 = Static170.aByteArray33[local406];
					arg1.aByte11 = (byte) (6 - arg1.aByte12);
				} else if (local411.anInt3482 == 64) {
					arg1.aByte9 = 12;
					arg1.aByte12 = Static72.aByteArray23[local406];
					arg1.aByte11 = (byte) (12 - arg1.aByte12);
				} else {
					arg1.aByte9 = 9;
					arg1.aByte12 = Static268.aByteArray60[local406];
					arg1.aByte11 = (byte) (9 - arg1.aByte12);
				}
				if ((local411.anInt3482 & local408) != 0 && !Static45.method1401(local15, local6, local9, local411.anInt3482)) {
					if (Static161.aBoolean208) {
						Static156.method2796(arg0, local12, local6, local9);
						Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
					}
					@Pc(563) Class12_Sub4 local563 = local411.method6073(Static16.aClass19_10);
					if (local563 != null) {
						local563.aClass11_1 = local411;
						local563.anInt4073 = local12;
						local563.anInt4076 = local6;
						local563.anInt4075 = local9;
						Static34.aClass36_6.method1418(local563);
					}
				}
				@Pc(584) Class11_Sub1 local584 = arg1.aClass11_Sub1_2;
				if (local584 != null && (local584.anInt3482 & local408) != 0 && !Static45.method1401(local15, local6, local9, local584.anInt3482)) {
					if (Static161.aBoolean208) {
						Static156.method2796(arg0, local12, local6, local9);
						Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
					}
					local616 = local584.method6073(Static16.aClass19_10);
					if (local616 != null) {
						local616.aClass11_1 = local584;
						local616.anInt4073 = local12;
						local616.anInt4076 = local6;
						local616.anInt4075 = local9;
						Static34.aClass36_6.method1418(local616);
					}
				}
			}
			if (local414 != null && !Static65.method1734(local15, local6, local9, local414.method5748())) {
				@Pc(647) Class11_Sub3 local647 = arg1.aClass11_Sub3_3;
				Static16.aClass19_10.method2823(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt6346 & local408) != 0) {
					if (Static161.aBoolean208) {
						Static156.method2796(arg0, local12, local6, local9);
						Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
					}
					local616 = local414.method6073(Static16.aClass19_10);
					if (local616 != null) {
						local616.aClass11_1 = local414;
						local616.anInt4073 = local12;
						local616.anInt4076 = local6;
						local616.anInt4075 = local9;
						Static34.aClass36_6.method1418(local616);
					}
				} else if (local414.anInt6346 == 256) {
					local706 = local414.anInt6344 - Static353.anInt6532;
					local711 = local414.anInt6342 - Static359.anInt6697;
					local714 = local414.anInt6341;
					if (local714 == 1 || local714 == 2) {
						local723 = -local706;
					} else {
						local723 = local706;
					}
					if (local714 == 2 || local714 == 3) {
						local735 = -local711;
					} else {
						local735 = local711;
					}
					if (Static161.aBoolean208) {
						Static156.method2796(arg0, local12, local6, local9);
						Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
					}
					@Pc(759) Class12_Sub4 local759;
					if (local735 < local723) {
						local759 = local414.method6073(Static16.aClass19_10);
						if (local759 != null) {
							local759.aClass11_1 = local414;
							local759.anInt4073 = local12;
							local759.anInt4076 = local6;
							local759.anInt4075 = local9;
							Static34.aClass36_6.method1418(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method6073(Static16.aClass19_10);
						if (local759 != null) {
							local759.aClass11_1 = local647;
							local759.anInt4073 = local12;
							local759.anInt4076 = local6;
							local759.anInt4075 = local9;
							Static34.aClass36_6.method1418(local759);
						}
					}
				}
				Static16.aClass19_10.method2823(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class11_Sub2 local814 = arg1.aClass11_Sub2_2;
				if (local814 != null && !local814.aBoolean238) {
					if (local814.aBoolean239) {
						Static16.aClass19_10.method2823(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static161.aBoolean208) {
						Static156.method2796(arg0, local12, local6, local9);
						Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
					}
					local616 = local814.method6073(Static16.aClass19_10);
					if (local616 != null) {
						local616.aClass11_1 = local814;
						local616.anInt4073 = local12;
						local616.anInt4076 = local6;
						local616.anInt4075 = local9;
						Static34.aClass36_6.method1418(local616);
					}
					if (local814.aBoolean239) {
						Static16.aClass19_10.method2823(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class11_Sub4 local880 = arg1.aClass11_Sub4_1;
				if (local880 != null && !local880.aBoolean259) {
					if (Static161.aBoolean208) {
						Static156.method2796(arg0, local12, local6, local9);
						Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
					}
					@Pc(903) Class12_Sub4 local903 = local880.method6073(Static16.aClass19_10);
					if (local903 != null) {
						local903.aClass11_1 = local880;
						local903.anInt4073 = local12;
						local903.anInt4076 = local6;
						local903.anInt4075 = local9;
						Static34.aClass36_6.method1418(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte8;
			if (local924 != 0) {
				@Pc(941) Class67 local941;
				if (local6 < Static248.anInt4650 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean136) {
						Static163.aClass15_1.method1583(local941);
					}
				}
				if (local9 < Static211.anInt3780 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean136) {
						Static163.aClass15_1.method1583(local941);
					}
				}
				if (local6 > Static248.anInt4650 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean136) {
						Static163.aClass15_1.method1583(local941);
					}
				}
				if (local9 > Static211.anInt3780 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean136) {
						Static163.aClass15_1.method1583(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class11_Sub1 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class22 local1030;
		if (arg1.aByte9 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass22_2; local1030 != null; local1030 = local1030.aClass22_1) {
				if (local1030.aClass11_Sub5_1.anInt6779 != Static193.anInt3556 && (local1030.anInt645 & arg1.aByte9) == arg1.aByte12) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass11_Sub1_3;
				if (!Static45.method1401(local15, local6, local9, local1057.anInt3482)) {
					if (Static161.aBoolean208) {
						label686: {
							if (local1057.anInt3482 >= 16) {
								local1074 = local6 - Static248.anInt4650;
								local1078 = local9 - Static211.anInt3780;
								if (local1057.anInt3482 == 16) {
									local1074 -= Static253.anInt4693;
									local1078 += Static253.anInt4693;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static210.anInt3773) {
										Static156.method2796(arg0, local12, local6 - 1, local9 + 1);
										break label686;
									}
								} else if (local1057.anInt3482 == 32) {
									local1074 += Static253.anInt4693;
									local1078 += Static253.anInt4693;
									if (local1078 < -local1074 && local6 < Static72.anInt1684 && local9 < Static210.anInt3773) {
										Static156.method2796(arg0, local12, local6 + 1, local9 + 1);
										break label686;
									}
								} else if (local1057.anInt3482 == 64) {
									local1074 += Static253.anInt4693;
									local1078 -= Static253.anInt4693;
									if (local1078 > local1074 && local6 < Static72.anInt1684 && local9 > 0) {
										Static156.method2796(arg0, local12, local6 + 1, local9 - 1);
										break label686;
									}
								} else if (local1057.anInt3482 == 128) {
									local1074 -= Static253.anInt4693;
									local1078 -= Static253.anInt4693;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static156.method2796(arg0, local12, local6 - 1, local9 - 1);
										break label686;
									}
								}
							}
							Static156.method2796(arg0, local12, local6, local9);
						}
						Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
					}
					@Pc(1216) Class12_Sub4 local1216 = local1057.method6073(Static16.aClass19_10);
					if (local1216 != null) {
						local1216.aClass11_1 = local1057;
						local1216.anInt4073 = local12;
						local1216.anInt4076 = local6;
						local1216.anInt4075 = local9;
						Static34.aClass36_6.method1418(local1216);
					}
				}
				arg1.aByte9 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean137) {
			try {
				arg1.aBoolean137 = false;
				@Pc(1245) int local1245 = 0;
				label629: for (local1030 = arg1.aClass22_2; local1030 != null; local1030 = local1030.aClass22_1) {
					@Pc(1252) Class11_Sub5 local1252 = local1030.aClass11_Sub5_1;
					if (local1252.anInt6779 != Static193.anInt3556) {
						for (local1074 = local1252.aShort103; local1074 <= local1252.aShort104; local1074++) {
							for (local1078 = local1252.aShort101; local1078 <= local1252.aShort102; local1078++) {
								@Pc(1270) Class67 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean138) {
									arg1.aBoolean137 = true;
									continue label629;
								}
								if (local1270.aByte9 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort103) {
										local706++;
									}
									if (local1074 < local1252.aShort104) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort101) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort102) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte9) == arg1.aByte11) {
										arg1.aBoolean137 = true;
										continue label629;
									}
								}
							}
						}
						local1078 = Static248.anInt4650 - local1252.aShort103;
						local1333 = local1252.aShort104 - Static248.anInt4650;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static211.anInt3780 - local1252.aShort101;
						local711 = local1252.aShort102 - Static211.anInt3780;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass11_Sub5Array3[local1245] = local1252;
						arg0.anIntArray486[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class11_Sub5 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass11_Sub5Array3[local1078];
						if (local1384.anInt6779 != Static193.anInt3556) {
							local706 = arg0.anIntArray486[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6781 - Static353.anInt6532;
								local714 = local1384.anInt6783 - Static359.anInt6697;
								local723 = arg0.aClass11_Sub5Array3[local1074].anInt6781 - Static353.anInt6532;
								local735 = arg0.aClass11_Sub5Array3[local1074].anInt6783 - Static359.anInt6697;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass11_Sub5Array3[local1074];
					local1384.anInt6779 = Static193.anInt3556;
					if (!Static305.method5223(local15, local1384.aShort103, local1384.aShort104, local1384.aShort101, local1384.aShort102, local1384.method6080())) {
						if (Static161.aBoolean208) {
							if (local1384.aByte77 == 0) {
								Static324.method5536(arg0, local12, local1384.aShort103, local1384.aShort101, local1384.aShort104, local1384.aShort102);
							} else {
								Static156.method2796(arg0, local12, local6, local9);
								local706 = local6 - Static248.anInt4650;
								local711 = local9 - Static211.anInt3780;
								if (local1384.aByte77 == 2) {
									if (local711 > -local706) {
										Static296.method5103(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static296.method5103(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static296.method5103(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static296.method5103(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
						}
						local616 = local1384.method6073(Static16.aClass19_10);
						if (local616 != null) {
							local616.aClass11_1 = local1384;
							local616.anInt4073 = local12;
							local616.anInt4076 = local1384.aShort103;
							local616.anInt4075 = local1384.aShort101;
							Static34.aClass36_6.method1418(local616);
						}
					}
					for (local706 = local1384.aShort103; local706 <= local1384.aShort104; local706++) {
						for (local711 = local1384.aShort101; local711 <= local1384.aShort102; local711++) {
							@Pc(1609) Class67 local1609 = local31[local706][local711];
							if (local1609.aByte9 != 0) {
								Static163.aClass15_1.method1583(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean136) {
								Static163.aClass15_1.method1583(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean137) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean137 = false;
			}
		}
		if (arg1.aClass224_1 != null && arg1.aByte13 == (byte) (Static292.anInt5512 & 0xFF)) {
			@Pc(1664) Class224 local1664 = arg1.aClass224_1;
			local406 = Static365.aClass6Array4[local12].method5719(local6, local9);
			if (local12 < Static92.anInt1914 - 1) {
				local408 = Static365.aClass6Array4[local12].method5719(local6, local9) - Static365.aClass6Array4[local12 + 1].method5719(local6, local9);
			} else {
				local408 = 1024;
			}
			Static51.aClass14_2.method3934(local21, local406, local27, arg0.anIntArray487);
			local1074 = arg0.anIntArray487[2];
			Static51.aClass14_2.method3934(local21, local406 - local408, local27, arg0.anIntArray487);
			local1078 = arg0.anIntArray487[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static313.anInt5876;
			local706 += Static313.anInt5876;
			if (local1333 < local706 - 1597) {
				local1333 = local706 - 1597;
			}
			local1664.anInt6369 = local1333;
			local1664.anInt6371 = local706;
			local1664.aBoolean429 = true;
			Static16.aClass19_10.method2833(local1664);
		}
		if (!arg1.aBoolean136) {
			return;
		}
		if (arg1.aByte9 != 0) {
			return;
		}
		if (local6 <= Static248.anInt4650 && local6 > Static162.anInt2960) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean136) {
				return;
			}
		}
		if (local6 >= Static248.anInt4650 && local6 < Static221.anInt4637 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean136) {
				return;
			}
		}
		if (local9 <= Static211.anInt3780 && local9 > Static222.anInt3949) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean136) {
				return;
			}
		}
		if (local9 >= Static211.anInt3780 && local9 < Static29.anInt722 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean136) {
				return;
			}
		}
		arg1.aBoolean136 = false;
		Static386.anInt6737--;
		@Pc(1862) Class11_Sub4 local1862 = arg1.aClass11_Sub4_1;
		if (local1862 != null && local1862.aBoolean259) {
			if (Static161.aBoolean208) {
				Static156.method2796(arg0, local12, local6, local9);
				Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
			}
			@Pc(1885) Class12_Sub4 local1885 = local1862.method6073(Static16.aClass19_10);
			if (local1885 != null) {
				local1885.aClass11_1 = local1862;
				local1885.anInt4073 = local12;
				local1885.anInt4076 = local6;
				local1885.anInt4075 = local9;
				Static34.aClass36_6.method1418(local1885);
			}
		}
		if (arg1.aShort21 != 0) {
			@Pc(1909) Class11_Sub3 local1909 = arg1.aClass11_Sub3_2;
			if (local1909 != null && !Static65.method1734(local15, local6, local9, local1909.method5748())) {
				if ((local1909.anInt6346 & arg1.aShort21) != 0) {
					if (Static161.aBoolean208) {
						Static156.method2796(arg0, local12, local6, local9);
						Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
					}
					local377 = local1909.method6073(Static16.aClass19_10);
					if (local377 != null) {
						local377.aClass11_1 = local1909;
						local377.anInt4073 = local12;
						local377.anInt4076 = local6;
						local377.anInt4075 = local9;
						Static34.aClass36_6.method1418(local377);
					}
				} else if (local1909.anInt6346 == 256) {
					local408 = local1909.anInt6344 - Static353.anInt6532;
					local1074 = local1909.anInt6342 - Static359.anInt6697;
					local1078 = local1909.anInt6341;
					if (local1078 == 1 || local1078 == 2) {
						local1333 = -local408;
					} else {
						local1333 = local408;
					}
					if (local1078 == 2 || local1078 == 3) {
						local706 = -local1074;
					} else {
						local706 = local1074;
					}
					if (Static161.aBoolean208) {
						Static156.method2796(arg0, local12, local6, local9);
						Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
					}
					@Pc(2019) Class11_Sub3 local2019 = arg1.aClass11_Sub3_3;
					@Pc(2027) Class12_Sub4 local2027;
					if (local706 > local1333) {
						local2027 = local1909.method6073(Static16.aClass19_10);
						if (local2027 != null) {
							local2027.aClass11_1 = local1909;
							local2027.anInt4073 = local12;
							local2027.anInt4076 = local6;
							local2027.anInt4075 = local9;
							Static34.aClass36_6.method1418(local2027);
						}
					} else if (local2019 != null) {
						local2027 = local2019.method6073(Static16.aClass19_10);
						if (local2027 != null) {
							local2027.aClass11_1 = local2019;
							local2027.anInt4073 = local12;
							local2027.anInt4076 = local6;
							local2027.anInt4075 = local9;
							Static34.aClass36_6.method1418(local2027);
						}
					}
				}
			}
			local1057 = arg1.aClass11_Sub1_3;
			local411 = arg1.aClass11_Sub1_2;
			@Pc(2112) Class12_Sub4 local2112;
			if (local411 != null && (local411.anInt3482 & arg1.aShort21) != 0 && !Static45.method1401(local15, local6, local9, local411.anInt3482)) {
				if (Static161.aBoolean208) {
					Static173.method3316(arg0, local411.anInt3482, local12, local6, local9);
					Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
				}
				local2112 = local411.method6073(Static16.aClass19_10);
				if (local2112 != null) {
					local2112.aClass11_1 = local411;
					local2112.anInt4073 = local12;
					local2112.anInt4076 = local6;
					local2112.anInt4075 = local9;
					Static34.aClass36_6.method1418(local2112);
				}
			}
			if (local1057 != null && (local1057.anInt3482 & arg1.aShort21) != 0 && !Static45.method1401(local15, local6, local9, local1057.anInt3482)) {
				if (Static161.aBoolean208) {
					Static173.method3316(arg0, local1057.anInt3482, local12, local6, local9);
					Static16.aClass19_10.method2834(arg0.anInt7113, arg0.aClass2_Sub26_Sub1Array3);
				}
				local2112 = local1057.method6073(Static16.aClass19_10);
				if (local2112 != null) {
					local2112.aClass11_1 = local1057;
					local2112.anInt4073 = local12;
					local2112.anInt4076 = local6;
					local2112.anInt4075 = local9;
					Static34.aClass36_6.method1418(local2112);
				}
			}
		}
		@Pc(2198) Class67 local2198;
		if (local12 < Static92.anInt1914 - 1) {
			local2198 = Static330.aClass67ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2198 != null && local2198.aBoolean136) {
				Static163.aClass15_1.method1584(local2198);
			}
		}
		if (local6 < Static248.anInt4650) {
			local2198 = local31[local6 + 1][local9];
			if (local2198 != null && local2198.aBoolean136) {
				Static163.aClass15_1.method1583(local2198);
			}
		}
		if (local9 < Static211.anInt3780) {
			local2198 = local31[local6][local9 + 1];
			if (local2198 != null && local2198.aBoolean136) {
				Static163.aClass15_1.method1583(local2198);
			}
		}
		if (local6 > Static248.anInt4650) {
			local2198 = local31[local6 - 1][local9];
			if (local2198 != null && local2198.aBoolean136) {
				Static163.aClass15_1.method1583(local2198);
			}
		}
		if (local9 > Static211.anInt3780) {
			local2198 = local31[local6][local9 - 1];
			if (local2198 != null && local2198.aBoolean136) {
				Static163.aClass15_1.method1583(local2198);
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "(Z)V")
	public static void method5953() {
		Static336.method5705(25);
		Static114.method2362();
		System.gc();
	}
}
