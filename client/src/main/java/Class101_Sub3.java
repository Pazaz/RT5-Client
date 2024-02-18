import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class101_Sub3 extends Class101 {

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Z")
	private boolean aBoolean274 = false;

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "Lclient!bea;")
	private Class36 aClass36_3;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class101_Sub3(@OriginalArg(0) Class19_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean598) {
			this.aClass36_3 = new Class36(arg0, 2);
			this.aClass36_3.method1002(0);
			super.aClass19_Sub3_42.method7014(1);
			super.aClass19_Sub3_42.method7031(7681, 34165);
			super.aClass19_Sub3_42.method7021(34168, 770, 2);
			super.aClass19_Sub3_42.method7029(0, 34167);
			OpenGL.glTexGeni(OpenGL.GL_S, OpenGL.GL_TEXTURE_GEN_MODE, OpenGL.GL_REFLECTION_MAP);
			OpenGL.glTexGeni(OpenGL.GL_T, OpenGL.GL_TEXTURE_GEN_MODE, OpenGL.GL_REFLECTION_MAP);
			OpenGL.glTexGeni(OpenGL.GL_R, OpenGL.GL_TEXTURE_GEN_MODE, OpenGL.GL_REFLECTION_MAP);
			OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_S);
			OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_T);
			OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_R);
			super.aClass19_Sub3_42.method7014(0);
			this.aClass36_3.method1004();
			this.aClass36_3.method1002(1);
			super.aClass19_Sub3_42.method7014(1);
			super.aClass19_Sub3_42.method7031(8448, 8448);
			super.aClass19_Sub3_42.method7021(34166, 770, 2);
			super.aClass19_Sub3_42.method7029(0, 5890);
			OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_S);
			OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_T);
			OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_R);
			OpenGL.glMatrixMode(OpenGL.GL_TEXTURE);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(OpenGL.GL_MODELVIEW);
			super.aClass19_Sub3_42.method7014(0);
			this.aClass36_3.method1004();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	@Override
	public void method9427() {
		if (this.aBoolean274) {
			this.aClass36_3.method1005('\u0001');
			super.aClass19_Sub3_42.method7014(1);
			super.aClass19_Sub3_42.method7001((Class93) null);
			super.aClass19_Sub3_42.method7014(0);
		} else {
			super.aClass19_Sub3_42.method7029(0, 5890);
		}
		super.aClass19_Sub3_42.method7031(8448, 8448);
		this.aBoolean274 = false;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9432(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class93_Sub1 local8 = super.aClass19_Sub3_42.method6963();
		if (this.aClass36_3 == null || local8 == null || !arg0) {
			super.aClass19_Sub3_42.method7029(0, 34168);
			return;
		}
		this.aClass36_3.method1005('\u0000');
		super.aClass19_Sub3_42.method7014(1);
		super.aClass19_Sub3_42.method7001(local8);
		OpenGL.glMatrixMode(OpenGL.GL_TEXTURE);
		OpenGL.glLoadMatrixf(super.aClass19_Sub3_42.aClass73_Sub3_5.method7145(), 0);
		OpenGL.glMatrixMode(OpenGL.GL_MODELVIEW);
		super.aClass19_Sub3_42.method7014(0);
		this.aBoolean274 = true;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9431() {
		return true;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method9426(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub3_42.method7001(arg0);
		super.aClass19_Sub3_42.method6991(arg1);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V")
	@Override
	public void method9428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9429(@OriginalArg(1) boolean arg0) {
		super.aClass19_Sub3_42.method7031(7681, 8448);
	}
}
