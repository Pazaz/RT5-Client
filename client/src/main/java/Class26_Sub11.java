import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class26_Sub11 extends Class26 {

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "[C")
	private static final char[] aCharArray8 = new char[64];

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "Z")
	private boolean aBoolean722;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "Z")
	private boolean aBoolean726;

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "[F")
	private final float[] aFloatArray68 = new float[4];

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "Z")
	private boolean aBoolean723 = false;

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "Z")
	private final boolean aBoolean725;

	@OriginalMember(owner = "client!tj", name = "y", descriptor = "Lclient!fr;")
	private Class135 aClass135_2;

	@OriginalMember(owner = "client!tj", name = "w", descriptor = "Lclient!fr;")
	private Class135 aClass135_3;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "Lclient!fr;")
	private Class135 aClass135_5;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "Lclient!fr;")
	private Class135 aClass135_4;

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "Lclient!og;")
	private Interface18 anInterface18_6;

	static {
		for (@Pc(117) int local117 = 0; local117 < 26; local117++) {
			aCharArray8[local117] = (char) (local117 + 65);
		}
		for (@Pc(131) int local131 = 26; local131 < 52; local131++) {
			aCharArray8[local131] = (char) (local131 + 97 - 26);
		}
		for (@Pc(147) int local147 = 52; local147 < 62; local147++) {
			aCharArray8[local147] = (char) (local147 - 4);
		}
		aCharArray8[63] = '-';
		aCharArray8[62] = '*';
	}

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!tca;Lclient!sb;)V")
	public Class26_Sub11(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class330 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean708) {
			this.aClass135_2 = Static294.method4338(arg0, arg1.method7600("gl", "uw_ground_unlit"));
			this.aClass135_3 = Static294.method4338(arg0, arg1.method7600("gl", "uw_ground_lit"));
			this.aClass135_5 = Static294.method4338(arg0, arg1.method7600("gl", "uw_model_unlit"));
			this.aClass135_4 = Static294.method4338(arg0, arg1.method7600("gl", "uw_model_lit"));
			if (this.aClass135_4 != null & this.aClass135_2 != null & this.aClass135_3 != null & this.aClass135_5 != null) {
				this.anInterface18_6 = super.aClass19_Sub1_21.method8034(false, 1, 2, new int[] { 0, -1 });
				this.anInterface18_6.method9052(false, false);
				this.aBoolean725 = true;
			} else {
				this.aBoolean725 = false;
			}
		} else {
			this.aBoolean725 = false;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8289() {
		return this.aBoolean725;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!mw;IB)V")
	@Override
	public void method8294(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean723) {
				super.aClass19_Sub1_21.method8080(0, Static189.aClass168_2);
				super.aClass19_Sub1_21.method8142(Static189.aClass168_2, 0);
				this.aBoolean723 = false;
			}
			super.aClass19_Sub1_21.method8088(arg0);
			super.aClass19_Sub1_21.method8054(arg1);
		} else if (!this.aBoolean723) {
			super.aClass19_Sub1_21.method8088(super.aClass19_Sub1_21.anInterface17_3);
			super.aClass19_Sub1_21.method8054(1);
			super.aClass19_Sub1_21.method8080(0, Static188.aClass168_1);
			super.aClass19_Sub1_21.method8142(Static188.aClass168_1, 0);
			this.aBoolean723 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	@Override
	public void method8291() {
		if (!this.aBoolean722) {
			return;
		}
		@Pc(19) int local19 = super.aClass19_Sub1_21.XA();
		@Pc(23) int local23 = super.aClass19_Sub1_21.i();
		@Pc(34) float local34 = (float) local19 - (float) (local19 - local23) * 0.125F;
		@Pc(46) float local46 = -((float) (local19 - local23) * 0.25F) + (float) local19;
		OpenGL.glProgramLocalParameter4fARB(OpenGL.GL_VERTEX_PROGRAM_ARB, 0, local46, local34, 1.0F / (float) super.aClass19_Sub1_21.method8105(), (float) super.aClass19_Sub1_21.method8120() / 255.0F);
		super.aClass19_Sub1_21.method8138(1);
		super.aClass19_Sub1_21.method8112(super.aClass19_Sub1_21.method8025());
		super.aClass19_Sub1_21.method8138(0);
	}

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
	@Override
	public void method8286() {
		super.aClass19_Sub1_21.method8138(1);
		super.aClass19_Sub1_21.method8088((Interface17) null);
		super.aClass19_Sub1_21.method8094(Static209.aClass121_4, Static209.aClass121_4);
		super.aClass19_Sub1_21.method8080(0, Static189.aClass168_2);
		super.aClass19_Sub1_21.method8080(2, Static454.aClass168_5);
		super.aClass19_Sub1_21.method8142(Static189.aClass168_2, 0);
		super.aClass19_Sub1_21.method8138(0);
		if (this.aBoolean723) {
			super.aClass19_Sub1_21.method8080(0, Static189.aClass168_2);
			super.aClass19_Sub1_21.method8142(Static189.aClass168_2, 0);
			this.aBoolean723 = false;
		}
		if (this.aBoolean722) {
			OpenGL.glBindProgramARB(OpenGL.GL_VERTEX_PROGRAM_ARB, 0);
			OpenGL.glDisable(OpenGL.GL_FRAGMENT_PROGRAM_ARB);
			OpenGL.glDisable(OpenGL.GL_VERTEX_PROGRAM_ARB);
			this.aBoolean722 = false;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8292(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	@Override
	public void method8295() {
		@Pc(8) int local8 = super.aClass19_Sub1_21.method8092();
		@Pc(13) Class73_Sub1 local13 = super.aClass19_Sub1_21.method8118();
		if (this.aBoolean726) {
			OpenGL.glBindProgramARB(OpenGL.GL_VERTEX_PROGRAM_ARB, ~local8 == Integer.MIN_VALUE ? this.aClass135_3.anInt3106 : this.aClass135_4.anInt3106);
		} else {
			OpenGL.glBindProgramARB(OpenGL.GL_VERTEX_PROGRAM_ARB, local8 == Integer.MAX_VALUE ? this.aClass135_2.anInt3106 : this.aClass135_5.anInt3106);
		}
		OpenGL.glEnable(OpenGL.GL_VERTEX_PROGRAM_ARB);
		this.aBoolean722 = true;
		local13.method1879((float) local8, -1.0F, 0.0F, this.aFloatArray68, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(OpenGL.GL_VERTEX_PROGRAM_ARB, 1, this.aFloatArray68[0], this.aFloatArray68[1], this.aFloatArray68[2], this.aFloatArray68[3]);
		this.method8291();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8297(@OriginalArg(1) boolean arg0) {
		this.aBoolean726 = arg0;
		super.aClass19_Sub1_21.method8138(1);
		super.aClass19_Sub1_21.method8088(this.anInterface18_6);
		super.aClass19_Sub1_21.method8094(Static185.aClass121_3, Static725.aClass121_6);
		super.aClass19_Sub1_21.method8080(0, Static454.aClass168_5);
		super.aClass19_Sub1_21.method8125(Static189.aClass168_2, true, false, 2);
		super.aClass19_Sub1_21.method8142(Static188.aClass168_1, 0);
		super.aClass19_Sub1_21.method8138(0);
		this.method8295();
	}
}
