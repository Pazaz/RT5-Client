import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class TitleScreen {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!r;Lclient!wm;)V")
	public static void load(@OriginalArg(1) Js5 arg0, @OriginalArg(2) RasteriserBase arg1) {
		if (Static283.aBoolean383) {
			return;
		}
		arg1.method2867(0);
		Static252.aClass13_14 = arg1.method2891(Static396.method1676(arg0, Static75.anInt1736));
		Static252.aClass13_14.method6385((GameShell.canvasWidth - Static252.aClass13_14.method6399()) / 2, (GameShell.canvasHeight - Static252.aClass13_14.method6384()) / 2);
		Static333.aClass13_21 = arg1.method2891(Static396.method1676(arg0, Static265.anInt4856));
		Static333.aClass13_21.method6385((GameShell.canvasWidth - Static333.aClass13_21.method6399()) / 2, 18);
		Static283.aBoolean383 = true;
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V")
	public static void clear() {
		if (Static283.aBoolean383) {
			Static283.aBoolean383 = false;
			Static252.aClass13_14 = null;
			Static333.aClass13_21 = null;
		}
	}

}
