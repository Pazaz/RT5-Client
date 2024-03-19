import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!b", name = "R", descriptor = "Lclient!qj;")
	public static Class162 aClass162_30;

	@OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
	public static int anInt634;

	@OriginalMember(owner = "client!b", name = "jb", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!b", name = "T", descriptor = "I")
	public static int anInt627 = 0;

	@OriginalMember(owner = "client!b", name = "V", descriptor = "S")
	public static short aShort14 = 1;

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
	public static int anInt631 = 0;

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
	public static int anInt632 = 0;

	@OriginalMember(owner = "client!b", name = "db", descriptor = "Z")
	public static final boolean aBoolean43 = false;

	@OriginalMember(owner = "client!b", name = "ib", descriptor = "Z")
	public static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ro;ILclient!fi;Lclient!dr;Lclient!sn;ILjava/lang/String;IIBII)V")
	public static void method444(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class63 arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(4) Class142 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (Static303.anInt6342 == 4) {
			local11 = (int) Static188.aFloat17 & 0x3FFF;
		} else {
			local11 = Static238.anInt5295 + (int) Static188.aFloat17 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg0.anInt5803 / 2, arg0.anInt5816 / 2) + 10;
		@Pc(40) int local40 = arg8 * arg8 + arg1 * arg1;
		if (local40 > local32 * local32) {
			return;
		}
		@Pc(54) int local54 = Class39.anIntArray88[local11];
		@Pc(58) int local58 = Class39.anIntArray87[local11];
		if (Static303.anInt6342 != 4) {
			local58 = local58 * 256 / (Static312.anInt6009 + 256);
			local54 = local54 * 256 / (Static312.anInt6009 + 256);
		}
		@Pc(87) int local87 = local54 * arg8 + arg1 * local58 >> 15;
		@Pc(103) int local103 = arg8 * local58 - local54 * arg1 >> 15;
		@Pc(110) int local110 = arg2.method1845(100, arg6, null);
		@Pc(116) int local116 = local87 - local110 / 2;
		@Pc(124) int local124 = arg2.method1846(null, arg6);
		if (-arg0.anInt5803 <= local116 && arg0.anInt5803 >= local116 && -arg0.anInt5816 <= local103 && arg0.anInt5816 >= local103) {
			arg3.method4836(null, arg4, arg9, 0, arg0.anInt5816 / 2 + arg9 - local124 - local103 - arg5, 0, arg7, arg10, 50, 0, arg6, null, arg0.anInt5803 / 2 + arg7 + local116, local110, 1);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIILclient!qc;Lclient!nr;III)Lclient!qc;")
	public static Class86 method445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class86 arg5, @OriginalArg(7) Class40 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(14) long local14 = (long) arg8;
		@Pc(20) Class86 local20 = (Class86) Static108.aClass215_42.method6057(local14);
		if (local20 == null) {
			@Pc(30) Class126 local30 = Static216.method4218(arg8, Static88.aClass162_81);
			if (local30 == null) {
				return null;
			}
			local20 = arg6.method2762(local30, 1031, Static257.anInt5552, 64, 768);
			Static108.aClass215_42.method6050(local20, local14);
		}
		local20 = local20.method5565((byte) 2, 1031, true);
		if (arg0 != 0) {
			local20.method5542(arg0);
		}
		if (arg1 != 0) {
			local20.method5566(arg1);
		}
		if (arg4 != 0) {
			local20.method5529(arg4);
		}
		if (arg7 != 0) {
			local20.method5550(0, arg7, 0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Lclient!nr;I)V")
	public static void method446(@OriginalArg(0) Class40 arg0) {
		if (Static204.aBoolean329) {
			Static326.method5662(arg0);
		} else {
			Static11.method6086(arg0);
		}
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(B)V")
	public static void method447() {
		Static30.anInt3905 = -1;
		Static176.aClass29_14 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method449(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(II)V")
	public static void method450(@OriginalArg(0) int arg0) {
		if (Static344.anInt7239 == 0) {
			Static200.aClass1_Sub3_Sub1_1.method2222(arg0);
		} else {
			Static221.anInt5014 = arg0;
		}
	}
}
