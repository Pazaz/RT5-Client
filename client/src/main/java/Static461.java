import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static461 {

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "[I")
	public static final int[] anIntArray555 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!oja", name = "c", descriptor = "Z")
	public static boolean aBoolean529 = false;

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(II)I")
	public static int method6268(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
