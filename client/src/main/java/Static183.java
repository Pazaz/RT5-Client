import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Lclient!qa;")
	public static Class29 aClass29_15;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "I")
	public static int anInt4321;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "I")
	public static int anInt4314 = -1;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	public static int anInt4317 = 127;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	public static int anInt4318 = -1;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
	public static final int[] anIntArray308 = new int[50];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Lclient!as;")
	public static Class1_Sub1_Sub3 method3711() {
		return Static201.aClass1_Sub1_Sub3_2;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!nr;IBILclient!lo;Lclient!os;Lclient!kb;)V")
	public static void method3712(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub21 arg4, @OriginalArg(6) Class146 arg5, @OriginalArg(7) Class107 arg6) {
		@Pc(15) int local15 = arg4.anInt4156 - arg2 / 2 - 5;
		@Pc(19) int local19 = arg0 + 2;
		if (arg6.anInt3781 != 0) {
			arg1.method2745(arg2 + 10, arg5.method4335() * arg3 + arg0 - local19 + 1, local15, local19, arg6.anInt3781);
		}
		if (arg6.anInt3784 != 0) {
			arg1.method2806(arg0 + arg5.method4335() * arg3 + 1 - local19, local15, arg2 + 10, local19, arg6.anInt3784);
		}
		@Pc(80) int local80 = arg6.anInt3767;
		if (arg4.aBoolean298 && arg6.anInt3795 != -1) {
			local80 = arg6.anInt3795;
		}
		for (@Pc(92) int local92 = 0; local92 < arg3; local92++) {
			@Pc(98) String local98 = Static91.aStringArray18[local92];
			if (local92 < arg3 - 1) {
				local98 = local98.substring(0, local98.length() - 4);
			}
			arg5.method4341(arg1, local98, arg4.anInt4156, arg0, local80);
			arg0 += arg5.method4335();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!oq;Lclient!pm;)V")
	public static void method3713(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class154 arg1) {
		if (!arg1.aBoolean370) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort62;
		@Pc(9) short local9 = arg1.aShort63;
		@Pc(12) byte local12 = arg1.aByte45;
		@Pc(15) byte local15 = arg1.aByte46;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class154[][] local31 = Static241.aClass154ArrayArrayArray2[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static137.aClass77Array2 == Static118.aClass77Array1) {
			local40 = Static350.anIntArrayArray58[local6][local9];
			Static332.aClass40_8.method2780(Static336.aClass77Array3[0].method3994(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 201.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static332.aClass40_8.method2796(3000.0F, local58 * 1.5F);
		@Pc(621) Class2_Sub3 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class154 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class2_Sub3 local382;
		@Pc(413) int local413;
		@Pc(416) Class7_Sub2 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean369) {
			if (Static141.aBoolean243) {
				if (local12 > 0) {
					local91 = Static241.aClass154ArrayArrayArray2[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean370) {
						return;
					}
				}
				if (local6 <= Static328.anInt6714 && local6 > Static76.anInt2086) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean370 && (local91.aBoolean369 || (arg1.aByte41 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static328.anInt6714 && local6 < Static53.anInt1599 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean370 && (local91.aBoolean369 || (arg1.aByte41 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static61.anInt1677 && local9 > Static29.anInt6406) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean370 && (local91.aBoolean369 || (arg1.aByte41 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static61.anInt1677 && local9 < Static130.anInt6803 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean370 && (local91.aBoolean369 || (arg1.aByte41 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static141.aBoolean243 = true;
			}
			arg1.aBoolean369 = false;
			if (arg1.aClass154_1 != null) {
				local91 = arg1.aClass154_1;
				Static332.aClass40_8.method2796(3000.0F, (201.5F - (float) (local91.aByte46 + 1) * 50.0F) * 1.5F);
				if (!Static24.method587(local91.aByte46, local6, local9)) {
					Static118.aClass77Array1[local91.aByte46].method4001(local6, local9);
				}
				@Pc(254) Class7_Sub2 local254 = local91.aClass7_Sub2_1;
				if (local254 != null) {
					if (Static46.aBoolean482) {
						if ((local254.anInt6404 & arg1.aShort64) == 0) {
							Static91.method2000(arg0, local12, local6, local9);
						} else {
							Static280.method5028(arg0, local254.anInt6404, local15, local6, local9);
						}
						Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
					}
					local254.method5951(Static332.aClass40_8);
				}
				for (@Pc(291) Class93 local291 = local91.aClass93_3; local291 != null; local291 = local291.aClass93_2) {
					@Pc(295) Class7_Sub1 local295 = local291.aClass7_Sub1_1;
					if (local295 != null) {
						if (Static46.aBoolean482) {
							Static91.method2000(arg0, local12, local6, local9);
							Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
						}
						local295.method5951(Static332.aClass40_8);
					}
				}
				Static332.aClass40_8.method2796(3000.0F, local58 * 1.5F);
			}
			local335 = !Static24.method587(local15, local6, local9);
			if (local335) {
				Static118.aClass77Array1[local15].method4001(local6, local9);
				@Pc(346) Class7_Sub5 local346 = arg1.aClass7_Sub5_1;
				if (local346 != null && local346.aBoolean278) {
					if (local346.aBoolean277) {
						Static332.aClass40_8.method2796(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static46.aBoolean482) {
						Static91.method2000(arg0, local12, local6, local9);
						Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
					}
					local382 = local346.method5951(Static332.aClass40_8);
					if (local382 != null) {
						local382.aClass7_1 = local346;
						local382.anInt2401 = local12;
						local382.anInt2407 = local6;
						local382.anInt2403 = local9;
						Static216.aClass58_8.method1670(local382);
					}
					if (local346.aBoolean277) {
						Static332.aClass40_8.method2796(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass7_Sub2_1;
			@Pc(419) Class7_Sub3 local419 = arg1.aClass7_Sub3_2;
			if (local416 != null || local419 != null) {
				if (Static328.anInt6714 == local6) {
					local411++;
				} else if (Static328.anInt6714 < local6) {
					local411 += 2;
				}
				if (Static61.anInt1677 == local9) {
					local411 += 3;
				} else if (Static61.anInt1677 > local9) {
					local411 += 6;
				}
				local413 = Static290.anIntArray464[local411];
				arg1.aShort64 = Static203.aShortArray11[local411];
			}
			if (local416 != null) {
				if ((local416.anInt6404 & Static43.anIntArray92[local411]) == 0) {
					arg1.aByte44 = 0;
				} else if (local416.anInt6404 == 16) {
					arg1.aByte44 = 3;
					arg1.aByte42 = Static175.aByteArray38[local411];
					arg1.aByte43 = (byte) (3 - arg1.aByte42);
				} else if (local416.anInt6404 == 32) {
					arg1.aByte44 = 6;
					arg1.aByte42 = Static80.aByteArray12[local411];
					arg1.aByte43 = (byte) (6 - arg1.aByte42);
				} else if (local416.anInt6404 == 64) {
					arg1.aByte44 = 12;
					arg1.aByte42 = Static157.aByteArray34[local411];
					arg1.aByte43 = (byte) (12 - arg1.aByte42);
				} else {
					arg1.aByte44 = 9;
					arg1.aByte42 = Static229.aByteArray69[local411];
					arg1.aByte43 = (byte) (9 - arg1.aByte42);
				}
				if ((local416.anInt6404 & local413) != 0 && !Static138.method3053(local15, local6, local9, local416.anInt6404)) {
					if (Static46.aBoolean482) {
						Static91.method2000(arg0, local12, local6, local9);
						Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
					}
					@Pc(568) Class2_Sub3 local568 = local416.method5951(Static332.aClass40_8);
					if (local568 != null) {
						local568.aClass7_1 = local416;
						local568.anInt2401 = local12;
						local568.anInt2407 = local6;
						local568.anInt2403 = local9;
						Static216.aClass58_8.method1670(local568);
					}
				}
				@Pc(589) Class7_Sub2 local589 = arg1.aClass7_Sub2_2;
				if (local589 != null && (local589.anInt6404 & local413) != 0 && !Static138.method3053(local15, local6, local9, local589.anInt6404)) {
					if (Static46.aBoolean482) {
						Static91.method2000(arg0, local12, local6, local9);
						Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
					}
					local621 = local589.method5951(Static332.aClass40_8);
					if (local621 != null) {
						local621.aClass7_1 = local589;
						local621.anInt2401 = local12;
						local621.anInt2407 = local6;
						local621.anInt2403 = local9;
						Static216.aClass58_8.method1670(local621);
					}
				}
			}
			if (local419 != null && !Static261.method4760(local15, local6, local9, local419.method5680())) {
				@Pc(652) Class7_Sub3 local652 = arg1.aClass7_Sub3_1;
				Static332.aClass40_8.method2796(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt6678 & local413) != 0) {
					if (Static46.aBoolean482) {
						Static91.method2000(arg0, local12, local6, local9);
						Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
					}
					local621 = local419.method5951(Static332.aClass40_8);
					if (local621 != null) {
						local621.aClass7_1 = local419;
						local621.anInt2401 = local12;
						local621.anInt2407 = local6;
						local621.anInt2403 = local9;
						Static216.aClass58_8.method1670(local621);
					}
				} else if (local419.anInt6678 == 256) {
					local711 = local419.anInt6683 - Static72.anInt1993;
					local716 = local419.anInt6685 - Static277.anInt5859;
					local719 = local419.anInt6679;
					if (local719 == 1 || local719 == 2) {
						local728 = -local711;
					} else {
						local728 = local711;
					}
					if (local719 == 2 || local719 == 3) {
						local740 = -local716;
					} else {
						local740 = local716;
					}
					if (Static46.aBoolean482) {
						Static91.method2000(arg0, local12, local6, local9);
						Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
					}
					@Pc(764) Class2_Sub3 local764;
					if (local740 < local728) {
						local764 = local419.method5951(Static332.aClass40_8);
						if (local764 != null) {
							local764.aClass7_1 = local419;
							local764.anInt2401 = local12;
							local764.anInt2407 = local6;
							local764.anInt2403 = local9;
							Static216.aClass58_8.method1670(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5951(Static332.aClass40_8);
						if (local764 != null) {
							local764.aClass7_1 = local652;
							local764.anInt2401 = local12;
							local764.anInt2407 = local6;
							local764.anInt2403 = local9;
							Static216.aClass58_8.method1670(local764);
						}
					}
				}
				Static332.aClass40_8.method2796(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class7_Sub5 local819 = arg1.aClass7_Sub5_1;
				if (local819 != null && !local819.aBoolean278) {
					if (local819.aBoolean277) {
						Static332.aClass40_8.method2796(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static46.aBoolean482) {
						Static91.method2000(arg0, local12, local6, local9);
						Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
					}
					local621 = local819.method5951(Static332.aClass40_8);
					if (local621 != null) {
						local621.aClass7_1 = local819;
						local621.anInt2401 = local12;
						local621.anInt2407 = local6;
						local621.anInt2403 = local9;
						Static216.aClass58_8.method1670(local621);
					}
					if (local819.aBoolean277) {
						Static332.aClass40_8.method2796(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class7_Sub4 local885 = arg1.aClass7_Sub4_1;
				if (local885 != null && !local885.aBoolean453) {
					if (Static46.aBoolean482) {
						Static91.method2000(arg0, local12, local6, local9);
						Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
					}
					@Pc(908) Class2_Sub3 local908 = local885.method5951(Static332.aClass40_8);
					if (local908 != null) {
						local908.aClass7_1 = local885;
						local908.anInt2401 = local12;
						local908.anInt2407 = local6;
						local908.anInt2403 = local9;
						Static216.aClass58_8.method1670(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte41;
			if (local929 != 0) {
				@Pc(946) Class154 local946;
				if (local6 < Static328.anInt6714 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean370) {
						Static110.aClass23_2.method1379(local946);
					}
				}
				if (local9 < Static61.anInt1677 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean370) {
						Static110.aClass23_2.method1379(local946);
					}
				}
				if (local6 > Static328.anInt6714 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean370) {
						Static110.aClass23_2.method1379(local946);
					}
				}
				if (local9 > Static61.anInt1677 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean370) {
						Static110.aClass23_2.method1379(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class7_Sub2 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class93 local1035;
		if (arg1.aByte44 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass93_3; local1035 != null; local1035 = local1035.aClass93_2) {
				if (local1035.aClass7_Sub1_1.anInt7034 != Static353.anInt7366 && (local1035.anInt3391 & arg1.aByte44) == arg1.aByte42) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass7_Sub2_1;
				if (!Static138.method3053(local15, local6, local9, local1062.anInt6404)) {
					if (Static46.aBoolean482) {
						label687: {
							if (local1062.anInt6404 >= 16) {
								local1079 = local6 - Static328.anInt6714;
								local1083 = local9 - Static61.anInt1677;
								if (local1062.anInt6404 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static200.anInt4590) {
										Static91.method2000(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt6404 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static328.anInt6717 && local9 < Static200.anInt4590) {
										Static91.method2000(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt6404 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static328.anInt6717 && local9 > 0) {
										Static91.method2000(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt6404 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static91.method2000(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static91.method2000(arg0, local12, local6, local9);
						}
						Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
					}
					@Pc(1197) Class2_Sub3 local1197 = local1062.method5951(Static332.aClass40_8);
					if (local1197 != null) {
						local1197.aClass7_1 = local1062;
						local1197.anInt2401 = local12;
						local1197.anInt2407 = local6;
						local1197.anInt2403 = local9;
						Static216.aClass58_8.method1670(local1197);
					}
				}
				arg1.aByte44 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean371) {
			try {
				arg1.aBoolean371 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass93_3; local1035 != null; local1035 = local1035.aClass93_2) {
					@Pc(1233) Class7_Sub1 local1233 = local1035.aClass7_Sub1_1;
					if (local1233.anInt7034 != Static353.anInt7366) {
						for (local1079 = local1233.aShort93; local1079 <= local1233.aShort92; local1079++) {
							for (local1083 = local1233.aShort91; local1083 <= local1233.aShort90; local1083++) {
								@Pc(1251) Class154 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean369) {
									arg1.aBoolean371 = true;
									continue label630;
								}
								if (local1251.aByte44 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort93) {
										local711++;
									}
									if (local1079 < local1233.aShort92) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort91) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort90) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte44) == arg1.aByte43) {
										arg1.aBoolean371 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static328.anInt6714 - local1233.aShort93;
						local1314 = local1233.aShort92 - Static328.anInt6714;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static61.anInt1677 - local1233.aShort91;
						local716 = local1233.aShort90 - Static61.anInt1677;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass7_Sub1Array2[local40] = local1233;
						arg0.anIntArray393[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class7_Sub1 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass7_Sub1Array2[local1083];
						if (local1365.anInt7034 != Static353.anInt7366) {
							local711 = arg0.anIntArray393[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt7027 - Static72.anInt1993;
								local719 = local1365.anInt7032 - Static277.anInt5859;
								local728 = arg0.aClass7_Sub1Array2[local1079].anInt7027 - Static72.anInt1993;
								local740 = arg0.aClass7_Sub1Array2[local1079].anInt7032 - Static277.anInt5859;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass7_Sub1Array2[local1079];
					local1365.anInt7034 = Static353.anInt7366;
					if (!Static143.method3165(local15, local1365.aShort93, local1365.aShort92, local1365.aShort91, local1365.aShort90, local1365.method5961())) {
						if (Static46.aBoolean482) {
							if (local1365.aByte73 == 0) {
								Static186.method3742(arg0, local12, local1365.aShort93, local1365.aShort91, local1365.aShort92, local1365.aShort90);
							} else {
								Static91.method2000(arg0, local12, local6, local9);
								local711 = local6 - Static328.anInt6714;
								local716 = local9 - Static61.anInt1677;
								if (local1365.aByte73 == 2) {
									if (local716 > -local711) {
										Static303.method5311(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static303.method5311(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static303.method5311(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static303.method5311(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
						}
						local621 = local1365.method5951(Static332.aClass40_8);
						if (local621 != null) {
							local621.aClass7_1 = local1365;
							local621.anInt2401 = local12;
							local621.anInt2407 = local1365.aShort93;
							local621.anInt2403 = local1365.aShort91;
							Static216.aClass58_8.method1670(local621);
						}
					}
					for (local711 = local1365.aShort93; local711 <= local1365.aShort92; local711++) {
						for (local716 = local1365.aShort91; local716 <= local1365.aShort90; local716++) {
							@Pc(1590) Class154 local1590 = local31[local711][local716];
							if (local1590.aByte44 != 0) {
								Static110.aClass23_2.method1379(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean370) {
								Static110.aClass23_2.method1379(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean371) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean371 = false;
			}
		}
		if (arg1.aClass117_1 != null) {
			if (arg1.aByte47 == (byte) (Static244.anInt2617 & 0xFF)) {
				@Pc(1645) Class117 local1645 = arg1.aClass117_1;
				local411 = Static118.aClass77Array1[local12].method3986(local6, local9);
				if (local12 < 3) {
					local413 = Static118.aClass77Array1[local12].method3986(local6, local9) - Static118.aClass77Array1[local12 + 1].method3986(local6, local9);
				} else {
					local413 = 1024;
				}
				Static192.aClass11_9.method5501(local21, local411, local27, arg0.anIntArray392);
				local1079 = arg0.anIntArray392[2];
				Static192.aClass11_9.method5501(local21, local411 - local413, local27, arg0.anIntArray392);
				local1083 = arg0.anIntArray392[2];
				local1314 = local1079;
				local711 = local1083;
				if (local1079 > local1083) {
					local1314 = local1083;
					local711 = local1079;
				}
				local1314 -= 91;
				local711 += 91;
				if (local1314 < local711 - 1597) {
					local1314 = local711 - 1597;
				}
				local1645.anInt4075 = local1314;
				local1645.anInt4076 = local711;
				local1645.aBoolean288 = true;
				Static332.aClass40_8.method2759(local1645);
			} else {
				arg1.aClass117_1 = null;
			}
		}
		if (!arg1.aBoolean370) {
			return;
		}
		if (arg1.aByte44 != 0) {
			return;
		}
		if (local6 <= Static328.anInt6714 && local6 > Static76.anInt2086) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean370) {
				return;
			}
		}
		if (local6 >= Static328.anInt6714 && local6 < Static53.anInt1599 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean370) {
				return;
			}
		}
		if (local9 <= Static61.anInt1677 && local9 > Static29.anInt6406) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean370) {
				return;
			}
		}
		if (local9 >= Static61.anInt1677 && local9 < Static130.anInt6803 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean370) {
				return;
			}
		}
		arg1.aBoolean370 = false;
		Static160.anInt7325--;
		@Pc(1839) Class7_Sub4 local1839 = arg1.aClass7_Sub4_1;
		if (local1839 != null && local1839.aBoolean453) {
			if (Static46.aBoolean482) {
				Static91.method2000(arg0, local12, local6, local9);
				Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
			}
			@Pc(1862) Class2_Sub3 local1862 = local1839.method5951(Static332.aClass40_8);
			if (local1862 != null) {
				local1862.aClass7_1 = local1839;
				local1862.anInt2401 = local12;
				local1862.anInt2407 = local6;
				local1862.anInt2403 = local9;
				Static216.aClass58_8.method1670(local1862);
			}
		}
		if (arg1.aShort64 != 0) {
			@Pc(1886) Class7_Sub3 local1886 = arg1.aClass7_Sub3_2;
			if (local1886 != null && !Static261.method4760(local15, local6, local9, local1886.method5680())) {
				if ((local1886.anInt6678 & arg1.aShort64) != 0) {
					if (Static46.aBoolean482) {
						Static91.method2000(arg0, local12, local6, local9);
						Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
					}
					local382 = local1886.method5951(Static332.aClass40_8);
					if (local382 != null) {
						local382.aClass7_1 = local1886;
						local382.anInt2401 = local12;
						local382.anInt2407 = local6;
						local382.anInt2403 = local9;
						Static216.aClass58_8.method1670(local382);
					}
				} else if (local1886.anInt6678 == 256) {
					local413 = local1886.anInt6683 - Static72.anInt1993;
					local1079 = local1886.anInt6685 - Static277.anInt5859;
					local1083 = local1886.anInt6679;
					if (local1083 == 1 || local1083 == 2) {
						local1314 = -local413;
					} else {
						local1314 = local413;
					}
					if (local1083 == 2 || local1083 == 3) {
						local711 = -local1079;
					} else {
						local711 = local1079;
					}
					if (Static46.aBoolean482) {
						Static91.method2000(arg0, local12, local6, local9);
						Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
					}
					@Pc(1996) Class7_Sub3 local1996 = arg1.aClass7_Sub3_1;
					@Pc(2004) Class2_Sub3 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5951(Static332.aClass40_8);
						if (local2004 != null) {
							local2004.aClass7_1 = local1886;
							local2004.anInt2401 = local12;
							local2004.anInt2407 = local6;
							local2004.anInt2403 = local9;
							Static216.aClass58_8.method1670(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5951(Static332.aClass40_8);
						if (local2004 != null) {
							local2004.aClass7_1 = local1996;
							local2004.anInt2401 = local12;
							local2004.anInt2407 = local6;
							local2004.anInt2403 = local9;
							Static216.aClass58_8.method1670(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass7_Sub2_1;
			local416 = arg1.aClass7_Sub2_2;
			@Pc(2089) Class2_Sub3 local2089;
			if (local416 != null && (local416.anInt6404 & arg1.aShort64) != 0 && !Static138.method3053(local15, local6, local9, local416.anInt6404)) {
				if (Static46.aBoolean482) {
					Static280.method5028(arg0, local416.anInt6404, local12, local6, local9);
					Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
				}
				local2089 = local416.method5951(Static332.aClass40_8);
				if (local2089 != null) {
					local2089.aClass7_1 = local416;
					local2089.anInt2401 = local12;
					local2089.anInt2407 = local6;
					local2089.anInt2403 = local9;
					Static216.aClass58_8.method1670(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt6404 & arg1.aShort64) != 0 && !Static138.method3053(local15, local6, local9, local1062.anInt6404)) {
				if (Static46.aBoolean482) {
					Static280.method5028(arg0, local1062.anInt6404, local12, local6, local9);
					Static332.aClass40_8.method2761(arg0.anInt5348, arg0.aClass1_Sub9_Sub1Array3);
				}
				local2089 = local1062.method5951(Static332.aClass40_8);
				if (local2089 != null) {
					local2089.aClass7_1 = local1062;
					local2089.anInt2401 = local12;
					local2089.anInt2407 = local6;
					local2089.anInt2403 = local9;
					Static216.aClass58_8.method1670(local2089);
				}
			}
		}
		@Pc(2175) Class154 local2175;
		if (local12 < Static214.anInt4867 - 1) {
			local2175 = Static241.aClass154ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean370) {
				Static110.aClass23_2.method1378(local2175);
			}
		}
		if (local6 < Static328.anInt6714) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean370) {
				Static110.aClass23_2.method1379(local2175);
			}
		}
		if (local9 < Static61.anInt1677) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean370) {
				Static110.aClass23_2.method1379(local2175);
			}
		}
		if (local6 > Static328.anInt6714) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean370) {
				Static110.aClass23_2.method1379(local2175);
			}
		}
		if (local9 > Static61.anInt1677) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean370) {
				Static110.aClass23_2.method1379(local2175);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BB)V")
	public static void method3714(@OriginalArg(1) byte arg0) {
		if (Static233.aByteArrayArrayArray13 == null) {
			Static233.aByteArrayArrayArray13 = new byte[4][Static25.anInt850][Static219.anInt4987];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static25.anInt850; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static219.anInt4987; local22++) {
					Static233.aByteArrayArrayArray13[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(CZI)C")
	public static char method3716(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Lclient!hq;")
	public static Class67 method3717() {
		try {
			return (Class67) Class.forName("Class67_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!nr;Lclient!cb;III)V")
	public static void method3718(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class154 local12;
		if (arg3 < Static328.anInt6717) {
			local12 = Static241.aClass154ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass7_Sub5_1 != null && local12.aClass7_Sub5_1.method5952()) {
				arg1.method5956(arg0, 0, 128, true, local12.aClass7_Sub5_1, 0);
			}
		}
		if (arg4 < Static328.anInt6717) {
			local12 = Static241.aClass154ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass7_Sub5_1 != null && local12.aClass7_Sub5_1.method5952()) {
				arg1.method5956(arg0, 128, 0, true, local12.aClass7_Sub5_1, 0);
			}
		}
		if (arg3 < Static328.anInt6717 && arg4 < Static200.anInt4590) {
			local12 = Static241.aClass154ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass7_Sub5_1 != null && local12.aClass7_Sub5_1.method5952()) {
				arg1.method5956(arg0, 128, 128, true, local12.aClass7_Sub5_1, 0);
			}
		}
		if (arg3 < Static328.anInt6717 && arg4 > 0) {
			local12 = Static241.aClass154ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass7_Sub5_1 != null && local12.aClass7_Sub5_1.method5952()) {
				arg1.method5956(arg0, -128, 128, true, local12.aClass7_Sub5_1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
	public static void method3719() {
		Static234.aClass215_72.method6060();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)Lclient!ro;")
	public static Class177 method3720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class177 local12 = Static298.method5252(arg1);
		if (arg0 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass177Array8 == null || local12.aClass177Array8.length <= arg0) {
			return null;
		} else {
			return local12.aClass177Array8[arg0];
		}
	}
}
