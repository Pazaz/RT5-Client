import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	public static int anInt4628 = 0;

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
	public static int anInt4629 = 0;

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "[I")
	public static final int[] anIntArray352 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "Z")
	public static boolean aBoolean324 = false;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
	public static void method3990() {
		Static108.aClass215_42.method6052();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)I")
	public static int method3991() {
		if (Static204.aBoolean329 || Static237.anInt5285 <= 0) {
			@Pc(11) int local11 = Static229.anInt5102;
			@Pc(13) int local13 = Static85.anInt2268;
			@Pc(15) int local15 = Static234.anInt5225;
			@Pc(17) int local17 = Static52.anInt1577;
			@Pc(19) int local19 = Static140.anInt3473;
			if (local15 < local11 && local11 < local15 + local19) {
				@Pc(33) int local33 = -1;
				@Pc(52) int local52;
				for (@Pc(35) int local35 = 0; local35 < Static237.anInt5285; local35++) {
					if (Static236.aBoolean367) {
						local52 = local17 + (Static237.anInt5285 - local35 - 1) * 16 + 33;
						if (local13 > local52 - 13 && local52 + 3 >= local13) {
							local33 = local35;
						}
					} else {
						local52 = (Static237.anInt5285 - local35 - 1) * 16 + local17 + 31;
						if (local13 > local52 - 13 && local52 + 3 >= local13) {
							local33 = local35;
						}
					}
				}
				if (local33 != -1) {
					local52 = 0;
					@Pc(113) Class195 local113 = new Class195(Static97.aClass130_9);
					for (@Pc(118) Class1_Sub22 local118 = (Class1_Sub22) local113.method5278(); local118 != null; local118 = (Class1_Sub22) local113.method5279()) {
						if (local52++ == local33) {
							return local118.anInt4304;
						}
					}
				}
			}
			return -1;
		} else if (Static326.aBoolean478 && Static345.aBooleanArray30[81] && Static237.anInt5285 > 2) {
			return ((Class1_Sub22) Static97.aClass130_9.aClass1_138.aClass1_248.aClass1_248).anInt4304;
		} else {
			return ((Class1_Sub22) Static97.aClass130_9.aClass1_138.aClass1_248).anInt4304;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public static void method3992() {
		Static299.aClass1_Sub16_Sub2_3.method5798();
		@Pc(13) int local13 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
		if (local13 == 0) {
			return;
		}
		@Pc(21) int local21 = Static299.aClass1_Sub16_Sub2_3.method5800(2);
		if (local21 == 0) {
			Static31.anIntArray61[Static318.anInt6552++] = 2047;
			return;
		}
		@Pc(40) int local40;
		@Pc(50) int local50;
		if (local21 == 1) {
			local40 = Static299.aClass1_Sub16_Sub2_3.method5800(3);
			Static264.aClass7_Sub1_Sub1_Sub2_2.method5977(local40, 1);
			local50 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
			if (local50 == 1) {
				Static31.anIntArray61[Static318.anInt6552++] = 2047;
			}
		} else if (local21 == 2) {
			if (Static299.aClass1_Sub16_Sub2_3.method5800(1) == 1) {
				local40 = Static299.aClass1_Sub16_Sub2_3.method5800(3);
				Static264.aClass7_Sub1_Sub1_Sub2_2.method5977(local40, 2);
				local50 = Static299.aClass1_Sub16_Sub2_3.method5800(3);
				Static264.aClass7_Sub1_Sub1_Sub2_2.method5977(local50, 2);
			} else {
				local40 = Static299.aClass1_Sub16_Sub2_3.method5800(3);
				Static264.aClass7_Sub1_Sub1_Sub2_2.method5977(local40, 0);
			}
			local40 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
			if (local40 == 1) {
				Static31.anIntArray61[Static318.anInt6552++] = 2047;
			}
		} else if (local21 == 3) {
			local40 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
			if (local40 == 1) {
				Static31.anIntArray61[Static318.anInt6552++] = 2047;
			}
			Static39.anInt1215 = Static299.aClass1_Sub16_Sub2_3.method5800(2);
			local50 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
			@Pc(171) int local171 = Static299.aClass1_Sub16_Sub2_3.method5800(7);
			@Pc(176) int local176 = Static299.aClass1_Sub16_Sub2_3.method5800(7);
			Static264.aClass7_Sub1_Sub1_Sub2_2.method5988(local50 == 1, local176, Static39.anInt1215, local171);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIILclient!nr;Lclient!fl;I)V")
	public static void method3996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class40 arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) int arg5) {
		if (Static335.anInt6981 < 100) {
			Static264.method4782(arg4, arg3);
		}
		arg3.method2732(arg1, arg2, arg1 + arg0, arg2 + arg5);
		@Pc(33) int local33;
		@Pc(52) int local52;
		if (Static335.anInt6981 < 100) {
			local33 = arg1 + arg0 / 2;
			arg3.method2717(arg1, arg2, arg0, arg5, -16777216, 0);
			local52 = arg5 / 2 + arg2 - 18 - 20;
			arg3.method2712(local33 - 152, local52, 304, 34, Static324.aColorArray4[Static155.anInt3850].getRGB(), 0);
			arg3.method2717(local33 - 150, local52 - -2, Static335.anInt6981 * 3, 30, Static41.aColorArray1[Static155.anInt3850].getRGB(), 0);
			Static150.aClass30_2.method4831(-1, Static12.aString17, Static60.aColorArray3[Static155.anInt3850].getRGB(), local33, local52 + 20);
			return;
		}
		@Pc(105) int local105 = Static286.anInt6050 - (int) ((float) arg0 / Static201.aFloat54);
		local33 = (int) ((float) arg5 / Static201.aFloat54) + Static311.anInt5198;
		local52 = Static286.anInt6050 + (int) ((float) arg0 / Static201.aFloat54);
		Static37.anInt1188 = Static311.anInt5198 - (int) ((float) arg5 / Static201.aFloat54);
		Static339.anInt7356 = Static286.anInt6050 - (int) ((float) arg0 / Static201.aFloat54);
		Static298.anInt6269 = (int) ((float) (arg0 * 2) / Static201.aFloat54);
		Static16.anInt641 = (int) ((float) (arg5 * 2) / Static201.aFloat54);
		@Pc(168) int local168 = Static311.anInt5198 - (int) ((float) arg5 / Static201.aFloat54);
		Static201.method3685(Static201.anInt4281 + local105, Static201.anInt4283 + local33, local52 + Static201.anInt4281, local168 - -Static201.anInt4283, arg1, arg2, arg0 + arg1, arg2 + arg5 - -1);
		Static201.method3680(arg3);
		@Pc(198) Class130 local198 = Static201.method3677(arg3);
		Static309.method5432(arg3, local198);
		if (Static74.anInt2057 > 0) {
			Static243.anInt5366--;
			if (Static243.anInt5366 == 0) {
				Static74.anInt2057--;
				Static243.anInt5366 = 20;
			}
		}
		if (!Static263.aBoolean395) {
			return;
		}
		@Pc(229) int local229 = arg0 + arg1 - 5;
		@Pc(235) int local235 = arg2 + arg5 - 8;
		Static290.aClass30_3.method4842(local229, "Fps:" + Static354.anInt7382, 16776960, local235);
		@Pc(250) int local250 = local235 - 15;
		@Pc(252) Runtime local252 = Runtime.getRuntime();
		@Pc(262) int local262 = (int) ((local252.totalMemory() - local252.freeMemory()) / 1024L);
		@Pc(264) int local264 = 16776960;
		if (local262 > 65536) {
			local264 = 16711680;
		}
		Static290.aClass30_3.method4842(local229, "Mem:" + local262 + "k", local264, local250);
		local235 = local250 - 15;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIILclient!br;Lclient!br;)V")
	public static void method3998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7_Sub2 arg3, @OriginalArg(4) Class7_Sub2 arg4) {
		if (Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static91.method1998(arg0, arg1, arg2);
		}
		Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2].aClass7_Sub2_1 = arg3;
		Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2].aClass7_Sub2_2 = arg4;
	}
}
