import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "[I")
	public static final int[] anIntArray478 = new int[1];

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!jaggl/opengl;IIIII[F)V")
	public static void method6153(@OriginalArg(0) opengl arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6) {
		if (arg3 > 0 && !Static246.method4251(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static246.method4251(arg4)) {
			@Pc(24) int local24 = method6163(6408);
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = arg3 < arg4 ? arg3 : arg4;
			@Pc(37) int local37 = arg3 >> 1;
			@Pc(41) int local41 = arg4 >> 1;
			@Pc(43) float[] local43 = arg6;
			@Pc(50) float[] local50 = new float[local37 * local41 * local24];
			while (true) {
				arg0.glTexImage2D(GL.GL_TEXTURE_2D, local26, GL.GL_RGBA16F, arg3, arg4, 0, GL.GL_RGBA, GL.GL_FLOAT, FloatBuffer.wrap(local43));
				if (local33 <= 1) {
					return;
				}
				@Pc(69) int local69 = arg3 * local24;
				for (@Pc(71) int local71 = 0; local71 < local24; local71++) {
					@Pc(76) int local76 = local71;
					@Pc(78) int local78 = local71;
					@Pc(82) int local82 = local71 + local69;
					for (@Pc(84) int local84 = 0; local84 < local41; local84++) {
						for (@Pc(89) int local89 = 0; local89 < local37; local89++) {
							@Pc(96) float local96 = local43[local78];
							local78 += local24;
							@Pc(106) float local106 = local96 + local43[local78];
							local78 += local24;
							@Pc(116) float local116 = local106 + local43[local82];
							local82 += local24;
							@Pc(126) float local126 = local116 + local43[local82];
							local82 += local24;
							local50[local76] = local126 * 0.25F;
							local76 += local24;
						}
						local78 += local69;
						local82 += local69;
					}
				}
				@Pc(156) float[] local156 = local50;
				local50 = local43;
				local43 = local156;
				arg3 = local37;
				arg4 = local41;
				local37 >>= 0x1;
				local41 >>= 0x1;
				local33 >>= 0x1;
				local26++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)I")
	public static int method6155(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!jaggl/opengl;IIIII[B)V")
	public static void method6157(@OriginalArg(0) opengl arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		if (arg3 > 0 && !Static246.method4251(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static246.method4251(arg4)) {
			@Pc(24) int local24 = method6163(arg5);
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = arg3 < arg4 ? arg3 : arg4;
			@Pc(37) int local37 = arg3 >> 1;
			@Pc(41) int local41 = arg4 >> 1;
			@Pc(43) byte[] local43 = arg6;
			@Pc(50) byte[] local50 = new byte[local37 * local41 * local24];
			while (true) {
				arg0.glTexImage2D(arg1, local26, arg2, arg3, arg4, 0, arg5, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local43));
				if (local33 <= 1) {
					return;
				}
				@Pc(69) int local69 = arg3 * local24;
				for (@Pc(71) int local71 = 0; local71 < local24; local71++) {
					@Pc(76) int local76 = local71;
					@Pc(78) int local78 = local71;
					@Pc(82) int local82 = local71 + local69;
					for (@Pc(84) int local84 = 0; local84 < local41; local84++) {
						for (@Pc(89) int local89 = 0; local89 < local37; local89++) {
							@Pc(96) byte local96 = local43[local78];
							local78 += local24;
							@Pc(106) int local106 = local96 + local43[local78];
							local78 += local24;
							@Pc(116) int local116 = local106 + local43[local82];
							local82 += local24;
							@Pc(126) int local126 = local116 + local43[local82];
							local82 += local24;
							local50[local76] = (byte) (local126 >> 2);
							local76 += local24;
						}
						local78 += local69;
						local82 += local69;
					}
				}
				@Pc(157) byte[] local157 = local50;
				local50 = local43;
				local43 = local157;
				arg3 = local37;
				arg4 = local41;
				local37 >>= 0x1;
				local41 >>= 0x1;
				local33 >>= 0x1;
				local26++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)I")
	public static int method6163(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!jaggl/opengl;IIIIII[I)V")
	public static void method6164(@OriginalArg(0) opengl arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		if (arg3 > 0 && !Static246.method4251(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static246.method4251(arg4)) {
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = arg3 < arg4 ? arg3 : arg4;
			@Pc(42) int local42 = arg3 >> 1;
			@Pc(46) int local46 = arg4 >> 1;
			@Pc(48) int[] local48 = arg6;
			@Pc(53) int[] local53 = new int[local42 * local46];
			while (true) {
				arg0.glTexImage2D(arg1, local31, arg2, arg3, arg4, 0, GL.GL_BGRA, arg5, IntBuffer.wrap(local48));
				if (local38 <= 1) {
					return;
				}
				@Pc(70) int local70 = 0;
				@Pc(72) int local72 = 0;
				@Pc(76) int local76 = arg3;
				for (@Pc(78) int local78 = 0; local78 < local46; local78++) {
					for (@Pc(83) int local83 = 0; local83 < local42; local83++) {
						@Pc(91) int local91 = local48[local72++];
						@Pc(96) int local96 = local48[local72++];
						@Pc(101) int local101 = local48[local76++];
						@Pc(106) int local106 = local48[local76++];
						@Pc(112) int local112 = local91 >> 24 & 0xFF;
						@Pc(118) int local118 = local91 >> 16 & 0xFF;
						@Pc(124) int local124 = local91 >> 8 & 0xFF;
						@Pc(128) int local128 = local91 & 0xFF;
						@Pc(136) int local136 = local112 + (local96 >> 24 & 0xFF);
						@Pc(144) int local144 = local118 + (local96 >> 16 & 0xFF);
						@Pc(152) int local152 = local124 + (local96 >> 8 & 0xFF);
						@Pc(158) int local158 = local128 + (local96 & 0xFF);
						@Pc(166) int local166 = local136 + (local101 >> 24 & 0xFF);
						@Pc(174) int local174 = local144 + (local101 >> 16 & 0xFF);
						@Pc(182) int local182 = local152 + (local101 >> 8 & 0xFF);
						@Pc(188) int local188 = local158 + (local101 & 0xFF);
						@Pc(196) int local196 = local166 + (local106 >> 24 & 0xFF);
						@Pc(204) int local204 = local174 + (local106 >> 16 & 0xFF);
						@Pc(212) int local212 = local182 + (local106 >> 8 & 0xFF);
						@Pc(218) int local218 = local188 + (local106 & 0xFF);
						local53[local70++] = (local196 & 0x3FC) << 22 | (local204 & 0x3FC) << 14 | (local212 & 0x3FC) << 6 | local218 >> 2 & 0xFF;
					}
					local72 += arg3;
					local76 += arg3;
				}
				@Pc(259) int[] local259 = local53;
				local53 = local48;
				local48 = local259;
				arg3 = local42;
				arg4 = local46;
				local42 >>= 0x1;
				local46 >>= 0x1;
				local38 >>= 0x1;
				local31++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
