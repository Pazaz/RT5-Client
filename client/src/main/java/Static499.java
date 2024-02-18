import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static499 {

	@OriginalMember(owner = "client!pn", name = "kb", descriptor = "I")
	public static int anInt7492;

	@OriginalMember(owner = "client!pn", name = "bb", descriptor = "[I")
	public static final int[] anIntArray605 = new int[8];

	@OriginalMember(owner = "client!pn", name = "P", descriptor = "I")
	public static int anInt7501 = 0;

	@OriginalMember(owner = "client!pn", name = "db", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(CZ)C")
	public static char method6670(@OriginalArg(0) char arg0) {
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
