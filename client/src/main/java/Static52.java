import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static52 {

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
	public static int anInt1577;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "[I")
	public static final int[] anIntArray101 = new int[1000];

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "Z")
	public static boolean aBoolean106 = true;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)V")
	public static void method1370(@OriginalArg(0) int arg0) {
		Static332.anInt6876 = 1000 / arg0;
	}
}
