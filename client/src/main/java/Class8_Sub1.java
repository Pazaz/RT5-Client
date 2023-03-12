import jaggl.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!al", name = "k", descriptor = "I")
	private int anInt3686 = -1;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "I")
	public final int anInt3684;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "I")
	public final int anInt3685;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!bf;IIIIZ[FI)V")
	public Class8_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3684 = arg3;
		this.anInt3685 = arg4;
		@Pc(20) opengl local20 = arg0.gl;
		this.aClass19_Sub1_40.method848(this);
		if (arg5 && this.anInt6882 != 34037) {
			Static187.method6153(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method6165(true);
		} else {
			local20.glTexImage2D(this.anInt6882, 0, this.anInt6883, this.anInt3684, this.anInt3685, 0, arg7, GL.GL_FLOAT, FloatBuffer.wrap(arg6));
			this.method6165(false);
		}
		this.method6160(true);
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!bf;IIIIZ[IZ)V")
	public Class8_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3684 = arg3;
		this.anInt3685 = arg4;
		@Pc(20) opengl local20 = arg0.gl;
		if (arg7) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(35) int local35 = local28 * arg3;
				@Pc(43) int local43 = (arg4 - local28 - 1) * arg3;
				for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
					local26[local35++] = arg6[local43++];
				}
			}
			arg6 = local26;
		}
		this.aClass19_Sub1_40.method848(this);
		if (arg5 && this.anInt6882 != 34037) {
			Static187.method6164(local20, this.anInt6882, this.anInt6883, this.anInt3684, this.anInt3685, this.aClass19_Sub1_40.anInt592, arg6);
			this.method6165(true);
		} else {
			local20.glTexImage2D(this.anInt6882, 0, this.anInt6883, this.anInt3684, this.anInt3685, 0, GL.GL_BGRA, this.aClass19_Sub1_40.anInt592, IntBuffer.wrap(arg6));
			this.method6165(false);
		}
		this.method6160(true);
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!bf;IIII)V")
	public Class8_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt3684 = arg3;
		this.anInt3685 = arg4;
		@Pc(20) opengl local20 = arg0.gl;
		this.aClass19_Sub1_40.method848(this);
		local20.glTexImage2D(this.anInt6882, 0, this.anInt6883, arg3, arg4, 0, Static187.method6155(this.anInt6883), GL.GL_UNSIGNED_BYTE, null);
		this.method6160(true);
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!bf;IIIIZ[BIZ)V")
	public Class8_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3684 = arg3;
		this.anInt3685 = arg4;
		@Pc(20) opengl local20 = arg0.gl;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(35) int local35 = local28 * arg3;
				@Pc(43) int local43 = (arg4 - local28 - 1) * arg3;
				for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
					local26[local35++] = arg6[local43++];
				}
			}
			arg6 = local26;
		}
		this.aClass19_Sub1_40.method848(this);
		local20.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, GL.GL_LINES);
		if (arg5 && this.anInt6882 != 34037) {
			Static187.method6157(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method6165(true);
		} else {
			local20.glTexImage2D(this.anInt6882, 0, this.anInt6883, this.anInt3684, this.anInt3685, 0, arg7, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(arg6));
			this.method6165(false);
		}
		local20.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, GL.GL_TRIANGLES);
		this.method6160(true);
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!bf;IIIII)V")
	protected Class8_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt3684 = arg4;
		this.anInt3685 = arg5;
		@Pc(20) opengl local20 = arg0.gl;
		@Pc(29) int local29 = this.aClass19_Sub1_40.method821().method5793() - arg3 - arg5;
		this.aClass19_Sub1_40.method848(this);
		local20.glCopyTexImage2D(this.anInt6882, 0, this.anInt6883, arg2, local29, arg4, arg5, 0);
		this.method6160(true);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "()V")
	@Override
	public final void method6152() {
		this.aClass19_Sub1_40.gl.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, this.anInt3686, this.anInt6882, 0, 0);
		this.anInt3686 = -1;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII[BIIIZ)V")
	public final void method3635(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(8) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_40.gl;
		if (arg4) {
			@Pc(12) int local12 = Static187.method6163(6406);
			@Pc(16) int local16 = local12 * arg0;
			@Pc(20) int local20 = local12 * arg0;
			@Pc(25) byte[] local25 = new byte[local16 * arg1];
			for (@Pc(27) int local27 = 0; local27 < arg1; local27++) {
				@Pc(34) int local34 = local27 * local16;
				@Pc(44) int local44 = (arg1 - local27 - 1) * local20;
				for (@Pc(46) int local46 = 0; local46 < local16; local46++) {
					local25[local34++] = arg2[local44++];
				}
			}
			arg2 = local25;
		}
		this.aClass19_Sub1_40.method848(this);
		local3.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, GL.GL_LINES);
		if (arg0 != arg0) {
			local3.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, arg0);
		}
		local3.glTexSubImage2D(this.anInt6882, GL.GL_POINTS, GL.GL_POINTS, GL.GL_POINTS, arg0, arg1, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(arg2, 0, arg2.length));
		if (arg0 != arg0) {
			local3.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, GL.GL_POINTS);
		}
		local3.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, GL.GL_TRIANGLES);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V")
	public final void method3636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.aClass19_Sub1_40.method821().method5793() - arg3;
		this.aClass19_Sub1_40.method848(this);
		this.aClass19_Sub1_40.gl.glCopyTexSubImage2D(this.anInt6882, GL.GL_POINTS, arg0, this.anInt3685 - arg1 - arg3, 0, local8, arg2, arg3);
		this.aClass19_Sub1_40.gl.glFlush();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII[IIIZ)V")
	protected final void method3637(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_40.gl;
		@Pc(14) int[] local14 = new int[arg0 * arg1];
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			@Pc(23) int local23 = local16 * arg0;
			@Pc(33) int local33 = (arg1 - local16 - 1) * arg0;
			for (@Pc(35) int local35 = 0; local35 < arg0; local35++) {
				local14[local23++] = arg2[local33++];
			}
		}
		this.aClass19_Sub1_40.method848(this);
		if (arg0 != arg0) {
			local3.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, arg0);
		}
		local3.glTexSubImage2D(this.anInt6882, GL.GL_POINTS, GL.GL_POINTS, GL.GL_POINTS, arg0, arg1, GL.GL_BGRA, this.aClass19_Sub1_40.anInt592, IntBuffer.wrap(local14, 0, local14.length));
		if (arg0 != arg0) {
			local3.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, GL.GL_POINTS);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZZ)V")
	public final void method3638(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_40.gl;
		if (this.anInt6882 == 3553) {
			this.aClass19_Sub1_40.method848(this);
			local3.glTexParameteri(this.anInt6882, GL.GL_TEXTURE_WRAP_S, arg0 ? GL.GL_REPEAT : GL.GL_CLAMP_TO_EDGE);
			local3.glTexParameteri(this.anInt6882, GL.GL_TEXTURE_WRAP_T, arg1 ? GL.GL_REPEAT : GL.GL_CLAMP_TO_EDGE);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public final void method3639(@OriginalArg(0) int arg0) {
		this.aClass19_Sub1_40.gl.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, arg0, this.anInt6882, this.anInt6881, 0);
		this.anInt3686 = arg0;
	}
}
