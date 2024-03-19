import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "J")
	private static long aLong205;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "J")
	private static long aLong206;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)J")
	public static synchronized long method5658() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong205 > local1) {
			aLong206 += aLong205 - local1;
		}
		aLong205 = local1;
		return local1 + aLong206;
	}
}
