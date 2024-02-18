import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class101_Sub4 extends Class101 {

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "Z")
	private boolean aBoolean432 = false;

	@OriginalMember(owner = "client!laa", name = "p", descriptor = "Z")
	private boolean aBoolean431 = false;

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "Lclient!sa;")
	private final Class329 aClass329_3;

	@OriginalMember(owner = "client!laa", name = "q", descriptor = "Lclient!iha;")
	private Class179 aClass179_6;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!qha;Lclient!sa;)V")
	public Class101_Sub4(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Class329 arg1) {
		super(arg0);
		this.aClass329_3 = arg1;
		if (this.aClass329_3.aClass93_Sub3_3 != null && super.aClass19_Sub3_42.bf && super.aClass19_Sub3_42.aBoolean619) {
			@Pc(34) Class240 local34 = Static245.method8629("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass19_Sub3_42, 35633);
			@Pc(43) Class240 local43 = Static245.method8629("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass19_Sub3_42, 35632);
			this.aClass179_6 = Static173.method2691(super.aClass19_Sub3_42, new Class240[] { local34, local43 });
			this.aBoolean432 = this.aClass179_6 != null;
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method9426(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean431) {
			super.aClass19_Sub3_42.method7001(arg0);
			super.aClass19_Sub3_42.method6991(arg1);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
	@Override
	public void method9427() {
		if (!this.aBoolean431) {
			return;
		}
		super.aClass19_Sub3_42.method7014(1);
		super.aClass19_Sub3_42.method7001((Class93) null);
		super.aClass19_Sub3_42.method7014(0);
		super.aClass19_Sub3_42.method7001((Class93) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean431 = false;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9432(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class93_Sub1 local12 = super.aClass19_Sub3_42.method6963();
		if (!this.aBoolean432 || local12 == null) {
			return;
		}
		super.aClass19_Sub3_42.method7014(1);
		super.aClass19_Sub3_42.method7001(local12);
		super.aClass19_Sub3_42.method7014(0);
		super.aClass19_Sub3_42.method7001(this.aClass329_3.aClass93_Sub3_3);
		@Pc(47) long local47 = this.aClass179_6.aLong136;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass19_Sub3_42.aFloatArray51[0], -super.aClass19_Sub3_42.aFloatArray51[1], -super.aClass19_Sub3_42.aFloatArray51[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass19_Sub3_42.aFloat148, super.aClass19_Sub3_42.aFloat143, super.aClass19_Sub3_42.aFloat137, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass19_Sub3_42.aFloatArray51[1]) * 928.0F + 96.0F);
		this.aBoolean431 = true;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9431() {
		return false;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(III)V")
	@Override
	public void method9428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean431) {
			return;
		}
		@Pc(21) int local21 = 0x1 << (arg1 & 0x3);
		@Pc(32) float local32 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(36) int local36 = arg0 & 0xFFFF;
		@Pc(45) float local45 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(49) long local49 = this.aClass179_6.aLong136;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "time"), (float) (super.aClass19_Sub3_42.anInt7987 * local21 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "scale"), local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "breakWaterDepth"), (float) local36);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "breakWaterOffset"), local45);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9429(@OriginalArg(1) boolean arg0) {
	}
}
