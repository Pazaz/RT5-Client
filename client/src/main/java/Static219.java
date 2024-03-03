import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!mp", name = "r", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!mp", name = "x", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!mp", name = "J", descriptor = "[J")
	public static long[] aLongArray6;

	@OriginalMember(owner = "client!mp", name = "O", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!mp", name = "S", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!mp", name = "W", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!mp", name = "hb", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!mp", name = "sb", descriptor = "Z")
	public static boolean aBoolean251;

	@OriginalMember(owner = "client!mp", name = "tb", descriptor = "I")
	public static int anInt3845;

	@OriginalMember(owner = "client!mp", name = "Bb", descriptor = "I")
	public static int anInt3846;

	@OriginalMember(owner = "client!mp", name = "Db", descriptor = "I")
	public static int anInt3847;

	@OriginalMember(owner = "client!mp", name = "gb", descriptor = "Lclient!ji;")
	public static GlPacket aClass2_Sub4_Sub1_3 = new GlPacket(8192);

	@OriginalMember(owner = "client!mp", name = "ub", descriptor = "[I")
	public static final int[] anIntArray240 = new int[8];

	@OriginalMember(owner = "client!mp", name = "vb", descriptor = "[I")
	public static final int[] anIntArray241 = new int[8];

	@OriginalMember(owner = "client!mp", name = "wb", descriptor = "[I")
	public static int[] anIntArray242 = new int[1];

	@OriginalMember(owner = "client!mp", name = "yb", descriptor = "[I")
	public static int[] anIntArray243 = new int[1];

	@OriginalMember(owner = "client!mp", name = "Ab", descriptor = "[I")
	public static final int[] anIntArray244 = new int[8];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([BBI)[B")
	public static byte[] method3850(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		Static404.method4607(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZI)I")
	public static int method3851(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IFIIIIFF)[F")
	public static float[] method3853(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local2[0] = local13;
		local2[5] = 0.0F;
		local2[6] = -local21;
		local2[4] = 1.0F;
		local2[7] = 0.0F;
		local2[8] = local13;
		local2[2] = local21;
		local2[1] = 0.0F;
		local2[3] = 0.0F;
		@Pc(66) float[] local66 = new float[9];
		@Pc(68) float local68 = 1.0F;
		@Pc(70) float local70 = 0.0F;
		@Pc(75) float local75 = (float) arg0 / 32767.0F;
		@Pc(80) float local80 = 1.0F - local75;
		@Pc(91) float local91 = -((float) Math.sqrt((double) ((float) 1 - local75 * local75)));
		@Pc(103) float local103 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4));
		if (local103 == 0.0F && local75 == 0.0F) {
			local5 = local2;
		} else {
			if (local103 != 0.0F) {
				local68 = (float) -arg4 / local103;
				local70 = (float) arg3 / local103;
			}
			local66[6] = local80 * local68 * local70;
			local66[2] = local80 * local70 * local68;
			local66[7] = local91 * -local68;
			local66[0] = local68 * local68 * local80 + local75;
			local66[1] = local91 * local70;
			local66[3] = -local70 * local91;
			local66[4] = local75;
			local66[8] = local70 * local70 * local80 + local75;
			local66[5] = local91 * local68;
			local5[0] = local66[3] * local2[1] + local2[0] * local66[0] + local2[2] * local66[6];
			local5[1] = local66[7] * local2[2] + local66[1] * local2[0] + local66[4] * local2[1];
			local5[3] = local66[0] * local2[3] + local66[3] * local2[4] + local66[6] * local2[5];
			local5[2] = local2[0] * local66[2] + local66[5] * local2[1] + local66[8] * local2[2];
			local5[4] = local66[4] * local2[4] + local66[1] * local2[3] + local66[7] * local2[5];
			local5[6] = local66[6] * local2[8] + local2[7] * local66[3] + local66[0] * local2[6];
			local5[5] = local66[2] * local2[3] + local2[4] * local66[5] + local66[8] * local2[5];
			local5[7] = local66[4] * local2[7] + local2[6] * local66[1] + local66[7] * local2[8];
			local5[8] = local66[8] * local2[8] + local66[2] * local2[6] + local2[7] * local66[5];
		}
		local5[0] *= arg5;
		local5[7] *= arg6;
		local5[4] *= arg1;
		local5[3] *= arg1;
		local5[1] *= arg5;
		local5[8] *= arg6;
		local5[2] *= arg5;
		local5[6] *= arg6;
		local5[5] *= arg1;
		return local5;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[FI)[F")
	public static float[] method3860(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(8) float[] local8 = new float[arg0];
		Static404.method4604(arg1, 0, local8, 0, arg0);
		return local8;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II[S)[S")
	public static short[] method3862(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(2) short[] local2 = new short[arg0];
		Static404.method4606(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIBIIIFI[FI)V")
	public static void method3864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg3 - arg8;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(11) int local11 = arg6 - arg1;
		@Pc(32) float local32 = arg7[1] * (float) local7 + (float) local11 * arg7[0] + (float) local3 * arg7[2];
		@Pc(53) float local53 = (float) local3 * arg7[5] + arg7[3] * (float) local11 + arg7[4] * (float) local7;
		@Pc(74) float local74 = (float) local3 * arg7[8] + (float) local7 * arg7[7] + arg7[6] * (float) local11;
		@Pc(89) float local89 = (float) Math.sqrt((double) (local74 * local74 + local32 * local32 + local53 * local53));
		@Pc(104) float local104 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(117) float local117 = (float) Math.asin((double) (local53 / local89)) / 3.1415927F + arg5 + 0.5F;
		@Pc(124) float local124;
		if (arg4 == 1) {
			local124 = local104;
			local104 = -local117;
			local117 = local124;
		} else if (arg4 == 2) {
			local117 = -local117;
			local104 = -local104;
		} else if (arg4 == 3) {
			local124 = local104;
			local104 = local117;
			local117 = -local124;
		}
		aFloat47 = local117;
		aFloat49 = local104;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([FFIFIFBIIIIII)V")
	public static void method3865(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = arg8 - arg2;
		@Pc(7) int local7 = arg7 - arg9;
		@Pc(11) int local11 = arg10 - arg6;
		@Pc(32) float local32 = arg0[1] * (float) local7 + arg0[0] * (float) local3 + arg0[2] * (float) local11;
		@Pc(53) float local53 = (float) local3 * arg0[3] + (float) local7 * arg0[4] + arg0[5] * (float) local11;
		@Pc(78) float local78 = arg0[8] * (float) local11 + (float) local7 * arg0[7] + arg0[6] * (float) local3;
		@Pc(86) float local86;
		@Pc(93) float local93;
		if (arg4 == 0) {
			local86 = arg5 + local32 + 0.5F;
			local93 = arg3 + 0.5F - local78;
		} else if (arg4 == 1) {
			local86 = arg5 + local32 + 0.5F;
			local93 = local78 + arg3 + 0.5F;
		} else if (arg4 == 2) {
			local93 = arg1 + 0.5F - local53;
			local86 = arg5 + 0.5F - local32;
		} else if (arg4 == 3) {
			local93 = arg1 + 0.5F - local53;
			local86 = arg5 + local32 + 0.5F;
		} else if (arg4 == 4) {
			local86 = local78 + arg3 + 0.5F;
			local93 = arg1 + 0.5F - local53;
		} else {
			local86 = arg3 + 0.5F - local78;
			local93 = arg1 + 0.5F - local53;
		}
		@Pc(191) float local191;
		if (arg11 == 1) {
			local191 = local86;
			local86 = -local93;
			local93 = local191;
		} else if (arg11 == 2) {
			local93 = -local93;
			local86 = -local86;
		} else if (arg11 == 3) {
			local191 = local86;
			local86 = local93;
			local93 = -local191;
		}
		aFloat48 = local86;
		aFloat46 = local93;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(FFFI)I")
	public static int method3867(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(23) float local23 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(32) float local32 = arg0 < 0.0F ? -arg0 : arg0;
		if (local8 < local23 && local32 < local23) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local32 > local8 && local23 < local32) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IF[FIIIFIIII)V")
	public static void method3869(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg0 - arg9;
		@Pc(7) int local7 = arg8 - arg5;
		@Pc(11) int local11 = arg7 - arg4;
		@Pc(32) float local32 = (float) local7 * arg2[2] + arg2[0] * (float) local11 + arg2[1] * (float) local3;
		@Pc(53) float local53 = arg2[5] * (float) local7 + arg2[4] * (float) local3 + arg2[3] * (float) local11;
		@Pc(74) float local74 = arg2[7] * (float) local3 + (float) local11 * arg2[6] + (float) local7 * arg2[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local85 *= arg6;
		}
		@Pc(99) float local99 = local53 + arg1 + 0.5F;
		@Pc(104) float local104;
		if (arg3 == 1) {
			local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg3 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg3 == 3) {
			local104 = local85;
			local85 = local99;
			local99 = -local104;
		}
		aFloat45 = local85;
		aFloat50 = local99;
	}
}
