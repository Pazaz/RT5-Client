import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class2_Sub2_Sub19 extends Class2_Sub2 implements Interface3 {

	@OriginalMember(owner = "client!ut", name = "A", descriptor = "[I")
	public static final int[] anIntArray768 = new int[4096];

	@OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
	private int anInt9822 = -1;

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
	private int anInt9821 = -1;

	@OriginalMember(owner = "client!ut", name = "F", descriptor = "I")
	private final int anInt9826;

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_38;

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
	public final int anInt9818;

	@OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
	public final int anInt9828;

	@OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
	private int anInt9819;

	@OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
	private final int anInt9815;

	static {
		for (@Pc(123) int local123 = 0; local123 < 4096; local123++) {
			anIntArray768[local123] = Static61.method1310(local123);
		}
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!qha;III)V")
	public Class2_Sub2_Sub19(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9826 = arg1;
		this.aClass19_Sub3_38 = arg0;
		this.anInt9818 = arg2;
		this.anInt9828 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static708.anIntArray862, 0);
		this.anInt9819 = Static708.anIntArray862[0];
		OpenGL.glBindRenderbufferEXT(OpenGL.GL_RENDERBUFFER, this.anInt9819);
		OpenGL.glRenderbufferStorageEXT(OpenGL.GL_RENDERBUFFER, this.anInt9826, this.anInt9818, this.anInt9828);
		this.anInt9815 = this.anInt9818 * this.anInt9828 * this.aClass19_Sub3_38.method7028(this.anInt9826);
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!qha;IIII)V")
	public Class2_Sub2_Sub19(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass19_Sub3_38 = arg0;
		this.anInt9826 = arg1;
		this.anInt9818 = arg2;
		this.anInt9828 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static708.anIntArray862, 0);
		this.anInt9819 = Static708.anIntArray862[0];
		OpenGL.glBindRenderbufferEXT(OpenGL.GL_RENDERBUFFER, this.anInt9819);
		OpenGL.glRenderbufferStorageMultisampleEXT(OpenGL.GL_RENDERBUFFER, arg4, this.anInt9826, this.anInt9818, this.anInt9828);
		this.anInt9815 = this.anInt9828 * this.anInt9818 * this.aClass19_Sub3_38.method7028(this.anInt9826);
	}

	@OriginalMember(owner = "client!ut", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method8609();
		super.finalize();
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(III)V")
	public void method8607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, OpenGL.GL_RENDERBUFFER, this.anInt9819);
		this.anInt9822 = arg0;
		this.anInt9821 = arg1;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	@Override
	public void method9435() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt9821, this.anInt9822, OpenGL.GL_RENDERBUFFER, 0);
		this.anInt9822 = -1;
		this.anInt9821 = -1;
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(B)V")
	public void method8609() {
		if (this.anInt9819 > 0) {
			this.aClass19_Sub3_38.method6983(this.anInt9819, this.anInt9815);
			this.anInt9819 = 0;
		}
	}
}
