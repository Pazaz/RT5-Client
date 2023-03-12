import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static356 {

	@OriginalMember(owner = "client!up", name = "O", descriptor = "I")
	public static int anInt6641;

	@OriginalMember(owner = "client!up", name = "S", descriptor = "[I")
	public static int[] anIntArray462;

	@OriginalMember(owner = "client!up", name = "C", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_10 = new Class36();

	@OriginalMember(owner = "client!up", name = "P", descriptor = "Z")
	public static boolean aBoolean456 = false;

	@OriginalMember(owner = "client!up", name = "R", descriptor = "[I")
	public static final int[] anIntArray461 = new int[14];

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IBI)B")
	public static byte method5956(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
