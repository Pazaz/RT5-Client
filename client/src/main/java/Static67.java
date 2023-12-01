import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "Lclient!kn;")
	public static Class129 aClass129_1;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_35 = new LocalizedString("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "[I")
	public static final int[] anIntArray111 = new int[6];

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray15 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "()V")
	public static void method1765() {
		for (@Pc(1) int local1 = 0; local1 < Scene.anInt3139; local1++) {
			if (!Scene.aBooleanArray57[local1]) {
				@Pc(10) Class2_Sub26_Sub1 local10 = Scene.aClass2_Sub26_Sub1Array2[local1];
				@Pc(13) int local13 = local10.anInt4380;
				@Pc(18) int local18 = local10.anInt4374 - Scene.anInt4693;
				@Pc(26) int local26 = (local18 * 2 >> Scene.scale) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt4370 - local18 >> Scene.scale;
				@Pc(47) int local47 = local10.anInt4371 - local18 >> Scene.scale;
				@Pc(54) int local54 = local10.anInt4371 + local18 >> Scene.scale;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Scene.anInt3773) {
					local54 = Scene.anInt3773 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray92[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Scene.anInt1684) {
						local101 = Scene.anInt1684 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Entity local134 = Static105.method2207(local13, local118, local71, Entity.class);
						if (local134 != null && local134.aByte77 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte77 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray92[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray92[local28 - 1];
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
									local175 = local10.aShortArray92[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray92[local28 + 1];
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
				Scene.aBooleanArray57[local1] = true;
				Scene.aClass6Array4[local13].method5721(local10, local33);
			}
		}
	}

}
