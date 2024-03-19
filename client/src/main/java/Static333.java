import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
	private static int anInt6917;

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "[I")
	public static int[] anIntArray559;

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
	private static int anInt6919;

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "[Lclient!wj;")
	public static Class216[] aClass216Array1;

	@OriginalMember(owner = "client!vl", name = "t", descriptor = "[Lclient!ci;")
	public static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!vl", name = "v", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!vl", name = "y", descriptor = "[I")
	public static int[] anIntArray560;

	@OriginalMember(owner = "client!vl", name = "A", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
	public static int anInt6922;

	@OriginalMember(owner = "client!vl", name = "C", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!vl", name = "E", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!vl", name = "J", descriptor = "[B")
	private static byte[] aByteArray88;

	@OriginalMember(owner = "client!vl", name = "K", descriptor = "[I")
	public static int[] anIntArray561;

	@OriginalMember(owner = "client!vl", name = "L", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!vl", name = "M", descriptor = "[Lclient!qs;")
	public static Class166[] aClass166Array1;

	@OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
	public static int anInt6925;

	@OriginalMember(owner = "client!vl", name = "O", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!vl", name = "T", descriptor = "[Lclient!ar;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!vl", name = "F", descriptor = "Z")
	private static boolean aBoolean499 = false;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)F")
	public static float method5881(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I")
	public static int method5883(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6919) {
			local8 = 8 - anInt6919;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray88[anInt6917] >> anInt6919 & local14) << local3;
			anInt6919 = 0;
			anInt6917++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray88[anInt6917] >> anInt6919 & local8) << local3;
			anInt6919 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "([BI)V")
	public static void method5885(@OriginalArg(0) byte[] arg0) {
		aByteArray88 = arg0;
		anInt6917 = 0;
		anInt6919 = 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!qj;II)Lclient!vl;")
	public static Class1_Sub41 method5886(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5888(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4636(arg2, arg1);
			return local16 == null ? null : new Class1_Sub41(local16);
		} else {
			arg0.method4626(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!qj;)Z")
	private static boolean method5888(@OriginalArg(0) Class162 arg0) {
		if (!aBoolean499) {
			@Pc(7) byte[] local7 = arg0.method4636(0, 0);
			if (local7 == null) {
				return false;
			}
			method5890(local7);
			aBoolean499 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "()I")
	public static int method5889() {
		@Pc(7) int local7 = aByteArray88[anInt6917] >> anInt6919 & 0x1;
		anInt6919++;
		anInt6917 += anInt6919 >> 3;
		anInt6919 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "([B)V")
	private static void method5890(@OriginalArg(0) byte[] arg0) {
		method5885(arg0);
		anInt6922 = 0x1 << method5883(4);
		anInt6925 = 0x1 << method5883(4);
		aFloatArray24 = new float[anInt6925];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6922 : anInt6925;
			local28 = local24 >> 1;
			local32 = local24 >> 2;
			local36 = local24 >> 3;
			@Pc(39) float[] local39 = new float[local28];
			for (local41 = 0; local41 < local32; local41++) {
				local39[local41 * 2] = (float) Math.cos((double) (local41 * 4) * 3.141592653589793D / (double) local24);
				local39[local41 * 2 + 1] = -((float) Math.sin((double) (local41 * 4) * 3.141592653589793D / (double) local24));
			}
			@Pc(84) float[] local84 = new float[local28];
			for (local86 = 0; local86 < local32; local86++) {
				local84[local86 * 2] = (float) Math.cos((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
				local84[local86 * 2 + 1] = (float) Math.sin((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
			}
			@Pc(136) float[] local136 = new float[local32];
			for (local138 = 0; local138 < local36; local138++) {
				local136[local138 * 2] = (float) Math.cos((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24);
				local136[local138 * 2 + 1] = -((float) Math.sin((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24));
			}
			@Pc(185) int[] local185 = new int[local36];
			local191 = Static134.method3035(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static230.method4384(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray23 = local39;
				aFloatArray28 = local84;
				aFloatArray26 = local136;
				anIntArray559 = local185;
			} else {
				aFloatArray27 = local39;
				aFloatArray29 = local84;
				aFloatArray22 = local136;
				anIntArray560 = local185;
			}
		}
		local24 = method5883(8) + 1;
		aClass34Array1 = new Class34[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass34Array1[local28] = new Class34();
		}
		local32 = method5883(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5883(16);
		}
		@Pc(269) int local269 = method5883(6) + 1;
		aClass216Array1 = new Class216[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass216Array1[local41] = new Class216();
		}
		@Pc(290) int local290 = method5883(6) + 1;
		aClass14Array1 = new Class14[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass14Array1[local86] = new Class14();
		}
		@Pc(311) int local311 = method5883(6) + 1;
		aClass166Array1 = new Class166[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass166Array1[local138] = new Class166();
		}
		@Pc(332) int local332 = method5883(6) + 1;
		aBooleanArray27 = new boolean[local332];
		anIntArray561 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray27[local191] = method5889() != 0;
			method5883(16);
			method5883(16);
			anIntArray561[local191] = method5883(8);
		}
	}
}
