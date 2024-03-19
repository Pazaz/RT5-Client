import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
	private int anInt4857 = -1;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
	private final int anInt4858;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
	private final int anInt4856;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	private final int anInt4859;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!ih;IIII[BI)V")
	public Class44_Sub2(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt4858 = arg2;
		this.anInt4856 = arg3;
		this.anInt4859 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl1;
		this.aClass40_Sub2_37.method2882(this);
		local25.glTexImage3D(this.anInt6479, 0, this.anInt6476, this.anInt4858, this.anInt4856, this.anInt4859, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method5455(true);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	@Override
	public void method6123() {
		this.aClass40_Sub2_37.anOpengl1.glFramebufferTexture3DEXT(36160, this.anInt4857, this.anInt6479, 0, 0, 0);
		this.anInt4857 = -1;
	}
}
