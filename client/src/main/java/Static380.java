import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Lclient!sb;")
	public static Class330 aClass330_79;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
	public static int anInt5979;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!hda;B)Ljava/lang/String;")
	public static String method5359(@OriginalArg(0) Class158 arg0) {
		if (Static84.method1661(arg0).method6216() == 0) {
			return null;
		} else if (arg0.aString43 == null || arg0.aString43.trim().length() == 0) {
			return Static103.aBoolean195 ? "Hidden-use" : null;
		} else {
			return arg0.aString43;
		}
	}
}
