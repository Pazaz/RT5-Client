import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!vo", name = "y", descriptor = "Lclient!jd;")
	public static Class13 aClass13_20;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
	public static int anInt7014;

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "J")
	public static long aLong220;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "Lclient!h;")
	public static final Class89 aClass89_243 = new Class89(89, 6);

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "Lclient!h;")
	public static final Class89 aClass89_244 = new Class89(33, 15);

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "Z")
	public static volatile boolean aBoolean475 = true;

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray66 = new String[100];

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIZLclient!nk;)V")
	public static void method6256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class161 arg3) {
		@Pc(8) int local8 = arg3.anInt4248;
		@Pc(11) int local11 = arg3.anInt4261;
		if (arg3.aByte47 == 0) {
			arg3.anInt4248 = arg3.anInt4294;
		} else if (arg3.aByte47 == 1) {
			arg3.anInt4248 = arg1 - arg3.anInt4294;
		} else if (arg3.aByte47 == 2) {
			arg3.anInt4248 = arg1 * arg3.anInt4294 >> 14;
		}
		if (arg3.aByte44 == 0) {
			arg3.anInt4261 = arg3.anInt4289;
		} else if (arg3.aByte44 == 1) {
			arg3.anInt4261 = arg0 - arg3.anInt4289;
		} else if (arg3.aByte44 == 2) {
			arg3.anInt4261 = arg0 * arg3.anInt4289 >> 14;
		}
		if (arg3.aByte47 == 4) {
			arg3.anInt4248 = arg3.anInt4261 * arg3.anInt4243 / arg3.anInt4291;
		}
		if (arg3.aByte44 == 4) {
			arg3.anInt4261 = arg3.anInt4291 * arg3.anInt4248 / arg3.anInt4243;
		}
		if (Static18.aBoolean30 && (Static45.method1404(arg3).anInt1758 != 0 || arg3.anInt4272 == 0)) {
			if (arg3.anInt4261 < 5 && arg3.anInt4248 < 5) {
				arg3.anInt4261 = 5;
				arg3.anInt4248 = 5;
			} else {
				if (arg3.anInt4248 <= 0) {
					arg3.anInt4248 = 5;
				}
				if (arg3.anInt4261 <= 0) {
					arg3.anInt4261 = 5;
				}
			}
		}
		if (arg3.anInt4273 == Static199.anInt5755) {
			Static20.aClass161_1 = arg3;
		}
		if (arg2 && arg3.anObjectArray6 != null && (arg3.anInt4248 != local8 || local11 != arg3.anInt4261)) {
			@Pc(191) Class2_Sub13 local191 = new Class2_Sub13();
			local191.aClass161_3 = arg3;
			local191.anObjectArray4 = arg3.anObjectArray6;
			Static274.aClass135_30.method3540(local191);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(JILclient!wm;)V")
	public static void method6257(@OriginalArg(0) long arg0, @OriginalArg(2) Class19 arg1) {
		Static116.anInt2360 = 0;
		Static336.anInt6313 = Static311.anInt5809;
		Static311.anInt5809 = 0;
		@Pc(16) long local16 = Static204.method3685();
		for (@Pc(21) Class12_Sub5 local21 = (Class12_Sub5) Static131.aClass36_4.method1415(); local21 != null; local21 = (Class12_Sub5) Static131.aClass36_4.method1420()) {
			if (local21.method4352(arg1, arg0)) {
				Static116.anInt2360++;
			}
		}
		if (Static289.aBoolean391 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static131.aClass36_4.method1419() + ", running: " + Static116.anInt2360 + ". Particles: " + Static311.anInt5809 + ". Time taken: " + (Static204.method3685() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([BI)[B")
	public static byte[] method6258(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local6];
		Static404.method4607(arg0, 0, local17, 0, local6);
		return local17;
	}
}
