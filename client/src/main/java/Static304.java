import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
	public static int anInt6381;

	@OriginalMember(owner = "client!tk", name = "J", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!tk", name = "K", descriptor = "[I")
	public static int[] anIntArray487;

	@OriginalMember(owner = "client!tk", name = "L", descriptor = "[Lclient!ul;")
	public static Class204[] aClass204Array1;

	@OriginalMember(owner = "client!tk", name = "A", descriptor = "[I")
	public static final int[] anIntArray486 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
	public static int anInt6378 = 0;

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "Lclient!we;")
	public static final Class215 aClass215_91 = new Class215(64);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZII)I")
	public static int method5334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub14 local12 = (Class1_Sub14) Static143.aClass183_13.method5053((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray226.length; local25++) {
				if (local12.anIntArray224[local25] == arg0) {
					local23 += local12.anIntArray226[local25];
				}
			}
			return local23;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZIZIIZLclient!il;IIIII)V")
	public static void method5335(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class1_Sub16 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg3 == 1) {
			arg7 = 1;
		} else if (arg3 == 2) {
			arg7 = 1;
			arg8 = 1;
		} else if (arg3 == 3) {
			arg8 = 1;
		}
		@Pc(66) int local66;
		if (arg2 < 0 || Static25.anInt850 <= arg2 || arg9 < 0 || Static219.anInt4987 <= arg9) {
			while (true) {
				local66 = arg5.method5761();
				if (local66 == 0) {
					return;
				}
				if (local66 == 1) {
					arg5.method5761();
					return;
				}
				if (local66 <= 49) {
					arg5.method5761();
				}
			}
		}
		if (!arg0 && !arg4) {
			Static62.aByteArrayArrayArray3[arg6][arg2][arg9] = 0;
		}
		while (true) {
			local66 = arg5.method5761();
			if (local66 == 0) {
				if (arg0) {
					Static220.anIntArrayArrayArray9[0][arg2 + arg8][arg7 + arg9] = Static336.aClass77Array3[0].method3986(arg8 + arg2, arg9 + arg7);
					return;
				} else if (arg6 == 0) {
					Static220.anIntArrayArrayArray9[0][arg8 + arg2][arg9 + arg7] = -Static112.method2379(arg1 + 556238, arg10 + 932731) * 8;
					return;
				} else {
					Static220.anIntArrayArrayArray9[arg6][arg2 + arg8][arg9 + arg7] = Static220.anIntArrayArrayArray9[arg6 - 1][arg8 + arg2][arg9 + arg7] - 240;
					return;
				}
			}
			if (local66 == 1) {
				@Pc(160) int local160 = arg5.method5761();
				if (!arg0) {
					if (local160 == 1) {
						local160 = 0;
					}
					if (arg6 == 0) {
						Static220.anIntArrayArrayArray9[0][arg2 + arg8][arg7 + arg9] = -local160 * 8;
						return;
					}
					Static220.anIntArrayArrayArray9[arg6][arg2 + arg8][arg7 + arg9] = Static220.anIntArrayArrayArray9[arg6 - 1][arg2 + arg8][arg7 + arg9] - local160 * 8;
					return;
				}
				Static220.anIntArrayArrayArray9[0][arg8 + arg2][arg7 + arg9] = Static336.aClass77Array3[0].method3986(arg2 + arg8, arg7 + arg9) + local160 * 8;
				return;
			}
			if (local66 <= 49) {
				if (arg4) {
					arg5.method5761();
				} else {
					Static18.aByteArrayArrayArray1[arg6][arg2][arg9] = arg5.method5772();
					aByteArrayArrayArray16[arg6][arg2][arg9] = (byte) ((local66 - 2) / 4);
					Static105.aByteArrayArrayArray8[arg6][arg2][arg9] = (byte) (arg3 + local66 - 2 & 0x3);
				}
			} else if (local66 <= 81) {
				if (!arg0 && !arg4) {
					Static62.aByteArrayArrayArray3[arg6][arg2][arg9] = (byte) (local66 - 49);
				}
			} else if (!arg4) {
				Static139.aByteArrayArrayArray9[arg6][arg2][arg9] = (byte) (local66 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method5337(@OriginalArg(0) String arg0) {
		return Static92.method2004(arg0);
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)I")
	public static int method5338() {
		if ((double) Static201.aFloat53 == 3.0D) {
			return 37;
		} else if ((double) Static201.aFloat53 == 4.0D) {
			return 50;
		} else if ((double) Static201.aFloat53 == 6.0D) {
			return 75;
		} else if ((double) Static201.aFloat53 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
