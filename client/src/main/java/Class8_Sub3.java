import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
	private int anInt5168;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	public final int anInt5167;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!bf;II)V")
	public Class8_Sub3(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass19_Sub1_40.anOpengl1;
		this.anInt5167 = arg2;
		this.aClass19_Sub1_40.method848(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, 0, this.anInt6883, arg2, arg2, 0, GL.GL_BGRA, this.aClass19_Sub1_40.anInt592, null);
		}
		this.method6160(true);
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!bf;IIZ[[BI)V")
	public Class8_Sub3(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass19_Sub1_40.anOpengl1;
		this.anInt5167 = arg2;
		this.aClass19_Sub1_40.method848(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, 0, this.anInt6883, arg2, arg2, 0, arg5, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(arg4[local23]));
		}
		this.method6160(true);
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!bf;IIZ[[I)V")
	public Class8_Sub3(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass19_Sub1_40.anOpengl1;
		this.anInt5167 = arg2;
		this.aClass19_Sub1_40.method848(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static187.method6164(local14, local25 + 34069, this.anInt6883, arg2, arg2, this.aClass19_Sub1_40.anInt592, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, 0, this.anInt6883, arg2, arg2, 0, GL.GL_BGRA, this.aClass19_Sub1_40.anInt592, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method6160(true);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
	@Override
	public void method6152() {
		this.aClass19_Sub1_40.anOpengl1.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, this.anInt5168, GL.GL_TEXTURE_2D, 0, 0);
		this.anInt5168 = -1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
	public void method4740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass19_Sub1_40.anOpengl1.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, arg0, arg1, this.anInt6881, 0);
		this.anInt5168 = arg0;
	}
}
