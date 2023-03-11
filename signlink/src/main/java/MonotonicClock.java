import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!lt")
public final class MonotonicClock {

	@OriginalMember(owner = "loader!lt", name = "b", descriptor = "J")
	private static long aLong233;

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "J")
	private static long aLong234;

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(I)J")
	public static synchronized long currentTimeMillis() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong233 > local1) {
			aLong234 += aLong233 - local1;
		}
		aLong233 = local1;
		return aLong234 + local1;
	}
}
