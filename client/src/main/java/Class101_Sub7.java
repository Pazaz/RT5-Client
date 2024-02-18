import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class101_Sub7 extends Class101 {

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Z")
	private boolean aBoolean709 = false;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Z")
	private boolean aBoolean710 = false;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!sa;")
	private final Class329 aClass329_5;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!iha;")
	private Class179 aClass179_7;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!qha;Lclient!sa;)V")
	public Class101_Sub7(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Class329 arg1) {
		super(arg0);
		this.aClass329_5 = arg1;
		if (this.aClass329_5.aClass93_Sub3_3 != null && super.aClass19_Sub3_42.bf && super.aClass19_Sub3_42.aBoolean619) {
			@Pc(34) Class240 local34 = Static245.method8629("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass19_Sub3_42, 35633);
			@Pc(43) Class240 local43 = Static245.method8629("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass19_Sub3_42, 35632);
			this.aClass179_7 = Static173.method2691(super.aClass19_Sub3_42, new Class240[] { local34, local43 });
			this.aBoolean709 = this.aClass179_7 != null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9431() {
		return this.aBoolean709;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method9426(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean710) {
			super.aClass19_Sub3_42.method7001(arg0);
			super.aClass19_Sub3_42.method6991(arg1);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
	@Override
	public void method9428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean710) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg0 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass179_7.aLong136;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (super.aClass19_Sub3_42.anInt7987 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	@Override
	public void method9427() {
		if (!this.aBoolean710) {
			return;
		}
		super.aClass19_Sub3_42.method7014(1);
		super.aClass19_Sub3_42.method7001((Class93) null);
		super.aClass19_Sub3_42.method7014(0);
		super.aClass19_Sub3_42.method7001((Class93) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean710 = false;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9429(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9432(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class93_Sub1 local12 = super.aClass19_Sub3_42.method6963();
		if (!this.aBoolean709 || local12 == null) {
			return;
		}
		@Pc(32) float local32 = (1.0F - Math.abs(super.aClass19_Sub3_42.aFloatArray51[1])) * 2.0F + 1.0F;
		super.aClass19_Sub3_42.method7014(1);
		super.aClass19_Sub3_42.method7001(local12);
		super.aClass19_Sub3_42.method7014(0);
		super.aClass19_Sub3_42.method7001(this.aClass329_5.aClass93_Sub3_3);
		@Pc(58) long local58 = this.aClass179_7.aLong136;
		OpenGL.glUseProgramObjectARB(local58);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local58, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local58, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local58, "sunDir"), -super.aClass19_Sub3_42.aFloatArray51[0], -super.aClass19_Sub3_42.aFloatArray51[1], -super.aClass19_Sub3_42.aFloatArray51[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local58, "sunColour"), local32 * super.aClass19_Sub3_42.aFloat148, super.aClass19_Sub3_42.aFloat143 * local32, super.aClass19_Sub3_42.aFloat137 * local32, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local58, "sunExponent"), Math.abs(super.aClass19_Sub3_42.aFloatArray51[1]) * 928.0F + 64.0F);
		this.aBoolean710 = true;
	}
}
