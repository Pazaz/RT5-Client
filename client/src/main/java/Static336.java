import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!vo", name = "R", descriptor = "[Lclient!gm;")
	public static Class77[] aClass77Array3;

	@OriginalMember(owner = "client!vo", name = "S", descriptor = "[I")
	public static int[] anIntArray571;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)V")
	public static void method5946() {
		Static351.aClass215_101.method6052();
		Static18.aClass215_9.method6052();
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(IIII)V")
	public static void method5947(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1007) {
			Static267.method4820(10, arg2, arg0);
		} else if (arg1 == 1002) {
			Static267.method4820(11, arg2, arg0);
		} else if (arg1 == 1010) {
			Static267.method4820(12, arg2, arg0);
		} else if (arg1 == 1003) {
			Static267.method4820(13, arg2, arg0);
		} else if (arg1 == 1004) {
			Static267.method4820(14, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(IIII)Z")
	public static boolean method5949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface6 local11 = (Interface6) Static56.method1394(arg0, arg2, arg1);
		if (local11 != null) {
			local5 = Static60.method5089(local11) & true;
		}
		local11 = (Interface6) Static95.method2029(arg0, arg2, arg1, Interface6.class);
		if (local11 != null) {
			local5 &= Static60.method5089(local11);
		}
		local11 = (Interface6) Static293.method5174(arg0, arg2, arg1);
		if (local11 != null) {
			local5 &= Static60.method5089(local11);
		}
		return local5;
	}
}
