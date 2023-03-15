import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "Lclient!jd;")
	public static Sprite aClass13_14;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_100 = new LocalizedString("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	public static void method4363() {
		Static296.aClass4_109.clear();
		Static208.aClass246_4.clear();
		Static368.aClass246_10.clear();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZII)V")
	public static void method4365(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Rasteriser.instance = Static387.method2822(client.preferences.antiAliasingMode * 2, GameShell.signlink, Static128.anInterface2_4, GameShell.canvas, arg1);
		} else {
			if (arg0) {
				Rasteriser.instance = Static387.method2822(0, GameShell.signlink, Static128.anInterface2_4, GameShell.canvas, 0);
				Rasteriser.instance.method2867(0);
				@Pc(22) Class239 local22 = Static101.method2165(Sprites.p12FullId, client.jsArchive13);
				@Pc(31) BitmapFont local31 = Rasteriser.instance.method2857(local22, Static396.method1688(client.jsArchive8, Sprites.p12FullId));
				Static351.method5857(local31, true, Static256.aClass79_102.getLocalized(client.language));
				Rasteriser.instance.method2883();
				Static372.method6260();
				Rasteriser.instance.method2825();
			}
			try {
				Rasteriser.instance = Static387.method2822(client.preferences.antiAliasingMode * 2, GameShell.signlink, Static128.anInterface2_4, GameShell.canvas, arg1);
			} catch (@Pc(61) Throwable local61) {
				Rasteriser.instance = Static387.method2822(0, GameShell.signlink, Static128.anInterface2_4, GameShell.canvas, 0);
				arg1 = 0;
			}
		}
		if (Rasteriser.instance.method2849()) {
			@Pc(97) Class2_Sub22 local97 = Rasteriser.instance.method2876();
			Rasteriser.instance.method2846(local97);
		}
		Static77.anInt1762 = arg1;
		Static194.method3541();
		if (!Rasteriser.instance.method2869()) {
			Static102.anInt3591 = 1;
		}
		Rasteriser.instance.method2854(Static102.anInt3591);
		Rasteriser.instance.method2893(0);
		Static76.aClass14_3 = Rasteriser.instance.method2897();
		Static232.aClass14_4 = Rasteriser.instance.method2897();
		@Pc(127) int local127 = (int) ((double) Static373.anInt7033 * 34.46D);
		if (Rasteriser.instance.method2888()) {
			local127 += 128;
		}
		Rasteriser.instance.method2872(50, local127);
		Rasteriser.instance.method2874(!client.preferences.highDetailTextures);
		if (Rasteriser.instance.method2858()) {
			Static284.method4882(client.preferences.aBoolean356);
		}
		Static190.method3500(Static242.anInt4449 >> 3, Static373.anInt7033 >> 3, Rasteriser.instance);
		Static348.method5828();
		Preferences.sentToServer = false;
	}
}
