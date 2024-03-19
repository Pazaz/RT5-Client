import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "Lclient!qj;")
	public static Class162 aClass162_70;

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
	public static int anInt1925;

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
	public static int anInt1927;

	@OriginalMember(owner = "client!oc", name = "C", descriptor = "Lclient!we;")
	public static final Class215 aClass215_28 = new Class215(8);

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "[I")
	public static final int[] anIntArray126 = new int[6];

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString72 = "Loading sprites - ";

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	public static void method1621(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0];
		@Pc(13) int local13 = Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0];
		if (Static199.anInt4559 == 1) {
			if (!Static328.method5704(-2, arg1, 0, arg0, 1, local8, local13, 0, 1, false)) {
				Static328.method5704(-3, arg1, 0, arg0, 1, local8, local13, 0, 1, false);
			}
		} else if (!Static328.method5704(-3, arg1, 0, arg0, 1, local8, local13, 0, 1, false)) {
			Static328.method5704(-2, arg1, 0, arg0, 1, local8, local13, 0, 1, false);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZIB)Ljava/lang/String;")
	public static String method1622(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(41) int local41 = 2;
		for (@Pc(45) int local45 = arg0 / 10; local45 != 0; local45 /= 10) {
			local41++;
		}
		@Pc(57) char[] local57 = new char[local41];
		local57[0] = '+';
		for (@Pc(65) int local65 = local41 - 1; local65 > 0; local65--) {
			@Pc(69) int local69 = arg0;
			arg0 /= 10;
			@Pc(80) int local80 = local69 - arg0 * 10;
			if (local80 >= 10) {
				local57[local65] = (char) (local80 + 87);
			} else {
				local57[local65] = (char) (local80 + 48);
			}
		}
		return new String(local57);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIBIII)V")
	public static void method1623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg2) {
			Static19.method474(arg0, arg2, arg4, arg3);
		} else if (Static239.anInt5299 <= arg0 - arg2 && Static179.anInt4229 >= arg2 + arg0 && Static180.anInt4240 <= arg4 - arg1 && Static197.anInt4520 >= arg4 + arg1) {
			Static117.method2578(arg0, arg2, arg1, arg3, arg4);
		} else {
			Static58.method1403(arg3, arg1, arg2, arg4, arg0);
		}
	}
}
