import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Lclient!wm;")
	public static Class19 aClass19_5;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "Lclient!nk;")
	public static Class161 aClass161_6 = null;

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_73 = new LocalizedString("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V")
	public static void method3364(@OriginalArg(1) int arg0) {
		@Pc(16) DelayedStateChange local16 = Static316.method5413(3, arg0);
		local16.method2312();
	}
}
