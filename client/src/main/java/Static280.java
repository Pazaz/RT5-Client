import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static280 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!qj;")
	public static Class162 aClass162_206;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public static int anInt5955 = 2;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public static int anInt5957 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oq;IIII)V")
	public static void method5028(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static91.method2000(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static328.anInt6717) {
			Static91.method2000(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static91.method2000(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static200.anInt4590) {
			Static91.method2000(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static200.anInt4590) {
			Static91.method2000(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static328.anInt6717 && arg4 <= Static200.anInt4590) {
			Static91.method2000(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static91.method2000(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static328.anInt6717 && arg4 > 0) {
			Static91.method2000(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
