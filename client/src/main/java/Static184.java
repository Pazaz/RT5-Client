import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Lclient!ud;")
	public static Class199 aClass199_12;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "[Lclient!ro;")
	public static Class177[] aClass177Array9;

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Lclient!ao;")
	public static Class11 aClass11_12;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	public static void method5962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(25) int local25;
		if (arg1 != Static64.anInt1755) {
			Static207.anIntArray360 = new int[arg1];
			for (local25 = 0; local25 < arg1; local25++) {
				Static207.anIntArray360[local25] = (local25 << 12) / arg1;
			}
			Static150.anInt3679 = arg1 * 32;
			Static64.anInt1755 = arg1;
			Static145.anInt3608 = arg1 - 1;
		}
		if (Static53.anInt1598 == arg0) {
			return;
		}
		if (arg0 == Static64.anInt1755) {
			Static60.anIntArray455 = Static207.anIntArray360;
		} else {
			Static60.anIntArray455 = new int[arg0];
			for (local25 = 0; local25 < arg0; local25++) {
				Static60.anIntArray455[local25] = (local25 << 12) / arg0;
			}
		}
		Static128.anInt3242 = arg0 - 1;
		Static53.anInt1598 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "h", descriptor = "(I)V")
	public static void method5964() {
		if (Static275.aBoolean186) {
			return;
		}
		Static114.method5270(Static330.aClass154ArrayArrayArray3);
		if (Static134.aClass154ArrayArrayArray1 != null) {
			Static114.method5270(Static134.aClass154ArrayArrayArray1);
		}
		Static275.aBoolean186 = true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public static void method5965() {
		@Pc(1) Class215 local1 = Static218.aClass215_68;
		synchronized (Static218.aClass215_68) {
			Static218.aClass215_68.method6063(5);
		}
	}
}
