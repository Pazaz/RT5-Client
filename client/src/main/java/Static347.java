import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[I")
	public static int[] anIntArray557;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method5856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg7 && arg3 == arg2 && arg0 == arg6 && arg4 == arg8) {
			Static130.method5724(arg5, arg6, arg8, arg1, arg2);
			return;
		}
		@Pc(54) int local54 = arg5;
		@Pc(56) int local56 = arg2;
		@Pc(60) int local60 = arg5 * 3;
		@Pc(64) int local64 = arg2 * 3;
		@Pc(68) int local68 = arg7 * 3;
		@Pc(72) int local72 = arg3 * 3;
		@Pc(76) int local76 = arg0 * 3;
		@Pc(80) int local80 = arg4 * 3;
		@Pc(90) int local90 = arg6 + local68 - local76 - arg5;
		@Pc(100) int local100 = arg8 + local72 - local80 - arg2;
		@Pc(108) int local108 = local60 + local76 - local68 - local68;
		@Pc(119) int local119 = local80 + local64 - local72 - local72;
		@Pc(124) int local124 = local68 - local60;
		@Pc(128) int local128 = local72 - local64;
		for (@Pc(130) int local130 = 128; local130 <= 4096; local130 += 128) {
			@Pc(138) int local138 = local130 * local130 >> 12;
			@Pc(144) int local144 = local130 * local138 >> 12;
			@Pc(148) int local148 = local90 * local144;
			@Pc(152) int local152 = local144 * local100;
			@Pc(156) int local156 = local108 * local138;
			@Pc(160) int local160 = local138 * local119;
			@Pc(164) int local164 = local130 * local124;
			@Pc(168) int local168 = local128 * local130;
			@Pc(179) int local179 = (local164 + local148 + local156 >> 12) + arg5;
			@Pc(191) int local191 = arg2 + (local152 + local160 + local168 >> 12);
			Static130.method5724(local54, local179, local191, arg1, local56);
			local56 = local191;
			local54 = local179;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)V")
	public static void method5867(@OriginalArg(1) boolean arg0) {
		if (Static78.aBoolean142 != arg0) {
			Static78.aBoolean142 = arg0;
			Static168.method3494();
		}
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)Lclient!lo;")
	public static Class1_Sub21 method5868() {
		if (Static201.aClass130_28 == null || Static56.aClass195_1 == null) {
			return null;
		}
		Static56.aClass195_1.method5282(Static201.aClass130_28);
		@Pc(23) Class1_Sub21 local23 = (Class1_Sub21) Static56.aClass195_1.method5278();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class107 local32 = Static292.method5169(local23.anInt4155);
			return local32 != null && local32.aBoolean265 && local32.method3291() ? local23 : Static197.method3897();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ[[[Lclient!pm;III)Z")
	public static boolean method5870(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class154[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static135.anInt7217 & 0xFF);
		if (Static233.aByteArrayArrayArray13[Static39.anInt1215][arg4][arg3] == local14) {
			return false;
		} else if ((Static62.aByteArrayArrayArray3[Static39.anInt1215][arg4][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(43) byte local43 = 0;
			@Pc(50) int local50 = 0;
			Static311.anIntArray385[0] = arg4;
			@Pc(57) int local57 = local43 + 1;
			Static147.anIntArray257[0] = arg3;
			Static233.aByteArrayArrayArray13[Static39.anInt1215][arg4][arg3] = local14;
			while (local57 != local50) {
				@Pc(75) int local75 = Static311.anIntArray385[local50] & 0xFFFF;
				@Pc(83) int local83 = Static311.anIntArray385[local50] >> 16 & 0xFF;
				@Pc(91) int local91 = Static311.anIntArray385[local50] >> 24 & 0xFF;
				@Pc(97) int local97 = Static147.anIntArray257[local50] & 0xFFFF;
				@Pc(105) int local105 = Static147.anIntArray257[local50] >> 16 & 0xFF;
				local50 = local50 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static62.aByteArrayArrayArray3[Static39.anInt1215][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(127) boolean local127 = false;
				@Pc(169) int local169;
				@Pc(208) int local208;
				label231: for (@Pc(131) int local131 = Static39.anInt1215 + 1; local131 <= 3; local131++) {
					if ((Static62.aByteArrayArrayArray3[local131][local75][local97] & 0x8) == 0) {
						@Pc(317) Class7_Sub1 local317;
						@Pc(329) int local329;
						@Pc(306) Class154 local306;
						@Pc(312) Class93 local312;
						if (local113 && arg2[local131][local75][local97] != null) {
							if (arg2[local131][local75][local97].aClass7_Sub2_1 != null) {
								local169 = Static140.method3082(local83);
								if (local169 == arg2[local131][local75][local97].aClass7_Sub2_1.anInt6404 || arg2[local131][local75][local97].aClass7_Sub2_2 != null && arg2[local131][local75][local97].aClass7_Sub2_2.anInt6404 == local169) {
									continue;
								}
								if (local91 != 0) {
									local208 = Static140.method3082(local91);
									if (arg2[local131][local75][local97].aClass7_Sub2_1.anInt6404 == local208 || arg2[local131][local75][local97].aClass7_Sub2_2 != null && arg2[local131][local75][local97].aClass7_Sub2_2.anInt6404 == local208) {
										continue;
									}
								}
								if (local105 != 0) {
									local208 = Static140.method3082(local105);
									if (local208 == arg2[local131][local75][local97].aClass7_Sub2_1.anInt6404 || arg2[local131][local75][local97].aClass7_Sub2_2 != null && arg2[local131][local75][local97].aClass7_Sub2_2.anInt6404 == local208) {
										continue;
									}
								}
							}
							local306 = arg2[local131][local75][local97];
							if (local306.aClass93_3 != null) {
								for (local312 = local306.aClass93_3; local312 != null; local312 = local312.aClass93_2) {
									local317 = local312.aClass7_Sub1_1;
									if (local317 instanceof Interface6) {
										@Pc(323) Interface6 local323 = (Interface6) local317;
										local329 = local323.method5684();
										if (local329 == 21) {
											local329 = 19;
										}
										@Pc(338) int local338 = local323.method5687();
										@Pc(344) int local344 = local329 | local338 << 6;
										if (local83 == local344 || local91 != 0 && local91 == local344 || local105 != 0 && local344 == local105) {
											continue label231;
										}
									}
								}
							}
						}
						local306 = arg2[local131][local75][local97];
						if (local306 != null && local306.aClass93_3 != null) {
							for (local312 = local306.aClass93_3; local312 != null; local312 = local312.aClass93_2) {
								local317 = local312.aClass7_Sub1_1;
								if (local317.aShort93 != local317.aShort92 || local317.aShort90 != local317.aShort91) {
									for (@Pc(409) int local409 = local317.aShort93; local409 <= local317.aShort92; local409++) {
										for (local329 = local317.aShort91; local329 <= local317.aShort90; local329++) {
											Static233.aByteArrayArrayArray13[local131][local409][local329] = local14;
										}
									}
								}
							}
						}
						local127 = true;
						Static233.aByteArrayArrayArray13[local131][local75][local97] = local14;
					}
				}
				if (local127) {
					local169 = Static118.aClass77Array1[Static39.anInt1215 + 1].method3986(local75, local97);
					if (local169 > Static77.anIntArray135[arg0]) {
						Static77.anIntArray135[arg0] = local169;
					}
					local208 = local75 << 7;
					@Pc(491) int local491 = local97 << 7;
					if (local208 < Static245.anIntArray228[arg0]) {
						Static245.anIntArray228[arg0] = local208;
					} else if (Static249.anIntArray399[arg0] < local208) {
						Static249.anIntArray399[arg0] = local208;
					}
					if (local491 < Static205.anIntArray358[arg0]) {
						Static205.anIntArray358[arg0] = local491;
					} else if (Static73.anIntArray129[arg0] < local491) {
						Static73.anIntArray129[arg0] = local491;
					}
				}
				if (!local113) {
					if (local75 >= 1 && local14 != Static233.aByteArrayArrayArray13[Static39.anInt1215][local75 - 1][local97]) {
						Static311.anIntArray385[local57] = local75 - 1 | 0x120000 | 0xD3000000;
						Static147.anIntArray257[local57] = local97 | 0x130000;
						Static233.aByteArrayArrayArray13[Static39.anInt1215][local75 - 1][local97] = local14;
						local57 = local57 + 1 & 0xFFF;
					}
					@Pc(586) int local586 = ~Static219.anInt4987;
					local97++;
					if (local586 < ~local97) {
						if (local75 - 1 >= 0 && local14 != Static233.aByteArrayArrayArray13[Static39.anInt1215][local75 - 1][local97] && (Static62.aByteArrayArrayArray3[Static39.anInt1215][local75][local97] & 0x4) == 0 && (Static62.aByteArrayArrayArray3[Static39.anInt1215][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static311.anIntArray385[local57] = local75 - 1 | 0x120000 | 0x52000000;
							Static147.anIntArray257[local57] = local97 | 0x130000;
							local57 = local57 + 1 & 0xFFF;
							Static233.aByteArrayArrayArray13[Static39.anInt1215][local75 - 1][local97] = local14;
						}
						if (local14 != Static233.aByteArrayArrayArray13[Static39.anInt1215][local75][local97]) {
							Static311.anIntArray385[local57] = local75 | 0x520000 | 0x13000000;
							Static147.anIntArray257[local57] = local97 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static233.aByteArrayArrayArray13[Static39.anInt1215][local75][local97] = local14;
						}
						if (local75 + 1 < Static25.anInt850 && Static233.aByteArrayArrayArray13[Static39.anInt1215][local75 + 1][local97] != local14 && (Static62.aByteArrayArrayArray3[Static39.anInt1215][local75][local97] & 0x4) == 0 && (Static62.aByteArrayArrayArray3[Static39.anInt1215][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static311.anIntArray385[local57] = 0x92000000 | 0x520000 | local75 + 1;
							Static147.anIntArray257[local57] = local97 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static233.aByteArrayArrayArray13[Static39.anInt1215][local75 + 1][local97] = local14;
						}
					}
					local97--;
					if (Static25.anInt850 > local75 + 1 && Static233.aByteArrayArrayArray13[Static39.anInt1215][local75 + 1][local97] != local14) {
						Static311.anIntArray385[local57] = local75 + 1 | 0x53000000 | 0x920000;
						Static147.anIntArray257[local57] = local97 | 0x930000;
						Static233.aByteArrayArrayArray13[Static39.anInt1215][local75 + 1][local97] = local14;
						local57 = local57 + 1 & 0xFFF;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && local14 != Static233.aByteArrayArrayArray13[Static39.anInt1215][local75 - 1][local97] && (Static62.aByteArrayArrayArray3[Static39.anInt1215][local75][local97] & 0x4) == 0 && (Static62.aByteArrayArrayArray3[Static39.anInt1215][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static311.anIntArray385[local57] = local75 - 1 | 0x12000000 | 0xD20000;
							Static147.anIntArray257[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static233.aByteArrayArrayArray13[Static39.anInt1215][local75 - 1][local97] = local14;
						}
						if (Static233.aByteArrayArrayArray13[Static39.anInt1215][local75][local97] != local14) {
							Static311.anIntArray385[local57] = local75 | 0x93000000 | 0xD20000;
							Static147.anIntArray257[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static233.aByteArrayArrayArray13[Static39.anInt1215][local75][local97] = local14;
						}
						if (local75 + 1 < Static25.anInt850 && local14 != Static233.aByteArrayArrayArray13[Static39.anInt1215][local75 + 1][local97] && (Static62.aByteArrayArrayArray3[Static39.anInt1215][local75][local97] & 0x4) == 0 && (Static62.aByteArrayArrayArray3[Static39.anInt1215][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static311.anIntArray385[local57] = local75 + 1 | 0xD2000000 | 0x920000;
							Static147.anIntArray257[local57] = local97 | 0x930000;
							local57 = local57 + 1 & 0xFFF;
							Static233.aByteArrayArrayArray13[Static39.anInt1215][local75 + 1][local97] = local14;
						}
					}
				}
			}
			if (Static77.anIntArray135[arg0] != -1000000) {
				Static77.anIntArray135[arg0] += 10;
				Static245.anIntArray228[arg0] -= 50;
				Static249.anIntArray399[arg0] += 50;
				Static73.anIntArray129[arg0] += 50;
				Static205.anIntArray358[arg0] -= 50;
			}
			return true;
		}
	}
}
