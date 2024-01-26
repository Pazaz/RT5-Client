import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "Lclient!qp;")
	public static Class310 aClass310_2;

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "[I")
	public static final int[] anIntArray683 = new int[3];

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)V")
	public static void method7572() {
		if (Static163.aClass19_17.method7978()) {
			Static163.aClass19_17.method7972(Static434.aCanvas7);
			Static208.method3106();
			if (Static137.aBoolean210) {
				Static720.method9397(Static434.aCanvas7);
			} else {
				@Pc(26) Dimension local26 = Static434.aCanvas7.getSize();
				Static163.aClass19_17.method8022(Static434.aCanvas7, local26.width, local26.height);
			}
			Static163.aClass19_17.method8019(Static434.aCanvas7);
		} else {
			Static32.method880(Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915(), false);
		}
		Static469.method6362();
		Static75.aBoolean521 = true;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Z")
	public static boolean method7573() {
		Static334.anInt5456++;
		Static252.aBoolean316 = true;
		return true;
	}
}
