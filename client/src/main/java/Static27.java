import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Lclient!je;")
	public static Class113 aClass113_2;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)I")
	public static int method870(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(42) int local42 = (arg0 & 0x7F) * 96 >> 7;
			if (local42 < 2) {
				local42 = 2;
			} else if (local42 > 126) {
				local42 = 126;
			}
			return (arg0 & 0xFF80) + local42;
		}
	}

}
