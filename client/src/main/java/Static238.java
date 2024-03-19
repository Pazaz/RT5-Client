import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "Lclient!qj;")
	public static Class162 aClass162_189;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "[C")
	public static final char[] aCharArray16 = new char[128];

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString187 = null;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "Z")
	public static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
	public static int anInt5295 = 0;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "[I")
	public static final int[] anIntArray389 = new int[250];

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	public static int anInt5296 = 500;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!nr;Lclient!gm;[Lclient!bi;IZB)V")
	public static void method4509(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class22[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(31) int local31;
		if (!arg4) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (local13 = 0; local13 < Static25.anInt850; local13++) {
					for (local17 = 0; local17 < Static219.anInt4987; local17++) {
						if ((Static62.aByteArrayArrayArray3[local9][local13][local17] & 0x1) != 0) {
							local31 = local9;
							if ((Static62.aByteArrayArrayArray3[1][local13][local17] & 0x2) != 0) {
								local31 = local9 - 1;
							}
							if (local31 >= 0) {
								arg2[local31].method517(local17, local13);
							}
						}
					}
				}
			}
		}
		@Pc(73) int[][] local73 = new int[Static25.anInt850][Static219.anInt4987];
		for (local13 = 0; local13 < arg3; local13++) {
			for (local17 = 0; local17 < Static219.anInt4987; local17++) {
				Static12.anIntArray32[local17] = 0;
				Static194.anIntArray316[local17] = 0;
				Static127.anIntArray237[local17] = 0;
				Static159.anIntArray351[local17] = 0;
				Static135.anIntArray583[local17] = 0;
			}
			for (local31 = -5; local31 < Static25.anInt850; local31++) {
				@Pc(130) int local130;
				@Pc(143) int local143;
				@Pc(212) int local212;
				for (@Pc(124) int local124 = 0; local124 < Static219.anInt4987; local124++) {
					local130 = local31 + 5;
					@Pc(190) int local190;
					if (local130 < Static25.anInt850) {
						local143 = Static139.aByteArrayArrayArray9[local13][local130][local124] & 0xFF;
						if (local143 > 0) {
							@Pc(154) Class119 local154 = Static293.method5171(local143 - 1);
							Static12.anIntArray32[local124] += local154.anInt4095;
							Static194.anIntArray316[local124] += local154.anInt4097;
							Static127.anIntArray237[local124] += local154.anInt4098;
							Static159.anIntArray351[local124] += local154.anInt4100;
							local190 = Static135.anIntArray583[local124]++;
						}
					}
					local143 = local31 - 5;
					if (local143 >= 0) {
						local212 = Static139.aByteArrayArrayArray9[local13][local143][local124] & 0xFF;
						if (local212 > 0) {
							@Pc(220) Class119 local220 = Static293.method5171(local212 - 1);
							Static12.anIntArray32[local124] -= local220.anInt4095;
							Static194.anIntArray316[local124] -= local220.anInt4097;
							Static127.anIntArray237[local124] -= local220.anInt4098;
							Static159.anIntArray351[local124] -= local220.anInt4100;
							local190 = Static135.anIntArray583[local124]--;
						}
					}
				}
				if (local31 >= 0) {
					local130 = 0;
					local143 = 0;
					local212 = 0;
					@Pc(273) int local273 = 0;
					@Pc(275) int local275 = 0;
					for (@Pc(277) int local277 = -5; local277 < Static219.anInt4987; local277++) {
						@Pc(283) int local283 = local277 + 5;
						if (Static219.anInt4987 > local283) {
							local143 += Static194.anIntArray316[local283];
							local273 += Static159.anIntArray351[local283];
							local275 += Static135.anIntArray583[local283];
							local130 += Static12.anIntArray32[local283];
							local212 += Static127.anIntArray237[local283];
						}
						@Pc(320) int local320 = local277 - 5;
						if (local320 >= 0) {
							local143 -= Static194.anIntArray316[local320];
							local130 -= Static12.anIntArray32[local320];
							local275 -= Static135.anIntArray583[local320];
							local273 -= Static159.anIntArray351[local320];
							local212 -= Static127.anIntArray237[local320];
						}
						if (local277 >= 0 && local273 > 0 && local275 > 0) {
							local73[local31][local277] = Static283.method5058(local143 / local275, local212 / local275, local130 * 256 / local273);
						}
					}
				}
			}
			Static25.method625(arg0, Static105.aByteArrayArrayArray8[local13], Static219.anInt4987, Static118.aClass77Array1[local13], Static139.aByteArrayArrayArray9[local13], Static18.aByteArrayArrayArray1[local13], Static25.anInt850, arg1, local73, arg4, local13, Static304.aByteArrayArrayArray16[local13]);
			Static139.aByteArrayArrayArray9[local13] = null;
			Static18.aByteArrayArrayArray1[local13] = null;
			Static304.aByteArrayArrayArray16[local13] = null;
			Static105.aByteArrayArrayArray8[local13] = null;
		}
		if (!arg4) {
			if (Static265.aBoolean396) {
				Static290.method5136();
			}
			if (Static102.anInt2545 != 0) {
				Static261.method4765();
			}
		}
		for (local17 = 0; local17 < arg3; local17++) {
			Static118.aClass77Array1[local17].method3987();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIZZ)V")
	public static void method4510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static26.aLong34 = 0L;
		@Pc(8) int local8 = Static164.method3437();
		if (arg0 == 3 || local8 == 3) {
			arg3 = true;
		}
		if (!Static221.aClass40_6.method2714()) {
			arg3 = true;
		}
		Static43.method1265(arg1, local8, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	public static void method4511() {
		Static109.aFont1 = null;
		Static199.anImage1 = null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BJ)V")
	public static void method4513(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}
}
