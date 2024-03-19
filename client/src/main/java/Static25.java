import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bm", name = "P", descriptor = "Lclient!qj;")
	public static Class162 aClass162_40;

	@OriginalMember(owner = "client!bm", name = "K", descriptor = "Ljava/lang/String;")
	public static final String aString35 = "slide:";

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
	public static int anInt850 = 104;

	@OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
	public static int anInt854 = 0;

	@OriginalMember(owner = "client!bm", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString36 = "Walk here";

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!nr;[[BILclient!gm;[[B[[BIBLclient!gm;[[IZI[[B)V")
	public static void method625(@OriginalArg(0) Class40 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class77 arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class77 arg7, @OriginalArg(9) int[][] arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11) {
		if (Static130.anInt6754 == 0 && !Static122.aBoolean202) {
			Static246.method5520(arg7, arg3, arg8, arg6, arg11, arg10, arg2, arg4, arg1, arg0, arg5, arg9);
		} else {
			Static271.method4869(arg6, arg8, arg11, arg3, arg7, arg2, arg5, arg1, arg0, arg10, arg4, arg9);
		}
	}

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "(I)Ljava/lang/String;")
	public static String method626() {
		@Pc(5) String local5 = "www";
		if (Static312.anInt6002 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(11) String local11 = "";
		if (Static327.aString256 != null) {
			local11 = "/p=" + Static327.aString256;
		}
		return Static199.anInt4559 == 1 ? "http://" + local5 + ".stellardawn.com/l=" + Static60.anInt6011 + "/a=" + Static192.anInt4459 + local11 + "/" : "http://" + local5 + ".runescape.com/l=" + Static60.anInt6011 + "/a=" + Static192.anInt4459 + local11 + "/";
	}

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "(I)Lclient!kn;")
	public static Class106 method627() {
		try {
			return new Class106_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class106) Class.forName("Class106_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(30) Throwable local30) {
				return new Class106_Sub1();
			}
		}
	}
}
