import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "[I")
	public static final int[] anIntArray604 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
	public static int anInt7379 = 0;

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "[I")
	public static final int[] anIntArray605 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
	public static int anInt7382 = 0;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIB)V")
	public static void method6174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(18) int local18 = arg1 << 3;
		Static188.aFloat17 = local18;
		if (Static303.anInt6342 == 2) {
			Static130.anInt6778 = local3;
			Static89.anInt2374 = local18;
			Static209.anInt4822 = 0;
		}
		Static189.aFloat55 = local3;
		Static273.method4900();
		Static326.aBoolean480 = true;
	}
}
