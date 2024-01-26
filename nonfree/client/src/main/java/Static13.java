import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aha", name = "l", descriptor = "I")
	public static int anInt148;

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "Lclient!st;")
	public static Class23 aClass23_4;

	@OriginalMember(owner = "client!aha", name = "p", descriptor = "I")
	public static int anInt150 = 0;

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)V")
	public static void method158() {
		for (@Pc(7) int local7 = 0; local7 < Static390.anInt6126; local7++) {
			@Pc(13) int local13 = Static103.anIntArray187[local7];
			@Pc(20) Class2_Sub45 local20 = (Class2_Sub45) Static18.aClass28_2.method738((long) local13);
			if (local20 != null) {
				@Pc(25) Class8_Sub2_Sub1_Sub2_Sub2 local25 = local20.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				Static489.method6547(false, local25);
			}
		}
	}
}
