import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static510 {

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
	public static int anInt7639;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "([Ljava/lang/Object;[IB)V")
	public static void method6763(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static441.method5966(arg1.length - 1, 0, arg1, arg0);
	}
}
