import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "[Lclient!qa;")
	public static Class29[] aClass29Array12;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Z")
	public static boolean aBoolean396;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "[Lclient!kk;")
	public static final Class26_Sub1[] aClass26_Sub1Array1 = new Class26_Sub1[29];

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
	public static int anInt5622 = 1;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "[I")
	public static final int[] anIntArray415 = new int[5];

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
	public static int anInt5625 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg5 < 1 || arg2 < 1 || Static25.anInt850 - 2 < arg5 || arg2 > Static219.anInt4987 - 2) {
			return;
		}
		if (!Static13.method5497() && !Static58.method1400(arg5, arg2, arg0, Static331.anInt6843)) {
			return;
		}
		if (Static241.aClass154ArrayArrayArray2 == null) {
			return;
		}
		@Pc(51) int local51 = arg0;
		if (arg0 < 3 && Static146.method3193(arg2, arg5)) {
			local51 = arg0 + 1;
		}
		Static89.method1969(arg1, arg5, arg0, Static221.aClass40_6, local51, Static66.aClass22Array1[arg0], arg2);
		if (arg6 < 0) {
			return;
		}
		@Pc(75) boolean local75 = Static218.aBoolean342;
		Static218.aBoolean342 = true;
		Static231.method4394(false, arg6, Static221.aClass40_6, local51, Static66.aClass22Array1[arg0], arg7, arg0, arg5, arg4, arg2, arg3, false);
		Static218.aBoolean342 = local75;
		return;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZJZII)Ljava/lang/String;")
	public static String method4789(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(24) boolean local24 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local24 = true;
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(26);
		@Pc(45) int local45;
		@Pc(50) int local50;
		if (arg3 > 0) {
			for (local45 = 0; local45 < arg3; local45++) {
				local50 = (int) arg1;
				arg1 /= 10L;
				local38.append((char) (local50 + 48 - (int) arg1 * 10));
			}
			local38.append(local7);
		}
		local45 = 0;
		while (true) {
			local50 = (int) arg1;
			arg1 /= 10L;
			local38.append((char) (local50 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local24) {
					local38.append('-');
				}
				return local38.reverse().toString();
			}
			if (arg0) {
				local45++;
				if (local45 % 3 == 0) {
					local38.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method4790() {
		@Pc(1) Class215 local1 = Static94.aClass215_39;
		synchronized (Static94.aClass215_39) {
			Static94.aClass215_39.method6052();
		}
		@Pc(26) Class215 local26 = Static256.aClass215_79;
		synchronized (Static256.aClass215_79) {
			Static256.aClass215_79.method6052();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLclient!qj;)V")
	public static void method4791(@OriginalArg(1) Class162 arg0) {
		Static312.aClass162_207 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
	public static void method4793(@OriginalArg(1) boolean arg0) {
		for (@Pc(8) Class1_Sub20 local8 = (Class1_Sub20) Static268.aClass130_35.method3749(); local8 != null; local8 = (Class1_Sub20) Static268.aClass130_35.method3756()) {
			if (local8.aClass1_Sub3_Sub2_3 != null) {
				Static127.aClass1_Sub3_Sub3_1.method3522(local8.aClass1_Sub3_Sub2_3);
				local8.aClass1_Sub3_Sub2_3 = null;
			}
			if (local8.aClass1_Sub3_Sub2_2 != null) {
				Static127.aClass1_Sub3_Sub3_1.method3522(local8.aClass1_Sub3_Sub2_2);
				local8.aClass1_Sub3_Sub2_2 = null;
			}
			local8.method6172();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(61) Class1_Sub20 local61 = (Class1_Sub20) Static24.aClass130_4.method3749(); local61 != null; local61 = (Class1_Sub20) Static24.aClass130_4.method3756()) {
			if (local61.aClass1_Sub3_Sub2_3 != null) {
				Static127.aClass1_Sub3_Sub3_1.method3522(local61.aClass1_Sub3_Sub2_3);
				local61.aClass1_Sub3_Sub2_3 = null;
			}
			local61.method6172();
		}
		for (@Pc(88) Class1_Sub20 local88 = (Class1_Sub20) Static195.aClass183_22.method5052(); local88 != null; local88 = (Class1_Sub20) Static195.aClass183_22.method5050()) {
			if (local88.aClass1_Sub3_Sub2_3 != null) {
				Static127.aClass1_Sub3_Sub3_1.method3522(local88.aClass1_Sub3_Sub2_3);
				local88.aClass1_Sub3_Sub2_3 = null;
			}
			local88.method6172();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lclient!os;")
	public static Class146 method4794(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static201.aFloat54 == 3.0D) {
				return Static86.aClass146_3;
			}
			if ((double) Static201.aFloat54 == 4.0D) {
				return Static197.aClass146_8;
			}
			if ((double) Static201.aFloat54 == 6.0D) {
				return Static99.aClass146_5;
			}
			if ((double) Static201.aFloat54 >= 8.0D) {
				return Static210.aClass146_9;
			}
		} else if (arg0 == 1) {
			if ((double) Static201.aFloat54 == 3.0D) {
				return Static99.aClass146_5;
			}
			if ((double) Static201.aFloat54 == 4.0D) {
				return Static210.aClass146_9;
			}
			if ((double) Static201.aFloat54 == 6.0D) {
				return Static112.aClass146_6;
			}
			if ((double) Static201.aFloat54 >= 8.0D) {
				return Static345.aClass146_10;
			}
		} else if (arg0 == 2) {
			if ((double) Static201.aFloat54 == 3.0D) {
				return Static112.aClass146_6;
			}
			if ((double) Static201.aFloat54 == 4.0D) {
				return Static345.aClass146_10;
			}
			if ((double) Static201.aFloat54 == 6.0D) {
				return Static211.aClass146_7;
			}
			if ((double) Static201.aFloat54 >= 8.0D) {
				return Static95.aClass146_4;
			}
		}
		return null;
	}
}
