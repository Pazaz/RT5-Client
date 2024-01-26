import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!r", name = "z", descriptor = "Lclient!dh;")
	public static Class79 aClass79_6;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "[I")
	public static final int[] anIntArray594 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BC)Z")
	public static boolean method6536(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static596.method7815(arg0)) {
			return true;
		} else {
			@Pc(25) char[] local25 = Static334.aCharArray5;
			for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
				@Pc(32) char local32 = local25[local27];
				if (local32 == arg0) {
					return true;
				}
			}
			@Pc(49) char[] local49 = Static349.aCharArray6;
			for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
				@Pc(56) char local56 = local49[local51];
				if (arg0 == local56) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)V")
	public static void method6537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub2_Sub2 local16 = Static440.method5963(1, (long) arg1);
		local16.method202();
		local16.anInt197 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)I")
	public static int method6538(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) int local6 = arg2.length();
		@Pc(9) int local9 = arg0.length();
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local11 - local22 < local6 || local9 > local13 - local24) {
			if (local11 - local22 >= local6) {
				return -1;
			}
			if (local9 <= local13 - local24) {
				return 1;
			}
			@Pc(62) char local62;
			if (local22 == '\u0000') {
				local62 = arg2.charAt(local11++);
			} else {
				local62 = local22;
			}
			@Pc(77) char local77;
			if (local24 == '\u0000') {
				local77 = arg0.charAt(local13++);
			} else {
				local77 = local24;
			}
			local22 = Static499.method6670(local62);
			local24 = Static499.method6670(local77);
			local62 = Static322.method9436(arg1, local62);
			local77 = Static322.method9436(arg1, local77);
			if (local62 != local77 && Character.toUpperCase(local62) != Character.toUpperCase(local77)) {
				local62 = Character.toLowerCase(local62);
				local77 = Character.toLowerCase(local77);
				if (local77 != local62) {
					return Static511.method6770(arg1, local62) - Static511.method6770(arg1, local77);
				}
			}
		}
		@Pc(149) int local149 = Math.min(local6, local9);
		for (@Pc(151) int local151 = 0; local151 < local149; local151++) {
			if (arg1 == 2) {
				local11 = local6 - local151 - 1;
				local13 = local9 - local151 - 1;
			} else {
				local13 = local151;
				local11 = local151;
			}
			@Pc(180) char local180 = arg2.charAt(local11);
			@Pc(184) char local184 = arg0.charAt(local13);
			if (local180 != local184 && Character.toUpperCase(local180) != Character.toUpperCase(local184)) {
				local180 = Character.toLowerCase(local180);
				local184 = Character.toLowerCase(local184);
				if (local180 != local184) {
					return Static511.method6770(arg1, local180) - Static511.method6770(arg1, local184);
				}
			}
		}
		@Pc(239) int local239 = local6 - local9;
		if (local239 != 0) {
			return local239;
		}
		for (@Pc(246) int local246 = 0; local246 < local149; local246++) {
			@Pc(251) char local251 = arg2.charAt(local246);
			@Pc(255) char local255 = arg0.charAt(local246);
			if (local251 != local255) {
				return Static511.method6770(arg1, local251) - Static511.method6770(arg1, local255);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public static void method6539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class8_Sub3 local7 = new Class8_Sub3();
		local7.anInt958 = arg0;
		local7.anInt954 = arg6;
		local7.anInt957 = arg3;
		local7.aString3 = arg2;
		local7.anInt959 = arg5;
		local7.anInt953 = Static333.anInt5455 + arg1;
		local7.anInt956 = arg4;
		Static422.aClass130_9.method2787(local7);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Z")
	public static boolean method6540(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
