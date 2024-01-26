import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class19_Sub1_Sub2 extends Class19_Sub1 {

	@OriginalMember(owner = "client!tca", name = "si", descriptor = "Z")
	private boolean aBoolean698;

	@OriginalMember(owner = "client!tca", name = "gi", descriptor = "Z")
	private boolean aBoolean699;

	@OriginalMember(owner = "client!tca", name = "Tg", descriptor = "Z")
	private boolean aBoolean700;

	@OriginalMember(owner = "client!tca", name = "ei", descriptor = "Z")
	private boolean aBoolean701;

	@OriginalMember(owner = "client!tca", name = "pi", descriptor = "I")
	private int anInt9275;

	@OriginalMember(owner = "client!tca", name = "sh", descriptor = "J")
	private long aLong279;

	@OriginalMember(owner = "client!tca", name = "zi", descriptor = "Z")
	private boolean aBoolean702;

	@OriginalMember(owner = "client!tca", name = "jh", descriptor = "Lclient!sia;")
	private final Class339 aClass339_60 = new Class339();

	@OriginalMember(owner = "client!tca", name = "oi", descriptor = "Lclient!sia;")
	private final Class339 aClass339_61 = new Class339();

	@OriginalMember(owner = "client!tca", name = "oh", descriptor = "Lclient!sia;")
	private final Class339 aClass339_62 = new Class339();

	@OriginalMember(owner = "client!tca", name = "Gi", descriptor = "Lclient!sia;")
	private final Class339 aClass339_63 = new Class339();

	@OriginalMember(owner = "client!tca", name = "Ji", descriptor = "Lclient!sia;")
	private final Class339 aClass339_64 = new Class339();

	@OriginalMember(owner = "client!tca", name = "ii", descriptor = "Lclient!sia;")
	private final Class339 aClass339_65 = new Class339();

	@OriginalMember(owner = "client!tca", name = "Ng", descriptor = "Lclient!sia;")
	private final Class339 aClass339_66 = new Class339();

	@OriginalMember(owner = "client!tca", name = "ni", descriptor = "[Lclient!gla;")
	private final Class72_Sub1[] aClass72_Sub1Array1 = new Class72_Sub1[16];

	@OriginalMember(owner = "client!tca", name = "Ii", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!tca", name = "Xg", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!tca", name = "Vg", descriptor = "I")
	private final int anInt9276 = 0;

	@OriginalMember(owner = "client!tca", name = "Vh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!tca", name = "Ug", descriptor = "Ljava/lang/String;")
	private final String aString109;

	@OriginalMember(owner = "client!tca", name = "Ni", descriptor = "Ljava/lang/String;")
	private final String aString110;

	@OriginalMember(owner = "client!tca", name = "ui", descriptor = "I")
	private final int anInt9278;

	@OriginalMember(owner = "client!tca", name = "ci", descriptor = "Z")
	public boolean aBoolean704;

	@OriginalMember(owner = "client!tca", name = "bi", descriptor = "Z")
	private boolean aBoolean705;

	@OriginalMember(owner = "client!tca", name = "Qh", descriptor = "Z")
	private final boolean aBoolean706;

	@OriginalMember(owner = "client!tca", name = "Qg", descriptor = "Z")
	public final boolean aBoolean703;

	@OriginalMember(owner = "client!tca", name = "Dh", descriptor = "Z")
	public final boolean aBoolean708;

	@OriginalMember(owner = "client!tca", name = "Kg", descriptor = "Z")
	public final boolean aBoolean707;

	@OriginalMember(owner = "client!tca", name = "Ah", descriptor = "[I")
	public final int[] anIntArray712;

	@OriginalMember(owner = "client!tca", name = "Bi", descriptor = "I")
	public final int anInt9277;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!sb;I)V")
	public Class19_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class330 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.b();
			this.aString109 = OpenGL.glGetString(OpenGL.GL_VENDOR).toLowerCase();
			this.aString110 = OpenGL.glGetString(OpenGL.GL_RENDERER).toLowerCase();
			if (this.aString109.indexOf("microsoft") != -1 || this.aString109.indexOf("brian paul") != -1 || this.aString109.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(114) String local114 = OpenGL.glGetString(OpenGL.GL_VERSION);
			@Pc(122) String[] local122 = Static189.method2861(local114.replace('.', ' '), ' ');
			if (local122.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(140) int local140;
			try {
				@Pc(134) int local134 = Static647.method8473(local122[0]);
				local140 = Static647.method8473(local122[1]);
				this.anInt9278 = local134 * 10 + local140;
			} catch (@Pc(150) NumberFormatException local150) {
				throw new RuntimeException("");
			}
			if (this.anInt9278 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(201) int[] local201 = new int[1];
				OpenGL.glGetIntegerv(OpenGL.GL_MAX_TEXTURE_UNITS, local201, 0);
				super.anInt9184 = local201[0];
				if (super.anInt9184 < 2) {
					throw new RuntimeException("");
				}
				super.anInt9182 = 8;
				this.aBoolean704 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean692 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean705 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean685 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean706 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean696 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean703 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean708 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean707 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray712 = new int[super.anInt9184];
				this.anInt9277 = Stream.b() ? 33639 : 5121;
				if (this.aString110.indexOf("radeon") != -1) {
					local140 = 0;
					@Pc(330) boolean local330 = false;
					@Pc(332) boolean local332 = false;
					@Pc(341) String[] local341 = Static189.method2861(this.aString110.replace('/', ' '), ' ');
					for (@Pc(343) int local343 = 0; local343 < local341.length; local343++) {
						@Pc(348) String local348 = local341[local343];
						try {
							if (local348.length() > 0) {
								if (local348.charAt(0) == 'x' && local348.length() >= 3 && Static467.method6350(local348.substring(1, 3))) {
									local332 = true;
									local348 = local348.substring(1);
								}
								if (local348.equals("hd")) {
									local330 = true;
								} else {
									if (local348.startsWith("hd")) {
										local348 = local348.substring(2);
										local330 = true;
									}
									if (local348.length() >= 4 && Static467.method6350(local348.substring(0, 4))) {
										local140 = Static647.method8473(local348.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(428) Exception local428) {
						}
					}
					if (!local332 && !local330) {
						if (local140 >= 7000 && local140 <= 9250) {
							super.aBoolean696 = false;
						}
						if (local140 >= 7000 && local140 <= 7999) {
							this.aBoolean704 = false;
						}
					}
					this.aBoolean705 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString109.indexOf("intel");
				if (this.aBoolean704) {
					try {
						@Pc(502) int[] local502 = new int[1];
						OpenGL.glGenBuffersARB(1, local502, 0);
					} catch (@Pc(508) Throwable local508) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(514) Throwable local514) {
			local514.printStackTrace();
			this.method7940();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBLclient!hla;Z)V")
	@Override
	protected void method8139(@OriginalArg(0) int arg0, @OriginalArg(2) Class168 arg1) {
		OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, arg0 + OpenGL.GL_SRC0_ALPHA, Static428.method5796(arg1));
		OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, arg0 + OpenGL.GL_OPERAND0_ALPHA, OpenGL.GL_SRC_ALPHA);
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!tca", name = "t", descriptor = "(B)V")
	@Override
	protected void method8150() {
		super.aFloat192 = (float) (super.anInt9167 - super.anInt9185);
		super.aFloat189 = super.aFloat192 - (float) super.anInt9175;
		if ((float) super.anInt9181 > super.aFloat189) {
			super.aFloat189 = (float) super.anInt9181;
		}
		OpenGL.glFogf(OpenGL.GL_FOG_START, super.aFloat189);
		OpenGL.glFogf(OpenGL.GL_FOG_END, super.aFloat192);
		Static337.aFloatArray38[0] = (float) (super.anInt9146 & 0xFF0000) / 1.671168E7F;
		Static337.aFloatArray38[1] = (float) (super.anInt9146 & 0xFF00) / 65280.0F;
		Static337.aFloatArray38[2] = (float) (super.anInt9146 & 0xFF) / 255.0F;
		OpenGL.glFogfv(OpenGL.GL_FOG_COLOR, Static337.aFloatArray38, 0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method8127(@OriginalArg(0) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL2.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BLclient!hw;)V")
	@Override
	public void method8097(@OriginalArg(1) Class172 arg0) {
		if (Static582.aClass172_4 == arg0) {
			OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_S);
			OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_T);
			OpenGL.glDisable(OpenGL.GL_TEXTURE_GEN_R);
			return;
		}
		@Pc(14) int local14 = Static242.method3499(arg0);
		OpenGL.glTexGeni(OpenGL.GL_S, OpenGL.GL_TEXTURE_GEN_MODE, local14);
		OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_S);
		OpenGL.glTexGeni(OpenGL.GL_T, OpenGL.GL_TEXTURE_GEN_MODE, local14);
		OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_T);
		OpenGL.glTexGeni(OpenGL.GL_R, OpenGL.GL_TEXTURE_GEN_MODE, local14);
		OpenGL.glEnable(OpenGL.GL_TEXTURE_GEN_R);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!eba;[BBIII)Lclient!bga;")
	@Override
	public Interface2 method8038(@OriginalArg(0) Class92 arg0, @OriginalArg(1) byte[] arg1) {
		return new Class51_Sub1(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(B)V")
	@Override
	protected void method8084() {
		if (super.aBoolean690 && super.aBoolean683 && super.anInt9175 >= 0) {
			OpenGL.glEnable(OpenGL.GL_FOG);
		} else {
			OpenGL.glDisable(OpenGL.GL_FOG);
		}
	}

	@OriginalMember(owner = "client!tca", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt9276;
	}

	@OriginalMember(owner = "client!tca", name = "C", descriptor = "(B)V")
	private void method8159() {
		if (this.aBoolean702) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass77_6.method2049()) {
			if (!this.aBoolean698) {
				OpenGL.glLoadMatrixf(super.aClass73_Sub1_18.method1891(Static135.aFloatArray56), 0);
				this.aBoolean698 = true;
				this.method8158();
				this.method8049();
			}
			if (super.aBoolean676) {
				this.aBoolean702 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass73_Sub1_15.method1891(Static135.aFloatArray56), 0);
				this.aBoolean702 = true;
			}
		} else if (super.aBoolean676) {
			OpenGL.glLoadIdentity();
			this.aBoolean702 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass73_Sub1_15.method1891(Static135.aFloatArray56), 0);
			this.aBoolean702 = false;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!eca;Lclient!wja;)Lclient!gaa;")
	@Override
	public Interface9 method7988(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Interface26 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(IIZ)V")
	public synchronized void method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class2_Sub38 local20 = new Class2_Sub38(arg0);
		local20.aLong328 = (long) arg1;
		this.aClass339_62.method7711(local20);
	}

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "(II)Lclient!rea;")
	@Override
	protected Class26 method8087(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class26_Sub11(this, super.aClass330_112);
		} else if (arg0 == 4) {
			return new Class26_Sub1(this, super.aClass330_112, super.aClass7_8);
		} else if (arg0 == 8) {
			return new Class26_Sub3(this, super.aClass330_112, super.aClass7_8);
		} else {
			return super.method8087(arg0);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!pu;Lclient!pu;FLclient!pu;)Lclient!pu;")
	@Override
	public Class67 method8007(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class67 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!tca", name = "o", descriptor = "(B)V")
	@Override
	protected void method8037() {
		OpenGL.glViewport(super.anInt9147, super.anInt9155, super.anInt9122, super.anInt9013);
	}

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "(B)V")
	@Override
	protected void method8027() {
		@Pc(9) int local9 = this.anIntArray712[super.anInt9148];
		if (local9 != 0) {
			this.anIntArray712[super.anInt9148] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!tca", name = "h", descriptor = "()V")
	@Override
	public void method7969() {
		if (super.anInt9122 <= 0 && super.anInt9013 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt9154;
		@Pc(19) int local19 = super.anInt9153;
		@Pc(22) int local22 = super.anInt9161;
		@Pc(25) int local25 = super.anInt9165;
		this.la();
		OpenGL.glReadBuffer(OpenGL.GL_FRONT);
		OpenGL.glDrawBuffer(OpenGL.GL_BACK);
		this.method8152();
		this.method8147(false);
		this.method8072(false);
		this.method8123(false);
		this.method8083(false);
		this.method8088((Interface17) null);
		this.method8108(false, -2, false);
		this.method8054(1);
		this.method8053(0);
		OpenGL.glMatrixMode(OpenGL.GL_PROJECTION);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(OpenGL.GL_MODELVIEW);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt9122, super.anInt9013, OpenGL.GL_COLOR);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(OpenGL.GL_BACK);
		OpenGL.glDrawBuffer(OpenGL.GL_BACK);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!tca", name = "B", descriptor = "(I)V")
	@Override
	protected void method8060() {
		if (super.aBoolean679) {
			OpenGL.glEnable(OpenGL.GL_ALPHA_TEST);
		} else {
			OpenGL.glDisable(OpenGL.GL_ALPHA_TEST);
		}
	}

	@OriginalMember(owner = "client!tca", name = "S", descriptor = "(I)V")
	@Override
	protected void method8069() {
		this.aBoolean698 = false;
		this.method8159();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZB)Lclient!ri;")
	@Override
	public Interface20 method8122(@OriginalArg(0) boolean arg0) {
		return new Class72_Sub2(this, Static702.aClass397_17, arg0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(II[IIIZI)Lclient!og;")
	@Override
	public Interface18 method8143(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean706 || Static700.method9150(arg0) && Static700.method9150(arg5)) {
			return new Class51_Sub4(this, arg0, arg5, arg4, arg1, 0, arg3);
		} else if (this.aBoolean705) {
			return new Class51_Sub3(this, arg0, arg5, arg1, 0, arg3);
		} else {
			@Pc(64) Class51_Sub4 local64 = new Class51_Sub4(this, Static172.aClass92_8, Static702.aClass397_16, Static440.method5962(arg0), Static440.method5962(arg5));
			local64.method9048(arg1, 0, 0, arg5, arg0, arg3);
			return local64;
		}
	}

	@OriginalMember(owner = "client!tca", name = "v", descriptor = "()V")
	@Override
	public void method7943() {
	}

	@OriginalMember(owner = "client!tca", name = "Y", descriptor = "(I)V")
	@Override
	protected void method8085() {
		OpenGL.glActiveTexture(super.anInt9148 + OpenGL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7977(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub38 local19;
		while (!this.aClass339_61.method7702()) {
			local19 = (Class2_Sub38) this.aClass339_61.method7705();
			Static382.anIntArray465[local7++] = (int) local19.aLong328;
			super.anInt9141 -= local19.anInt6379;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static382.anIntArray465, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static382.anIntArray465, 0);
			local7 = 0;
		}
		while (!this.aClass339_62.method7702()) {
			local19 = (Class2_Sub38) this.aClass339_62.method7705();
			Static382.anIntArray465[local7++] = (int) local19.aLong328;
			super.anInt9145 -= local19.anInt6379;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static382.anIntArray465, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static382.anIntArray465, 0);
			local7 = 0;
		}
		while (!this.aClass339_63.method7702()) {
			local19 = (Class2_Sub38) this.aClass339_63.method7705();
			Static382.anIntArray465[local7++] = local19.anInt6379;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static382.anIntArray465, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static382.anIntArray465, 0);
			local7 = 0;
		}
		while (!this.aClass339_64.method7702()) {
			local19 = (Class2_Sub38) this.aClass339_64.method7705();
			Static382.anIntArray465[local7++] = (int) local19.aLong328;
			super.anInt9143 -= local19.anInt6379;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static382.anIntArray465, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static382.anIntArray465, 0);
		}
		while (!this.aClass339_60.method7702()) {
			local19 = (Class2_Sub38) this.aClass339_60.method7705();
			OpenGL.glDeleteLists((int) local19.aLong328, local19.anInt6379);
		}
		@Pc(227) Class2 local227;
		while (!this.aClass339_65.method7702()) {
			local227 = this.aClass339_65.method7705();
			OpenGL.glDeleteProgramARB((int) local227.aLong328);
		}
		while (!this.aClass339_66.method7702()) {
			local227 = this.aClass339_66.method7705();
			OpenGL.glDeleteObjectARB(local227.aLong328);
		}
		while (!this.aClass339_60.method7702()) {
			local19 = (Class2_Sub38) this.aClass339_60.method7705();
			OpenGL.glDeleteLists((int) local19.aLong328, local19.anInt6379);
		}
		if (this.E() > 100663296 && this.aLong279 + 60000L < Static588.method7715()) {
			System.gc();
			this.aLong279 = Static588.method7715();
		}
		super.method7977(local11);
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(B)V")
	@Override
	protected void method8136() {
		this.method8159();
	}

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "(II)V")
	public synchronized void method8162(@OriginalArg(0) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong328 = (long) arg0;
		this.aClass339_65.method7711(local7);
	}

	@OriginalMember(owner = "client!tca", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(OpenGL.GL_COLOR_BUFFER_BIT);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IB)V")
	@Override
	public void method8055(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tca", name = "m", descriptor = "()Z")
	@Override
	public boolean method7970() {
		return false;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method8051(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL2.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!tca", name = "N", descriptor = "(I)V")
	@Override
	protected void method8076() {
		OpenGL.glScissor(super.anInt9154 + super.anInt9147, super.anInt9155 + super.anInt9013 - super.anInt9165, super.anInt9153 - super.anInt9154, super.anInt9165 + -super.anInt9161);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B[Lclient!mc;)Lclient!mk;")
	@Override
	public Class244 method8148(@OriginalArg(1) Class237[] arg0) {
		return new Class244_Sub1(arg0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8011(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7975(arg2, arg3);
	}

	@OriginalMember(owner = "client!tca", name = "v", descriptor = "(B)V")
	@Override
	protected void method8045() {
		if (super.aBoolean689) {
			OpenGL.glEnable(OpenGL.GL_BLEND);
		} else {
			OpenGL.glDisable(OpenGL.GL_BLEND);
		}
	}

	@OriginalMember(owner = "client!tca", name = "I", descriptor = "(I)V")
	@Override
	protected void method8110() {
		OpenGL.glMatrixMode(OpenGL.GL_PROJECTION);
		OpenGL.glLoadMatrixf(super.aFloatArray63, 0);
		OpenGL.glMatrixMode(OpenGL.GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(Z)V")
	@Override
	protected void method8030() {
		OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, OpenGL.GL_COMBINE_ALPHA, Static488.method6521(super.aClass121Array5[super.anInt9148]));
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZ)Lclient!mg;")
	@Override
	public Interface16 method8156(@OriginalArg(1) boolean arg0) {
		return new Class72_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "(Z)V")
	@Override
	protected void method8129() {
		Static337.aFloatArray38[1] = super.aFloat186 * super.aFloat184;
		Static337.aFloatArray38[0] = super.aFloat186 * super.aFloat191;
		Static337.aFloatArray38[2] = super.aFloat186 * super.aFloat195;
		Static337.aFloatArray38[3] = 1.0F;
		OpenGL.glLightModelfv(OpenGL.GL_LIGHT_MODEL_AMBIENT, Static337.aFloatArray38, 0);
	}

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "(II)V")
	@Override
	public void method7975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!tca", name = "p", descriptor = "(I)V")
	@Override
	protected void method8113() {
		Static337.aFloatArray38[3] = (float) (super.anInt9157 >>> 24) / 255.0F;
		Static337.aFloatArray38[0] = (float) (super.anInt9157 & 0xFF0000) / 1.671168E7F;
		Static337.aFloatArray38[2] = (float) (super.anInt9157 & 0xFF) / 255.0F;
		Static337.aFloatArray38[1] = (float) (super.anInt9157 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(OpenGL.GL_TEXTURE_ENV, OpenGL.GL_TEXTURE_ENV_COLOR, Static337.aFloatArray38, 0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IILclient!mg;)V")
	@Override
	public void method8130(@OriginalArg(0) int arg0, @OriginalArg(2) Interface16 arg1) {
		this.aClass72_Sub1Array1[arg0] = (Class72_Sub1) arg1;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(Z)V")
	@Override
	public void method8018(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tca", name = "l", descriptor = "(Z)V")
	@Override
	protected void method8065() {
		Static337.aFloatArray38[0] = super.aFloat191 * super.aFloat181;
		Static337.aFloatArray38[3] = 1.0F;
		Static337.aFloatArray38[1] = super.aFloat184 * super.aFloat181;
		Static337.aFloatArray38[2] = super.aFloat181 * super.aFloat195;
		OpenGL.glLightfv(OpenGL.GL_LIGHT0, OpenGL.GL_DIFFUSE, Static337.aFloatArray38, 0);
		Static337.aFloatArray38[1] = super.aFloat184 * -super.aFloat180;
		Static337.aFloatArray38[3] = 1.0F;
		Static337.aFloatArray38[0] = -super.aFloat180 * super.aFloat191;
		Static337.aFloatArray38[2] = super.aFloat195 * -super.aFloat180;
		OpenGL.glLightfv(OpenGL.GL_LIGHT1, OpenGL.GL_DIFFUSE, Static337.aFloatArray38, 0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BII)V")
	public synchronized void method8164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub38 local13 = new Class2_Sub38(arg1);
		local13.aLong328 = (long) arg0;
		this.aClass339_61.method7711(local13);
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "()V")
	@Override
	public void method7974() {
	}

	@OriginalMember(owner = "client!tca", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IJ)V")
	public synchronized void method8165(@OriginalArg(1) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong328 = arg0;
		this.aClass339_66.method7711(local7);
	}

	@OriginalMember(owner = "client!tca", name = "j", descriptor = "()V")
	@Override
	public void method7950() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!eba;Lclient!wda;I)Z")
	@Override
	public boolean method8071(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class397 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!mk;I)V")
	@Override
	public void method8114(@OriginalArg(0) Class244 arg0) {
		@Pc(9) Class237[] local9 = ((Class244_Sub1) arg0).aClass237Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(24) int local24 = 0; local24 < local9.length; local24++) {
			@Pc(30) Class237 local30 = local9[local24];
			@Pc(35) Class72_Sub1 local35 = this.aClass72_Sub1Array1[local24];
			@Pc(37) int local37 = 0;
			@Pc(41) int local41 = local35.method3156();
			@Pc(45) long local45 = local35.method8539();
			local35.method8542();
			for (@Pc(50) int local50 = 0; local50 < local30.method5443(); local50++) {
				@Pc(57) Class157 local57 = local30.method5445(local50);
				if (local57 == Static231.aClass157_1) {
					local17 = true;
					OpenGL.glVertexPointer(3, OpenGL.GL_FLOAT, local41, (long) local37 + local45);
				} else if (local57 == Static231.aClass157_2) {
					OpenGL.glNormalPointer(OpenGL.GL_FLOAT, local41, (long) local37 + local45);
					local15 = true;
				} else if (Static231.aClass157_3 == local57) {
					OpenGL.glColorPointer(4, OpenGL.GL_UNSIGNED_BYTE, local41, local45 + (long) local37);
					local13 = true;
				} else if (Static231.aClass157_4 == local57) {
					OpenGL.glClientActiveTexture(local11++ + OpenGL.GL_TEXTURE0);
					OpenGL.glTexCoordPointer(1, OpenGL.GL_FLOAT, local41, local45 + (long) local37);
				} else if (Static231.aClass157_5 == local57) {
					OpenGL.glClientActiveTexture(local11++ + OpenGL.GL_TEXTURE0);
					OpenGL.glTexCoordPointer(2, OpenGL.GL_FLOAT, local41, local45 + (long) local37);
				} else if (local57 == Static231.aClass157_6) {
					OpenGL.glClientActiveTexture(local11++ + OpenGL.GL_TEXTURE0);
					OpenGL.glTexCoordPointer(3, OpenGL.GL_FLOAT, local41, local45 + (long) local37);
				} else if (local57 == Static231.aClass157_7) {
					OpenGL.glClientActiveTexture(local11++ + OpenGL.GL_TEXTURE0);
					OpenGL.glTexCoordPointer(4, OpenGL.GL_FLOAT, local41, local45 + (long) local37);
				}
				local37 += local57.anInt3732;
			}
		}
		if (this.aBoolean699 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(OpenGL.GL_VERTEX_ARRAY);
			} else {
				OpenGL.glDisableClientState(OpenGL.GL_VERTEX_ARRAY);
			}
			this.aBoolean699 = local17;
		}
		if (local15 != this.aBoolean701) {
			if (local15) {
				OpenGL.glEnableClientState(OpenGL.GL_NORMAL_ARRAY);
			} else {
				OpenGL.glDisableClientState(OpenGL.GL_NORMAL_ARRAY);
			}
			this.aBoolean701 = local15;
		}
		if (this.aBoolean700 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(OpenGL.GL_COLOR_ARRAY);
			} else {
				OpenGL.glDisableClientState(OpenGL.GL_COLOR_ARRAY);
			}
			this.aBoolean700 = local13;
		}
		@Pc(302) int local302;
		if (this.anInt9275 < local11) {
			for (local302 = this.anInt9275; local302 < local11; local302++) {
				OpenGL.glClientActiveTexture(local302 + OpenGL.GL_TEXTURE0);
				OpenGL.glEnableClientState(OpenGL.GL_TEXTURE_COORD_ARRAY);
			}
			this.anInt9275 = local11;
		} else if (local11 < this.anInt9275) {
			for (local302 = local11; local302 < this.anInt9275; local302++) {
				OpenGL.glClientActiveTexture(local302 + OpenGL.GL_TEXTURE0);
				OpenGL.glDisableClientState(OpenGL.GL_TEXTURE_COORD_ARRAY);
			}
			this.anInt9275 = local11;
		}
	}

	@OriginalMember(owner = "client!tca", name = "m", descriptor = "(B)V")
	@Override
	protected void method8089() {
		if (super.aBoolean684) {
			OpenGL.glEnable(OpenGL.GL_LIGHT0);
			OpenGL.glEnable(OpenGL.GL_LIGHT1);
		} else {
			OpenGL.glDisable(OpenGL.GL_LIGHT0);
			OpenGL.glDisable(OpenGL.GL_LIGHT1);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7993(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!tca", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8083(true);
		OpenGL.glClear(OpenGL.GL_DEPTH_BUFFER_BIT);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!eba;ZIIB[FII)Lclient!og;")
	@Override
	protected Interface18 method8098(@OriginalArg(0) Class92 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(5) float[] arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean706 || Static700.method9150(arg4) && Static700.method9150(arg2)) {
			return new Class51_Sub4(this, arg0, arg4, arg2, arg1, arg3, 0, 0);
		} else if (this.aBoolean705) {
			return new Class51_Sub3(this, arg0, arg4, arg2, arg3, 0, 0);
		} else {
			@Pc(58) Class51_Sub4 local58 = new Class51_Sub4(this, arg0, Static702.aClass397_20, Static440.method5962(arg4), Static440.method5962(arg2));
			local58.method8651(arg0, arg2, arg3, arg4);
			return local58;
		}
	}

	@OriginalMember(owner = "client!tca", name = "w", descriptor = "()Z")
	@Override
	public boolean method8014() {
		return false;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(ZB)V")
	@Override
	public void method8141(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(OpenGL.GL_MULTISAMPLE);
		} else {
			OpenGL.glDisable(OpenGL.GL_MULTISAMPLE);
		}
	}

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "(Z)V")
	@Override
	protected void method8102() {
		for (@Pc(6) int local6 = super.anInt9184 - 1; local6 >= 0; local6--) {
			OpenGL.glActiveTexture(local6 + OpenGL.GL_TEXTURE0);
			OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, OpenGL.GL_TEXTURE_ENV_MODE, OpenGL.GL_COMBINE);
			OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, OpenGL.GL_COMBINE_RGB, OpenGL.GL_MODULATE);
			OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, OpenGL.GL_SRC2_RGB, OpenGL.GL_CONSTANT);
			OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, OpenGL.GL_COMBINE_ALPHA, OpenGL.GL_MODULATE);
			OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, OpenGL.GL_SRC2_ALPHA, OpenGL.GL_CONSTANT);
		}
		OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, OpenGL.GL_SRC2_ALPHA, OpenGL.GL_PREVIOUS);
		OpenGL.glShadeModel(OpenGL.GL_SMOOTH);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(OpenGL.GL_LEQUAL);
		OpenGL.glPolygonMode(OpenGL.GL_FRONT, OpenGL.GL_FILL);
		OpenGL.glEnable(OpenGL.GL_CULL_FACE);
		OpenGL.glCullFace(OpenGL.GL_BACK);
		OpenGL.glAlphaFunc(OpenGL.GL_GREATER, 0.0F);
		OpenGL.glMatrixMode(OpenGL.GL_MODELVIEW);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(OpenGL.GL_FRONT, OpenGL.GL_AMBIENT_AND_DIFFUSE);
		OpenGL.glEnable(OpenGL.GL_COLOR_MATERIAL);
		@Pc(79) float[] local79 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(81) int local81 = 0; local81 < 8; local81++) {
			@Pc(91) int local91 = local81 + 16384;
			OpenGL.glLightfv(local91, OpenGL.GL_AMBIENT, local79, 0);
			OpenGL.glLightf(local91, OpenGL.GL_CONSTANT_ATTENUATION, 0.0F);
			OpenGL.glLightf(local91, OpenGL.GL_LINEAR_ATTENUATION, 0.0F);
		}
		OpenGL.glFogf(OpenGL.GL_FOG_DENSITY, 0.95F);
		OpenGL.glFogi(OpenGL.GL_FOG_MODE, OpenGL.GL_LINEAR);
		OpenGL.glHint(OpenGL.GL_FOG_HINT, OpenGL.GL_FASTEST);
		this.anOpenGL2.setSwapInterval(0);
		super.method8102();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!gaa;)V")
	@Override
	public void method7939(@OriginalArg(0) Interface9 arg0) {
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V")
	@Override
	protected void method8116() {
		if (super.aBoolean678) {
			OpenGL.glEnable(OpenGL.GL_DEPTH_TEST);
		} else {
			OpenGL.glDisable(OpenGL.GL_DEPTH_TEST);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!eba;Lclient!wda;III)Lclient!og;")
	@Override
	public Interface18 method8067(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class397 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean706 || Static700.method9150(arg3) && Static700.method9150(arg2)) {
			return new Class51_Sub4(this, arg0, arg1, arg3, arg2);
		} else if (this.aBoolean705) {
			return new Class51_Sub3(this, arg0, arg1, arg3, arg2);
		} else {
			return new Class51_Sub4(this, arg0, arg1, Static440.method5962(arg3), Static440.method5962(arg2));
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!eba;IZIIIZ[B)Lclient!og;")
	@Override
	protected Interface18 method8103(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(7) byte[] arg4) {
		if (this.aBoolean706 || Static700.method9150(arg1) && Static700.method9150(arg3)) {
			return new Class51_Sub4(this, arg0, arg1, arg3, arg2, arg4, 0, 0);
		} else if (this.aBoolean705) {
			return new Class51_Sub3(this, arg0, arg1, arg3, arg4, 0, 0);
		} else {
			@Pc(58) Class51_Sub4 local58 = new Class51_Sub4(this, arg0, Static702.aClass397_16, Static440.method5962(arg1), Static440.method5962(arg3));
			local58.method9051(0, arg3, arg4, arg0, arg1);
			return local58;
		}
	}

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "()V")
	@Override
	public void method7980() {
	}

	@OriginalMember(owner = "client!tca", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt9013 - arg1 - local12 - 1, arg2, 1, OpenGL.GL_BGRA, this.anInt9277, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(II)Lclient!eca;")
	@Override
	public Interface6 method7962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "()Lclient!dp;")
	@Override
	public Class84 method7981() {
		@Pc(7) int local7 = -1;
		if (this.aString109.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString109.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString109.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class84(local7, "OpenGL", this.anInt9278, this.aString110, 0L);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(Z)V")
	@Override
	protected void method8109() {
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(II)Lclient!wja;")
	@Override
	public Interface26 method7986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tca", name = "Z", descriptor = "(I)V")
	@Override
	protected void method8146() {
		OpenGL.glDepthMask(super.aBoolean677 && super.aBoolean686);
	}

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "(B)V")
	@Override
	protected void method8086() {
		OpenGL.glMatrixMode(OpenGL.GL_TEXTURE);
		if (Static215.aClass370_2 == super.aClass370Array3[super.anInt9148]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass73_Sub1Array3[super.anInt9148].method1891(Static135.aFloatArray56), 0);
		}
		OpenGL.glMatrixMode(OpenGL.GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I[[IZI)Lclient!fv;")
	@Override
	public Interface8 method8063(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) boolean arg2) {
		return new Class51_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method8095(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "(I)V")
	@Override
	protected void method8058() {
		if (super.aBoolean697) {
			OpenGL.glEnable(OpenGL.GL_SCISSOR_TEST);
		} else {
			OpenGL.glDisable(OpenGL.GL_SCISSOR_TEST);
		}
	}

	@OriginalMember(owner = "client!tca", name = "U", descriptor = "(I)V")
	@Override
	public void method8158() {
		OpenGL.glLightfv(OpenGL.GL_LIGHT0, OpenGL.GL_POSITION, super.aFloatArray60, 0);
		OpenGL.glLightfv(OpenGL.GL_LIGHT1, OpenGL.GL_POSITION, super.aFloatArray61, 0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!hla;BZZI)V")
	@Override
	public void method8125(@OriginalArg(0) Class168 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, arg3 + OpenGL.GL_SRC0_RGB, Static428.method5796(arg0));
		if (arg1) {
			OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, arg3 + OpenGL.GL_OPERAND0_RGB, arg2 ? OpenGL.GL_ONE_MINUS_SRC_ALPHA : OpenGL.GL_SRC_ALPHA);
		} else {
			OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, arg3 + OpenGL.GL_OPERAND0_RGB, arg2 ? OpenGL.GL_ONE_MINUS_SRC_COLOR : OpenGL.GL_SRC_COLOR);
		}
	}

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "()V")
	@Override
	protected void method7987() {
		super.method7987();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.a();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!tca", name = "h", descriptor = "(Z)V")
	@Override
	protected void method8039() {
		OpenGL.glTexEnvi(OpenGL.GL_TEXTURE_ENV, OpenGL.GL_COMBINE_RGB, Static488.method6521(super.aClass121Array6[super.anInt9148]));
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!fma;III)V")
	@Override
	public void method8079(@OriginalArg(0) Class131 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) byte local18;
		@Pc(22) int local22;
		if (Static437.aClass131_4 == arg0) {
			local18 = 1;
			local22 = arg2 * 2;
		} else if (arg0 == Static495.aClass131_5) {
			local18 = 3;
			local22 = arg2 + 1;
		} else if (Static104.aClass131_2 == arg0) {
			local18 = 4;
			local22 = arg2 * 3;
		} else if (arg0 == Static694.aClass131_6) {
			local18 = 6;
			local22 = arg2 + 2;
		} else if (arg0 == Static105.aClass131_3) {
			local22 = arg2 + 2;
			local18 = 5;
		} else {
			local18 = 0;
			local22 = arg2;
		}
		OpenGL.glDrawArrays(local18, arg1, local22);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!wda;Lclient!eba;B)Z")
	@Override
	public boolean method8153(@OriginalArg(0) Class397 arg0, @OriginalArg(1) Class92 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!tca", name = "D", descriptor = "(I)F")
	@Override
	protected float method8155() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBILclient!ri;ILclient!fma;I)V")
	@Override
	public void method8052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface20 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class131 arg4, @OriginalArg(6) int arg5) {
		@Pc(21) byte local21;
		@Pc(19) int local19;
		if (arg4 == Static437.aClass131_4) {
			local19 = arg5 * 2;
			local21 = 1;
		} else if (Static495.aClass131_5 == arg4) {
			local21 = 3;
			local19 = arg5 + 1;
		} else if (Static104.aClass131_2 == arg4) {
			local21 = 4;
			local19 = arg5 * 3;
		} else if (Static694.aClass131_6 == arg4) {
			local21 = 6;
			local19 = arg5 + 2;
		} else if (Static105.aClass131_3 == arg4) {
			local19 = arg5 + 2;
			local21 = 5;
		} else {
			local19 = arg5;
			local21 = 0;
		}
		@Pc(83) Class397 local83 = arg2.method8548();
		@Pc(86) Class72_Sub2 local86 = (Class72_Sub2) arg2;
		local86.method8542();
		OpenGL.glDrawElements(local21, local19, Static248.method3526(local83), local86.method8539() + (long) (arg1 * local83.anInt10568));
	}

	@OriginalMember(owner = "client!tca", name = "M", descriptor = "(I)V")
	@Override
	protected void method8049() {
		this.method8096();
		@Pc(18) int local18;
		for (local18 = 0; super.anInt9177 > local18; local18++) {
			@Pc(25) Class2_Sub7 local25 = super.aClass2_Sub7Array6[local18];
			@Pc(29) int local29 = local25.method8431();
			@Pc(34) int local34 = local18 + 16386;
			@Pc(40) float local40 = local25.method8428() / 255.0F;
			Static337.aFloatArray38[0] = (float) local25.method8426();
			Static337.aFloatArray38[1] = (float) local25.method8425();
			Static337.aFloatArray38[2] = (float) local25.method8429();
			Static337.aFloatArray38[3] = 1.0F;
			OpenGL.glLightfv(local34, OpenGL.GL_POSITION, Static337.aFloatArray38, 0);
			Static337.aFloatArray38[1] = (float) (local29 >> 8 & 0xFF) * local40;
			Static337.aFloatArray38[0] = (float) (local29 >> 16 & 0xFF) * local40;
			Static337.aFloatArray38[2] = local40 * (float) (local29 & 0xFF);
			Static337.aFloatArray38[3] = 1.0F;
			OpenGL.glLightfv(local34, OpenGL.GL_DIFFUSE, Static337.aFloatArray38, 0);
			OpenGL.glLightf(local34, OpenGL.GL_QUADRATIC_ATTENUATION, 1.0F / (float) (local25.method8432() * local25.method8432()));
			OpenGL.glEnable(local34);
		}
		while (super.anInt9176 > local18) {
			OpenGL.glDisable(local18 + OpenGL.GL_LIGHT2);
			local18++;
		}
		super.method8049();
	}

	@OriginalMember(owner = "client!tca", name = "s", descriptor = "(I)V")
	@Override
	protected void method8078() {
		if (super.aBoolean691 && !super.aBoolean680) {
			OpenGL.glEnable(OpenGL.GL_LIGHTING);
		} else {
			OpenGL.glDisable(OpenGL.GL_LIGHTING);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method8041(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!tca", name = "v", descriptor = "(I)V")
	@Override
	protected void method8035() {
		if (super.aClass38_7 == Static80.aClass38_2) {
			OpenGL.glBlendFunc(OpenGL.GL_SRC_ALPHA, OpenGL.GL_ONE_MINUS_SRC_ALPHA);
		} else if (super.aClass38_7 == Static217.aClass38_3) {
			OpenGL.glBlendFunc(OpenGL.GL_ONE, OpenGL.GL_ONE);
		} else if (super.aClass38_7 == Static355.aClass38_5) {
			OpenGL.glBlendFunc(OpenGL.GL_DST_COLOR, OpenGL.GL_ONE);
		}
	}
}
