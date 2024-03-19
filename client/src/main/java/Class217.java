import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class217 implements Interface9 {

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
	private int anInt7313 = -1;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_42;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	public final int anInt7315;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
	public final int anInt7316;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
	private final int anInt7311;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
	private int anInt7314;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
	private final int anInt7312;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!ih;III)V")
	public Class217(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass40_Sub2_42 = arg0;
		this.anInt7315 = arg2;
		this.anInt7316 = arg3;
		this.anInt7311 = arg1;
		@Pc(20) opengl local20 = this.aClass40_Sub2_42.anOpengl1;
		local20.glGenRenderbuffersEXT(1, Static349.anIntArray597, 0);
		this.anInt7314 = Static349.anIntArray597[0];
		local20.glBindRenderbufferEXT(36161, this.anInt7314);
		local20.glRenderbufferStorageEXT(36161, this.anInt7311, this.anInt7315, this.anInt7316);
		this.anInt7312 = this.anInt7315 * this.anInt7316 * this.aClass40_Sub2_42.method2826(this.anInt7311);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "()V")
	public void method6124() {
		if (this.anInt7314 > 0) {
			this.aClass40_Sub2_42.method2831(this.anInt7314, this.anInt7312);
			this.anInt7314 = 0;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "()V")
	@Override
	public void method6123() {
		this.aClass40_Sub2_42.anOpengl1.glFramebufferRenderbufferEXT(36160, this.anInt7313, 36161, 0);
		this.anInt7313 = -1;
	}

	@OriginalMember(owner = "client!wk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method6124();
		super.finalize();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public void method6125(@OriginalArg(0) int arg0) {
		this.aClass40_Sub2_42.anOpengl1.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt7314);
		this.anInt7313 = arg0;
	}
}
