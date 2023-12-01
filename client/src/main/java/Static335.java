import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_57 = new LruHashTable(200);

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "[B")
	public static final byte[] aByteArray92 = new byte[2048];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public static void method5694() {
		if (Rasteriser.instance == null) {
			return;
		}
		Static34.aClass36_6.method1416();
		Static253.method4366();
		Static247.method4299();
		LoginManager.method3502();
		Static339.method5759();
		Static389.method4490();
		if (Static368.aClass43_1 != null) {
			Static368.aClass43_1.method1618();
		}
		Static393.method6461();
		Static211.method3721();
		Static155.method2790();
		Static241.method4192(false);
		TitleScreen.clear();
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(47) Player local47 = PlayerList.players[local41];
			if (local47 != null) {
				local47.aClass2_Sub6_3 = null;
				for (@Pc(54) int local54 = 0; local54 < local47.aClass31Array3.length; local54++) {
					local47.aClass31Array3[local54] = null;
				}
			}
		}
		for (@Pc(73) int local73 = 0; local73 < NpcList.npcs.length; local73++) {
			@Pc(79) Npc local79 = NpcList.npcs[local73];
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < local79.aClass31Array3.length; local83++) {
					local79.aClass31Array3[local83] = null;
				}
			}
		}
		Rasteriser.instance.method2825();
		Rasteriser.instance = null;
	}

}
