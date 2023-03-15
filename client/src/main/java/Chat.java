import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class Chat {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void add(@OriginalArg(1) String arg0) {
		Static33.method4200("", 0, arg0, 0, "");
	}

}
