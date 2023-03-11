import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_18 = new Class145(64, -1);

	@OriginalMember(owner = "client!ao", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[128][128];

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "(I)V")
	public static void method345() {
		Static335.aClass98_57.method2621();
		Static124.aClass98_63.method2621();
		Static333.aClass98_65.method2621();
		Static297.aClass98_44.method2621();
		Static288.aClass98_42.method2621();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)I")
	public static int method346(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
