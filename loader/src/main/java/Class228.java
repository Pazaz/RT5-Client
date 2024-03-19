import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!va")
public final class Class228 {

	@OriginalMember(owner = "loader!va", name = "a", descriptor = "J")
	private static long aLong239;

	@OriginalMember(owner = "loader!va", name = "b", descriptor = "J")
	private static long aLong240;

	@OriginalMember(owner = "loader!va", name = "a", descriptor = "(I)J")
	public static synchronized long method6243() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong239) {
			aLong240 += aLong239 - local6;
		}
		aLong239 = local6;
		return local6 + aLong240;
	}
}
