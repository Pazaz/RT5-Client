import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "[I")
	public static final int[] anIntArray408 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "()V")
	public static void method4749() {
		for (@Pc(1) int local1 = 0; local1 < Static144.anInt3573; local1++) {
			@Pc(6) Class7_Sub1 local6 = Static283.aClass7_Sub1Array3[local1];
			Static298.method5247(local6);
			Static283.aClass7_Sub1Array3[local1] = null;
		}
		Static144.anInt3573 = 0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)V")
	public static void method4750(@OriginalArg(1) int arg0) {
		Static314.anInt6504 = arg0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)V")
	public static void method4754(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static201.aFloat54 < Static201.aFloat53) {
			Static201.aFloat54 = (float) ((double) Static201.aFloat54 + (double) Static201.aFloat54 / 30.0D);
			if (Static201.aFloat54 > Static201.aFloat53) {
				Static201.aFloat54 = Static201.aFloat53;
			}
			Static122.method2622();
			Static201.anInt4274 = (int) Static201.aFloat54 >> 1;
			Static201.aByteArrayArrayArray11 = Static75.method1746(Static201.anInt4274);
		} else if (Static201.aFloat54 > Static201.aFloat53) {
			Static201.aFloat54 = (float) ((double) Static201.aFloat54 - (double) Static201.aFloat54 / 30.0D);
			if (Static201.aFloat53 > Static201.aFloat54) {
				Static201.aFloat54 = Static201.aFloat53;
			}
			Static122.method2622();
			Static201.anInt4274 = (int) Static201.aFloat54 >> 1;
			Static201.aByteArrayArrayArray11 = Static75.method1746(Static201.anInt4274);
		}
		if (Static297.anInt6237 != -1 && Static233.anInt5206 != -1) {
			@Pc(80) int local80 = Static297.anInt6237 - Static286.anInt6050;
			if (local80 < 2 || local80 > 2) {
				local80 /= 8;
			}
			@Pc(94) int local94 = Static233.anInt5206 - Static311.anInt5198;
			if (local94 < 2 || local94 > 2) {
				local94 /= 8;
			}
			Static286.anInt6050 += local80;
			if (local80 == 0 && local94 == 0) {
				Static297.anInt6237 = -1;
				Static233.anInt5206 = -1;
			}
			Static311.anInt5198 += local94;
			Static122.method2622();
		}
		if (Static74.anInt2057 > 0) {
			Static243.anInt5366--;
			if (Static243.anInt5366 == 0) {
				Static243.anInt5366 = 100;
				Static74.anInt2057--;
			}
		} else {
			Static259.anInt4933 = -1;
			Static263.anInt5600 = -1;
		}
		if (!Static114.aBoolean452 || Static112.aClass130_10 == null) {
			return;
		}
		for (@Pc(170) Class1_Sub42 local170 = (Class1_Sub42) Static112.aClass130_10.method3749(); local170 != null; local170 = (Class1_Sub42) Static112.aClass130_10.method3756()) {
			@Pc(178) Class107 local178 = Static292.method5169(local170.aClass1_Sub21_1.anInt4155);
			if (Static161.anInt3962 == 0 && local170.method6041(arg0, arg1)) {
				if (local178.aStringArray25 != null) {
					if (local178.aStringArray25[4] != null) {
						Static286.method5110(-1, (long) local170.aClass1_Sub21_1.anInt4155, local178.aStringArray25[4], local178.anInt3789, local178.aString139, 0, 1004);
					}
					if (local178.aStringArray25[3] != null) {
						Static286.method5110(-1, (long) local170.aClass1_Sub21_1.anInt4155, local178.aStringArray25[3], local178.anInt3789, local178.aString139, 0, 1003);
					}
					if (local178.aStringArray25[2] != null) {
						Static286.method5110(-1, (long) local170.aClass1_Sub21_1.anInt4155, local178.aStringArray25[2], local178.anInt3789, local178.aString139, 0, 1010);
					}
					if (local178.aStringArray25[1] != null) {
						Static286.method5110(-1, (long) local170.aClass1_Sub21_1.anInt4155, local178.aStringArray25[1], local178.anInt3789, local178.aString139, 0, 1002);
					}
					if (local178.aStringArray25[0] != null) {
						Static286.method5110(-1, (long) local170.aClass1_Sub21_1.anInt4155, local178.aStringArray25[0], local178.anInt3789, local178.aString139, 0, 1007);
					}
				}
				if (!local170.aClass1_Sub21_1.aBoolean298) {
					local170.aClass1_Sub21_1.aBoolean298 = true;
					Static267.method4820(15, local170.aClass1_Sub21_1.anInt4155, local178.anInt3789);
				}
				if (local170.aClass1_Sub21_1.aBoolean298) {
					Static267.method4820(17, local170.aClass1_Sub21_1.anInt4155, local178.anInt3789);
				}
			} else if (local170.aClass1_Sub21_1.aBoolean298) {
				local170.aClass1_Sub21_1.aBoolean298 = false;
				Static267.method4820(16, local170.aClass1_Sub21_1.anInt4155, local178.anInt3789);
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4756(@OriginalArg(0) String arg0) {
		return Static316.method5518(arg0, 10);
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)Lclient!of;")
	public static Class1_Sub1_Sub16 method4759(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub16 local12 = (Class1_Sub1_Sub16) Static155.aClass143_7.method4323((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(26) byte[] local26 = Static174.aClass162_140.method4636(Static164.method3434(arg0), Static79.method3954(arg0));
		local12 = new Class1_Sub1_Sub16();
		if (local26 != null) {
			local12.method4214(new Class1_Sub16(local26));
		}
		Static155.aClass143_7.method4322(local12, (long) arg0);
		return local12;
	}
}
