import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
	public static int anInt6552 = 0;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	public static int anInt6553 = -1;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
	public static final int anInt6558 = 12;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	public static void method5593() {
		Static319.anInt6579 = 0;
		@Pc(12) int local12 = Static149.anInt3667 + (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 >> 7);
		@Pc(19) int local19 = Static96.anInt2446 + (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static319.anInt6579 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static319.anInt6579 = 1;
		}
		if (Static319.anInt6579 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static319.anInt6579 = 0;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)Lclient!ps;")
	public static Class158 method5594(@OriginalArg(0) int arg0) {
		@Pc(5) Class215 local5 = Static285.aClass215_84;
		@Pc(16) Class158 local16;
		synchronized (Static285.aClass215_84) {
			local16 = (Class158) Static285.aClass215_84.method6057((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) byte[] local36 = Static115.aClass162_99.method4636(Static124.method2653(arg0), Static20.method502(arg0));
		local16 = new Class158();
		if (local36 != null) {
			local16.method4558(new Class1_Sub16(local36));
		}
		@Pc(51) Class215 local51 = Static285.aClass215_84;
		synchronized (Static285.aClass215_84) {
			Static285.aClass215_84.method6050(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
	public static void method5595() {
		Static128.method2891(false);
		Static138.anInt3431 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static93.aByteArrayArray22.length; local14++) {
			if (Static264.anIntArray414[local14] != -1 && Static93.aByteArrayArray22[local14] == null) {
				Static93.aByteArrayArray22[local14] = Static50.aClass162_56.method4636(0, Static264.anIntArray414[local14]);
				if (Static93.aByteArrayArray22[local14] == null) {
					local12 = false;
					Static138.anInt3431++;
				}
			}
			if (Static114.anIntArray483[local14] != -1 && Static139.aByteArrayArray26[local14] == null) {
				Static139.aByteArrayArray26[local14] = Static50.aClass162_56.method4632(Static80.anIntArrayArray8[local14], Static114.anIntArray483[local14], 0);
				if (Static139.aByteArrayArray26[local14] == null) {
					local12 = false;
					Static138.anInt3431++;
				}
			}
			if (Static49.anIntArray98[local14] != -1 && Static32.aByteArrayArray56[local14] == null) {
				Static32.aByteArrayArray56[local14] = Static50.aClass162_56.method4636(0, Static49.anIntArray98[local14]);
				if (Static32.aByteArrayArray56[local14] == null) {
					Static138.anInt3431++;
					local12 = false;
				}
			}
			if (Static102.anIntArray163[local14] != -1 && Static340.aByteArrayArray57[local14] == null) {
				Static340.aByteArrayArray57[local14] = Static50.aClass162_56.method4636(0, Static102.anIntArray163[local14]);
				if (Static340.aByteArrayArray57[local14] == null) {
					Static138.anInt3431++;
					local12 = false;
				}
			}
			if (Static304.anIntArray487 != null && Static171.aByteArrayArray36[local14] == null && Static304.anIntArray487[local14] != -1) {
				Static171.aByteArrayArray36[local14] = Static50.aClass162_56.method4632(Static80.anIntArrayArray8[local14], Static304.anIntArray487[local14], 0);
				if (Static171.aByteArrayArray36[local14] == null) {
					local12 = false;
					Static138.anInt3431++;
				}
			}
		}
		if (Static79.aClass181_4 == null) {
			if (Static335.aClass1_Sub1_Sub3_3 == null || !Static139.aClass162_120.method4643(Static335.aClass1_Sub1_Sub3_3.aString20 + "_staticelements")) {
				Static79.aClass181_4 = new Class181(0);
			} else if (Static139.aClass162_120.method4617(Static335.aClass1_Sub1_Sub3_3.aString20 + "_staticelements")) {
				Static79.aClass181_4 = Static87.method1939(Static335.aClass1_Sub1_Sub3_3.aString20 + "_staticelements", Static139.aClass162_120, Static109.aBoolean184);
			} else {
				Static138.anInt3431++;
				local12 = false;
			}
		}
		if (!local12) {
			Static200.anInt4589 = 1;
			return;
		}
		local12 = true;
		Static1.anInt87 = 0;
		@Pc(271) int local271;
		@Pc(282) int local282;
		for (@Pc(253) int local253 = 0; local253 < Static93.aByteArrayArray22.length; local253++) {
			@Pc(259) byte[] local259 = Static139.aByteArrayArray26[local253];
			if (local259 != null) {
				local271 = (Static112.anIntArray204[local253] >> 8) * 64 - Static149.anInt3667;
				local282 = (Static112.anIntArray204[local253] & 0xFF) * 64 - Static96.anInt2446;
				if (Static24.aBoolean52) {
					local271 = 10;
					local282 = 10;
				}
				local12 &= Static244.method2180(local271, local259, local282);
			}
			local259 = Static340.aByteArrayArray57[local253];
			if (local259 != null) {
				local271 = (Static112.anIntArray204[local253] >> 8) * 64 - Static149.anInt3667;
				local282 = (Static112.anIntArray204[local253] & 0xFF) * 64 - Static96.anInt2446;
				if (Static24.aBoolean52) {
					local271 = 10;
					local282 = 10;
				}
				local12 &= Static244.method2180(local271, local259, local282);
			}
		}
		if (!local12) {
			Static200.anInt4589 = 2;
			return;
		}
		if (Static200.anInt4589 != 0) {
			Static104.method2158(true, Static17.aString24 + "<br>(100%)", Static290.aClass30_3);
		}
		Static56.method1395();
		Static4.method147();
		@Pc(367) boolean local367 = false;
		if (Static221.aClass40_6.method2799() && Static307.aBoolean465) {
			for (local271 = 0; local271 < Static93.aByteArrayArray22.length; local271++) {
				if (Static340.aByteArrayArray57[local271] != null || Static32.aByteArrayArray56[local271] != null) {
					local367 = true;
					break;
				}
			}
		}
		if (Static200.aBoolean321) {
			local271 = Static59.anIntArray537[Static152.anInt3744];
		} else {
			local271 = Static186.anIntArray310[Static152.anInt3744];
		}
		if (Static221.aClass40_6.method2730()) {
			local271++;
		}
		Static64.method1505(Static25.anInt850, Static219.anInt4987, local271, local367, Static221.aClass40_6.method2709() > 0);
		for (local282 = 0; local282 < 4; local282++) {
			Static66.aClass22Array1[local282].method526();
		}
		Static99.method2073();
		Static265.method4793(false);
		Static149.method3229();
		Static56.method1395();
		System.gc();
		Static128.method2891(true);
		Static10.method337(4, false);
		@Pc(458) int[][] local458 = null;
		if (!Static24.aBoolean52) {
			Static99.method2071(false);
			Static173.method3530(Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0] >> 3, Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0] >> 3);
			Static50.method1359();
			Static90.method1979(4, Static221.aClass40_6, false, null);
			local458 = Static220.anIntArrayArrayArray9[0];
			Static128.method2891(true);
			Static352.method6144(false);
			if (Static171.aByteArrayArray36 != null) {
				Static211.method2754();
			}
		}
		if (Static24.aBoolean52) {
			Static132.method3024(false);
			Static173.method3530(Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0] >> 3, Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0] >> 3);
			Static50.method1359();
			Static90.method1979(4, Static221.aClass40_6, false, null);
			local458 = Static220.anIntArrayArrayArray9[0];
			Static128.method2891(true);
			method5597(false);
		}
		Static4.method147();
		Static128.method2891(true);
		Static238.method4509(Static221.aClass40_6, null, Static66.aClass22Array1, 4, false);
		Static202.method4040(4, Static221.aClass40_6);
		Static128.method2891(true);
		@Pc(557) int local557 = Static302.anInt6301;
		if (Static39.anInt1215 < local557) {
			local557 = Static39.anInt1215;
		}
		if (local557 < Static39.anInt1215 - 1) {
			local557 = Static39.anInt1215 - 1;
		}
		if (Static13.method5497()) {
			Static105.method2185(0);
		} else {
			Static105.method2185(local557);
		}
		Static47.method1323();
		if (local367) {
			Static203.method693(true);
			Static10.method337(1, true);
			if (!Static24.aBoolean52) {
				Static99.method2071(true);
				Static90.method1979(1, Static221.aClass40_6, true, local458);
				Static128.method2891(true);
				Static352.method6144(true);
				Static202.method4040(1, Static221.aClass40_6);
			}
			if (Static24.aBoolean52) {
				Static132.method3024(true);
				Static90.method1979(1, Static221.aClass40_6, true, local458);
				Static128.method2891(true);
				method5597(true);
			}
			Static4.method147();
			Static128.method2891(true);
			Static238.method4509(Static221.aClass40_6, Static336.aClass77Array3[0], Static66.aClass22Array1, 1, true);
			Static202.method4040(1, Static221.aClass40_6);
			Static128.method2891(true);
			Static47.method1323();
			Static203.method693(false);
		}
		@Pc(667) int local667;
		@Pc(671) int local671;
		for (@Pc(663) int local663 = 0; local663 < 4; local663++) {
			for (local667 = 0; local667 < Static25.anInt850; local667++) {
				for (local671 = 0; local671 < Static219.anInt4987; local671++) {
					Static212.method6171(local671, local663, local667);
				}
			}
		}
		Static316.method5517();
		Static56.method1395();
		Static232.method4423();
		Static4.method147();
		Static275.aBoolean186 = false;
		Static252.method4618();
		if (Static252.aFrame2 != null && Static31.aClass42_1 != null && Static214.anInt4865 == 25) {
			Static150.aClass1_Sub16_Sub2_2.method5793(155);
			Static150.aClass1_Sub16_Sub2_2.method5768(1057001181);
		}
		if (!Static24.aBoolean52) {
			local667 = (Static213.anInt1925 - (Static25.anInt850 >> 4)) / 8;
			local671 = (Static213.anInt1925 + (Static25.anInt850 >> 4)) / 8;
			@Pc(756) int local756 = (Static274.anInt5784 - (Static219.anInt4987 >> 4)) / 8;
			@Pc(764) int local764 = ((Static219.anInt4987 >> 4) + Static274.anInt5784) / 8;
			for (@Pc(768) int local768 = local667 - 1; local768 <= local671 + 1; local768++) {
				for (@Pc(774) int local774 = local756 - 1; local774 <= local764 + 1; local774++) {
					if (local768 < local667 || local671 < local768 || local774 < local756 || local774 > local764) {
						Static50.aClass162_56.method4625("m" + local768 + "_" + local774);
						Static50.aClass162_56.method4625("l" + local768 + "_" + local774);
					}
				}
			}
		}
		if (Static214.anInt4865 == 28) {
			Static276.method4934(10);
		} else {
			Static276.method4934(30);
			if (Static31.aClass42_1 != null) {
				Static150.aClass1_Sub16_Sub2_2.method5793(116);
			}
		}
		Static286.method5114();
		Static56.method1395();
		Static160.method6132();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!nr;IIILclient!tb;III)Lclient!qa;")
	public static Class29 method5596(@OriginalArg(0) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class190 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static10.aClass100_1.anInt3464 = arg2;
		Static10.aClass100_1.aBoolean240 = arg3 != null;
		Static10.aClass100_1.anInt3461 = arg1;
		Static10.aClass100_1.anInt3471 = arg6;
		Static10.aClass100_1.anInt3462 = arg0.anInt3191;
		Static10.aClass100_1.anInt3470 = arg5;
		Static10.aClass100_1.anInt3459 = arg4;
		return (Class29) Static299.aClass115_1.method3456(Static10.aClass100_1);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)V")
	private static void method5597(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local9 = 1;
			local11 = Static340.aByteArrayArray57;
		} else {
			local11 = Static139.aByteArrayArray26;
			local9 = 4;
		}
		for (@Pc(19) int local19 = 0; local19 < local9; local19++) {
			Static56.method1395();
			for (@Pc(29) int local29 = 0; local29 < Static25.anInt850 >> 3; local29++) {
				for (@Pc(33) int local33 = 0; local33 < Static219.anInt4987 >> 3; local33++) {
					@Pc(43) int local43 = Static226.anIntArrayArrayArray10[local19][local29][local33];
					if (local43 != -1) {
						@Pc(52) int local52 = local43 >> 24 & 0x3;
						if (!arg0 || local52 == 0) {
							@Pc(65) int local65 = local43 >> 1 & 0x3;
							@Pc(71) int local71 = local43 >> 14 & 0x3FF;
							@Pc(77) int local77 = local43 >> 3 & 0x7FF;
							@Pc(87) int local87 = local77 / 8 + (local71 / 8 << 8);
							for (@Pc(89) int local89 = 0; local89 < Static112.anIntArray204.length; local89++) {
								if (Static112.anIntArray204[local89] == local87 && local11[local89] != null) {
									Static89.method1968((local77 & 0x7) * 8, Static221.aClass40_6, local29 * 8, Static66.aClass22Array1, local33 * 8, arg0, local65, local52, (local71 & 0x7) * 8, local11[local89], local19);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lclient!c;")
	public static Class27_Sub1 method5598() {
		return Static64.anInt1754 < Static323.aClass27_Sub1Array2.length ? Static323.aClass27_Sub1Array2[Static64.anInt1754++] : null;
	}
}
