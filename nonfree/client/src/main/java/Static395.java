import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!mha", name = "l", descriptor = "[Lclient!eo;")
	public static Class8_Sub2[] aClass8_Sub2Array11;

	@OriginalMember(owner = "client!mha", name = "j", descriptor = "[I")
	public static final int[] anIntArray833 = new int[32];

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "(I)V")
	public static void method9162() {
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub19_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub19_2);
		Static400.aClass2_Sub34_28.method5104(2, Static400.aClass2_Sub34_28.aClass57_Sub4_1);
		Static400.aClass2_Sub34_28.method5104(2, Static400.aClass2_Sub34_28.aClass57_Sub4_2);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub6_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub23_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub27_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub8_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub7_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub30_1);
		Static400.aClass2_Sub34_28.method5104(2, Static400.aClass2_Sub34_28.aClass57_Sub12_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub24_1);
		Static400.aClass2_Sub34_28.method5104(2, Static400.aClass2_Sub34_28.aClass57_Sub26_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub16_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub13_2);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub13_1);
		Static400.aClass2_Sub34_28.method5104(2, Static400.aClass2_Sub34_28.aClass57_Sub28_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub5_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub20_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub2_1);
		Static376.method5313();
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub18_1);
		Static400.aClass2_Sub34_28.method5104(4, Static400.aClass2_Sub34_28.aClass57_Sub15_1);
		Static296.method4362();
		Static218.method3187();
		Static284.aBoolean355 = true;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(FFFIIIII)[F")
	public static float[] method9163(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local6[5] = 0.0F;
		local6[2] = local25;
		local6[6] = -local25;
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		local6[8] = local17;
		local6[4] = 1.0F;
		local6[0] = local17;
		local6[1] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg6 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(94) float local94 = 1.0F - local77;
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg4 * arg4 + arg3 * arg3));
		if (local105 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local72 = (float) -arg4 / local105;
				local79 = (float) arg3 / local105;
			}
			local70[6] = local94 * local72 * local79;
			local70[3] = local89 * -local79;
			local70[8] = local77 + local94 * local79 * local79;
			local70[4] = local77;
			local70[0] = local77 + local72 * local72 * local94;
			local70[2] = local94 * local72 * local79;
			local70[7] = local89 * -local72;
			local70[1] = local79 * local89;
			local70[5] = local89 * local72;
			local9[0] = local6[1] * local70[3] + local6[0] * local70[0] + local70[6] * local6[2];
			local9[1] = local6[0] * local70[1] + local70[4] * local6[1] + local70[7] * local6[2];
			local9[2] = local70[2] * local6[0] + local70[5] * local6[1] + local70[8] * local6[2];
			local9[3] = local70[3] * local6[4] + local6[3] * local70[0] + local70[6] * local6[5];
			local9[4] = local70[1] * local6[3] + local6[4] * local70[4] + local6[5] * local70[7];
			local9[5] = local6[5] * local70[8] + local70[5] * local6[4] + local6[3] * local70[2];
			local9[6] = local6[7] * local70[3] + local70[0] * local6[6] + local6[8] * local70[6];
			local9[7] = local6[6] * local70[1] + local70[4] * local6[7] + local6[8] * local70[7];
			local9[8] = local6[8] * local70[8] + local70[2] * local6[6] + local70[5] * local6[7];
		}
		local9[1] *= arg0;
		local9[4] *= arg1;
		local9[5] *= arg1;
		local9[2] *= arg0;
		local9[3] *= arg1;
		local9[7] *= arg2;
		local9[0] *= arg0;
		local9[8] *= arg2;
		local9[6] *= arg2;
		return local9;
	}
}
