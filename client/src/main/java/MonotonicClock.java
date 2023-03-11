import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class MonotonicClock {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "J")
	private static long aLong120;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "J")
	private static long aLong121;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)J")
	public static synchronized long currentTimeMillis() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong121 > local6) {
			aLong120 += aLong121 - local6;
		}
		aLong121 = local6;
		return local6 + aLong120;
	}
}
