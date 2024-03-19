import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ej", name = "Q", descriptor = "[Lclient!nd;")
	public static Class1_Sub9_Sub1[] aClass1_Sub9_Sub1Array1;

	@OriginalMember(owner = "client!ej", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString68 = "";

	@OriginalMember(owner = "client!ej", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString69 = "M";

	@OriginalMember(owner = "client!ej", name = "V", descriptor = "[I")
	public static final int[] anIntArray124 = new int[13];

	@OriginalMember(owner = "client!ej", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString70 = "M";

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "(B)V")
	public static void method1589() {
		Static184.aClass177Array9 = null;
		Static149.method3228(0, Static295.anInt6177, -1, 0, Static107.anInt2674, Static350.anInt7318, 0, 0);
		if (Static184.aClass177Array9 != null) {
			Static293.method5170(Static350.anInt7318, Static11.anInt7265, 0, Static337.aClass177_21.anInt5762, 0, Static184.aClass177Array9, Static107.anInt2674, -1412584499, Static180.anInt4248);
			Static184.aClass177Array9 = null;
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)I")
	public static int method1590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}
}
