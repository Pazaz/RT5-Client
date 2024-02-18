import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static455 {

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
	public static int anInt6915 = 1;

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
	public static int anInt6917 = 0;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BII)V")
	public static void method6223(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static536.anInt8149 == 1) {
			Static55.method1217(arg1, Static75.aClass2_Sub2_Sub16_9, arg0);
		} else if (Static536.anInt8149 == 2) {
			if (Static137.aBoolean210) {
				Static572.method7876(Static422.method5771() + arg1, arg0 - -Static130.method2283());
			} else {
				Static572.method7876(arg1, arg0);
			}
		}
		Static75.aClass2_Sub2_Sub16_9 = null;
		Static536.anInt8149 = 0;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
	public static void method6224() {
		if (!Static647.method8468()) {
			return;
		}
		if (Static393.aStringArray32 == null) {
			Static279.method4072();
		}
		Static566.anInt8472 = 0;
		Static236.aBoolean305 = true;
	}
}
