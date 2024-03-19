import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class44_Sub4 extends Class44 {

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
	private final int anInt6480;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!ih;II[BI)V")
	public Class44_Sub4(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt6480 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl1;
		this.aClass40_Sub2_37.method2882(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt6479, 0, this.anInt6476, this.anInt6480, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method5455(true);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
	public void method5460() {
		@Pc(3) opengl local3 = this.aClass40_Sub2_37.anOpengl1;
		this.aClass40_Sub2_37.method2882(this);
		local3.glTexParameteri(this.anInt6479, 10242, 33071);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
	@Override
	public void method6123() {
	}
}
