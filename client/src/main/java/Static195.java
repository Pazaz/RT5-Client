import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "Lclient!r;")
	public static Class197 aClass197_54;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "[I")
	public static final int[] anIntArray211 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIB)V")
	public static void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class21 local13 = Static332.aClass21ArrayArray3[arg0][arg1];
		if (local13 != null) {
			Static97.anInt2040 = local13.anInt632;
			Static139.anInt2593 = local13.anInt640;
			Static114.anInt2346 = local13.anInt636;
		}
		Static291.method5029();
	}
}
