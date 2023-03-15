import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!hl", name = "H", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_17 = new LruHashTable(4);

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
	public static final int anInt2489 = 1406;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BJ)V")
	public static void method2503(@OriginalArg(1) long arg0) {
		if (Scene.aClass67ArrayArrayArray3 != null) {
			if (Camera.anInt5911 == 1 || Camera.anInt5911 == 5) {
				Static182.method3386(arg0);
			} else if (Camera.anInt5911 == 4) {
				Static256.method4395(arg0);
			}
		}
		Static371.method6257((long) client.cycle, Rasteriser.instance);
		if (Static139.anInt2595 != -1) {
			Static232.method4028(Static139.anInt2595);
		}
		for (@Pc(42) int local42 = 0; local42 < Static154.anInt2806; local42++) {
			if (Static357.aBooleanArray59[local42]) {
				Static375.aBooleanArray64[local42] = true;
			}
			Static20.aBooleanArray6[local42] = Static357.aBooleanArray59[local42];
			Static357.aBooleanArray59[local42] = false;
		}
		Static132.anInt2468 = client.cycle;
		if (Rasteriser.instance.method2871()) {
			Static106.aBoolean164 = true;
		}
		if (Static139.anInt2595 != -1) {
			Static154.anInt2806 = 0;
			Static46.method1421();
		}
		Rasteriser.instance.method2898();
		Static162.method2980(Rasteriser.instance);
		@Pc(97) int local97 = Static33.method4201();
		if (local97 == -1) {
			local97 = Minimap.anInt7263;
		}
		Static307.method5255(local97);
		Static56.method1616(PlayerList.self.xFine, PlayerList.self.zFine, client.sceneDelta, PlayerList.self.plane);
		client.sceneDelta = 0;
	}
}
