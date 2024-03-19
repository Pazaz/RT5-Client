import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!le", name = "i", descriptor = "[I")
	public static int[] anIntArray285;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "Ljava/lang/String;")
	public static final String aString152 = "glow3:";

	@OriginalMember(owner = "client!le", name = "s", descriptor = "[I")
	public static final int[] anIntArray286 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILclient!ro;)V")
	public static void method3499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class177 arg2) {
		if (arg2.anInt5764 == 1) {
			Static286.method5110(-1, 0L, arg2.aString211, 0, "", arg2.anInt5828, 29);
		}
		if (arg2.anInt5764 == 2 && !Static246.aBoolean472) {
			@Pc(40) String local40 = Static117.method2573(arg2);
			if (local40 != null) {
				Static286.method5110(-1, 0L, local40, -1, "<col=00ff00>" + arg2.aString215, arg2.anInt5828, 4);
			}
		}
		if (arg2.anInt5764 == 3) {
			Static286.method5110(-1, 0L, Static199.aString166, 0, "", arg2.anInt5828, 40);
		}
		if (arg2.anInt5764 == 4) {
			Static286.method5110(-1, 0L, arg2.aString211, 0, "", arg2.anInt5828, 34);
		}
		if (arg2.anInt5764 == 5) {
			Static286.method5110(-1, 0L, arg2.aString211, 0, "", arg2.anInt5828, 38);
		}
		if (arg2.anInt5764 == 6 && Static262.aClass177_15 == null) {
			Static286.method5110(-1, 0L, arg2.aString211, -1, "", arg2.anInt5828, 24);
		}
		@Pc(161) int local161;
		@Pc(155) int local155;
		if (arg2.anInt5838 == 2) {
			local155 = 0;
			for (@Pc(157) int local157 = 0; local157 < arg2.anInt5763; local157++) {
				for (local161 = 0; local161 < arg2.anInt5818; local161++) {
					@Pc(171) int local171 = (arg2.anInt5766 + 32) * local161;
					@Pc(179) int local179 = local157 * (arg2.anInt5805 + 32);
					if (local155 < 20) {
						local171 += arg2.anIntArray433[local155];
						local179 += arg2.anIntArray434[local155];
					}
					if (arg1 >= local171 && local179 <= arg0 && local171 + 32 > arg1 && local179 + 32 > arg0) {
						Static122.aClass177_8 = arg2;
						Static44.anInt947 = local155;
						if (arg2.anIntArray439[local155] > 0) {
							@Pc(238) Class1_Sub39 local238 = Static37.method930(arg2);
							@Pc(247) Class36 local247 = Static165.method3446(arg2.anIntArray439[local155] - 1);
							if (Static234.anInt5231 == 1 && local238.method5619()) {
								if (Static285.anInt6031 != arg2.anInt5828 || local155 != Static326.anInt6657) {
									Static286.method5110(Static350.anInt7317, (long) local247.anInt1255, Static252.aString195, local155, Static238.aString187 + " -> <col=ff9040>" + local247.aString51, arg2.anInt5828, 35);
								}
							} else if (Static246.aBoolean472 && local238.method5619()) {
								@Pc(576) Class1_Sub1_Sub18 local576 = Static245.anInt3134 == -1 ? null : Static231.method4389(Static245.anInt3134);
								if ((Static302.anInt6307 & 0x10) != 0 && (local576 == null || local247.method957(local576.anInt5129, Static245.anInt3134) != local576.anInt5129)) {
									Static286.method5110(Static355.anInt4215, (long) local247.anInt1255, Static49.aString57, local155, Static174.aString153 + " -> <col=ff9040>" + local247.aString51, arg2.anInt5828, 18);
								}
							} else {
								@Pc(265) String[] local265 = local247.aStringArray6;
								@Pc(273) int local273;
								@Pc(288) byte local288;
								@Pc(283) int local283;
								if (local238.method5619()) {
									for (local273 = 4; local273 >= 3; local273--) {
										if (local265 != null && local265[local273] != null) {
											local283 = -1;
											if (local273 == 3) {
												local288 = 31;
											} else {
												local288 = 2;
											}
											if (local273 == local247.anInt1234) {
												local283 = local247.anInt1254;
											}
											if (local273 == local247.anInt1259) {
												local283 = local247.anInt1217;
											}
											Static286.method5110(local283, (long) local247.anInt1255, local265[local273], local155, "<col=ff9040>" + local247.aString51, arg2.anInt5828, local288);
										}
									}
								}
								if (local238.method5621()) {
									Static286.method5110(Static350.anInt7317, (long) local247.anInt1255, Static252.aString195, local155, "<col=ff9040>" + local247.aString51, arg2.anInt5828, 11);
								}
								if (local238.method5619() && local265 != null) {
									for (local273 = 2; local273 >= 0; local273--) {
										if (local265[local273] != null) {
											local288 = 0;
											if (local273 == 0) {
												local288 = 30;
											}
											local283 = -1;
											if (local273 == 1) {
												local288 = 26;
											}
											if (local273 == 2) {
												local288 = 42;
											}
											if (local247.anInt1234 == local273) {
												local283 = local247.anInt1254;
											}
											if (local273 == local247.anInt1259) {
												local283 = local247.anInt1217;
											}
											Static286.method5110(local283, (long) local247.anInt1255, local265[local273], local155, "<col=ff9040>" + local247.aString51, arg2.anInt5828, local288);
										}
									}
								}
								local265 = arg2.aStringArray37;
								if (local265 != null) {
									for (local273 = 4; local273 >= 0; local273--) {
										if (local265[local273] != null) {
											local288 = 0;
											local283 = -1;
											if (local273 == 0) {
												local288 = 6;
											}
											if (local273 == 1) {
												local288 = 3;
											}
											if (local273 == 2) {
												local288 = 48;
											}
											if (local273 == 3) {
												local288 = 15;
											}
											if (local273 == 4) {
												local288 = 19;
											}
											if (local247.anInt1234 == local273) {
												local283 = local247.anInt1254;
											}
											if (local247.anInt1259 == local273) {
												local283 = local247.anInt1217;
											}
											Static286.method5110(local283, (long) local247.anInt1255, local265[local273], local155, "<col=ff9040>" + local247.aString51, arg2.anInt5828, local288);
										}
									}
								}
								Static286.method5110(Static192.anInt4458, (long) local247.anInt1255, Static165.aString150, local155, "<col=ff9040>" + local247.aString51, arg2.anInt5828, 1012);
							}
						}
					}
					local155++;
				}
			}
		}
		if (!arg2.aBoolean404) {
			return;
		}
		if (Static246.aBoolean472) {
			if (Static37.method930(arg2).method5623() && (Static302.anInt6307 & 0x20) != 0) {
				Static286.method5110(Static355.anInt4215, 0L, Static49.aString57, arg2.anInt5776, Static174.aString153 + " -> " + arg2.aString216, arg2.anInt5828, 22);
				return;
			}
			return;
		}
		@Pc(719) String local719;
		for (local155 = 9; local155 >= 5; local155--) {
			local719 = Static36.method877(arg2, local155);
			if (local719 != null) {
				Static286.method5110(Static132.method3022(arg2, local155), (long) (local155 + 1), local719, arg2.anInt5776, arg2.aString216, arg2.anInt5828, 1006);
			}
		}
		local719 = Static117.method2573(arg2);
		if (local719 != null) {
			Static286.method5110(-1, 0L, local719, arg2.anInt5776, arg2.aString216, arg2.anInt5828, 4);
		}
		for (local161 = 4; local161 >= 0; local161--) {
			@Pc(780) String local780 = Static36.method877(arg2, local161);
			if (local780 != null) {
				Static286.method5110(Static132.method3022(arg2, local161), (long) (local161 + 1), local780, arg2.anInt5776, arg2.aString216, arg2.anInt5828, 36);
			}
		}
		if (!Static37.method930(arg2).method5622()) {
			return;
		}
		if (arg2.aString212 != null) {
			Static286.method5110(-1, 0L, arg2.aString212, arg2.anInt5776, "", arg2.anInt5828, 24);
			return;
		}
		Static286.method5110(-1, 0L, Static181.aString157, arg2.anInt5776, "", arg2.anInt5828, 24);
		return;
	}
}
