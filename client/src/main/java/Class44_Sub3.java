import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
	private int anInt5998;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	public final int anInt5999;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!ih;IIZ[[I)V")
	public Class44_Sub3(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass40_Sub2_37.anOpengl1;
		this.anInt5999 = arg2;
		this.aClass40_Sub2_37.method2882(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static48.method5448(local14, local25 + 34069, this.anInt6476, arg2, arg2, this.aClass40_Sub2_37.anInt3233, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt6476, arg2, arg2, 0, 32993, this.aClass40_Sub2_37.anInt3233, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method5455(true);
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!ih;IIZ[[BI)V")
	public Class44_Sub3(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass40_Sub2_37.anOpengl1;
		this.anInt5999 = arg2;
		this.aClass40_Sub2_37.method2882(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6476, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method5455(true);
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!ih;II)V")
	public Class44_Sub3(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass40_Sub2_37.anOpengl1;
		this.anInt5999 = arg2;
		this.aClass40_Sub2_37.method2882(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6476, arg2, arg2, 0, 32993, this.aClass40_Sub2_37.anInt3233, null);
		}
		this.method5455(true);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V")
	public void method5076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass40_Sub2_37.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt6478, 0);
		this.anInt5998 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
	@Override
	public void method6123() {
		this.aClass40_Sub2_37.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt5998, 3553, 0, 0);
		this.anInt5998 = -1;
	}
}
