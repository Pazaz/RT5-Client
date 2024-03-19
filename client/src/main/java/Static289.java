import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
	public static int anInt5208;

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "Lclient!r;")
	public static Class167 aClass167_6;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "Lclient!db;")
	public static Class42 aClass42_5;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "Z")
	public static boolean aBoolean358 = true;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Z")
	public static boolean aBoolean359 = false;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Z")
	public static boolean aBoolean360 = true;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "[I")
	public static final int[] anIntArray386 = new int[4096];

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
	public static int anInt5210 = 0;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	public static void method4441() {
		Static62.aClass215_22.method6052();
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V")
	public static void method4442() {
		for (@Pc(10) Class1_Sub1_Sub5 local10 = (Class1_Sub1_Sub5) Static77.aClass130_6.method3749(); local10 != null; local10 = (Class1_Sub1_Sub5) Static77.aClass130_6.method3756()) {
			@Pc(15) Class7_Sub1_Sub2 local15 = local10.aClass7_Sub1_Sub2_1;
			if (Static39.anInt1215 != local15.aByte72 || Static197.anInt4521 > local15.anInt2232) {
				local10.method6172();
				local15.method1872();
			} else if (local15.anInt2229 <= Static197.anInt4521) {
				if (local15.anInt2217 > 0) {
					@Pc(48) Class7_Sub1_Sub1_Sub1 local48 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local15.anInt2217 - 1];
					if (local48 != null && local48.anInt7027 >= 0 && Static25.anInt850 * 128 > local48.anInt7027 && local48.anInt7032 >= 0 && local48.anInt7032 < Static219.anInt4987 * 128) {
						local15.method1875(Static197.anInt4521, Static309.method5429(local48.anInt7032, local48.anInt7027, local15.aByte72) - local15.anInt2239, local48.anInt7027, local48.anInt7032);
					}
				}
				if (local15.anInt2217 < 0) {
					@Pc(103) int local103 = -local15.anInt2217 - 1;
					@Pc(110) Class7_Sub1_Sub1_Sub2 local110;
					if (local103 == Static172.anInt6634) {
						local110 = Static264.aClass7_Sub1_Sub1_Sub2_2;
					} else {
						local110 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local103];
					}
					if (local110 != null && local110.anInt7027 >= 0 && Static25.anInt850 * 128 > local110.anInt7027 && local110.anInt7032 >= 0 && Static219.anInt4987 * 128 > local110.anInt7032) {
						local15.method1875(Static197.anInt4521, Static309.method5429(local110.anInt7032, local110.anInt7027, local15.aByte72) - local15.anInt2239, local110.anInt7027, local110.anInt7032);
					}
				}
				local15.method1873(Static55.anInt1622);
				Static195.method3856(local15, true);
			}
		}
	}
}
