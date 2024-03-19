import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "Lclient!hj;")
	public static Class85 aClass85_1;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
	public static final int anInt800 = -11713997;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
	public static final int anInt801 = 52;

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
	public static int anInt802 = -1;

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "Lclient!mi;")
	public static final Class130 aClass130_4 = new Class130();

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
	public static int anInt803 = 2;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Z")
	public static boolean method587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static261.anIntArrayArrayArray11[arg0][arg1][arg2];
		if (local7 == -Static353.anInt7366) {
			return false;
		} else if (local7 == Static353.anInt7366) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static232.method4426(local22 + 1, Static118.aClass77Array1[arg0].method3986(arg1, arg2), local26 + 1) && Static232.method4426(local22 + 128 - 1, Static118.aClass77Array1[arg0].method3986(arg1 + 1, arg2), local26 + 1) && Static232.method4426(local22 + 128 - 1, Static118.aClass77Array1[arg0].method3986(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static232.method4426(local22 + 1, Static118.aClass77Array1[arg0].method3986(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static261.anIntArrayArrayArray11[arg0][arg1][arg2] = Static353.anInt7366;
				return true;
			} else {
				Static261.anIntArrayArrayArray11[arg0][arg1][arg2] = -Static353.anInt7366;
				return false;
			}
		}
	}
}
