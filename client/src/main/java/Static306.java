import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!jn", name = "P", descriptor = "S")
	public static short aShort59 = 32767;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method4476(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -87) {
			aShort59 = -52;
		}
		@Pc(12) long local12 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 *= 37L;
			@Pc(26) char local26 = arg0.charAt(local17);
			if (local26 >= 'A' && local26 <= 'Z') {
				local12 += (long) (local26 + 1 - 65);
			} else if (local26 >= 'a' && local26 <= 'z') {
				local12 += (long) (local26 + 1 - 97);
			} else if (local26 >= '0' && local26 <= '9') {
				local12 += (long) (local26 + 27 - 48);
			}
			if (local12 >= 177917621779460413L) {
				break;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}
}
