import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class1_Sub25_Sub1 extends Class1_Sub25 {

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
	private int anInt4549;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!cf;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Lclient!eq;")
	private Class44_Sub1 aClass44_Sub1_6;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!cf;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Lclient!kq;")
	private Class114 aClass114_3;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!cf;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
	private int anInt4550;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
	private int anInt4551;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "Lclient!cf;")
	private Class32 aClass32_4;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "[Lclient!eq;")
	private Class44_Sub1[] aClass44_Sub1Array2;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "Lclient!eq;")
	private Class44_Sub1 aClass44_Sub1_7;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Lclient!kq;")
	private Class114 aClass114_4;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
	private int anInt4552;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class1_Sub25_Sub1(@OriginalArg(0) Class40_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "()Z")
	public boolean method3937() {
		return this.aClass40_Sub2_28.aBoolean214 && this.aClass40_Sub2_28.aBoolean211 && this.aClass40_Sub2_28.aBoolean229;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "()V")
	@Override
	public void method3929() {
		this.aClass114_4 = null;
		this.aClass44_Sub1Array2 = null;
		this.aClass114_3 = null;
		this.aClass44_Sub1_6 = null;
		this.aClass44_Sub1_7 = null;
		this.aClass32_2 = null;
		this.aClass32_4 = null;
		this.aClass32_3 = null;
		this.aClass32_1 = null;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
	@Override
	public void method3936(@OriginalArg(0) int arg0) {
		this.aClass40_Sub2_28.anOpengl1.glUseProgramObjectARB(0);
		this.aClass40_Sub2_28.method2815(1);
		this.aClass40_Sub2_28.method2882(null);
		this.aClass40_Sub2_28.method2815(0);
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "()I")
	@Override
	public int method3932() {
		return 1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()Z")
	@Override
	public boolean method3928() {
		return this.aClass114_3 != null;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "()Z")
	@Override
	public boolean method3931() {
		if (!this.aClass40_Sub2_28.aBoolean214 || !this.aClass40_Sub2_28.aBoolean211 || !this.aClass40_Sub2_28.aBoolean229) {
			return false;
		}
		this.aClass114_3 = new Class114(this.aClass40_Sub2_28);
		this.aClass44_Sub1_6 = new Class44_Sub1(this.aClass40_Sub2_28, 3553, 34842, 256, 256);
		this.aClass44_Sub1_6.method4162(false, false);
		this.aClass44_Sub1_7 = new Class44_Sub1(this.aClass40_Sub2_28, 3553, 34842, 256, 256);
		this.aClass44_Sub1_7.method4162(false, false);
		this.aClass40_Sub2_28.method2848(this.aClass114_3);
		this.aClass114_3.method3426(0, this.aClass44_Sub1_6);
		this.aClass114_3.method3426(1, this.aClass44_Sub1_7);
		this.aClass114_3.method3420(0);
		if (!this.aClass114_3.method3424()) {
			this.aClass40_Sub2_28.method2874(this.aClass114_3);
			return false;
		}
		this.aClass40_Sub2_28.method2874(this.aClass114_3);
		this.aClass32_2 = Static33.method832(this.aClass40_Sub2_28, new Class80[] { Static106.method2194(this.aClass40_Sub2_28, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass32_4 = Static33.method832(this.aClass40_Sub2_28, new Class80[] { Static106.method2194(this.aClass40_Sub2_28, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass32_3 = Static33.method832(this.aClass40_Sub2_28, new Class80[] { Static106.method2194(this.aClass40_Sub2_28, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass32_1 = Static33.method832(this.aClass40_Sub2_28, new Class80[] { Static106.method2194(this.aClass40_Sub2_28, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass32_4 != null && this.aClass32_2 != null && this.aClass32_3 != null && this.aClass32_1 != null;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
	@Override
	public void method3934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4551 = arg0;
		this.anInt4550 = arg1;
		@Pc(10) int local10 = Static229.method4360(this.anInt4551);
		@Pc(15) int local15 = Static229.method4360(this.anInt4550);
		if (this.anInt4552 == local10 && this.anInt4549 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass44_Sub1Array2 != null) {
			for (local28 = 0; local28 < this.aClass44_Sub1Array2.length; local28++) {
				this.aClass44_Sub1Array2[local28].method5451();
			}
			this.aClass44_Sub1Array2 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass114_4 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass114_4 == null) {
						this.aClass114_4 = new Class114(this.aClass40_Sub2_28);
					}
					this.aClass44_Sub1Array2 = new Class44_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass44_Sub1Array2[local55++] = new Class44_Sub1(this.aClass40_Sub2_28, 3553, 34842, local28, local53);
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
		this.anInt4552 = local10;
		this.anInt4549 = local15;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!eq;Lclient!eq;)V")
	@Override
	public void method3935(@OriginalArg(0) int arg0, @OriginalArg(1) Class44_Sub1 arg1, @OriginalArg(2) Class44_Sub1 arg2) {
		@Pc(3) opengl local3 = this.aClass40_Sub2_28.anOpengl1;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass44_Sub1Array2 == null) {
			this.aClass40_Sub2_28.method2882(arg1);
			this.aClass40_Sub2_28.method2848(this.aClass114_3);
			this.aClass114_3.method3420(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass32_2.anInt1058;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static198.aFloat56, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt4551, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt4551, (float) this.anInt4550);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt4550);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass40_Sub2_28.method2848(this.aClass114_4);
			local34 = Static229.method4360(this.anInt4551);
			local39 = Static229.method4360(this.anInt4550);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass114_4.method3426(0, this.aClass44_Sub1Array2[local41]);
				if (local41 == 0) {
					this.aClass40_Sub2_28.method2882(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt4551, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt4551, (float) this.anInt4550);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt4550);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass40_Sub2_28.method2882(this.aClass44_Sub1Array2[local41 - 1]);
					local3.glBegin(7);
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
			this.aClass40_Sub2_28.method2874(this.aClass114_4);
			this.aClass40_Sub2_28.method2882(this.aClass44_Sub1Array2[local41 - 1]);
			this.aClass40_Sub2_28.method2848(this.aClass114_3);
			this.aClass114_3.method3420(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass32_4.anInt1058;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static198.aFloat56, 0.0F, 0.0F);
			local3.glBegin(7);
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
		this.aClass114_3.method3420(1);
		this.aClass40_Sub2_28.method2882(this.aClass44_Sub1_6);
		local34 = this.aClass32_1.anInt1058;
		local3.glUseProgramObjectARB(local34);
		local3.glUniform1iARB(local3.glGetUniformLocation(local34, "baseTex"), 0);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.00390625F, 0.0F, 0.0F);
		local3.glBegin(7);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		this.aClass114_3.method3420(0);
		this.aClass40_Sub2_28.method2882(this.aClass44_Sub1_7);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.0F, 0.00390625F, 0.0F);
		local3.glBegin(7);
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
		local3.glMatrixMode(5888);
		this.aClass40_Sub2_28.method2874(this.aClass114_3);
		local39 = this.aClass32_3.anInt1058;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static198.aFloat57, Static198.aFloat58, 0.0F);
		this.aClass40_Sub2_28.method2815(1);
		this.aClass40_Sub2_28.method2882(this.aClass44_Sub1_6);
		this.aClass40_Sub2_28.method2815(0);
		this.aClass40_Sub2_28.method2882(arg1);
	}
}
