import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
	public static int anInt7216;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "Lclient!r;")
	public static Js5 aClass197_95;

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "[I")
	public static final int[] anIntArray495 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIBIIIII)V")
	public static void method6452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg2 < 0 || Static373.anInt7033 - 1 <= arg5 || Static242.anInt4449 - 1 <= arg2) {
			return;
		}
		if (Scene.aClass67ArrayArrayArray3 == null) {
			return;
		}
		@Pc(43) Interface6 local43;
		if (arg3 == 0) {
			local43 = (Interface6) Static12.method283(arg6, arg5, arg2);
			@Pc(49) Interface6 local49 = (Interface6) Static99.method2143(arg6, arg5, arg2);
			if (local43 != null && arg0 != 2) {
				if (local43 instanceof Class11_Sub1_Sub2) {
					((Class11_Sub1_Sub2) local43).aClass192_1.method4934(arg1);
				} else {
					Static79.method1871(arg6, arg5, local43.method6085(), arg4, arg3, arg1, arg0, arg2);
				}
			}
			if (local49 != null) {
				if (!(local49 instanceof Class11_Sub1_Sub2)) {
					Static79.method1871(arg6, arg5, local49.method6085(), arg4, arg3, arg1, arg0, arg2);
					return;
				}
				((Class11_Sub1_Sub2) local49).aClass192_1.method4934(arg1);
				return;
			}
			return;
		}
		if (arg3 != 1) {
			if (arg3 == 2) {
				local43 = (Interface6) Static105.method2207(arg6, arg5, arg2, Interface6.class);
				if (local43 != null) {
					if (arg0 == 11) {
						arg0 = 10;
					}
					if (local43 instanceof Class11_Sub5_Sub5) {
						((Class11_Sub5_Sub5) local43).aClass192_4.method4934(arg1);
						return;
					}
					Static79.method1871(arg6, arg5, local43.method6085(), arg4, arg3, arg1, arg0, arg2);
					return;
				}
			} else if (arg3 == 3) {
				local43 = (Interface6) Static26.method865(arg6, arg5, arg2);
				if (local43 == null) {
					return;
				}
				if (!(local43 instanceof Class11_Sub2_Sub3)) {
					Static79.method1871(arg6, arg5, local43.method6085(), arg4, arg3, arg1, arg0, arg2);
					return;
				}
				((Class11_Sub2_Sub3) local43).aClass192_2.method4934(arg1);
			} else {
				return;
			}
			return;
		}
		local43 = (Interface6) Static28.method893(arg6, arg5, arg2);
		if (local43 == null) {
			return;
		}
		if (local43 instanceof Class11_Sub3_Sub3) {
			((Class11_Sub3_Sub3) local43).aClass192_3.method4934(arg1);
		} else {
			@Pc(207) int local207 = local43.method6085();
			if (arg0 == 4 || arg0 == 5) {
				Static79.method1871(arg6, arg5, local207, arg4, arg3, arg1, 4, arg2);
				return;
			}
			if (arg0 == 6) {
				Static79.method1871(arg6, arg5, local207, arg4 + 4, arg3, arg1, 4, arg2);
				return;
			}
			if (arg0 == 7) {
				Static79.method1871(arg6, arg5, local207, (arg4 + 2 & 0x3) + 4, arg3, arg1, 4, arg2);
				return;
			}
			if (arg0 == 8) {
				Static79.method1871(arg6, arg5, local207, arg4 + 4, arg3, arg1, 4, arg2);
				Static79.method1871(arg6, arg5, local207, (arg4 + 2 & 0x3) + 4, arg3, arg1, 4, arg2);
				return;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!cf;B)V")
	public static void method6454(@OriginalArg(0) Class2_Sub5 arg0) {
		if (!Static375.aBoolean477) {
			arg0.unlink();
			Static268.anInt4959--;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(CI)C")
	public static char method6455(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIB)V")
	public static void method6456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg3; local7++) {
			Static101.method2163(arg0, Static357.anIntArrayArray58[local7], arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method6458(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static193.anInt3556++;
		Static386.anInt6737 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static66.anInt1624; local7 < Scene.anInt1914; local7++) {
			@Pc(12) Class67[][] local12 = Scene.aClass67ArrayArrayArray3[local7];
			for (local14 = Static162.anInt2960; local14 < Static221.anInt4637; local14++) {
				for (@Pc(17) int local17 = Static222.anInt3949; local17 < Static29.anInt722; local17++) {
					@Pc(24) Class67 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Scene.aBooleanArrayArray1[local14 + Scene.anInt3788 - Static248.anInt4650][local17 + Scene.anInt3788 - Static211.anInt3780] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean138 = true;
							local24.aBoolean136 = true;
							if (local24.aClass22_2 == null) {
								local24.aBoolean137 = false;
							} else {
								local24.aBoolean137 = true;
							}
							Static386.anInt6737++;
						} else {
							local24.aBoolean138 = false;
							local24.aBoolean136 = false;
							local24.aByte9 = 0;
							if (local14 >= Static248.anInt4650 - 16 && local14 <= Static248.anInt4650 + 16 && local17 >= Static211.anInt3780 - 16 && local17 <= Static211.anInt3780 + 16 && (local24.aClass11_Sub1_3 != null || local24.aClass11_Sub1_2 != null || local24.aClass11_Sub3_2 != null || local24.aClass11_Sub3_3 != null || local24.aClass11_Sub2_2 != null || local24.aClass22_2 != null)) {
								Scene.aClass15_1.method1579(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Scene.aClass6Array2 == Scene.aClass6Array4;
		for (local14 = Static66.anInt1624; local14 < Scene.anInt1914; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static16.aClass19_10.method2871() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Scene.aBooleanArrayArray1.length;
				if (Static162.anInt2960 + Scene.aBooleanArrayArray1.length > Scene.anInt1684) {
					local172 -= Static162.anInt2960 + Scene.aBooleanArrayArray1.length - Scene.anInt1684;
				}
				@Pc(192) int local192 = Scene.aBooleanArrayArray1[0].length;
				if (Static222.anInt3949 + Scene.aBooleanArrayArray1[0].length > Scene.anInt3773) {
					local192 -= Static222.anInt3949 + Scene.aBooleanArrayArray1[0].length - Scene.anInt3773;
				}
				@Pc(213) int local213 = Static77.anInt1756;
				while (true) {
					if (local213 >= local172) {
						Scene.aClass15_1.method1577(Scene.aClass6Array4[local14], true, local161, local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static162.anInt2960 - Static77.anInt1756;
					for (@Pc(222) int local222 = Static329.anInt6167; local222 < local192; local222++) {
						Scene.aBooleanArrayArray5[local213][local222] = false;
						if (Scene.aBooleanArrayArray1[local213][local222]) {
							@Pc(241) int local241 = local222 + Static222.anInt3949 - Static329.anInt6167;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Scene.aClass67ArrayArrayArray3[local243][local220][local241] != null && Scene.aClass67ArrayArrayArray3[local243][local220][local241].aByte7 == local14) {
									Scene.aBooleanArrayArray5[local213][local222] = Scene.aClass67ArrayArrayArray3[local243][local220][local241].aBoolean138;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Scene.aClass15_1.method1577(Scene.aClass6Array4[local14], false, local161, local14);
			}
			Scene.aClass15_1.method1586();
		}
		if (!Static160.method2953(true)) {
			Static160.method2953(false);
		}
	}
}
