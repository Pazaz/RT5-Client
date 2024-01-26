import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class51_Sub2 extends Class51 implements Interface8 {

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!tca;IZ[[I)V")
	public Class51_Sub2(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static172.aClass92_8, Static702.aClass397_16, arg1 * 6 * arg1, arg2);
		super.aClass19_Sub1_Sub2_12.method8088(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8636(local22 + 34069, arg3[local22], arg1, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + OpenGL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, 0, this.method8631(), arg1, arg1, 0, Static468.method7644(super.aClass92_14), super.aClass19_Sub1_Sub2_12.anInt9277, arg3[local22], 0);
			}
		}
	}
}
