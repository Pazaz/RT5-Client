import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Lclient!os;")
	public static Class146 aClass146_5;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "[S")
	public static final short[] aShortArray27 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZB)V")
	public static void method2071(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local9 = 1;
			local11 = Static32.aByteArrayArray56;
		} else {
			local11 = Static93.aByteArrayArray22;
			local9 = 4;
		}
		@Pc(20) int local20 = local11.length;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(26) int[] local26 = null;
			@Pc(30) byte[] local30 = local11[local22];
			local36 = Static112.anIntArray204[local22] >> 8;
			local42 = Static112.anIntArray204[local22] & 0xFF;
			@Pc(49) int local49 = local36 * 64 - Static149.anInt3667;
			local56 = local42 * 64 - Static96.anInt2446;
			if (local30 != null) {
				Static56.method1395();
				local26 = Static332.method5831(local49, Static221.aClass40_6, arg0, Static149.anInt3667, local9, Static66.aClass22Array1, local30, Static96.anInt2446, local56);
			}
			if (!arg0 && Static213.anInt1925 / 8 == local36 && Static274.anInt5784 / 8 == local42) {
				if (local26 == null) {
					Static156.aClass210_1 = null;
				} else {
					Static156.aClass210_1 = Static209.method4127(local26[0], local26[1], local26[3], local26[2]);
					Static89.anInt2365 = local26[4];
				}
			}
		}
		for (@Pc(127) int local127 = 0; local127 < local20; local127++) {
			local36 = (Static112.anIntArray204[local127] >> 8) * 64 - Static149.anInt3667;
			local42 = (Static112.anIntArray204[local127] & 0xFF) * 64 - Static96.anInt2446;
			@Pc(155) byte[] local155 = local11[local127];
			if (local155 == null && Static274.anInt5784 < 800) {
				Static56.method1395();
				for (local56 = 0; local56 < local9; local56++) {
					Static326.method5663(64, local42, 64, local56, local36);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)I")
	public static int method2072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = (arg0 * (arg2 & 0xFF00) & 0xFF0000 | arg0 * (arg2 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(25) int local25 = 255 - arg0;
		return ((local25 * (arg1 & 0xFF00) & 0xFF0000 | local25 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local21;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
	public static void method2073() {
		for (@Pc(3) int local3 = 0; local3 < Static62.aByteArrayArrayArray3.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static62.aByteArrayArrayArray3[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static62.aByteArrayArrayArray3[0][0].length; local11++) {
					Static62.aByteArrayArrayArray3[local3][local7][local11] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIIIIILclient!nr;[[[B)V")
	public static void method2074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class40 arg10, @OriginalArg(12) byte[][][] arg11) {
		if (arg0 == 0 || arg1 == 0) {
			return;
		}
		if (arg0 == 9) {
			arg0 = 1;
			arg2 = arg2 + 1 & 0x3;
		}
		if (arg0 == 10) {
			arg2 = arg2 + 3 & 0x3;
			arg0 = 1;
		}
		if (arg0 == 11) {
			arg0 = 8;
			arg2 = arg2 + 3 & 0x3;
		}
		arg10.method2749(arg6, arg7, arg8, arg3, arg9, arg4, arg11[arg0 - 1][arg2], arg1, arg5);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)I")
	public static int method2075(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
