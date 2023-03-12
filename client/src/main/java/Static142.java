import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static142 {

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!r;")
	public static Js5 aClass197_37;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	public static int anInt2663;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!ld;")
	public static final LinkedList aClass135_21 = new LinkedList();

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static359.aByteArrayArrayArray16[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static359.aByteArrayArrayArray16[arg2][arg3][arg0] & 0x10) == 0) {
			return Static280.method4767(arg0, arg3, arg2) == arg1;
		} else {
			return false;
		}
	}

}
