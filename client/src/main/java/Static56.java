import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "Lclient!qa;")
	public static Class29 aClass29_8;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
	public static int anInt1631;

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "Lclient!th;")
	public static final Class195 aClass195_1 = new Class195();

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Lclient!br;")
	public static Class7_Sub2 method1394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class154 local7 = Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass7_Sub2_1;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	public static void method1395() {
		if (Static37.aClass37_1 != null) {
			Static37.aClass37_1.method5854();
		}
		if (Static305.aClass37_2 != null) {
			Static305.aClass37_2.method5854();
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!qj;Z)V")
	public static void method1396(@OriginalArg(0) Class162 arg0) {
		Static214.aClass162_169 = arg0;
	}
}
