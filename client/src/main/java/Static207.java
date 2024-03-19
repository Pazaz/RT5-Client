import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "[I")
	public static int[] anIntArray360;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
	public static int anInt4792 = -1;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
	public static int anInt4798 = 64;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIB)V")
	public static void method4112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static180.anInt4240 <= arg0 && arg0 <= Static197.anInt4520) {
			@Pc(13) int local13 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3);
			@Pc(19) int local19 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg2);
			Static272.method4898(local13, arg0, local19, arg1);
		}
	}
}
