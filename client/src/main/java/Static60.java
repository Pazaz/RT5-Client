import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "[I")
	public static int[] anIntArray455;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
	public static int anInt6011 = 0;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
	public static int anInt6015 = 0;

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "[I")
	public static final int[] anIntArray456 = new int[32];

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
	public static void method5085(@OriginalArg(1) int arg0) {
		Static145.anInt3612 = arg0;
		@Pc(13) Class215 local13 = Static28.aClass215_16;
		synchronized (Static28.aClass215_16) {
			Static28.aClass215_16.method6060();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!nr;III)V")
	public static void method5086(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static146.anInt3617 == 0 || Static305.anInt6395 == 0) {
			return;
		}
		arg0.method2737(Static199.anInt4554, Static191.anInt4426, Static146.anInt3617, Static305.anInt6395);
		arg0.method2732(Static139.anInt3447, Static351.anInt7329, Static146.anInt3617, Static305.anInt6395);
		@Pc(39) Class11 local39 = arg0.method2801();
		local39.method5503(Static259.anInt4936, Static256.anInt5549, Static321.anInt6612, Static181.anInt4292, Static253.anInt5458, Static17.anInt647);
		arg0.method2804(local39);
		@Pc(72) int local72;
		@Pc(81) int local81;
		@Pc(84) int local84;
		@Pc(92) int local92;
		@Pc(100) int local100;
		if (Static234.anInt5231 == 0 && Static336.aClass77Array3 != null) {
			@Pc(59) int local59 = -1;
			@Pc(61) int local61 = -1;
			@Pc(64) int local64 = arg0.method2805();
			local72 = (arg2 - Static199.anInt4554) * local64 / Static146.anInt3617;
			local81 = local64 * (arg1 - Static191.anInt4426) / Static305.anInt6395;
			local84 = arg0.method2708();
			local92 = local84 * (arg2 - Static199.anInt4554) / Static146.anInt3617;
			local100 = (arg1 - Static191.anInt4426) * local84 / Static305.anInt6395;
			@Pc(115) int[] local115 = new int[] { local72, local81, local64 };
			local39.method5505(local115);
			@Pc(133) int[] local133 = new int[] { local92, local100, local84 };
			local39.method5505(local133);
			@Pc(138) float local138 = 0.0F;
			@Pc(147) int local147 = local133[0] - local115[0];
			@Pc(155) int local155 = local133[1] - local115[1];
			@Pc(164) int local164 = local133[2] - local115[2];
			while (local138 < 1.0F) {
				@Pc(177) int local177 = (int) ((float) local115[0] + (float) local147 * local138);
				@Pc(181) int local181 = local177 >> 7;
				@Pc(192) int local192 = (int) ((float) local164 * local138 + (float) local115[2]);
				@Pc(196) int local196 = local192 >> 7;
				if (local181 > 0 && local196 > 0 && Static25.anInt850 > local181 && local196 < Static219.anInt4987) {
					@Pc(212) int local212 = Static39.anInt1215;
					if (local212 < 3 && (Static62.aByteArrayArrayArray3[1][local181][local196] & 0x2) != 0) {
						local212++;
					}
					if ((float) Static336.aClass77Array3[local212].method3994(local177, local192) < (float) local115[1] + (float) local155 * local138) {
						local59 = local177 + (Static264.aClass7_Sub1_Sub1_Sub2_2.method5973() - 1) * 64 >> 7;
						local61 = (Static264.aClass7_Sub1_Sub1_Sub2_2.method5973() - 1) * 64 + local192 >> 7;
						break;
					}
				}
				local138 = (float) ((double) local138 + 0.01D);
			}
			if (local59 != -1 && local61 != -1) {
				if (Static246.aBoolean472 && (Static302.anInt6307 & 0x40) != 0) {
					@Pc(303) Class177 local303 = Static183.method3720(Static156.anInt3876, Static139.anInt3442);
					if (local303 == null) {
						Static95.method2033();
					} else {
						Static286.method5110(Static355.anInt4215, 0L, Static49.aString57, local59, " ->", local61, 50);
					}
				} else {
					if (Static199.anInt4559 == 1) {
						Static286.method5110(-1, 0L, Static229.aString179, local59, "", local61, 17);
					}
					Static286.method5110(-1, 0L, Static228.aString178, local59, "", local61, 57);
				}
			}
		}
		@Pc(351) Class58 local351 = Static216.aClass58_8;
		for (@Pc(356) Class2_Sub3 local356 = (Class2_Sub3) local351.method1672(); local356 != null; local356 = (Class2_Sub3) local351.method1675()) {
			if (local356.method1999(arg0, arg2, arg1) && Static39.anInt1215 == local356.anInt2401) {
				@Pc(476) int local476;
				@Pc(488) int local488;
				if (local356.aClass7_1 instanceof Class7_Sub1_Sub1_Sub2) {
					@Pc(377) Class7_Sub1_Sub1_Sub2 local377 = (Class7_Sub1_Sub1_Sub2) local356.aClass7_1;
					local72 = local377.method5973();
					if ((local72 & 0x1) == 0 && (local377.anInt7027 & 0x7F) == 0 && (local377.anInt7032 & 0x7F) == 0 || (local72 & 0x1) == 1 && (local377.anInt7027 & 0x7F) == 64 && (local377.anInt7032 & 0x7F) == 64) {
						local81 = local377.anInt7027 + 64 - local377.method5973() * 64;
						local84 = local377.anInt7032 + 64 - local377.method5973() * 64;
						for (local92 = 0; local92 < Static49.anInt1559; local92++) {
							@Pc(453) Class7_Sub1_Sub1_Sub1 local453 = Static84.aClass7_Sub1_Sub1_Sub1Array1[Static185.anIntArray309[local92]];
							if (local453 != null && Static197.anInt4521 != local453.anInt7042 && local453.aBoolean507) {
								local476 = local453.anInt7027 + 64 - local453.aClass75_1.anInt2458 * 64;
								local488 = local453.anInt7032 + 64 - local453.aClass75_1.anInt2458 * 64;
								if (local476 >= local81 && local453.aClass75_1.anInt2458 <= local377.method5973() - (local476 - local81 >> 7) && local84 <= local488 && local453.aClass75_1.anInt2458 <= local377.method5973() - (local488 - local84 >> 7)) {
									Static96.method2036(local453);
									local453.anInt7042 = Static197.anInt4521;
								}
							}
						}
						for (local100 = 0; local100 < Static329.anInt6733; local100++) {
							@Pc(556) Class7_Sub1_Sub1_Sub2 local556 = Static168.aClass7_Sub1_Sub1_Sub2Array1[Static238.anIntArray389[local100]];
							if (local556 != null && local556.anInt7042 != Static197.anInt4521 && local556 != local377 && local556.aBoolean507) {
								local488 = local556.anInt7027 + 64 - local556.method5973() * 64;
								@Pc(594) int local594 = local556.anInt7032 - (local556.method5973() - 1) * 64;
								if (local81 <= local488 && local556.method5973() <= local377.method5973() - (local488 - local81 >> 7) && local84 <= local594 && local556.method5973() <= local377.method5973() - (local594 - local84 >> 7)) {
									Static285.method5100(local556);
									local556.anInt7042 = Static197.anInt4521;
								}
							}
						}
					}
					if (local377.anInt7042 == Static197.anInt4521) {
						continue;
					}
					Static285.method5100(local377);
					local377.anInt7042 = Static197.anInt4521;
				}
				if (local356.aClass7_1 instanceof Class7_Sub1_Sub1_Sub1) {
					@Pc(668) Class7_Sub1_Sub1_Sub1 local668 = (Class7_Sub1_Sub1_Sub1) local356.aClass7_1;
					if (local668.aClass75_1 != null) {
						if ((local668.aClass75_1.anInt2458 & 0x1) == 0 && (local668.anInt7027 & 0x7F) == 0 && (local668.anInt7032 & 0x7F) == 0 || (local668.aClass75_1.anInt2458 & 0x1) == 1 && (local668.anInt7027 & 0x7F) == 64 && (local668.anInt7032 & 0x7F) == 64) {
							local72 = local668.anInt7027 + 64 - local668.aClass75_1.anInt2458 * 64;
							local81 = local668.anInt7032 + 64 - local668.aClass75_1.anInt2458 * 64;
							for (local84 = 0; local84 < Static49.anInt1559; local84++) {
								@Pc(747) Class7_Sub1_Sub1_Sub1 local747 = Static84.aClass7_Sub1_Sub1_Sub1Array1[Static185.anIntArray309[local84]];
								if (local747 != null && local747.anInt7042 != Static197.anInt4521 && local747 != local668 && local747.aBoolean507) {
									local100 = local747.anInt7027 - (local747.aClass75_1.anInt2458 - 1) * 64;
									local476 = local747.anInt7032 + 64 - local747.aClass75_1.anInt2458 * 64;
									if (local72 <= local100 && local747.aClass75_1.anInt2458 <= local668.aClass75_1.anInt2458 - (local100 - local72 >> 7) && local476 >= local81 && local747.aClass75_1.anInt2458 <= local668.aClass75_1.anInt2458 - (local476 - local81 >> 7)) {
										Static96.method2036(local747);
										local747.anInt7042 = Static197.anInt4521;
									}
								}
							}
							for (local92 = 0; local92 < Static329.anInt6733; local92++) {
								@Pc(856) Class7_Sub1_Sub1_Sub2 local856 = Static168.aClass7_Sub1_Sub1_Sub2Array1[Static238.anIntArray389[local92]];
								if (local856 != null && local856.anInt7042 != Static197.anInt4521 && local856.aBoolean507) {
									local476 = local856.anInt7027 + 64 - local856.method5973() * 64;
									local488 = local856.anInt7032 + 64 - local856.method5973() * 64;
									if (local72 <= local476 && local856.method5973() <= local668.aClass75_1.anInt2458 - (local476 - local72 >> 7) && local488 >= local81 && local856.method5973() <= local668.aClass75_1.anInt2458 - (local488 - local81 >> 7)) {
										Static285.method5100(local856);
										local856.anInt7042 = Static197.anInt4521;
									}
								}
							}
						}
						if (Static197.anInt4521 == local668.anInt7042) {
							continue;
						}
						Static96.method2036(local668);
						local668.anInt7042 = Static197.anInt4521;
					}
				}
				if (local356.aClass7_1 instanceof Class7_Sub4_Sub1) {
					@Pc(981) Class1_Sub11 local981 = (Class1_Sub11) Static208.aClass183_24.method5053((long) (local356.anInt2403 << 14 | local356.anInt2401 << 28 | local356.anInt2407));
					if (local981 != null) {
						for (@Pc(989) Class1_Sub19 local989 = (Class1_Sub19) local981.aClass130_11.method3759(); local989 != null; local989 = (Class1_Sub19) local981.aClass130_11.method3748()) {
							@Pc(996) Class36 local996 = Static165.method3446(local989.anInt3991);
							if (Static234.anInt5231 == 1) {
								Static286.method5110(Static350.anInt7317, (long) local989.anInt3991, Static252.aString195, local356.anInt2407, Static238.aString187 + " -> <col=ff9040>" + local996.aString51, local356.anInt2403, 32);
							} else if (Static246.aBoolean472) {
								@Pc(1010) Class1_Sub1_Sub18 local1010 = Static245.anInt3134 == -1 ? null : Static231.method4389(Static245.anInt3134);
								if ((Static302.anInt6307 & 0x1) != 0 && (local1010 == null || local996.method957(local1010.anInt5129, Static245.anInt3134) != local1010.anInt5129)) {
									Static286.method5110(Static355.anInt4215, (long) local989.anInt3991, Static49.aString57, local356.anInt2407, Static174.aString153 + " -> <col=ff9040>" + local996.aString51, local356.anInt2403, 7);
								}
							} else {
								@Pc(1063) String[] local1063 = local996.aStringArray7;
								for (local92 = 4; local92 >= 0; local92--) {
									if (local1063 != null && local1063[local92] != null) {
										@Pc(1075) byte local1075 = 0;
										if (local92 == 0) {
											local1075 = 5;
										}
										local476 = Static183.anInt4318;
										if (local92 == 1) {
											local1075 = 39;
										}
										if (local92 == 2) {
											local1075 = 46;
										}
										if (local92 == 3) {
											local1075 = 58;
										}
										if (local996.anInt1225 == local92) {
											local476 = local996.anInt1223;
										}
										if (local92 == 4) {
											local1075 = 60;
										}
										if (local996.anInt1226 == local92) {
											local476 = local996.anInt1216;
										}
										Static286.method5110(local476, (long) local989.anInt3991, local1063[local92], local356.anInt2407, "<col=ff9040>" + local996.aString51, local356.anInt2403, local1075);
									}
								}
								Static286.method5110(Static192.anInt4458, (long) local989.anInt3991, Static165.aString150, local356.anInt2407, "<col=ff9040>" + local996.aString51, local356.anInt2403, 1005);
							}
						}
					}
				}
				if (local356.aClass7_1 instanceof Interface6) {
					@Pc(1227) Interface6 local1227 = (Interface6) local356.aClass7_1;
					@Pc(1233) Class189 local1233 = Static83.method1840(local1227.method5686());
					if (local1233.anIntArray470 != null) {
						local1233 = local1233.method5210();
					}
					if (local1233 != null) {
						if (Static234.anInt5231 == 1) {
							Static286.method5110(Static350.anInt7317, Static143.method3166(local356.anInt2407, local1227, local356.anInt2403), Static252.aString195, local356.anInt2407, Static238.aString187 + " -> <col=00ffff>" + local1233.aString232, local356.anInt2403, 12);
						} else if (Static246.aBoolean472) {
							@Pc(1292) Class1_Sub1_Sub18 local1292 = Static245.anInt3134 == -1 ? null : Static231.method4389(Static245.anInt3134);
							if ((Static302.anInt6307 & 0x4) != 0 && (local1292 == null || local1233.method5209(Static245.anInt3134, local1292.anInt5129) != local1292.anInt5129)) {
								Static286.method5110(Static355.anInt4215, Static143.method3166(local356.anInt2407, local1227, local356.anInt2403), Static49.aString57, local356.anInt2407, Static174.aString153 + " -> <col=00ffff>" + local1233.aString232, local356.anInt2403, 44);
							}
						} else {
							@Pc(1346) String[] local1346 = local1233.aStringArray41;
							if (local1346 != null) {
								for (local84 = 4; local84 >= 0; local84--) {
									if (local1346[local84] != null) {
										@Pc(1358) short local1358 = 0;
										local100 = Static183.anInt4318;
										if (local84 == 0) {
											local1358 = 37;
										}
										if (local84 == 1) {
											local1358 = 45;
										}
										if (local84 == 2) {
											local1358 = 47;
										}
										if (local84 == 3) {
											local1358 = 33;
										}
										if (local84 == 4) {
											local1358 = 1011;
										}
										if (local84 == local1233.lb) {
											local100 = local1233.anInt6169;
										}
										if (local1233.anInt6188 == local84) {
											local100 = local1233.anInt6217;
										}
										Static286.method5110(local100, Static143.method3166(local356.anInt2407, local1227, local356.anInt2403), local1346[local84], local356.anInt2407, "<col=00ffff>" + local1233.aString232, local356.anInt2403, local1358);
									}
								}
							}
							Static286.method5110(Static192.anInt4458, (long) local1233.anInt6205, Static165.aString150, local356.anInt2407, "<col=00ffff>" + local1233.aString232, local356.anInt2403, 1009);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)V")
	public static void method5087() {
		Static145.aClass215_54.method6063(5);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!im;Z)Z")
	public static boolean method5089(@OriginalArg(0) Interface6 arg0) {
		@Pc(9) Class189 local9 = Static83.method1840(arg0.method5686());
		if (local9.anInt6201 == -1) {
			return true;
		} else {
			@Pc(27) Class59 local27 = Static155.method3333(local9.anInt6201);
			return local27.anInt2063 == -1 ? true : local27.method1745();
		}
	}
}
