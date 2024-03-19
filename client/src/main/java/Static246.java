import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int anInt6529;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Lclient!qj;")
	public static Class162 aClass162_223;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
	public static boolean aBoolean472 = false;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "[I")
	public static final int[] anIntArray499 = new int[50];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!gm;Lclient!gm;[[II[[BII[[B[[BLclient!nr;[[BZB)V")
	public static void method5520(@OriginalArg(0) Class77 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) Class40 arg9, @OriginalArg(10) byte[][] arg10, @OriginalArg(11) boolean arg11) {
		for (@Pc(7) int local7 = 0; local7 < arg3; local7++) {
			for (@Pc(11) int local11 = 0; local11 < arg6; local11++) {
				if (Static13.method5497() || Static58.method1400(local7, local11, arg5, Static331.anInt6843)) {
					@Pc(31) byte local31 = arg4[local7][local11];
					@Pc(37) byte local37 = arg8[local7][local11];
					@Pc(45) int local45 = arg10[local7][local11] & 0xFF;
					@Pc(53) int local53 = arg7[local7][local11] & 0xFF;
					@Pc(66) Class191 local66 = local45 == 0 ? null : Static295.method5207(local45 - 1);
					@Pc(76) Class119 local76 = local53 == 0 ? null : Static293.method5171(local53 - 1);
					@Pc(78) int local78 = 0;
					@Pc(80) int local80 = 0;
					if (local31 != 0) {
						local80 = local66 == null ? 0 : Static334.anIntArray564[local31];
						local78 = local76 == null ? 0 : Static300.anIntArray484[local31];
					} else if (local66 != null) {
						local80 = Static334.anIntArray564[local31];
					} else if (local76 != null) {
						local78 = Static334.anIntArray564[local31];
					}
					@Pc(121) int local121 = local78 + local80;
					@Pc(123) int local123 = 0;
					if (local121 != 0) {
						@Pc(128) int[] local128 = new int[local121];
						@Pc(131) int[] local131 = new int[local121];
						@Pc(134) int[] local134 = new int[local121];
						@Pc(137) int[] local137 = new int[local121];
						@Pc(139) boolean local139 = false;
						@Pc(164) int local164;
						@Pc(170) int local170;
						if (local66 == null || local66.anInt6235 == -1 && local66.anInt6243 == -1 && local66.anInt6233 == -1) {
							for (local164 = 0; local164 < local80; local164++) {
								local128[local123] = -1;
								local123++;
							}
						} else {
							local164 = arg9.method2767() ? local66.anInt6233 : local66.anInt6234;
							if (!Static166.aBoolean285) {
								local164 = -1;
							}
							for (local170 = 0; local170 < local80; local170++) {
								local134[local123] = local164;
								local137[local123] = local66.anInt6242;
								if (local66.anInt6235 == -1) {
									local128[local123] = -1;
								} else {
									local128[local123] = local66.anInt6235;
								}
								if (local66.anInt6243 == -1) {
									local131[local123] = -1;
								} else {
									local139 = true;
									local131[local123] = local66.anInt6243;
								}
								local123++;
							}
							if (!arg11 && arg5 == 0) {
								Static283.method5056(local7, local11, local66.anInt6244, local66.anInt6239 * 8);
							}
						}
						if (!local139) {
							local131 = null;
						}
						if (local76 == null) {
							for (local164 = 0; local164 < local78; local164++) {
								local128[local123] = -1;
								local123++;
							}
						} else {
							local164 = local76.anInt4096;
							if (!Static166.aBoolean285) {
								local164 = -1;
							}
							for (local170 = 0; local170 < local78; local170++) {
								local134[local123] = local164;
								local137[local123] = local76.anInt4102;
								local128[local123] = arg2[local7][local11];
								if (local131 != null) {
									local131[local123] = -1;
								}
								local123++;
							}
						}
						local164 = Static332.anIntArray556.length;
						@Pc(328) int[] local328 = arg11 ? new int[local164] : null;
						@Pc(331) int[] local331 = new int[local164];
						@Pc(334) int[] local334 = new int[local164];
						@Pc(342) int local342;
						@Pc(346) int local346;
						@Pc(430) int local430;
						@Pc(439) int local439;
						for (@Pc(336) int local336 = 0; local336 < local164; local336++) {
							local342 = Static332.anIntArray556[local336];
							local346 = Static105.anIntArray169[local336];
							if (local37 == 0) {
								local331[local336] = local342;
								local334[local336] = local346;
							} else if (local37 == 1) {
								local331[local336] = local346;
								local334[local336] = 128 - local342;
							} else if (local37 == 2) {
								local331[local336] = 128 - local342;
								local334[local336] = 128 - local346;
							} else if (local37 == 3) {
								local331[local336] = 128 - local346;
								local334[local336] = local342;
							}
							if (arg11 && Static59.aBooleanArrayArray9[local31][local336]) {
								local430 = local331[local336] + (local7 << 7);
								local439 = (local11 << 7) + local334[local336];
								local328[local336] = arg0.method3994(local430, local439) - arg1.method3994(local430, local439);
							}
						}
						local342 = arg1.method3986(local7, local11);
						local346 = arg1.method3986(local7 + 1, local11);
						local430 = arg1.method3986(local7 + 1, local11 + 1);
						local439 = arg1.method3986(local7, local11 + 1);
						if (arg5 > 0) {
							@Pc(491) boolean local491 = true;
							if (local53 == 0 && local31 != 0) {
								local491 = false;
							}
							if (local45 > 0 && local66 != null && !local66.aBoolean445) {
								local491 = false;
							}
							if (local491 && local342 == local346 && local342 == local430 && local439 == local342) {
								Static190.aByteArrayArrayArray15[arg5][local7][local11] = (byte) (Static190.aByteArrayArrayArray15[arg5][local7][local11] | 0x4);
							}
						}
						@Pc(539) int local539 = 0;
						@Pc(541) int local541 = 0;
						if (arg11) {
							local539 = Static159.method3982(local7, local11);
							local541 = Static43.method1266(local7, local11);
						}
						arg1.method3997(local7, local11, local331, local328, local334, Static36.anIntArrayArray4[local31], Static143.anIntArrayArray18[local31], Static265.anIntArrayArray37[local31], local128, local131, local134, local137, local539, local541);
						Static91.method1998(arg5, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
	public static void method5554() {
		Static150.aClass215_55.method6060();
	}
}
