import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
	public static int anInt5756;

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
	public static final int anInt5755 = 1337;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
	public static void method5241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Scene.anIntArrayArray16 != null) {
			Scene.anIntArrayArray16[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Scene.aByteArrayArray4 != null) {
			Scene.aByteArrayArray4[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Scene.aByteArrayArray17 != null) {
			Scene.aByteArrayArray17[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([JII[Ljava/lang/Object;I)V")
	public static void method5245(@OriginalArg(0) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg3) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) long local25 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local25;
		@Pc(39) Object local39 = arg2[local19];
		arg2[local19] = arg2[arg1];
		arg2[arg1] = local39;
		for (@Pc(51) int local51 = arg3; local51 < arg1; local51++) {
			if (arg0[local51] < local25 + (long) (local51 & 0x1)) {
				@Pc(73) long local73 = arg0[local51];
				arg0[local51] = arg0[local21];
				arg0[local21] = local73;
				@Pc(87) Object local87 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21++] = local87;
			}
		}
		arg0[arg1] = arg0[local21];
		arg0[local21] = local25;
		arg2[arg1] = arg2[local21];
		arg2[local21] = local39;
		method5245(arg0, local21 - 1, arg2, arg3);
		method5245(arg0, arg1, arg2, local21 + 1);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static222.method3916(arg3)) {
			if (Static113.aClass161ArrayArray2[arg3] == null) {
				Static201.method3653(arg1, -1, Static26.aClass161ArrayArray1[arg3], arg0, arg5, arg6, arg2, arg4, arg7);
			} else {
				Static201.method3653(arg1, -1, Static113.aClass161ArrayArray2[arg3], arg0, arg5, arg6, arg2, arg4, arg7);
			}
		} else if (arg4 == -1) {
			for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
				Static357.aBooleanArray59[local23] = true;
			}
		} else {
			Static357.aBooleanArray59[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)V")
	public static void method5249() {
		if (Camera.anInt2717 == -1 || Camera.anInt6455 == -1) {
			return;
		}
		@Pc(29) int local29 = Camera.anInt1038 + (Camera.anInt6533 * (Camera.anInt3821 - Camera.anInt1038) >> 16);
		Camera.anInt6533 += local29;
		if (Camera.anInt6533 < 65535) {
			Static232.aBoolean268 = false;
			Static183.aBoolean9 = false;
		} else {
			Camera.anInt6533 = 65535;
			if (Static232.aBoolean268) {
				Static183.aBoolean9 = false;
			} else {
				Static183.aBoolean9 = true;
			}
			Static232.aBoolean268 = true;
		}
		@Pc(59) float local59 = (float) Camera.anInt6533 / 65535.0F;
		@Pc(62) float[] local62 = new float[3];
		@Pc(66) int local66 = Camera.anInt5567 * 2;
		@Pc(92) int local92;
		@Pc(124) int local124;
		@Pc(132) int local132;
		@Pc(137) int local137;
		@Pc(146) int local146;
		@Pc(164) int local164;
		for (@Pc(68) int local68 = 0; local68 < 3; local68++) {
			@Pc(80) int local80 = Camera.splines[Camera.anInt2717][local66][local68] * 3;
			local92 = Camera.splines[Camera.anInt2717][local66 + 1][local68] * 3;
			local124 = (Camera.splines[Camera.anInt2717][local66 + 2][local68] + Camera.splines[Camera.anInt2717][local66 + 2][local68] - Camera.splines[Camera.anInt2717][local66 + 3][local68]) * 3;
			local132 = Camera.splines[Camera.anInt2717][local66][local68];
			local137 = local92 - local80;
			local146 = local80 + local124 - local92 * 2;
			local164 = local92 + Camera.splines[Camera.anInt2717][local66 + 2][local68] - local124 - local132;
			local62[local68] = local59 * ((float) local137 + ((float) local146 + (float) local164 * local59) * local59) + (float) local132;
		}
		Static102.anInt3592 = (int) local62[1] * -1;
		Static136.anInt6778 = (int) local62[0] - Camera.originX * 128;
		Static211.anInt3777 = (int) local62[2] - Camera.originZ * 128;
		@Pc(218) float[] local218 = new float[3];
		local92 = Camera.anInt6398 * 2;
		for (local124 = 0; local124 < 3; local124++) {
			local132 = Camera.splines[Camera.anInt6455][local92][local124] * 3;
			local137 = Camera.splines[Camera.anInt6455][local92 + 1][local124] * 3;
			local146 = (Camera.splines[Camera.anInt6455][local92 + 2][local124] + Camera.splines[Camera.anInt6455][local92 + 2][local124] - Camera.splines[Camera.anInt6455][local92 + 3][local124]) * 3;
			local164 = Camera.splines[Camera.anInt6455][local92][local124];
			@Pc(294) int local294 = local137 - local132;
			@Pc(303) int local303 = local146 + local132 - local137 * 2;
			@Pc(321) int local321 = local137 + Camera.splines[Camera.anInt6455][local92 + 2][local124] - local164 - local146;
			local218[local124] = local59 * ((float) local294 + local59 * ((float) local303 + local59 * (float) local321)) + (float) local164;
		}
		@Pc(354) float local354 = local218[0] - local62[0];
		@Pc(365) float local365 = (local218[1] - local62[1]) * -1.0F;
		@Pc(374) float local374 = local218[2] - local62[2];
		@Pc(384) double local384 = Math.sqrt((double) (local354 * local354 + local374 * local374));
		Static265.anInt4857 = (int) (Math.atan2((double) local365, local384) * 2607.5945876176133D) & 0x3FFF;
		Static4.anInt87 = (int) (-Math.atan2((double) local354, (double) local374) * 2607.5945876176133D) & 0x3FFF;
		Static342.anInt5657 = ((Camera.splines[Camera.anInt2717][local66 + 2][3] - Camera.splines[Camera.anInt2717][local66][3]) * Camera.anInt6533 >> 16) + Camera.splines[Camera.anInt2717][local66][3];
	}
}
