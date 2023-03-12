import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class19_Sub1 extends Class19 implements Interface8 {

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "Lclient!mf;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
	public int anInt581;

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
	public int anInt582;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
	public int anInt584;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
	public int anInt585;

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
	private int anInt586;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
	public int anInt587;

	@OriginalMember(owner = "client!bf", name = "ab", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
	private int anInt588;

	@OriginalMember(owner = "client!bf", name = "cb", descriptor = "Z")
	private boolean aBoolean33;

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "F")
	public float aFloat3;

	@OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
	private int anInt589;

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "F")
	public float aFloat5;

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "Lclient!mu;")
	public Class14_Sub2 aClass14_Sub2_1;

	@OriginalMember(owner = "client!bf", name = "jb", descriptor = "Z")
	private boolean aBoolean34;

	@OriginalMember(owner = "client!bf", name = "kb", descriptor = "Lclient!mp;")
	public GlModel aClass31_Sub2_1;

	@OriginalMember(owner = "client!bf", name = "mb", descriptor = "F")
	public float aFloat7;

	@OriginalMember(owner = "client!bf", name = "nb", descriptor = "I")
	public int anInt591;

	@OriginalMember(owner = "client!bf", name = "qb", descriptor = "Lclient!ua;")
	public Class228 aClass228_1;

	@OriginalMember(owner = "client!bf", name = "rb", descriptor = "Z")
	public boolean aBoolean35;

	@OriginalMember(owner = "client!bf", name = "vb", descriptor = "[Lclient!kq;")
	private Class8[] aClass8Array1;

	@OriginalMember(owner = "client!bf", name = "zb", descriptor = "Z")
	public boolean arbTextureCubeMapSupported;

	@OriginalMember(owner = "client!bf", name = "Bb", descriptor = "I")
	public int anInt597;

	@OriginalMember(owner = "client!bf", name = "Cb", descriptor = "Lclient!mp;")
	public GlModel aClass31_Sub2_2;

	@OriginalMember(owner = "client!bf", name = "Db", descriptor = "I")
	private int anInt598;

	@OriginalMember(owner = "client!bf", name = "Eb", descriptor = "Z")
	private boolean aBoolean39;

	@OriginalMember(owner = "client!bf", name = "Fb", descriptor = "I")
	public int anInt599;

	@OriginalMember(owner = "client!bf", name = "Gb", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!bf", name = "Ib", descriptor = "Lclient!mp;")
	public GlModel aClass31_Sub2_3;

	@OriginalMember(owner = "client!bf", name = "Kb", descriptor = "Lclient!al;")
	public Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "Mb", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!bf", name = "Nb", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!bf", name = "Ob", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!bf", name = "Qb", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!bf", name = "Rb", descriptor = "I")
	private int anInt603;

	@OriginalMember(owner = "client!bf", name = "Sb", descriptor = "Z")
	public boolean aBoolean40;

	@OriginalMember(owner = "client!bf", name = "Tb", descriptor = "Lclient!ln;")
	private Class8_Sub1_Sub1 aClass8_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "Vb", descriptor = "Z")
	private boolean aBoolean42;

	@OriginalMember(owner = "client!bf", name = "Wb", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!bf", name = "Yb", descriptor = "Lclient!mu;")
	public Class14_Sub2 aClass14_Sub2_2;

	@OriginalMember(owner = "client!bf", name = "ac", descriptor = "I")
	private int anInt604;

	@OriginalMember(owner = "client!bf", name = "bc", descriptor = "Z")
	private boolean aBoolean44;

	@OriginalMember(owner = "client!bf", name = "cc", descriptor = "Z")
	public boolean aBoolean45;

	@OriginalMember(owner = "client!bf", name = "dc", descriptor = "I")
	private int anInt605;

	@OriginalMember(owner = "client!bf", name = "ec", descriptor = "Z")
	private boolean aBoolean46;

	@OriginalMember(owner = "client!bf", name = "fc", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!bf", name = "gc", descriptor = "F")
	private float aFloat14;

	@OriginalMember(owner = "client!bf", name = "hc", descriptor = "Lclient!fd;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!bf", name = "jc", descriptor = "Lclient!mp;")
	public GlModel aClass31_Sub2_4;

	@OriginalMember(owner = "client!bf", name = "mc", descriptor = "Z")
	private boolean aBoolean47;

	@OriginalMember(owner = "client!bf", name = "nc", descriptor = "Z")
	private boolean aBoolean48;

	@OriginalMember(owner = "client!bf", name = "oc", descriptor = "F")
	private float aFloat17;

	@OriginalMember(owner = "client!bf", name = "qc", descriptor = "Lclient!fg;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!bf", name = "sc", descriptor = "Z")
	public boolean aBoolean50;

	@OriginalMember(owner = "client!bf", name = "vc", descriptor = "Lclient!mp;")
	public GlModel aClass31_Sub2_5;

	@OriginalMember(owner = "client!bf", name = "wc", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!bf", name = "Ac", descriptor = "Z")
	private boolean aBoolean52;

	@OriginalMember(owner = "client!bf", name = "Bc", descriptor = "Lclient!al;")
	public Class8_Sub1 aClass8_Sub1_2;

	@OriginalMember(owner = "client!bf", name = "Fc", descriptor = "Z")
	public boolean aBoolean53;

	@OriginalMember(owner = "client!bf", name = "Gc", descriptor = "Lclient!mp;")
	public GlModel aClass31_Sub2_6;

	@OriginalMember(owner = "client!bf", name = "Jc", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!bf", name = "Lc", descriptor = "Lclient!mp;")
	public GlModel aClass31_Sub2_7;

	@OriginalMember(owner = "client!bf", name = "Mc", descriptor = "Z")
	private boolean aBoolean54;

	@OriginalMember(owner = "client!bf", name = "Nc", descriptor = "Lclient!al;")
	public Class8_Sub1 aClass8_Sub1_3;

	@OriginalMember(owner = "client!bf", name = "Tc", descriptor = "Lclient!mp;")
	public GlModel aClass31_Sub2_8;

	@OriginalMember(owner = "client!bf", name = "Uc", descriptor = "Lclient!dl;")
	private Class42_Sub1 aClass42_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "Vc", descriptor = "I")
	private int anInt621;

	@OriginalMember(owner = "client!bf", name = "Wc", descriptor = "I")
	private int anInt622;

	@OriginalMember(owner = "client!bf", name = "Yc", descriptor = "I")
	private int anInt623;

	@OriginalMember(owner = "client!bf", name = "Zc", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "Lclient!lu;")
	private final Class143 aClass143_1 = new Class143();

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "Lclient!on;")
	private final Class14 aClass14_1 = new Class14_Sub2();

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
	private int anInt579 = -1;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
	public final int anInt580 = 8;

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "[Lclient!mf;")
	private final Interface8[] anInterface8Array1 = new Interface8[4];

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
	public final int anInt583 = 3;

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "Lclient!ld;")
	private final LinkedList aClass135_4 = new LinkedList();

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "Lclient!ld;")
	private final LinkedList aClass135_5 = new LinkedList();

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "Lclient!ld;")
	private final LinkedList aClass135_6 = new LinkedList();

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "Lclient!ld;")
	private final LinkedList aClass135_7 = new LinkedList();

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "Lclient!ld;")
	private final LinkedList aClass135_8 = new LinkedList();

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "Lclient!ld;")
	private final LinkedList aClass135_9 = new LinkedList();

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "Lclient!ld;")
	private final LinkedList aClass135_10 = new LinkedList();

	@OriginalMember(owner = "client!bf", name = "Y", descriptor = "[F")
	private final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!bf", name = "Z", descriptor = "[F")
	public final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!bf", name = "ub", descriptor = "I")
	private int anInt595 = 8448;

	@OriginalMember(owner = "client!bf", name = "fb", descriptor = "F")
	public float aFloat4 = 3584.0F;

	@OriginalMember(owner = "client!bf", name = "Ab", descriptor = "F")
	private float aFloat9 = 1.0F;

	@OriginalMember(owner = "client!bf", name = "xb", descriptor = "F")
	public float aFloat8 = -1.0F;

	@OriginalMember(owner = "client!bf", name = "Jb", descriptor = "I")
	public int anInt601 = -1;

	@OriginalMember(owner = "client!bf", name = "ib", descriptor = "I")
	private int anInt590 = 0;

	@OriginalMember(owner = "client!bf", name = "Zb", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!bf", name = "ic", descriptor = "I")
	public int anInt606 = 0;

	@OriginalMember(owner = "client!bf", name = "pc", descriptor = "I")
	private int anInt607 = 0;

	@OriginalMember(owner = "client!bf", name = "tc", descriptor = "F")
	public float aFloat18 = 3584.0F;

	@OriginalMember(owner = "client!bf", name = "Hb", descriptor = "I")
	public int anInt600 = 512;

	@OriginalMember(owner = "client!bf", name = "lb", descriptor = "F")
	public float aFloat6 = 1.0F;

	@OriginalMember(owner = "client!bf", name = "wb", descriptor = "I")
	public int anInt596 = 512;

	@OriginalMember(owner = "client!bf", name = "xc", descriptor = "I")
	public int anInt610 = 0;

	@OriginalMember(owner = "client!bf", name = "Dc", descriptor = "F")
	public float aFloat19 = 1.0F;

	@OriginalMember(owner = "client!bf", name = "Cc", descriptor = "I")
	private int anInt612 = 0;

	@OriginalMember(owner = "client!bf", name = "kc", descriptor = "F")
	private float aFloat15 = 0.0F;

	@OriginalMember(owner = "client!bf", name = "tb", descriptor = "I")
	private int anInt594 = 0;

	@OriginalMember(owner = "client!bf", name = "Lb", descriptor = "[F")
	private final float[] aFloatArray8 = new float[4];

	@OriginalMember(owner = "client!bf", name = "Pc", descriptor = "I")
	public int anInt617 = 50;

	@OriginalMember(owner = "client!bf", name = "Qc", descriptor = "I")
	public int anInt618 = 3584;

	@OriginalMember(owner = "client!bf", name = "Pb", descriptor = "F")
	private float aFloat11 = 1.0F;

	@OriginalMember(owner = "client!bf", name = "Xb", descriptor = "[F")
	private final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!bf", name = "uc", descriptor = "I")
	private int anInt608 = 0;

	@OriginalMember(owner = "client!bf", name = "lc", descriptor = "F")
	public float aFloat16 = -1.0F;

	@OriginalMember(owner = "client!bf", name = "Sc", descriptor = "I")
	public int anInt620 = 0;

	@OriginalMember(owner = "client!bf", name = "zc", descriptor = "I")
	private int anInt611 = -1;

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "F")
	public float aFloat1 = 1.0F;

	@OriginalMember(owner = "client!bf", name = "Oc", descriptor = "I")
	private int anInt616 = -1;

	@OriginalMember(owner = "client!bf", name = "Hc", descriptor = "I")
	public int anInt613 = -1;

	@OriginalMember(owner = "client!bf", name = "Kc", descriptor = "I")
	public int anInt615 = -1;

	@OriginalMember(owner = "client!bf", name = "Rc", descriptor = "I")
	private int anInt619 = 0;

	@OriginalMember(owner = "client!bf", name = "Ec", descriptor = "[F")
	private final float[] aFloatArray10 = new float[16];

	@OriginalMember(owner = "client!bf", name = "Ic", descriptor = "I")
	private int anInt614 = 8448;

	@OriginalMember(owner = "client!bf", name = "pb", descriptor = "I")
	private int anInt593 = 0;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas2;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "Lclient!jaggl/opengl;")
	public opengl gl;

	@OriginalMember(owner = "client!bf", name = "ob", descriptor = "I")
	public final int anInt592;

	@OriginalMember(owner = "client!bf", name = "yb", descriptor = "Z")
	private boolean aBoolean37;

	@OriginalMember(owner = "client!bf", name = "Xc", descriptor = "Z")
	public boolean aBoolean55;

	@OriginalMember(owner = "client!bf", name = "yc", descriptor = "Z")
	public boolean aBoolean51;

	@OriginalMember(owner = "client!bf", name = "Ub", descriptor = "Z")
	public boolean aBoolean41;

	@OriginalMember(owner = "client!bf", name = "rc", descriptor = "Z")
	private boolean aBoolean49;

	@OriginalMember(owner = "client!bf", name = "sb", descriptor = "Z")
	public boolean aBoolean36;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "Lclient!ea;")
	public final Class56 aClass56_1;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "Lclient!hm;")
	private final Class95 aClass95_1;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "Lclient!rd;")
	private final Class200 aClass200_1;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "Lclient!w;")
	private final Class2_Sub38_Sub1 aClass2_Sub38_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ci;IILclient!ml;)V")
	public Class19_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) TextureProvider arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Signlink arg4) {
		super(arg2, arg1);
		this.aCanvas2 = arg0;
		@Pc(185) int local185 = 0;
		while (!this.aCanvas2.isShowing()) {
			if (local185++ > 5) {
				throw new RuntimeException("");
			}
			ThreadUtils.sleep(1000L);
		}
		this.aCanvas2.setIgnoreRepaint(true);
		try {
			if (Static22.aBoolean31 == null || !Static22.aBoolean31) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static22.aBoolean31 = Boolean.TRUE;
				} else {
					@Pc(219) PrivilegedRequest local219 = arg4.loadGlNatives(this.getClass());
					while (local219.status == 0) {
						ThreadUtils.sleep(100L);
					}
					if (local219.status == 1) {
						Static22.aBoolean31 = Boolean.TRUE;
					}
				}
			}
			if (Static22.aBoolean31 == null || !Static22.aBoolean31) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas2, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method829();
				this.gl = this.aContext1.getGL();
				@Pc(286) int local286 = this.method789();
				if (local286 != 0) {
					throw new RuntimeException("");
				}
				this.anInt592 = this.aBoolean53 ? 33639 : 5121;
				@Pc(305) String local305 = this.aString7.toLowerCase();
				@Pc(309) String local309 = this.aString8.toLowerCase();
				if (local309.indexOf("radeon") != -1) {
					@Pc(316) int local316 = 0;
					@Pc(318) boolean local318 = false;
					@Pc(320) boolean local320 = false;
					@Pc(328) String[] local328 = Static200.method3643(' ', local309.replace('/', ' '));
					for (@Pc(330) int local330 = 0; local330 < local328.length; local330++) {
						@Pc(338) String local338 = local328[local330];
						try {
							if (local338.length() > 0) {
								if (local338.charAt(0) == 'x' && local338.length() >= 3 && Static132.method2485(local338.substring(1, 3))) {
									local338 = local338.substring(1);
									local320 = true;
								}
								if (local338.equals("hd")) {
									local318 = true;
								} else {
									if (local338.startsWith("hd")) {
										local338 = local338.substring(2);
										local318 = true;
									}
									if (local338.length() >= 4 && Static132.method2485(local338.substring(0, 4))) {
										local316 = Static146.method2698(local338.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(402) Exception local402) {
						}
					}
					if (!local320 && !local318) {
						if (local316 >= 7000 && local316 <= 7999) {
							this.aBoolean37 = false;
						}
						if (local316 >= 7000 && local316 <= 9250) {
							this.aBoolean55 = false;
						}
					}
					if (!local318 || local316 < 4000) {
						this.aBoolean51 = false;
					}
					this.aBoolean41 &= this.gl.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean49 = this.aBoolean37;
				}
				if (local305.contains("intel")) {
					this.aBoolean36 = false;
				}
				if (this.aBoolean37) {
					try {
						@Pc(460) int[] local460 = new int[1];
						this.gl.glGenBuffersARB(1, local460, 0);
					} catch (@Pc(468) Throwable local468) {
						throw new RuntimeException("", local468);
					}
				}
				this.method808(this);
				this.method2803();
				this.method818();
				new Class44(this);
				this.aClass56_1 = new Class56(this, this.anInterface2_5);
				Static280.method4766(true);
				this.aBoolean32 = true;
				this.aClass95_1 = new Class95(this);
				this.aClass200_1 = new Class200(this);
				this.aClass2_Sub38_Sub1_1 = new Class2_Sub38_Sub1(this);
				this.method795();
				this.gl.glClear(GL.GL_DEPTH_BUFFER_BIT | GL.GL_COLOR_BUFFER_BIT);
				local185 = 0;
				while (true) {
					try {
						this.aContext1.swapBuffers();
						break;
					} catch (@Pc(533) Exception local533) {
						if (local185++ > 5) {
							throw new RuntimeException("");
						}
						ThreadUtils.sleep(100L);
					}
				}
				this.gl.glClear(GL.GL_COLOR_BUFFER_BIT);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(552) Throwable local552) {
			local552.printStackTrace();
			this.method2839();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local552);
		}
	}

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "()I")
	@Override
	public int method2875() {
		return this.anInt618;
	}

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "()Z")
	@Override
	public boolean method2859() {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2842(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method2883();
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)I")
	public int method777(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)Lclient!kg;")
	@Override
	public Class2_Sub22 method2876() {
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)I")
	public int method778(@OriginalArg(0) int arg0) {
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
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!on;)V")
	@Override
	public void method2896(@OriginalArg(0) Class14 arg0) {
		this.aClass14_Sub2_2 = (Class14_Sub2) arg0;
		this.aClass14_Sub2_1.method3938(this.aClass14_Sub2_2);
		if (this.anInt588 != 1) {
			this.method810();
		}
	}

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "(I)V")
	public void method779(@OriginalArg(0) int arg0) {
		if (this.anInt604 == arg0) {
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
		if (local10 != this.aBoolean42) {
			this.gl.glColorMask(local10, local10, local10, true);
			this.aBoolean42 = local10;
		}
		if (local12 != this.aBoolean46) {
			if (local12) {
				this.gl.glEnable(GL.GL_ALPHA_TEST);
			} else {
				this.gl.glDisable(GL.GL_ALPHA_TEST);
			}
			this.aBoolean46 = local12;
		}
		if (local8 != this.anInt605) {
			if (local8 == 1) {
				this.gl.glEnable(GL.GL_BLEND);
				this.gl.glBlendEquation(GL.GL_FUNC_ADD);
				this.gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
			} else if (local8 == 2) {
				this.gl.glEnable(GL.GL_BLEND);
				this.gl.glBlendEquation(GL.GL_FUNC_ADD);
				this.gl.glBlendFunc(GL.GL_ONE, GL.GL_ONE);
			} else if (local8 == 3) {
				this.gl.glEnable(GL.GL_BLEND);
				this.gl.glBlendEquation(GL.GL_FUNC_SUBTRACT);
				this.gl.glBlendFunc(GL.GL_ONE, GL.GL_ONE);
			} else if (local8 == 4) {
				this.gl.glEnable(GL.GL_BLEND);
				this.gl.glBlendEquation(GL.GL_FUNC_ADD);
				this.gl.glBlendFunc(GL.GL_DST_COLOR, GL.GL_ONE);
			} else {
				this.gl.glDisable(GL.GL_BLEND);
			}
			this.anInt605 = local8;
		}
		this.anInt604 = arg0;
		this.anInt602 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "(I)V")
	public void method780(@OriginalArg(0) int arg0) {
		Static22.aFloatArray4[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static22.aFloatArray4[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static22.aFloatArray4[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static22.aFloatArray4[3] = (float) (arg0 >>> 24) / 255.0F;
		this.gl.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, Static22.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "()V")
	private void method781() {
		if (this.anInt602 == 1) {
			return;
		}
		this.method788();
		this.method786(false);
		this.method782(false);
		this.method813(false);
		this.method817(false);
		this.method848(null);
		this.method784();
		this.method792(0);
		this.anInt602 = 1;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "()Lclient!on;")
	@Override
	public Class14 method2808() {
		return this.aClass14_1;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(Z)V")
	public void method782(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean54) {
			this.aBoolean54 = arg0;
			this.method797();
			this.anInt602 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!fg;)V")
	public void method783(@OriginalArg(0) Interface5 arg0) {
		if (this.anInterface5_2 != arg0 && this.aBoolean37) {
			this.gl.glBindBufferARB(GL.GL_ARRAY_BUFFER, arg0.method6066());
			this.anInterface5_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "(I)V")
	public void method784() {
		this.method787(-2, true);
	}

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "()V")
	@Override
	public void method2831() {
		if (this.aClass2_Sub38_Sub1_1.method6304()) {
			this.aClass200_1.method5122(this.aClass2_Sub38_Sub1_1);
			this.aClass56_1.method1787();
		}
	}

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "()V")
	@Override
	public void method2882() {
		this.aClass95_1.method2505(false, false, 0);
		this.aBoolean50 = false;
		this.method809();
		this.method837();
	}

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "()V")
	@Override
	public void method2883() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(II)V")
	public synchronized void method785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub39 local4 = new Class2_Sub39(arg1);
		local4.key = arg0;
		this.aClass135_7.addTail(local4);
	}

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "()Z")
	@Override
	public boolean method2847() {
		if (!this.aClass2_Sub38_Sub1_1.method6304()) {
			if (!this.aClass200_1.method5115(this.aClass2_Sub38_Sub1_1)) {
				return false;
			}
			this.aClass56_1.method1787();
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt590 < arg0) {
			this.anInt590 = arg0;
		}
		if (this.anInt608 > arg2) {
			this.anInt608 = arg2;
		}
		if (this.anInt612 < arg1) {
			this.anInt612 = arg1;
		}
		if (this.anInt607 > arg3) {
			this.anInt607 = arg3;
		}
		this.gl.glEnable(GL.GL_SCISSOR_TEST);
		this.method807();
		this.method825();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2853() {
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(Z)V")
	public void method786(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean52) {
			this.aBoolean52 = arg0;
			this.method837();
			this.anInt602 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
	public void method787(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method846(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method2836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method781();
		this.method779(arg5);
		this.gl.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean44) {
			this.gl.glDisable(GL.GL_MULTISAMPLE);
		}
		this.gl.glBegin(GL.GL_LINE_LOOP);
		this.gl.glVertex2f(local4, local9);
		this.gl.glVertex2f(local4, local23);
		this.gl.glVertex2f(local16, local23);
		this.gl.glVertex2f(local16, local9);
		this.gl.glEnd();
		if (this.aBoolean44) {
			this.gl.glEnable(GL.GL_MULTISAMPLE);
		}
	}

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "()V")
	private void method788() {
		if (this.anInt588 == 1) {
			return;
		}
		this.gl.glMatrixMode(GL.GL_PROJECTION);
		this.gl.glLoadIdentity();
		if (this.anInt582 > 0 && this.anInt587 > 0) {
			this.gl.glOrtho(0.0D, (double) this.anInt582, (double) this.anInt587, 0.0D, -1.0D, 1.0D);
		}
		this.gl.glMatrixMode(GL.GL_MODELVIEW);
		this.gl.glLoadIdentity();
		this.anInt588 = 1;
		this.anInt602 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIII)V")
	@Override
	public void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt606 = arg0;
		this.anInt620 = arg1;
		this.anInt596 = arg2;
		this.anInt600 = arg3;
		this.method840();
		this.method807();
		if (this.anInt588 == 3) {
			this.method799();
		} else if (this.anInt588 == 2) {
			this.method823();
		}
	}

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "()I")
	private int method789() {
		@Pc(1) int local1 = 0;
		this.aString7 = this.gl.glGetString(GL.GL_VENDOR);
		this.aString8 = this.gl.glGetString(GL.GL_RENDERER);
		@Pc(17) String local17 = this.aString7.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.gl.glGetString(GL.GL_VERSION);
		@Pc(53) String[] local53 = Static200.method3643(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static146.method2698(local53[0]);
				@Pc(69) int local69 = Static146.method2698(local53[1]);
				this.anInt603 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt603 < 12) {
			local1 |= 0x2;
		}
		if (!this.gl.isExtensionAvailable("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.gl.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(116) int[] local116 = new int[1];
		this.gl.glGetIntegerv(GL.GL_MAX_TEXTURE_UNITS, local116, 0);
		this.anInt597 = local116[0];
		this.gl.glGetIntegerv(GL.GL_MAX_TEXTURE_COORDS, local116, 0);
		this.anInt622 = local116[0];
		this.gl.glGetIntegerv(GL.GL_MAX_TEXTURE_IMAGE_UNITS, local116, 0);
		this.anInt589 = local116[0];
		if (this.anInt597 < 2 || this.anInt622 < 2 || this.anInt589 < 2) {
			local1 |= 0x10;
		}
		if (Signlink.osName != null) {
		}
		this.aBoolean47 = false;
		this.aBoolean53 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean37 = this.gl.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean44 = this.gl.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean40 = this.gl.isExtensionAvailable("GL_ARB_vertex_program");
		this.gl.isExtensionAvailable("GL_ARB_fragment_program");
		this.gl.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean35 = this.gl.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean55 = this.gl.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean41 = this.gl.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.arbTextureCubeMapSupported = this.gl.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean51 = this.gl.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean45 = false;
		this.aBoolean36 = this.gl.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "()I")
	@Override
	public int method2886() {
		return 4;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[Lclient!of;)V")
	@Override
	public void method2834(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub26[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class2_Sub26 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static22.aFloatArray5[0] = local8.anInt4370;
			Static22.aFloatArray5[1] = local8.anInt4368;
			Static22.aFloatArray5[2] = local8.anInt4371;
			Static22.aFloatArray5[3] = 1.0F;
			this.gl.glLightfv(local12, GL.GL_POSITION, Static22.aFloatArray5, 0);
			@Pc(44) int local44 = local8.anInt4372;
			@Pc(49) float local49 = local8.aFloat65 / 255.0F;
			Static22.aFloatArray5[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static22.aFloatArray5[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static22.aFloatArray5[2] = (float) (local44 & 0xFF) * local49;
			this.gl.glLightfv(local12, GL.GL_DIFFUSE, Static22.aFloatArray5, 0);
			this.gl.glLightf(local12, GL.GL_QUADRATIC_ATTENUATION, 1.0F / (float) (local8.anInt4374 * local8.anInt4374));
			this.gl.glEnable(local12);
		}
		while (local1 < this.anInt593) {
			this.gl.glDisable(local1 + GL.GL_LIGHT2);
			local1++;
		}
		this.anInt593 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
	@Override
	public int method2806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!kj;Lclient!kj;Lclient!kj;Lclient!kj;)V")
	public void method790(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Class126 arg3) {
		if (arg0 == null) {
			this.gl.glDisableClientState(GL.GL_VERTEX_ARRAY);
		} else {
			this.gl.glEnableClientState(GL.GL_VERTEX_ARRAY);
			arg0.method3383();
		}
		if (arg1 == null) {
			this.gl.glDisableClientState(GL.GL_NORMAL_ARRAY);
		} else {
			this.gl.glEnableClientState(GL.GL_NORMAL_ARRAY);
			arg1.method3382();
		}
		if (arg2 == null) {
			this.gl.glDisableClientState(GL.GL_COLOR_ARRAY);
		} else {
			this.gl.glEnableClientState(GL.GL_COLOR_ARRAY);
			arg2.method3384();
		}
		if (arg3 == null) {
			this.gl.glDisableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		} else {
			this.gl.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
			arg3.method3385();
		}
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(IIII)V")
	@Override
	public void method2895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt582) {
			arg2 = this.anInt582;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt587) {
			arg3 = this.anInt587;
		}
		this.anInt590 = arg0;
		this.anInt612 = arg1;
		this.anInt608 = arg2;
		this.anInt607 = arg3;
		this.gl.glEnable(GL.GL_SCISSOR_TEST);
		this.method807();
		this.method825();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([IIIII)Lclient!jd;")
	@Override
	public Sprite method2884(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new GlSprite(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "()V")
	public void method791() {
		this.gl.glPopMatrix();
	}

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "(I)V")
	public void method792(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method794(7681, 7681);
		} else if (arg0 == 1) {
			this.method794(8448, 8448);
		} else if (arg0 == 2) {
			this.method794(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIILclient!kf;II)V")
	@Override
	public void method2815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class78 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class78_Sub2 local2 = (Class78_Sub2) arg5;
		@Pc(5) Class8_Sub1_Sub1 local5 = local2.aClass8_Sub1_Sub1_2;
		this.method824();
		this.method848(local2.aClass8_Sub1_Sub1_2);
		this.method779(1);
		this.method794(7681, 8448);
		this.method793(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat42 / (float) local5.anInt3688;
		@Pc(37) float local37 = local5.aFloat43 / (float) local5.anInt3687;
		this.gl.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.gl.glBegin(GL.GL_LINES);
		this.gl.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.gl.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.gl.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.gl.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.gl.glEnd();
		this.method793(0, 5890, 768);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass14_Sub2_2.aFloat52 * (float) arg0 + this.aClass14_Sub2_2.aFloat59 * (float) arg1 + this.aClass14_Sub2_2.aFloat55 * (float) arg2 + this.aClass14_Sub2_2.aFloat60;
		if (local24 < (float) this.anInt617 || local24 > (float) this.anInt618) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt596 * (this.aClass14_Sub2_2.aFloat56 * (float) arg0 + this.aClass14_Sub2_2.aFloat51 * (float) arg1 + this.aClass14_Sub2_2.aFloat58 * (float) arg2 + this.aClass14_Sub2_2.aFloat61) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt600 * (this.aClass14_Sub2_2.aFloat62 * (float) arg0 + this.aClass14_Sub2_2.aFloat53 * (float) arg1 + this.aClass14_Sub2_2.aFloat57 * (float) arg2 + this.aClass14_Sub2_2.aFloat54) / local24);
		if ((float) local81 >= this.aFloat12 && (float) local81 <= this.aFloat10 && (float) local113 >= this.aFloat7 && (float) local113 <= this.aFloat21) {
			arg3[0] = (int) ((float) local81 - this.aFloat12);
			arg3[1] = (int) ((float) local113 - this.aFloat7);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "()V")
	@Override
	public void method2903() {
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "()V")
	@Override
	public void method2803() {
		this.anInt582 = this.aCanvas2.getWidth();
		this.anInt587 = this.aCanvas2.getHeight();
		this.gl.glViewport(this.anInt619, this.anInt594, this.anInt582, this.anInt587);
		this.method806();
		this.method2898();
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(IIII)V")
	@Override
	public void method2880() {
		this.aBoolean50 = true;
		this.anInt611 = 1583160;
		this.anInt615 = 40;
		this.anInt610 = 127;
		this.method809();
		this.method837();
		this.aClass95_1.method2505(false, false, 3);
		this.aClass95_1.method2504(true, -1);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	public void method793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.gl.glTexEnvi(GL.GL_TEXTURE_ENV, arg0 + GL.GL_SRC0_RGB, arg1);
		this.gl.glTexEnvi(GL.GL_TEXTURE_ENV, arg0 + GL.GL_OPERAND0_RGB, arg2);
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "()Z")
	@Override
	public boolean method2805() {
		return this.aClass95_1.method2506();
	}

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "()Z")
	@Override
	public boolean method2813() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!tp;)V")
	@Override
	public void method2833(@OriginalArg(0) Class224 arg0) {
		this.aClass143_1.method3688(this, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(II)V")
	public void method794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt609 != 0) {
			this.gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, arg0);
			this.gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt595 != arg0) {
			this.gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, arg0);
			this.anInt595 = arg0;
			local4 = true;
		}
		if (this.anInt614 != arg1) {
			this.gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, arg1);
			this.anInt614 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt602 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "()Z")
	@Override
	public boolean method2858() {
		return this.aClass2_Sub38_Sub1_1.method6310();
	}

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "()Z")
	@Override
	public boolean method2888() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(FF)V")
	@Override
	public void method2823(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat13 && arg1 == this.aFloat20) {
			return;
		}
		this.aFloat13 = arg0;
		this.aFloat20 = arg1;
		this.method815();
		if (this.anInt588 == 3) {
			this.method799();
		} else if (this.anInt588 == 2) {
			this.method823();
		}
	}

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "()I")
	@Override
	public int method2814() {
		return this.anInt617;
	}

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "()Z")
	@Override
	public boolean method2871() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "()V")
	private void method795() {
		this.method784();
		for (@Pc(7) int local7 = this.anInt597 - 1; local7 >= 0; local7--) {
			this.method832(local7);
			this.method848(null);
			this.gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_COMBINE);
		}
		this.method794(8448, 8448);
		this.method793(2, 34168, 770);
		this.method819();
		this.anInt604 = 1;
		this.gl.glEnable(GL.GL_BLEND);
		this.gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
		this.anInt605 = 1;
		this.gl.glEnable(GL.GL_ALPHA_TEST);
		this.gl.glAlphaFunc(GL.GL_GREATER, 0.0F);
		this.aBoolean46 = true;
		this.gl.glColorMask(true, true, true, true);
		this.aBoolean42 = true;
		this.method786(true);
		this.method782(true);
		this.method813(true);
		this.method817(true);
		this.method806();
		this.gl.setSwapInterval(0);
		this.gl.glShadeModel(GL.GL_SMOOTH);
		this.gl.glClearDepth(1.0F);
		this.gl.glDepthFunc(GL.GL_LEQUAL);
		this.gl.glPolygonMode(GL.GL_FRONT, GL.GL_FILL);
		this.gl.glEnable(GL.GL_CULL_FACE);
		this.gl.glCullFace(GL.GL_BACK);
		this.gl.glMatrixMode(GL.GL_MODELVIEW);
		this.gl.glLoadIdentity();
		this.gl.glColorMaterial(GL.GL_FRONT, GL.GL_AMBIENT_AND_DIFFUSE);
		this.gl.glEnable(GL.GL_COLOR_MATERIAL);
		@Pc(149) float[] local149 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(151) int local151 = 0; local151 < 8; local151++) {
			@Pc(158) int local158 = local151 + 16384;
			this.gl.glLightfv(local158, GL.GL_AMBIENT, local149, 0);
			this.gl.glLightf(local158, GL.GL_CONSTANT_ATTENUATION, 0.0F);
			this.gl.glLightf(local158, GL.GL_LINEAR_ATTENUATION, 0.0F);
		}
		this.gl.glEnable(GL.GL_LIGHT0);
		this.gl.glEnable(GL.GL_LIGHT1);
		this.gl.glFogf(GL.GL_FOG_DENSITY, 0.95F);
		this.gl.glFogi(GL.GL_FOG_MODE, GL.GL_LINEAR);
		this.gl.glHint(GL.GL_FOG_HINT, GL.GL_FASTEST);
		this.anInt616 = this.anInt613 = -1;
		this.method2898();
	}

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "()V")
	private void method796() {
		this.gl.glDepthMask(this.aBoolean39 && this.aBoolean43);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2848(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class2_Sub39 local16;
		while (!this.aClass135_5.method3550()) {
			local16 = (Class2_Sub39) this.aClass135_5.method3549();
			Static22.anIntArray32[local1++] = (int) local16.key;
			this.anInt581 -= local16.anInt6818;
			if (local1 == 1000) {
				this.gl.glDeleteBuffersARB(local1, Static22.anIntArray32, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.gl.glDeleteBuffersARB(local1, Static22.anIntArray32, 0);
			local1 = 0;
		}
		while (!this.aClass135_6.method3550()) {
			local16 = (Class2_Sub39) this.aClass135_6.method3549();
			Static22.anIntArray32[local1++] = (int) local16.key;
			this.anInt585 -= local16.anInt6818;
			if (local1 == 1000) {
				this.gl.glDeleteTextures(local1, Static22.anIntArray32, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.gl.glDeleteTextures(local1, Static22.anIntArray32, 0);
			local1 = 0;
		}
		while (!this.aClass135_7.method3550()) {
			local16 = (Class2_Sub39) this.aClass135_7.method3549();
			Static22.anIntArray32[local1++] = local16.anInt6818;
			if (local1 == 1000) {
				this.gl.glDeleteFramebuffersEXT(local1, Static22.anIntArray32, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.gl.glDeleteFramebuffersEXT(local1, Static22.anIntArray32, 0);
			local1 = 0;
		}
		while (!this.aClass135_8.method3550()) {
			local16 = (Class2_Sub39) this.aClass135_8.method3549();
			Static22.anIntArray32[local1++] = (int) local16.key;
			this.anInt586 -= local16.anInt6818;
			if (local1 == 1000) {
				this.gl.glDeleteRenderbuffersEXT(local1, Static22.anIntArray32, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.gl.glDeleteRenderbuffersEXT(local1, Static22.anIntArray32, 0);
			local1 = 0;
		}
		while (!this.aClass135_9.method3550()) {
			local16 = (Class2_Sub39) this.aClass135_9.method3549();
			Static22.anIntArray32[local1++] = (int) local16.key;
			if (local1 == 1000) {
				this.gl.glDeleteProgramsARB(local1, Static22.anIntArray32, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.gl.glDeleteProgramsARB(local1, Static22.anIntArray32, 0);
		}
		while (!this.aClass135_4.method3550()) {
			local16 = (Class2_Sub39) this.aClass135_4.method3549();
			this.gl.glDeleteLists((int) local16.key, local16.anInt6818);
		}
		while (!this.aClass135_10.method3550()) {
			local16 = (Class2_Sub39) this.aClass135_10.method3549();
			this.gl.glDeleteObjectARB(local16.anInt6818);
		}
		while (!this.aClass135_4.method3550()) {
			local16 = (Class2_Sub39) this.aClass135_4.method3549();
			this.gl.glDeleteLists((int) local16.key, local16.anInt6818);
		}
		if (this.method2899() > 100663296 && MonotonicClock.currentTimeMillis() > this.aLong20 + 60000L) {
			System.gc();
			this.aLong20 = MonotonicClock.currentTimeMillis();
		}
		this.anInt584 = local5;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(IIIIII)V")
	@Override
	public void method2901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method781();
		this.method779(arg5);
		this.gl.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean44) {
			this.gl.glDisable(GL.GL_MULTISAMPLE);
		}
		this.gl.glBegin(GL.GL_QUADS);
		this.gl.glVertex2f(local4, local9);
		this.gl.glVertex2f(local4, local19);
		this.gl.glVertex2f(local14, local19);
		this.gl.glVertex2f(local14, local9);
		this.gl.glEnd();
		if (this.aBoolean44) {
			this.gl.glEnable(GL.GL_MULTISAMPLE);
		}
	}

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "()V")
	private void method797() {
		if (this.aBoolean54 && !this.aBoolean33) {
			this.gl.glEnable(GL.GL_LIGHTING);
		} else {
			this.gl.glDisable(GL.GL_LIGHTING);
		}
	}

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "()V")
	@Override
	public void method2819() {
		this.method817(true);
		this.gl.glClear(GL.GL_DEPTH_BUFFER_BIT);
	}

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "()V")
	@Override
	public void method2898() {
		this.anInt590 = 0;
		this.anInt612 = 0;
		this.anInt608 = this.anInt582;
		this.anInt607 = this.anInt587;
		this.gl.glDisable(GL.GL_SCISSOR_TEST);
		this.method807();
	}

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "()Z")
	@Override
	public boolean method2849() {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "(I)I")
	public int method798(@OriginalArg(0) int arg0) {
		if (arg0 == 5121 || arg0 == 5120) {
			return 1;
		} else if (arg0 == 5123 || arg0 == 5122) {
			return 2;
		} else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "()F")
	@Override
	public float method2802() {
		return this.aFloat13;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.gl.glLineWidth((float) arg5);
		this.method2809(arg0, arg1, arg2, arg3, arg4, 0);
		this.gl.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "()Z")
	@Override
	public boolean method2878() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "()Lclient!on;")
	@Override
	public Class14 method2897() {
		return new Class14_Sub2();
	}

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "()V")
	private void method799() {
		@Pc(11) float local11 = (float) -this.anInt606 * this.aFloat9 / (float) this.anInt596;
		@Pc(23) float local23 = (float) -this.anInt620 * this.aFloat9 / (float) this.anInt600;
		@Pc(37) float local37 = (float) (this.anInt582 - this.anInt606) * this.aFloat9 / (float) this.anInt596;
		@Pc(51) float local51 = (float) (this.anInt587 - this.anInt620) * this.aFloat9 / (float) this.anInt600;
		this.gl.glMatrixMode(GL.GL_PROJECTION);
		this.gl.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.gl.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt617 - this.aFloat20), (double) ((float) this.anInt618 - this.aFloat20));
		}
		this.gl.glMatrixMode(GL.GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(Z)V")
	public void method800(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean33) {
			this.aBoolean33 = arg0;
			this.method797();
		}
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
	@Override
	public void method2865(@OriginalArg(0) int arg0) {
		this.method805();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!fd;)V")
	public void method801(@OriginalArg(0) Interface4 arg0) {
		if (this.anInterface4_1 != arg0 && this.aBoolean37) {
			this.gl.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, arg0.method6066());
			this.anInterface4_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[I[I)Lclient!kf;")
	@Override
	public Class78 method2826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static398.method2345(arg0, this, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!fg;")
	public Interface5 method802(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface5) (this.aBoolean37 ? new Class10_Sub2(this, arg0, arg1, false) : new Class180_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "()V")
	@Override
	public void method2804() {
		if (this.anInt582 <= 0 && this.anInt587 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt590;
		@Pc(12) int local12 = this.anInt608;
		@Pc(15) int local15 = this.anInt612;
		@Pc(18) int local18 = this.anInt607;
		this.method2898();
		this.gl.glReadBuffer(GL.GL_FRONT);
		this.gl.glDrawBuffer(GL.GL_BACK);
		this.method806();
		this.method786(false);
		this.method782(false);
		this.method813(false);
		this.method817(false);
		this.method848(null);
		this.method784();
		this.method792(0);
		this.method779(0);
		this.gl.glMatrixMode(GL.GL_PROJECTION);
		this.gl.glLoadIdentity();
		this.gl.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.gl.glMatrixMode(GL.GL_MODELVIEW);
		this.gl.glLoadIdentity();
		this.gl.glRasterPos2i(0, 0);
		this.gl.glCopyPixels(0, 0, this.anInt582, this.anInt587, GL.GL_COLOR);
		this.gl.glFlush();
		this.gl.glReadBuffer(GL.GL_BACK);
		this.gl.glDrawBuffer(GL.GL_BACK);
		this.method2895(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(II)V")
	public synchronized void method803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub39 local4 = new Class2_Sub39(arg1);
		local4.key = arg0;
		this.aClass135_6.addTail(local4);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(FFFF)V")
	public void method804(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static22.aFloatArray4[0] = arg0;
		Static22.aFloatArray4[1] = arg1;
		Static22.aFloatArray4[2] = arg2;
		Static22.aFloatArray4[3] = arg3;
		this.gl.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, Static22.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V")
	@Override
	public void method2872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt617 == arg0 && this.anInt618 == arg1) {
			return;
		}
		this.anInt617 = arg0;
		this.anInt618 = arg1;
		this.method840();
		this.method809();
		if (this.anInt588 == 3) {
			this.method799();
		} else if (this.anInt588 == 2) {
			this.method823();
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V")
	@Override
	public void method2855(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "()V")
	private void method805() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "()V")
	public void method806() {
		if (this.anInt588 != 0) {
			this.anInt588 = 0;
			this.anInt602 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIZ)Lclient!jd;")
	@Override
	public Sprite method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new GlSprite(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "()V")
	private void method807() {
		this.aFloat12 = this.anInt590 - this.anInt606;
		this.aFloat10 = this.anInt608 - this.anInt606;
		this.aFloat7 = this.anInt612 - this.anInt620;
		this.aFloat21 = this.anInt607 - this.anInt620;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!mf;)V")
	public void method808(@OriginalArg(0) Interface8 arg0) {
		if (this.anInt579 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt579 >= 0) {
			this.anInterface8Array1[this.anInt579].method5792();
		}
		this.anInterface8_1 = this.anInterface8Array1[++this.anInt579] = arg0;
		this.anInterface8_1.method5791();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!kf;II)V")
	@Override
	public void method2811(@OriginalArg(1) Class78 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class78_Sub2 local2 = (Class78_Sub2) arg0;
		@Pc(5) Class8_Sub1_Sub1 local5 = local2.aClass8_Sub1_Sub1_2;
		this.method824();
		this.method848(local2.aClass8_Sub1_Sub1_2);
		this.method779(1);
		this.method794(7681, 8448);
		this.method793(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat42 / (float) local5.anInt3688;
		@Pc(37) float local37 = local5.aFloat43 / (float) local5.anInt3687;
		this.gl.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.gl.glBegin(GL.GL_QUADS);
		this.gl.glTexCoord2f(local30 * (float) (this.anInt590 - arg1), local37 * (float) (this.anInt612 - arg2));
		this.gl.glVertex2i(this.anInt590, this.anInt612);
		this.gl.glTexCoord2f(local30 * (float) (this.anInt590 - arg1), local37 * (float) (this.anInt607 - arg2));
		this.gl.glVertex2i(this.anInt590, this.anInt607);
		this.gl.glTexCoord2f(local30 * (float) (this.anInt608 - arg1), local37 * (float) (this.anInt607 - arg2));
		this.gl.glVertex2i(this.anInt608, this.anInt607);
		this.gl.glTexCoord2f(local30 * (float) (this.anInt608 - arg1), local37 * (float) (this.anInt612 - arg2));
		this.gl.glVertex2i(this.anInt608, this.anInt612);
		this.gl.glEnd();
		this.method793(0, 5890, 768);
	}

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "()V")
	private void method809() {
		@Pc(15) int local15;
		if (this.aBoolean50) {
			this.gl.glFogf(GL.GL_FOG_START, 0.0F);
			this.gl.glFogf(GL.GL_FOG_END, 1.0F);
			local15 = this.anInt611;
		} else {
			this.aFloat2 = (float) (this.anInt618 - 256) - this.aFloat15;
			this.aFloat5 = this.aFloat2 - (float) this.anInt601 * this.aFloat11;
			if (this.aFloat5 < (float) this.anInt617) {
				this.aFloat5 = this.anInt617;
			}
			this.gl.glFogf(GL.GL_FOG_START, this.aFloat5);
			this.gl.glFogf(GL.GL_FOG_END, this.aFloat2);
			local15 = this.anInt613;
		}
		Static22.aFloatArray4[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static22.aFloatArray4[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static22.aFloatArray4[2] = (float) (local15 & 0xFF) / 255.0F;
		this.gl.glFogfv(GL.GL_FOG_COLOR, Static22.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method2809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method781();
		this.method779(arg5);
		this.gl.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.gl.glBegin(GL.GL_LINE_LOOP);
		this.gl.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.gl.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.gl.glEnd();
	}

	@OriginalMember(owner = "client!bf", name = "Y", descriptor = "()V")
	private void method810() {
		this.gl.glLoadIdentity();
		this.gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.gl.glMultMatrixf(this.aClass14_Sub2_2.method3941(), 0);
		this.method814();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!fd;III)V")
	public void method811(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method801(arg0);
		arg0.method6065(arg1, arg2);
	}

	@OriginalMember(owner = "client!bf", name = "Z", descriptor = "()V")
	private void method812() {
		Static22.aFloatArray4[0] = this.aFloat8 * this.aFloat1;
		Static22.aFloatArray4[1] = this.aFloat8 * this.aFloat19;
		Static22.aFloatArray4[2] = this.aFloat8 * this.aFloat6;
		Static22.aFloatArray4[3] = 1.0F;
		this.gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, Static22.aFloatArray4, 0);
		Static22.aFloatArray4[0] = -this.aFloat16 * this.aFloat1;
		Static22.aFloatArray4[1] = -this.aFloat16 * this.aFloat19;
		Static22.aFloatArray4[2] = -this.aFloat16 * this.aFloat6;
		Static22.aFloatArray4[3] = 1.0F;
		this.gl.glLightfv(GL.GL_LIGHT1, GL.GL_DIFFUSE, Static22.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(Z)V")
	public void method813(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean48) {
			return;
		}
		if (arg0) {
			this.gl.glEnable(GL.GL_DEPTH_TEST);
		} else {
			this.gl.glDisable(GL.GL_DEPTH_TEST);
		}
		this.aBoolean48 = arg0;
		this.anInt602 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!bf", name = "ab", descriptor = "()V")
	public void method814() {
		this.gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, this.aFloatArray7, 0);
		this.gl.glLightfv(GL.GL_LIGHT1, GL.GL_POSITION, this.aFloatArray9, 0);
	}

	@OriginalMember(owner = "client!bf", name = "bb", descriptor = "()V")
	private void method815() {
		if (this.aFloat20 == 0.0F) {
			this.aFloatArray10[10] = this.aFloat17;
			this.aFloatArray10[14] = this.aFloat14;
		} else {
			@Pc(13) float local13 = this.aFloat13 / (this.aFloat20 + this.aFloat13);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat14 * (1.0F - local13) * (1.0F - local13) / this.aFloat20;
			this.aFloatArray10[10] = this.aFloat17 + local32;
			this.aFloatArray10[14] = this.aFloat14 * local17;
		}
		this.aFloat18 = (this.aFloatArray10[14] - (float) this.anInt618) / this.aFloatArray10[10];
		this.aFloat4 = (float) this.anInt618 - this.aFloat20;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[BIZ)Lclient!fg;")
	public Interface5 method816(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface5) (this.aBoolean37 && (!arg3 || this.aBoolean49) ? new Class10_Sub2(this, arg0, arg1, arg2, arg3) : new Class180_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(IIIIII)Lclient!rc;")
	@Override
	public Class42 method2877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.arbTextureCubeMapSupported ? new Class42_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(Z)V")
	public void method817(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean39) {
			this.aBoolean39 = arg0;
			this.method796();
			this.anInt602 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
	@Override
	public void method2893(@OriginalArg(0) int arg0) {
		this.method829();
	}

	@OriginalMember(owner = "client!bf", name = "cb", descriptor = "()V")
	private void method818() {
		this.aClass14_Sub2_2 = new Class14_Sub2();
		this.aClass14_Sub2_1 = new Class14_Sub2();
		this.aClass8Array1 = new Class8[this.anInt597];
		this.aClass8_Sub1_1 = new Class8_Sub1(this, 3553, 6408, 1, 1);
		this.aClass8_Sub1_2 = new Class8_Sub1(this, 3553, 6408, 1, 1);
		this.aClass8_Sub1_3 = new Class8_Sub1(this, 3553, 6408, 1, 1);
		this.aClass31_Sub2_4 = new GlModel(this);
		this.aClass31_Sub2_1 = new GlModel(this);
		this.aClass31_Sub2_2 = new GlModel(this);
		this.aClass31_Sub2_8 = new GlModel(this);
		this.aClass31_Sub2_5 = new GlModel(this);
		this.aClass31_Sub2_3 = new GlModel(this);
		this.aClass31_Sub2_7 = new GlModel(this);
		this.aClass31_Sub2_6 = new GlModel(this);
		if (this.aBoolean36) {
			this.aClass228_1 = new Class228(this);
		}
		this.aClass143_1.method3690(this);
	}

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "()Z")
	@Override
	public boolean method2829() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "()V")
	private void method819() {
		if (this.aBoolean34) {
			this.gl.glMatrixMode(GL.GL_TEXTURE);
			this.gl.glLoadIdentity();
			this.gl.glMatrixMode(GL.GL_MODELVIEW);
			this.aBoolean34 = false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "(I)V")
	public synchronized void method820(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub39 local4 = new Class2_Sub39(arg0);
		this.aClass135_10.addTail(local4);
	}

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "()I")
	@Override
	public int method2820() {
		@Pc(2) int local2 = this.anInt621;
		this.anInt621 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "()I")
	@Override
	public int method2843() {
		@Pc(2) int local2 = this.anInt623;
		this.anInt623 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method2900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass8_Sub1_Sub1_1 == null || this.aClass8_Sub1_Sub1_1.anInt3684 < arg2 || this.aClass8_Sub1_Sub1_1.anInt3685 < arg3) {
			this.aClass8_Sub1_Sub1_1 = Static402.method3641(this, arg6, arg3, arg2);
			this.aClass8_Sub1_Sub1_1.method3638(false, false);
			local32 = this.aClass8_Sub1_Sub1_1.aFloat43;
			local36 = this.aClass8_Sub1_Sub1_1.aFloat42;
		} else {
			this.aClass8_Sub1_Sub1_1.method3635(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass8_Sub1_Sub1_1.aFloat43 * (float) arg3 / (float) this.aClass8_Sub1_Sub1_1.anInt3685;
			local36 = this.aClass8_Sub1_Sub1_1.aFloat42 * (float) arg2 / (float) this.aClass8_Sub1_Sub1_1.anInt3684;
		}
		this.method824();
		this.method848(this.aClass8_Sub1_Sub1_1);
		this.method779(arg8);
		this.gl.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method780(arg5);
		this.method794(34165, 34165);
		this.method793(0, 34166, 768);
		this.method793(2, 5890, 770);
		this.method833(0, 34166);
		this.method833(2, 5890);
		@Pc(129) float local129 = (float) arg0;
		@Pc(132) float local132 = (float) arg1;
		@Pc(137) float local137 = local129 + (float) arg2;
		@Pc(142) float local142 = local132 + (float) arg3;
		this.gl.glBegin(GL.GL_QUADS);
		this.gl.glTexCoord2f(0.0F, 0.0F);
		this.gl.glVertex2f(local129, local132);
		this.gl.glTexCoord2f(0.0F, local36);
		this.gl.glVertex2f(local129, local142);
		this.gl.glTexCoord2f(local32, local36);
		this.gl.glVertex2f(local137, local142);
		this.gl.glTexCoord2f(local32, 0.0F);
		this.gl.glVertex2f(local137, local132);
		this.gl.glEnd();
		this.method793(0, 5890, 768);
		this.method793(2, 34166, 770);
		this.method833(0, 5890);
		this.method833(2, 34166);
	}

	@OriginalMember(owner = "client!bf", name = "eb", descriptor = "()Lclient!mf;")
	public Interface8 method821() {
		return this.anInterface8_1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!dk;Z)Lclient!jd;")
	@Override
	public Sprite method2891(@OriginalArg(0) Class48 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt1531 * arg0.anInt1533];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray20 == null) {
			for (local15 = 0; local15 < arg0.anInt1533; local15++) {
				for (local21 = 0; local21 < arg0.anInt1531; local21++) {
					@Pc(74) int local74 = arg0.anIntArray108[arg0.aByteArray21[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt1533; local15++) {
				for (local21 = 0; local21 < arg0.anInt1531; local21++) {
					local6[local10++] = arg0.aByteArray20[local8] << 24 | arg0.anIntArray108[arg0.aByteArray21[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Sprite local100 = this.method2884(local6, arg0.anInt1531, arg0.anInt1531, arg0.anInt1533);
		local100.method6391(arg0.anInt1535, arg0.anInt1530, arg0.anInt1532, arg0.anInt1534);
		return local100;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!gn;Lclient!tp;Lclient!on;Lclient!au;I)V")
	@Override
	public void method2824(@OriginalArg(0) Model arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class12_Sub2 arg3) {
		arg0.method3835(arg2, arg3, 0);
		this.method2833(arg1);
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIIII)V")
	@Override
	public void method2889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method781();
		this.method779(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.gl.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.gl.glBegin(GL.GL_LINES);
		this.gl.glVertex2f(local9, local14);
		this.gl.glVertex2f(local9, local14 + (float) arg2);
		this.gl.glEnd();
	}

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "(I)V")
	public synchronized void method822(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub39 local4 = new Class2_Sub39(arg0);
		this.aClass135_7.addTail(local4);
	}

	@OriginalMember(owner = "client!bf", name = "fb", descriptor = "()V")
	private void method823() {
		this.gl.glMatrixMode(GL.GL_PROJECTION);
		this.gl.glLoadMatrixf(this.aFloatArray10, 0);
		this.gl.glMatrixMode(GL.GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "()V")
	public void method824() {
		if (this.anInt602 == 2) {
			return;
		}
		this.method788();
		this.method786(false);
		this.method782(false);
		this.method813(false);
		this.method817(false);
		this.method784();
		this.anInt602 = 2;
	}

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "()V")
	private void method825() {
		if (this.anInt590 <= this.anInt608 && this.anInt612 <= this.anInt607) {
			this.gl.glScissor(this.anInt619 + this.anInt590, this.anInt594 + this.anInt587 - this.anInt607, this.anInt608 - this.anInt590, this.anInt607 - this.anInt612);
		} else {
			this.gl.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(F)V")
	public void method826(@OriginalArg(0) float arg0) {
		if (this.aFloat9 != arg0) {
			this.aFloat9 = arg0;
			if (this.anInt588 == 3) {
				this.method799();
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "ib", descriptor = "()V")
	private void method827() {
		if (this.anInt588 != 3) {
			this.anInt588 = 3;
			this.method799();
			this.method810();
			this.anInt602 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method2816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!bf", name = "jb", descriptor = "()V")
	public void method828() {
		if (this.anInt588 != 2) {
			this.anInt588 = 2;
			this.method823();
			this.method810();
			this.anInt602 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bf", name = "kb", descriptor = "()V")
	private void method829() {
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
			ThreadUtils.sleep(1000L);
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	@Override
	public void method2854(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lclient!mf;)V")
	public void method830(@OriginalArg(0) Interface8 arg0) {
		if (this.anInt579 < 0 || this.anInterface8Array1[this.anInt579] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface8Array1[this.anInt579--] = null;
		arg0.method5792();
		if (this.anInt579 >= 0) {
			this.anInterface8_1 = this.anInterface8Array1[this.anInt579];
			this.anInterface8_1.method5791();
		}
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
	@Override
	public void method2867(@OriginalArg(0) int arg0) {
		this.method779(0);
		this.gl.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.gl.glClear(GL.GL_COLOR_BUFFER_BIT);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!mu;)V")
	public void method831(@OriginalArg(0) Class14_Sub2 arg0) {
		this.gl.glPushMatrix();
		this.gl.glMultMatrixf(arg0.method3941(), 0);
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(IIII)V")
	@Override
	public void method2866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean50) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt611 = arg1;
		this.anInt615 = arg2;
		this.anInt610 = arg3;
		this.method809();
		this.aClass95_1.method2504(true, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "(I)V")
	public void method832(@OriginalArg(0) int arg0) {
		if (this.anInt609 != arg0) {
			this.gl.glActiveTexture(arg0 + GL.GL_TEXTURE0);
			this.anInt609 = arg0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
	public void method833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.gl.glTexEnvi(GL.GL_TEXTURE_ENV, arg0 + GL.GL_SRC0_ALPHA, arg1);
		this.gl.glTexEnvi(GL.GL_TEXTURE_ENV, arg0 + GL.GL_OPERAND0_ALPHA, GL.GL_SRC_ALPHA);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	@Override
	public void method2852(@OriginalArg(0) boolean arg0) {
		this.aBoolean43 = arg0;
		this.method796();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(FFF)V")
	private void method834(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.gl.glMatrixMode(GL.GL_TEXTURE);
		if (this.aBoolean34) {
			this.gl.glLoadIdentity();
		}
		this.gl.glTranslatef(arg0, arg1, arg2);
		this.gl.glMatrixMode(GL.GL_MODELVIEW);
		this.aBoolean34 = true;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
	public void method835(@OriginalArg(2) int arg0) {
		this.gl.glDrawArrays(GL.GL_QUADS, 0, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "(I)V")
	public synchronized void method836(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub39 local4 = new Class2_Sub39(arg0);
		this.aClass135_9.addTail(local4);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method781();
		this.method779(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.gl.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.gl.glBegin(GL.GL_LINES);
		this.gl.glVertex2f(local9, local14);
		this.gl.glVertex2f(local9 + (float) arg2, local14);
		this.gl.glEnd();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([I)V")
	@Override
	public void method2851(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt590;
		arg0[1] = this.anInt612;
		arg0[2] = this.anInt608;
		arg0[3] = this.anInt607;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method2832(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt616 != arg0;
		if (local7 || this.aFloat8 != arg1 || this.aFloat16 != arg2) {
			this.anInt616 = arg0;
			this.aFloat8 = arg1;
			this.aFloat16 = arg2;
			if (local7) {
				this.aFloat1 = (float) (this.anInt616 & 0xFF0000) / 1.671168E7F;
				this.aFloat19 = (float) (this.anInt616 & 0xFFFF) / 65535.0F;
				this.aFloat6 = (float) (this.anInt616 & 0xFF) / 255.0F;
				this.method842();
			}
			this.method812();
		}
		if (this.aFloatArray8[0] == arg3 && this.aFloatArray8[1] == arg4 && this.aFloatArray8[2] == arg5) {
			return;
		}
		this.aFloatArray8[0] = arg3;
		this.aFloatArray8[1] = arg4;
		this.aFloatArray8[2] = arg5;
		this.aFloatArray6[0] = -arg3;
		this.aFloatArray6[1] = -arg4;
		this.aFloatArray6[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray7[0] = arg3 * local132;
		this.aFloatArray7[1] = arg4 * local132;
		this.aFloatArray7[2] = arg5 * local132;
		this.aFloatArray9[0] = -this.aFloatArray7[0];
		this.aFloatArray9[1] = -this.aFloatArray7[1];
		this.aFloatArray9[2] = -this.aFloatArray7[2];
		this.method814();
		this.anInt591 = (int) (arg3 * 256.0F / arg4);
		this.anInt599 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!bf", name = "lb", descriptor = "()V")
	private void method837() {
		if (this.aBoolean52 && this.aBoolean50 | this.anInt601 >= 0) {
			this.gl.glEnable(GL.GL_FOG);
		} else {
			this.gl.glDisable(GL.GL_FOG);
		}
	}

	@OriginalMember(owner = "client!bf", name = "mb", descriptor = "()Lclient!qd;")
	public Class8_Sub3 method838() {
		return this.aClass42_Sub1_1 == null ? null : this.aClass42_Sub1_1.method2428();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I[BIZ)Lclient!fd;")
	public Interface4 method839(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface4) (this.aBoolean37 && (!arg2 || this.aBoolean49) ? new Class10_Sub1(this, 5123, arg0, arg1, arg2) : new Class180_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "()Z")
	@Override
	public boolean method2812() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "()Z")
	@Override
	public boolean method2869() {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([Lclient!gn;Lclient!tp;Lclient!on;[Lclient!au;I)V")
	@Override
	public void method2830(@OriginalArg(0) Model[] arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class12_Sub2[] arg3, @OriginalArg(4) int arg4) {
		this.method2881(arg0, arg2, arg3, arg4);
		this.method2833(arg1);
	}

	@OriginalMember(owner = "client!bf", name = "nb", descriptor = "()V")
	private void method840() {
		@Pc(2) float[] local2 = this.aFloatArray10;
		@Pc(14) float local14 = (float) (-this.anInt606 * this.anInt617) / (float) this.anInt596;
		@Pc(28) float local28 = (float) ((this.anInt582 - this.anInt606) * this.anInt617) / (float) this.anInt596;
		@Pc(39) float local39 = (float) (this.anInt620 * this.anInt617) / (float) this.anInt600;
		@Pc(53) float local53 = (float) ((this.anInt620 - this.anInt587) * this.anInt617) / (float) this.anInt600;
		if (local14 == local28 || local39 == local53) {
			local2[0] = 1.0F;
			local2[1] = 0.0F;
			local2[2] = 0.0F;
			local2[3] = 0.0F;
			local2[4] = 0.0F;
			local2[5] = 1.0F;
			local2[6] = 0.0F;
			local2[7] = 0.0F;
			local2[8] = 0.0F;
			local2[9] = 0.0F;
			local2[10] = 1.0F;
			local2[11] = 0.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = 0.0F;
			local2[15] = 1.0F;
		} else {
			@Pc(67) float local67 = (float) this.anInt617 * 2.0F;
			local2[0] = local67 / (local28 - local14);
			local2[1] = 0.0F;
			local2[2] = 0.0F;
			local2[3] = 0.0F;
			local2[4] = 0.0F;
			local2[5] = local67 / (local39 - local53);
			local2[6] = 0.0F;
			local2[7] = 0.0F;
			local2[8] = (local28 + local14) / (local28 - local14);
			local2[9] = (local39 + local53) / (local39 - local53);
			local2[10] = this.aFloat17 = (float) -(this.anInt618 + this.anInt617) / (float) (this.anInt618 - this.anInt617);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat14 = -(local67 * (float) this.anInt618) / (float) (this.anInt618 - this.anInt617);
			local2[15] = 0.0F;
		}
		this.method815();
	}

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "()V")
	@Override
	public void method2887() {
		this.aClass200_1.method5117();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!vi;[Lclient!dk;Z)Lclient!ur;")
	@Override
	public Class130 method2857(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class48[] arg1) {
		return new Class130_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "()Z")
	@Override
	public boolean method2840() {
		return !this.aBoolean47;
	}

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "()I")
	@Override
	public int method2899() {
		return this.anInt581 + this.anInt585 + this.anInt586;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()V")
	@Override
	public void method5792() {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(F)V")
	@Override
	public void method2838(@OriginalArg(0) float arg0) {
		if (this.aFloat3 != arg0) {
			this.aFloat3 = arg0;
			this.method842();
		}
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(II)V")
	public synchronized void method841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub39 local4 = new Class2_Sub39(arg1);
		local4.key = arg0;
		this.aClass135_5.addTail(local4);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[[I[[IIII)Lclient!tf;")
	@Override
	public Class6 method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class6_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "()I")
	@Override
	public int method5793() {
		return this.anInt587;
	}

	@OriginalMember(owner = "client!bf", name = "ob", descriptor = "()V")
	private void method842() {
		Static22.aFloatArray4[0] = this.aFloat3 * this.aFloat1;
		Static22.aFloatArray4[1] = this.aFloat3 * this.aFloat19;
		Static22.aFloatArray4[2] = this.aFloat3 * this.aFloat6;
		Static22.aFloatArray4[3] = 1.0F;
		this.gl.glLightModelfv(GL.GL_LIGHT_MODEL_AMBIENT, Static22.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(IIII)V")
	@Override
	public void method2862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass200_1.method5121(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(II)V")
	public void method843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt619 = arg0;
		this.anInt594 = arg1;
		this.gl.glViewport(arg0, arg1, this.anInt582, this.anInt587);
		this.method825();
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(Z)V")
	@Override
	public void method2874(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!pr;IIII)Lclient!gn;")
	@Override
	public Model method2864(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new GlModel(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!bf", name = "pb", descriptor = "()V")
	public void method844() {
		if (this.anInt602 == 4) {
			return;
		}
		this.method788();
		this.method786(false);
		this.method782(false);
		this.method813(false);
		this.method817(false);
		this.method784();
		this.method779(1);
		this.method792(1);
		this.anInt602 = 4;
	}

	@OriginalMember(owner = "client!bf", name = "qb", descriptor = "()V")
	public void method845() {
		if (this.anInt602 == 16) {
			return;
		}
		this.method827();
		this.method786(true);
		this.method813(true);
		this.method817(true);
		this.method779(1);
		this.method792(1);
		this.anInt602 = 16;
	}

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "()Z")
	@Override
	public boolean method2894() {
		return this.aBoolean44;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!rc;Lclient!rc;FLclient!rc;)Lclient!rc;")
	@Override
	public Class42 method2827(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class42 arg3) {
		if (arg0 != null && arg1 != null && this.arbTextureCubeMapSupported && this.aBoolean36) {
			@Pc(11) Class42_Sub1_Sub1 local11 = null;
			@Pc(14) Class42_Sub1 local14 = (Class42_Sub1) arg0;
			@Pc(17) Class42_Sub1 local17 = (Class42_Sub1) arg1;
			@Pc(21) Class8_Sub3 local21 = local14.method2428();
			@Pc(25) Class8_Sub3 local25 = local17.method2428();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt5167 > local25.anInt5167 ? local21.anInt5167 : local25.anInt5167;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class42_Sub1_Sub1) {
					@Pc(52) Class42_Sub1_Sub1 local52 = (Class42_Sub1_Sub1) arg3;
					if (local52.method1609() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class42_Sub1_Sub1(this, local40);
				}
				local11.method1610(arg2, local25, local21);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIIIII)Z")
	@Override
	public boolean method2841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass14_Sub2_2.aFloat52 * (float) arg0 + this.aClass14_Sub2_2.aFloat59 * (float) arg1 + this.aClass14_Sub2_2.aFloat55 * (float) arg2 + this.aClass14_Sub2_2.aFloat60;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass14_Sub2_2.aFloat52 * (float) arg3 + this.aClass14_Sub2_2.aFloat59 * (float) arg4 + this.aClass14_Sub2_2.aFloat55 * (float) arg5 + this.aClass14_Sub2_2.aFloat60;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt617 && local55 < (float) this.anInt617 || !(!(local24 > (float) this.anInt618) || !(local55 > (float) this.anInt618))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt596 * (this.aClass14_Sub2_2.aFloat56 * (float) arg0 + this.aClass14_Sub2_2.aFloat51 * (float) arg1 + this.aClass14_Sub2_2.aFloat58 * (float) arg2 + this.aClass14_Sub2_2.aFloat61) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt596 * (this.aClass14_Sub2_2.aFloat56 * (float) arg3 + this.aClass14_Sub2_2.aFloat51 * (float) arg4 + this.aClass14_Sub2_2.aFloat58 * (float) arg5 + this.aClass14_Sub2_2.aFloat61) / local55);
		if ((float) local119 < this.aFloat12 && (float) local151 < this.aFloat12 || (float) local119 > this.aFloat10 && (float) local151 > this.aFloat10) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt600 * (this.aClass14_Sub2_2.aFloat62 * (float) arg0 + this.aClass14_Sub2_2.aFloat53 * (float) arg1 + this.aClass14_Sub2_2.aFloat57 * (float) arg2 + this.aClass14_Sub2_2.aFloat54) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt600 * (this.aClass14_Sub2_2.aFloat62 * (float) arg3 + this.aClass14_Sub2_2.aFloat53 * (float) arg4 + this.aClass14_Sub2_2.aFloat57 * (float) arg5 + this.aClass14_Sub2_2.aFloat54) / local55);
			return (!((float) local209 < this.aFloat7) || !((float) local241 < this.aFloat7)) && (!((float) local209 > this.aFloat21) || !((float) local241 > this.aFloat21));
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!kg;)V")
	@Override
	public void method2846(@OriginalArg(0) Class2_Sub22 arg0) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZZ)V")
	public void method846(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt598) {
			if (arg0 < 0) {
				this.method819();
				this.method848(null);
				if (!this.aBoolean50) {
					this.aClass95_1.method2505(arg2, arg1, 0);
				}
			} else {
				@Pc(11) Class8_Sub1 local11 = this.aClass56_1.method1788(arg0);
				@Pc(17) Class229 local17 = this.anInterface2_5.method2658(arg0);
				if (local17.aByte68 == 0 && local17.aByte69 == 0) {
					this.method819();
				} else {
					@Pc(30) int local30 = local17.aBoolean441 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method834((float) (this.anInt584 % local34 * local17.aByte68) / (float) local34, (float) (this.anInt584 % local34 * local17.aByte69) / (float) local34, 0.0F);
				}
				if (this.aBoolean50) {
					this.aClass95_1.method2505(arg2, arg1, 3);
					this.method848(local11);
				} else {
					this.aClass95_1.method2505(arg2, arg1, local17.aByte67);
					this.aClass95_1.method2504(false, local17.aByte72);
					if (!this.aClass95_1.method2507(local11)) {
						this.method848(local11);
					}
				}
			}
			this.anInt598 = arg0;
		}
		this.anInt602 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([Lclient!gn;Lclient!on;[Lclient!au;I)V")
	@Override
	public void method2881(@OriginalArg(0) Model[] arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class12_Sub2[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method3835(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)I")
	@Override
	public int method2863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIII)[I")
	@Override
	public int[] method2850() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.gl.glReadPixels(0, this.anInt587 - local6, 36, 1, GL.GL_BGRA, this.anInt592, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()V")
	@Override
	public void method5791() {
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(FF)V")
	public void method847(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat11 = arg0;
		this.aFloat15 = arg1;
		if (!this.aBoolean50) {
			this.method809();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!kq;)V")
	public void method848(@OriginalArg(0) Class8 arg0) {
		@Pc(5) Class8 local5 = this.aClass8Array1[this.anInt609];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.gl.glDisable(local5.anInt6882);
			} else {
				if (local5 == null) {
					this.gl.glEnable(arg0.anInt6882);
				} else if (arg0.anInt6882 != local5.anInt6882) {
					this.gl.glDisable(local5.anInt6882);
					this.gl.glEnable(arg0.anInt6882);
				}
				this.gl.glBindTexture(arg0.anInt6882, arg0.method6158());
			}
			this.aClass8Array1[this.anInt609] = arg0;
		}
		this.anInt602 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "()F")
	@Override
	public float method2860() {
		return this.aFloat20;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)V")
	@Override
	public void method2879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt613 == arg0 && this.anInt601 == arg1) {
			return;
		}
		this.anInt613 = arg0;
		this.anInt601 = arg1;
		if (!this.aBoolean50) {
			this.method809();
			this.method837();
		}
	}

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "()Z")
	@Override
	public boolean method2892() {
		return this.aClass2_Sub38_Sub1_1.method6304();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2828(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "()V")
	@Override
	protected void method2839() {
		if (this.gl != null) {
			try {
				this.aClass200_1.method5120();
			} catch (@Pc(7) Throwable local7) {
			}
			this.gl = null;
		}
		if (this.aContext1 != null) {
			this.method805();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean32) {
			Static82.method1902(true);
			this.aBoolean32 = false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!rc;)V")
	@Override
	public void method2870(@OriginalArg(0) Class42 arg0) {
		this.aClass42_Sub1_1 = (Class42_Sub1) arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2873(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static377.aFloat80 = arg0;
		Static377.aFloat79 = arg1;
		Static377.aFloat78 = arg2;
	}

	@OriginalMember(owner = "client!bf", name = "rb", descriptor = "()V")
	public void method849() {
		if (this.anInt602 == 8) {
			return;
		}
		this.method828();
		this.method786(true);
		this.method813(true);
		this.method817(true);
		this.method779(1);
		this.method792(1);
		this.anInt602 = 8;
	}
}
