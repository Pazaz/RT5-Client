import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class2_Sub38_Sub1 extends Class2_Sub38 {

	@OriginalMember(owner = "client!w", name = "u", descriptor = "Lclient!oa;")
	private Class166 aClass166_1;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "Lclient!ua;")
	private Class228 aClass228_3;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "Lclient!ua;")
	private Class228 aClass228_4;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "Lclient!oa;")
	private Class166 aClass166_2;

	@OriginalMember(owner = "client!w", name = "A", descriptor = "I")
	private int anInt7068;

	@OriginalMember(owner = "client!w", name = "B", descriptor = "Lclient!al;")
	private Class8_Sub1 aClass8_Sub1_6;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "Lclient!oa;")
	private Class166 aClass166_3;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "I")
	private int anInt7069;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "Lclient!oa;")
	private Class166 aClass166_4;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "I")
	private int anInt7070;

	@OriginalMember(owner = "client!w", name = "G", descriptor = "[Lclient!al;")
	private Class8_Sub1[] aClass8_Sub1Array4;

	@OriginalMember(owner = "client!w", name = "H", descriptor = "Lclient!al;")
	private Class8_Sub1 aClass8_Sub1_7;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "I")
	private int anInt7071;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class2_Sub38_Sub1(@OriginalArg(0) Class19_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()Z")
	@Override
	public boolean method6308() {
		return this.aClass228_4 != null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7068 = arg0;
		this.anInt7071 = arg1;
		@Pc(10) int local10 = Static351.method5855(this.anInt7068);
		@Pc(15) int local15 = Static351.method5855(this.anInt7071);
		if (this.anInt7069 == local10 && this.anInt7070 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass8_Sub1Array4 != null) {
			for (local28 = 0; local28 < this.aClass8_Sub1Array4.length; local28++) {
				this.aClass8_Sub1Array4[local28].method6156();
			}
			this.aClass8_Sub1Array4 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass228_3 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass228_3 == null) {
						this.aClass228_3 = new Class228(this.aClass19_Sub1_41);
					}
					this.aClass8_Sub1Array4 = new Class8_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass8_Sub1Array4[local55++] = new Class8_Sub1(this.aClass19_Sub1_41, 3553, 34842, local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt7069 = local10;
		this.anInt7070 = local15;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()I")
	@Override
	public int method6301() {
		return 1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()Z")
	@Override
	public boolean method6300() {
		if (!this.aClass19_Sub1_41.aBoolean36 || !this.aClass19_Sub1_41.aBoolean35 || !this.aClass19_Sub1_41.aBoolean51) {
			return false;
		}
		this.aClass228_4 = new Class228(this.aClass19_Sub1_41);
		this.aClass8_Sub1_7 = new Class8_Sub1(this.aClass19_Sub1_41, 3553, 34842, 256, 256);
		this.aClass8_Sub1_7.method3638(false, false);
		this.aClass8_Sub1_6 = new Class8_Sub1(this.aClass19_Sub1_41, 3553, 34842, 256, 256);
		this.aClass8_Sub1_6.method3638(false, false);
		this.aClass19_Sub1_41.method808(this.aClass228_4);
		this.aClass228_4.method5794(0, this.aClass8_Sub1_7);
		this.aClass228_4.method5794(1, this.aClass8_Sub1_6);
		this.aClass228_4.method5796(0);
		if (!this.aClass228_4.method5799()) {
			this.aClass19_Sub1_41.method830(this.aClass228_4);
			return false;
		}
		this.aClass19_Sub1_41.method830(this.aClass228_4);
		this.aClass166_2 = Static244.method4241(this.aClass19_Sub1_41, new Class35[] { Static40.method1280(this.aClass19_Sub1_41, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass166_4 = Static244.method4241(this.aClass19_Sub1_41, new Class35[] { Static40.method1280(this.aClass19_Sub1_41, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass166_1 = Static244.method4241(this.aClass19_Sub1_41, new Class35[] { Static40.method1280(this.aClass19_Sub1_41, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass166_3 = Static244.method4241(this.aClass19_Sub1_41, new Class35[] { Static40.method1280(this.aClass19_Sub1_41, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass166_4 != null && this.aClass166_2 != null && this.aClass166_1 != null && this.aClass166_3 != null;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
	@Override
	public void method6305() {
		this.aClass228_3 = null;
		this.aClass8_Sub1Array4 = null;
		this.aClass228_4 = null;
		this.aClass8_Sub1_7 = null;
		this.aClass8_Sub1_6 = null;
		this.aClass166_2 = null;
		this.aClass166_4 = null;
		this.aClass166_1 = null;
		this.aClass166_3 = null;
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()Z")
	public boolean method6310() {
		return this.aClass19_Sub1_41.aBoolean36 && this.aClass19_Sub1_41.aBoolean35 && this.aClass19_Sub1_41.aBoolean51;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	@Override
	public void method6307(@OriginalArg(0) int arg0) {
		this.aClass19_Sub1_41.gl.glUseProgramObjectARB(0);
		this.aClass19_Sub1_41.method832(1);
		this.aClass19_Sub1_41.method848(null);
		this.aClass19_Sub1_41.method832(0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!al;Lclient!al;)V")
	@Override
	public void method6309(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1 arg1, @OriginalArg(2) Class8_Sub1 arg2) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_41.gl;
		local3.glPushAttrib(GL.GL_VIEWPORT_BIT);
		local3.glMatrixMode(GL.GL_PROJECTION);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass8_Sub1Array4 == null) {
			this.aClass19_Sub1_41.method848(arg1);
			this.aClass19_Sub1_41.method808(this.aClass228_4);
			this.aClass228_4.method5796(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass166_2.anInt4504;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static377.aFloat80, 0.0F, 0.0F);
			local3.glBegin(GL.GL_QUADS);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt7068, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt7068, (float) this.anInt7071);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt7071);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass19_Sub1_41.method808(this.aClass228_3);
			local34 = Static351.method5855(this.anInt7068);
			local39 = Static351.method5855(this.anInt7071);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass228_3.method5794(0, this.aClass8_Sub1Array4[local41]);
				if (local41 == 0) {
					this.aClass19_Sub1_41.method848(arg1);
					local3.glBegin(GL.GL_QUADS);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt7068, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt7068, (float) this.anInt7071);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt7071);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass19_Sub1_41.method848(this.aClass8_Sub1Array4[local41 - 1]);
					local3.glBegin(GL.GL_QUADS);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f(1.0F, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f(1.0F, 1.0F);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, 1.0F);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				}
				if (local34 > 256) {
					local34 >>= 0x1;
				}
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				local41++;
			}
			this.aClass19_Sub1_41.method830(this.aClass228_3);
			this.aClass19_Sub1_41.method848(this.aClass8_Sub1Array4[local41 - 1]);
			this.aClass19_Sub1_41.method808(this.aClass228_4);
			this.aClass228_4.method5796(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass166_4.anInt4504;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static377.aFloat80, 0.0F, 0.0F);
			local3.glBegin(GL.GL_QUADS);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		}
		this.aClass228_4.method5796(1);
		this.aClass19_Sub1_41.method848(this.aClass8_Sub1_7);
		local34 = this.aClass166_3.anInt4504;
		local3.glUseProgramObjectARB(local34);
		local3.glUniform1iARB(local3.glGetUniformLocation(local34, "baseTex"), 0);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.00390625F, 0.0F, 0.0F);
		local3.glBegin(GL.GL_QUADS);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		this.aClass228_4.method5796(0);
		this.aClass19_Sub1_41.method848(this.aClass8_Sub1_6);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.0F, 0.00390625F, 0.0F);
		local3.glBegin(GL.GL_QUADS);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		local3.glPopAttrib();
		local3.glPopMatrix();
		local3.glMatrixMode(GL.GL_MODELVIEW);
		this.aClass19_Sub1_41.method830(this.aClass228_4);
		local39 = this.aClass166_1.anInt4504;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static377.aFloat78, Static377.aFloat79, 0.0F);
		this.aClass19_Sub1_41.method832(1);
		this.aClass19_Sub1_41.method848(this.aClass8_Sub1_7);
		this.aClass19_Sub1_41.method832(0);
		this.aClass19_Sub1_41.method848(arg1);
	}
}
