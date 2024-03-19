import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!tp", name = "D", descriptor = "Lclient!qj;")
	public static Class162 aClass162_221;

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
	public static int anInt6435 = 0;

	@OriginalMember(owner = "client!tp", name = "E", descriptor = "[I")
	public static final int[] anIntArray494 = new int[50];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIZI)I")
	public static int method5419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg1;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}
}
