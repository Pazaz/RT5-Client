import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!mia", name = "e", descriptor = "[I")
	public static int[] anIntArray482;

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIIBI[B)V")
	public static void method5554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg3 > 0 && !Static700.method9150(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static700.method9150(arg4)) {
			@Pc(35) int local35 = Static646.method8458(arg2);
			@Pc(37) int local37 = 0;
			@Pc(45) int local45 = arg4 <= arg3 ? arg4 : arg3;
			@Pc(49) int local49 = arg3 >> 1;
			@Pc(53) int local53 = arg4 >> 1;
			@Pc(55) byte[] local55 = arg5;
			@Pc(62) byte[] local62 = new byte[local35 * local49 * local53];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local37, arg0, arg3, arg4, 0, arg2, OpenGL.GL_UNSIGNED_BYTE, local55, 0);
				if (local45 <= 1) {
					return;
				}
				@Pc(82) int local82 = local35 * arg3;
				for (@Pc(84) int local84 = 0; local84 < local35; local84++) {
					@Pc(87) int local87 = local84;
					@Pc(89) int local89 = local84;
					@Pc(93) int local93 = local82 + local84;
					for (@Pc(95) int local95 = 0; local95 < local53; local95++) {
						for (@Pc(98) int local98 = 0; local98 < local49; local98++) {
							@Pc(103) byte local103 = local55[local89];
							local89 += local35;
							@Pc(113) int local113 = local103 + local55[local89];
							local89 += local35;
							@Pc(123) int local123 = local113 + local55[local93];
							local93 += local35;
							@Pc(133) int local133 = local123 + local55[local93];
							local93 += local35;
							local62[local87] = (byte) (local133 >> 2);
							local87 += local35;
						}
						local93 += local82;
						local89 += local82;
					}
				}
				@Pc(184) byte[] local184 = local62;
				local62 = local55;
				arg3 = local49;
				arg4 = local53;
				local55 = local184;
				local37++;
				local45 >>= 0x1;
				local49 >>= 0x1;
				local53 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(III[FIF[FIIII)V")
	public static void method5556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg9;
		@Pc(15) int local15 = arg8 - arg0;
		@Pc(36) float local36 = arg6[2] * (float) local3 + arg6[1] * (float) local11 + arg6[0] * (float) local15;
		@Pc(57) float local57 = (float) local11 * arg6[4] + arg6[3] * (float) local15 + (float) local3 * arg6[5];
		@Pc(78) float local78 = arg6[8] * (float) local3 + arg6[7] * (float) local11 + arg6[6] * (float) local15;
		@Pc(93) float local93 = (float) Math.sqrt((double) (local36 * local36 + local57 * local57 + local78 * local78));
		@Pc(111) float local111 = (float) Math.atan2((double) local36, (double) local78) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local57 / local93)) / 3.1415927F + arg5 + 0.5F;
		@Pc(146) float local146;
		if (arg7 == 1) {
			local146 = local111;
			local111 = -local124;
			local124 = local146;
		} else if (arg7 == 2) {
			local111 = -local111;
			local124 = -local124;
		} else if (arg7 == 3) {
			local146 = local111;
			local111 = local124;
			local124 = -local146;
		}
		arg3[0] = local111;
		arg3[1] = local124;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(BILclient!cg;ILclient!cg;IIIII)V")
	public static void method5557(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub2_Sub1_Sub2 arg1, @OriginalArg(4) Class8_Sub2_Sub1_Sub2 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg2.method9304((byte) -71);
		if (local7 == -1) {
			return;
		}
		@Pc(27) Class23 local27 = (Class23) Static541.aClass82_174.method2156((long) local7);
		if (local27 == null) {
			@Pc(34) Class407[] local34 = Static735.method9375(Static721.aClass330_128, local7);
			if (local34 == null) {
				return;
			}
			local27 = Static163.aClass19_17.method7948(local34[0], true);
			Static541.aClass82_174.method2150(local27, (long) local7);
		}
		Static418.method7860(arg1.aByte144, arg1.anInt10694, 0, arg1.anInt10690, arg1.method9302((byte) 55) * 256);
		@Pc(75) int local75 = arg0 + Static215.anIntArray284[0] - 18;
		@Pc(83) int local83 = local75 + arg6 / 4 * 18;
		@Pc(94) int local94 = arg5 + Static215.anIntArray284[1] - 54 - 16;
		@Pc(102) int local102 = local94 + arg6 % 4 * 18;
		local27.method8202(local83, local102);
		if (arg2 == arg1) {
			Static163.aClass19_17.method7945(local102 - 1, -256, 18, 18, local83 - 1);
		}
		Static682.method8927(local102 - 1, local102 - -18, local83 - 1, local83 - -18);
		@Pc(140) Class8_Sub1 local140 = Static192.method2876();
		local140.anInt108 = local83;
		local140.aClass8_Sub2_Sub1_Sub2_1 = arg2;
		local140.anInt112 = local102;
		local140.anInt109 = local83 + 16;
		local140.anInt111 = local102 + 16;
		Static149.aClass130_4.method2787(local140);
	}
}
