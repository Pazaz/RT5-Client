import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static475 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "[J")
	public static final long[] aLongArray16 = new long[32];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
	public static int anInt7168 = -1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)Z")
	public static boolean method6443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static407.method5627(arg0, arg1) & Static230.method3372(arg1, arg0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)Z")
	public static boolean method6445(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 9 || arg0 == 11;
	}
}
