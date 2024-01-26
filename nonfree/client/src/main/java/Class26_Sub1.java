import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!at", name = "l", descriptor = "Lclient!tca;")
	private final Class19_Sub1_Sub2 aClass19_Sub1_Sub2_1;

	@OriginalMember(owner = "client!at", name = "s", descriptor = "Lclient!ae;")
	private final Class7 aClass7_2;

	@OriginalMember(owner = "client!at", name = "o", descriptor = "Lclient!fr;")
	private final Class135 aClass135_1;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!tca;Lclient!sb;Lclient!ae;)V")
	public Class26_Sub1(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) Class7 arg2) {
		super(arg0);
		this.aClass19_Sub1_Sub2_1 = arg0;
		this.aClass7_2 = arg2;
		if (arg1 != null && this.aClass7_2.method116() && this.aClass19_Sub1_Sub2_1.aBoolean708) {
			this.aClass135_1 = Static294.method4338(this.aClass19_Sub1_Sub2_1, arg1.method7600("gl", "transparent_water"));
		} else {
			this.aClass135_1 = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "e", descriptor = "(I)V")
	@Override
	public void method8286() {
		super.aClass19_Sub1_21.method8080(0, Static189.aClass168_2);
		OpenGL.glBindProgramARB(OpenGL.GL_VERTEX_PROGRAM_ARB, 0);
		OpenGL.glDisable(OpenGL.GL_FRAGMENT_PROGRAM_ARB);
		OpenGL.glDisable(OpenGL.GL_VERTEX_PROGRAM_ARB);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8289() {
		return this.aClass135_1 != null;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!mw;IB)V")
	@Override
	public void method8294(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8297(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(OpenGL.GL_VERTEX_PROGRAM_ARB, this.aClass135_1.anInt3106);
		OpenGL.glEnable(OpenGL.GL_VERTEX_PROGRAM_ARB);
		super.aClass19_Sub1_21.method8080(0, Static188.aClass168_1);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8292(@OriginalArg(0) boolean arg0) {
		super.aClass19_Sub1_21.method8094(Static438.aClass121_5, Static185.aClass121_3);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass7_2.aBoolean7) {
			@Pc(12) float local12 = (float) (super.aClass19_Sub1_21.anInt9164 % 4000) / 4000.0F;
			super.aClass19_Sub1_21.method8088(this.aClass7_2.anInterface2_2);
			OpenGL.glProgramLocalParameter4fARB(OpenGL.GL_VERTEX_PROGRAM_ARB, 0, local12, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(38) int local38 = super.aClass19_Sub1_21.anInt9164 % 4000 * 16 / 4000;
			super.aClass19_Sub1_21.method8088(this.aClass7_2.anInterface18Array2[local38]);
			OpenGL.glProgramLocalParameter4fARB(OpenGL.GL_VERTEX_PROGRAM_ARB, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
