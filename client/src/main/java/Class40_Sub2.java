import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class40_Sub2 extends Class40 implements Interface5 {

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "Lclient!gq;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
	private int anInt3194;

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
	public int anInt3195;

	@OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
	public int anInt3196;

	@OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
	public int anInt3199;

	@OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
	public int anInt3200;

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
	public int anInt3201;

	@OriginalMember(owner = "client!ih", name = "cb", descriptor = "Lclient!kf;")
	private Class94_Sub1 aClass94_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "eb", descriptor = "I")
	private int anInt3203;

	@OriginalMember(owner = "client!ih", name = "gb", descriptor = "Z")
	private boolean aBoolean209;

	@OriginalMember(owner = "client!ih", name = "ib", descriptor = "Lclient!eq;")
	public Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "jb", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!ih", name = "kb", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!ih", name = "nb", descriptor = "Z")
	public boolean aBoolean211;

	@OriginalMember(owner = "client!ih", name = "ob", descriptor = "Lclient!hk;")
	public Class86_Sub1 aClass86_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "pb", descriptor = "Z")
	private boolean aBoolean212;

	@OriginalMember(owner = "client!ih", name = "qb", descriptor = "Z")
	private boolean aBoolean213;

	@OriginalMember(owner = "client!ih", name = "tb", descriptor = "I")
	public int anInt3206;

	@OriginalMember(owner = "client!ih", name = "ub", descriptor = "I")
	private int anInt3207;

	@OriginalMember(owner = "client!ih", name = "xb", descriptor = "[Lclient!dg;")
	private Class44[] aClass44Array1;

	@OriginalMember(owner = "client!ih", name = "yb", descriptor = "I")
	private int anInt3209;

	@OriginalMember(owner = "client!ih", name = "zb", descriptor = "Ljava/lang/String;")
	private String aString114;

	@OriginalMember(owner = "client!ih", name = "Cb", descriptor = "Z")
	public boolean aBoolean216;

	@OriginalMember(owner = "client!ih", name = "Db", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!ih", name = "Eb", descriptor = "Z")
	public boolean aBoolean217;

	@OriginalMember(owner = "client!ih", name = "Fb", descriptor = "F")
	private float aFloat30;

	@OriginalMember(owner = "client!ih", name = "Ib", descriptor = "I")
	private int anInt3212;

	@OriginalMember(owner = "client!ih", name = "Jb", descriptor = "I")
	public int anInt3213;

	@OriginalMember(owner = "client!ih", name = "Nb", descriptor = "F")
	private float aFloat31;

	@OriginalMember(owner = "client!ih", name = "Pb", descriptor = "Lclient!da;")
	public Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "Qb", descriptor = "Lclient!hk;")
	public Class86_Sub1 aClass86_Sub1_2;

	@OriginalMember(owner = "client!ih", name = "Tb", descriptor = "Lclient!kq;")
	public Class114 aClass114_1;

	@OriginalMember(owner = "client!ih", name = "Ub", descriptor = "Lclient!hk;")
	public Class86_Sub1 aClass86_Sub1_3;

	@OriginalMember(owner = "client!ih", name = "Vb", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!ih", name = "Wb", descriptor = "Z")
	private boolean aBoolean218;

	@OriginalMember(owner = "client!ih", name = "ac", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!ih", name = "cc", descriptor = "Z")
	public boolean aBoolean220;

	@OriginalMember(owner = "client!ih", name = "gc", descriptor = "Z")
	private boolean aBoolean221;

	@OriginalMember(owner = "client!ih", name = "hc", descriptor = "Lclient!hk;")
	public Class86_Sub1 aClass86_Sub1_4;

	@OriginalMember(owner = "client!ih", name = "ic", descriptor = "Lclient!hk;")
	public Class86_Sub1 aClass86_Sub1_5;

	@OriginalMember(owner = "client!ih", name = "jc", descriptor = "Z")
	private boolean aBoolean222;

	@OriginalMember(owner = "client!ih", name = "kc", descriptor = "I")
	public int anInt3222;

	@OriginalMember(owner = "client!ih", name = "mc", descriptor = "I")
	private int anInt3223;

	@OriginalMember(owner = "client!ih", name = "pc", descriptor = "I")
	private int anInt3224;

	@OriginalMember(owner = "client!ih", name = "rc", descriptor = "Lclient!eq;")
	public Class44_Sub1 aClass44_Sub1_2;

	@OriginalMember(owner = "client!ih", name = "sc", descriptor = "Lclient!hk;")
	public Class86_Sub1 aClass86_Sub1_6;

	@OriginalMember(owner = "client!ih", name = "tc", descriptor = "Z")
	public boolean aBoolean224;

	@OriginalMember(owner = "client!ih", name = "uc", descriptor = "Lclient!da;")
	public Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "client!ih", name = "wc", descriptor = "Z")
	private boolean aBoolean225;

	@OriginalMember(owner = "client!ih", name = "xc", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!ih", name = "zc", descriptor = "Z")
	private boolean aBoolean226;

	@OriginalMember(owner = "client!ih", name = "Bc", descriptor = "Z")
	private boolean aBoolean227;

	@OriginalMember(owner = "client!ih", name = "Cc", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!ih", name = "Dc", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!ih", name = "Fc", descriptor = "Lclient!ns;")
	private Class44_Sub1_Sub1 aClass44_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "Gc", descriptor = "Z")
	public boolean aBoolean228;

	@OriginalMember(owner = "client!ih", name = "Hc", descriptor = "F")
	private float aFloat41;

	@OriginalMember(owner = "client!ih", name = "Jc", descriptor = "Lclient!ir;")
	private Interface7 anInterface7_2;

	@OriginalMember(owner = "client!ih", name = "Kc", descriptor = "I")
	private int anInt3228;

	@OriginalMember(owner = "client!ih", name = "Mc", descriptor = "Z")
	private boolean aBoolean230;

	@OriginalMember(owner = "client!ih", name = "Pc", descriptor = "I")
	private int anInt3230;

	@OriginalMember(owner = "client!ih", name = "Qc", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!ih", name = "Rc", descriptor = "I")
	private int anInt3231;

	@OriginalMember(owner = "client!ih", name = "Tc", descriptor = "Ljava/lang/String;")
	private String aString115;

	@OriginalMember(owner = "client!ih", name = "Uc", descriptor = "Lclient!ir;")
	public Interface7 anInterface7_3;

	@OriginalMember(owner = "client!ih", name = "Vc", descriptor = "Lclient!cj;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!ih", name = "Yc", descriptor = "Lclient!eq;")
	public Class44_Sub1 aClass44_Sub1_3;

	@OriginalMember(owner = "client!ih", name = "Zc", descriptor = "I")
	private int anInt3235;

	@OriginalMember(owner = "client!ih", name = "ad", descriptor = "I")
	private int anInt3236;

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "Lclient!rp;")
	private final Class178 aClass178_1 = new Class178();

	@OriginalMember(owner = "client!ih", name = "G", descriptor = "Lclient!ao;")
	private final Class11 aClass11_6 = new Class11_Sub1();

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
	public final int anInt3193 = 8;

	@OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
	private int anInt3197 = -1;

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
	public final int anInt3198 = 3;

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "[Lclient!gq;")
	private final Interface5[] anInterface5Array1 = new Interface5[4];

	@OriginalMember(owner = "client!ih", name = "L", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "Lclient!mi;")
	private final Class130 aClass130_12 = new Class130();

	@OriginalMember(owner = "client!ih", name = "U", descriptor = "Lclient!mi;")
	private final Class130 aClass130_13 = new Class130();

	@OriginalMember(owner = "client!ih", name = "V", descriptor = "Lclient!mi;")
	private final Class130 aClass130_14 = new Class130();

	@OriginalMember(owner = "client!ih", name = "W", descriptor = "Lclient!mi;")
	private final Class130 aClass130_15 = new Class130();

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "Lclient!mi;")
	private final Class130 aClass130_16 = new Class130();

	@OriginalMember(owner = "client!ih", name = "Y", descriptor = "Lclient!mi;")
	private final Class130 aClass130_17 = new Class130();

	@OriginalMember(owner = "client!ih", name = "Z", descriptor = "Lclient!mi;")
	private final Class130 aClass130_18 = new Class130();

	@OriginalMember(owner = "client!ih", name = "db", descriptor = "I")
	private int anInt3202 = 0;

	@OriginalMember(owner = "client!ih", name = "lb", descriptor = "F")
	public float lb = 3584.0F;

	@OriginalMember(owner = "client!ih", name = "rb", descriptor = "I")
	private int anInt3205 = 0;

	@OriginalMember(owner = "client!ih", name = "hb", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!ih", name = "ab", descriptor = "F")
	public float aFloat25 = -1.0F;

	@OriginalMember(owner = "client!ih", name = "Ob", descriptor = "I")
	public int anInt3215 = 512;

	@OriginalMember(owner = "client!ih", name = "sb", descriptor = "[F")
	private final float[] aFloatArray12 = new float[16];

	@OriginalMember(owner = "client!ih", name = "Rb", descriptor = "I")
	public int anInt3216 = 512;

	@OriginalMember(owner = "client!ih", name = "Kb", descriptor = "[F")
	public final float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!ih", name = "mb", descriptor = "I")
	public int anInt3204 = -1;

	@OriginalMember(owner = "client!ih", name = "Mb", descriptor = "I")
	private int anInt3214 = 0;

	@OriginalMember(owner = "client!ih", name = "fc", descriptor = "F")
	public float aFloat34 = -1.0F;

	@OriginalMember(owner = "client!ih", name = "dc", descriptor = "I")
	public int anInt3220 = -1;

	@OriginalMember(owner = "client!ih", name = "Xb", descriptor = "I")
	private int anInt3218 = 8448;

	@OriginalMember(owner = "client!ih", name = "yc", descriptor = "[F")
	private final float[] aFloatArray15 = new float[4];

	@OriginalMember(owner = "client!ih", name = "Sb", descriptor = "I")
	private int anInt3217 = -1;

	@OriginalMember(owner = "client!ih", name = "Hb", descriptor = "I")
	public int anInt3211 = 0;

	@OriginalMember(owner = "client!ih", name = "lc", descriptor = "F")
	public float aFloat35 = 1.0F;

	@OriginalMember(owner = "client!ih", name = "fb", descriptor = "[F")
	private final float[] aFloatArray11 = new float[4];

	@OriginalMember(owner = "client!ih", name = "Ab", descriptor = "F")
	public float aFloat28 = 1.0F;

	@OriginalMember(owner = "client!ih", name = "vc", descriptor = "I")
	public int anInt3226 = 0;

	@OriginalMember(owner = "client!ih", name = "Lb", descriptor = "[F")
	private final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!ih", name = "Gb", descriptor = "I")
	private int anInt3210 = 0;

	@OriginalMember(owner = "client!ih", name = "Ic", descriptor = "F")
	public float aFloat42 = 3584.0F;

	@OriginalMember(owner = "client!ih", name = "qc", descriptor = "I")
	private int anInt3225 = 0;

	@OriginalMember(owner = "client!ih", name = "Yb", descriptor = "I")
	public int anInt3219 = 50;

	@OriginalMember(owner = "client!ih", name = "nc", descriptor = "F")
	public float aFloat36 = 1.0F;

	@OriginalMember(owner = "client!ih", name = "Nc", descriptor = "F")
	private float aFloat43 = 0.0F;

	@OriginalMember(owner = "client!ih", name = "Sc", descriptor = "I")
	public int anInt3232 = 3584;

	@OriginalMember(owner = "client!ih", name = "Ec", descriptor = "I")
	private int anInt3227 = -1;

	@OriginalMember(owner = "client!ih", name = "Zb", descriptor = "F")
	private float aFloat32 = 1.0F;

	@OriginalMember(owner = "client!ih", name = "Ac", descriptor = "F")
	private float aFloat38 = 1.0F;

	@OriginalMember(owner = "client!ih", name = "Oc", descriptor = "I")
	private int anInt3229 = 0;

	@OriginalMember(owner = "client!ih", name = "vb", descriptor = "I")
	public int anInt3208 = -1;

	@OriginalMember(owner = "client!ih", name = "ec", descriptor = "I")
	private int anInt3221 = 8448;

	@OriginalMember(owner = "client!ih", name = "Xc", descriptor = "I")
	private int anInt3234 = 0;

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas3;

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "Lclient!fl;")
	public final Interface4 anInterface4_5;

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl1;

	@OriginalMember(owner = "client!ih", name = "Wc", descriptor = "I")
	public final int anInt3233;

	@OriginalMember(owner = "client!ih", name = "oc", descriptor = "Z")
	private boolean aBoolean223;

	@OriginalMember(owner = "client!ih", name = "bb", descriptor = "Z")
	public boolean aBoolean208;

	@OriginalMember(owner = "client!ih", name = "Lc", descriptor = "Z")
	public boolean aBoolean229;

	@OriginalMember(owner = "client!ih", name = "Bb", descriptor = "Z")
	public boolean aBoolean215;

	@OriginalMember(owner = "client!ih", name = "bc", descriptor = "Z")
	private boolean aBoolean219;

	@OriginalMember(owner = "client!ih", name = "wb", descriptor = "Z")
	public boolean aBoolean214;

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "Lclient!mc;")
	public final Class128 aClass128_1;

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "Lclient!jc;")
	private final Class97 aClass97_1;

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "Lclient!mm;")
	private final Class131 aClass131_1;

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "Lclient!nb;")
	private final Class1_Sub25_Sub1 aClass1_Sub25_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fl;IILclient!ud;)V")
	public Class40_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class199 arg4) {
		this.aCanvas3 = arg0;
		this.anInterface4_5 = arg1;
		this.anInt3191 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas3.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static295.method5212(1000L);
		}
		this.aCanvas3.setIgnoreRepaint(true);
		try {
			if (Static126.aBoolean206 == null || !Static126.aBoolean206) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static126.aBoolean206 = Boolean.TRUE;
				} else {
					@Pc(220) Class145 local220 = arg4.method5462(this.getClass());
					while (local220.anInt5065 == 0) {
						Static295.method5212(100L);
					}
					if (local220.anInt5065 == 1) {
						Static126.aBoolean206 = Boolean.TRUE;
					}
				}
			}
			if (Static126.aBoolean206 == null || !Static126.aBoolean206) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas3, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method2868();
				this.anOpengl1 = this.aContext1.getGL();
				@Pc(287) int local287 = this.method2823();
				if (local287 != 0) {
					throw new RuntimeException("");
				}
				this.anInt3233 = this.aBoolean216 ? 33639 : 5121;
				@Pc(306) String local306 = this.aString115.toLowerCase();
				@Pc(310) String local310 = this.aString114.toLowerCase();
				if (local310.indexOf("radeon") != -1) {
					@Pc(317) int local317 = 0;
					@Pc(319) boolean local319 = false;
					@Pc(321) boolean local321 = false;
					@Pc(329) String[] local329 = Static355.method3607(local310.replace('/', ' '), ' ');
					for (@Pc(331) int local331 = 0; local331 < local329.length; local331++) {
						@Pc(339) String local339 = local329[local331];
						try {
							if (local339.length() > 0) {
								if (local339.charAt(0) == 'x' && local339.length() >= 3 && Static304.method5337(local339.substring(1, 3))) {
									local339 = local339.substring(1);
									local321 = true;
								}
								if (local339.equals("hd")) {
									local319 = true;
								} else {
									if (local339.startsWith("hd")) {
										local339 = local339.substring(2);
										local319 = true;
									}
									if (local339.length() >= 4 && Static304.method5337(local339.substring(0, 4))) {
										local317 = Static260.method4756(local339.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(403) Exception local403) {
						}
					}
					if (!local321 && !local319) {
						if (local317 >= 7000 && local317 <= 7999) {
							this.aBoolean223 = false;
						}
						if (local317 >= 7000 && local317 <= 9250) {
							this.aBoolean208 = false;
						}
					}
					if (!local319 || local317 < 4000) {
						this.aBoolean229 = false;
					}
					this.aBoolean215 &= this.anOpengl1.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean219 = this.aBoolean223;
				}
				if (local306.contains("intel")) {
					this.aBoolean214 = false;
				}
				if (this.aBoolean223) {
					try {
						@Pc(461) int[] local461 = new int[1];
						this.anOpengl1.glGenBuffersARB(1, local461, 0);
					} catch (@Pc(469) Throwable local469) {
						throw new RuntimeException("", local469);
					}
				}
				this.method2848(this);
				this.method2765();
				this.method2837();
				new Class71(this);
				this.aClass128_1 = new Class128(this, this.anInterface4_5);
				Static239.method4518(true);
				this.aBoolean207 = true;
				this.aClass97_1 = new Class97(this);
				this.aClass131_1 = new Class131(this);
				this.aClass1_Sub25_Sub1_1 = new Class1_Sub25_Sub1(this);
				this.method2816();
				this.anOpengl1.glClear(16640);
				local186 = 0;
				while (true) {
					try {
						this.aContext1.swapBuffers();
						break;
					} catch (@Pc(534) Exception local534) {
						if (local186++ > 5) {
							throw new RuntimeException("");
						}
						Static295.method5212(100L);
					}
				}
				this.anOpengl1.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(553) Throwable local553) {
			local553.printStackTrace();
			this.method2702();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local553);
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "()V")
	@Override
	protected void method2702() {
		if (this.anOpengl1 != null) {
			try {
				this.aClass131_1.method3790();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl1 = null;
		}
		if (this.aContext1 != null) {
			this.method2829();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean207) {
			Static255.method4693(true);
			this.aBoolean207 = false;
		}
	}

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "()Lclient!ao;")
	@Override
	public Class11 method2782() {
		return this.aClass11_6;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!j;Lclient!j;FLclient!j;)Lclient!j;")
	@Override
	public Class94 method2728(@OriginalArg(0) Class94 arg0, @OriginalArg(1) Class94 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class94 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean220 && this.aBoolean214) {
			@Pc(11) Class94_Sub1_Sub1 local11 = null;
			@Pc(14) Class94_Sub1 local14 = (Class94_Sub1) arg0;
			@Pc(17) Class94_Sub1 local17 = (Class94_Sub1) arg1;
			@Pc(21) Class44_Sub3 local21 = local14.method6048();
			@Pc(25) Class44_Sub3 local25 = local17.method6048();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt5999 > local25.anInt5999 ? local21.anInt5999 : local25.anInt5999;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class94_Sub1_Sub1) {
					@Pc(52) Class94_Sub1_Sub1 local52 = (Class94_Sub1_Sub1) arg3;
					if (local52.method4861() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class94_Sub1_Sub1(this, local40);
				}
				local11.method4860(local21, local25, arg2);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ih", name = "M", descriptor = "()V")
	private void method2811() {
		@Pc(15) int local15;
		if (this.aBoolean217) {
			this.anOpengl1.glFogf(2915, 0.0F);
			this.anOpengl1.glFogf(2916, 1.0F);
			local15 = this.anInt3217;
		} else {
			this.aFloat41 = (float) (this.anInt3232 - 256) - this.aFloat43;
			this.aFloat44 = this.aFloat41 - (float) this.anInt3208 * this.aFloat32;
			if (this.aFloat44 < (float) this.anInt3219) {
				this.aFloat44 = this.anInt3219;
			}
			this.anOpengl1.glFogf(2915, this.aFloat44);
			this.anOpengl1.glFogf(2916, this.aFloat41);
			local15 = this.anInt3220;
		}
		Static126.aFloatArray10[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static126.aFloatArray10[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static126.aFloatArray10[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl1.glFogfv(2918, Static126.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(III)V")
	public void method2812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2872();
		this.method2819(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)V")
	@Override
	public synchronized void method2773(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class1_Sub26 local16;
		while (!this.aClass130_13.method3757()) {
			local16 = (Class1_Sub26) this.aClass130_13.method3747();
			Static126.anIntArray236[local1++] = (int) local16.aLong235;
			this.anInt3195 -= local16.anInt4811;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteBuffersARB(local1, Static126.anIntArray236, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteBuffersARB(local1, Static126.anIntArray236, 0);
			local1 = 0;
		}
		while (!this.aClass130_14.method3757()) {
			local16 = (Class1_Sub26) this.aClass130_14.method3747();
			Static126.anIntArray236[local1++] = (int) local16.aLong235;
			this.anInt3201 -= local16.anInt4811;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteTextures(local1, Static126.anIntArray236, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteTextures(local1, Static126.anIntArray236, 0);
			local1 = 0;
		}
		while (!this.aClass130_15.method3757()) {
			local16 = (Class1_Sub26) this.aClass130_15.method3747();
			Static126.anIntArray236[local1++] = local16.anInt4811;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteFramebuffersEXT(local1, Static126.anIntArray236, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteFramebuffersEXT(local1, Static126.anIntArray236, 0);
			local1 = 0;
		}
		while (!this.aClass130_16.method3757()) {
			local16 = (Class1_Sub26) this.aClass130_16.method3747();
			Static126.anIntArray236[local1++] = (int) local16.aLong235;
			this.anInt3194 -= local16.anInt4811;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static126.anIntArray236, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static126.anIntArray236, 0);
			local1 = 0;
		}
		while (!this.aClass130_17.method3757()) {
			local16 = (Class1_Sub26) this.aClass130_17.method3747();
			Static126.anIntArray236[local1++] = (int) local16.aLong235;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteProgramsARB(local1, Static126.anIntArray236, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteProgramsARB(local1, Static126.anIntArray236, 0);
		}
		while (!this.aClass130_12.method3757()) {
			local16 = (Class1_Sub26) this.aClass130_12.method3747();
			this.anOpengl1.glDeleteLists((int) local16.aLong235, local16.anInt4811);
		}
		while (!this.aClass130_18.method3757()) {
			local16 = (Class1_Sub26) this.aClass130_18.method3747();
			this.anOpengl1.glDeleteObjectARB(local16.anInt4811);
		}
		while (!this.aClass130_12.method3757()) {
			local16 = (Class1_Sub26) this.aClass130_12.method3747();
			this.anOpengl1.glDeleteLists((int) local16.aLong235, local16.anInt4811);
		}
		if (this.method2793() > 100663296 && Static325.method5658() > this.aLong97 + 60000L) {
			System.gc();
			this.aLong97 = Static325.method5658();
		}
		this.anInt3200 = local5;
	}

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "()I")
	@Override
	public int method2758() {
		@Pc(2) int local2 = this.anInt3235;
		this.anInt3235 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "()V")
	@Override
	public void method2713() {
		this.method2880(true);
		this.anOpengl1.glClear(256);
	}

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "()V")
	@Override
	public void method2788() {
		this.anInt3210 = 0;
		this.anInt3225 = 0;
		this.anInt3205 = this.anInt3199;
		this.anInt3234 = this.anInt3196;
		this.anOpengl1.glDisable(3089);
		this.method2866();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!cj;)V")
	public void method2813(@OriginalArg(0) Interface2 arg0) {
		if (this.anInterface2_3 != arg0 && this.aBoolean223) {
			this.anOpengl1.glBindBufferARB(34962, arg0.method6093());
			this.anInterface2_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "()V")
	private void method2814() {
		if (this.aBoolean225 && this.aBoolean217 | this.anInt3208 >= 0) {
			this.anOpengl1.glEnable(2912);
		} else {
			this.anOpengl1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "(I)V")
	public void method2815(@OriginalArg(0) int arg0) {
		if (this.anInt3231 != arg0) {
			this.anOpengl1.glActiveTexture(arg0 + 33984);
			this.anInt3231 = arg0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "O", descriptor = "()V")
	private void method2816() {
		this.method2857();
		for (@Pc(7) int local7 = this.anInt3206 - 1; local7 >= 0; local7--) {
			this.method2815(local7);
			this.method2882(null);
			this.anOpengl1.glTexEnvi(8960, 8704, 34160);
		}
		this.method2849(8448, 8448);
		this.method2833(2, 34168, 770);
		this.method2875();
		this.anOpengl1.glEnable(3042);
		this.anOpengl1.glBlendFunc(770, 771);
		this.anInt3224 = 1;
		this.anOpengl1.glEnable(3008);
		this.anOpengl1.glAlphaFunc(516, 0.0F);
		this.aBoolean213 = true;
		this.anOpengl1.glColorMask(true, true, true, true);
		this.aBoolean212 = true;
		this.anInt3203 = 1;
		this.method2873(true);
		this.method2860(true);
		this.method2828(true);
		this.method2880(true);
		this.method2856();
		this.anOpengl1.setSwapInterval(0);
		this.anOpengl1.glShadeModel(7425);
		this.anOpengl1.glClearDepth(1.0F);
		this.anOpengl1.glDepthFunc(515);
		this.anOpengl1.glPolygonMode(1028, 6914);
		this.anOpengl1.glEnable(2884);
		this.anOpengl1.glCullFace(1029);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glColorMaterial(1028, 5634);
		this.anOpengl1.glEnable(2903);
		@Pc(149) float[] local149 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(151) int local151 = 0; local151 < 8; local151++) {
			@Pc(158) int local158 = local151 + 16384;
			this.anOpengl1.glLightfv(local158, 4608, local149, 0);
			this.anOpengl1.glLightf(local158, 4615, 0.0F);
			this.anOpengl1.glLightf(local158, 4616, 0.0F);
		}
		this.anOpengl1.glEnable(16384);
		this.anOpengl1.glEnable(16385);
		this.anOpengl1.glFogf(2914, 0.95F);
		this.anOpengl1.glFogi(2917, 9729);
		this.anOpengl1.glHint(3156, 4353);
		this.anInt3227 = this.anInt3220 = -1;
		this.method2788();
	}

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "()I")
	@Override
	public int method2793() {
		return this.anInt3195 + this.anInt3201 + this.anInt3194;
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(II)V")
	public void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3214 = arg0;
		this.anInt3229 = arg1;
		this.anOpengl1.glViewport(arg0, arg1, this.anInt3199, this.anInt3196);
		this.method2841();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V")
	@Override
	public void method2780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean217) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt3217 = arg1;
		this.anInt3204 = arg2;
		this.method2811();
		this.aClass97_1.method3050(true, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIILclient!sn;II)V")
	@Override
	public void method2770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class142 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class142_Sub2 local2 = (Class142_Sub2) arg5;
		@Pc(5) Class44_Sub1_Sub1 local5 = local2.aClass44_Sub1_Sub1_3;
		this.method2834();
		this.method2882(local2.aClass44_Sub1_Sub1_3);
		this.method2819(1);
		this.method2849(7681, 8448);
		this.method2833(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat60 / (float) local5.anInt4851;
		@Pc(37) float local37 = local5.aFloat61 / (float) local5.anInt4850;
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
		this.method2833(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!cj;")
	public Interface2 method2818(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface2) (this.aBoolean223 ? new Class12_Sub2(this, arg0, arg1, false) : new Class46_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "(I)V")
	public void method2819(@OriginalArg(0) int arg0) {
		if (this.anInt3203 == arg0) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(12) boolean local12;
		@Pc(8) byte local8;
		if (arg0 == 1) {
			local8 = 1;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = 2;
			local10 = true;
			local12 = false;
		} else if (arg0 == 128) {
			local8 = 2;
			local10 = false;
			local12 = true;
		} else if (arg0 == 129) {
			local8 = 3;
			local10 = false;
			local12 = true;
		} else if (arg0 == 130) {
			local8 = 4;
			local10 = true;
			local12 = true;
		} else {
			local8 = 0;
			local10 = true;
			local12 = false;
		}
		if (local10 != this.aBoolean212) {
			this.anOpengl1.glColorMask(local10, local10, local10, true);
			this.aBoolean212 = local10;
		}
		if (local12 != this.aBoolean213) {
			if (local12) {
				this.anOpengl1.glEnable(3008);
			} else {
				this.anOpengl1.glDisable(3008);
			}
			this.aBoolean213 = local12;
		}
		if (local8 != this.anInt3224) {
			if (local8 == 1) {
				this.anOpengl1.glEnable(3042);
				this.anOpengl1.glBlendEquation(32774);
				this.anOpengl1.glBlendFunc(770, 771);
			} else if (local8 == 2) {
				this.anOpengl1.glEnable(3042);
				this.anOpengl1.glBlendEquation(32774);
				this.anOpengl1.glBlendFunc(1, 1);
			} else if (local8 == 3) {
				this.anOpengl1.glEnable(3042);
				this.anOpengl1.glBlendEquation(32778);
				this.anOpengl1.glBlendFunc(1, 1);
			} else if (local8 == 4) {
				this.anOpengl1.glEnable(3042);
				this.anOpengl1.glBlendEquation(32774);
				this.anOpengl1.glBlendFunc(774, 1);
			} else {
				this.anOpengl1.glDisable(3042);
			}
			this.anInt3224 = local8;
		}
		this.anInt3203 = arg0;
		this.anInt3209 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2734(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "()Lclient!gq;")
	public Interface5 method2820() {
		return this.anInterface5_1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!j;)V")
	@Override
	public void method2716(@OriginalArg(0) Class94 arg0) {
		this.aClass94_Sub1_1 = (Class94_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "()V")
	private void method2821() {
		if (this.anInt3228 == 1) {
			return;
		}
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, (double) this.anInt3199, (double) this.anInt3196, 0.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anInt3228 = 1;
		this.anInt3209 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[BIZ)Lclient!ir;")
	public Interface7 method2822(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface7) (this.aBoolean223 && (!arg2 || this.aBoolean219) ? new Class12_Sub1(this, 5123, arg0, arg1, arg2) : new Class46_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!ih", name = "R", descriptor = "()I")
	private int method2823() {
		@Pc(1) int local1 = 0;
		this.aString115 = this.anOpengl1.glGetString(7936);
		this.aString114 = this.anOpengl1.glGetString(7937);
		@Pc(17) String local17 = this.aString115.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl1.glGetString(7938);
		@Pc(53) String[] local53 = Static355.method3607(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static260.method4756(local53[0]);
				@Pc(69) int local69 = Static260.method4756(local53[1]);
				this.anInt3223 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt3223 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpengl1.isExtensionAvailable("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpengl1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(116) int[] local116 = new int[1];
		this.anOpengl1.glGetIntegerv(34018, local116, 0);
		this.anInt3206 = local116[0];
		this.anOpengl1.glGetIntegerv(34929, local116, 0);
		this.anInt3230 = local116[0];
		this.anOpengl1.glGetIntegerv(34930, local116, 0);
		this.anInt3207 = local116[0];
		if (this.anInt3206 < 2 || this.anInt3230 < 2 || this.anInt3207 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean227 = Static313.aString244 != null && Static313.aString244.startsWith("mac");
		this.aBoolean216 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean223 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean222 = this.anOpengl1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean224 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean211 = this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean208 = this.anOpengl1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean215 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean220 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean229 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean228 = false;
		this.aBoolean214 = this.anOpengl1.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "()Z")
	@Override
	public boolean method2719() {
		return this.aClass1_Sub25_Sub1_1.method3933();
	}

	@OriginalMember(owner = "client!ih", name = "S", descriptor = "()V")
	private void method2824() {
		if (this.anInt3228 != 3) {
			this.anInt3228 = 3;
			this.method2863();
			this.method2867();
			this.anInt3209 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "()V")
	private void method2825() {
		if (this.aFloat40 == 0.0F) {
			this.aFloatArray12[10] = this.aFloat30;
			this.aFloatArray12[14] = this.aFloat31;
		} else {
			@Pc(13) float local13 = this.aFloat33 / (this.aFloat40 + this.aFloat33);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat31 * (1.0F - local13) * (1.0F - local13) / this.aFloat40;
			this.aFloatArray12[10] = this.aFloat30 + local32;
			this.aFloatArray12[14] = this.aFloat31 * local17;
		}
		this.method2862();
	}

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "()V")
	@Override
	public void method2795() {
		this.aClass97_1.method3047(false, 0, false);
		this.aBoolean217 = false;
		this.method2811();
		this.method2814();
	}

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "(I)I")
	public int method2826(@OriginalArg(0) int arg0) {
		if (arg0 == 6406 || arg0 == 6409) {
			return 1;
		} else if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408 || arg0 == 34847) {
			return 4;
		} else if (arg0 == 34843) {
			return 6;
		} else if (arg0 == 34842) {
			return 8;
		} else if (arg0 == 6402) {
			return 3;
		} else if (arg0 == 6401) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "()Z")
	@Override
	public boolean method2764() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method2712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method2872();
		this.method2819(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean222) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local23);
		this.anOpengl1.glVertex2f(local16, local23);
		this.anOpengl1.glVertex2f(local16, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean222) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(F)V")
	public void method2827(@OriginalArg(0) float arg0) {
		if (this.aFloat38 != arg0) {
			this.aFloat38 = arg0;
			if (this.anInt3228 == 3) {
				this.method2863();
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ao;)V")
	@Override
	public void method2804(@OriginalArg(0) Class11 arg0) {
		this.aClass11_Sub1_2 = (Class11_Sub1) arg0;
		this.aClass11_Sub1_1.method1259(this.aClass11_Sub1_2);
		if (this.anInt3228 != 1) {
			this.method2867();
		}
	}

	@OriginalMember(owner = "client!ih", name = "J", descriptor = "()Lclient!ao;")
	@Override
	public Class11 method2801() {
		return new Class11_Sub1();
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(Z)V")
	public void method2828(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean230) {
			return;
		}
		if (arg0) {
			this.anOpengl1.glEnable(2929);
		} else {
			this.anOpengl1.glDisable(2929);
		}
		this.aBoolean230 = arg0;
		this.anInt3209 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ih", name = "U", descriptor = "()V")
	private void method2829() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(F)V")
	@Override
	public void method2705(@OriginalArg(0) float arg0) {
		if (this.aFloat37 != arg0) {
			this.aFloat37 = arg0;
			this.method2870();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
	@Override
	public void method2715(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method2749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass44_Sub1_Sub1_1 == null || this.aClass44_Sub1_Sub1_1.anInt4848 < arg2 || this.aClass44_Sub1_Sub1_1.anInt4847 < arg3) {
			this.aClass44_Sub1_Sub1_1 = Static365.method4164(this, arg2, arg6, arg3);
			this.aClass44_Sub1_Sub1_1.method4162(false, false);
			local32 = this.aClass44_Sub1_Sub1_1.aFloat61;
			local36 = this.aClass44_Sub1_Sub1_1.aFloat60;
		} else {
			this.aClass44_Sub1_Sub1_1.method4159(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass44_Sub1_Sub1_1.aFloat61 * (float) arg3 / (float) this.aClass44_Sub1_Sub1_1.anInt4847;
			local36 = this.aClass44_Sub1_Sub1_1.aFloat60 * (float) arg2 / (float) this.aClass44_Sub1_Sub1_1.anInt4848;
		}
		this.method2834();
		this.method2882(this.aClass44_Sub1_Sub1_1);
		this.method2819(arg8);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2851(arg5);
		this.method2849(34165, 34165);
		this.method2833(0, 34166, 768);
		this.method2833(2, 5890, 770);
		this.method2812(0, 34166);
		this.method2812(2, 5890);
		@Pc(129) float local129 = (float) arg0;
		@Pc(132) float local132 = (float) arg1;
		@Pc(137) float local137 = local129 + (float) arg2;
		@Pc(142) float local142 = local132 + (float) arg3;
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(0.0F, 0.0F);
		this.anOpengl1.glVertex2f(local129, local132);
		this.anOpengl1.glTexCoord2f(0.0F, local36);
		this.anOpengl1.glVertex2f(local129, local142);
		this.anOpengl1.glTexCoord2f(local32, local36);
		this.anOpengl1.glVertex2f(local137, local142);
		this.anOpengl1.glTexCoord2f(local32, 0.0F);
		this.anOpengl1.glVertex2f(local137, local132);
		this.anOpengl1.glEnd();
		this.method2833(0, 5890, 768);
		this.method2833(2, 34166, 770);
		this.method2812(0, 5890);
		this.method2812(2, 34166);
	}

	@OriginalMember(owner = "client!ih", name = "V", descriptor = "()V")
	private void method2830() {
		this.anOpengl1.glDepthMask(this.aBoolean218 && this.aBoolean210);
	}

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "()V")
	@Override
	public void method2710() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I")
	@Override
	public int method2747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "()Z")
	@Override
	public boolean method2785() {
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(II)V")
	public synchronized void method2831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub26 local4 = new Class1_Sub26(arg1);
		local4.aLong235 = arg0;
		this.aClass130_15.method3760(local4);
	}

	@OriginalMember(owner = "client!ih", name = "W", descriptor = "()V")
	private void method2832() {
		if (this.aBoolean226 && !this.aBoolean209) {
			this.anOpengl1.glEnable(2896);
		} else {
			this.anOpengl1.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(III)V")
	public void method2833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "()Z")
	@Override
	public boolean method2714() {
		return !this.aBoolean227;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIII)V")
	@Override
	public void method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3211 = arg0;
		this.anInt3226 = arg1;
		this.anInt3216 = arg2;
		this.anInt3215 = arg3;
		@Pc(23) float local23 = (float) (-this.anInt3211 * this.anInt3219) / (float) this.anInt3216;
		@Pc(35) float local35 = (float) (-this.anInt3226 * this.anInt3219) / (float) this.anInt3215;
		@Pc(49) float local49 = (float) ((this.anInt3199 - this.anInt3211) * this.anInt3219) / (float) this.anInt3216;
		@Pc(63) float local63 = (float) ((this.anInt3196 - this.anInt3226) * this.anInt3219) / (float) this.anInt3215;
		this.method2853(local23, local49, -local63, -local35, (float) this.anInt3219, (float) this.anInt3232);
		if (this.anInt3228 != 1) {
			this.method2856();
		}
		this.method2862();
		this.method2866();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2763() {
	}

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "()V")
	public void method2834() {
		if (this.anInt3209 == 2) {
			return;
		}
		this.method2821();
		this.method2873(false);
		this.method2860(false);
		this.method2828(false);
		this.method2880(false);
		this.method2857();
		this.anInt3209 = 2;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)V")
	@Override
	public void method2729(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ih", name = "Y", descriptor = "()V")
	public void method2835() {
		this.anOpengl1.glPopMatrix();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I[BIZ)Lclient!cj;")
	public Interface2 method2836(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface2) (this.aBoolean223 && (!arg3 || this.aBoolean219) ? new Class12_Sub2(this, arg0, arg1, arg2, arg3) : new Class46_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([Lclient!qc;Lclient!ao;[Lclient!np;I)V")
	@Override
	public void method2740(@OriginalArg(0) Class86[] arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class2_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method5539(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([Lclient!qc;Lclient!lc;Lclient!ao;[Lclient!np;I)V")
	@Override
	public void method2778(@OriginalArg(0) Class86[] arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class2_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method2740(arg0, arg2, arg3, arg4);
		this.method2759(arg1);
	}

	@OriginalMember(owner = "client!ih", name = "Z", descriptor = "()V")
	private void method2837() {
		this.aClass11_Sub1_2 = new Class11_Sub1();
		this.aClass11_Sub1_1 = new Class11_Sub1();
		this.aClass44Array1 = new Class44[this.anInt3206];
		this.aClass44_Sub1_2 = new Class44_Sub1(this, 3553, 6408, 1, 1);
		this.aClass44_Sub1_1 = new Class44_Sub1(this, 3553, 6408, 1, 1);
		this.aClass44_Sub1_3 = new Class44_Sub1(this, 3553, 6408, 1, 1);
		this.aClass86_Sub1_5 = new Class86_Sub1(this);
		this.aClass86_Sub1_6 = new Class86_Sub1(this);
		this.aClass86_Sub1_3 = new Class86_Sub1(this);
		this.aClass86_Sub1_2 = new Class86_Sub1(this);
		this.aClass86_Sub1_4 = new Class86_Sub1(this);
		this.aClass86_Sub1_1 = new Class86_Sub1(this);
		this.anInterface7_3 = this.method2822(null, 1024, true);
		if (this.aBoolean214) {
			this.aClass114_1 = new Class114(this);
		}
		this.aClass178_1.method4920(this);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!lc;)V")
	@Override
	public void method2759(@OriginalArg(0) Class117 arg0) {
		this.aClass178_1.method4922(this, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(III)V")
	public void method2838(@OriginalArg(2) int arg0) {
		this.anOpengl1.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(II)V")
	public synchronized void method2839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub26 local4 = new Class1_Sub26(arg1);
		local4.aLong235 = arg0;
		this.aClass130_13.method3760(local4);
	}

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "()Z")
	@Override
	public boolean method2803() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!am;Lclient!am;Lclient!am;Lclient!am;)V")
	public void method2840(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) Class9 arg3) {
		if (arg0 == null) {
			this.anOpengl1.glDisableClientState(32884);
		} else {
			this.anOpengl1.glEnableClientState(32884);
			arg0.method353();
		}
		if (arg1 == null) {
			this.anOpengl1.glDisableClientState(32885);
		} else {
			this.anOpengl1.glEnableClientState(32885);
			arg1.method350();
		}
		if (arg2 == null) {
			this.anOpengl1.glDisableClientState(32886);
		} else {
			this.anOpengl1.glEnableClientState(32886);
			arg2.method352();
		}
		if (arg3 == null) {
			this.anOpengl1.glDisableClientState(32888);
		} else {
			this.anOpengl1.glEnableClientState(32888);
			arg3.method351();
		}
	}

	@OriginalMember(owner = "client!ih", name = "ab", descriptor = "()V")
	private void method2841() {
		if (this.anInt3210 <= this.anInt3205 && this.anInt3225 <= this.anInt3234) {
			this.anOpengl1.glScissor(this.anInt3214 + this.anInt3210, this.anInt3229 + this.anInt3196 - this.anInt3234, this.anInt3205 - this.anInt3210, this.anInt3234 - this.anInt3225);
		} else {
			this.anOpengl1.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "()Z")
	@Override
	public boolean method2741() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "(I)V")
	public synchronized void method2842(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub26 local4 = new Class1_Sub26(arg0);
		this.aClass130_15.method3760(local4);
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "()F")
	@Override
	public float method2706() {
		return this.aFloat33;
	}

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "()I")
	@Override
	public int method2779() {
		@Pc(2) int local2 = this.anInt3236;
		this.anInt3236 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2872();
		this.method2819(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFFF)V")
	public void method2843(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static126.aFloatArray10[0] = arg0;
		Static126.aFloatArray10[1] = arg1;
		Static126.aFloatArray10[2] = arg2;
		Static126.aFloatArray10[3] = arg3;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static126.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "(I)V")
	public synchronized void method2844(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub26 local4 = new Class1_Sub26(arg0);
		this.aClass130_17.method3760(local4);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ir;)V")
	public void method2845(@OriginalArg(0) Interface7 arg0) {
		if (this.anInterface7_2 != arg0 && this.aBoolean223) {
			this.anOpengl1.glBindBufferARB(34963, arg0.method6093());
			this.anInterface7_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)V")
	@Override
	public void method2774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3219 == arg0 && this.anInt3232 == arg1) {
			return;
		}
		this.anInt3219 = arg0;
		this.anInt3232 = arg1;
		this.method2856();
		this.method2862();
		this.method2811();
	}

	@OriginalMember(owner = "client!ih", name = "bb", descriptor = "()V")
	private void method2846() {
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadMatrixf(this.aFloatArray12, 0);
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "()I")
	@Override
	public int method2708() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ir;III)V")
	public void method2847(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2845(arg0);
		arg0.method6095(arg1, arg2);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([I)V")
	@Override
	public void method2772(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3210;
		arg0[1] = this.anInt3225;
		arg0[2] = this.anInt3205;
		arg0[3] = this.anInt3234;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)V")
	@Override
	public void method2756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3220 == arg0 && this.anInt3208 == arg1) {
			return;
		}
		this.anInt3220 = arg0;
		this.anInt3208 = arg1;
		if (!this.aBoolean217) {
			this.method2811();
			this.method2814();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!gq;)V")
	public void method2848(@OriginalArg(0) Interface5 arg0) {
		if (this.anInt3197 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3197 >= 0) {
			this.anInterface5Array1[this.anInt3197].method3416();
		}
		this.anInterface5_1 = this.anInterface5Array1[++this.anInt3197] = arg0;
		this.anInterface5_1.method3417();
	}

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "()V")
	@Override
	public void method2765() {
		this.anInt3199 = this.aCanvas3.getWidth();
		this.anInt3196 = this.aCanvas3.getHeight();
		this.anOpengl1.glViewport(this.anInt3214, this.anInt3229, this.anInt3199, this.anInt3196);
		this.method2856();
		this.method2788();
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "(I)Lclient!qm;")
	@Override
	public Class1_Sub29 method2800() {
		return null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!sn;II)V")
	@Override
	public void method2736(@OriginalArg(1) Class142 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class142_Sub2 local2 = (Class142_Sub2) arg0;
		@Pc(5) Class44_Sub1_Sub1 local5 = local2.aClass44_Sub1_Sub1_3;
		this.method2834();
		this.method2882(local2.aClass44_Sub1_Sub1_3);
		this.method2819(1);
		this.method2849(7681, 8448);
		this.method2833(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat60 / (float) local5.anInt4851;
		@Pc(37) float local37 = local5.aFloat61 / (float) local5.anInt4850;
		this.anOpengl1.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt3210 - arg1), local37 * (float) (this.anInt3225 - arg2));
		this.anOpengl1.glVertex2i(this.anInt3210, this.anInt3225);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt3210 - arg1), local37 * (float) (this.anInt3234 - arg2));
		this.anOpengl1.glVertex2i(this.anInt3210, this.anInt3234);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt3205 - arg1), local37 * (float) (this.anInt3234 - arg2));
		this.anOpengl1.glVertex2i(this.anInt3205, this.anInt3234);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt3205 - arg1), local37 * (float) (this.anInt3225 - arg2));
		this.anOpengl1.glVertex2i(this.anInt3205, this.anInt3225);
		this.anOpengl1.glEnd();
		this.method2833(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(FF)V")
	@Override
	public void method2796(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat33 && arg1 == this.aFloat40) {
			return;
		}
		this.aFloat33 = arg0;
		this.aFloat40 = arg1;
		this.method2825();
		this.method2862();
		if (this.anInt3228 == 3) {
			this.method2863();
		} else if (this.anInt3228 == 2) {
			this.method2846();
		}
	}

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "()V")
	@Override
	public void method2786() {
		if (this.aClass1_Sub25_Sub1_1.method3933()) {
			this.aClass131_1.method3784(this.aClass1_Sub25_Sub1_1);
			this.aClass128_1.method3710();
		}
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "(II)V")
	public void method2849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3231 != 0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt3218 != arg0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anInt3218 = arg0;
			local4 = true;
		}
		if (this.anInt3221 != arg1) {
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			this.anInt3221 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt3209 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "()I")
	@Override
	public int method2709() {
		return 4;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)V")
	public void method2850(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method2878(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "()Z")
	@Override
	public boolean method2767() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2755(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method2710();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
	@Override
	public void method2777() {
		this.aBoolean217 = true;
		this.anInt3217 = 1583160;
		this.anInt3204 = 40;
		this.method2811();
		this.method2814();
		this.aClass97_1.method3047(false, 3, false);
		this.aClass97_1.method3050(true, -1);
	}

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "(I)V")
	public void method2851(@OriginalArg(0) int arg0) {
		Static126.aFloatArray10[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static126.aFloatArray10[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static126.aFloatArray10[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static126.aFloatArray10[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static126.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIIII)V")
	@Override
	protected void method2751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ih", name = "cb", descriptor = "()V")
	public void method2852() {
		if (this.anInt3209 == 4) {
			return;
		}
		this.method2821();
		this.method2873(false);
		this.method2860(false);
		this.method2828(false);
		this.method2880(false);
		this.method2857();
		this.method2819(1);
		this.method2877(1);
		this.anInt3209 = 4;
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
	@Override
	public void method2735(@OriginalArg(0) int arg0) {
		this.method2819(0);
		this.anOpengl1.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl1.glClear(16384);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method2718() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl1.glReadPixels(0, this.anInt3196 - local6, 36, 1, 32993, this.anInt3233, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V")
	@Override
	public void method2731(@OriginalArg(0) int arg0) {
		this.method2829();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFFFFF)V")
	private void method2853(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		@Pc(6) float[] local6 = this.aFloatArray12;
		local6[0] = local3 / (arg1 - arg0);
		local6[1] = 0.0F;
		local6[2] = 0.0F;
		local6[3] = 0.0F;
		local6[4] = 0.0F;
		local6[5] = local3 / (arg3 - arg2);
		local6[6] = 0.0F;
		local6[7] = 0.0F;
		local6[8] = (arg1 + arg0) / (arg1 - arg0);
		local6[9] = (arg3 + arg2) / (arg3 - arg2);
		local6[10] = this.aFloat30 = -(arg5 + arg4) / (arg5 - arg4);
		local6[11] = -1.0F;
		local6[12] = 0.0F;
		local6[13] = 0.0F;
		local6[14] = this.aFloat31 = -(local3 * arg5) / (arg5 - arg4);
		local6[15] = 0.0F;
		this.method2825();
	}

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "()Z")
	@Override
	public boolean method2757() {
		return this.aClass1_Sub25_Sub1_1.method3937();
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIII)V")
	@Override
	public void method2746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass131_1.method3791(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "(I)I")
	public int method2854(@OriginalArg(0) int arg0) {
		if (arg0 == 5121 || arg0 == 5120) {
			return 1;
		} else if (arg0 == 5123 || arg0 == 5122) {
			return 2;
		} else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(FF)V")
	public void method2855(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat32 = arg0;
		this.aFloat43 = arg1;
		if (!this.aBoolean217) {
			this.method2811();
		}
	}

	@OriginalMember(owner = "client!ih", name = "db", descriptor = "()V")
	public void method2856() {
		if (this.anInt3228 != 0) {
			this.anInt3228 = 0;
			this.anInt3209 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "(I)V")
	public void method2857() {
		this.method2850(-2, true);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2790(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static198.aFloat56 = arg0;
		Static198.aFloat58 = arg1;
		Static198.aFloat57 = arg2;
	}

	@OriginalMember(owner = "client!ih", name = "eb", descriptor = "()Lclient!sg;")
	public Class44_Sub3 method2858() {
		return this.aClass94_Sub1_1 == null ? null : this.aClass94_Sub1_1.method6048();
	}

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "()V")
	@Override
	public void method2738() {
	}

	@OriginalMember(owner = "client!ih", name = "fb", descriptor = "()V")
	private void method2859() {
		Static126.aFloatArray10[0] = this.aFloat25 * this.aFloat28;
		Static126.aFloatArray10[1] = this.aFloat25 * this.aFloat36;
		Static126.aFloatArray10[2] = this.aFloat25 * this.aFloat35;
		Static126.aFloatArray10[3] = 1.0F;
		this.anOpengl1.glLightfv(16384, 4609, Static126.aFloatArray10, 0);
		Static126.aFloatArray10[0] = -this.aFloat34 * this.aFloat28;
		Static126.aFloatArray10[1] = -this.aFloat34 * this.aFloat36;
		Static126.aFloatArray10[2] = -this.aFloat34 * this.aFloat35;
		Static126.aFloatArray10[3] = 1.0F;
		this.anOpengl1.glLightfv(16385, 4609, Static126.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)I")
	@Override
	public int method2752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
	@Override
	public void method2733(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(Z)V")
	public void method2860(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean226) {
			this.aBoolean226 = arg0;
			this.method2832();
			this.anInt3209 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "(I)V")
	public synchronized void method2861(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub26 local4 = new Class1_Sub26(arg0);
		this.aClass130_18.method3760(local4);
	}

	@OriginalMember(owner = "client!ih", name = "gb", descriptor = "()V")
	private void method2862() {
		this.aFloat42 = (this.aFloatArray12[14] - (float) this.anInt3232) / this.aFloatArray12[10];
		this.lb = (float) this.anInt3232 - this.aFloat40;
	}

	@OriginalMember(owner = "client!ih", name = "hb", descriptor = "()V")
	private void method2863() {
		@Pc(11) float local11 = (float) -this.anInt3211 * this.aFloat38 / (float) this.anInt3216;
		@Pc(23) float local23 = (float) -this.anInt3226 * this.aFloat38 / (float) this.anInt3215;
		@Pc(37) float local37 = (float) (this.anInt3199 - this.anInt3211) * this.aFloat38 / (float) this.anInt3216;
		@Pc(51) float local51 = (float) (this.anInt3196 - this.anInt3226) * this.aFloat38 / (float) this.anInt3215;
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt3219 - this.aFloat40), (double) ((float) this.anInt3232 - this.aFloat40));
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!qm;)V")
	@Override
	public void method2775(@OriginalArg(0) Class1_Sub29 arg0) {
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method2776(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt3227 != arg0;
		if (local7 || this.aFloat25 != arg1 || this.aFloat34 != arg2) {
			this.anInt3227 = arg0;
			this.aFloat25 = arg1;
			this.aFloat34 = arg2;
			if (local7) {
				this.aFloat28 = (float) (this.anInt3227 & 0xFF0000) / 1.671168E7F;
				this.aFloat36 = (float) (this.anInt3227 & 0xFFFF) / 65535.0F;
				this.aFloat35 = (float) (this.anInt3227 & 0xFF) / 255.0F;
				this.method2870();
			}
			this.method2859();
		}
		if (this.aFloatArray15[0] == arg3 && this.aFloatArray15[1] == arg4 && this.aFloatArray15[2] == arg5) {
			return;
		}
		this.aFloatArray15[0] = arg3;
		this.aFloatArray15[1] = arg4;
		this.aFloatArray15[2] = arg5;
		this.aFloatArray14[0] = -arg3;
		this.aFloatArray14[1] = -arg4;
		this.aFloatArray14[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray13[0] = arg3 * local132;
		this.aFloatArray13[1] = arg4 * local132;
		this.aFloatArray13[2] = arg5 * local132;
		this.aFloatArray11[0] = -this.aFloatArray13[0];
		this.aFloatArray11[1] = -this.aFloatArray13[1];
		this.aFloatArray11[2] = -this.aFloatArray13[2];
		this.method2884();
		this.anInt3213 = (int) (arg3 * 256.0F / arg4);
		this.anInt3222 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ih", name = "ib", descriptor = "()V")
	public void method2864() {
		if (this.anInt3209 == 8) {
			return;
		}
		this.method2883();
		this.method2873(true);
		this.method2828(true);
		this.method2880(true);
		this.method2819(1);
		this.method2877(1);
		this.anInt3209 = 8;
	}

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "(I)I")
	public int method2865(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return 7681;
		} else if (arg0 == 1) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ih", name = "jb", descriptor = "()V")
	private void method2866() {
		this.aFloat39 = this.anInt3210 - this.anInt3211;
		this.aFloat29 = this.anInt3205 - this.anInt3211;
		this.aFloat27 = this.anInt3225 - this.anInt3226;
		this.aFloat26 = this.anInt3234 - this.anInt3226;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass11_Sub1_2.aFloat11 * (float) arg0 + this.aClass11_Sub1_2.aFloat14 * (float) arg1 + this.aClass11_Sub1_2.aFloat9 * (float) arg2 + this.aClass11_Sub1_2.aFloat15;
		if (local24 < (float) this.anInt3219 || local24 > (float) this.anInt3232) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt3216 * (this.aClass11_Sub1_2.aFloat12 * (float) arg0 + this.aClass11_Sub1_2.aFloat10 * (float) arg1 + this.aClass11_Sub1_2.aFloat5 * (float) arg2 + this.aClass11_Sub1_2.aFloat16) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt3215 * (this.aClass11_Sub1_2.aFloat6 * (float) arg0 + this.aClass11_Sub1_2.aFloat7 * (float) arg1 + this.aClass11_Sub1_2.aFloat13 * (float) arg2 + this.aClass11_Sub1_2.aFloat8) / local24);
		if ((float) local81 >= this.aFloat39 && (float) local81 <= this.aFloat29 && (float) local113 >= this.aFloat27 && (float) local113 <= this.aFloat26) {
			arg3[0] = (int) ((float) local81 - this.aFloat39);
			arg3[1] = (int) ((float) local113 - this.aFloat27);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ih", name = "kb", descriptor = "()V")
	private void method2867() {
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl1.glMultMatrixf(this.aClass11_Sub1_2.method1258(), 0);
		this.method2884();
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(IIIIII)Z")
	@Override
	public boolean method2753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass11_Sub1_2.aFloat11 * (float) arg0 + this.aClass11_Sub1_2.aFloat14 * (float) arg1 + this.aClass11_Sub1_2.aFloat9 * (float) arg2 + this.aClass11_Sub1_2.aFloat15;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass11_Sub1_2.aFloat11 * (float) arg3 + this.aClass11_Sub1_2.aFloat14 * (float) arg4 + this.aClass11_Sub1_2.aFloat9 * (float) arg5 + this.aClass11_Sub1_2.aFloat15;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt3219 && local55 < (float) this.anInt3219 || !(!(local24 > (float) this.anInt3232) || !(local55 > (float) this.anInt3232))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt3216 * (this.aClass11_Sub1_2.aFloat12 * (float) arg0 + this.aClass11_Sub1_2.aFloat10 * (float) arg1 + this.aClass11_Sub1_2.aFloat5 * (float) arg2 + this.aClass11_Sub1_2.aFloat16) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt3216 * (this.aClass11_Sub1_2.aFloat12 * (float) arg3 + this.aClass11_Sub1_2.aFloat10 * (float) arg4 + this.aClass11_Sub1_2.aFloat5 * (float) arg5 + this.aClass11_Sub1_2.aFloat16) / local55);
		if ((float) local119 < this.aFloat39 && (float) local151 < this.aFloat39 || (float) local119 > this.aFloat29 && (float) local151 > this.aFloat29) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt3215 * (this.aClass11_Sub1_2.aFloat6 * (float) arg0 + this.aClass11_Sub1_2.aFloat7 * (float) arg1 + this.aClass11_Sub1_2.aFloat13 * (float) arg2 + this.aClass11_Sub1_2.aFloat8) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt3215 * (this.aClass11_Sub1_2.aFloat6 * (float) arg3 + this.aClass11_Sub1_2.aFloat7 * (float) arg4 + this.aClass11_Sub1_2.aFloat13 * (float) arg5 + this.aClass11_Sub1_2.aFloat8) / local55);
			return (!((float) local209 < this.aFloat27) || !((float) local241 < this.aFloat27)) && (!((float) local209 > this.aFloat26) || !((float) local241 > this.aFloat26));
		}
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "()Z")
	@Override
	public boolean method2703() {
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "()Z")
	@Override
	public boolean method2789() {
		return this.aBoolean222;
	}

	@OriginalMember(owner = "client!ih", name = "lb", descriptor = "()V")
	private void method2868() {
		@Pc(1) int local1 = 0;
		while (true) {
			try {
				if (this.aContext1.makeCurrent()) {
					return;
				}
			} catch (@Pc(8) Exception local8) {
			}
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Static295.method5212(1000L);
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(FFF)V")
	private void method2869(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl1.glMatrixMode(5890);
		if (this.aBoolean221) {
			this.anOpengl1.glLoadIdentity();
		}
		this.anOpengl1.glTranslatef(arg0, arg1, arg2);
		this.anOpengl1.glMatrixMode(5888);
		this.aBoolean221 = true;
	}

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "()Z")
	@Override
	public boolean method2730() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[Lclient!fe;)V")
	@Override
	public void method2761(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub9[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class1_Sub9 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static126.aFloatArray9[0] = local8.anInt4580;
			Static126.aFloatArray9[1] = local8.anInt4572;
			Static126.aFloatArray9[2] = local8.anInt4576;
			Static126.aFloatArray9[3] = 1.0F;
			this.anOpengl1.glLightfv(local12, 4611, Static126.aFloatArray9, 0);
			@Pc(44) int local44 = local8.anInt4574;
			@Pc(49) float local49 = local8.aFloat59 / 255.0F;
			Static126.aFloatArray9[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static126.aFloatArray9[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static126.aFloatArray9[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl1.glLightfv(local12, 4609, Static126.aFloatArray9, 0);
			this.anOpengl1.glLightf(local12, 4617, 1.0F / (float) (local8.anInt4577 * local8.anInt4577));
			this.anOpengl1.glEnable(local12);
		}
		while (local1 < this.anInt3202) {
			this.anOpengl1.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt3202 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "mb", descriptor = "()V")
	private void method2870() {
		Static126.aFloatArray10[0] = this.aFloat37 * this.aFloat28;
		Static126.aFloatArray10[1] = this.aFloat37 * this.aFloat36;
		Static126.aFloatArray10[2] = this.aFloat37 * this.aFloat35;
		Static126.aFloatArray10[3] = 1.0F;
		this.anOpengl1.glLightModelfv(2899, Static126.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[[I[[IIII)Lclient!gm;")
	@Override
	public Class77 method2781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class77_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ih", name = "nb", descriptor = "()V")
	public void method2871() {
		if (this.anInt3209 == 16) {
			return;
		}
		this.method2824();
		this.method2873(true);
		this.method2828(true);
		this.method2880(true);
		this.method2819(1);
		this.method2877(1);
		this.anInt3209 = 16;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIII)V")
	@Override
	public void method2732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt3199) {
			arg2 = this.anInt3199;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt3196) {
			arg3 = this.anInt3196;
		}
		this.anInt3210 = arg0;
		this.anInt3225 = arg1;
		this.anInt3205 = arg2;
		this.anInt3234 = arg3;
		this.anOpengl1.glEnable(3089);
		this.method2866();
		this.method2841();
	}

	@OriginalMember(owner = "client!ih", name = "ob", descriptor = "()V")
	private void method2872() {
		if (this.anInt3209 == 1) {
			return;
		}
		this.method2821();
		this.method2873(false);
		this.method2860(false);
		this.method2828(false);
		this.method2880(false);
		this.method2882(null);
		this.method2857();
		this.method2877(0);
		this.anInt3209 = 1;
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(Z)V")
	public void method2873(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean225) {
			this.aBoolean225 = arg0;
			this.method2814();
			this.anInt3209 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([IIIII)Lclient!qa;")
	@Override
	public Class29 method2791(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class29_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Lclient!gq;)V")
	public void method2874(@OriginalArg(0) Interface5 arg0) {
		if (this.anInt3197 < 0 || this.anInterface5Array1[this.anInt3197] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface5Array1[this.anInt3197--] = null;
		arg0.method3416();
		if (this.anInt3197 >= 0) {
			this.anInterface5_1 = this.anInterface5Array1[this.anInt3197];
			this.anInterface5_1.method3417();
		}
	}

	@OriginalMember(owner = "client!ih", name = "pb", descriptor = "()V")
	private void method2875() {
		if (this.aBoolean221) {
			this.anOpengl1.glMatrixMode(5890);
			this.anOpengl1.glLoadIdentity();
			this.anOpengl1.glMatrixMode(5888);
			this.aBoolean221 = false;
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	@Override
	public void method2727(@OriginalArg(0) int arg0) {
		this.method2868();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!qc;Lclient!lc;Lclient!ao;Lclient!np;I)V")
	@Override
	public void method2748(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class2_Sub6 arg3) {
		arg0.method5539(arg2, arg3, 0);
		this.method2759(arg1);
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(IIII)V")
	@Override
	public void method2792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3210 < arg0) {
			this.anInt3210 = arg0;
		}
		if (this.anInt3205 > arg2) {
			this.anInt3205 = arg2;
		}
		if (this.anInt3225 < arg1) {
			this.anInt3225 = arg1;
		}
		if (this.anInt3234 > arg3) {
			this.anInt3234 = arg3;
		}
		this.anOpengl1.glEnable(3089);
		this.method2866();
		this.method2841();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!m;IIII)Lclient!qc;")
	@Override
	public Class86 method2762(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class86_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "()Z")
	@Override
	public boolean method2799() {
		return this.aClass97_1.method3048();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!n;Z)Lclient!qa;")
	@Override
	public Class29 method2722(@OriginalArg(0) Class133 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt4518 * arg0.anInt4515];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray65 == null) {
			for (local15 = 0; local15 < arg0.anInt4515; local15++) {
				for (local21 = 0; local21 < arg0.anInt4518; local21++) {
					@Pc(74) int local74 = arg0.anIntArray321[arg0.aByteArray66[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt4515; local15++) {
				for (local21 = 0; local21 < arg0.anInt4518; local21++) {
					local6[local10++] = arg0.aByteArray65[local8] << 24 | arg0.anIntArray321[arg0.aByteArray66[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class29 local100 = this.method2791(local6, arg0.anInt4518, arg0.anInt4518, arg0.anInt4515);
		local100.method5842(arg0.anInt4519, arg0.anInt4514, arg0.anInt4516, arg0.anInt4517);
		return local100;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V")
	@Override
	public void method2721(@OriginalArg(0) boolean arg0) {
		this.aBoolean210 = arg0;
		this.method2830();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!da;)V")
	public void method2876(@OriginalArg(0) Class11_Sub1 arg0) {
		this.anOpengl1.glPushMatrix();
		this.anOpengl1.glMultMatrixf(arg0.method1258(), 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[I[I)Lclient!sn;")
	@Override
	public Class142 method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static367.method4443(this, arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "G", descriptor = "()V")
	@Override
	public void method2794() {
		@Pc(2) int local2 = this.anInt3210;
		@Pc(5) int local5 = this.anInt3205;
		@Pc(8) int local8 = this.anInt3225;
		@Pc(11) int local11 = this.anInt3234;
		this.method2788();
		this.anOpengl1.glReadBuffer(1028);
		this.anOpengl1.glDrawBuffer(1029);
		this.method2856();
		this.method2873(false);
		this.method2860(false);
		this.method2828(false);
		this.method2880(false);
		this.method2882(null);
		this.method2857();
		this.method2877(0);
		this.method2819(0);
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRasterPos2i(0, 0);
		this.anOpengl1.glCopyPixels(0, 0, this.anInt3199, this.anInt3196, 6144);
		this.anOpengl1.glFlush();
		this.anOpengl1.glReadBuffer(1029);
		this.anOpengl1.glDrawBuffer(1029);
		this.method2732(local2, local8, local5, local11);
	}

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "(I)V")
	public void method2877(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2849(7681, 7681);
		} else if (arg0 == 1) {
			this.method2849(8448, 8448);
		} else if (arg0 == 2) {
			this.method2849(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "()Z")
	@Override
	public boolean method2707() {
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIZ)Lclient!qa;")
	@Override
	public Class29 method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class29_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "()V")
	@Override
	public void method2726() {
		this.aClass131_1.method3787();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZZ)V")
	public void method2878(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt3212) {
			if (arg0 < 0) {
				this.method2875();
				this.method2882(null);
				if (!this.aBoolean217) {
					this.aClass97_1.method3047(arg1, 0, arg2);
				}
			} else {
				@Pc(11) Class44_Sub1 local11 = this.aClass128_1.method3709(arg0);
				@Pc(17) Class50 local17 = this.anInterface4_5.method165(arg0);
				if (local17.aByte19 == 0 && local17.aByte16 == 0) {
					this.method2875();
				} else {
					@Pc(30) int local30 = local17.aBoolean112 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method2869((float) (this.anInt3200 % local34 * local17.aByte19) / (float) local34, (float) (this.anInt3200 % local34 * local17.aByte16) / (float) local34, 0.0F);
				}
				if (this.aBoolean217) {
					this.aClass97_1.method3047(arg1, 3, arg2);
					this.method2882(local11);
				} else {
					this.aClass97_1.method3047(arg1, local17.aByte21, arg2);
					this.aClass97_1.method3050(false, local17.aByte18);
					if (!this.aClass97_1.method3049(local11)) {
						this.method2882(local11);
					}
				}
			}
			this.anInt3212 = arg0;
		}
		this.anInt3209 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "()Z")
	@Override
	public boolean method2760() {
		if (!this.aClass1_Sub25_Sub1_1.method3933()) {
			if (!this.aClass131_1.method3788(this.aClass1_Sub25_Sub1_1)) {
				return false;
			}
			this.aClass128_1.method3710();
		}
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "()F")
	@Override
	public float method2783() {
		return this.aFloat40;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIIIII)Lclient!j;")
	@Override
	public Class94 method2725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean220 ? new Class94_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!fi;[Lclient!n;Z)Lclient!dr;")
	@Override
	public Class30 method2768(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class133[] arg1) {
		return new Class30_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method2771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl1.glLineWidth((float) arg5);
		this.method2724(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "(II)V")
	public synchronized void method2879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub26 local4 = new Class1_Sub26(arg1);
		local4.aLong235 = arg0;
		this.aClass130_14.method3760(local4);
	}

	@OriginalMember(owner = "client!ih", name = "L", descriptor = "()I")
	@Override
	public int method2805() {
		return this.anInt3219;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "()V")
	@Override
	public void method3416() {
	}

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "()Z")
	@Override
	public boolean method2750() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "(Z)V")
	public void method2880(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean218) {
			this.aBoolean218 = arg0;
			this.method2830();
			this.anInt3209 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "(Z)V")
	public void method2881(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean209) {
			this.aBoolean209 = arg0;
			this.method2832();
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "()V")
	@Override
	public void method3417() {
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!dg;)V")
	public void method2882(@OriginalArg(0) Class44 arg0) {
		@Pc(5) Class44 local5 = this.aClass44Array1[this.anInt3231];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl1.glDisable(local5.anInt6479);
			} else {
				if (local5 == null) {
					this.anOpengl1.glEnable(arg0.anInt6479);
				} else if (arg0.anInt6479 != local5.anInt6479) {
					this.anOpengl1.glDisable(local5.anInt6479);
					this.anOpengl1.glEnable(arg0.anInt6479);
				}
				this.anOpengl1.glBindTexture(arg0.anInt6479, arg0.method5449());
			}
			this.aClass44Array1[this.anInt3231] = arg0;
		}
		this.anInt3209 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ih", name = "qb", descriptor = "()V")
	public void method2883() {
		if (this.anInt3228 != 2) {
			this.anInt3228 = 2;
			this.method2846();
			this.method2867();
			this.anInt3209 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method2717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method2872();
		this.method2819(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean222) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local19);
		this.anOpengl1.glVertex2f(local14, local19);
		this.anOpengl1.glVertex2f(local14, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean222) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ih", name = "rb", descriptor = "()V")
	public void method2884() {
		this.anOpengl1.glLightfv(16384, 4611, this.aFloatArray15, 0);
		this.anOpengl1.glLightfv(16385, 4611, this.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method2704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2872();
		this.method2819(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "()I")
	@Override
	public int method3418() {
		return this.anInt3196;
	}
}
