import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
	public static int anInt4584;

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
	public static int anInt4590;

	@OriginalMember(owner = "client!nd", name = "T", descriptor = "Lclient!hb;")
	public static Class1_Sub3_Sub1 aClass1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "Z")
	public static boolean aBoolean321 = true;

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString168 = "Please wait...";

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
	public static int anInt4589 = 0;

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
	public static int anInt4591 = 0;

	@OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
	public static int anInt4599 = 1;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!ks;III)V")
	public static void method3961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub20 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt4008 == -1 && arg2.anIntArray282 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(23) int local23 = Static183.anInt4317 * arg2.anInt4005 >> 8;
		if (arg3 > arg2.anInt4015) {
			local16 = arg3 - arg2.anInt4015;
		} else if (arg3 < arg2.anInt4018) {
			local16 = arg2.anInt4018 - arg3;
		}
		if (arg4 > arg2.anInt4017) {
			local16 += arg4 - arg2.anInt4017;
		} else if (arg2.anInt4012 > arg4) {
			local16 += arg2.anInt4012 - arg4;
		}
		if (arg2.anInt4003 == 0 || arg2.anInt4003 < local16 - 64 || Static183.anInt4317 == 0 || arg0 != arg2.anInt4002) {
			if (arg2.aClass1_Sub3_Sub2_3 != null) {
				Static127.aClass1_Sub3_Sub3_1.method3522(arg2.aClass1_Sub3_Sub2_3);
				arg2.aClass1_Sub3_Sub2_3 = null;
			}
			if (arg2.aClass1_Sub3_Sub2_2 != null) {
				Static127.aClass1_Sub3_Sub3_1.method3522(arg2.aClass1_Sub3_Sub2_2);
				arg2.aClass1_Sub3_Sub2_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(155) int local155 = local23 * (arg2.anInt4003 - local16) / arg2.anInt4003;
		if (arg2.aClass1_Sub3_Sub2_3 != null) {
			arg2.aClass1_Sub3_Sub2_3.method2347(local155);
		} else if (arg2.anInt4008 >= 0) {
			@Pc(173) Class19 local173 = Static356.method468(Static218.aClass162_175, arg2.anInt4008, 0);
			if (local173 != null) {
				@Pc(180) Class1_Sub13_Sub1 local180 = local173.method467().method4255(Static70.aClass81_1);
				@Pc(185) Class1_Sub3_Sub2 local185 = Static362.method2330(local180, local155);
				local185.method2364(-1);
				Static127.aClass1_Sub3_Sub3_1.method3527(local185);
				arg2.aClass1_Sub3_Sub2_3 = local185;
			}
		}
		if (arg2.aClass1_Sub3_Sub2_2 != null) {
			arg2.aClass1_Sub3_Sub2_2.method2347(local155);
			if (!arg2.aClass1_Sub3_Sub2_2.method6169()) {
				arg2.aClass1_Sub3_Sub2_2 = null;
			}
		} else if (arg2.anIntArray282 != null && (arg2.anInt4011 -= arg1) <= 0) {
			@Pc(240) int local240 = (int) (Math.random() * (double) arg2.anIntArray282.length);
			@Pc(248) Class19 local248 = Static356.method468(Static218.aClass162_175, arg2.anIntArray282[local240], 0);
			if (local248 != null) {
				@Pc(255) Class1_Sub13_Sub1 local255 = local248.method467().method4255(Static70.aClass81_1);
				@Pc(260) Class1_Sub3_Sub2 local260 = Static362.method2330(local255, local155);
				local260.method2364(0);
				Static127.aClass1_Sub3_Sub3_1.method3527(local260);
				arg2.aClass1_Sub3_Sub2_2 = local260;
				arg2.anInt4011 = arg2.anInt4010 + (int) (Math.random() * (double) (arg2.anInt4004 - arg2.anInt4010));
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method3962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(22) int local22 = arg2[local12 + arg1] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(43) char local43 = Static259.aCharArray15[local22 - 128];
					if (local43 == '\u0000') {
						local43 = '?';
					}
					local22 = local43;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V")
	public static void method3963(@OriginalArg(1) int arg0) {
		Static338.method6025();
		Static315.method5512();
		@Pc(12) int local12 = Static38.method942(arg0).anInt2335;
		if (local12 == 0) {
			return;
		}
		@Pc(22) int local22 = Static78.anIntArray137[arg0];
		if (local12 == 9) {
			Static352.anInt7341 = local22;
		}
		if (local12 == 6) {
			Static290.anInt6081 = local22;
		}
		if (local12 == 5) {
			Static255.anInt5508 = local22;
		}
	}
}
