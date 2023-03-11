import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "Lclient!ki;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!nk", name = "Ec", descriptor = "I")
	public static int anInt4309;

	@OriginalMember(owner = "client!nk", name = "jc", descriptor = "Z")
	public static boolean aBoolean288 = true;

	@OriginalMember(owner = "client!nk", name = "pc", descriptor = "I")
	public static int anInt4301 = -1;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!r;Lclient!r;Lclient!wm;I)V")
	public static void method4102(@OriginalArg(0) Class197 arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) Class19 arg2) {
		Static52.aClass239_1 = Static101.method2165(Static183.anInt80, arg1);
		Static200.aClass130_3 = arg2.method2857(Static52.aClass239_1, Static396.method1688(arg0, Static183.anInt80));
		Static165.aClass239_3 = Static101.method2165(Static371.anInt7014, arg1);
		Static276.aClass130_4 = arg2.method2857(Static165.aClass239_3, Static396.method1688(arg0, Static371.anInt7014));
		Static113.aClass239_2 = Static101.method2165(Static80.anInt6679, arg1);
		Static52.aClass130_1 = arg2.method2857(Static113.aClass239_2, Static396.method1688(arg0, Static80.anInt6679));
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)V")
	public static void method4104(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static359.aByteArrayArrayArray16 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public static void method4112() {
		for (@Pc(7) int local7 = 0; local7 < Static343.anInt6390; local7++) {
			@Pc(21) int local21 = Static277.anIntArray361[local7];
			@Pc(25) Class11_Sub5_Sub2_Sub2 local25 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local21];
			@Pc(29) int local29 = Static212.aClass2_Sub4_Sub2_3.g1();
			if ((local29 & 0x40) != 0) {
				local29 += Static212.aClass2_Sub4_Sub2_3.g1() << 8;
			}
			@Pc(55) int local55;
			if ((local29 & 0x400) != 0) {
				local55 = Static212.aClass2_Sub4_Sub2_3.g2add();
				local25.anInt4578 = Static212.aClass2_Sub4_Sub2_3.g1sub();
				local25.anInt4591 = Static212.aClass2_Sub4_Sub2_3.g1sub();
				local25.anInt4623 = local55 & 0x7FFF;
				local25.aBoolean319 = (local55 & 0x8000) != 0;
				local25.anInt4621 = Static114.anInt2348 + local25.anInt4623 + local25.anInt4578;
			}
			@Pc(107) int local107;
			if ((local29 & 0x2) != 0) {
				local55 = Static212.aClass2_Sub4_Sub2_3.gsmart();
				local107 = Static212.aClass2_Sub4_Sub2_3.g1bneg();
				local25.method4334(local107, local55, Static114.anInt2348);
				local25.anInt4606 = Static114.anInt2348 + 300;
				local25.anInt4631 = Static212.aClass2_Sub4_Sub2_3.g1();
			}
			if ((local29 & 0x8) != 0) {
				local55 = Static212.aClass2_Sub4_Sub2_3.g2();
				if (local55 == 65535) {
					local55 = -1;
				}
				local107 = Static212.aClass2_Sub4_Sub2_3.g1sub();
				Static307.method5256(local55, local25, local107);
			}
			if ((local29 & 0x80) != 0) {
				local25.aString50 = Static212.aClass2_Sub4_Sub2_3.gjstr();
				local25.anInt4636 = 100;
			}
			@Pc(224) int local224;
			if ((local29 & 0x4) != 0) {
				local55 = Static212.aClass2_Sub4_Sub2_3.ig2add();
				local107 = Static212.aClass2_Sub4_Sub2_3.ig4();
				if (local55 == 65535) {
					local55 = -1;
				}
				@Pc(186) boolean local186 = true;
				@Pc(221) Class157 local221;
				if (local55 != -1 && local25.anInt4594 != -1) {
					@Pc(207) Class91 local207;
					if (local55 == local25.anInt4594) {
						local207 = Static322.aClass211_2.method5407(local55);
						if (local207.aBoolean177 && local207.anInt2448 != -1) {
							local221 = Static39.aClass85_1.method2371(local207.anInt2448);
							local224 = local221.anInt4022;
							if (local224 == 0) {
								local186 = false;
							} else if (local224 == 1) {
								local186 = true;
							} else if (local224 == 2) {
								local25.anInt4598 = 0;
								local186 = false;
							}
						}
					} else {
						local207 = Static322.aClass211_2.method5407(local55);
						@Pc(262) Class91 local262 = Static322.aClass211_2.method5407(local25.anInt4594);
						if (local207.anInt2448 != -1 && local262.anInt2448 != -1) {
							@Pc(277) Class157 local277 = Static39.aClass85_1.method2371(local207.anInt2448);
							@Pc(283) Class157 local283 = Static39.aClass85_1.method2371(local262.anInt2448);
							if (local277.anInt4023 < local283.anInt4023) {
								local186 = false;
							}
						}
					}
				}
				if (local186) {
					local25.anInt4620 = 0;
					local25.anInt4594 = local55;
					local25.anInt4582 = 0;
					local25.anInt4639 = local107 >> 16;
					local25.anInt4612 = 1;
					local25.anInt4595 = Static114.anInt2348 + (local107 & 0xFFFF);
					if (Static114.anInt2348 < local25.anInt4595) {
						local25.anInt4582 = -1;
					}
					if (local25.anInt4594 != -1 && Static114.anInt2348 == local25.anInt4595) {
						@Pc(340) int local340 = Static322.aClass211_2.method5407(local25.anInt4594).anInt2448;
						if (local340 != -1) {
							local221 = Static39.aClass85_1.method2371(local340);
							if (local221 != null && local221.anIntArray262 != null) {
								Static1.method4(local221, false, local25.aByte78, local25.anInt6781, local25.anInt6783, 0);
							}
						}
					}
				}
			}
			if ((local29 & 0x20) != 0) {
				local25.anInt4611 = Static212.aClass2_Sub4_Sub2_3.g2();
				if (local25.anInt4611 == 65535) {
					local25.anInt4611 = -1;
				}
			}
			if ((local29 & 0x1) != 0) {
				local55 = Static212.aClass2_Sub4_Sub2_3.gsmart();
				local107 = Static212.aClass2_Sub4_Sub2_3.g1bneg();
				local25.method4334(local107, local55, Static114.anInt2348);
			}
			if ((local29 & 0x100) != 0) {
				local55 = Static212.aClass2_Sub4_Sub2_3.g1sub();
				@Pc(411) int[] local411 = new int[local55];
				@Pc(414) int[] local414 = new int[local55];
				@Pc(417) int[] local417 = new int[local55];
				for (@Pc(419) int local419 = 0; local419 < local55; local419++) {
					local224 = Static212.aClass2_Sub4_Sub2_3.g2add();
					if (local224 == 65535) {
						local224 = -1;
					}
					local411[local419] = local224;
					local414[local419] = Static212.aClass2_Sub4_Sub2_3.g1bneg();
					local417[local419] = Static212.aClass2_Sub4_Sub2_3.g2();
				}
				Static92.method1966(local411, local417, local25, local414);
			}
			if ((local29 & 0x200) != 0) {
				local25.anInt4663 = Static212.aClass2_Sub4_Sub2_3.g2();
				local25.anInt4657 = Static212.aClass2_Sub4_Sub2_3.ig2();
			}
			if ((local29 & 0x10) != 0) {
				if (local25.aClass71_1.method2099()) {
					Static154.method2781(local25);
				}
				local25.method4342(Static6.aClass219_1.method5570(Static212.aClass2_Sub4_Sub2_3.ig2()));
				local25.method4322(local25.aClass71_1.anInt2041);
				local25.anInt4604 = local25.aClass71_1.anInt2044 << 3;
				if (local25.aClass71_1.method2099()) {
					Static211.method3724(null, local25.anIntArray317[0], 0, null, local25, local25.anIntArray316[0], local25.aByte78);
				}
			}
		}
	}
}
