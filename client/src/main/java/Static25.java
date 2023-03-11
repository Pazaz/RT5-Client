import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
	public static int anInt648;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	public static int anInt643 = -1;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString9 = "";

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "[S")
	public static final short[] aShortArray4 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
	public static final int[] anIntArray33 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!tf;)V")
	public static void method858(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		Static365.aClass6Array4[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method860(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static164.aStringArray24.length; local12++) {
			if (Static164.aStringArray24[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)I")
	public static int method861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 <= arg1) {
			return arg2 < arg1 ? arg2 : arg1;
		} else {
			return arg0;
		}
	}
}
