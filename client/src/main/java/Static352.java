import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString275 = "Connection lost.";

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "Lclient!we;")
	public static Class215 aClass215_102 = new Class215(128);

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
	public static int anInt7341 = 0;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!nr;)V")
	public static void method6139(@OriginalArg(1) Class40 arg0) {
		@Pc(7) int local7 = Static234.anInt5225;
		@Pc(9) int local9 = Static52.anInt1577;
		@Pc(11) int local11 = Static140.anInt3473;
		@Pc(13) int local13 = Static259.anInt4930;
		arg0.method2745(local11, local13, local7, local9, -10660793);
		arg0.method2745(local11 - 2, 16, local7 + 1, local9 + 1, -16777216);
		arg0.method2806(local13 - 19, local7 + 1, local11 - 2, local9 - -18, -16777216);
		Static150.aClass30_2.method4832(Static177.aString156, -10660793, local9 + 14, local7 + 3, -1);
		@Pc(69) int local69 = Static229.anInt5102;
		@Pc(71) int local71 = Static85.anInt2268;
		@Pc(73) int local73 = 0;
		for (@Pc(80) Class1_Sub22 local80 = (Class1_Sub22) Static97.aClass130_9.method3749(); local80 != null; local80 = (Class1_Sub22) Static97.aClass130_9.method3756()) {
			@Pc(95) int local95 = (Static237.anInt5285 - local73 - 1) * 16 + local9 + 31;
			@Pc(97) short local97 = -1;
			if (local69 > local7 && local7 + local11 > local69 && local71 > local95 - 13 && local95 + 3 > local71) {
				local97 = -256;
			}
			@Pc(131) int[] local131 = null;
			if (Static137.method3041(local80.anInt4308)) {
				local131 = Static165.method3446((int) local80.aLong126).anIntArray78;
			} else if (Static114.method5269(local80.anInt4308)) {
				@Pc(155) Class7_Sub1_Sub1_Sub1 local155 = Static84.aClass7_Sub1_Sub1_Sub1Array1[(int) local80.aLong126];
				if (local155 != null) {
					local131 = local155.aClass75_1.anIntArray157;
				}
			} else if (Static91.method1996(local80.anInt4308)) {
				if (local80.anInt4308 == 1009) {
					local131 = Static83.method1840((int) local80.aLong126).anIntArray471;
				} else {
					local131 = Static83.method1840((int) (local80.aLong126 >>> 32 & 0x7FFFFFFFL)).anIntArray471;
				}
			}
			@Pc(196) String local196 = Static37.method928(local80);
			if (local131 != null) {
				local196 = local196 + Static118.method2581(local131);
			}
			local73++;
			Static150.aClass30_2.method4850(local97, local196, Static265.aClass29Array12, Static341.anIntArray582, local7 + 3, 0, local95);
		}
		Static302.method5277(Static52.anInt1577, Static140.anInt3473, Static259.anInt4930, Static234.anInt5225);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!kb;I)Z")
	public static boolean method6140(@OriginalArg(0) Class107 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean267) {
			return false;
		} else if (!arg0.method3291()) {
			return false;
		} else if (Static4.aClass183_1.method5053((long) arg0.anInt3768) == null) {
			return Static10.aClass183_2.method5053((long) arg0.anInt3789) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!ai;)I")
	public static int method6141(@OriginalArg(1) Class7_Sub1_Sub1_Sub1 arg0) {
		@Pc(8) Class75 local8 = arg0.aClass75_1;
		if (local8.anIntArray155 != null) {
			local8 = local8.method2064();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(22) int local22 = local8.anInt2483;
		@Pc(26) Class83 local26 = arg0.method5982();
		if (arg0.aBoolean506) {
			local22 = local8.anInt2477;
		} else if (local26.anInt2847 == arg0.anInt7053 || local26.anInt2833 == arg0.anInt7053 || local26.anInt2831 == arg0.anInt7053 || arg0.anInt7053 == local26.anInt2853) {
			local22 = local8.anInt2472;
		} else if (arg0.anInt7053 == local26.anInt2845 || arg0.anInt7053 == local26.anInt2855 || arg0.anInt7053 == local26.anInt2848 || local26.anInt2854 == arg0.anInt7053) {
			local22 = local8.anInt2459;
		}
		return local22;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method6142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class154 local7 = Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class93 local13 = local7.aClass93_3; local13 != null; local13 = local13.aClass93_2) {
			@Pc(17) Class7_Sub1 local17 = local13.aClass7_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort93 == arg1 && local17.aShort91 == arg2) {
				Static298.method5247(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BZ)V")
	public static void method6144(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static340.aByteArrayArray57;
		} else {
			local9 = Static139.aByteArrayArray26;
		}
		@Pc(24) int local24 = Static93.aByteArrayArray22.length;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) byte[] local32 = local9[local26];
			if (local32 != null) {
				@Pc(45) int local45 = (Static112.anIntArray204[local26] >> 8) * 64 - Static149.anInt3667;
				@Pc(55) int local55 = (Static112.anIntArray204[local26] & 0xFF) * 64 - Static96.anInt2446;
				Static56.method1395();
				Static243.method4564(local32, arg0, local55, Static221.aClass40_6, local45, Static66.aClass22Array1);
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIBII)V")
	public static void method6146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(4, arg2);
		local8.method2539();
		local8.anInt2954 = arg0;
		local8.anInt2952 = arg3;
		local8.anInt2960 = arg1;
	}
}
