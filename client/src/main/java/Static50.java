import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!di", name = "e", descriptor = "Lclient!qj;")
	public static Class162 aClass162_56;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "[I")
	public static final int[] anIntArray99 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
	public static void method1357(@OriginalArg(0) int arg0) {
		if (!Static52.aBoolean106) {
			arg0 = -1;
		}
		if (arg0 == Static95.anInt2438) {
			return;
		}
		if (arg0 != -1) {
			@Pc(23) Class149 local23 = Static212.method6173(arg0);
			@Pc(27) Class133 local27 = local23.method4351();
			if (local27 == null) {
				arg0 = -1;
			} else {
				Static184.aClass199_12.method5464(local27.method3892(), local27.method3888(), new Point(local23.anInt5100, local23.anInt5099), local27.method3880(), Static86.aCanvas2);
				Static95.anInt2438 = arg0;
			}
		}
		if (arg0 == -1 && Static95.anInt2438 != -1) {
			Static184.aClass199_12.method5464(null, -1, new Point(), -1, Static86.aCanvas2);
			Static95.anInt2438 = -1;
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
	public static void method1359() {
		if (Static214.anInt4865 == 10 || Static214.anInt4865 == 28) {
			Static181.method3696(Static3.anInt92 >> 10, Static88.anInt2339 >> 10);
		} else {
			Static181.method3696(Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0] >> 3, Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0] >> 3);
		}
		Static64.method1500();
		Static199.method3939();
		Static214.method4181();
		Static252.method4618();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1360(@OriginalArg(1) String arg0) {
		if (Static129.aClass186Array1 != null) {
			Static150.aClass1_Sub16_Sub2_2.method5793(71);
			Static150.aClass1_Sub16_Sub2_2.method5771(Static279.method4951(arg0));
			Static150.aClass1_Sub16_Sub2_2.method5726(arg0);
		}
	}
}
