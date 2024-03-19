import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString178;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Z")
	public static boolean aBoolean354 = false;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
	public static final int[] anIntArray381 = new int[200];

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
	public static int anInt5098 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII[IZI[IIIIIIILclient!bi;)I")
	public static int method4349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class22 arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				client.lb[local7][local11] = 0;
				Static152.anIntArrayArray23[local7][local11] = 99999999;
			}
		}
		@Pc(60) boolean local60;
		if (arg8 == 1) {
			local60 = Static195.method3855(arg10, arg13, arg3, arg0, arg9, arg12, arg11, arg2, arg7, arg1);
		} else if (arg8 == 2) {
			local60 = Static130.method5778(arg11, arg13, arg10, arg2, arg0, arg1, arg7, arg12, arg9, arg3);
		} else {
			local60 = Static13.method5498(arg12, arg8, arg7, arg9, arg3, arg10, arg0, arg1, arg11, arg2, arg13);
		}
		@Pc(100) int local100 = arg2 - 64;
		@Pc(104) int local104 = arg0 - 64;
		@Pc(106) int local106 = Static213.anInt1927;
		@Pc(108) int local108 = Static118.anInt3014;
		@Pc(116) int local116;
		@Pc(118) int local118;
		@Pc(125) int local125;
		if (!local60) {
			if (!arg5) {
				return -1;
			}
			local116 = Integer.MAX_VALUE;
			local118 = Integer.MAX_VALUE;
			for (local125 = arg11 - 10; local125 <= arg11 + 10; local125++) {
				for (@Pc(132) int local132 = arg9 - 10; local132 <= arg9 + 10; local132++) {
					@Pc(139) int local139 = local125 - local100;
					@Pc(143) int local143 = local132 - local104;
					if (local139 >= 0 && local143 >= 0 && local139 < 128 && local143 < 128 && Static152.anIntArrayArray23[local139][local143] < 100) {
						@Pc(172) int local172 = 0;
						if (arg11 > local125) {
							local172 = arg11 - local125;
						} else if (arg11 + arg12 - 1 < local125) {
							local172 = local125 + 1 - arg11 - arg12;
						}
						@Pc(201) int local201 = 0;
						if (arg9 > local132) {
							local201 = arg9 - local132;
						} else if (arg9 + arg7 - 1 < local132) {
							local201 = local132 + 1 - arg7 - arg9;
						}
						@Pc(245) int local245 = local172 * local172 + local201 * local201;
						if (local245 < local116 || local245 == local116 && Static152.anIntArrayArray23[local139][local143] < local118) {
							local108 = local132;
							local118 = Static152.anIntArrayArray23[local139][local143];
							local106 = local125;
							local116 = local245;
						}
					}
				}
			}
			if (local116 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local106 == arg2 && local108 == arg0) {
			return 0;
		}
		@Pc(323) byte local323 = 0;
		Static289.anIntArray386[0] = local106;
		local116 = local323 + 1;
		Static180.anIntArray299[0] = local108;
		@Pc(344) int local344;
		local118 = local344 = client.lb[local106 - local100][local108 - local104];
		while (arg2 != local106 || arg0 != local108) {
			if (local118 != local344) {
				Static289.anIntArray386[local116] = local106;
				local344 = local118;
				Static180.anIntArray299[local116++] = local108;
			}
			if ((local118 & 0x1) != 0) {
				local108++;
			} else if ((local118 & 0x4) != 0) {
				local108--;
			}
			if ((local118 & 0x2) != 0) {
				local106++;
			} else if ((local118 & 0x8) != 0) {
				local106--;
			}
			local118 = client.lb[local106 - local100][local108 - local104];
		}
		local125 = 0;
		while (local116-- > 0) {
			arg4[local125] = Static289.anIntArray386[local116];
			arg6[local125++] = Static180.anIntArray299[local116];
			if (local125 >= arg4.length) {
				break;
			}
		}
		return local125;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V")
	public static void method4353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class154 local7 = Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class7_Sub3 local13 = local7.aClass7_Sub3_2;
		@Pc(16) Class7_Sub3 local16 = local7.aClass7_Sub3_1;
		if (local13 != null) {
			local13.anInt6684 = local13.anInt6684 * arg3 / 16;
			local13.anInt6680 = local13.anInt6680 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt6684 = local16.anInt6684 * arg3 / 16;
			local16.anInt6680 = local16.anInt6680 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method4354(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static272.method4899(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(42) int local42;
			do {
				local42 = arg0.nextInt();
			} while (local39 <= local42);
			return Static122.method2618(arg1, local42);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method4355() {
		Static352.aClass215_102.method6060();
		Static11.aClass215_99.method6060();
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public static void method4356() {
		@Pc(10) Class215 local10 = Static223.aClass215_70;
		synchronized (Static223.aClass215_70) {
			Static223.aClass215_70.method6060();
		}
		local10 = Static67.aClass215_6;
		synchronized (Static67.aClass215_6) {
			Static67.aClass215_6.method6060();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static199.method3942(arg8)) {
			Static37.method934(Class1_Sub2_Sub10.lb[arg8], -1, arg2, arg0, arg6, arg4, arg3, arg1, arg7, arg5);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public static void method4359() {
		Static150.aClass215_55.method6052();
	}
}
