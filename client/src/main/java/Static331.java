import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!te", name = "i", descriptor = "I")
	public static int anInt6206 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!hb;)V")
	public static void method5659(@OriginalArg(0) Entity arg0) {
		for (@Pc(2) int local2 = arg0.aShort103; local2 <= arg0.aShort104; local2++) {
			for (@Pc(6) int local6 = arg0.aShort101; local6 <= arg0.aShort102; local6++) {
				@Pc(16) Class67 local16 = Scene.aClass67ArrayArrayArray3[arg0.aByte78][local2][local6];
				if (local16 != null) {
					@Pc(21) Class22 local21 = local16.aClass22_2;
					@Pc(23) Class22 local23 = null;
					while (local21 != null) {
						if (local21.aClass11_Sub5_1 == arg0) {
							if (local23 == null) {
								local16.aClass22_2 = local21.aClass22_1;
							} else {
								local23.aClass22_1 = local21.aClass22_1;
							}
							local21.method857();
							break;
						}
						local23 = local21;
						local21 = local21.aClass22_1;
					}
					local16.aByte8 = 0;
					for (@Pc(56) Class22 local56 = local16.aClass22_2; local56 != null; local56 = local56.aClass22_1) {
						local16.aByte8 = (byte) (local16.aByte8 | local56.anInt645);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z")
	public static boolean method5660() {
		if (Static276.javaScript) {
			try {
				if ((Boolean) BrowserControl.call(GameShell.signlink.applet, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}
}
