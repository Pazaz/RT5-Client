import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static308 {

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_21 = new Class155(53);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLclient!rka;I)V")
	public static void method4482(@OriginalArg(1) Class2_Sub21_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static652.anInt9713 = 0;
		Static358.aBoolean803 = false;
		Static263.method3856(arg0);
		Static618.method8319(arg0);
		if (Static358.aBoolean803) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt8388 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt8388 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4484(@OriginalArg(1) String arg0) {
		if (Class254.aString70.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class254.aString70.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class254.aString70.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
