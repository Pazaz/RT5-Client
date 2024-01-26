import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static428 {

	@OriginalMember(owner = "client!nia", name = "n", descriptor = "I")
	public static int anInt6487;

	@OriginalMember(owner = "client!nia", name = "e", descriptor = "[I")
	public static final int[] anIntArray517 = new int[4096];

	@OriginalMember(owner = "client!nia", name = "o", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_167 = new Class225(123, 1);

	@OriginalMember(owner = "client!nia", name = "x", descriptor = "I")
	public static int anInt6495 = 0;

	@OriginalMember(owner = "client!nia", name = "v", descriptor = "Z")
	public static boolean aBoolean487 = false;

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!hla;I)I")
	public static int method5796(@OriginalArg(0) Class168 arg0) {
		if (arg0 == Static189.aClass168_2) {
			return 5890;
		} else if (Static207.aClass168_4 == arg0) {
			return 34167;
		} else if (Static188.aClass168_1 == arg0) {
			return 34168;
		} else if (arg0 == Static454.aClass168_5) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
