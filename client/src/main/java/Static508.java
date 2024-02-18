import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!q", name = "j", descriptor = "Z")
	public static boolean aBoolean582 = false;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	public static int anInt7627 = 0;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	public static void method6750() {
		if (Static665.aClass367ArrayArray1 == null) {
			return;
		}
		for (@Pc(3) int local3 = 0; local3 < Static665.aClass367ArrayArray1.length; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static665.aClass367ArrayArray1[local3].length; local6++) {
				Static665.aClass367ArrayArray1[local3][local6] = Static556.aClass367_2;
			}
		}
	}
}
