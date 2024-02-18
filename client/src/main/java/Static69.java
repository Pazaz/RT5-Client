import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static69 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z")
	public static boolean method6333(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static335.method4946(arg1, arg0) & Static652.method8532(arg0, arg1);
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(III)Z")
	public static boolean method6335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
