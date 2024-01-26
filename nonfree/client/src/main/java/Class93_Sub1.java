import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
	private int anInt2450 = -1;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	private int anInt2454 = -1;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public final int anInt2456;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qha;IIZ[[BI)V")
	public Class93_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt2456 = arg2;
		super.aClass19_Sub3_43.method7001(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + OpenGL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, 0, super.anInt10911, arg2, arg2, 0, arg5, OpenGL.GL_UNSIGNED_BYTE, arg4[local26], 0);
		}
		this.method9438(true);
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qha;II)V")
	public Class93_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt2456 = arg2;
		super.aClass19_Sub3_43.method7001(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + OpenGL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, 0, super.anInt10911, arg2, arg2, 0, Static391.method5505(super.anInt10911), OpenGL.GL_UNSIGNED_BYTE, (byte[]) null, 0);
		}
		this.method9438(true);
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qha;IIZ[[I)V")
	public Class93_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt2456 = arg2;
		super.aClass19_Sub3_43.method7001(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static480.method6466(arg2, local30 + 34069, arg4[local30], super.anInt10911, arg2, super.aClass19_Sub3_43.anInt8030);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + OpenGL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, 0, super.anInt10911, arg2, arg2, 0, OpenGL.GL_BGRA, super.aClass19_Sub3_43.anInt8030, arg4[local30], 0);
			}
		}
		this.method9438(true);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBIII)V")
	public void method2311(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt10920, 0);
		this.anInt2454 = arg1;
		this.anInt2450 = arg2;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	@Override
	public void method9435() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2450, this.anInt2454, OpenGL.GL_TEXTURE_2D, 0, 0);
		this.anInt2454 = -1;
		this.anInt2450 = -1;
	}
}
