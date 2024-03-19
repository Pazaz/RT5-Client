import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!r", name = "s", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)Z")
	public static boolean method4760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static24.method587(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static232.method4426(local10 + 1, Static118.aClass77Array1[arg0].method3986(arg1, arg2) + arg3, local14 + 1) && Static232.method4426(local10 + 128 - 1, Static118.aClass77Array1[arg0].method3986(arg1 + 1, arg2) + arg3, local14 + 1) && Static232.method4426(local10 + 128 - 1, Static118.aClass77Array1[arg0].method3986(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static232.method4426(local10 + 1, Static118.aClass77Array1[arg0].method3986(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
	public static void method4765() {
		Static116.method2545(Static214.anInt4867);
	}
}
