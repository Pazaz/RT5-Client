import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!wp", name = "C", descriptor = "[Lclient!qa;")
	public static Class29[] aClass29Array17;

	@OriginalMember(owner = "client!wp", name = "G", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!wp", name = "H", descriptor = "I")
	public static int anInt7365;

	@OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
	public static int anInt7366;

	@OriginalMember(owner = "client!wp", name = "N", descriptor = "I")
	public static int anInt7369;

	@OriginalMember(owner = "client!wp", name = "B", descriptor = "I")
	public static int anInt7361 = 0;

	@OriginalMember(owner = "client!wp", name = "K", descriptor = "Z")
	public static boolean aBoolean519 = false;

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)Z")
	public static boolean method6159() {
		@Pc(8) Class1_Sub22 local8 = (Class1_Sub22) Static97.aClass130_9.aClass1_138.aClass1_248;
		if (local8 == null || Static97.aClass130_9.aClass1_138 == local8) {
			return false;
		} else {
			if (local8.anInt4308 >= 2000) {
				local8.anInt4308 -= 2000;
			}
			return local8.anInt4308 == 1006;
		}
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(Z)V")
	public static void method6160() {
		if (Static194.aBoolean316) {
			return;
		}
		Static194.aBoolean316 = true;
		if (Static69.aBoolean133) {
			Static189.aFloat55 = (int) Static189.aFloat55 + 47 & 0xFFFFFFF0;
		} else {
			Static220.aFloat63 += (12.0F - Static220.aFloat63) / 2.0F;
		}
		Static326.aBoolean480 = true;
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(B)V")
	public static void method6163() {
		Static276.method4934(25);
		Static174.method3545();
		System.gc();
	}
}
