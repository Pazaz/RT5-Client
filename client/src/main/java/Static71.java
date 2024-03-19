import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!eo", name = "B", descriptor = "I")
	public static int anInt1982 = -1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1666(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static43.anInt1459 >= 100 && !Static15.aBoolean44 || Static43.anInt1459 >= 200) {
			Static293.method5172(Static164.aString148);
			return;
		}
		@Pc(32) String local32 = Static301.method5274(arg0);
		if (local32 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(37) int local37 = 0; local37 < Static43.anInt1459; local37++) {
			@Pc(45) String local45 = Static301.method5274(Static46.aStringArray42[local37]);
			if (local45 != null && local45.equals(local32)) {
				Static293.method5172(arg0 + Static235.aString192);
				return;
			}
			if (Static210.aStringArray29[local37] != null) {
				local72 = Static301.method5274(Static210.aStringArray29[local37]);
				if (local72 != null && local72.equals(local32)) {
					Static293.method5172(arg0 + Static235.aString192);
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Static186.anInt4356; local95++) {
			local72 = Static301.method5274(Static140.aStringArray21[local95]);
			if (local72 != null && local72.equals(local32)) {
				Static293.method5172(Static79.aString167 + arg0 + Static121.aString110);
				return;
			}
			if (Static189.aStringArray27[local95] != null) {
				@Pc(132) String local132 = Static301.method5274(Static189.aStringArray27[local95]);
				if (local132 != null && local132.equals(local32)) {
					Static293.method5172(Static79.aString167 + arg0 + Static121.aString110);
					return;
				}
			}
		}
		if (Static301.method5274(Static264.aClass7_Sub1_Sub1_Sub2_2.aString266).equals(local32)) {
			Static293.method5172(Static77.aString78);
		} else {
			Static150.aClass1_Sub16_Sub2_2.method5793(226);
			Static150.aClass1_Sub16_Sub2_2.method5771(Static279.method4951(arg0));
			Static150.aClass1_Sub16_Sub2_2.method5726(arg0);
		}
	}
}
