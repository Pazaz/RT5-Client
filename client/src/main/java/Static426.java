import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "Lclient!cd;")
	public static Class56 aClass56_2;

	@OriginalMember(owner = "client!nha", name = "m", descriptor = "I")
	public static final int anInt940 = -1;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
	public static int anInt941 = 0;

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "Z")
	public static boolean aBoolean72 = true;

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1016(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIBIII)Z")
	public static boolean method1017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg0; local7++) {
			for (@Pc(13) int local13 = arg3; local13 <= arg1; local13++) {
				if (Static341.anIntArrayArray133[local7][local13] == arg4 && Static148.anIntArrayArray64[local7][local13] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(B)Lclient!bd;")
	public static Class2_Sub6_Sub1 method1018() {
		return Static581.aClass2_Sub6_Sub1_3;
	}
}
