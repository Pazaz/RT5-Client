import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!dr;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
	public static int[] anIntArray135 = new int[2];

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray16 = new byte[250][];

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!mi;")
	public static final Class130 aClass130_6 = new Class130();

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString78 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	public static int anInt2093 = -1;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!kb;Lclient!nr;ILclient!lo;II)Z")
	public static boolean method1752(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) Class1_Sub21 arg2) {
		@Pc(12) int local12 = Integer.MAX_VALUE;
		@Pc(14) int local14 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg0.anIntArray271 != null) {
			local12 = Static201.anInt4286 + (arg0.anInt3794 + arg2.anInt4150 - Static201.anInt4282) * (Static201.anInt4276 - Static201.anInt4286) / (Static201.anInt4285 - Static201.anInt4282);
			local16 = Static201.anInt4277 - (Static201.anInt4277 - Static201.anInt4278) * (-Static201.anInt4280 + (arg0.anInt3786 - -arg2.anInt4154)) / (Static201.anInt4279 - Static201.anInt4280);
			local18 = Static201.anInt4277 - (Static201.anInt4277 - Static201.anInt4278) * (arg2.anInt4154 + arg0.anInt3779 - Static201.anInt4280) / (Static201.anInt4279 - Static201.anInt4280);
			local14 = Static201.anInt4286 + (Static201.anInt4276 - Static201.anInt4286) * (arg0.anInt3770 + arg2.anInt4150 - Static201.anInt4282) / (Static201.anInt4285 - Static201.anInt4282);
		}
		@Pc(106) Class29 local106 = null;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		if (arg0.anInt3793 != -1) {
			if (arg2.aBoolean298 && arg0.anInt3780 != -1) {
				local106 = arg0.method3285(true, arg1);
			} else {
				local106 = arg0.method3285(false, arg1);
			}
			if (local106 != null) {
				local108 = arg2.anInt4156 - (local106.method5850() + 1 >> 1);
				local110 = arg2.anInt4156 + (local106.method5850() + 1 >> 1);
				if (local12 > local108) {
					local12 = local108;
				}
				if (local110 > local14) {
					local14 = local110;
				}
				local112 = arg2.anInt4157 - (local106.method5832() + 1 >> 1);
				if (local16 > local112) {
					local16 = local112;
				}
				local114 = arg2.anInt4157 + (local106.method5832() + 1 >> 1);
				if (local114 > local18) {
					local18 = local114;
				}
			}
		}
		@Pc(211) Class146 local211 = null;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(275) int local275;
		@Pc(298) int local298;
		if (arg0.aString138 != null) {
			local211 = Static265.method4794(arg0.anInt3783);
			if (local211 != null) {
				local213 = Static268.aClass63_7.method1848(null, arg0.aString138, Static91.aStringArray18, null);
				local215 = arg2.anInt4157;
				if (local106 == null) {
					local215 -= local211.method4340() * local213 / 2;
				} else {
					local215 -= (local106.method5832() >> 1) + (local211.method4335() * local213);
				}
				for (local275 = 0; local275 < local213; local275++) {
					@Pc(281) String local281 = Static91.aStringArray18[local275];
					if (local213 - 1 > local275) {
						local281 = local281.substring(0, local281.length() - 4);
					}
					local298 = local211.method4339(local281);
					if (local217 < local298) {
						local217 = local298;
					}
				}
				local219 = arg2.anInt4156 - local217 / 2;
				local221 = arg2.anInt4156 + local217 / 2;
				if (local12 > local219) {
					local12 = local219;
				}
				if (local221 > local14) {
					local14 = local221;
				}
				local223 = local215;
				local225 = local211.method4335() * local213 + local215;
				if (local16 > local223) {
					local16 = local223;
				}
				if (local225 > local18) {
					local18 = local225;
				}
			}
		}
		if (Static201.anInt4286 > local14 || Static201.anInt4276 < local12 || Static201.anInt4278 > local18 || local16 > Static201.anInt4277) {
			return true;
		}
		@Pc(403) int local403;
		if (arg0.anIntArray271 != null) {
			@Pc(401) int[] local401 = new int[arg0.anIntArray271.length];
			for (local403 = 0; local403 < local401.length / 2; local403++) {
				local298 = arg0.anIntArray271[local403 * 2] + arg2.anInt4150;
				@Pc(427) int local427 = arg2.anInt4154 + arg0.anIntArray271[local403 * 2 + 1];
				local401[local403 * 2] = (local298 - Static201.anInt4282) * (-Static201.anInt4286 + Static201.anInt4276) / (Static201.anInt4285 - Static201.anInt4282) + Static201.anInt4286;
				local401[local403 * 2 + 1] = Static201.anInt4277 - (Static201.anInt4277 - Static201.anInt4278) * (local427 - Static201.anInt4280) / (Static201.anInt4279 - Static201.anInt4280);
			}
			Static193.method3839(arg1, local401, arg0.anInt3775);
			for (local298 = 0; local298 < local401.length / 2 - 1; local298++) {
				arg1.method2739(local401[local298 * 2 + 1 + 2], local401[(local298 + 1) * 2], local401[local298 * 2 + 1], local401[local298 * 2], arg0.anInt3790);
			}
			arg1.method2739(local401[1], local401[0], local401[local401.length - 1], local401[local401.length - 2], arg0.anInt3790);
		}
		if (local106 != null) {
			if (Static74.anInt2057 > 0 && (Static263.anInt5600 != -1 && arg2.anInt4155 == Static263.anInt5600 || Static259.anInt4933 != -1 && arg0.anInt3789 == Static259.anInt4933)) {
				if (Static243.anInt5366 <= 50) {
					local275 = Static243.anInt5366 * 2;
				} else {
					local275 = (100 - Static243.anInt5366) * 2;
				}
				local403 = local275 << 24 | 0xFFFF00;
				arg1.method2787(arg2.anInt4157, local403, arg2.anInt4156, local106.method5840() / 2 + 7);
				arg1.method2787(arg2.anInt4157, local403, arg2.anInt4156, local106.method5840() / 2 + 5);
				arg1.method2787(arg2.anInt4157, local403, arg2.anInt4156, local106.method5840() / 2 + 3);
				arg1.method2787(arg2.anInt4157, local403, arg2.anInt4156, local106.method5840() / 2 + 1);
				arg1.method2787(arg2.anInt4157, local403, arg2.anInt4156, local106.method5840() / 2);
			}
			local106.method5845(arg2.anInt4156 - (local106.method5850() >> 1), arg2.anInt4157 + -(local106.method5832() >> 1));
		}
		if (arg0.aString138 != null && local211 != null) {
			Static183.method3712(local215, arg1, local217, local213, arg2, local211, arg0);
		}
		if (arg0.anInt3793 != -1 || arg0.aString138 != null) {
			@Pc(706) Class1_Sub42 local706 = new Class1_Sub42(arg2);
			local706.anInt7205 = local112;
			local706.anInt7208 = local108;
			local706.anInt7212 = local114;
			local706.anInt7203 = local223;
			local706.anInt7206 = local221;
			local706.anInt7211 = local110;
			local706.anInt7204 = local225;
			local706.anInt7202 = local219;
			Static112.aClass130_10.method3760(local706);
		}
		return false;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZII)I")
	public static int method1753(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local15 * local15 * 15731 + 789221) * local15 + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)Lclient!cr;")
	public static Class39 method1754(@OriginalArg(1) int arg0) {
		@Pc(10) Class39 local10 = (Class39) Static86.aClass215_37.method6057((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static220.aClass162_178.method4636(arg0, 0);
		local10 = new Class39();
		if (local20 != null) {
			local10.method1010(new Class1_Sub16(local20));
		}
		local10.method1006();
		Static86.aClass215_37.method6050(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([SI)[S")
	public static short[] method1755(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static360.method2016(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
