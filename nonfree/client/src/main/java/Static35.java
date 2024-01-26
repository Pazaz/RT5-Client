import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bd", name = "Jb", descriptor = "I")
	public static int anInt813;

	@OriginalMember(owner = "client!bd", name = "Lb", descriptor = "I")
	public static int anInt800 = 0;

	@OriginalMember(owner = "client!bd", name = "ub", descriptor = "[I")
	public static final int[] anIntArray58 = new int[3];

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public static void method918() {
		for (@Pc(7) int local7 = 0; local7 < Static33.anInt779; local7++) {
			@Pc(13) Class104 local13 = Static409.aClass104Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(179) int local179;
			if (local13.aClass2_Sub6_Sub2_2 == null) {
				local13.anInt2571--;
				if (local13.anInt2571 < (local13.method2418() ? -1500 : -10)) {
					local15 = true;
				} else {
					if (local13.aByte49 == 1 && local13.aClass89_1 == null) {
						local13.aClass89_1 = Static729.method2245(Static281.aClass330_60, local13.anInt2580, 0);
						if (local13.aClass89_1 == null) {
							continue;
						}
						local13.anInt2571 += local13.aClass89_1.method2248();
					} else if (local13.method2418() && (local13.aClass2_Sub53_1 == null || local13.aClass2_Sub49_Sub1_2 == null)) {
						if (local13.aClass2_Sub53_1 == null) {
							local13.aClass2_Sub53_1 = Static650.method8498(Static147.aClass330_26, local13.anInt2580);
						}
						if (local13.aClass2_Sub53_1 == null) {
							continue;
						}
						if (local13.aClass2_Sub49_Sub1_2 == null) {
							local13.aClass2_Sub49_Sub1_2 = local13.aClass2_Sub53_1.method8502(new int[] { 22050 });
							if (local13.aClass2_Sub49_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local13.anInt2571 < 0) {
						@Pc(154) int local154 = 8192;
						if (local13.anInt2578 == 0) {
							local179 = local13.anInt2577 * (local13.aByte49 == 3 ? Static400.aClass2_Sub34_28.lb.method7208() : Static400.aClass2_Sub34_28.aClass57_Sub25_3.method7208()) >> 2;
						} else {
							@Pc(188) int local188 = local13.anInt2578 >> 24 & 0x3;
							if (local188 == Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144) {
								@Pc(199) int local199 = (local13.anInt2578 & 0xFF) << 9;
								@Pc(205) int local205 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9302((byte) 126) << 8;
								@Pc(212) int local212 = local13.anInt2578 >> 16 & 0xFF;
								@Pc(224) int local224 = (local212 << 9) + local205 + 256 - Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690;
								@Pc(231) int local231 = local13.anInt2578 >> 8 & 0xFF;
								@Pc(243) int local243 = local205 + (local231 << 9) + 256 - Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694;
								@Pc(251) int local251 = Math.abs(local224) + Math.abs(local243) - 512;
								if (local199 < local251) {
									local13.anInt2571 = -99999;
									continue;
								}
								if (local251 < 0) {
									local251 = 0;
								}
								local179 = Static400.aClass2_Sub34_28.aClass57_Sub25_1.method7208() * (local199 - local251) * local13.anInt2577 / local199 >> 2;
								if (local13.aClass8_Sub2_10 != null && local13.aClass8_Sub2_10 instanceof Class8_Sub2_Sub1) {
									@Pc(301) Class8_Sub2_Sub1 local301 = (Class8_Sub2_Sub1) local13.aClass8_Sub2_10;
									@Pc(304) short local304 = local301.aShort132;
									@Pc(307) short local307 = local301.aShort131;
								}
								if (local224 != 0 || local243 != 0) {
									@Pc(336) int local336 = -Static323.anInt5119 - (int) (Math.atan2((double) local224, (double) local243) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local336 > 8192) {
										local336 = 16384 - local336;
									}
									@Pc(355) int local355;
									if (local251 <= 0) {
										local355 = 8192;
									} else if (local251 >= 4096) {
										local355 = 16384;
									} else {
										local355 = (8192 - local251) / 4096 + 8192;
									}
									local154 = (16384 - local355 >> 1) + local336 * local355 / 8192;
								}
							} else {
								local179 = 0;
							}
						}
						if (local179 > 0) {
							@Pc(392) Class2_Sub49_Sub1 local392 = null;
							if (local13.aByte49 == 1) {
								local392 = local13.aClass89_1.method2247().method7821(Static681.aClass224_2);
							} else if (local13.method2418()) {
								local392 = local13.aClass2_Sub49_Sub1_2;
							}
							@Pc(422) Class2_Sub6_Sub2 local422 = local13.aClass2_Sub6_Sub2_2 = Static730.method3346(local392, local13.anInt2573, local179, local154);
							local422.method3318(local13.anInt2574 - 1);
							Static336.aClass2_Sub6_Sub3_1.method5882(local422);
						}
					}
				}
			} else if (!local13.aClass2_Sub6_Sub2_2.method9458()) {
				local15 = true;
			}
			if (local15) {
				Static33.anInt779--;
				for (local179 = local7; local179 < Static33.anInt779; local179++) {
					Static409.aClass104Array1[local179] = Static409.aClass104Array1[local179 + 1];
				}
				local7--;
			}
		}
		if (Static501.aBoolean575 && !Static52.method1157(126)) {
			if (Static400.aClass2_Sub34_28.aClass57_Sub25_2.method7208() != 0 && Static588.anInt8692 != -1) {
				if (Static8.aClass2_Sub6_Sub1_1 == null) {
					Static611.method8229(Static588.anInt8692, Static400.aClass2_Sub34_28.aClass57_Sub25_2.method7208(), Static398.aClass330_81);
				} else {
					Static273.method3961(Static8.aClass2_Sub6_Sub1_1, Static588.anInt8692, Static398.aClass330_81, Static400.aClass2_Sub34_28.aClass57_Sub25_2.method7208());
				}
			}
			Static8.aClass2_Sub6_Sub1_1 = null;
			Static501.aBoolean575 = false;
		} else if (Static400.aClass2_Sub34_28.aClass57_Sub25_2.method7208() != 0 && Static588.anInt8692 != -1 && !Static52.method1157(125)) {
			@Pc(551) Class2_Sub19 local551 = Static293.method4335(Static235.aClass345_49, Static405.aClass153_2.aClass186_1);
			local551.aClass2_Sub21_Sub2_1.method7342(Static588.anInt8692);
			Static405.aClass153_2.method3275(local551);
			Static588.anInt8692 = -1;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!ge;I)Lclient!lv;")
	public static Class235 method935(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(7) int local7 = arg0.method7396();
		@Pc(16) Class403 local16 = Static33.method882()[arg0.method7396()];
		@Pc(25) Class103 local25 = Static313.method4544()[arg0.method7396()];
		@Pc(29) int local29 = arg0.method7356();
		@Pc(33) int local33 = arg0.method7356();
		@Pc(39) int local39 = arg0.method7382();
		@Pc(43) int local43 = arg0.method7382();
		@Pc(49) int local49 = arg0.method7349();
		@Pc(53) int local53 = arg0.method7349();
		@Pc(59) int local59 = arg0.method7349();
		@Pc(69) boolean local69 = arg0.method7396() == 1;
		return new Class235(local7, local16, local25, local29, local33, local39, local43, local49, local53, local59, local69);
	}
}
