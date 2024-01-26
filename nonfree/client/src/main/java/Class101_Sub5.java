import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class101_Sub5 extends Class101 {

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!sa;")
	private final Class329 aClass329_4;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Lclient!bea;")
	private final Class36 aClass36_5;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!qha;Lclient!sa;)V")
	public Class101_Sub5(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Class329 arg1) {
		super(arg0);
		this.aClass329_4 = arg1;
		this.aClass36_5 = new Class36(arg0, 2);
		this.aClass36_5.method1002(0);
		super.aClass19_Sub3_42.method7014(1);
		if (this.aClass329_4.aBoolean655) {
			OpenGL.glTexGeni(OpenGL.GL_R, OpenGL.GL_TEXTURE_GEN_MODE, OpenGL.GL_OBJECT_LINEAR);
			OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_R);
		}
		OpenGL.glTexGeni(OpenGL.GL_S, OpenGL.GL_TEXTURE_GEN_MODE, OpenGL.GL_EYE_LINEAR);
		OpenGL.glTexGeni(OpenGL.GL_T, OpenGL.GL_TEXTURE_GEN_MODE, OpenGL.GL_EYE_LINEAR);
		OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_S);
		OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_T);
		super.aClass19_Sub3_42.method7014(0);
		this.aClass36_5.method1004();
		this.aClass36_5.method1002(1);
		super.aClass19_Sub3_42.method7014(1);
		if (this.aClass329_4.aBoolean655) {
			OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_R);
		}
		OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_S);
		OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_T);
		super.aClass19_Sub3_42.method7014(0);
		this.aClass36_5.method1004();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9429(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9431() {
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method9426(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub3_42.method7001(arg0);
		super.aClass19_Sub3_42.method6991(arg1);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	@Override
	public void method9427() {
		this.aClass36_5.method1005('\u0001');
		super.aClass19_Sub3_42.method7014(1);
		super.aClass19_Sub3_42.method7001((Class93) null);
		super.aClass19_Sub3_42.method7014(0);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9432(@OriginalArg(0) boolean arg0) {
		this.aClass36_5.method1005('\u0000');
		if (this.aClass329_4.aBoolean655) {
			super.aClass19_Sub3_42.method7014(1);
			super.aClass19_Sub3_42.method7001(this.aClass329_4.aClass93_Sub3_1);
			super.aClass19_Sub3_42.method7014(0);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
	@Override
	public void method9428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(37) float local37 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(49) boolean local49 = (arg1 & 0x80) != 0;
		super.aClass19_Sub3_42.method7014(1);
		if (local49) {
			Static617.aFloatArray69[1] = 0.0F;
			Static617.aFloatArray69[2] = 0.0F;
			Static617.aFloatArray69[0] = local37;
			Static617.aFloatArray69[3] = 0.0F;
		} else {
			Static617.aFloatArray69[1] = 0.0F;
			Static617.aFloatArray69[0] = 0.0F;
			Static617.aFloatArray69[3] = 0.0F;
			Static617.aFloatArray69[2] = local37;
		}
		OpenGL.glTexGenfv(OpenGL.GL_S, OpenGL.GL_EYE_PLANE, Static617.aFloatArray69, 0);
		Static617.aFloatArray69[2] = 0.0F;
		Static617.aFloatArray69[1] = local37;
		Static617.aFloatArray69[0] = 0.0F;
		Static617.aFloatArray69[3] = (float) super.aClass19_Sub3_42.anInt7987 * local14 % 1.0F;
		OpenGL.glTexGenfv(OpenGL.GL_T, OpenGL.GL_EYE_PLANE, Static617.aFloatArray69, 0);
		if (this.aClass329_4.aBoolean655) {
			Static617.aFloatArray69[3] = (float) super.aClass19_Sub3_42.anInt7987 * local25 % 1.0F;
			Static617.aFloatArray69[0] = 0.0F;
			Static617.aFloatArray69[1] = 0.0F;
			Static617.aFloatArray69[2] = 0.0F;
			OpenGL.glTexGenfv(OpenGL.GL_R, OpenGL.GL_OBJECT_PLANE, Static617.aFloatArray69, 0);
		} else {
			@Pc(148) int local148 = (int) ((float) super.aClass19_Sub3_42.anInt7987 * 16.0F * local25);
			super.aClass19_Sub3_42.method7001(this.aClass329_4.aClass93_Sub2Array4[local148 % 16]);
		}
		super.aClass19_Sub3_42.method7014(0);
	}
}
