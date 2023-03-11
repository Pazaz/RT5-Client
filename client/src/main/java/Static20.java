import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[100];

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	public static int anInt545 = 0;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Lclient!nk;")
	public static Class161 aClass161_1 = null;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method560() {
		for (@Pc(8) int local8 = 0; local8 < Static332.aClass21ArrayArray3.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static332.aClass21ArrayArray3[local8].length; local12++) {
				Static332.aClass21ArrayArray3[local8][local12] = Static119.aClass21_1;
			}
		}
	}
}
