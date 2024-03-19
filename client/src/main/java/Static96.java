import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
	public static int anInt2446;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString91 = "";

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public static int anInt2440 = 0;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
	public static int anInt2444 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLclient!ai;)V")
	public static void method2036(@OriginalArg(1) Class7_Sub1_Sub1_Sub1 arg0) {
		if (Static237.anInt5285 >= 400) {
			return;
		}
		@Pc(19) Class75 local19 = arg0.aClass75_1;
		if (local19.anIntArray155 != null) {
			local19 = local19.method2064();
			if (local19 == null) {
				return;
			}
		}
		if (!local19.aBoolean164) {
			return;
		}
		@Pc(36) String local36 = local19.aString92;
		if (local19.anInt2468 != 0) {
			@Pc(46) String local46 = Static199.anInt4559 == 1 ? Static59.aString251 : Static91.aString89;
			local36 = local36 + Static160.method6127(local19.anInt2468, Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7133) + " (" + local46 + local19.anInt2468 + ")";
		}
		if (Static234.anInt5231 == 1) {
			Static286.method5110(Static350.anInt7317, (long) arg0.anInt7070, Static252.aString195, 0, Static238.aString187 + " -> <col=ffff00>" + local36, 0, 23);
		} else if (Static246.aBoolean472) {
			@Pc(108) Class1_Sub1_Sub18 local108 = Static245.anInt3134 == -1 ? null : Static231.method4389(Static245.anInt3134);
			if ((Static302.anInt6307 & 0x2) != 0) {
				if (local108 == null || local19.method2059(Static245.anInt3134, local108.anInt5129) != local108.anInt5129) {
					Static286.method5110(Static355.anInt4215, (long) arg0.anInt7070, Static49.aString57, 0, Static174.aString153 + " -> <col=ffff00>" + local36, 0, 13);
				}
				return;
			}
		} else {
			@Pc(158) String[] local158 = local19.lb;
			if (Static15.aBoolean43) {
				local158 = Static156.method3337(local158);
			}
			@Pc(168) int local168;
			if (local158 != null) {
				for (local168 = 4; local168 >= 0; local168--) {
					if (local158[local168] != null && (Static199.anInt4559 != 0 || !local158[local168].equalsIgnoreCase(Static283.aString221))) {
						@Pc(184) byte local184 = 0;
						@Pc(186) int local186 = Static183.anInt4318;
						if (local168 == 0) {
							local184 = 43;
						}
						if (local168 == 1) {
							local184 = 8;
						}
						if (local168 == 2) {
							local184 = 41;
						}
						if (local168 == 3) {
							local184 = 14;
						}
						if (local168 == 4) {
							local184 = 1;
						}
						if (local168 == local19.anInt2453) {
							local186 = local19.anInt2475;
						}
						if (local168 == local19.anInt2457) {
							local186 = local19.anInt2486;
						}
						Static286.method5110(local186, (long) arg0.anInt7070, local158[local168], 0, "<col=ffff00>" + local36, 0, local184);
					}
				}
			}
			if (Static199.anInt4559 == 0 && local158 != null) {
				for (local168 = 4; local168 >= 0; local168--) {
					if (local158[local168] != null && local158[local168].equalsIgnoreCase(Static283.aString221)) {
						@Pc(289) short local289 = 0;
						if (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7133 < local19.anInt2468) {
							local289 = 2000;
						}
						@Pc(302) short local302 = 0;
						if (local168 == 0) {
							local302 = 43;
						}
						if (local168 == 1) {
							local302 = 8;
						}
						if (local168 == 2) {
							local302 = 41;
						}
						if (local168 == 3) {
							local302 = 14;
						}
						if (local168 == 4) {
							local302 = 1;
						}
						if (local302 != 0) {
							local302 += local289;
						}
						Static286.method5110(local19.anInt2473, (long) arg0.anInt7070, local158[local168], 0, "<col=ffff00>" + local36, 0, local302);
					}
				}
			}
			Static286.method5110(Static192.anInt4458, (long) arg0.anInt7070, Static165.aString150, 0, "<col=ffff00>" + local36, 0, 1008);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!fg;)V")
	public static void method2037(@OriginalArg(1) Class7_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class7_Sub1_Sub1_Sub1) {
			@Pc(13) Class7_Sub1_Sub1_Sub1 local13 = (Class7_Sub1_Sub1_Sub1) arg0;
			if (local13.aClass75_1 != null) {
				method2036(local13);
				return;
			}
		} else if (arg0 instanceof Class7_Sub1_Sub1_Sub2) {
			Static285.method5100((Class7_Sub1_Sub1_Sub2) arg0);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!qj;)V")
	public static void method2038(@OriginalArg(1) Class162 arg0) {
		Static94.aClass162_85 = arg0;
		Static307.anInt6424 = Static94.aClass162_85.method4640(15);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[BI)I")
	public static int method2039(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg0; local14++) {
			local12 = Class1_Sub8.anIntArray132[(arg1[local14] ^ local12) & 0xFF] ^ local12 >>> 8;
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!nd;)V")
	public static void method2040(@OriginalArg(0) Class1_Sub9_Sub1 arg0) {
		if (Static273.anInt5747 >= 255) {
			return;
		}
		Static68.aClass1_Sub9_Sub1Array1[Static273.anInt5747] = arg0;
		Static174.aBooleanArray11[Static273.anInt5747] = false;
		Static273.anInt5747++;
		@Pc(18) int local18 = arg0.anInt4587;
		if (arg0.aBoolean323) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt4587;
		if (arg0.aBoolean322) {
			local26 = Static214.anInt4867 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt4576 + 64 - arg0.anInt4577 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt4576 + arg0.anInt4577 - 64 >> 7;
			if (local66 >= Static200.anInt4590) {
				local66 = Static200.anInt4590 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray88[local38++];
				@Pc(96) int local96 = (arg0.anInt4580 + 64 - arg0.anInt4577 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static328.anInt6717) {
					local104 = Static328.anInt6717 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = anIntArrayArrayArray3[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						anIntArrayArrayArray3[local35][local117][local75] = local126 | Static273.anInt5747;
					} else if ((local126 & 0xFF00) == 0) {
						anIntArrayArrayArray3[local35][local117][local75] = local126 | Static273.anInt5747 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						anIntArrayArrayArray3[local35][local117][local75] = local126 | Static273.anInt5747 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						anIntArrayArrayArray3[local35][local117][local75] = local126 | Static273.anInt5747 << 24;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public static void method2041() {
		if (Static89.anInt2369 <= 0) {
			Static189.aString162 = "";
			return;
		}
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < Static123.aStringArray19.length; local8++) {
			if (Static123.aStringArray19[local8].startsWith("--> ")) {
				local6++;
				if (local6 == Static89.anInt2369) {
					Static189.aString162 = Static123.aStringArray19[local8].substring(4);
					break;
				}
			}
		}
	}
}
