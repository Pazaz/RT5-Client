import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "Lclient!jd;")
	public static Sprite aClass13_17;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
	public static int anInt6317;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	public static void method5709() {
		Static371.method6257((long) client.cycle, Rasteriser.instance);
		if (Static139.anInt2595 != -1) {
			Static232.method4028(Static139.anInt2595);
		}
		for (@Pc(19) int local19 = 0; local19 < Static154.anInt2806; local19++) {
			if (Static357.aBooleanArray59[local19]) {
				Static375.aBooleanArray64[local19] = true;
			}
			Static20.aBooleanArray6[local19] = Static357.aBooleanArray59[local19];
			Static357.aBooleanArray59[local19] = false;
		}
		Static132.anInt2468 = client.cycle;
		if (Rasteriser.instance.hasHwAccel()) {
			Static106.aBoolean164 = true;
		}
		if (Static139.anInt2595 != -1) {
			Static154.anInt2806 = 0;
			Static46.method1421();
		}
		Rasteriser.instance.method2898();
		Static307.method5255(Minimap.anInt7263);
		client.sceneDelta = 0;
	}
}
