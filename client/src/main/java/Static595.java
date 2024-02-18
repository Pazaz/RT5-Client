import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!so", name = "S", descriptor = "[I")
	public static int[] anIntArray702 = new int[1];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/lang/String;ZI)V")
	public static void method7807(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		Static164.method2606();
		if (arg2 == 0) {
			Static163.aClass19_17 = Static255.method3612(Static124.aClass330_20, Static56.anInterface4_3, 0, Static434.aCanvas7, Static400.aClass2_Sub34_28.aClass57_Sub13_1.method4373() * 2);
			if (arg0 != null) {
				Static163.aClass19_17.GA(0);
				@Pc(36) Class381 local36 = Static74.method1535(Static539.anInt8173, Static697.aClass330_123);
				@Pc(45) Class14 local45 = Static163.aClass19_17.method8010(local36, Static735.method9375(Static721.aClass330_128, Static539.anInt8173), true);
				Static288.method4182();
				Static694.method9028(Static163.aClass19_17, arg0, true, local36, local45);
			}
		} else {
			@Pc(57) Class19 local57 = null;
			@Pc(85) Class14 local85;
			if (arg0 != null) {
				local57 = Static255.method3612(Static124.aClass330_20, Static56.anInterface4_3, 0, Static434.aCanvas7, 0);
				local57.GA(0);
				@Pc(76) Class381 local76 = Static74.method1535(Static539.anInt8173, Static697.aClass330_123);
				local85 = local57.method8010(local76, Static735.method9375(Static721.aClass330_128, Static539.anInt8173), true);
				Static288.method4182();
				Static694.method9028(local57, arg0, true, local76, local85);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static163.aClass19_17 = Static255.method3612(Static124.aClass330_20, Static56.anInterface4_3, arg2, Static434.aCanvas7, Static400.aClass2_Sub34_28.aClass57_Sub13_1.method4373() * 2);
					if (arg0 != null) {
						local57.GA(0);
						@Pc(118) Class381 local118 = Static74.method1535(Static539.anInt8173, Static697.aClass330_123);
						@Pc(127) Class14 local127 = local57.method8010(local118, Static735.method9375(Static721.aClass330_128, Static539.anInt8173), true);
						Static288.method4182();
						Static694.method9028(local57, arg0, true, local118, local127);
					}
					if (Static163.aClass19_17.method7949()) {
						@Pc(141) boolean local141 = true;
						try {
							local141 = Static292.aClass2_Sub43_2.anInt7610 > 256;
						} catch (@Pc(152) Throwable local152) {
						}
						@Pc(158) Class2_Sub13 local158;
						if (local141) {
							local158 = Static163.aClass19_17.method7961(146800640);
						} else {
							local158 = Static163.aClass19_17.method7961(104857600);
						}
						Static163.aClass19_17.method7938(local158);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(168) Throwable local168) {
					@Pc(173) int local173 = Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915();
					if (local173 == 2) {
						Static171.aBoolean245 = true;
					}
					Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub29_1);
					method7807(arg0, arg1, local173);
					@Pc(194) Object local194 = null;
					var14 = false;
				} finally {
					if (var14) {
						local85 = null;
						if (local57 != null) {
							try {
								local57.method7940();
							} catch (@Pc(359) Throwable local359) {
							}
						}
					}
				}
				if (local57 != null) {
					try {
						local57.method7940();
					} catch (@Pc(339) Throwable local339) {
					}
				}
				return;
			}
			local85 = null;
			if (local57 != null) {
				try {
					local57.method7940();
				} catch (@Pc(349) Throwable local349) {
				}
			}
		}
		Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7918(!arg1);
		Static400.aClass2_Sub34_28.method5104(arg2, Static400.aClass2_Sub34_28.aClass57_Sub29_1);
		Static112.method2109();
		Static163.aClass19_17.method8003();
		Static163.aClass19_17.X(32);
		Static460.aClass73_10 = Static163.aClass19_17.method7953();
		Static59.aClass73_5 = Static163.aClass19_17.method7953();
		Static209.method3110();
		Static163.aClass19_17.method7997(Static400.aClass2_Sub34_28.aClass57_Sub9_1.method3199() == 1);
		if (Static163.aClass19_17.method7936()) {
			Static249.method3537(Static400.aClass2_Sub34_28.aClass57_Sub20_1.method6108() == 1);
		}
		Static613.method8239(Static163.aClass19_17, Static501.anInt7568 >> 3, Static720.anInt10859 >> 3);
		Static218.method3187();
		Static284.aBoolean355 = true;
		Static679.aClass273Array1 = null;
		Static503.aBoolean578 = false;
		Static498.method6646();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IBIII)V")
	public static void method7810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static691.anInt10368;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static599.anInt8837 = arg1;
			Static691.anInt10368 = 2;
			Static435.anInt6597 = arg3;
			Static320.anInt5085 = arg0;
			Static582.anInt8629 = arg2;
		} else if (local5 == 2) {
			if (Static320.anInt5085 > arg0) {
				Static320.anInt5085 = arg0;
			}
			if (Static435.anInt6597 > arg3) {
				Static435.anInt6597 = arg3;
			}
			if (Static599.anInt8837 < arg1) {
				Static599.anInt8837 = arg1;
			}
			if (Static582.anInt8629 < arg2) {
				Static582.anInt8629 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!ge;Lclient!vfa;I)Lclient!bs;")
	public static Class52 method7811(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(1) Class382 arg1) {
		@Pc(10) Class52 local10 = new Class52(arg1);
		@Pc(14) int local14 = arg0.method7396();
		@Pc(23) boolean local23 = (local14 & 0x1) != 0;
		@Pc(35) boolean local35 = (local14 & 0x2) != 0;
		@Pc(47) boolean local47 = (local14 & 0x4) != 0;
		@Pc(57) boolean local57 = (local14 & 0x8) != 0;
		if (local23) {
			local10.anIntArray97[0] = arg0.method7346();
			local10.anIntArray99[0] = arg0.method7346();
			if (arg1.anInt10102 != -1 || arg1.anInt10106 != -1) {
				local10.anIntArray97[1] = arg0.method7346();
				local10.anIntArray99[1] = arg0.method7346();
			}
			if (arg1.anInt10095 != -1 || arg1.anInt10135 != -1) {
				local10.anIntArray97[2] = arg0.method7346();
				local10.anIntArray99[2] = arg0.method7346();
			}
		}
		if (local35) {
			local10.anIntArray98[0] = arg0.method7346();
			local10.anIntArray100[0] = arg0.method7346();
			if (arg1.anInt10111 != -1 || arg1.anInt10119 != -1) {
				local10.anIntArray98[1] = arg0.method7346();
				local10.anIntArray100[1] = arg0.method7346();
			}
		}
		@Pc(178) int local178;
		@Pc(181) int[] local181;
		@Pc(213) int local213;
		if (local47) {
			local178 = arg0.method7382();
			local181 = new int[] { local178 & 0xF, local178 >> 4 & 0xF, local178 >> 8 & 0xF, local178 >> 12 & 0xF };
			for (local213 = 0; local213 < 4; local213++) {
				if (local181[local213] != 15) {
					local10.aShortArray11[local181[local213]] = (short) arg0.method7382();
				}
			}
		}
		if (local57) {
			local178 = arg0.method7396();
			local181 = new int[] { local178 & 0xF, local178 >> 4 & 0xF };
			for (local213 = 0; local213 < 2; local213++) {
				if (local181[local213] != 15) {
					local10.aShortArray10[local181[local213]] = (short) arg0.method7382();
				}
			}
		}
		return local10;
	}
}
