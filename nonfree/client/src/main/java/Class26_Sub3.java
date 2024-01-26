import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class26_Sub3 extends Class26 {

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "Z")
	private boolean aBoolean244;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!ae;")
	private final Class7 aClass7_4;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!rda;")
	private Class317 aClass317_1;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Z")
	private final boolean aBoolean243;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!tca;Lclient!sb;Lclient!ae;)V")
	public Class26_Sub3(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) Class7 arg2) {
		super(arg0);
		this.aClass7_4 = arg2;
		if (arg1 != null && arg0.aBoolean703 && arg0.aBoolean707) {
			@Pc(29) Class265 local29 = Static34.method884(35633, arg1.method7600("gl", "environment_mapped_water_v"), arg0);
			@Pc(43) Class265 local43 = Static34.method884(35632, arg1.method7600("gl", "environment_mapped_water_f"), arg0);
			this.aClass317_1 = Static223.method9088(new Class265[] { local29, local43 }, arg0);
			this.aBoolean243 = this.aClass317_1 != null && this.aClass7_4.method115();
		} else {
			this.aBoolean243 = false;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean244) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass317_1.aLong253;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass19_Sub1_21.anInt9164 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8289() {
		return this.aBoolean243;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8292(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!mw;IB)V")
	@Override
	public void method8294(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean244) {
			super.aClass19_Sub1_21.method8088(arg0);
			super.aClass19_Sub1_21.method8054(arg1);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8297(@OriginalArg(1) boolean arg0) {
		@Pc(17) Interface8 local17 = super.aClass19_Sub1_21.method8145();
		if (!this.aBoolean243 || local17 == null) {
			return;
		}
		super.aClass19_Sub1_21.method8138(1);
		super.aClass19_Sub1_21.method8088(local17);
		super.aClass19_Sub1_21.method8138(0);
		super.aClass19_Sub1_21.method8088(this.aClass7_4.anInterface2_1);
		@Pc(50) long local50 = this.aClass317_1.aLong253;
		OpenGL.glUseProgramObjectARB(local50);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local50, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local50, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local50, "sunDir"), -super.aClass19_Sub1_21.aFloatArray60[0], -super.aClass19_Sub1_21.aFloatArray60[1], -super.aClass19_Sub1_21.aFloatArray60[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local50, "sunColour"), super.aClass19_Sub1_21.aFloat191, super.aClass19_Sub1_21.aFloat184, super.aClass19_Sub1_21.aFloat195, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local50, "sunExponent"), Math.abs(super.aClass19_Sub1_21.aFloatArray60[1]) * 928.0F + 96.0F);
		this.aBoolean244 = true;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
	@Override
	public void method8286() {
		if (!this.aBoolean244) {
			return;
		}
		super.aClass19_Sub1_21.method8138(1);
		super.aClass19_Sub1_21.method8088((Interface17) null);
		super.aClass19_Sub1_21.method8138(0);
		super.aClass19_Sub1_21.method8088((Interface17) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean244 = false;
	}
}
