import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "[[S")
	public static final short[][] GAME0_DESTINATION_SKIN_COLORS = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	public static int anInt6737 = 0;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public static void method6029() {
		@Pc(7) int local7 = PlayerList.anInt751;
		@Pc(9) int[] local9 = PlayerList.anIntArray121;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Player local19 = PlayerList.players[local9[local11]];
			if (local19 != null) {
				Static93.method1999(local19, local19.getSize());
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
	public static void method6031() {
		Static253.method4366();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static171.collisionMaps[local8].method1626();
		}
		Static247.method4299();
		Static211.method3721();
		System.gc();
	}

}
