import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class ThreadUtils {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IJ)V")
	public static void sleep(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static270.method4553(arg0 - 1L);
			Static270.method4553(1L);
		} else {
			Static270.method4553(arg0);
		}
	}

}
