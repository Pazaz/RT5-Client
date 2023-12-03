import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!ld;")
	public static final LinkedList aClass135_13 = new LinkedList();

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	public static final int anInt1462 = 1401;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method1611() {
		if (client.gameState == 10 || client.gameState == 28) {
			Static387.method2835(5000, Static136.anInt6778 >> 10, Static211.anInt3777 >> 10);
		} else {
			@Pc(31) int local31 = PlayerList.self.movementQueueX[0] >> 3;
			@Pc(38) int local38 = PlayerList.self.movementQueueZ[0] >> 3;
			if (local31 >= 0 && local31 < Static373.buildAreaLimitX >> 3 && local38 >= 0 && Static242.buildAreaLimitZ >> 3 > local38) {
				Static387.method2835(5000, local31, local38);
			} else {
				Static387.method2835(0, Static373.buildAreaLimitX >> 4, Static242.buildAreaLimitZ >> 4);
			}
		}
		Static140.method2623();
		Static291.method5029();
		Static248.method4341();
		Static50.method1530();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ll;)V")
	public static void method1613(@OriginalArg(1) PcmStream arg0) {
		arg0.aBoolean389 = false;
		if (arg0.aClass2_Sub21_5 != null) {
			arg0.aClass2_Sub21_5.anInt3175 = 0;
		}
		for (@Pc(23) PcmStream local23 = arg0.method4978(); local23 != null; local23 = arg0.nextSubStream()) {
			method1613(local23);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method1614() {
		if (Static18.aClass32_2 == null) {
			return;
		}
		if (Static18.aClass32_2.status == 1) {
			Static18.aClass32_2 = null;
			return;
		}
		if (Static18.aClass32_2.status == 2) {
			Static234.method4095(Static17.aClass152_4, 2, Static257.aString39);
			Static18.aClass32_2 = null;
			return;
		}
	}

}
