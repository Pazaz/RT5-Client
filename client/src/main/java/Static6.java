import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "[I")
	public static final int[] anIntArray4 = new int[13];

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	public static int anInt158 = 0;

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
	public static int anInt159 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!nk;III)V")
	public static void method142(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Static330.aBoolean419) {
			@Pc(12) String local12;
			for (@Pc(5) int local5 = 9; local5 >= 5; local5--) {
				local12 = Static284.method4883(arg0, local5);
				if (local12 != null) {
					Static1.method3(arg0.objId, true, arg0.id, false, local12, arg0.activeComponentId, 1011, arg0.aString45, Static274.method4631(arg0, local5), (long) (local5 + 1));
				}
			}
			local12 = Static163.method3104(arg0);
			if (local12 != null) {
				Static1.method3(arg0.objId, true, arg0.id, false, local12, arg0.activeComponentId, 49, arg0.aString45, arg0.anInt4260, 0L);
			}
			for (@Pc(75) int local75 = 4; local75 >= 0; local75--) {
				@Pc(82) String local82 = Static284.method4883(arg0, local75);
				if (local82 != null) {
					Static1.method3(arg0.objId, true, arg0.id, false, local82, arg0.activeComponentId, 45, arg0.aString45, Static274.method4631(arg0, local75), (long) (local75 + 1));
				}
			}
			if (Static45.method1404(arg0).method1855()) {
				if (arg0.aString46 == null) {
					Static1.method3(arg0.objId, true, arg0.id, false, Static262.aClass79_145.getLocalized(client.language), arg0.activeComponentId, 30, "", -1, 0L);
				} else {
					Static1.method3(arg0.objId, true, arg0.id, false, arg0.aString46, arg0.activeComponentId, 30, "", -1, 0L);
				}
			}
		} else if (Static45.method1404(arg0).method1851() && (Static115.anInt3837 & 0x20) != 0) {
			Static1.method3(arg0.objId, true, arg0.id, false, Static91.aString18, arg0.activeComponentId, 11, Static371.aString68 + " -> " + arg0.aString45, Static41.anInt1044, 0L);
		}
	}

}
