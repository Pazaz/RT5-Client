import jaggl.opengl;
import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
	private int anInt6888 = -1;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
	private final int anInt6885;

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
	private final int anInt6886;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
	private final int anInt6887;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!bf;IIII[BI)V")
	public Class8_Sub4(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt6885 = arg2;
		this.anInt6886 = arg3;
		this.anInt6887 = arg4;
		@Pc(25) opengl local25 = arg0.gl;
		this.aClass19_Sub1_40.method848(this);
		local25.glTexImage3D(this.anInt6882, 0, this.anInt6883, this.anInt6885, this.anInt6886, this.anInt6887, 0, arg6, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(arg5));
		this.method6160(true);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "()V")
	@Override
	public void method6152() {
		this.aClass19_Sub1_40.gl.glFramebufferTexture3DEXT(GL.GL_FRAMEBUFFER, this.anInt6888, this.anInt6882, 0, 0, 0);
		this.anInt6888 = -1;
	}
}
