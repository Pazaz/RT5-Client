import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static151 {

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "F")
	public static float aFloat218;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!lha;")
	public static Class226 aClass226_20 = new Class226();

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	public static void method9291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static470.method6387()) {
			return;
		}
		Static470.anInt7113 = arg1;
		if (Static129.anInt2409 != arg0) {
			Static319.aString51 = "";
		}
		Static129.anInt2409 = arg0;
		Static81.method1586(6);
	}
}
