import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "Lclient!fi;")
	public static Class63 aClass63_7;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "Lclient!mi;")
	public static final Class130 aClass130_35 = new Class130();

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!we;")
	public static final Class215 aClass215_81 = new Class215(64);

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
	public static int anInt5668 = -1;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLjava/lang/String;ZLclient!ud;Z)V")
	public static void method4826(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class199 arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static20.method503(arg0, arg2, 3);
			return;
		}
		@Pc(32) String local32;
		if (Static313.aString244.startsWith("win") && Static313.anInt6481 != 3) {
			local32 = null;
			if (arg2.anApplet1 != null) {
				local32 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local32 == null || !local32.equals("1")) {
				@Pc(52) Class145 local52 = Static20.method503(arg0, arg2, 0);
				Static146.aClass199_9 = arg2;
				Static41.aClass145_2 = local52;
				Static346.aString270 = arg0;
				return;
			}
		}
		if (Static313.aString244.startsWith("mac")) {
			local32 = null;
			if (arg2.anApplet1 != null) {
				local32 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local32 != null && local32.equals("1") && arg1) {
				Static20.method503(arg0, arg2, 1);
				return;
			}
		}
		Static20.method503(arg0, arg2, 2);
	}
}
