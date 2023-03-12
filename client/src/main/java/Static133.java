import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!hl", name = "H", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_17 = new Class98(4);

	@OriginalMember(owner = "client!hl", name = "J", descriptor = "Lclient!se;")
	public static final Class2_Sub33 aClass2_Sub33_1 = new Class2_Sub33(0, 0);

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
	public static final int anInt2489 = 1406;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BJ)V")
	public static void method2503(@OriginalArg(1) long arg0) {
		if (Static330.aClass67ArrayArrayArray3 != null) {
			if (Static314.anInt5911 == 1 || Static314.anInt5911 == 5) {
				Static182.method3386(arg0);
			} else if (Static314.anInt5911 == 4) {
				Static256.method4395(arg0);
			}
		}
		Static371.method6257((long) client.cycle, Static190.aClass19_8);
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
		if (Static190.aClass19_8.method2871()) {
			Static106.aBoolean164 = true;
		}
		if (Static139.anInt2595 != -1) {
			Static154.anInt2806 = 0;
			Static46.method1421();
		}
		Static190.aClass19_8.method2898();
		Static162.method2980(Static190.aClass19_8);
		@Pc(97) int local97 = Static33.method4201();
		if (local97 == -1) {
			local97 = Static394.anInt7263;
		}
		Static307.method5255(local97);
		Static56.method1616(Static17.aClass11_Sub5_Sub2_Sub1_3.xFine, Static17.aClass11_Sub5_Sub2_Sub1_3.zFine, Static165.anInt3148, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78);
		Static165.anInt3148 = 0;
	}
}
