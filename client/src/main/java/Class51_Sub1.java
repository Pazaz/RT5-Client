import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class51_Sub1 extends Class51 implements Interface2 {

	@OriginalMember(owner = "client!br", name = "y", descriptor = "I")
	private final int anInt1128;

	@OriginalMember(owner = "client!br", name = "E", descriptor = "I")
	private final int anInt1130;

	@OriginalMember(owner = "client!br", name = "A", descriptor = "I")
	private final int anInt1129;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!tca;Lclient!eba;III[B)V")
	public Class51_Sub1(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static702.aClass397_16, arg2 * arg3 * arg4, false);
		this.anInt1128 = arg4;
		this.anInt1130 = arg2;
		this.anInt1129 = arg3;
		super.aClass19_Sub1_Sub2_12.method8088(this);
		OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ALIGNMENT, OpenGL.GL_LINES);
		OpenGL.glTexImage3Dub(super.anInt9848, 0, this.method8631(), this.anInt1130, this.anInt1129, this.anInt1128, 0, Static468.method7644(super.aClass92_14), OpenGL.GL_UNSIGNED_BYTE, arg5, 0);
		OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ALIGNMENT, OpenGL.GL_TRIANGLES);
	}
}
