import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!r;")
	public static Js5 aClass197_25;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public static final int anInt2254 = 12;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Z")
	public static boolean aBoolean167 = false;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method2274() {
		for (@Pc(15) Class2_Sub6 local15 = (Class2_Sub6) Static366.aClass135_40.head(); local15 != null; local15 = (Class2_Sub6) Static366.aClass135_40.next()) {
			if (Static330.aClass67ArrayArrayArray3 == null) {
				local15.unlink();
			} else {
				@Pc(41) int local41;
				@Pc(262) Class11_Sub1 local262;
				@Pc(298) Class11_Sub1_Sub1 local298;
				@Pc(54) Class11_Sub3 local54;
				@Pc(117) Class11_Sub2 local117;
				@Pc(162) Class11_Sub5 local162;
				@Pc(90) Class11_Sub3_Sub1 local90;
				@Pc(136) Class11_Sub2_Sub2 local136;
				if (client.cycle >= local15.anInt1118) {
					local41 = Static150.anIntArray174[local15.anInt1116];
					if (local41 == 0) {
						local262 = Static12.method283(local15.anInt1110, local15.anInt1117, local15.anInt1109);
						if (local262 instanceof Class11_Sub1_Sub1) {
							Static259.method4429(local15.anInt1110, local15.anInt1117, local15.anInt1109);
							local298 = (Class11_Sub1_Sub1) local262;
							if (local298.aClass11_Sub1_1 != null) {
								Static4.method73(local15.anInt1110, local15.anInt1117, local15.anInt1109, local298.aClass11_Sub1_1, null);
							}
						}
					} else if (local41 == 1) {
						local54 = Static28.method893(local15.anInt1110, local15.anInt1117, local15.anInt1109);
						if (local54 instanceof Class11_Sub3_Sub1) {
							Static201.method3654(local15.anInt1110, local15.anInt1117, local15.anInt1109);
							local90 = (Class11_Sub3_Sub1) local54;
							if (local90.aClass11_Sub3_1 != null) {
								Static94.method2044(local15.anInt1110, local15.anInt1117, local15.anInt1109, local90.aClass11_Sub3_1, null);
							}
						}
					} else if (local41 == 2) {
						local162 = Static105.method2207(local15.anInt1110, local15.anInt1117, local15.anInt1109, Interface6.class);
						if (local162 instanceof Class11_Sub5_Sub6) {
							Static188.method3466(local15.anInt1110, local15.anInt1117, local15.anInt1109, Interface6.class);
							@Pc(471) Class11_Sub5_Sub6 local471 = (Class11_Sub5_Sub6) local162;
							if (local471.aClass11_Sub5_2 != null) {
								Static329.method5630(local471.aClass11_Sub5_2, false);
							}
						}
					} else if (local41 == 3) {
						local117 = Static26.method865(local15.anInt1110, local15.anInt1117, local15.anInt1109);
						if (local117 instanceof Class11_Sub2_Sub2) {
							Static370.method6246(local15.anInt1110, local15.anInt1117, local15.anInt1109);
							local136 = (Class11_Sub2_Sub2) local117;
							if (local136.aClass11_Sub2_1 != null) {
								Static29.method938(local15.anInt1110, local15.anInt1117, local15.anInt1109, local136.aClass11_Sub2_1);
							}
						}
					}
					local15.unlink();
				} else if (client.cycle == local15.anInt1100) {
					local41 = Static150.anIntArray174[local15.anInt1116];
					if (local41 == 0) {
						local262 = Static12.method283(local15.anInt1110, local15.anInt1117, local15.anInt1109);
						if (local262 instanceof Class11_Sub1_Sub1) {
							local15.unlink();
						} else if (Static99.method2143(local15.anInt1110, local15.anInt1117, local15.anInt1109) == null) {
							local298 = new Class11_Sub1_Sub1(local15.anInt1116, local15.anInt1111, local15.anInt1104, local15.anInt1114, local15.anInt1101, local262);
							Static4.method73(local15.anInt1110, local15.anInt1117, local15.anInt1109, local298, null);
						} else {
							local15.unlink();
						}
					} else if (local41 == 1) {
						local54 = Static28.method893(local15.anInt1110, local15.anInt1117, local15.anInt1109);
						if (local54 instanceof Class11_Sub3_Sub1) {
							local15.unlink();
						} else if (Static93.method2001(local15.anInt1110, local15.anInt1117, local15.anInt1109) == null) {
							local90 = new Class11_Sub3_Sub1(local15.anInt1116, local15.anInt1111, local15.anInt1104, local15.anInt1114, local15.anInt1101, local54);
							Static94.method2044(local15.anInt1110, local15.anInt1117, local15.anInt1109, local90, null);
						} else {
							local15.unlink();
						}
					} else if (local41 == 2) {
						local162 = Static105.method2207(local15.anInt1110, local15.anInt1117, local15.anInt1109, Interface6.class);
						if (local162 instanceof Class11_Sub5_Sub6) {
							local15.unlink();
						} else {
							Static188.method3466(local15.anInt1110, local15.anInt1117, local15.anInt1109, Interface6.class);
							@Pc(191) Class41 local191 = Static359.LocTypeList.method5163(local15.anInt1112);
							@Pc(207) int local207;
							@Pc(204) int local204;
							if (local15.anInt1111 == 1 || local15.anInt1111 == 3) {
								local204 = local191.anInt1356;
								local207 = local191.anInt1327;
							} else {
								local207 = local191.anInt1356;
								local204 = local191.anInt1327;
							}
							@Pc(248) Class11_Sub5_Sub6 local248 = new Class11_Sub5_Sub6(local15.anInt1116, local15.anInt1111, local15.anInt1110, local15.anInt1104, local15.anInt1114, local15.anInt1101, local15.anInt1117, local207 + local15.anInt1117 - 1, local15.anInt1109, local204 + local15.anInt1109 - 1, local162);
							Static329.method5630(local248, false);
						}
					} else if (local41 == 3) {
						local117 = Static26.method865(local15.anInt1110, local15.anInt1117, local15.anInt1109);
						if (local117 instanceof Class11_Sub2_Sub2) {
							local15.unlink();
						} else {
							local136 = new Class11_Sub2_Sub2(local15.anInt1104, local15.anInt1114, local15.anInt1101, local117);
							Static29.method938(local15.anInt1110, local15.anInt1117, local15.anInt1109, local136);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)V")
	public static void method2276() {
		if (Static59.anIntArray107 != null) {
			return;
		}
		Static59.anIntArray107 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(41) double local41 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(52) double local52 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(59) double local59 = (double) (local22 & 0x7F) / 128.0D;
			@Pc(61) double local61 = local59;
			@Pc(63) double local63 = local59;
			@Pc(65) double local65 = local59;
			if (local52 != 0.0D) {
				@Pc(79) double local79;
				if (local59 < 0.5D) {
					local79 = local59 * (local52 + 1.0D);
				} else {
					local79 = local52 + local59 - local59 * local52;
				}
				@Pc(96) double local96 = local59 * 2.0D - local79;
				@Pc(100) double local100 = local41 + 0.3333333333333333D;
				if (local100 > 1.0D) {
					local100--;
				}
				@Pc(114) double local114 = local41 - 0.3333333333333333D;
				if (local41 * 6.0D < 1.0D) {
					local63 = (local79 - local96) * 6.0D * local41 + local96;
				} else if (local41 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local41 * 3.0D < 2.0D) {
					local63 = local96 + (local79 - local96) * 6.0D * (0.6666666666666666D - local41);
				} else {
					local63 = local96;
				}
				if (local114 < 0.0D) {
					local114++;
				}
				if (local100 * 6.0D < 1.0D) {
					local61 = local96 + (local79 - local96) * 6.0D * local100;
				} else if (local100 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local100 * 3.0D < 2.0D) {
					local61 = local96 + (0.6666666666666666D - local100) * 6.0D * (local79 - local96);
				} else {
					local61 = local96;
				}
				if (local114 * 6.0D < 1.0D) {
					local65 = local114 * (local79 - local96) * 6.0D + local96;
				} else if (local114 * 2.0D < 1.0D) {
					local65 = local79;
				} else if (local114 * 3.0D < 2.0D) {
					local65 = local96 + (local79 - local96) * 6.0D * (0.6666666666666666D - local114);
				} else {
					local65 = local96;
				}
			}
			local61 = Math.pow(local61, local20);
			local63 = Math.pow(local63, local20);
			local65 = Math.pow(local65, local20);
			@Pc(294) int local294 = (int) (local61 * 256.0D);
			@Pc(299) int local299 = (int) (local63 * 256.0D);
			@Pc(304) int local304 = (int) (local65 * 256.0D);
			@Pc(314) int local314 = local304 + (local299 << 8) + (local294 << 16);
			Static59.anIntArray107[local22] = local314;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public static void method2277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class12_Sub3 local7 = new Class12_Sub3();
		local7.anInt3201 = arg0 + client.cycle;
		local7.anInt3204 = arg1;
		local7.aString26 = arg3;
		local7.anInt3206 = arg2;
		local7.anInt3208 = arg5;
		local7.anInt3207 = arg4;
		local7.anInt3200 = arg6;
		Static284.aClass36_7.method1418(local7);
	}
}
