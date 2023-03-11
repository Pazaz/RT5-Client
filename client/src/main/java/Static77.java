import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
	public static int anInt1756;

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
	public static int anInt1751 = 0;

	@OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
	public static int anInt1762 = 0;

	@OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
	public static int anInt1763 = -1;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
	public static void method1856(@OriginalArg(0) int arg0) {
		Static66.anInt1624 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static72.anInt1684; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static210.anInt3773; local6++) {
				if (Static330.aClass67ArrayArrayArray3[arg0][local3][local6] == null) {
					Static330.aClass67ArrayArrayArray3[arg0][local3][local6] = new Class67(arg0, local3, local6);
				}
			}
		}
	}
}
