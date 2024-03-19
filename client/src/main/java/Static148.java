import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
	public static int anInt3661;

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "Lclient!qj;")
	public static Class162 aClass162_127;

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
	public static int anInt3664;

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
	public static int anInt3660 = 0;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)I")
	public static int method3221(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (local19 * arg0 >> 12) + 40960;
		return local27 * local13 >> 12;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIZIIII)V")
	public static void method3222(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class2_Sub8 local10 = (Class2_Sub8) Static44.aClass58_3.method1672(); local10 != null; local10 = (Class2_Sub8) Static44.aClass58_3.method1675()) {
			if (local10.anInt6839 <= Static197.anInt4521) {
				local10.method5802();
			} else {
				Static73.method1722((local10.anInt6844 << 7) + 64, arg2 >> 1, arg3 >> 1, local10.anInt6842 * 2, (local10.anInt6841 << 7) + 64);
				Static150.aClass30_2.method4831(0, local10.aString260, local10.anInt6837 | 0xFF000000, Static47.anIntArray96[0] + arg0, arg1 - -Static47.anIntArray96[1]);
			}
		}
	}
}
