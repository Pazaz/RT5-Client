import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!il", name = "r", descriptor = "I")
	public static int anInt4424;

	@OriginalMember(owner = "client!il", name = "s", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray4;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "Lclient!rt;")
	public static Class327 aClass327_2;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method3979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg0 + arg3 && arg0 < arg2 + arg1) {
			return arg6 + arg4 > arg5 && arg6 < arg7 + arg5;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BILclient!ha;)Lclient!ve;")
	public static Class381 method3980(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(18) Class70 local18 = Static502.method6719(true, arg1, true, arg0);
		return local18 == null ? null : local18.aClass381_5;
	}
}
