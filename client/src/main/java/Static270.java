import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!iia", name = "q", descriptor = "I")
	public static int anInt4354;

	@OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
	public static int anInt4355;

	@OriginalMember(owner = "client!iia", name = "m", descriptor = "Lclient!fca;")
	public static Class123 aClass123_2 = null;

	@OriginalMember(owner = "client!iia", name = "o", descriptor = "Lclient!od;")
	public static final Class272 aClass272_1 = new Class272();

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZI)V")
	public static void method3920(@OriginalArg(0) boolean arg0) {
		if (Static110.aString19.length() == 0) {
			return;
		}
		Static79.method1579("--> " + Static110.aString19);
		Static231.method3381(false, arg0, Static110.aString19);
		Static625.anInt9472 = 0;
		if (!arg0) {
			Static594.anInt8776 = 0;
			Static110.aString19 = "";
		}
	}
}
