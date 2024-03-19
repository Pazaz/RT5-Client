import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Lclient!qj;")
	public static Class162 aClass162_84;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "[I")
	public static final int[] anIntArray151 = new int[128];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIILclient!ro;IIII)V")
	public static void method2009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class177 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static327.aBoolean487) {
			Static156.anInt3875 = 32;
		} else {
			Static156.anInt3875 = 0;
		}
		Static327.aBoolean487 = false;
		@Pc(131) int local131;
		if (Static237.anInt5288 != 0) {
			if (arg1 >= arg4 && arg4 + 16 > arg1 && arg6 >= arg0 && arg6 < arg0 + 16) {
				arg2.anInt5806 -= 4;
				Static145.method3188(arg2);
			} else if (arg4 <= arg1 && arg4 + 16 > arg1 && arg6 >= arg3 + arg0 - 16 && arg6 < arg0 + arg3) {
				arg2.anInt5806 += 4;
				Static145.method3188(arg2);
			} else if (arg1 >= arg4 - Static156.anInt3875 && arg1 < arg4 + Static156.anInt3875 + 16 && arg0 + 16 <= arg6 && arg6 < arg0 + arg3 - 16) {
				local131 = (arg3 - 32) * arg3 / arg5;
				if (local131 < 8) {
					local131 = 8;
				}
				@Pc(149) int local149 = arg6 - local131 / 2 - arg0 - 16;
				@Pc(156) int local156 = arg3 - local131 - 32;
				arg2.anInt5806 = local149 * (arg5 - arg3) / local156;
				Static145.method3188(arg2);
				Static327.aBoolean487 = true;
			}
		}
		if (Static91.anInt2408 == 0) {
			return;
		}
		local131 = arg2.anInt5803;
		if (arg1 >= arg4 - local131 && arg6 >= arg0 && arg1 < arg4 + 16 && arg0 + arg3 >= arg6) {
			arg2.anInt5806 += Static91.anInt2408 * 45;
			Static145.method3188(arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!ro;IB)V")
	public static void method2011(@OriginalArg(0) int arg0, @OriginalArg(1) Class177 arg1, @OriginalArg(2) int arg2) {
		Static120.aClass177_7 = arg1;
		Static351.anInt7329 = arg2;
		Static139.anInt3447 = arg0;
	}
}
