import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!pe", name = "Y", descriptor = "[I")
	public static final int[] anIntArray334 = new int[64];

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I")
	public static int method4498(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Lclient!f;")
	public static Class67 method4500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Scene.aClass67ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Scene.aClass67ArrayArrayArray3[0][arg1][arg2] != null && Scene.aClass67ArrayArrayArray3[0][arg1][arg2].aClass67_1 != null;
			if (local28 && arg0 >= Scene.anInt1914 - 1) {
				return null;
			}
			Static237.method4119(arg0, arg1, arg2);
		}
		return Scene.aClass67ArrayArrayArray3[arg0][arg1][arg2];
	}
}
