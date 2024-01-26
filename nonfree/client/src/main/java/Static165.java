import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static165 {

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public static int anInt2810;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method2607() {
		if (Static117.anInt2282 == -1 || Static102.anInt2129 == -1) {
			return;
		}
		if (Static117.anInt2282 == 1 || Static117.anInt2282 == 3 || Static117.anInt2282 != Static102.anInt2129 && (Static117.anInt2282 == 0 || Static102.anInt2129 == 0)) {
			Static390.anInt6126 = 0;
			Static416.anInt6378 = 0;
			Static18.aClass28_2.method737();
		}
		Static102.anInt2129 = Static117.anInt2282;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBIIII)V")
	public static void method2608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static400.aClass2_Sub34_28.aClass57_Sub25_3.method7208() != 0 && arg3 != 0 && Static33.anInt779 < 50 && arg2 != -1) {
			Static409.aClass104Array1[Static33.anInt779++] = new Class104((byte) 1, arg2, arg3, arg1, arg0, arg5, arg4, (Class8_Sub2) null);
		}
	}
}
