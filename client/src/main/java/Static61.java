import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
	public static int anInt1677;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "J")
	public static long aLong54;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	public static int anInt1679 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)I")
	public static int method1432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static62.aByteArrayArrayArray3[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static62.aByteArrayArrayArray3[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIB)V")
	public static void method1434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(15, 0);
		local8.method2539();
		local8.anInt2960 = arg1;
		local8.anInt2952 = arg0;
	}
}
