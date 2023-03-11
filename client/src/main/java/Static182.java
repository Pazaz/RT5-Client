import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public static int anInt3422;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	public static int anInt3420 = 0;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	public static int anInt3423 = 0;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Lclient!nk;")
	public static Class161 aClass161_7 = null;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IJ)V")
	public static void method3386(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6781 + Static24.anInt642;
		@Pc(15) int local15 = Static14.anInt327 + Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6783;
		if (Static288.anInt5463 - local10 < -500 || Static288.anInt5463 - local10 > 500 || Static62.anInt2395 - local15 < -500 || Static62.anInt2395 - local15 > 500) {
			Static288.anInt5463 = local10;
			Static62.anInt2395 = local15;
		}
		@Pc(62) int local62;
		@Pc(70) int local70;
		if (Static288.anInt5463 != local10) {
			local62 = local10 - Static288.anInt5463;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local62 < local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local62 > local70) {
				local70 = local62;
			}
			Static288.anInt5463 += local70;
		}
		if (!Static218.aClass177_Sub1_2.aBoolean351) {
			Static31.aFloat28 += (float) arg0 * Static296.aFloat68 / 6.0F;
			Static277.aFloat67 += Static184.aFloat39 * (float) arg0 / 6.0F;
		}
		if (Static62.anInt2395 != local15) {
			local62 = local15 - Static62.anInt2395;
			local70 = (int) ((long) local62 * arg0 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local62 < local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local62 > local70) {
				local70 = local62;
			}
			Static62.anInt2395 += local70;
		}
		Static338.method6141();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	public static void method3387() {
		for (@Pc(15) Class2_Sub2_Sub1 local15 = (Class2_Sub2_Sub1) Static129.aClass135_20.method3551(); local15 != null; local15 = (Class2_Sub2_Sub1) Static129.aClass135_20.method3552()) {
			@Pc(20) Class11_Sub5_Sub4 local20 = local15.aClass11_Sub5_Sub4_1;
			if (local20.aBoolean445) {
				local15.method6468();
				local20.method5878();
			} else if (local20.anInt6504 <= Static114.anInt2348) {
				local20.method5879(Static165.anInt3148);
				if (local20.aBoolean445) {
					local15.method6468();
				} else {
					Static329.method5630(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
	public static void method3388() {
		Static257.aClass2_Sub4_Sub2_4.anInt5300 = 0;
		Static82.anInt1836 = 0;
		Static39.aClass89_35 = null;
		Static151.anInt2773 = 0;
		Static334.aClass89_222 = null;
		Static231.aClass89_164 = null;
		Static268.anInt4955 = 0;
		Static212.aClass2_Sub4_Sub2_3.anInt5300 = 0;
		Static66.aClass89_57 = null;
		Static160.method2956();
		Static309.method5280();
		for (@Pc(35) int local35 = 0; local35 < 2048; local35++) {
			Static12.aClass11_Sub5_Sub2_Sub1Array1[local35] = null;
		}
		Static17.aClass11_Sub5_Sub2_Sub1_3 = null;
		for (@Pc(51) int local51 = 0; local51 < Static365.aClass11_Sub5_Sub2_Sub2Array1.length; local51++) {
			@Pc(57) Class11_Sub5_Sub2_Sub2 local57 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local51];
			if (local57 != null) {
				local57.anInt4611 = -1;
			}
		}
		Static302.method1458();
		Static314.anInt5911 = 1;
		Static336.method5705(30);
		for (@Pc(76) int local76 = 0; local76 < 100; local76++) {
			Static357.aBooleanArray59[local76] = true;
		}
		Static93.method2002();
		Static375.aLong222 = 0L;
		Static385.aClass2_Sub16_2 = null;
	}
}
