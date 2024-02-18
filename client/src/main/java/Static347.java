import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_146 = new Class225(47, 4);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZ)V")
	public static void method5094(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static132.aBooleanArray5[arg0]) {
			Static666.aClass330_118.method7605(arg0);
			Static453.aClass158ArrayArray2[arg0] = null;
			Static148.aClass158ArrayArray1[arg0] = null;
			Static132.aBooleanArray5[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Lclient!pha;")
	public static Class291 method5095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static334.aClass291ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(33) boolean local33 = Static334.aClass291ArrayArrayArray1[0][arg1][arg2] != null && Static334.aClass291ArrayArrayArray1[0][arg1][arg2].aClass291_1 != null;
			if (local33 && arg0 >= Static299.anInt4824 - 1) {
				return null;
			}
			Static527.method7084(arg0, arg1, arg2);
		}
		return Static334.aClass291ArrayArrayArray1[arg0][arg1][arg2];
	}
}
