import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static593 {

	@OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
	public static int anInt8763 = 0;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "(I)I")
	public static int method7779() {
		return Static448.anInt6796 == 1 ? Static571.anInt8534 : Static252.anInt4078;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BZI)Ljava/lang/String;")
	public static String method7780(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		return arg0 && arg1 >= 0 ? Static102.method2027(false, arg1, 10, arg0) : Integer.toString(arg1);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I")
	public static int method7781(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
