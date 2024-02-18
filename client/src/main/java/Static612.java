import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Lclient!sia;")
	public static final Class339 aClass339_67 = new Class339();

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)I")
	public static int method8237(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZII[FI)V")
	public static void method8238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static700.method9150(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static700.method9150(arg1)) {
			@Pc(41) int local41 = Static646.method8458(6408);
			@Pc(43) int local43 = 0;
			@Pc(51) int local51 = arg2 < arg1 ? arg2 : arg1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(59) int local59 = arg1 >> 1;
			@Pc(61) float[] local61 = arg4;
			@Pc(73) float[] local73 = new float[local41 * local59 * local55];
			while (true) {
				OpenGL.glTexImage2Df(OpenGL.GL_TEXTURE_2D, local43, OpenGL.GL_RGBA16F, arg2, arg1, 0, OpenGL.GL_RGBA, OpenGL.GL_FLOAT, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(95) int local95 = arg2 * local41;
				for (@Pc(97) int local97 = 0; local97 < local41; local97++) {
					@Pc(100) int local100 = local97;
					@Pc(102) int local102 = local97;
					@Pc(106) int local106 = local97 + local95;
					for (@Pc(108) int local108 = 0; local108 < local59; local108++) {
						for (@Pc(111) int local111 = 0; local111 < local55; local111++) {
							@Pc(116) float local116 = local61[local102];
							local102 += local41;
							@Pc(126) float local126 = local116 + local61[local102];
							local102 += local41;
							@Pc(136) float local136 = local126 + local61[local106];
							local106 += local41;
							@Pc(146) float local146 = local136 + local61[local106];
							local106 += local41;
							local73[local100] = local146 * 0.25F;
							local100 += local41;
						}
						local102 += local95;
						local106 += local95;
					}
				}
				@Pc(184) float[] local184 = local73;
				local73 = local61;
				arg2 = local55;
				local61 = local184;
				arg1 = local59;
				local51 >>= 0x1;
				local43++;
				local59 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
