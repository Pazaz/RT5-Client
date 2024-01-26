import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static596 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIB)Z")
	public static boolean method7814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZC)Z")
	public static boolean method7815(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
