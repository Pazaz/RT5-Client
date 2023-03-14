import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static82 {

	@OriginalMember(owner = "client!em", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public static int anInt1835 = 0;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "[I")
	public static final int[] anIntArray120 = new int[13];

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	public static int anInt1837 = 100;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZIZ)V")
	public static void method1902(@OriginalArg(0) boolean arg0) {
		Static173.anInt3338--;
		if (Static173.anInt3338 == 0) {
			Static181.anIntArray204 = null;
		}
		if (!arg0) {
			return;
		}
		Static81.anInt3709--;
		if (Static81.anInt3709 == 0) {
			Static59.anIntArray107 = null;
		}
	}

}
