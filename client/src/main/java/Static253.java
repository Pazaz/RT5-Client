import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	public static int anInt5456;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	public static int anInt5458;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "[S")
	public static short[] aShortArray91;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "[I")
	public static final int[] anIntArray401 = new int[32];

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "[I")
	public static final int[] anIntArray402 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIZI)V")
	public static void method4648(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static241.aClass154ArrayArrayArray2 == null) {
			Static221.aClass40_6.method2745(arg4, arg2, arg1, arg0, -16777216);
			return;
		}
		Static135.anInt7217++;
		if (Static264.aClass7_Sub1_Sub1_Sub2_2 != null && Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 - (Static264.aClass7_Sub1_Sub1_Sub2_2.method5973() - 1) * 64 >> 7 == Static47.anInt1523 && Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 + 64 - Static264.aClass7_Sub1_Sub1_Sub2_2.method5973() * 64 >> 7 == Static268.anInt5668) {
			Static47.anInt1523 = -1;
			Static268.anInt5668 = -1;
			Static239.method4514();
		}
		Static231.method4387();
		if (!arg3) {
			Static289.method4442();
		}
		Static13.method5502();
		Static110.method2669(arg2, arg4, arg0, true, arg1);
		@Pc(74) int local74 = Static292.anInt6121;
		@Pc(76) int local76 = Static108.anInt2686;
		@Pc(78) int local78 = Static54.anInt1612;
		@Pc(80) int local80 = Static190.anInt5412;
		@Pc(88) int local88;
		@Pc(129) int local129;
		if (Static303.anInt6342 == 1) {
			local88 = (int) Static189.aFloat55;
			if (Static96.anInt2440 >> 8 > local88) {
				local88 = Static96.anInt2440 >> 8;
			}
			if (Static187.aBooleanArray12[4] && Static243.anIntArray395[4] + 128 > local88) {
				local88 = Static243.anIntArray395[4] + 128;
			}
			local129 = (int) Static188.aFloat17 + Static61.anInt1679 & 0x3FFF;
			Static140.method3078(Static309.method5429(Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032, Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027, Static39.anInt1215) - 50, (local88 >> 3) * 3 + 600, local88, local129, local74, Static12.anInt536, Static142.anInt3529);
		} else if (Static303.anInt6342 == 4) {
			local88 = (int) Static189.aFloat55;
			if (local88 < Static96.anInt2440 >> 8) {
				local88 = Static96.anInt2440 >> 8;
			}
			if (Static187.aBooleanArray12[4] && local88 < Static243.anIntArray395[4] + 128) {
				local88 = Static243.anIntArray395[4] + 128;
			}
			local129 = (int) Static188.aFloat17 & 0x3FFF;
			Static140.method3078(Static309.method5429(Static72.anInt1985, Static327.anInt6692, Static39.anInt1215) - 50, (local88 >> 3) * 3 + 600, local88, local129, local74, Static12.anInt536, Static142.anInt3529);
		} else if (Static303.anInt6342 == 5) {
			Static142.method3130(local74);
		}
		local88 = Static3.anInt92;
		local129 = Static138.anInt3429;
		@Pc(236) int local236 = Static88.anInt2339;
		@Pc(238) int local238 = Static130.anInt6778;
		@Pc(240) int local240 = Static89.anInt2374;
		@Pc(283) int local283;
		for (@Pc(242) int local242 = 0; local242 < 5; local242++) {
			if (Static187.aBooleanArray12[local242]) {
				local283 = (int) (Math.random() * (double) (Static297.anIntArray479[local242] * 2 + 1) - (double) Static297.anIntArray479[local242] + Math.sin((double) Static265.anIntArray415[local242] * ((double) Static32.anIntArray572[local242] / 100.0D)) * (double) Static243.anIntArray395[local242]);
				if (local242 == 4) {
					Static130.anInt6778 += local283;
					if (Static130.anInt6778 < 1024) {
						Static130.anInt6778 = 1024;
					} else if (Static130.anInt6778 > 3072) {
						Static130.anInt6778 = 3072;
					}
				}
				if (local242 == 3) {
					Static89.anInt2374 = local283 + Static89.anInt2374 & 0x3FFF;
				}
				if (local242 == 1) {
					Static138.anInt3429 += local283;
				}
				if (local242 == 0) {
					Static3.anInt92 += local283;
				}
				if (local242 == 2) {
					Static88.anInt2339 += local283;
				}
			}
		}
		if (Static3.anInt92 < 0) {
			Static3.anInt92 = 0;
		}
		if (Static3.anInt92 > (Static328.anInt6717 << 7) - 1) {
			Static3.anInt92 = (Static328.anInt6717 << 7) - 1;
		}
		if (Static88.anInt2339 < 0) {
			Static88.anInt2339 = 0;
		}
		if ((Static200.anInt4590 << 7) - 1 < Static88.anInt2339) {
			Static88.anInt2339 = (Static200.anInt4590 << 7) - 1;
		}
		Static45.method1278();
		Static50.method1359();
		Static221.aClass40_6.method2732(local78, local80, local78 + local76, local74 + local80);
		Static221.aClass40_6.method2713();
		local283 = Static219.anInt4983;
		if (Static156.aClass210_1 == null) {
			Static221.aClass40_6.method2735(local283);
		} else {
			Static156.aClass210_1.method5665(Static221.aClass40_6, Static130.anInt6778, Static89.anInt2365 << 3, local80, Static89.anInt2374, local283, local78, local76, local74);
		}
		Static56.method1395();
		Static202.aClass11_10.method5503(Static3.anInt92, Static138.anInt3429, Static88.anInt2339, -Static130.anInt6778 & 0x3FFF, -Static89.anInt2374 & 0x3FFF, -Static209.anInt4822 & 0x3FFF);
		Static221.aClass40_6.method2804(Static202.aClass11_10);
		Static221.aClass40_6.method2737(local78 + local76 / 2, local74 / 2 + local80, Static233.anInt5203 << 1, Static233.anInt5203 << 1);
		Static121.method2600(local80 + local74 / 2, Static233.anInt5203 << 1, Static233.anInt5203 << 1, local76 / 2 + local78);
		Static211.method2766(Static88.anInt2339, -Static89.anInt2374 & 0x3FFF, Static3.anInt92, -Static209.anInt4822 & 0x3FFF, -Static130.anInt6778 & 0x3FFF, Static138.anInt3429);
		@Pc(517) byte local517 = Static1.method54() == 2 ? (byte) Static135.anInt7217 : 1;
		Static16.method451(Static221.aClass40_6, Static197.anInt4521, Static286.anInt6054, Static202.aClass11_10, Static3.anInt92, Static138.anInt3429, Static88.anInt2339, Static233.aByteArrayArrayArray13, Static77.anIntArray135, Static245.anIntArray228, Static249.anIntArray399, Static73.anIntArray129, Static205.anIntArray358, Static39.anInt1215 + 1, local517, Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 >> 7, Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 >> 7, !Static288.aBoolean423);
		Static56.method1395();
		if (Static214.anInt4865 == 30) {
			Static148.method3222(local78, local80, local76, local74);
			Static127.method2887(local78, local74, local80, local76);
			Static116.method2537(local76, local80, local74, local78);
			Static92.method2003(local76, local80, local78, local74);
		}
		Static260.method4749();
		Static88.anInt2339 = local236;
		Static138.anInt3429 = local129;
		Static89.anInt2374 = local240;
		Static130.anInt6778 = local238;
		Static3.anInt92 = local88;
		if (Static289.aBoolean358 && Static59.aClass182_5.method5041() == 0) {
			Static289.aBoolean358 = false;
		}
		if (Static289.aBoolean358) {
			Static221.aClass40_6.method2745(local76, local74, local78, local80, -16777216);
			Static104.method2158(false, Static17.aString24, Static290.aClass30_3);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
	public static void method4650(@OriginalArg(0) int arg0) {
		Static289.anInt5208 = arg0;
		@Pc(12) Class215 local12 = Static286.aClass215_86;
		synchronized (Static286.aClass215_86) {
			Static286.aClass215_86.method6060();
		}
		local12 = Static209.aClass215_67;
		synchronized (Static209.aClass215_67) {
			Static209.aClass215_67.method6060();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZ)I")
	public static int method4651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static282.anIntArray453[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public static void method4652() {
		if (Static64.aClass170_1 == null) {
			return;
		}
		while (true) {
			while (Static323.aClass27_Sub1Array2.length > Static266.anInt5651) {
				@Pc(21) Class27_Sub1 local21 = Static323.aClass27_Sub1Array2[Static266.anInt5651];
				if (local21 != null && local21.anInt934 == -1) {
					if (Static290.aClass1_Sub32_1 == null) {
						Static290.aClass1_Sub32_1 = Static64.aClass170_1.method4787(local21.aString42);
					}
					@Pc(44) int local44 = Static290.aClass1_Sub32_1.anInt5877;
					if (local44 == -1) {
						return;
					}
					Static290.aClass1_Sub32_1 = null;
					Static266.anInt5651++;
					local21.anInt934 = local44;
				} else {
					Static266.anInt5651++;
				}
			}
			return;
		}
	}
}
