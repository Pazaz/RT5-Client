import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "B")
	public static byte aByte25;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Lclient!jd;")
	public static Class13 aClass13_7;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!bh;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_16 = new Class98(64);

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

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public static void method2378() {
		if (Static215.aString33.toLowerCase().indexOf("microsoft") != -1) {
			Static239.anIntArray285[191] = 73;
			Static239.anIntArray285[221] = 43;
			Static239.anIntArray285[222] = 59;
			Static239.anIntArray285[188] = 71;
			Static239.anIntArray285[186] = 57;
			Static239.anIntArray285[219] = 42;
			Static239.anIntArray285[189] = 26;
			Static239.anIntArray285[223] = 28;
			Static239.anIntArray285[190] = 72;
			Static239.anIntArray285[187] = 27;
			Static239.anIntArray285[192] = 58;
			Static239.anIntArray285[220] = 74;
			return;
		}
		Static239.anIntArray285[59] = 57;
		Static239.anIntArray285[45] = 26;
		Static239.anIntArray285[47] = 73;
		Static239.anIntArray285[93] = 43;
		Static239.anIntArray285[46] = 72;
		Static239.anIntArray285[44] = 71;
		Static239.anIntArray285[91] = 42;
		if (Static215.aMethod1 == null) {
			Static239.anIntArray285[192] = 58;
			Static239.anIntArray285[222] = 59;
		} else {
			Static239.anIntArray285[520] = 59;
			Static239.anIntArray285[222] = 58;
			Static239.anIntArray285[192] = 28;
		}
		Static239.anIntArray285[92] = 74;
		Static239.anIntArray285[61] = 27;
	}
}
