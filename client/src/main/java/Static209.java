import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!no", name = "j", descriptor = "I")
	public static int anInt4822;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "Lclient!we;")
	public static final Class215 aClass215_67 = new Class215(50);

	@OriginalMember(owner = "client!no", name = "k", descriptor = "I")
	public static int anInt4823 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
	public static void method4124() {
		if (Static118.anInt3015 == 0 || Static118.anInt3015 == 5) {
			return;
		}
		try {
			if (++Static323.anInt6641 > 2000) {
				if (Static31.aClass42_1 != null) {
					Static31.aClass42_1.method1271();
					Static31.aClass42_1 = null;
				}
				if (Static330.anInt6828 >= 1) {
					Static118.anInt3015 = 0;
					Static6.anInt211 = -5;
					return;
				}
				Static323.anInt6641 = 0;
				Static330.anInt6828++;
				Static118.anInt3015 = 1;
				if (Static56.anInt1631 == Static272.anInt5743) {
					Static272.anInt5743 = Static124.anInt3119;
				} else {
					Static272.anInt5743 = Static56.anInt1631;
				}
			}
			if (Static118.anInt3015 == 1) {
				Static18.aClass145_1 = Static184.aClass199_12.method5471(Static300.aString235, Static272.anInt5743);
				Static118.anInt3015 = 2;
			}
			if (Static118.anInt3015 == 2) {
				if (Static18.aClass145_1.anInt5065 == 2) {
					throw new IOException();
				}
				if (Static18.aClass145_1.anInt5065 != 1) {
					return;
				}
				Static31.aClass42_1 = new Class42((Socket) Static18.aClass145_1.anObject6, Static184.aClass199_12);
				Static18.aClass145_1 = null;
				@Pc(107) long local107 = Static274.aLong179 = Static274.method4904(Static96.aString91);
				Static150.aClass1_Sub16_Sub2_2.anInt6813 = 0;
				@Pc(117) int local117 = (int) (local107 >> 16 & 0x1FL);
				Static150.aClass1_Sub16_Sub2_2.method5771(14);
				Static150.aClass1_Sub16_Sub2_2.method5771(local117);
				Static31.aClass42_1.method1273(2, Static150.aClass1_Sub16_Sub2_2.aByteArray86);
				if (Static305.aClass37_2 != null) {
					Static305.aClass37_2.method5865();
				}
				if (Static37.aClass37_1 != null) {
					Static37.aClass37_1.method5865();
				}
				@Pc(146) int local146 = Static31.aClass42_1.method1263();
				if (Static305.aClass37_2 != null) {
					Static305.aClass37_2.method5865();
				}
				if (Static37.aClass37_1 != null) {
					Static37.aClass37_1.method5865();
				}
				if (local146 != 0) {
					Static6.anInt211 = local146;
					Static118.anInt3015 = 0;
					Static31.aClass42_1.method1271();
					Static31.aClass42_1 = null;
					return;
				}
				Static118.anInt3015 = 3;
			}
			if (Static118.anInt3015 == 3) {
				if (Static31.aClass42_1.method1269() < 8) {
					return;
				}
				Static31.aClass42_1.method1270(0, Static299.aClass1_Sub16_Sub2_3.aByteArray86, 8);
				Static299.aClass1_Sub16_Sub2_3.anInt6813 = 0;
				Static2.aLong215 = Static299.aClass1_Sub16_Sub2_3.method5784();
				@Pc(198) int[] local198 = new int[] { (int) (Math.random() * 9.9999999E7D), 0, (int) (Static2.aLong215 >> 32), (int) Static2.aLong215 };
				Static150.aClass1_Sub16_Sub2_2.anInt6813 = 0;
				local198[1] = (int) (Math.random() * 9.9999999E7D);
				Static150.aClass1_Sub16_Sub2_2.method5771(10);
				Static150.aClass1_Sub16_Sub2_2.method5768(local198[0]);
				Static150.aClass1_Sub16_Sub2_2.method5768(local198[1]);
				Static150.aClass1_Sub16_Sub2_2.method5768(local198[2]);
				Static150.aClass1_Sub16_Sub2_2.method5768(local198[3]);
				Static150.aClass1_Sub16_Sub2_2.method5753(Static274.method4904(Static96.aString91));
				Static150.aClass1_Sub16_Sub2_2.method5726(Static68.aString68);
				Static150.aClass1_Sub16_Sub2_2.method5767(Static309.aBigInteger3, Static67.aBigInteger2);
				Static12.aClass1_Sub16_Sub2_1.anInt6813 = 0;
				if (Static214.anInt4865 == 40) {
					Static12.aClass1_Sub16_Sub2_1.method5771(18);
				} else {
					Static12.aClass1_Sub16_Sub2_1.method5771(16);
				}
				Static12.aClass1_Sub16_Sub2_1.method5757(Static150.aClass1_Sub16_Sub2_2.anInt6813 + Static279.method4951(Static327.aString256) + 161);
				Static12.aClass1_Sub16_Sub2_1.method5768(562);
				Static12.aClass1_Sub16_Sub2_1.method5771(Static144.anInt3574);
				Static12.aClass1_Sub16_Sub2_1.method5771(Static164.method3437());
				Static12.aClass1_Sub16_Sub2_1.method5757(Static107.anInt2674);
				Static12.aClass1_Sub16_Sub2_1.method5757(Static350.anInt7318);
				Static12.aClass1_Sub16_Sub2_1.method5771(Static355.anInt4211);
				Static191.method3800(Static12.aClass1_Sub16_Sub2_1);
				Static12.aClass1_Sub16_Sub2_1.method5726(Static327.aString256);
				Static12.aClass1_Sub16_Sub2_1.method5768(Static192.anInt4459);
				Static12.aClass1_Sub16_Sub2_1.method5768(Static167.method3464());
				Static329.aBoolean490 = true;
				Static12.aClass1_Sub16_Sub2_1.method5757(Static121.anInt3034);
				Static12.aClass1_Sub16_Sub2_1.method5768(Static320.aClass162_225.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static38.aClass162_51.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static180.aClass162_146.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static31.aClass162_48.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static218.aClass162_175.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static50.aClass162_56.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static250.aClass162_193.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static88.aClass162_81.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static203.aClass162_47.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static22.aClass162_34.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static237.aClass162_188.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static134.aClass162_119.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static257.aClass162_198.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static251.aClass162_194.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static262.aClass162_199.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static7.aClass162_22.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static191.aClass162_153.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static205.aClass162_166.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static339.aClass162_244.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static4.aClass162_14.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static171.aClass162_138.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static25.aClass162_40.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static9.aClass162_24.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static139.aClass162_120.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static197.aClass162_157.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static27.aClass162_42.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static236.aClass162_187.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static18.aClass162_31.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5768(Static28.aClass162_43.method4641());
				Static12.aClass1_Sub16_Sub2_1.method5740(Static150.aClass1_Sub16_Sub2_2.aByteArray86, Static150.aClass1_Sub16_Sub2_2.anInt6813);
				Static31.aClass42_1.method1273(Static12.aClass1_Sub16_Sub2_1.anInt6813, Static12.aClass1_Sub16_Sub2_1.aByteArray86);
				Static150.aClass1_Sub16_Sub2_2.method5794(local198);
				for (@Pc(566) int local566 = 0; local566 < 4; local566++) {
					local198[local566] += 50;
				}
				Static299.aClass1_Sub16_Sub2_3.method5794(local198);
				Static118.anInt3015 = 4;
			}
			if (Static118.anInt3015 == 4) {
				if (Static31.aClass42_1.method1269() < 1) {
					return;
				}
				@Pc(602) int local602 = Static31.aClass42_1.method1263();
				if (local602 == 21) {
					Static118.anInt3015 = 7;
				} else if (local602 == 29) {
					Static118.anInt3015 = 10;
				} else if (local602 == 1) {
					Static118.anInt3015 = 5;
					Static6.anInt211 = local602;
					return;
				} else if (local602 == 2) {
					Static118.anInt3015 = 8;
				} else if (local602 == 15) {
					Static6.anInt211 = local602;
					Static118.anInt3015 = 0;
					return;
				} else if (local602 == 23 && Static330.anInt6828 < 1) {
					Static330.anInt6828++;
					Static118.anInt3015 = 1;
					Static323.anInt6641 = 0;
					Static31.aClass42_1.method1271();
					Static31.aClass42_1 = null;
					return;
				} else {
					Static6.anInt211 = local602;
					Static118.anInt3015 = 0;
					Static31.aClass42_1.method1271();
					Static31.aClass42_1 = null;
					return;
				}
			}
			if (Static118.anInt3015 == 6) {
				Static150.aClass1_Sub16_Sub2_2.anInt6813 = 0;
				Static150.aClass1_Sub16_Sub2_2.method5793(17);
				Static31.aClass42_1.method1273(Static150.aClass1_Sub16_Sub2_2.anInt6813, Static150.aClass1_Sub16_Sub2_2.aByteArray86);
				Static118.anInt3015 = 4;
			} else if (Static118.anInt3015 == 7) {
				if (Static31.aClass42_1.method1269() >= 1) {
					Static6.anInt219 = (Static31.aClass42_1.method1263() + 3) * 60;
					Static6.anInt211 = 21;
					Static118.anInt3015 = 0;
					Static31.aClass42_1.method1271();
					Static31.aClass42_1 = null;
				}
			} else if (Static118.anInt3015 != 10) {
				if (Static118.anInt3015 == 8) {
					if (Static31.aClass42_1.method1269() < 14) {
						return;
					}
					Static31.aClass42_1.method1270(0, Static299.aClass1_Sub16_Sub2_3.aByteArray86, 14);
					Static299.aClass1_Sub16_Sub2_3.anInt6813 = 0;
					Static87.anInt2332 = Static299.aClass1_Sub16_Sub2_3.method5761();
					Static168.anInt4074 = Static299.aClass1_Sub16_Sub2_3.method5761();
					Static166.aBoolean286 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
					Static93.aBoolean158 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
					Static234.aBoolean362 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
					Static221.aBoolean352 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
					Static248.aBoolean377 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
					Static172.anInt6634 = Static299.aClass1_Sub16_Sub2_3.method5749();
					Static15.aBoolean44 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
					Static109.aBoolean184 = Static299.aClass1_Sub16_Sub2_3.method5761() == 1;
					Static347.method5867(Static109.aBoolean184);
					Static303.method5310(Static109.aBoolean184);
					Static257.method4732(Static109.aBoolean184);
					if (Static166.aBoolean286 && !Static234.aBoolean362 || Static15.aBoolean44) {
						try {
							Static358.method1001(Static184.aClass199_12.anApplet1, "zap");
						} catch (@Pc(889) Throwable local889) {
						}
					} else {
						try {
							Static358.method1001(Static184.aClass199_12.anApplet1, "unzap");
						} catch (@Pc(899) Throwable local899) {
						}
					}
					if (Static312.anInt6002 == 0) {
						try {
							Static358.method1001(Static184.aClass199_12.anApplet1, "loggedin");
						} catch (@Pc(910) Throwable local910) {
						}
					}
					Static305.anInt6393 = Static299.aClass1_Sub16_Sub2_3.method5797();
					Static200.anInt4591 = Static299.aClass1_Sub16_Sub2_3.method5749();
					Static118.anInt3015 = 9;
				}
				if (Static118.anInt3015 == 9 && Static31.aClass42_1.method1269() >= Static200.anInt4591) {
					Static299.aClass1_Sub16_Sub2_3.anInt6813 = 0;
					Static31.aClass42_1.method1270(0, Static299.aClass1_Sub16_Sub2_3.aByteArray86, Static200.anInt4591);
					Static6.anInt211 = 2;
					Static118.anInt3015 = 0;
					Static79.method3955();
					Static213.anInt1925 = -1;
					Static235.method4608(false);
					Static305.anInt6393 = -1;
				}
			} else if (Static31.aClass42_1.method1269() >= 1) {
				Static207.anInt4792 = Static31.aClass42_1.method1263();
				Static6.anInt211 = 29;
				Static118.anInt3015 = 0;
				Static31.aClass42_1.method1271();
				Static31.aClass42_1 = null;
			}
		} catch (@Pc(963) IOException local963) {
			if (Static31.aClass42_1 != null) {
				Static31.aClass42_1.method1271();
				Static31.aClass42_1 = null;
			}
			if (Static330.anInt6828 >= 1) {
				Static6.anInt211 = -4;
				Static118.anInt3015 = 0;
			} else {
				Static323.anInt6641 = 0;
				Static118.anInt3015 = 1;
				if (Static56.anInt1631 == Static272.anInt5743) {
					Static272.anInt5743 = Static124.anInt3119;
				} else {
					Static272.anInt5743 = Static56.anInt1631;
				}
				Static330.anInt6828++;
			}
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)V")
	public static void method4125(@OriginalArg(0) int arg0) {
		if (Static175.anIntArray292 == null || arg0 > Static175.anIntArray292.length) {
			Static175.anIntArray292 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIBI)Lclient!vb;")
	public static Class210 method4127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class198[] local7 = null;
		@Pc(13) Class72 local13 = Static80.method1830(arg0);
		if (local13.anIntArray152 != null) {
			local7 = new Class198[local13.anIntArray152.length];
			for (@Pc(28) int local28 = 0; local28 < local7.length; local28++) {
				@Pc(39) Class111 local39 = Static73.method1720(local13.anIntArray152[local28]);
				local7[local28] = new Class198(local39.anInt3870, local39.anInt3863, local39.anInt3862, local39.anInt3866, local39.anInt3864, local39.anInt3860, local39.anInt3872, local39.aBoolean272);
			}
		}
		return new Class210(local13.anInt2429, local7, local13.anInt2430, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIZIILclient!qr;)V")
	public static void method4128(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class165 arg4) {
		if (Static88.anInt2333 >= 50 || (arg4 == null || arg4.anIntArrayArray36 == null || arg2 >= arg4.anIntArrayArray36.length || arg4.anIntArrayArray36[arg2] == null)) {
			return;
		}
		@Pc(30) int local30 = arg4.anIntArrayArray36[arg2][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		@Pc(57) int local57;
		if (arg4.anIntArrayArray36[arg2].length > 1) {
			local57 = (int) ((double) arg4.anIntArrayArray36[arg2].length * Math.random());
			if (local57 > 0) {
				local34 = arg4.anIntArrayArray36[arg2][local57];
			}
		}
		@Pc(73) int local73 = local30 & 0x1F;
		if (local73 == 0) {
			if (arg1) {
				Static78.method1785(255, 0, local34, local40);
			}
		} else if (Static183.anInt4317 != 0) {
			Static246.anIntArray499[Static88.anInt2333] = local34;
			Static101.anIntArray161[Static88.anInt2333] = local40;
			Static187.anIntArray311[Static88.anInt2333] = 0;
			Static114.aClass19Array2[Static88.anInt2333] = null;
			Static308.anIntArray494[Static88.anInt2333] = 255;
			local57 = (arg0 - 64) / 128;
			@Pc(126) int local126 = (arg3 - 64) / 128;
			Static183.anIntArray308[Static88.anInt2333] = local73 + (local126 << 8) + (local57 << 16);
			Static88.anInt2333++;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IBZ)V")
	public static void method4129(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0) {
			Static221.aClass40_6 = Static211.method2701(Static355.anInt4211 * 2, Static184.aClass199_12, Static86.aCanvas2, arg0, Static65.anInterface4_2);
		} else {
			if (arg1) {
				Static221.aClass40_6 = Static211.method2701(0, Static184.aClass199_12, Static86.aCanvas2, 0, Static65.anInterface4_2);
				Static221.aClass40_6.method2735(0);
				@Pc(39) Class63 local39 = Static230.method4379(Static251.aClass162_194, Static203.anInt926);
				@Pc(48) Class30 local48 = Static221.aClass40_6.method2768(local39, Static363.method3883(Static203.aClass162_47, Static203.anInt926));
				Static104.method2158(true, Static17.aString24, local48);
				Static221.aClass40_6.method2710();
				Static11.method6076();
				Static221.aClass40_6.method2711();
			}
			try {
				Static221.aClass40_6 = Static211.method2701(Static355.anInt4211 * 2, Static184.aClass199_12, Static86.aCanvas2, arg0, Static65.anInterface4_2);
			} catch (@Pc(72) Throwable local72) {
				Static221.aClass40_6 = Static211.method2701(0, Static184.aClass199_12, Static86.aCanvas2, 0, Static65.anInterface4_2);
				arg0 = 0;
			}
		}
		if (Static221.aClass40_6.method2785()) {
			@Pc(90) Class1_Sub29 local90 = Static221.aClass40_6.method2800();
			Static221.aClass40_6.method2775(local90);
		}
		Static130.anInt6754 = arg0;
		Static18.method471();
		if (!Static221.aClass40_6.method2703()) {
			Static286.anInt6054 = 1;
		}
		Static221.aClass40_6.method2733(Static286.anInt6054);
		Static221.aClass40_6.method2727(0);
		Static202.aClass11_10 = Static221.aClass40_6.method2801();
		Static184.aClass11_12 = Static221.aClass40_6.method2801();
		@Pc(124) int local124 = (int) ((double) Static25.anInt850 * 34.46D);
		if (Static221.aClass40_6.method2730()) {
			local124 += 128;
		}
		Static221.aClass40_6.method2774(50, local124);
		Static221.aClass40_6.method2715(!Static289.aBoolean360);
		if (Static221.aClass40_6.method2757()) {
			Static59.method5599(Static280.aBoolean419);
		}
		Static32.aBoolean504 = !Static13.method5497();
		Static327.method5690(Static219.anInt4987 >> 3, Static25.anInt850 >> 3, Static221.aClass40_6);
		Static206.method4105();
		Static329.aBoolean490 = false;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(CI)Z")
	public static boolean method4131(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
