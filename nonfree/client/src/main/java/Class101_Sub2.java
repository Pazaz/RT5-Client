import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class101_Sub2 extends Class101 {

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!bea;")
	private Class36 aClass36_2;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!sa;")
	private final Class329 aClass329_2;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Lclient!wu;")
	private final Class93_Sub4 aClass93_Sub4_1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!qha;Lclient!sa;)V")
	public Class101_Sub2(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Class329 arg1) {
		super(arg0);
		this.aClass329_2 = arg1;
		this.method2648();
		this.aClass93_Sub4_1 = new Class93_Sub4(super.aClass19_Sub3_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass93_Sub4_1.method9448();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9429(@OriginalArg(1) boolean arg0) {
		super.aClass19_Sub3_42.method7031(8448, 260);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9432(@OriginalArg(0) boolean arg0) {
		if (super.aClass19_Sub3_42.anInt8008 > 0) {
			@Pc(15) float local15 = -0.5F / (float) super.aClass19_Sub3_42.anInt8008;
			super.aClass19_Sub3_42.method7014(1);
			Static512.aFloatArray49[3] = super.aClass19_Sub3_42.aFloat132 * local15 + 0.25F;
			Static512.aFloatArray49[0] = 0.0F;
			Static512.aFloatArray49[1] = 0.0F;
			Static512.aFloatArray49[2] = local15;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(OpenGL.GL_S, OpenGL.GL_EYE_PLANE, Static512.aFloatArray49, 0);
			OpenGL.glPopMatrix();
			super.aClass19_Sub3_42.method6995(0.5F, (float) super.aClass19_Sub3_42.anInt8008);
			super.aClass19_Sub3_42.method7001(this.aClass93_Sub4_1);
			super.aClass19_Sub3_42.method7014(0);
		}
		this.aClass36_2.method1005('\u0000');
		OpenGL.glMatrixMode(OpenGL.GL_TEXTURE);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(OpenGL.GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	@Override
	public void method9428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass329_2.aBoolean655) {
				super.aClass19_Sub3_42.method7001(this.aClass329_2.aClass93_Sub3_2);
				Static512.aFloatArray49[3] = (float) (super.aClass19_Sub3_42.anInt7987 % 4000) / 4000.0F;
				Static512.aFloatArray49[0] = 0.0F;
				Static512.aFloatArray49[2] = 0.0F;
				Static512.aFloatArray49[1] = 0.0F;
				OpenGL.glTexGenfv(OpenGL.GL_R, OpenGL.GL_OBJECT_PLANE, Static512.aFloatArray49, 0);
			} else {
				@Pc(24) int local24 = super.aClass19_Sub3_42.anInt7987 % 4000 * 16 / 4000;
				super.aClass19_Sub3_42.method7001(this.aClass329_2.aClass93_Sub2Array3[local24]);
			}
		} else if (this.aClass329_2.aBoolean655) {
			super.aClass19_Sub3_42.method7001(this.aClass329_2.aClass93_Sub3_2);
			Static512.aFloatArray49[3] = 0.0F;
			Static512.aFloatArray49[0] = 0.0F;
			Static512.aFloatArray49[2] = 0.0F;
			Static512.aFloatArray49[1] = 0.0F;
			OpenGL.glTexGenfv(OpenGL.GL_R, OpenGL.GL_OBJECT_PLANE, Static512.aFloatArray49, 0);
		} else {
			super.aClass19_Sub3_42.method7001(this.aClass329_2.aClass93_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	@Override
	public void method9427() {
		this.aClass36_2.method1005('\u0001');
		if (super.aClass19_Sub3_42.anInt8008 > 0) {
			super.aClass19_Sub3_42.method7014(1);
			super.aClass19_Sub3_42.method7001((Class93) null);
			super.aClass19_Sub3_42.method6995(1.0F, 0.0F);
			super.aClass19_Sub3_42.method7014(0);
		}
		super.aClass19_Sub3_42.method7031(8448, 8448);
		OpenGL.glMatrixMode(OpenGL.GL_TEXTURE);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(OpenGL.GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method9426(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9431() {
		return true;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
	private void method2648() {
		this.aClass36_2 = new Class36(super.aClass19_Sub3_42, 2);
		this.aClass36_2.method1002(0);
		super.aClass19_Sub3_42.method7014(1);
		super.aClass19_Sub3_42.method7031(260, 7681);
		super.aClass19_Sub3_42.method7021(34168, 768, 0);
		OpenGL.glTexGeni(OpenGL.GL_S, OpenGL.GL_TEXTURE_GEN_MODE, OpenGL.GL_EYE_LINEAR);
		OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_S);
		super.aClass19_Sub3_42.method7014(0);
		OpenGL.glTexEnvf(OpenGL.GL_TEXTURE_ENV, OpenGL.GL_RGB_SCALE, 2.0F);
		if (this.aClass329_2.aBoolean655) {
			OpenGL.glTexGeni(OpenGL.GL_R, OpenGL.GL_TEXTURE_GEN_MODE, OpenGL.GL_OBJECT_LINEAR);
			OpenGL.glTexGeni(OpenGL.GL_Q, OpenGL.GL_TEXTURE_GEN_MODE, OpenGL.GL_OBJECT_LINEAR);
			OpenGL.glTexGenfv(OpenGL.GL_Q, OpenGL.GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_R);
			OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_Q);
		}
		this.aClass36_2.method1004();
		this.aClass36_2.method1002(1);
		super.aClass19_Sub3_42.method7014(1);
		super.aClass19_Sub3_42.method7031(8448, 8448);
		super.aClass19_Sub3_42.method7021(5890, 768, 0);
		OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_S);
		super.aClass19_Sub3_42.method7014(0);
		OpenGL.glTexEnvf(OpenGL.GL_TEXTURE_ENV, OpenGL.GL_RGB_SCALE, 1.0F);
		if (this.aClass329_2.aBoolean655) {
			OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_R);
			OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_Q);
		}
		this.aClass36_2.method1004();
	}
}
