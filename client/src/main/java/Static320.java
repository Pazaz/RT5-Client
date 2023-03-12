import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static320 {

	@OriginalMember(owner = "client!sm", name = "D", descriptor = "I")
	public static int anInt6007;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_8 = new Class16("", 13);

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
	public static int anInt6005 = 0;

	@OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
	public static int anInt6006 = 0;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	public static void method5461() {
		Static133.aClass98_17.method2621();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
	public static String method5462(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static139.method2594(arg0);
	}
}
