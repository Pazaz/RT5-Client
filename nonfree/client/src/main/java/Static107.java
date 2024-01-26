import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!tt;")
	public static Class73 aClass73_3;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
	public static int anInt2161 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	public static byte[] method2054(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(27) int local27 = local6 + 3 & 0xFFFFFFFC;
		@Pc(33) int local33 = local27 / 4 * 3;
		if (local27 - 2 >= local6 || Static204.method3081(arg0.charAt(local27 - 2)) == -1) {
			local33 -= 2;
		} else if (local6 <= local27 - 1 || Static204.method3081(arg0.charAt(local27 - 1)) == -1) {
			local33--;
		}
		@Pc(84) byte[] local84 = new byte[local33];
		Static200.method2980(arg0, local84, 0);
		return local84;
	}
}
