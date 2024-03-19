import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static205 {

	@OriginalMember(owner = "client!nk", name = "Z", descriptor = "Lclient!qj;")
	public static Class162 aClass162_166;

	@OriginalMember(owner = "client!nk", name = "R", descriptor = "[I")
	public static int[] anIntArray358 = new int[2];

	@OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
	public static int anInt4774 = 0;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(CI)C")
	public static char method4096(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
