import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class51_Sub4 extends Class51 implements Interface18 {

	@OriginalMember(owner = "client!va", name = "L", descriptor = "I")
	private final int anInt9865;

	@OriginalMember(owner = "client!va", name = "G", descriptor = "I")
	private final int anInt9869;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!tca;Lclient!eba;IIZ[FII)V")
	public Class51_Sub4(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static702.aClass397_20, arg2 * arg3, arg4);
		this.anInt9865 = arg2;
		this.anInt9869 = arg3;
		super.aClass19_Sub1_Sub2_12.method8088(this);
		if (!arg4 && arg7 == 0 && arg6 == 0) {
			this.method8639(arg5, arg2, arg3, super.anInt9848);
		} else {
			OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ROW_LENGTH, arg7);
			OpenGL.glTexImage2Df(super.anInt9848, 0, this.method8631(), arg2, arg3, 0, Static468.method7644(super.aClass92_14), OpenGL.GL_FLOAT, arg5, arg6 * 4);
			OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ROW_LENGTH, OpenGL.GL_POINTS);
		}
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!tca;IIZ[III)V")
	public Class51_Sub4(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static172.aClass92_8, Static702.aClass397_16, arg2 * arg1, arg3);
		this.anInt9865 = arg1;
		this.anInt9869 = arg2;
		super.aClass19_Sub1_Sub2_12.method8088(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method8636(super.anInt9848, arg4, arg2, arg1);
		} else {
			OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ROW_LENGTH, arg6);
			OpenGL.glTexImage2Di(super.anInt9848, 0, OpenGL.GL_RGBA, this.anInt9865, this.anInt9869, 0, OpenGL.GL_BGRA, super.aClass19_Sub1_Sub2_12.anInt9277, arg4, arg5 * 4);
			OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ROW_LENGTH, OpenGL.GL_POINTS);
		}
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!tca;Lclient!eba;IIZ[BII)V")
	public Class51_Sub4(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static702.aClass397_16, arg2 * arg3, arg4);
		this.anInt9865 = arg2;
		this.anInt9869 = arg3;
		super.aClass19_Sub1_Sub2_12.method8088(this);
		OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ALIGNMENT, OpenGL.GL_LINES);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method8638(arg3, super.anInt9848, arg5, arg2);
		} else {
			OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ROW_LENGTH, arg7);
			OpenGL.glTexImage2Dub(super.anInt9848, 0, this.method8631(), arg2, arg3, 0, Static468.method7644(super.aClass92_14), OpenGL.GL_UNSIGNED_BYTE, arg5, arg6);
			OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ROW_LENGTH, OpenGL.GL_POINTS);
		}
		OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ALIGNMENT, OpenGL.GL_TRIANGLES);
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!tca;Lclient!eba;Lclient!wda;II)V")
	public Class51_Sub4(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Class397 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt9869 = arg4;
		this.anInt9865 = arg3;
		super.aClass19_Sub1_Sub2_12.method8088(this);
		OpenGL.glTexImage2Dub(super.anInt9848, 0, this.method8631(), arg3, arg4, 0, Static468.method7644(super.aClass92_14), Static248.method3526(super.aClass397_11), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(FB)F")
	@Override
	public float method9050(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9869;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BII[IIII)V")
	@Override
	public void method9044(@OriginalArg(3) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt9869 * this.anInt9865];
		super.aClass19_Sub1_Sub2_12.method8088(this);
		OpenGL.glGetTexImagei(super.anInt9848, OpenGL.GL_POINTS, OpenGL.GL_BGRA, OpenGL.GL_UNSIGNED_BYTE, local12, 0);
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			Static734.method7695(local12, (arg2 - local34 - 1) * this.anInt9865, arg0, arg1 * local34, arg1);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(FI)F")
	@Override
	public float method9046(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9865;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I")
	@Override
	public int method9047() {
		return this.anInt9869;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9049() {
		return true;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)I")
	@Override
	public int method9045() {
		return this.anInt9865;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII[BILclient!eba;II)V")
	@Override
	public void method9051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) Class92 arg3, @OriginalArg(8) int arg4) {
		super.aClass19_Sub1_Sub2_12.method8088(this);
		OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ALIGNMENT, OpenGL.GL_LINES);
		OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ROW_LENGTH, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt9848, OpenGL.GL_POINTS, OpenGL.GL_POINTS, OpenGL.GL_POINTS, arg4, arg1, Static468.method7644(arg3), OpenGL.GL_UNSIGNED_BYTE, arg2, 0);
		OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ROW_LENGTH, OpenGL.GL_POINTS);
		OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ALIGNMENT, OpenGL.GL_TRIANGLES);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!eba;III[FIIII)V")
	public void method8651(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float[] arg2, @OriginalArg(8) int arg3) {
		super.aClass19_Sub1_Sub2_12.method8088(this);
		OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ROW_LENGTH, OpenGL.GL_POINTS);
		OpenGL.glTexSubImage2Df(super.anInt9848, OpenGL.GL_POINTS, OpenGL.GL_POINTS, OpenGL.GL_POINTS, arg3, arg1, Static468.method7644(arg0), OpenGL.GL_UNSIGNED_BYTE, arg2, 0);
		OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ROW_LENGTH, OpenGL.GL_POINTS);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method9048(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass19_Sub1_Sub2_12.method8088(this);
		OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ROW_LENGTH, arg5);
		OpenGL.glTexSubImage2Di(super.anInt9848, OpenGL.GL_POINTS, arg1, arg2, arg4, arg3, OpenGL.GL_BGRA, super.aClass19_Sub1_Sub2_12.anInt9277, arg0, 0);
		OpenGL.glPixelStorei(OpenGL.GL_UNPACK_ROW_LENGTH, OpenGL.GL_POINTS);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method9052(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass19_Sub1_Sub2_12.method8088(this);
		OpenGL.glTexParameteri(super.anInt9848, OpenGL.GL_TEXTURE_WRAP_S, arg0 ? OpenGL.GL_REPEAT : OpenGL.GL_CLAMP_TO_EDGE);
		OpenGL.glTexParameteri(super.anInt9848, OpenGL.GL_TEXTURE_WRAP_T, arg1 ? OpenGL.GL_REPEAT : OpenGL.GL_CLAMP_TO_EDGE);
	}
}
