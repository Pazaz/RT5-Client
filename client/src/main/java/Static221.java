import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!on", name = "o", descriptor = "Lclient!or;")
	public static Class145 aClass145_7;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Lclient!nr;")
	public static Class40 aClass40_6;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "I")
	public static int anInt5014;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[200];

	@OriginalMember(owner = "client!on", name = "p", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!on", name = "x", descriptor = "I")
	public static int anInt5015 = 0;

	@OriginalMember(owner = "client!on", name = "y", descriptor = "I")
	public static int anInt5016 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
	public static void method4300() {
		Static145.aClass215_54.method6060();
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
	public static void method4301() {
		while (true) {
			if (Static299.aClass1_Sub16_Sub2_3.method5789(Static200.anInt4591) >= 27) {
				@Pc(14) int local14 = Static299.aClass1_Sub16_Sub2_3.method5800(15);
				if (local14 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static84.aClass7_Sub1_Sub1_Sub1Array1[local14] == null) {
						Static84.aClass7_Sub1_Sub1_Sub1Array1[local14] = new Class7_Sub1_Sub1_Sub1();
						local21 = true;
						Static84.aClass7_Sub1_Sub1_Sub1Array1[local14].anInt7070 = local14;
					}
					@Pc(42) Class7_Sub1_Sub1_Sub1 local42 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local14];
					Static185.anIntArray309[Static49.anInt1559++] = local14;
					local42.anInt7079 = Static197.anInt4521;
					if (local42.aClass75_1 != null && local42.aClass75_1.method2058()) {
						Static305.method5378(local42);
					}
					@Pc(69) int local69 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
					@Pc(74) int local74 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
					if (local74 == 1) {
						Static31.anIntArray61[Static318.anInt6552++] = local14;
					}
					@Pc(92) int local92 = Static299.aClass1_Sub16_Sub2_3.method5800(5);
					if (local92 > 15) {
						local92 -= 32;
					}
					local42.method330(Static123.method2640(Static299.aClass1_Sub16_Sub2_3.method5800(14)));
					@Pc(114) int local114 = Static224.anIntArray394[Static299.aClass1_Sub16_Sub2_3.method5800(3)];
					@Pc(119) int local119 = Static299.aClass1_Sub16_Sub2_3.method5800(5);
					local42.method5978(local42.aClass75_1.anInt2458);
					if (local119 > 15) {
						local119 -= 32;
					}
					local42.anInt7100 = local42.aClass75_1.anInt2465 << 3;
					if (local42.anInt7100 == 0) {
						local42.method5976(0);
					} else if (local21) {
						local42.method5976(local114);
					}
					local42.method5966(local119 + Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], local69 == 1, local42.method5973(), Static39.anInt1215, local92 + Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0]);
					if (local42.aClass75_1.method2058()) {
						Static67.method143(null, 0, local42.anIntArray579[0], local42, Static39.anInt1215, null, local42.anIntArray578[0]);
					}
					continue;
				}
			}
			Static299.aClass1_Sub16_Sub2_3.method5792();
			return;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BC)Z")
	public static boolean method4302(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIB)V")
	public static void method4303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static62.aByteArrayArrayArray3 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(B)V")
	public static void method4304() {
		@Pc(14) Class10 local14 = null;
		try {
			@Pc(18) Class145 local18 = Static184.aClass199_12.method5461();
			while (local18.anInt5065 == 0) {
				Static295.method5212(1L);
			}
			if (local18.anInt5065 == 1) {
				local14 = (Class10) local18.anObject6;
				@Pc(40) byte[] local40 = new byte[(int) local14.method355()];
				@Pc(55) int local55;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local55) {
					local55 = local14.method354(local40.length - local42, local40, local42);
					if (local55 == -1) {
						throw new IOException("EOF");
					}
				}
				Static186.method3743(new Class1_Sub16(local40));
			}
		} catch (@Pc(80) Exception local80) {
		}
		try {
			if (local14 != null) {
				local14.method356();
			}
		} catch (@Pc(87) Exception local87) {
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II[Lclient!ro;)V")
	public static void method4305(@OriginalArg(0) int arg0, @OriginalArg(2) Class177[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class177 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt5829 && (!local9.aBoolean404 || !Static37.method918(local9))) {
				if (local9.anInt5838 == 0) {
					if (!local9.aBoolean404 && Static37.method918(local9) && Static312.aClass177_19 != local9) {
						continue;
					}
					method4305(local9.anInt5828, arg1);
					if (local9.aClass177Array8 != null) {
						method4305(local9.anInt5828, local9.aClass177Array8);
					}
					@Pc(58) Class1_Sub35 local58 = (Class1_Sub35) Static135.aClass183_33.method5053((long) local9.anInt5828);
					if (local58 != null) {
						Static219.method4285(local58.anInt6079);
					}
				}
				if (local9.anInt5838 == 6) {
					@Pc(88) int local88;
					if (local9.anInt5821 != -1 || local9.anInt5749 != -1) {
						@Pc(83) boolean local83 = Static57.method4835(local9);
						if (local83) {
							local88 = local9.anInt5749;
						} else {
							local88 = local9.anInt5821;
						}
						if (local88 != -1) {
							@Pc(100) Class165 local100 = Static231.method4385(local88);
							if (local100 != null) {
								local9.anInt5769 += Static55.anInt1622;
								while (local9.anInt5769 > local100.anIntArray410[local9.anInt5846]) {
									local9.anInt5769 -= local100.anIntArray410[local9.anInt5846];
									local9.anInt5846++;
									if (local9.anInt5846 >= local100.anIntArray407.length) {
										local9.anInt5846 -= local100.anInt5581;
										if (local9.anInt5846 < 0 || local100.anIntArray407.length <= local9.anInt5846) {
											local9.anInt5846 = 0;
										}
									}
									local9.anInt5844 = local9.anInt5846 + 1;
									if (local9.anInt5844 >= local100.anIntArray407.length) {
										local9.anInt5844 -= local100.anInt5581;
										if (local9.anInt5844 < 0 || local9.anInt5844 >= local100.anIntArray407.length) {
											local9.anInt5844 = -1;
										}
									}
									Static145.method3188(local9);
								}
							}
						}
					}
					if (local9.anInt5825 != 0 && !local9.aBoolean404) {
						@Pc(225) int local225 = local9.anInt5825 >> 16;
						local88 = local9.anInt5825 << 16 >> 16;
						@Pc(236) int local236 = local225 * Static55.anInt1622;
						local88 *= Static55.anInt1622;
						local9.anInt5834 = local9.anInt5834 + local236 & 0x3FFF;
						local9.anInt5845 = local9.anInt5845 + local88 & 0x3FFF;
						Static145.method3188(local9);
					}
				}
			}
		}
	}
}
