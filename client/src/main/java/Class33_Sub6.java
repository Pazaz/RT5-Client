import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class33_Sub6 extends Class33 {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "Z")
	private boolean aBoolean327 = false;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!rj;")
	private Class203 aClass203_5;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class33_Sub6(@OriginalArg(0) Class19_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean38) {
			@Pc(12) opengl local12 = this.aClass19_Sub1_35.anOpengl1;
			this.aClass203_5 = new Class203(arg0, 2);
			this.aClass203_5.method5192(0);
			this.aClass19_Sub1_35.method832(1);
			this.aClass19_Sub1_35.method794(34165, 7681);
			this.aClass19_Sub1_35.method793(2, 34168, 770);
			this.aClass19_Sub1_35.method833(0, 34167);
			local12.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_REFLECTION_MAP);
			local12.glTexGeni(GL.GL_T, GL.GL_TEXTURE_GEN_MODE, GL.GL_REFLECTION_MAP);
			local12.glTexGeni(GL.GL_R, GL.GL_TEXTURE_GEN_MODE, GL.GL_REFLECTION_MAP);
			local12.glEnable(GL.GL_TEXTURE_GEN_S);
			local12.glEnable(GL.GL_TEXTURE_GEN_T);
			local12.glEnable(GL.GL_TEXTURE_GEN_R);
			this.aClass19_Sub1_35.method832(0);
			this.aClass203_5.method5191();
			this.aClass203_5.method5192(1);
			this.aClass19_Sub1_35.method832(1);
			this.aClass19_Sub1_35.method794(8448, 8448);
			this.aClass19_Sub1_35.method793(2, 34166, 770);
			this.aClass19_Sub1_35.method833(0, 5890);
			local12.glDisable(GL.GL_TEXTURE_GEN_S);
			local12.glDisable(GL.GL_TEXTURE_GEN_T);
			local12.glDisable(GL.GL_TEXTURE_GEN_R);
			local12.glMatrixMode(GL.GL_TEXTURE);
			local12.glLoadIdentity();
			local12.glMatrixMode(GL.GL_MODELVIEW);
			this.aClass19_Sub1_35.method832(0);
			this.aClass203_5.method5191();
		}
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(Z)V")
	@Override
	public void method5714(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class8_Sub3 local3 = this.aClass19_Sub1_35.method838();
		if (this.aClass203_5 == null || local3 == null || !arg0) {
			this.aClass19_Sub1_35.method833(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass19_Sub1_35.anOpengl1;
		this.aClass203_5.method5190('\u0000');
		this.aClass19_Sub1_35.method832(1);
		this.aClass19_Sub1_35.method848(local3);
		local14.glMatrixMode(GL.GL_TEXTURE);
		local14.glLoadMatrixf(this.aClass19_Sub1_35.aClass14_Sub2_1.method3940(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(GL.GL_MODELVIEW);
		this.aClass19_Sub1_35.method832(0);
		this.aBoolean327 = true;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!kq;)V")
	@Override
	public void method5710(@OriginalArg(0) Class8 arg0) {
		this.aClass19_Sub1_35.method848(arg0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	@Override
	public void method5712(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "()V")
	@Override
	public void method5715() {
		if (this.aBoolean327) {
			this.aClass203_5.method5190('\u0001');
			this.aClass19_Sub1_35.method832(1);
			this.aClass19_Sub1_35.method848(null);
			this.aClass19_Sub1_35.method832(0);
		} else {
			this.aClass19_Sub1_35.method833(0, 5890);
		}
		this.aClass19_Sub1_35.method794(8448, 8448);
		this.aBoolean327 = false;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
	@Override
	public void method5713(@OriginalArg(0) boolean arg0) {
		this.aClass19_Sub1_35.method794(8448, 7681);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "()Z")
	@Override
	public boolean method5711() {
		return true;
	}
}
