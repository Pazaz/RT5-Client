import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "[I")
	public static int[] anIntArray450;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4948(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static150.aClass1_Sub16_Sub2_2.method5793(36);
			Static150.aClass1_Sub16_Sub2_2.method5771(method4951(arg0));
			Static150.aClass1_Sub16_Sub2_2.method5726(arg0);
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	public static void method4949() {
		@Pc(1) Class215 local1 = Static268.aClass215_81;
		synchronized (Static268.aClass215_81) {
			Static268.aClass215_81.method6060();
		}
		local1 = Static104.aClass215_41;
		synchronized (Static104.aClass215_41) {
			Static104.aClass215_41.method6060();
		}
		@Pc(38) Class115 local38 = Static299.aClass115_1;
		synchronized (Static299.aClass115_1) {
			Static299.aClass115_1.method3454();
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(BLjava/lang/String;)I")
	public static int method4951(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([Ljava/lang/Object;[JIBI)V")
	public static void method4952(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(23) int local23 = (arg2 + arg3) / 2;
		@Pc(25) int local25 = arg3;
		@Pc(29) long local29 = arg1[local23];
		arg1[local23] = arg1[arg2];
		arg1[arg2] = local29;
		@Pc(43) Object local43 = arg0[local23];
		arg0[local23] = arg0[arg2];
		arg0[arg2] = local43;
		for (@Pc(55) int local55 = arg3; local55 < arg2; local55++) {
			if (arg1[local55] < (long) (local55 & 0x1) + local29) {
				@Pc(76) long local76 = arg1[local55];
				arg1[local55] = arg1[local25];
				arg1[local25] = local76;
				@Pc(90) Object local90 = arg0[local55];
				arg0[local55] = arg0[local25];
				arg0[local25++] = local90;
			}
		}
		arg1[arg2] = arg1[local25];
		arg1[local25] = local29;
		arg0[arg2] = arg0[local25];
		arg0[local25] = local43;
		method4952(arg0, arg1, local25 - 1, arg3);
		method4952(arg0, arg1, arg2, local25 + 1);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!nr;II)Z")
	public static boolean method4953(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = (Static25.anInt850 - 104) / 2;
		@Pc(17) int local17 = (Static219.anInt4987 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static58.method1400(local21, local25, local29, arg1)) {
						local40 = local29;
						if (Static146.method3193(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static336.method5949(local40, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(83) int[] local83 = new int[262144];
		for (local29 = 0; local29 < local83.length; local29++) {
			local83[local29] = -16777216;
		}
		Static176.aClass29_14 = arg0.method2791(local83, 512, 512, 512);
		Static114.method5268();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 228 - (-(((int) (Math.random() * 20.0D) - 10) + 238 << 8) - ((int) (Math.random() * 20.0D))) | 0xFF000000;
		@Pc(157) int local157 = ((int) ((double) 20 * Math.random()) + 238 - 10 | 0xFF00) << 16;
		@Pc(176) int local176 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(180) boolean[][] local180 = new boolean[Static24.anInt801][Static24.anInt801];
		@Pc(186) int local186;
		@Pc(203) int local203;
		@Pc(207) int local207;
		@Pc(211) int local211;
		@Pc(264) int local264;
		@Pc(271) int local271;
		@Pc(275) int local275;
		@Pc(294) int local294;
		for (@Pc(182) int local182 = local11; local182 < local11 + 104; local182 += Static24.anInt801) {
			for (local186 = local17; local186 < local17 + 104; local186 += Static24.anInt801) {
				arg0.method2732(0, 0, Static24.anInt801 * 4, Static24.anInt801 * 4);
				arg0.method2735(-16777216);
				for (local203 = arg1; local203 <= 3; local203++) {
					for (local207 = 0; local207 < Static24.anInt801; local207++) {
						for (local211 = 0; local211 < Static24.anInt801; local211++) {
							local180[local207][local211] = Static58.method1400(local207 + local182, local211 + local186, local203, arg1);
						}
					}
					Static336.aClass77Array3[local203].method3984(local182, local186, Static24.anInt801 + local182, local186 + Static24.anInt801, local180);
					if (!Static188.aBoolean107) {
						for (local211 = -4; local211 < Static24.anInt801; local211++) {
							for (local264 = -4; local264 < Static24.anInt801; local264++) {
								local271 = local182 + local211;
								local275 = local264 + local186;
								if (local11 <= local271 && local275 >= local17 && Static58.method1400(local271, local275, local203, arg1)) {
									local294 = local203;
									if (Static146.method3193(local275, local271)) {
										local294 = local203 - 1;
									}
									if (local294 >= 0) {
										Static236.method4500(local40, local157, local211 * 4, local294, arg0, local275, local271, (Static24.anInt801 - local264) * 4 - 4);
									}
								}
							}
						}
					}
				}
				if (Static188.aBoolean107) {
					@Pc(344) Class22 local344 = Static66.aClass22Array1[arg1];
					for (local211 = 0; local211 < Static24.anInt801; local211++) {
						for (local264 = 0; local264 < Static24.anInt801; local264++) {
							local271 = local211 + local182;
							local275 = local264 + local186;
							local294 = local344.anIntArrayArray3[local271 - local344.anInt719][local275 - local344.anInt729];
							if ((local294 & 0x40240000) != 0) {
								arg0.method2745(4, 4, local211 * 4, (Static24.anInt801 - local264) * 4 - 4, -1713569622);
							} else if ((local294 & 0x800000) != 0) {
								arg0.method2769(local211 * 4, -1713569622, 4, (Static24.anInt801 - local264) * 4 - 4);
							} else if ((local294 & 0x2000000) != 0) {
								arg0.method2797((Static24.anInt801 - local264) * 4 - 4, -1713569622, local211 * 4 + 3, 4);
							} else if ((local294 & 0x8000000) != 0) {
								arg0.method2769(local211 * 4, -1713569622, 4, (Static24.anInt801 - local264) * 4 - 1);
							} else if ((local294 & 0x20000000) != 0) {
								arg0.method2797((Static24.anInt801 - local264) * 4 - 4, -1713569622, local211 * 4, 4);
							}
						}
					}
				}
				arg0.method2717(0, 0, Static24.anInt801 * 4, Static24.anInt801 * 4, local176, 2);
				Static176.aClass29_14.method5849((local182 - local11) * 4 + 48, -(Static24.anInt801 * 4) + (464 - (local186 - local17) * 4), Static24.anInt801 * 4, Static24.anInt801 * 4);
			}
		}
		arg0.method2788();
		arg0.method2735(-16777215);
		Static102.method2127();
		Static245.anInt3133 = 0;
		Static128.aClass130_19.method3754();
		if (!Static188.aBoolean107) {
			for (local186 = local11; local186 < local11 + 104; local186++) {
				for (local203 = local17; local203 < local17 + 104; local203++) {
					for (local207 = arg1; arg1 + 1 >= local207 && local207 <= 3; local207++) {
						if (Static58.method1400(local186, local203, local207, arg1)) {
							@Pc(610) Interface6 local610 = (Interface6) Static293.method5174(local207, local186, local203);
							if (local610 == null) {
								local610 = (Interface6) Static95.method2029(local207, local186, local203, Interface6.class);
							}
							if (local610 == null) {
								local610 = (Interface6) Static56.method1394(local207, local186, local203);
							}
							if (local610 == null) {
								local610 = (Interface6) Static169.method1651(local207, local186, local203);
							}
							if (local610 != null) {
								@Pc(650) Class189 local650 = Static83.method1840(local610.method5686());
								if (!local650.aBoolean440 || Static109.aBoolean184) {
									local271 = local650.anInt6184;
									if (local650.anIntArray470 != null) {
										for (local275 = 0; local275 < local650.anIntArray470.length; local275++) {
											if (local650.anIntArray470[local275] != -1) {
												@Pc(678) Class189 local678 = Static83.method1840(local650.anIntArray470[local275]);
												if (local678.anInt6184 >= 0) {
													local271 = local678.anInt6184;
												}
											}
										}
									}
									if (local271 >= 0) {
										@Pc(698) boolean local698 = false;
										if (local271 >= 0) {
											@Pc(704) Class107 local704 = Static292.method5169(local271);
											if (local704 != null && local704.aBoolean268) {
												local698 = true;
											}
										}
										local294 = local186;
										@Pc(715) int local715 = local203;
										if (local698) {
											@Pc(722) int[][] local722 = Static66.aClass22Array1[local207].anIntArrayArray3;
											@Pc(727) int local727 = Static66.aClass22Array1[local207].anInt719;
											@Pc(732) int local732 = Static66.aClass22Array1[local207].anInt729;
											for (@Pc(734) int local734 = 0; local734 < 10; local734++) {
												@Pc(741) int local741 = (int) (Math.random() * 4.0D);
												if (local741 == 0 && local294 > local11 && local186 - 3 < local294 && (local722[local294 - local727 - 1][local715 - local732] & 0x2C0108) == 0) {
													local294--;
												}
												if (local741 == 1 && local294 < local11 + 104 - 1 && local294 < local186 + 3 && (local722[local294 + 1 - local727][local715 - local732] & 0x2C0180) == 0) {
													local294++;
												}
												if (local741 == 2 && local715 > local17 && local715 > local203 - 3 && (local722[local294 - local727][local715 - local732 - 1] & 0x2C0102) == 0) {
													local715--;
												}
												if (local741 == 3 && local17 + 104 - 1 > local715 && local715 < local203 + 3 && (local722[local294 - local727][local715 + 1 - local732] & 0x2C0120) == 0) {
													local715++;
												}
											}
										}
										Static52.anIntArray101[Static245.anInt3133] = local650.anInt6205;
										Static58.anIntArray104[Static245.anInt3133] = local294;
										Static204.anIntArray355[Static245.anInt3133] = local715;
										Static245.anInt3133++;
									}
								}
							}
						}
					}
				}
			}
			if (Static79.aClass181_4 != null) {
				Static180.aClass162_146.anInt5438 = 1;
				Static74.method1735(1024, 64);
				for (local203 = 0; local203 < Static79.aClass181_4.anInt5956; local203++) {
					local207 = Static79.aClass181_4.anIntArray451[local203];
					if (local207 >> 28 == Static39.anInt1215) {
						local211 = (local207 >> 14 & 0x3FFF) - Static149.anInt3667;
						local264 = (local207 & 0x3FFF) - Static96.anInt2446;
						if (local211 >= 0 && local211 < Static25.anInt850 && local264 >= 0 && Static219.anInt4987 > local264) {
							Static128.aClass130_19.method3760(new Class1_Sub26(local203));
						} else {
							@Pc(996) Class107 local996 = Static292.method5169(Static79.aClass181_4.anIntArray452[local203]);
							if (local996.anIntArray271 != null && local996.anInt3770 + local211 >= 0 && local211 + local996.anInt3794 < Static25.anInt850 && local264 + local996.anInt3786 >= 0 && Static219.anInt4987 > local996.anInt3779 + local264) {
								Static128.aClass130_19.method3760(new Class1_Sub26(local203));
							}
						}
					}
				}
				Static74.method1735(128, 64);
				Static180.aClass162_146.anInt5438 = 2;
				Static180.aClass162_146.method4628();
			}
		}
		return true;
	}
}
