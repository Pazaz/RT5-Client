import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
	public static int anInt5392 = 0;

	@OriginalMember(owner = "client!kg", name = "M", descriptor = "Lclient!hda;")
	public static Class158 aClass158_7 = null;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLjava/lang/String;I)Lclient!cca;")
	public static Class58 method4894(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class58 local10;
		try {
			local10 = (Class58) Class.forName("Class58_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(12) Throwable local12) {
			local10 = new Class58_Sub1();
		}
		local10.anInt6783 = arg1;
		local10.aString74 = arg0;
		return local10;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
	public static void method4895() {
		Static166.aClass82_59.method2157();
	}
}
