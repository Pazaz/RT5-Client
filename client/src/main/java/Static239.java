import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static239 {

	@OriginalMember(owner = "client!nn", name = "U", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_95 = new LocalizedString("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!wm;B)V")
	public static void method4156(@OriginalArg(0) RasteriserBase arg0) {
		if (PlayerList.self.plane != Static343.anInt6389 && (Scene.aClass67ArrayArrayArray3 != null && Static49.method1472(arg0, PlayerList.self.plane))) {
			Static343.anInt6389 = PlayerList.self.plane;
		}
	}
}
