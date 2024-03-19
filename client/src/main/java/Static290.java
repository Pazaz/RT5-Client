import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!so", name = "k", descriptor = "Lclient!qj;")
	public static Class162 aClass162_212;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "I")
	public static int anInt6083;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "Lclient!dr;")
	public static Class30 aClass30_3;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "I")
	public static int anInt6081 = 0;

	@OriginalMember(owner = "client!so", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString226 = "Opened title screen";

	@OriginalMember(owner = "client!so", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString227 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!so", name = "g", descriptor = "Lclient!sa;")
	public static Class1_Sub32 aClass1_Sub32_1 = null;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "[I")
	public static final int[] anIntArray464 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLclient!fg;)V")
	public static void method5133(@OriginalArg(1) Class7_Sub1_Sub1 arg0) {
		@Pc(9) boolean local9 = false;
		if (arg0.anInt7044 == Static197.anInt4521 || arg0.anInt7046 == -1 || arg0.anInt7055 != 0) {
			local9 = true;
		} else {
			@Pc(26) Class165 local26 = Static231.method4385(arg0.anInt7046);
			if (local26.aBoolean394 || local26.anIntArray410[arg0.anInt7047] < arg0.anInt7037 + 1) {
				local9 = true;
			}
		}
		if (local9) {
			@Pc(58) int local58 = arg0.anInt7044 - arg0.anInt7098;
			@Pc(63) int local63 = Static197.anInt4521 - arg0.anInt7098;
			@Pc(74) int local74 = arg0.anInt7075 * 128 + arg0.method5973() * 64;
			@Pc(86) int local86 = arg0.anInt7048 * 128 + arg0.method5973() * 64;
			@Pc(98) int local98 = arg0.anInt7067 * 128 + arg0.method5973() * 64;
			@Pc(109) int local109 = arg0.anInt7064 * 128 + arg0.method5973() * 64;
			arg0.anInt7032 = (local63 * local109 + local86 * (local58 - local63)) / local58;
			arg0.anInt7027 = (local74 * (local58 - local63) + local63 * local98) / local58;
		}
		arg0.anInt7106 = 0;
		if (arg0.anInt7065 == 0) {
			arg0.method5976(8192);
		}
		if (arg0.anInt7065 == 1) {
			arg0.method5976(12288);
		}
		if (arg0.anInt7065 == 2) {
			arg0.method5976(0);
		}
		if (arg0.anInt7065 == 3) {
			arg0.method5976(4096);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!qj;Z)V")
	public static void method5135(@OriginalArg(0) Class162 arg0) {
		Static181.aClass162_149 = arg0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "()V")
	public static void method5136() {
		for (@Pc(1) int local1 = 0; local1 < Static273.anInt5747; local1++) {
			if (!Static174.aBooleanArray11[local1]) {
				@Pc(10) Class1_Sub9_Sub1 local10 = Static68.aClass1_Sub9_Sub1Array1[local1];
				@Pc(13) int local13 = local10.anInt4587;
				@Pc(18) int local18 = local10.anInt4577 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt4580 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt4576 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt4576 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static200.anInt4590) {
					local54 = Static200.anInt4590 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray88[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static328.anInt6717) {
						local101 = Static328.anInt6717 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class7_Sub1 local134 = Static95.method2029(local13, local118, local71, Class7_Sub1.class);
						if (local134 != null && local134.aByte73 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte73 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray88[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray88[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 4;
								} else if (local161 && !local152) {
									local121 = 2;
								}
							} else {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 - 1 >= local47) {
									local175 = local10.aShortArray88[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray88[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 3;
								} else if (local161 && !local152) {
									local121 = 5;
								}
							}
						}
						local33[local87++] = local121;
					}
					local28++;
				}
				Static174.aBooleanArray11[local1] = true;
				Static118.aClass77Array1[local13].method3993(local10, local33);
			}
		}
	}
}
