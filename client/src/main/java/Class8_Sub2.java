import jaggl.opengl;
import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
	private final int anInt2600;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!bf;II[BI)V")
	public Class8_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt2600 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl1;
		this.aClass19_Sub1_40.method848(this);
		local12.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, GL.GL_LINES);
		local12.glTexImage1D(this.anInt6882, 0, this.anInt6883, this.anInt2600, 0, arg4, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, GL.GL_TRIANGLES);
		this.method6160(true);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)V")
	public void method2611() {
		@Pc(3) opengl local3 = this.aClass19_Sub1_40.anOpengl1;
		this.aClass19_Sub1_40.method848(this);
		local3.glTexParameteri(this.anInt6882, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "()V")
	@Override
	public void method6152() {
	}
}
