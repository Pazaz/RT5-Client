import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static18 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public static int anInt664;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!or;")
	public static Class145 aClass145_1;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!qj;")
	public static Class162 aClass162_31;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString25 = "Ok";

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!we;")
	public static final Class215 aClass215_9 = new Class215(2);

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "[I")
	public static final int[] anIntArray47 = new int[256];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!qj;B)V")
	public static void method470(@OriginalArg(0) Class162 arg0) {
		Static351.aClass162_242 = arg0;
		Static253.anInt5456 = Static351.aClass162_242.method4640(16);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
	public static void method471() {
		if (Static21.aClass40_1 != null) {
			Static21.aClass40_1.method2711();
			Static21.aClass40_1 = null;
			Static77.aClass30_1 = null;
		}
	}
}
