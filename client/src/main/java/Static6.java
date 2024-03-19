import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public static int anInt211 = -2;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[8];

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
	public static int anInt219 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	public static void method170() {
		Static145.aClass215_54.method6052();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBLclient!dr;ZILclient!nr;I)V")
	public static void method171(@OriginalArg(0) int arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class40 arg4, @OriginalArg(6) int arg5) {
		if (arg2) {
			Static134.aClass29_12.method5845((Static107.anInt2674 - Static134.aClass29_12.method5850()) / 2, (Static350.anInt7318 - Static134.aClass29_12.method5832()) / 2);
			Static22.aClass29_1.method5845((Static107.anInt2674 - Static22.aClass29_1.method5850()) / 2, 18);
		}
		arg1.method4831(-1, ~Static199.anInt4559 == -2 ? Static21.aString28 : Static290.aString227, arg0, Static107.anInt2674 / 2, Static350.anInt7318 / 2 - 26);
		@Pc(57) int local57 = Static350.anInt7318 / 2 - 18;
		arg4.method2712(Static107.anInt2674 / 2 - 152, local57, 304, 34, arg5, 0);
		arg4.method2712(Static107.anInt2674 / 2 - 151, local57 - -1, 302, 32, 0, 0);
		arg4.method2717(Static107.anInt2674 / 2 - 150, local57 + 2, Static12.anInt529 * 3, 30, arg3, 0);
		arg4.method2717(Static107.anInt2674 / 2 + Static12.anInt529 * 3 - 150, local57 + 2, 300 - Static12.anInt529 * 3, 30, 0, 0);
		arg1.method4831(-1, Static124.aString112, arg0, Static107.anInt2674 / 2, Static350.anInt7318 / 2 + 4);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!nr;I)V")
	public static void method172(@OriginalArg(0) Class40 arg0) {
		if (Static17.aClass130_3.method3752() == 0) {
			return;
		}
		@Pc(67) Class1_Sub24 local67;
		if (Static130.anInt6754 == 0 || Static130.anInt6754 == 2) {
			for (local67 = (Class1_Sub24) Static17.aClass130_3.method3749(); local67 != null; local67 = (Class1_Sub24) Static17.aClass130_3.method3756()) {
				Static110.method2667(local67.anInt4495, arg0, Static321.aClass30_4, local67.anInt4491, false, false, local67.anInt4490, local67.anInt4493, local67.aBoolean317 ? Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2 : null, local67.anInt4496, arg0);
				local67.method6172();
			}
			Static102.method2127();
			return;
		}
		if (Static21.aClass40_1 == null) {
			@Pc(37) Canvas local37 = new Canvas();
			local37.setSize(36, 32);
			Static21.aClass40_1 = Static211.method2701(0, Static184.aClass199_12, local37, 0, Static65.anInterface4_2);
			Static77.aClass30_1 = Static21.aClass40_1.method2768(Static230.method4379(Static251.aClass162_194, Static292.anInt6119), Static363.method3883(Static203.aClass162_47, Static292.anInt6119));
		}
		for (local67 = (Class1_Sub24) Static17.aClass130_3.method3749(); local67 != null; local67 = (Class1_Sub24) Static17.aClass130_3.method3756()) {
			Static110.method2667(local67.anInt4495, arg0, Static77.aClass30_1, local67.anInt4491, false, false, local67.anInt4490, local67.anInt4493, local67.aBoolean317 ? Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2 : null, local67.anInt4496, Static21.aClass40_1);
			local67.method6172();
		}
	}
}
