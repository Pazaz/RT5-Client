import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static579 {

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString106;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
	public static int method7633(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static166.method2616(arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method7634(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}
}
