import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!po", name = "d", descriptor = "I")
	public static int anInt5299 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
	public static void method4514() {
		@Pc(13) Class1_Sub1_Sub10 local13 = Static122.method2624(15, 0);
		local13.method2536();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public static void method4515() {
		if (!Static229.method4363()) {
			return;
		}
		if (Static123.aStringArray19 == null) {
			Static85.method1904();
		}
		Static311.aBooleanArray18 = new boolean[100];
		Static327.anIntArray552 = new int[100];
		Static279.anIntArray450 = new int[100];
		Static232.aBoolean357 = true;
		Static136.anInt3402 = 0;
		Static15.anIntArray38 = new int[100];
		for (@Pc(30) int local30 = 0; local30 < 100; local30++) {
			Static279.anIntArray450[local30] = (int) (Math.random() * (double) Static107.anInt2674);
			Static327.anIntArray552[local30] = (int) (Math.random() * 350.0D);
			Static15.anIntArray38[local30] = (int) (Math.random() * 102.0D);
			Static311.aBooleanArray18[local30] = Math.random() < 0.5D;
		}
		try {
			Static91.aClipboard1 = Static345.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(74) Exception local74) {
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
	public static void method4516() {
		@Pc(5) byte local5 = 0;
		if (Static265.aBoolean396) {
			local5 = 55;
		}
		Static9.method333(local5);
		Static3.method60(local5);
		Static45.method1275(local5);
		Static253.method4650(local5);
		Static323.method5654(local5);
		Static142.method3126(local5);
		Static60.method5085(local5);
		Static139.method3056(local5);
		Static197.method3898(local5);
		if (Static214.anInt4865 == 10) {
			Static276.method4934(28);
		} else if (Static214.anInt4865 == 30) {
			Static276.method4934(25);
		}
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
	public static void method4517() {
		Static250.aClass215_76.method6052();
		Static160.aClass215_100.method6052();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IZZ)V")
	public static void method4518(@OriginalArg(2) boolean arg0) {
		Static180.anInt4247++;
		Static39.method949();
		if (arg0) {
			Static19.anInt667++;
			Static1.method55();
		}
	}
}
