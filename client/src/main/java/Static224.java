import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static224 {

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
	public static int anInt5350;

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "[I")
	public static final int[] anIntArray394 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method4550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg1 + arg3 && arg1 < arg2 + arg5) {
			return arg0 < arg7 + arg6 && arg7 < arg0 + arg4;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(Z)V")
	public static void method4551() {
		if (Static43.anInt1466 > 0) {
			Static54.method1385();
		} else {
			Static289.aClass42_5 = Static31.aClass42_1;
			Static31.aClass42_1 = null;
			Static276.method4934(40);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(CB)Z")
	public static boolean method4552(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
