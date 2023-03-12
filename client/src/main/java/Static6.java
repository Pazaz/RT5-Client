import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "[I")
	public static final int[] anIntArray4 = new int[13];

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	public static int anInt158 = 0;

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
	public static int anInt159 = 0;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)Lclient!nk;")
	public static Class161 method140(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static26.aClass161ArrayArray1[local15] == null || Static26.aClass161ArrayArray1[local15][local19] == null) {
			@Pc(33) boolean local33 = Static222.method3916(local15);
			if (!local33) {
				return null;
			}
		}
		return Static26.aClass161ArrayArray1[local15][local19];
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBII)V")
	public static void method141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(43) String local43 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local43);
		Cheat.execute(local43, true);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!nk;III)V")
	public static void method142(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Static330.aBoolean419) {
			@Pc(12) String local12;
			for (@Pc(5) int local5 = 9; local5 >= 5; local5--) {
				local12 = Static284.method4883(arg0, local5);
				if (local12 != null) {
					Static1.method3(arg0.anInt4300, true, arg0.anInt4317, false, local12, arg0.anInt4297, 1011, arg0.aString45, Static274.method4631(arg0, local5), (long) (local5 + 1));
				}
			}
			local12 = Static163.method3104(arg0);
			if (local12 != null) {
				Static1.method3(arg0.anInt4300, true, arg0.anInt4317, false, local12, arg0.anInt4297, 49, arg0.aString45, arg0.anInt4260, 0L);
			}
			for (@Pc(75) int local75 = 4; local75 >= 0; local75--) {
				@Pc(82) String local82 = Static284.method4883(arg0, local75);
				if (local82 != null) {
					Static1.method3(arg0.anInt4300, true, arg0.anInt4317, false, local82, arg0.anInt4297, 45, arg0.aString45, Static274.method4631(arg0, local75), (long) (local75 + 1));
				}
			}
			if (Static45.method1404(arg0).method1855()) {
				if (arg0.aString46 == null) {
					Static1.method3(arg0.anInt4300, true, arg0.anInt4317, false, Static262.aClass79_145.method2267(client.language), arg0.anInt4297, 30, "", -1, 0L);
				} else {
					Static1.method3(arg0.anInt4300, true, arg0.anInt4317, false, arg0.aString46, arg0.anInt4297, 30, "", -1, 0L);
				}
			}
		} else if (Static45.method1404(arg0).method1851() && (Static115.anInt3837 & 0x20) != 0) {
			Static1.method3(arg0.anInt4300, true, arg0.anInt4317, false, Static91.aString18, arg0.anInt4297, 11, Static371.aString68 + " -> " + arg0.aString45, Static41.anInt1044, 0L);
		}
	}

}
