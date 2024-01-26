import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static278 {

	@OriginalMember(owner = "client!in", name = "I", descriptor = "J")
	public static long aLong144;

	@OriginalMember(owner = "client!in", name = "M", descriptor = "[I")
	public static int[] anIntArray350 = new int[32];

	@OriginalMember(owner = "client!in", name = "J", descriptor = "[I")
	public static int[] anIntArray351 = new int[4096];

	@OriginalMember(owner = "client!in", name = "R", descriptor = "Lclient!ss;")
	public static Class345 aClass345_57 = new Class345(36, -1);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZD)V")
	public static void method4068(@OriginalArg(1) double arg0) {
		Static203.aClass73_4.method7128(Static420.aClass73_7);
		Static203.aClass73_4.method7134(0, 0, (int) arg0);
		Static74.aClass19_4.method8000(Static203.aClass73_4);
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(II)Z")
	public static boolean method4070(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
