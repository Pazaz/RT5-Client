import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
	public static int anInt6817;

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "[I")
	public static final int[] anIntArray477 = new int[4096];

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray13 = new int[2][][];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIIII)V")
	public static void method6103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static28.anInt675 <= arg1 - arg3 && arg3 + arg1 <= Static82.anInt1837 && arg2 - arg3 >= Static365.anInt6832 && Static161.anInt2954 >= arg2 + arg3) {
			Static220.method3870(arg3, arg2, arg0, arg1);
		} else {
			Static230.method4012(arg3, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZII[Lclient!nk;ZI)V")
	public static void method6105(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class161[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) Class161 local9 = arg3[local3];
			if (local9 != null && arg2 == local9.anInt4275) {
				Static371.method6256(arg1, arg4, arg0, local9);
				Static287.method4939(local9, arg4, arg1);
				if (local9.anInt4281 - local9.anInt4248 < local9.anInt4258) {
					local9.anInt4258 = local9.anInt4281 - local9.anInt4248;
				}
				if (local9.anInt4258 < 0) {
					local9.anInt4258 = 0;
				}
				if (local9.anInt4259 > local9.anInt4266 - local9.anInt4261) {
					local9.anInt4259 = local9.anInt4266 - local9.anInt4261;
				}
				if (local9.anInt4259 < 0) {
					local9.anInt4259 = 0;
				}
				if (local9.anInt4272 == 0) {
					Static85.method1911(arg0, local9);
				}
			}
		}
	}
}
