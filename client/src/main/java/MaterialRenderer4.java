import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class MaterialRenderer4 extends MaterialRenderer {

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!rj;")
	private Class203 aClass203_2;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Lclient!fs;")
	private final Class76 aClass76_2;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!ht;")
	private final Class8_Sub2 aClass8_Sub2_1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!bf;Lclient!fs;)V")
	public MaterialRenderer4(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class76 arg1) {
		super(arg0);
		this.aClass76_2 = arg1;
		this.method2448();
		this.aClass8_Sub2_1 = new Class8_Sub2(this.aClass19_Sub1_35, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass8_Sub2_1.method2611();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
	@Override
	public void method5714(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_35.gl;
		if (this.aClass19_Sub1_35.anInt601 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass19_Sub1_35.anInt601;
			this.aClass19_Sub1_35.method832(1);
			Static130.aFloatArray13[0] = 0.0F;
			Static130.aFloatArray13[1] = 0.0F;
			Static130.aFloatArray13[2] = local14;
			Static130.aFloatArray13[3] = this.aClass19_Sub1_35.aFloat5 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(GL.GL_S, GL.GL_EYE_PLANE, Static130.aFloatArray13, 0);
			local3.glPopMatrix();
			this.aClass19_Sub1_35.method847(0.5F, (float) this.aClass19_Sub1_35.anInt601);
			this.aClass19_Sub1_35.method848(this.aClass8_Sub2_1);
			this.aClass19_Sub1_35.method832(0);
		}
		this.aClass203_2.method5190('\u0000');
		local3.glMatrixMode(GL.GL_TEXTURE);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(GL.GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "()Z")
	@Override
	public boolean method5711() {
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	@Override
	public void method5713(@OriginalArg(0) boolean arg0) {
		this.aClass19_Sub1_35.method794(260, 8448);
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "()V")
	private void method2448() {
		@Pc(3) opengl local3 = this.aClass19_Sub1_35.gl;
		this.aClass203_2 = new Class203(this.aClass19_Sub1_35, 2);
		this.aClass203_2.method5192(0);
		this.aClass19_Sub1_35.method832(1);
		this.aClass19_Sub1_35.method794(7681, 260);
		this.aClass19_Sub1_35.method793(0, 34168, 768);
		local3.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
		local3.glEnable(GL.GL_TEXTURE_GEN_S);
		this.aClass19_Sub1_35.method832(0);
		local3.glTexEnvf(GL.GL_TEXTURE_ENV, GL.GL_RGB_SCALE, 2.0F);
		if (this.aClass76_2.aBoolean160) {
			local3.glTexGeni(GL.GL_R, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
			local3.glTexGeni(GL.GL_Q, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
			local3.glTexGenfv(GL.GL_Q, GL.GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(GL.GL_TEXTURE_GEN_R);
			local3.glEnable(GL.GL_TEXTURE_GEN_Q);
		}
		this.aClass203_2.method5191();
		this.aClass203_2.method5192(1);
		this.aClass19_Sub1_35.method832(1);
		this.aClass19_Sub1_35.method794(8448, 8448);
		this.aClass19_Sub1_35.method793(0, 5890, 768);
		local3.glDisable(GL.GL_TEXTURE_GEN_S);
		this.aClass19_Sub1_35.method832(0);
		local3.glTexEnvf(GL.GL_TEXTURE_ENV, GL.GL_RGB_SCALE, 1.0F);
		if (this.aClass76_2.aBoolean160) {
			local3.glDisable(GL.GL_TEXTURE_GEN_R);
			local3.glDisable(GL.GL_TEXTURE_GEN_Q);
		}
		this.aClass203_2.method5191();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	@Override
	public void method5712(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass76_2.aBoolean160) {
				this.aClass19_Sub1_35.method848(this.aClass76_2.aClass8_Sub4_2);
				Static130.aFloatArray13[0] = 0.0F;
				Static130.aFloatArray13[1] = 0.0F;
				Static130.aFloatArray13[2] = 0.0F;
				Static130.aFloatArray13[3] = (float) (this.aClass19_Sub1_35.anInt584 % 4000) / 4000.0F;
				this.aClass19_Sub1_35.gl.glTexGenfv(GL.GL_R, GL.GL_OBJECT_PLANE, Static130.aFloatArray13, 0);
			} else {
				@Pc(56) int local56 = this.aClass19_Sub1_35.anInt584 % 4000 * 16 / 4000;
				this.aClass19_Sub1_35.method848(this.aClass76_2.aClass8_Sub1Array1[local56]);
			}
		} else if (this.aClass76_2.aBoolean160) {
			this.aClass19_Sub1_35.method848(this.aClass76_2.aClass8_Sub4_2);
			Static130.aFloatArray13[0] = 0.0F;
			Static130.aFloatArray13[1] = 0.0F;
			Static130.aFloatArray13[2] = 0.0F;
			Static130.aFloatArray13[3] = 0.0F;
			this.aClass19_Sub1_35.gl.glTexGenfv(GL.GL_R, GL.GL_OBJECT_PLANE, Static130.aFloatArray13, 0);
		} else {
			this.aClass19_Sub1_35.method848(this.aClass76_2.aClass8_Sub1Array1[0]);
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "()V")
	@Override
	public void method5715() {
		@Pc(3) opengl local3 = this.aClass19_Sub1_35.gl;
		this.aClass203_2.method5190('\u0001');
		if (this.aClass19_Sub1_35.anInt601 > 0) {
			this.aClass19_Sub1_35.method832(1);
			this.aClass19_Sub1_35.method848(null);
			this.aClass19_Sub1_35.method847(1.0F, 0.0F);
			this.aClass19_Sub1_35.method832(0);
		}
		this.aClass19_Sub1_35.method794(8448, 8448);
		local3.glMatrixMode(GL.GL_TEXTURE);
		local3.glPopMatrix();
		local3.glMatrixMode(GL.GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!kq;)V")
	@Override
	public void method5710(@OriginalArg(0) Class8 arg0) {
	}
}
