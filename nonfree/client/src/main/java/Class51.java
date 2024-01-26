import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hka")
public abstract class Class51 implements Interface17 {

	@OriginalMember(owner = "client!hka", name = "g", descriptor = "Lclient!nga;")
	private Class259 aClass259_15 = Static60.aClass259_3;

	@OriginalMember(owner = "client!hka", name = "e", descriptor = "Lclient!eba;")
	protected final Class92 aClass92_14;

	@OriginalMember(owner = "client!hka", name = "d", descriptor = "I")
	protected final int anInt9848;

	@OriginalMember(owner = "client!hka", name = "u", descriptor = "Lclient!wda;")
	protected final Class397 aClass397_11;

	@OriginalMember(owner = "client!hka", name = "m", descriptor = "Lclient!tca;")
	protected final Class19_Sub1_Sub2 aClass19_Sub1_Sub2_12;

	@OriginalMember(owner = "client!hka", name = "c", descriptor = "I")
	private final int anInt9857;

	@OriginalMember(owner = "client!hka", name = "w", descriptor = "Z")
	private final boolean aBoolean754;

	@OriginalMember(owner = "client!hka", name = "k", descriptor = "I")
	private int anInt9855;

	@OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(Lclient!tca;ILclient!eba;Lclient!wda;IZ)V")
	protected Class51(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass92_14 = arg2;
		this.anInt9848 = arg1;
		this.aClass397_11 = arg3;
		this.aClass19_Sub1_Sub2_12 = arg0;
		this.anInt9857 = arg4;
		this.aBoolean754 = arg5;
		OpenGL.glGenTextures(1, Static374.anIntArray457, 0);
		this.anInt9855 = Static374.anIntArray457[0];
		this.method8634();
		this.method8637();
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Z)V")
	@Override
	public final void method9043() {
		@Pc(8) int local8 = this.aClass19_Sub1_Sub2_12.method8026();
		@Pc(21) int local21 = this.aClass19_Sub1_Sub2_12.anIntArray712[local8];
		if (this.anInt9848 != local21) {
			if (local21 != 0) {
				OpenGL.glBindTexture(local21, 0);
				OpenGL.glDisable(local21);
			}
			OpenGL.glEnable(this.anInt9848);
			this.aClass19_Sub1_Sub2_12.anIntArray712[local8] = this.anInt9848;
		}
		OpenGL.glBindTexture(this.anInt9848, this.anInt9855);
	}

	@OriginalMember(owner = "client!hka", name = "g", descriptor = "(I)I")
	protected final int method8631() {
		if (Static702.aClass397_16 == this.aClass397_11) {
			if (this.aClass92_14 == Static685.aClass92_16) {
				return 6407;
			}
			if (this.aClass92_14 == Static172.aClass92_8) {
				return 6408;
			}
			if (this.aClass92_14 == Static679.aClass92_15) {
				return 6406;
			}
			if (Static661.aClass92_10 == this.aClass92_14) {
				return 6409;
			}
			if (Static482.aClass92_13 == this.aClass92_14) {
				return 6410;
			}
			if (Static42.aClass92_3 == this.aClass92_14) {
				return 6145;
			}
		} else if (Static702.aClass397_19 == this.aClass397_11) {
			if (Static685.aClass92_16 == this.aClass92_14) {
				return 34843;
			}
			if (this.aClass92_14 == Static172.aClass92_8) {
				return 34842;
			}
			if (Static679.aClass92_15 == this.aClass92_14) {
				return 34844;
			}
			if (Static661.aClass92_10 == this.aClass92_14) {
				return 34846;
			}
			if (this.aClass92_14 == Static482.aClass92_13) {
				return 34847;
			}
			if (Static42.aClass92_3 == this.aClass92_14) {
				return 6145;
			}
		} else if (Static702.aClass397_20 == this.aClass397_11) {
			if (this.aClass92_14 == Static685.aClass92_16) {
				return 34837;
			}
			if (this.aClass92_14 == Static172.aClass92_8) {
				return 34836;
			}
			if (this.aClass92_14 == Static679.aClass92_15) {
				return 34838;
			}
			if (this.aClass92_14 == Static661.aClass92_10) {
				return 34840;
			}
			if (this.aClass92_14 == Static482.aClass92_13) {
				return 34841;
			}
			if (Static42.aClass92_3 == this.aClass92_14) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hka", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8640();
		super.finalize();
	}

	@OriginalMember(owner = "client!hka", name = "e", descriptor = "(I)I")
	private int method8633() {
		@Pc(20) int local20 = this.anInt9857 * this.aClass397_11.anInt10568 * this.aClass92_14.anInt2416;
		return this.aBoolean754 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!hka", name = "c", descriptor = "(I)V")
	private void method8634() {
		this.aClass19_Sub1_Sub2_12.method8088(this);
		if (Static60.aClass259_3 == this.aClass259_15) {
			OpenGL.glTexParameteri(this.anInt9848, OpenGL.GL_TEXTURE_MIN_FILTER, this.aBoolean754 ? OpenGL.GL_LINEAR_MIPMAP_LINEAR : OpenGL.GL_LINEAR);
			OpenGL.glTexParameteri(this.anInt9848, OpenGL.GL_TEXTURE_MAG_FILTER, OpenGL.GL_LINEAR);
		} else {
			OpenGL.glTexParameteri(this.anInt9848, OpenGL.GL_TEXTURE_MIN_FILTER, this.aBoolean754 ? OpenGL.GL_NEAREST_MIPMAP_NEAREST : OpenGL.GL_NEAREST);
			OpenGL.glTexParameteri(this.anInt9848, OpenGL.GL_TEXTURE_MAG_FILTER, OpenGL.GL_NEAREST);
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(BLclient!nga;)V")
	@Override
	public final void method9041(@OriginalArg(1) Class259 arg0) {
		if (this.aClass259_15 != arg0) {
			this.aClass259_15 = arg0;
			this.method8634();
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(I[IIII)V")
	protected final void method8636(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static700.method9150(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static700.method9150(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass92_14 == Static172.aClass92_8) {
			@Pc(45) int local45 = 0;
			@Pc(53) int local53 = arg3 < arg2 ? arg3 : arg2;
			@Pc(57) int local57 = arg3 >> 1;
			@Pc(61) int local61 = arg2 >> 1;
			@Pc(71) int[] local71 = arg1;
			@Pc(76) int[] local76 = new int[local61 * local57];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local45, this.method8631(), arg3, arg2, 0, OpenGL.GL_BGRA, this.aClass19_Sub1_Sub2_12.anInt9277, local71, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(96) int local96 = 0;
				@Pc(98) int local98 = 0;
				@Pc(102) int local102 = arg3;
				@Pc(104) int[] local104 = local76;
				for (@Pc(106) int local106 = 0; local106 < local61; local106++) {
					for (@Pc(112) int local112 = 0; local112 < local57; local112++) {
						@Pc(121) int local121 = local71[local98++];
						@Pc(126) int local126 = local71[local98++];
						@Pc(131) int local131 = local71[local102++];
						@Pc(137) int local137 = local121 >> 8 & 0xFF;
						@Pc(143) int local143 = local121 >> 24 & 0xFF;
						@Pc(149) int local149 = local121 >> 16 & 0xFF;
						@Pc(154) int local154 = local71[local102++];
						@Pc(158) int local158 = local121 & 0xFF;
						@Pc(166) int local166 = local143 + (local126 >> 24 & 0xFF);
						@Pc(174) int local174 = local149 + (local126 >> 16 & 0xFF);
						@Pc(180) int local180 = local158 + (local126 & 0xFF);
						@Pc(188) int local188 = local137 + (local126 >> 8 & 0xFF);
						@Pc(196) int local196 = local188 + (local131 >> 8 & 0xFF);
						@Pc(204) int local204 = local166 + (local131 >> 24 & 0xFF);
						@Pc(212) int local212 = local174 + (local131 >> 16 & 0xFF);
						@Pc(218) int local218 = local180 + (local131 & 0xFF);
						@Pc(226) int local226 = local212 + (local154 >> 16 & 0xFF);
						@Pc(234) int local234 = local204 + (local154 >> 24 & 0xFF);
						@Pc(240) int local240 = local218 + (local154 & 0xFF);
						@Pc(248) int local248 = local196 + (local154 >> 8 & 0xFF);
						local76[local96++] = (local226 & 0x3FC) << 14 | local234 << 22 & 0xFF000000 | (local248 & 0x3FC) << 6 | local240 >> 2 & 0xFF;
					}
					local98 += arg3;
					local102 += arg3;
				}
				local76 = local71;
				arg2 = local61;
				local71 = local104;
				arg3 = local57;
				local57 >>= 0x1;
				local53 >>= 0x1;
				local61 >>= 0x1;
				local45++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(II)V")
	private void method8637() {
		this.aClass19_Sub1_Sub2_12.anInt9145 += this.method8633();
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(III[BI)V")
	protected final void method8638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static700.method9150(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static700.method9150(arg0)) {
			@Pc(40) int local40 = this.aClass92_14.anInt2416;
			@Pc(49) int local49 = 0;
			@Pc(61) int local61 = arg3 >= arg0 ? arg0 : arg3;
			@Pc(65) int local65 = arg3 >> 1;
			@Pc(69) int local69 = arg0 >> 1;
			@Pc(71) byte[] local71 = arg2;
			@Pc(78) byte[] local78 = new byte[local69 * local65 * local40];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local49, this.method8631(), arg3, arg0, 0, Static468.method7644(this.aClass92_14), OpenGL.GL_UNSIGNED_BYTE, local71, 0);
				if (local61 <= 1) {
					return;
				}
				@Pc(105) int local105 = arg3 * local40;
				@Pc(107) byte[] local107 = local78;
				for (@Pc(109) int local109 = 0; local109 < local40; local109++) {
					@Pc(115) int local115 = local109;
					@Pc(117) int local117 = local109;
					@Pc(121) int local121 = local105 + local109;
					for (@Pc(123) int local123 = 0; local123 < local69; local123++) {
						for (@Pc(127) int local127 = 0; local127 < local65; local127++) {
							@Pc(135) byte local135 = local71[local117];
							local117 += local40;
							@Pc(145) int local145 = local135 + local71[local117];
							@Pc(151) int local151 = local145 + local71[local121];
							local117 += local40;
							local121 += local40;
							@Pc(165) int local165 = local151 + local71[local121];
							local78[local115] = (byte) (local165 >> 2);
							local121 += local40;
							local115 += local40;
						}
						local117 += local105;
						local121 += local105;
					}
				}
				local78 = local71;
				arg3 = local65;
				arg0 = local69;
				local71 = local107;
				local69 >>= 0x1;
				local61 >>= 0x1;
				local49++;
				local65 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "([FIIZI)V")
	protected final void method8639(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static700.method9150(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static700.method9150(arg2)) {
			@Pc(40) int local40 = this.aClass92_14.anInt2416;
			@Pc(42) int local42 = 0;
			@Pc(50) int local50 = arg2 <= arg1 ? arg2 : arg1;
			@Pc(54) int local54 = arg1 >> 1;
			@Pc(58) int local58 = arg2 >> 1;
			@Pc(60) float[] local60 = arg0;
			@Pc(72) float[] local72 = new float[local58 * local54 * local40];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local42, this.method8631(), arg1, arg2, 0, Static468.method7644(this.aClass92_14), OpenGL.GL_FLOAT, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(95) int local95 = arg1 * local40;
				for (@Pc(97) int local97 = 0; local97 < local40; local97++) {
					@Pc(103) int local103 = local97;
					@Pc(105) int local105 = local97;
					@Pc(109) int local109 = local95 + local97;
					for (@Pc(111) int local111 = 0; local111 < local58; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local54; local115++) {
							@Pc(121) float local121 = local60[local105];
							local105 += local40;
							@Pc(131) float local131 = local121 + local60[local105];
							@Pc(137) float local137 = local131 + local60[local109];
							local105 += local40;
							local109 += local40;
							@Pc(151) float local151 = local137 + local60[local109];
							local109 += local40;
							local72[local103] = local151 * 0.25F;
							local103 += local40;
						}
						local109 += local95;
						local105 += local95;
					}
				}
				@Pc(197) float[] local197 = local72;
				local72 = local60;
				arg1 = local54;
				local60 = local197;
				arg2 = local58;
				local50 >>= 0x1;
				local54 >>= 0x1;
				local58 >>= 0x1;
				local42++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hka", name = "d", descriptor = "(I)V")
	private void method8640() {
		if (this.anInt9855 > 0) {
			this.aClass19_Sub1_Sub2_12.method8160(this.method8633(), this.anInt9855);
			this.anInt9855 = 0;
		}
	}
}
