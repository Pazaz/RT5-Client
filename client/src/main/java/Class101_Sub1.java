import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class101_Sub1 extends Class101 {

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "Lclient!bea;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "Z")
	private boolean aBoolean212;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "[Lclient!ec;")
	private Class93_Sub1[] aClass93_Sub1Array1;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class101_Sub1(@OriginalArg(0) Class19_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean598) {
			this.aBoolean212 = arg0.anInt8003 < 3;
			@Pc(26) int local26 = this.aBoolean212 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(55) float local55 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(64) float local64 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(79) float local79 = (float) (1.0D / Math.sqrt((double) (local64 * local64 + local55 * local55 + 1.0F)));
					@Pc(83) float local83 = local55 * local79;
					@Pc(87) float local87 = local64 * local79;
					for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
						@Pc(115) float local115;
						if (local89 == 0) {
							local115 = -local87;
						} else if (local89 == 1) {
							local115 = local87;
						} else if (local89 == 2) {
							local115 = local83;
						} else if (local89 == 3) {
							local115 = -local83;
						} else if (local89 == 4) {
							local115 = local79;
						} else {
							local115 = -local79;
						}
						@Pc(145) int local145;
						@Pc(144) int local144;
						@Pc(142) int local142;
						if (local115 > 0.0F) {
							local145 = (int) (Math.pow((double) local115, 96.0D) * (double) local26);
							local144 = (int) ((double) local26 * Math.pow((double) local115, 36.0D));
							local142 = (int) ((double) local26 * Math.pow((double) local115, 12.0D));
						} else {
							local142 = 0;
							local144 = 0;
							local145 = 0;
						}
						local34[local89][local40] = (byte) local145;
						local38[local89][local40] = (byte) local144;
						local30[local89][local40] = (byte) local142;
					}
					local40++;
				}
			}
			this.aClass93_Sub1Array1 = new Class93_Sub1[3];
			this.aClass93_Sub1Array1[0] = new Class93_Sub1(super.aClass19_Sub3_42, 6406, 64, false, local34, 6406);
			this.aClass93_Sub1Array1[1] = new Class93_Sub1(super.aClass19_Sub3_42, 6406, 64, false, local38, 6406);
			this.aClass93_Sub1Array1[2] = new Class93_Sub1(super.aClass19_Sub3_42, 6406, 64, false, local30, 6406);
			this.method2405();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9431() {
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
	@Override
	public void method9428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean213) {
			super.aClass19_Sub3_42.method7014(1);
			super.aClass19_Sub3_42.method7001(this.aClass93_Sub1Array1[arg1 - 1]);
			super.aClass19_Sub3_42.method7014(0);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	@Override
	public void method9427() {
		if (this.aBoolean213) {
			if (!this.aBoolean212) {
				super.aClass19_Sub3_42.method7014(2);
				super.aClass19_Sub3_42.method7001((Class93) null);
			}
			super.aClass19_Sub3_42.method7014(1);
			super.aClass19_Sub3_42.method7001((Class93) null);
			super.aClass19_Sub3_42.method7014(0);
			this.aClass36_1.method1005('\u0001');
			this.aBoolean213 = false;
		} else {
			super.aClass19_Sub3_42.method7029(0, 5890);
		}
		super.aClass19_Sub3_42.method7031(8448, 8448);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method9426(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub3_42.method7001(arg0);
		super.aClass19_Sub3_42.method6991(arg1);
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
	private void method2405() {
		this.aClass36_1 = new Class36(super.aClass19_Sub3_42, 2);
		this.aClass36_1.method1002(0);
		super.aClass19_Sub3_42.method7014(1);
		OpenGL.glTexGeni(OpenGL.GL_S, OpenGL.GL_TEXTURE_GEN_MODE, OpenGL.GL_NORMAL_MAP);
		OpenGL.glTexGeni(OpenGL.GL_T, OpenGL.GL_TEXTURE_GEN_MODE, OpenGL.GL_NORMAL_MAP);
		OpenGL.glTexGeni(OpenGL.GL_R, OpenGL.GL_TEXTURE_GEN_MODE, OpenGL.GL_NORMAL_MAP);
		OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_S);
		OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_T);
		OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_R);
		OpenGL.glMatrixMode(OpenGL.GL_TEXTURE);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(OpenGL.GL_MODELVIEW);
		if (this.aBoolean212) {
			super.aClass19_Sub3_42.method7031(7681, 260);
			super.aClass19_Sub3_42.method7021(5890, 770, 0);
			super.aClass19_Sub3_42.method7029(0, 34167);
		} else {
			super.aClass19_Sub3_42.method7031(8448, 7681);
			super.aClass19_Sub3_42.method7021(34168, 768, 0);
			super.aClass19_Sub3_42.method7014(2);
			super.aClass19_Sub3_42.method7031(7681, 260);
			super.aClass19_Sub3_42.method7021(34168, 768, 0);
			super.aClass19_Sub3_42.method7021(34168, 770, 1);
			super.aClass19_Sub3_42.method7029(0, 34167);
		}
		super.aClass19_Sub3_42.method7014(0);
		this.aClass36_1.method1004();
		this.aClass36_1.method1002(1);
		super.aClass19_Sub3_42.method7014(1);
		OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_S);
		OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_T);
		OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_R);
		OpenGL.glMatrixMode(OpenGL.GL_TEXTURE);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(OpenGL.GL_MODELVIEW);
		if (this.aBoolean212) {
			super.aClass19_Sub3_42.method7031(8448, 8448);
			super.aClass19_Sub3_42.method7021(5890, 768, 0);
			super.aClass19_Sub3_42.method7029(0, 5890);
		} else {
			super.aClass19_Sub3_42.method7031(8448, 8448);
			super.aClass19_Sub3_42.method7021(5890, 768, 0);
			super.aClass19_Sub3_42.method7014(2);
			super.aClass19_Sub3_42.method7031(8448, 8448);
			super.aClass19_Sub3_42.method7021(5890, 768, 0);
			super.aClass19_Sub3_42.method7021(34168, 768, 1);
			super.aClass19_Sub3_42.method7029(0, 5890);
		}
		super.aClass19_Sub3_42.method7014(0);
		this.aClass36_1.method1004();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9429(@OriginalArg(1) boolean arg0) {
		super.aClass19_Sub3_42.method7031(7681, 8448);
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9432(@OriginalArg(0) boolean arg0) {
		if (this.aClass36_1 == null || !arg0) {
			super.aClass19_Sub3_42.method7029(0, 34168);
			return;
		}
		if (!this.aBoolean212) {
			super.aClass19_Sub3_42.method7014(2);
			super.aClass19_Sub3_42.method7001(super.aClass19_Sub3_42.aClass93_Sub2_5);
			super.aClass19_Sub3_42.method7014(0);
		}
		this.aClass36_1.method1005('\u0000');
		this.aBoolean213 = true;
	}
}
