import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static220 {

	@OriginalMember(owner = "client!om", name = "d", descriptor = "[S")
	public static short[] aShortArray89;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "I")
	public static int anInt4995;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "Lclient!qj;")
	public static Class162 aClass162_178;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "F")
	public static float aFloat63 = 0.0F;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static239.anInt5299 <= arg5 && arg2 <= Static179.anInt4229 && Static180.anInt4240 <= arg0 && arg6 <= Static197.anInt4520) {
			Static108.method2246(arg4, arg3, arg0, arg2, arg5, arg1, arg6);
		} else {
			Static233.method4438(arg1, arg6, arg3, arg5, arg0, arg2, arg4);
		}
	}
}
