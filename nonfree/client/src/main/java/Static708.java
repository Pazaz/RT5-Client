import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static708 {

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_12;

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "I")
	public static int anInt10644;

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "[I")
	public static final int[] anIntArray862 = new int[1];

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method9230(@OriginalArg(1) String arg0) {
		Static150.aString26 = arg0;
		if (Static166.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static166.anApplet1.getParameter("cookieprefix");
			@Pc(28) String local28 = Static166.anApplet1.getParameter("cookiehost");
			@Pc(47) String local47 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local28;
			if (arg0.length() == 0) {
				local47 = local47 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local47 = local47 + "; Expires=" + Static163.method8846(Static588.method7715() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static727.method98("document.cookie=\"" + local47 + "\"", Static166.anApplet1);
		} catch (@Pc(104) Throwable local104) {
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIII)V")
	public static void method9231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static280.aByteArrayArrayArray3 = new byte[4][arg0][arg1];
	}
}
