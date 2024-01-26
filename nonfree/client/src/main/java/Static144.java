import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)I")
	public static int method2406(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static78.method1570(arg0 + 45365, 4, arg1 + 91923) + (Static78.method1570(arg0 + 10294, 2, arg1 + 37821) - 128 >> 1) + (Static78.method1570(arg0, 1, arg1) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}
}
