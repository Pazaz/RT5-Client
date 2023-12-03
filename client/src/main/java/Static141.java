import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!i", name = "ab", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!i", name = "P", descriptor = "Lclient!jh;")
	public static SecondaryHashTable aClass115_1 = new SecondaryHashTable(8);

	@OriginalMember(owner = "client!i", name = "X", descriptor = "Z")
	public static boolean aBoolean189 = false;

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
	public static int anInt2653 = 0;

	@OriginalMember(owner = "client!i", name = "bb", descriptor = "Z")
	public static boolean aBoolean190 = true;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z[IIIIIILclient!dg;III[IIII)I")
	public static int method2654(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) CollisionMap arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static301.anIntArrayArray49[local3][local7] = 0;
				Static13.anIntArrayArray4[local3][local7] = 99999999;
			}
		}
		@Pc(55) boolean local55;
		if (arg11 == 1) {
			local55 = Static7.method6463(arg6, arg2, arg4, arg13, arg12, arg9, arg3, arg5, arg8, arg7);
		} else if (arg11 == 2) {
			local55 = Static230.method4017(arg13, arg12, arg5, arg4, arg9, arg8, arg7, arg6, arg3, arg2);
		} else {
			local55 = Static286.method4927(arg3, arg11, arg5, arg4, arg12, arg9, arg6, arg8, arg2, arg13, arg7);
		}
		@Pc(95) int local95 = arg7 - 64;
		@Pc(99) int local99 = arg13 - 64;
		@Pc(101) int local101 = Static184.anInt3435;
		@Pc(108) int local108 = Static182.anInt3422;
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(123) int local123;
		if (!local55) {
			if (!arg0) {
				return -1;
			}
			local114 = Integer.MAX_VALUE;
			local116 = Integer.MAX_VALUE;
			for (local123 = arg9 - 10; local123 <= arg9 + 10; local123++) {
				for (@Pc(130) int local130 = arg12 - 10; local130 <= arg12 + 10; local130++) {
					@Pc(137) int local137 = local123 - local95;
					@Pc(142) int local142 = local130 - local99;
					if (local137 >= 0 && local142 >= 0 && local137 < 128 && local142 < 128 && Static13.anIntArrayArray4[local137][local142] < 100) {
						@Pc(169) int local169 = 0;
						if (local123 < arg9) {
							local169 = arg9 - local123;
						} else if (arg2 + arg9 - 1 < local123) {
							local169 = local123 + 1 - arg2 - arg9;
						}
						@Pc(201) int local201 = 0;
						if (local130 < arg12) {
							local201 = arg12 - local130;
						} else if (local130 > arg12 + arg8 - 1) {
							local201 = local130 + 1 - arg12 - arg8;
						}
						@Pc(237) int local237 = local169 * local169 + local201 * local201;
						if (local237 < local114 || local237 == local114 && Static13.anIntArrayArray4[local137][local142] < local116) {
							local101 = local123;
							local108 = local130;
							local114 = local237;
							local116 = Static13.anIntArrayArray4[local137][local142];
						}
					}
				}
			}
			if (~local114 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg7 == local101 && local108 == arg13) {
			return 0;
		}
		@Pc(310) byte local310 = 0;
		Static47.anIntArray90[0] = local101;
		local114 = local310 + 1;
		Static257.anIntArray257[0] = local108;
		@Pc(332) int local332;
		local116 = local332 = Static301.anIntArrayArray49[local101 - local95][local108 - local99];
		while (arg7 != local101 || local108 != arg13) {
			if (local332 != local116) {
				local332 = local116;
				Static47.anIntArray90[local114] = local101;
				Static257.anIntArray257[local114++] = local108;
			}
			if ((local116 & 0x2) != 0) {
				local101++;
			} else if ((local116 & 0x8) != 0) {
				local101--;
			}
			if ((local116 & 0x1) != 0) {
				local108++;
			} else if ((local116 & 0x4) != 0) {
				local108--;
			}
			local116 = Static301.anIntArrayArray49[local101 - local95][local108 - local99];
		}
		local123 = 0;
		while (local114-- > 0) {
			arg1[local123] = Static47.anIntArray90[local114];
			arg10[local123++] = Static257.anIntArray257[local114];
			if (arg1.length <= local123) {
				break;
			}
		}
		return local123;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
	public static void method2655() {
		if (anInt2653 <= 0) {
			Static25.aString9 = "";
			return;
		}
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static124.aStringArray65.length; local19++) {
			if (Static124.aStringArray65[local19].startsWith("--> ")) {
				local17++;
				if (anInt2653 == local17) {
					Static25.aString9 = Static124.aStringArray65[local19].substring(4);
					return;
				}
			}
		}
	}
}
