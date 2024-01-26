import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dha", name = "y", descriptor = "I")
	public static int anInt2186;

	@OriginalMember(owner = "client!dha", name = "s", descriptor = "I")
	public static int anInt2189;

	@OriginalMember(owner = "client!dha", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString19 = "";

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IZ)V")
	public static void method2079(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static333.anInt5455 - Static212.anInt3468;
		if (local7 >= 100) {
			Static693.anInt10383 = -1;
			Static692.anInt10376 = -1;
			Static511.anInt7645 = 1;
			return;
		}
		@Pc(28) int local28 = (int) Static479.aFloat123;
		if (Static188.anInt3103 >> 8 > local28) {
			local28 = Static188.anInt3103 >> 8;
		}
		if (Static572.aBooleanArray29[4] && local28 < Static140.anIntArray222[4] + 128) {
			local28 = Static140.anIntArray222[4] + 128;
		}
		@Pc(63) int local63 = (int) Static171.aFloat64 + Static288.anInt4621 & 0x3FFF;
		Static292.method4606(local28, (local28 >> 3) * 3 + 600 << 2, arg0, Static494.anInt7409, local63, Static38.anInt920, Static102.method2025(Static394.anInt6176, -29754, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690) - 200);
		@Pc(107) float local107 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static170.anInt2864 = (int) ((float) Static70.anInt1569 + (float) (Static170.anInt2864 - Static70.anInt1569) * local107);
		Static359.anInt5801 = (int) ((float) (Static359.anInt5801 - Static302.anInt4854) * local107 + (float) Static302.anInt4854);
		anInt2186 = (int) (local107 * (float) (anInt2186 - Static411.anInt6329) + (float) Static411.anInt6329);
		Static598.anInt8832 = (int) ((float) (Static598.anInt8832 - Static340.anInt5584) * local107 + (float) Static340.anInt5584);
		@Pc(160) int local160 = Static323.anInt5119 - Static225.anInt3641;
		if (local160 > 8192) {
			local160 -= 16384;
		} else if (local160 < -8192) {
			local160 += 16384;
		}
		Static323.anInt5119 = (int) ((float) Static225.anInt3641 + (float) local160 * local107);
		Static323.anInt5119 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lclient!sb;I)V")
	public static void method2081(@OriginalArg(0) Class330 arg0) {
		Static331.aClass330_65 = arg0;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lclient!da;)V")
	public static void method2082(@OriginalArg(0) Class14 arg0) {
		Static242.aClass14_7 = arg0;
	}
}
