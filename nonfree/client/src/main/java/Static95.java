import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!cw", name = "C", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method1894(@OriginalArg(1) String arg0) {
		@Pc(12) int local12 = arg0.length();
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			local14 = (local14 << 5) + Static41.method1028(arg0.charAt(local16)) - local14;
		}
		return local14;
	}
}
