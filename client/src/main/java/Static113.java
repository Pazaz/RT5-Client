import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!hk", name = "C", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "[J")
	public static long[] aLongArray1;

	@OriginalMember(owner = "client!hk", name = "Y", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!hk", name = "ib", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!hk", name = "tb", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!hk", name = "vb", descriptor = "Z")
	public static boolean aBoolean194;

	@OriginalMember(owner = "client!hk", name = "Ab", descriptor = "I")
	public static int anInt2905;

	@OriginalMember(owner = "client!hk", name = "Cb", descriptor = "I")
	public static int anInt2906;

	@OriginalMember(owner = "client!hk", name = "Db", descriptor = "I")
	public static int anInt2907;

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "Lclient!sb;")
	public static Class1_Sub16_Sub1 aClass1_Sub16_Sub1_1 = new Class1_Sub16_Sub1(8192);

	@OriginalMember(owner = "client!hk", name = "wb", descriptor = "[I")
	public static final int[] anIntArray212 = new int[8];

	@OriginalMember(owner = "client!hk", name = "xb", descriptor = "[I")
	public static int[] anIntArray213 = new int[1];

	@OriginalMember(owner = "client!hk", name = "yb", descriptor = "[I")
	public static int[] anIntArray214 = new int[1];

	@OriginalMember(owner = "client!hk", name = "zb", descriptor = "[I")
	public static final int[] anIntArray215 = new int[8];

	@OriginalMember(owner = "client!hk", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray216 = new int[8];

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(FFZF)I")
	public static int method2486(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(8) float local8 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(22) float local22 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(31) float local31 = arg0 < 0.0F ? -arg0 : arg0;
		if (local22 > local8 && local22 > local31) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local31 > local8 && local22 < local31) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([FIIIIIFFIII)V")
	public static void method2487(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg4 - arg1;
		@Pc(7) int local7 = arg7 - arg9;
		@Pc(11) int local11 = arg2 - arg3;
		@Pc(32) float local32 = (float) local11 * arg0[2] + (float) local7 * arg0[1] + arg0[0] * (float) local3;
		@Pc(53) float local53 = arg0[3] * (float) local3 + arg0[4] * (float) local7 + arg0[5] * (float) local11;
		@Pc(74) float local74 = (float) local11 * arg0[8] + (float) local3 * arg0[6] + arg0[7] * (float) local7;
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local85 *= arg5;
		}
		@Pc(100) float local100 = arg6 + local53 + 0.5F;
		@Pc(107) float local107;
		if (arg8 == 1) {
			local107 = local85;
			local85 = -local100;
			local100 = local107;
		} else if (arg8 == 2) {
			local85 = -local85;
			local100 = -local100;
		} else if (arg8 == 3) {
			local107 = local85;
			local85 = local100;
			local100 = -local107;
		}
		aFloat22 = local100;
		aFloat24 = local85;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(FIIIIIII[FI)V")
	public static void method2490(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg6 - arg2;
		@Pc(7) int local7 = arg8 - arg1;
		@Pc(11) int local11 = arg5 - arg4;
		@Pc(32) float local32 = arg7[2] * (float) local7 + arg7[0] * (float) local3 + (float) local11 * arg7[1];
		@Pc(53) float local53 = (float) local7 * arg7[5] + (float) local3 * arg7[3] + arg7[4] * (float) local11;
		@Pc(74) float local74 = arg7[7] * (float) local11 + arg7[6] * (float) local3 + (float) local7 * arg7[8];
		@Pc(89) float local89 = (float) Math.sqrt((double) (local53 * local53 + local32 * local32 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(129) float local129 = arg0 + (float) Math.asin((double) (local53 / local89)) / 3.1415927F + 0.5F;
		@Pc(152) float local152;
		if (arg3 == 1) {
			local152 = local100;
			local100 = -local129;
			local129 = local152;
		} else if (arg3 == 2) {
			local100 = -local100;
			local129 = -local129;
		} else if (arg3 == 3) {
			local152 = local100;
			local100 = local129;
			local129 = -local152;
		}
		aFloat20 = local100;
		aFloat23 = local129;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BII)I")
	public static int method2491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB[B)[B")
	public static byte[] method2493(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(8) byte[] local8 = new byte[arg0];
		Static360.method2013(arg1, 0, local8, 0, arg0);
		return local8;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[F)[F")
	public static float[] method2495(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(2) float[] local2 = new float[arg0];
		Static360.method2014(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIFIIIIIFFI[F)V")
	public static void method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(12) float[] arg11) {
		@Pc(3) int local3 = arg2 - arg7;
		@Pc(15) int local15 = arg1 - arg6;
		@Pc(19) int local19 = arg4 - arg8;
		@Pc(40) float local40 = (float) local19 * arg11[2] + arg11[0] * (float) local3 + arg11[1] * (float) local15;
		@Pc(61) float local61 = arg11[4] * (float) local15 + (float) local3 * arg11[3] + (float) local19 * arg11[5];
		@Pc(82) float local82 = arg11[8] * (float) local19 + (float) local15 * arg11[7] + (float) local3 * arg11[6];
		@Pc(99) float local99;
		@Pc(93) float local93;
		if (arg5 == 0) {
			local99 = local40 + arg10 + 0.5F;
			local93 = arg9 + 0.5F - local82;
		} else if (arg5 == 1) {
			local93 = arg9 + local82 + 0.5F;
			local99 = local40 + arg10 + 0.5F;
		} else if (arg5 == 2) {
			local99 = arg10 + 0.5F - local40;
			local93 = arg3 + 0.5F - local61;
		} else if (arg5 == 3) {
			local93 = arg3 + 0.5F - local61;
			local99 = arg10 + local40 + 0.5F;
		} else if (arg5 == 4) {
			local93 = arg3 + 0.5F - local61;
			local99 = local82 + arg9 + 0.5F;
		} else {
			local99 = arg9 + 0.5F - local82;
			local93 = arg3 + 0.5F - local61;
		}
		@Pc(200) float local200;
		if (arg0 == 1) {
			local200 = local99;
			local99 = -local93;
			local93 = local200;
		} else if (arg0 == 2) {
			local99 = -local99;
			local93 = -local93;
		} else if (arg0 == 3) {
			local200 = local99;
			local99 = local93;
			local93 = -local200;
		}
		aFloat21 = local99;
		Class86_Sub1.lb = local93;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[SB)[S")
	public static short[] method2497(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(8) short[] local8 = new short[arg0];
		Static360.method2016(arg1, 0, local8, 0, arg0);
		return local8;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(FIIFIIIF)[F")
	public static float[] method2499(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(21) float local21 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(29) float local29 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local2[0] = local21;
		local2[1] = 0.0F;
		local2[5] = 0.0F;
		local2[2] = local29;
		local2[8] = local21;
		local2[4] = 1.0F;
		local2[3] = 0.0F;
		local2[6] = -local29;
		local2[7] = 0.0F;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = (float) arg2 / 32767.0F;
		@Pc(88) float local88 = 1.0F - local83;
		@Pc(99) float local99 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg1 * arg1 + arg4 * arg4));
		if (local110 == 0.0F && local83 == 0.0F) {
			local5 = local2;
		} else {
			if (local110 != 0.0F) {
				local78 = (float) arg4 / local110;
				local76 = (float) -arg1 / local110;
			}
			local74[6] = local88 * local78 * local76;
			local74[8] = local83 + local88 * local78 * local78;
			local74[1] = local78 * local99;
			local74[5] = local76 * local99;
			local74[3] = -local78 * local99;
			local74[2] = local78 * local76 * local88;
			local74[7] = local99 * -local76;
			local74[0] = local88 * local76 * local76 + local83;
			local74[4] = local83;
			local5[0] = local2[2] * local74[6] + local2[0] * local74[0] + local2[1] * local74[3];
			local5[1] = local2[0] * local74[1] + local2[1] * local74[4] + local2[2] * local74[7];
			local5[3] = local74[6] * local2[5] + local2[3] * local74[0] + local2[4] * local74[3];
			local5[2] = local74[5] * local2[1] + local2[0] * local74[2] + local74[8] * local2[2];
			local5[4] = local2[3] * local74[1] + local2[4] * local74[4] + local74[7] * local2[5];
			local5[6] = local74[0] * local2[6] + local74[3] * local2[7] + local74[6] * local2[8];
			local5[5] = local2[3] * local74[2] + local74[5] * local2[4] + local74[8] * local2[5];
			local5[7] = local74[4] * local2[7] + local74[1] * local2[6] + local74[7] * local2[8];
			local5[8] = local2[8] * local74[8] + local2[7] * local74[5] + local74[2] * local2[6];
		}
		local5[1] *= arg0;
		local5[4] *= arg6;
		local5[3] *= arg6;
		local5[0] *= arg0;
		local5[8] *= arg3;
		local5[2] *= arg0;
		local5[5] *= arg6;
		local5[7] *= arg3;
		local5[6] *= arg3;
		return local5;
	}
}
