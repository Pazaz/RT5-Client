import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
	public static int anInt6727;

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
	public static int anInt6732;

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
	public static int anInt6733 = 0;

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "Z")
	public static boolean aBoolean490 = true;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	public static void method5714() {
		@Pc(7) Class10 local7 = null;
		try {
			@Pc(15) Class145 local15 = Static184.aClass199_12.method5461();
			while (local15.anInt5065 == 0) {
				Static295.method5212(1L);
			}
			if (local15.anInt5065 == 1) {
				local7 = (Class10) local15.anObject6;
				@Pc(42) Class1_Sub16 local42 = new Class1_Sub16(Static88.anInt2334 * 6 + 3);
				local42.method5771(1);
				local42.method5757(Static88.anInt2334);
				for (@Pc(52) int local52 = 0; local52 < Static294.anIntArray469.length; local52++) {
					if (Static56.aBooleanArray5[local52]) {
						local42.method5757(local52);
						local42.method5768(Static294.anIntArray469[local52]);
					}
				}
				local7.method358(local42.aByteArray86, 0, local42.anInt6813);
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local7 != null) {
				local7.method356();
			}
		} catch (@Pc(94) Exception local94) {
		}
		Static49.aLong47 = Static325.method5658();
		Static69.aBoolean134 = false;
	}
}
