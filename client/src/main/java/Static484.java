import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!pea", name = "l", descriptor = "Lclient!rt;")
	public static Class327 aClass327_6;

	// $FF: synthetic field
	@OriginalMember(owner = "client!pea", name = "n", descriptor = "Ljava/lang/Class;")
	private static Class aClass19;

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString85 = null;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!ha;II)Z")
	public static boolean method6494(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = (Static720.anInt10859 - 104) / 2;
		@Pc(15) int local15 = (Static501.anInt7568 - 104) / 2;
		@Pc(17) boolean local17 = true;
		@Pc(25) int local25;
		@Pc(37) int local37;
		for (@Pc(19) int local19 = local9; local19 < local9 + 104; local19++) {
			for (@Pc(22) int local22 = local15; local22 < local15 + 104; local22++) {
				for (local25 = arg1; local25 <= 3; local25++) {
					if (Static696.method9036(local22, arg1, local19, local25)) {
						local37 = local25;
						if (Static441.method5968(local22, local19)) {
							local37 = local25 - 1;
						}
						if (local37 >= 0) {
							local17 &= Static561.method7434(local19, local22, local37);
						}
					}
				}
			}
		}
		if (!local17) {
			return false;
		}
		@Pc(95) int[] local95 = new int[262144];
		for (local25 = 0; local25 < local95.length; local25++) {
			local95[local25] = -16777216;
		}
		Static12.aClass23_26 = arg0.method7946(512, 512, 512, local95);
		Static104.method2033();
		local37 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) + 238 - 10 | 0xFF000000;
		@Pc(177) int local177 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x9E04FF00) << 16;
		@Pc(196) int local196 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(206) boolean[][] local206 = new boolean[Static200.anInt3302 + 1 + 2][Static200.anInt3302 + 3];
		@Pc(211) int local211;
		@Pc(214) int local214;
		@Pc(216) int local216;
		@Pc(218) int local218;
		@Pc(229) int local229;
		@Pc(238) int local238;
		@Pc(249) int local249;
		@Pc(278) int local278;
		@Pc(281) int local281;
		@Pc(331) int local331;
		@Pc(336) int local336;
		@Pc(340) int local340;
		@Pc(365) int local365;
		for (@Pc(208) int local208 = local9; local208 < local9 + 104; local208 += Static200.anInt3302) {
			for (local211 = local15; local211 < local15 + 104; local211 += Static200.anInt3302) {
				local214 = 0;
				local216 = 0;
				local218 = local208;
				if (local208 > 0) {
					local218 = local208 - 1;
					local214 += 4;
				}
				local229 = local211;
				if (local211 > 0) {
					local229 = local211 - 1;
				}
				local238 = Static200.anInt3302 + local208;
				if (local238 < 104) {
					local238++;
				}
				local249 = local211 + Static200.anInt3302;
				if (local249 < 104) {
					local249++;
					local216 += 4;
				}
				arg0.KA(0, 0, Static200.anInt3302 * 4 + local214, local216 - -(Static200.anInt3302 * 4));
				arg0.GA(-16777216);
				@Pc(284) int local284;
				for (local278 = arg1; local278 <= 3; local278++) {
					for (local281 = 0; local281 <= Static200.anInt3302; local281++) {
						for (local284 = 0; local284 <= Static200.anInt3302; local284++) {
							local206[local281][local284] = Static696.method9036(local284 + local229, arg1, local218 + local281, local278);
						}
					}
					Static706.aClass178Array3[local278].method7873(local218, local229, local238, local249, local206);
					if (!Static113.aBoolean198) {
						for (local284 = -4; local284 < Static200.anInt3302; local284++) {
							for (local331 = -4; local331 < Static200.anInt3302; local331++) {
								local336 = local284 + local208;
								local340 = local331 + local211;
								if (local9 <= local336 && local340 >= local15 && Static696.method9036(local340, arg1, local336, local278)) {
									local365 = local278;
									if (Static441.method5968(local340, local336)) {
										local365 = local278 - 1;
									}
									if (local365 >= 0) {
										Static185.method2814(arg0, local37, local336, local340, local214 + local284 * 4, (-local331 + Static200.anInt3302) * 4 + local216 + -4, local365, local177);
									}
								}
							}
						}
					}
				}
				if (Static113.aBoolean198) {
					@Pc(435) Class110 local435 = Static577.aClass110Array1[arg1];
					for (local284 = 0; local284 < Static200.anInt3302; local284++) {
						for (local331 = 0; local331 < Static200.anInt3302; local331++) {
							local336 = local208 + local284;
							local340 = local331 + local211;
							local365 = local435.anIntArrayArray65[local336 - local435.anInt2647][local340 - local435.anInt2645];
							if ((local365 & 0x40240000) != 0) {
								arg0.method7971(4, 4, (Static200.anInt3302 - local331) * 4 + local216 - 4, local214 + local284 * 4, -1713569622);
							} else if ((local365 & 0x800000) != 0) {
								arg0.method7991((Static200.anInt3302 - local331) * 4 + local216 - 4, -1713569622, local214 + local284 * 4, 4);
							} else if ((local365 & 0x2000000) != 0) {
								arg0.method7998(4, local216 + (-local331 + Static200.anInt3302) * 4 - 4, -1713569622, local284 * 4 + local214 + 3);
							} else if ((local365 & 0x8000000) != 0) {
								arg0.method7991((Static200.anInt3302 - local331) * 4 + local216 + 3 - 4, -1713569622, local284 * 4 + local214, 4);
							} else if ((local365 & 0x20000000) != 0) {
								arg0.method7998(4, (Static200.anInt3302 - local331) * 4 + local216 - 4, -1713569622, local284 * 4 + local214);
							}
						}
					}
				}
				arg0.aa(local214, local216, Static200.anInt3302 * 4, Static200.anInt3302 * 4, local196, 2);
				Static12.aClass23_26.method8201((local208 - local9) * 4 + 48, -(Static200.anInt3302 * 4) + -((local211 + -local15) * 4) + 464, Static200.anInt3302 * 4, Static200.anInt3302 * 4, local214, local216);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static469.method6362();
		Static536.anInt8148 = 0;
		Static612.aClass339_67.method7700();
		if (!Static113.aBoolean198) {
			for (local211 = local9; local211 < local9 + 104; local211++) {
				for (local214 = local15; local214 < local15 + 104; local214++) {
					for (local216 = arg1; local216 <= arg1 + 1 && local216 <= 3; local216++) {
						if (Static696.method9036(local214, arg1, local211, local216)) {
							@Pc(730) Interface25 local730 = (Interface25) Static687.method8959(local216, local211, local214);
							if (local730 == null) {
								local730 = (Interface25) Static578.method7623(local216, local211, local214, aClass19 == null ? (aClass19 = getClass("Interface25")) : aClass19);
							}
							if (local730 == null) {
								local730 = (Interface25) Static302.method4414(local216, local211, local214);
							}
							if (local730 == null) {
								local730 = (Interface25) Static114.method2134(local216, local211, local214);
							}
							if (local730 != null) {
								@Pc(776) Class54 local776 = Static354.aClass142_4.method3063(local730.method6859(-32136), 100);
								if (!local776.aBoolean95 || Static174.aBoolean249) {
									local238 = local776.anInt1233;
									if (local776.anIntArray113 != null) {
										for (local249 = 0; local249 < local776.anIntArray113.length; local249++) {
											if (local776.anIntArray113[local249] != -1) {
												@Pc(808) Class54 local808 = Static354.aClass142_4.method3063(local776.anIntArray113[local249], 87);
												if (local808.anInt1233 >= 0) {
													local238 = local808.anInt1233;
												}
											}
										}
									}
									if (local238 >= 0) {
										@Pc(832) boolean local832 = false;
										if (local238 >= 0) {
											@Pc(842) Class105 local842 = Static577.aClass246_4.method5584(local238);
											if (local842 != null && local842.aBoolean216) {
												local832 = true;
											}
										}
										local278 = local211;
										local281 = local214;
										if (local832) {
											@Pc(862) int[][] local862 = Static577.aClass110Array1[local216].anIntArrayArray65;
											local331 = Static577.aClass110Array1[local216].anInt2647;
											local336 = Static577.aClass110Array1[local216].anInt2645;
											for (local340 = 0; local340 < 10; local340++) {
												local365 = (int) (Math.random() * 4.0D);
												if (local365 == 0 && local9 < local278 && local211 - 3 < local278 && (local862[local278 - local331 - 1][local281 - local336] & 0x2C0108) == 0) {
													local278--;
												}
												if (local365 == 1 && local9 + 104 - 1 > local278 && local211 + 3 > local278 && (local862[local278 + 1 - local331][local281 - local336] & 0x2C0180) == 0) {
													local278++;
												}
												if (local365 == 2 && local281 > local15 && local214 - 3 < local281 && (local862[local278 - local331][local281 - local336 - 1] & 0x2C0102) == 0) {
													local281--;
												}
												if (local365 == 3 && local281 < local15 + 104 - 1 && local214 + 3 > local281 && (local862[local278 - local331][local281 + 1 - local336] & 0x2C0120) == 0) {
													local281++;
												}
											}
										}
										Static533.anIntArray628[Static536.anInt8148] = local776.anInt1256;
										Static566.anIntArray654[Static536.anInt8148] = local278;
										Static350.anIntArray433[Static536.anInt8148] = local281;
										Static536.anInt8148++;
									}
								}
							}
						}
					}
				}
			}
			if (Static42.aClass255_2 != null) {
				Static6.aClass330_1.anInt8555 = 1;
				Static577.aClass246_4.method5583(1024, 64);
				for (local214 = 0; local214 < Static42.aClass255_2.anInt6373; local214++) {
					local216 = Static42.aClass255_2.anIntArray495[local214];
					if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 == local216 >> 28) {
						local218 = (local216 >> 14 & 0x3FFF) - Static691.anInt10367;
						local229 = (local216 & 0x3FFF) - Static116.anInt2270;
						if (local218 >= 0 && local218 < Static720.anInt10859 && local229 >= 0 && local229 < Static501.anInt7568) {
							Static612.aClass339_67.method7711(new Class2_Sub38(local214));
						} else {
							@Pc(1199) Class105 local1199 = Static577.aClass246_4.method5584(Static42.aClass255_2.anIntArray496[local214]);
							if (local1199.anIntArray228 != null && local1199.anInt2614 + local218 >= 0 && local218 + local1199.anInt2598 < Static720.anInt10859 && local1199.anInt2594 + local229 >= 0 && local229 + local1199.anInt2588 < Static501.anInt7568) {
								Static612.aClass339_67.method7711(new Class2_Sub38(local214));
							}
						}
					}
				}
				Static577.aClass246_4.method5583(128, 64);
				Static6.aClass330_1.anInt8555 = 2;
				Static6.aClass330_1.method7592();
			}
		}
		return true;
	}

	static Class getClass(String name) {
		Class instance;
		try {
			instance = Class.forName(name);
		} catch (ClassNotFoundException ex) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(ex);
		}
		return instance;
	}
}
