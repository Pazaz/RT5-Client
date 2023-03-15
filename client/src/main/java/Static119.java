import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Lclient!jd;")
	public static Sprite aClass13_7;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!bh;")
	public static Environment aClass21_1;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_16 = new LruHashTable(64);

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "[I")
	public static final int[] anIntArray152 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIII)V")
	public static void method2377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static28.anInt675 <= arg0 && Static82.anInt1837 >= arg2 && arg5 >= Static365.anInt6832 && arg1 <= Static161.anInt2954) {
			if (arg3 == 1) {
				Static389.method4487(arg0, arg2, arg5, arg1, arg4);
			} else {
				Static51.method1547(arg3, arg0, arg1, arg4, arg2, arg5);
			}
		} else if (arg3 == 1) {
			Static238.method4123(arg2, arg5, arg4, arg1, arg0);
		} else {
			Static185.method3401(arg1, arg3, arg5, arg2, arg0, arg4);
		}
	}

}
