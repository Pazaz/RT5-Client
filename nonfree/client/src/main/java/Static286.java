import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static286 {

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
	public static int anInt4592;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "[I")
	public static int[] anIntArray358;

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_117 = new Class225(32, -1);

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_118 = new Class225(95, 6);

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "Lclient!av;")
	public static final Class28 aClass28_23 = new Class28(32);

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)Z")
	public static boolean method4110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static710.method6713(arg0, arg1) & Static240.method3483(arg1, arg0);
	}
}
