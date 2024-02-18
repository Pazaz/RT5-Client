import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "[I")
	public static int[] anIntArray184;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "[I")
	public static final int[] anIntArray183 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
	public static int anInt2129 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()V")
	public static void method2021() {
		Static514.aClass213_2 = Static514.aClass213_3;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
	public static void method2022() {
		for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
			Static489.aClass283Array1[local15] = null;
		}
		Static129.anInt2406 = 0;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(IIII)I")
	public static int method2025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 != -29754) {
			method2026((Class8_Sub2_Sub1) null, false);
		}
		if (Static246.aClass178Array1 == null) {
			return 0;
		}
		@Pc(21) int local21 = arg3 >> 9;
		@Pc(25) int local25 = arg2 >> 9;
		if (local21 < 0 || local25 < 0 || Static720.anInt10859 - 1 < local21 || Static501.anInt7568 - 1 < local25) {
			return 0;
		}
		@Pc(56) int local56 = arg0;
		if (arg0 < 3 && (Static280.aByteArrayArrayArray3[1][local21][local25] & 0x2) != 0) {
			local56 = arg0 + 1;
		}
		return Static246.aClass178Array1[local56].method7878(arg2, arg3);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!qf;Z)Z")
	public static boolean method2026(@OriginalArg(0) Class8_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) boolean local7 = Static246.aClass178Array1 == Static693.aClass178Array2;
		@Pc(9) int local9 = 0;
		@Pc(11) short local11 = 0;
		@Pc(13) byte local13 = 0;
		arg0.method9294();
		if (arg0.aShort131 < 0 || arg0.aShort132 < 0 || arg0.aShort134 >= Static619.anInt1566 || arg0.aShort133 >= Static662.anInt9843) {
			return false;
		}
		@Pc(41) short local41 = 0;
		@Pc(48) int local48;
		for (@Pc(44) int local44 = arg0.aShort131; local44 <= arg0.aShort134; local44++) {
			for (local48 = arg0.aShort132; local48 <= arg0.aShort133; local48++) {
				@Pc(55) Class291 local55 = Static347.method5095(arg0.aByte144, local44, local48);
				if (local55 != null) {
					@Pc(61) Class286 local61 = Static223.method9095(arg0);
					@Pc(64) Class286 local64 = local55.aClass286_2;
					if (local64 == null) {
						local55.aClass286_2 = local61;
					} else {
						while (local64.aClass286_1 != null) {
							local64 = local64.aClass286_1;
						}
						local64.aClass286_1 = local61;
					}
					if (local7 && (Static62.anIntArrayArray33[local44][local48] & 0xFF000000) != 0) {
						local9 = Static62.anIntArrayArray33[local44][local48];
						local11 = Static272.aShortArrayArray5[local44][local48];
						local13 = Static421.aByteArrayArray20[local44][local48];
					}
					if (!arg1 && local55.aClass8_Sub2_Sub2_1 != null && local55.aClass8_Sub2_Sub2_1.aShort46 > local41) {
						local41 = local55.aClass8_Sub2_Sub2_1.aShort46;
					}
				}
			}
		}
		if (local7 && (local9 & 0xFF000000) != 0) {
			for (local48 = arg0.aShort131; local48 <= arg0.aShort134; local48++) {
				for (@Pc(159) int local159 = arg0.aShort132; local159 <= arg0.aShort133; local159++) {
					if ((Static62.anIntArrayArray33[local48][local159] & 0xFF000000) == 0) {
						Static62.anIntArrayArray33[local48][local159] = local9;
						Static272.aShortArrayArray5[local48][local159] = local11;
						Static421.aByteArrayArray20[local48][local159] = local13;
					}
				}
			}
		}
		if (arg1) {
			Static679.aClass8_Sub2_Sub1Array1[Static125.anInt2352++] = arg0;
		} else {
			local48 = Static246.aClass178Array1 == Static693.aClass178Array2 ? 1 : 0;
			if (!arg0.method9283()) {
				arg0.aClass8_Sub2_25 = Static468.aClass8_Sub2Array10[local48];
				Static468.aClass8_Sub2Array10[local48] = arg0;
			} else if (arg0.method9282(0)) {
				arg0.aClass8_Sub2_25 = Static398.aClass8_Sub2Array7[local48];
				Static398.aClass8_Sub2Array7[local48] = arg0;
			} else {
				arg0.aClass8_Sub2_25 = Static576.aClass8_Sub2Array9[local48];
				Static576.aClass8_Sub2Array9[local48] = arg0;
				Static75.aBoolean521 = true;
			}
		}
		if (arg1) {
			arg0.anInt10691 -= local41;
		}
		return true;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIIZ)Ljava/lang/String;")
	public static String method2027(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg2 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + arg2);
		} else if (arg3 && arg1 >= 0) {
			if (arg0) {
				method2025(21, 69, -79, 83);
			}
			@Pc(51) int local51 = 2;
			for (@Pc(55) int local55 = arg1 / arg2; local55 != 0; local55 /= arg2) {
				local51++;
			}
			@Pc(66) char[] local66 = new char[local51];
			local66[0] = '+';
			for (@Pc(74) int local74 = local51 - 1; local74 > 0; local74--) {
				@Pc(77) int local77 = arg1;
				arg1 /= arg2;
				@Pc(88) int local88 = local77 - arg1 * arg2;
				if (local88 < 10) {
					local66[local74] = (char) (local88 + 48);
				} else {
					local66[local74] = (char) (local88 + 87);
				}
			}
			return new String(local66);
		} else {
			return Integer.toString(arg1, arg2);
		}
	}
}
