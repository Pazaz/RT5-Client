import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Lclient!fl;")
	public static Interface4 anInterface4_3;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "Lclient!os;")
	public static Class146 aClass146_4;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray10 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "S")
	public static short aShort37 = 205;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	public static int anInt2438 = -1;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2025(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static43.anInt1459; local11++) {
			if (arg0.equalsIgnoreCase(Static46.aStringArray42[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(CI)Z")
	public static boolean method2028(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!me;")
	public static Class7_Sub1 method2029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class154 local7 = Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class93 local14 = local7.aClass93_3; local14 != null; local14 = local14.aClass93_2) {
			@Pc(18) Class7_Sub1 local18 = local14.aClass7_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort93 == arg1 && local18.aShort91 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
	public static void method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class154 local7 = Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass7_Sub5_1 != null) {
			local7.aClass7_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)V")
	public static void method2032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class158 local7 = Static318.method5594(arg1);
		@Pc(10) int local10 = local7.anInt5365;
		@Pc(13) int local13 = local7.anInt5369;
		@Pc(16) int local16 = local7.anInt5367;
		@Pc(23) int local23 = Class1_Sub40.anIntArray554[local16 - local13];
		if (arg0 < 0 || local23 < arg0) {
			arg0 = 0;
		}
		local23 <<= local13;
		Static157.method3359(local10, local23 & arg0 << local13 | ~local23 & Static78.anIntArray137[local10]);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public static void method2033() {
		if (!Static246.aBoolean472) {
			return;
		}
		@Pc(16) Class177 local16 = Static183.method3720(Static156.anInt3876, Static139.anInt3442);
		if (local16 != null && local16.anObjectArray19 != null) {
			@Pc(25) Class1_Sub15 local25 = new Class1_Sub15();
			local25.anObjectArray4 = local16.anObjectArray19;
			local25.aClass177_9 = local16;
			Static267.method4825(local25);
		}
		Static246.aBoolean472 = false;
		Static161.anInt3951 = -1;
		Static145.method3188(local16);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I")
	public static int method2034(@OriginalArg(0) int arg0) {
		@Pc(7) Class158 local7 = Static318.method5594(arg0);
		@Pc(10) int local10 = local7.anInt5365;
		@Pc(13) int local13 = local7.anInt5369;
		@Pc(23) int local23 = local7.anInt5367;
		@Pc(29) int local29 = Class1_Sub40.anIntArray554[local23 - local13];
		return Static78.anIntArray137[local10] >> local13 & local29;
	}
}
