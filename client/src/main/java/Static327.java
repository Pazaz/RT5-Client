import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "[I")
	public static int[] anIntArray552;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
	public static int anInt6692 = 0;

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "J")
	public static volatile long aLong207 = 0L;

	@OriginalMember(owner = "client!vc", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString256 = null;

	@OriginalMember(owner = "client!vc", name = "ab", descriptor = "Z")
	public static boolean aBoolean487 = false;

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "Ljava/lang/String;")
	public static String aString257 = "Drop";

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([[BILclient!nr;[ZLclient!tc;[[BII[[BIILclient!lf;II)V")
	public static void method5689(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) Class191 arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class119 arg11, @OriginalArg(13) int arg12) {
		@Pc(49) int local49;
		if (arg4 != null && arg11 != null || arg11 != null && arg1 == 12 || arg4 != null && arg1 == 0) {
			@Pc(30) boolean[] local30 = arg4 != null && arg4.aBoolean447 ? Static58.aBooleanArrayArray1[arg1] : Static101.aBooleanArrayArray4[arg1];
			@Pc(57) Class191 local57;
			@Pc(74) byte local74;
			@Pc(90) int local90;
			@Pc(95) int local95;
			if (arg9 > 0) {
				if (arg12 > 0) {
					local49 = arg5[arg12 - 1][arg9 - 1] & 0xFF;
					if (local49 > 0) {
						local57 = Static295.method5207(local49 - 1);
						if (local57.anInt6235 != -1 && local57.aBoolean447) {
							local74 = arg0[arg12 - 1][arg9 - 1];
							local90 = arg8[arg12 - 1][arg9 - 1] * 2 + 4 & 0x7;
							local95 = Static190.method4601(arg2, local57);
							if (Static59.aBooleanArrayArray9[local74][local90]) {
								Static147.anIntArray256[0] = local57.anInt6235;
								Static164.anIntArray281[0] = local95;
								Static149.anIntArray265[0] = arg2.method2767() ? local57.anInt6233 : local57.anInt6234;
								Static68.anIntArray124[0] = local57.anInt6242;
								Static84.anIntArray141[0] = local57.anInt6245;
								Static328.anIntArray553[0] = 256;
							}
						}
					}
				}
				if (arg12 < arg10 - 1) {
					local49 = arg5[arg12 + 1][arg9 - 1] & 0xFF;
					if (local49 > 0) {
						local57 = Static295.method5207(local49 - 1);
						if (local57.anInt6235 != -1 && local57.aBoolean447) {
							local74 = arg0[arg12 + 1][arg9 - 1];
							local90 = arg8[arg12 + 1][arg9 - 1] * 2 + 6 & 0x7;
							local95 = Static190.method4601(arg2, local57);
							if (Static59.aBooleanArrayArray9[local74][local90]) {
								Static147.anIntArray256[2] = local57.anInt6235;
								Static164.anIntArray281[2] = local95;
								Static149.anIntArray265[2] = arg2.method2767() ? local57.anInt6233 : local57.anInt6234;
								Static68.anIntArray124[2] = local57.anInt6242;
								Static84.anIntArray141[2] = local57.anInt6245;
								Static328.anIntArray553[2] = 512;
							}
						}
					}
				}
			}
			if (arg9 < arg7 - 1) {
				if (arg12 > 0) {
					local49 = arg5[arg12 - 1][arg9 + 1] & 0xFF;
					if (local49 > 0) {
						local57 = Static295.method5207(local49 - 1);
						if (local57.anInt6235 != -1 && local57.aBoolean447) {
							local74 = arg0[arg12 - 1][arg9 + 1];
							local90 = arg8[arg12 - 1][arg9 + 1] * 2 + 2 & 0x7;
							local95 = Static190.method4601(arg2, local57);
							if (Static59.aBooleanArrayArray9[local74][local90]) {
								Static147.anIntArray256[6] = local57.anInt6235;
								Static164.anIntArray281[6] = local95;
								Static149.anIntArray265[6] = arg2.method2767() ? local57.anInt6233 : local57.anInt6234;
								Static68.anIntArray124[6] = local57.anInt6242;
								Static84.anIntArray141[6] = local57.anInt6245;
								Static328.anIntArray553[6] = 64;
							}
						}
					}
				}
				if (arg12 < arg10 - 1) {
					local49 = arg5[arg12 + 1][arg9 + 1] & 0xFF;
					if (local49 > 0) {
						local57 = Static295.method5207(local49 - 1);
						if (local57.anInt6235 != -1 && local57.aBoolean447) {
							local74 = arg0[arg12 + 1][arg9 + 1];
							local90 = arg8[arg12 + 1][arg9 + 1] * 2 & 0x7;
							local95 = Static190.method4601(arg2, local57);
							if (Static59.aBooleanArrayArray9[local74][local90]) {
								Static147.anIntArray256[4] = local57.anInt6235;
								Static164.anIntArray281[4] = local95;
								Static149.anIntArray265[4] = arg2.method2767() ? local57.anInt6233 : local57.anInt6234;
								Static68.anIntArray124[4] = local57.anInt6242;
								Static84.anIntArray141[4] = local57.anInt6245;
								Static328.anIntArray553[4] = 128;
							}
						}
					}
				}
			}
			@Pc(505) int local505;
			@Pc(510) int local510;
			@Pc(512) int local512;
			@Pc(494) byte local494;
			if (arg9 > 0) {
				local49 = arg5[arg12][arg9 - 1] & 0xFF;
				if (local49 > 0) {
					local57 = Static295.method5207(local49 - 1);
					if (local57.anInt6235 != -1) {
						local74 = arg0[arg12][arg9 - 1];
						local494 = arg8[arg12][arg9 - 1];
						if (local57.aBoolean447) {
							local95 = 2;
							local505 = local494 * 2 + 4;
							local510 = Static190.method4601(arg2, local57);
							for (local512 = 0; local512 < 3; local512++) {
								local505 &= 0x7;
								local95 &= 0x7;
								if (Static59.aBooleanArrayArray9[local74][local505] && Static84.anIntArray141[local95] <= local57.anInt6245) {
									Static147.anIntArray256[local95] = local57.anInt6235;
									Static164.anIntArray281[local95] = local510;
									Static149.anIntArray265[local95] = arg2.method2767() ? local57.anInt6233 : local57.anInt6234;
									Static68.anIntArray124[local95] = local57.anInt6242;
									if (Static84.anIntArray141[local95] == local57.anInt6245) {
										Static328.anIntArray553[local95] |= 0x20;
									} else {
										Static328.anIntArray553[local95] = 32;
									}
									Static84.anIntArray141[local95] = local57.anInt6245;
								}
								local505++;
								local95--;
							}
							if (!local30[arg6 & 0x3]) {
								arg3[0] = Static58.aBooleanArrayArray1[local74][local494 + 2 & 0x3];
							}
						} else if (!local30[arg6 & 0x3]) {
							arg3[0] = Static101.aBooleanArrayArray4[local74][local494 + 2 & 0x3];
						}
					}
				}
			}
			if (arg9 < arg7 - 1) {
				local49 = arg5[arg12][arg9 + 1] & 0xFF;
				if (local49 > 0) {
					local57 = Static295.method5207(local49 - 1);
					if (local57.anInt6235 != -1) {
						local74 = arg0[arg12][arg9 + 1];
						local494 = arg8[arg12][arg9 + 1];
						if (local57.aBoolean447) {
							local95 = 4;
							local505 = local494 * 2 + 2;
							local510 = Static190.method4601(arg2, local57);
							for (local512 = 0; local512 < 3; local512++) {
								local95 &= 0x7;
								local505 &= 0x7;
								if (Static59.aBooleanArrayArray9[local74][local505] && local57.anInt6245 >= Static84.anIntArray141[local95]) {
									Static147.anIntArray256[local95] = local57.anInt6235;
									Static164.anIntArray281[local95] = local510;
									Static149.anIntArray265[local95] = arg2.method2767() ? local57.anInt6233 : local57.anInt6234;
									Static68.anIntArray124[local95] = local57.anInt6242;
									if (local57.anInt6245 == Static84.anIntArray141[local95]) {
										Static328.anIntArray553[local95] |= 0x10;
									} else {
										Static328.anIntArray553[local95] = 16;
									}
									Static84.anIntArray141[local95] = local57.anInt6245;
								}
								local505--;
								local95++;
							}
							if (!local30[arg6 + 2 & 0x3]) {
								arg3[2] = Static58.aBooleanArrayArray1[local74][local494 & 0x3];
							}
						} else if (!local30[arg6 + 2 & 0x3]) {
							arg3[2] = Static101.aBooleanArrayArray4[local74][local494 & 0x3];
						}
					}
				}
			}
			if (arg12 > 0) {
				local49 = arg5[arg12 - 1][arg9] & 0xFF;
				if (local49 > 0) {
					local57 = Static295.method5207(local49 - 1);
					if (local57.anInt6235 != -1) {
						local74 = arg0[arg12 - 1][arg9];
						local494 = arg8[arg12 - 1][arg9];
						if (local57.aBoolean447) {
							local95 = 6;
							local505 = local494 * 2 + 4;
							local510 = Static190.method4601(arg2, local57);
							for (local512 = 0; local512 < 3; local512++) {
								local95 &= 0x7;
								local505 &= 0x7;
								if (Static59.aBooleanArrayArray9[local74][local505] && Static84.anIntArray141[local95] <= local57.anInt6245) {
									Static147.anIntArray256[local95] = local57.anInt6235;
									Static164.anIntArray281[local95] = local510;
									Static149.anIntArray265[local95] = arg2.method2767() ? local57.anInt6233 : local57.anInt6234;
									Static68.anIntArray124[local95] = local57.anInt6242;
									if (Static84.anIntArray141[local95] == local57.anInt6245) {
										Static328.anIntArray553[local95] |= 0x8;
									} else {
										Static328.anIntArray553[local95] = 8;
									}
									Static84.anIntArray141[local95] = local57.anInt6245;
								}
								local505--;
								local95++;
							}
							if (!local30[arg6 + 3 & 0x3]) {
								arg3[3] = Static58.aBooleanArrayArray1[local74][local494 + 1 & 0x3];
							}
						} else if (!local30[arg6 + 3 & 0x3]) {
							arg3[3] = Static101.aBooleanArrayArray4[local74][local494 + 1 & 0x3];
						}
					}
				}
			}
			if (arg10 - 1 > arg12) {
				local49 = arg5[arg12 + 1][arg9] & 0xFF;
				if (local49 > 0) {
					local57 = Static295.method5207(local49 - 1);
					if (local57.anInt6235 != -1) {
						local74 = arg0[arg12 + 1][arg9];
						local494 = arg8[arg12 + 1][arg9];
						if (local57.aBoolean447) {
							local95 = 4;
							local505 = local494 * 2 + 6;
							local510 = Static190.method4601(arg2, local57);
							for (local512 = 0; local512 < 3; local512++) {
								local505 &= 0x7;
								local95 &= 0x7;
								if (Static59.aBooleanArrayArray9[local74][local505] && local57.anInt6245 >= Static84.anIntArray141[local95]) {
									Static147.anIntArray256[local95] = local57.anInt6235;
									Static164.anIntArray281[local95] = local510;
									Static149.anIntArray265[local95] = arg2.method2767() ? local57.anInt6233 : local57.anInt6234;
									Static68.anIntArray124[local95] = local57.anInt6242;
									if (local57.anInt6245 == Static84.anIntArray141[local95]) {
										Static328.anIntArray553[local95] |= 0x4;
									} else {
										Static328.anIntArray553[local95] = 4;
									}
									Static84.anIntArray141[local95] = local57.anInt6245;
								}
								local505++;
								local95--;
							}
							if (!local30[arg6 + 1 & 0x3]) {
								arg3[1] = Static58.aBooleanArrayArray1[local74][local494 + 3 & 0x3];
							}
						} else if (!local30[arg6 + 1 & 0x3]) {
							arg3[1] = Static101.aBooleanArrayArray4[local74][local494 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg4 == null) {
			return;
		}
		@Pc(1196) int local1196 = Static190.method4601(arg2, arg4);
		if (!arg4.aBoolean447) {
			return;
		}
		for (local49 = 0; local49 < 8; local49++) {
			@Pc(1212) int local1212 = local49 - arg6 * 2 & 0x7;
			if (Static59.aBooleanArrayArray9[arg1][local49] && arg4.anInt6245 >= Static84.anIntArray141[local1212]) {
				Static147.anIntArray256[local1212] = arg4.anInt6235;
				Static164.anIntArray281[local1212] = local1196;
				Static149.anIntArray265[local1212] = arg2.method2767() ? arg4.anInt6233 : arg4.anInt6234;
				Static68.anIntArray124[local1212] = arg4.anInt6242;
				if (Static84.anIntArray141[local1212] == arg4.anInt6245) {
					Static328.anIntArray553[local1212] |= 0x2;
				} else {
					Static328.anIntArray553[local1212] = 2;
				}
				Static84.anIntArray141[local1212] = arg4.anInt6245;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIILclient!nr;)V")
	public static void method5690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class40 arg2) {
		Static185.aClass157ArrayArray1 = new Class157[arg1][arg0];
		Static344.aClass40_9 = arg2;
		if (Static170.anIntArray285 != null) {
			Static139.aClass94_1 = Static218.method4245(Static170.anIntArray285[3], Static170.anIntArray285[1], Static170.anIntArray285[5], Static170.anIntArray285[4], Static170.anIntArray285[0], Static170.anIntArray285[2]);
		}
		Static316.aClass157_2 = new Class157();
		Static149.method3229();
	}
}
