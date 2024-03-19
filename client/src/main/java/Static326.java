import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	public static int anInt6657;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
	public static int anInt6667;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Lclient!we;")
	public static final Class215 aClass215_93 = new Class215(4);

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Z")
	public static boolean aBoolean478 = false;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Z")
	public static boolean aBoolean480 = true;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public static void method5660() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static187.aBooleanArray12[local11] = false;
		}
		Static186.anInt4353 = Static89.anInt2374;
		Static94.anInt2428 = -1;
		Static330.anInt6823 = Static130.anInt6778;
		Static329.anInt6727 = Static138.anInt3429;
		Static334.anInt6936 = Static197.anInt4521;
		Static350.anInt7319 = 0;
		Static264.anInt5616 = 0;
		Static302.anInt6305 = Static3.anInt92;
		Static303.anInt6342 = 5;
		Static222.anInt5046 = Static88.anInt2339;
		Static168.anInt4073 = -1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method5661(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static213.method1622(arg0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!nr;)V")
	public static void method5662(@OriginalArg(1) Class40 arg0) {
		if (Static236.aBoolean367) {
			Static319.method5607(arg0);
		} else {
			Static352.method6139(arg0);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)V")
	public static void method5663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg1; local7 < arg1 + arg2; local7++) {
			for (local11 = arg4; local11 < arg4 + arg0; local11++) {
				if (local11 >= 0 && local11 < Static25.anInt850 && local7 >= 0 && local7 < Static219.anInt4987) {
					Static220.anIntArrayArrayArray9[arg3][local11][local7] = arg3 <= 0 ? 0 : Static220.anIntArrayArrayArray9[arg3 - 1][local11][local7] - 240;
				}
			}
		}
		if (arg4 > 0 && Static25.anInt850 > arg4) {
			for (local11 = arg1 + 1; local11 < arg2 + arg1; local11++) {
				if (local11 >= 0 && Static219.anInt4987 > local11) {
					Static220.anIntArrayArrayArray9[arg3][arg4][local11] = Static220.anIntArrayArrayArray9[arg3][arg4 - 1][local11];
				}
			}
		}
		if (arg1 > 0 && Static219.anInt4987 > arg1) {
			for (local11 = arg4 + 1; local11 < arg0 + arg4; local11++) {
				if (local11 >= 0 && Static25.anInt850 > local11) {
					Static220.anIntArrayArrayArray9[arg3][local11][arg1] = Static220.anIntArrayArrayArray9[arg3][local11][arg1 - 1];
				}
			}
		}
		if (arg4 < 0 || arg1 < 0 || arg4 >= Static25.anInt850 || arg1 >= Static219.anInt4987) {
			return;
		}
		if (arg3 == 0) {
			if (arg4 > 0 && Static220.anIntArrayArrayArray9[arg3][arg4 - 1][arg1] != 0) {
				Static220.anIntArrayArrayArray9[arg3][arg4][arg1] = Static220.anIntArrayArrayArray9[arg3][arg4 - 1][arg1];
				return;
			}
			if (arg1 > 0 && Static220.anIntArrayArrayArray9[arg3][arg4][arg1 - 1] != 0) {
				Static220.anIntArrayArrayArray9[arg3][arg4][arg1] = Static220.anIntArrayArrayArray9[arg3][arg4][arg1 - 1];
				return;
			}
			if (arg4 > 0 && arg1 > 0 && Static220.anIntArrayArrayArray9[arg3][arg4 - 1][arg1 - 1] != 0) {
				Static220.anIntArrayArrayArray9[arg3][arg4][arg1] = Static220.anIntArrayArrayArray9[arg3][arg4 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && Static220.anIntArrayArrayArray9[arg3 - 1][arg4 - 1][arg1] != Static220.anIntArrayArrayArray9[arg3][arg4 - 1][arg1]) {
			Static220.anIntArrayArrayArray9[arg3][arg4][arg1] = Static220.anIntArrayArrayArray9[arg3][arg4 - 1][arg1];
			return;
		}
		if (arg1 > 0 && Static220.anIntArrayArrayArray9[arg3][arg4][arg1 - 1] != Static220.anIntArrayArrayArray9[arg3 - 1][arg4][arg1 - 1]) {
			Static220.anIntArrayArrayArray9[arg3][arg4][arg1] = Static220.anIntArrayArrayArray9[arg3][arg4][arg1 - 1];
			return;
		}
		if (arg4 > 0 && arg1 > 0 && Static220.anIntArrayArrayArray9[arg3][arg4 - 1][arg1 - 1] != Static220.anIntArrayArrayArray9[arg3 - 1][arg4 - 1][arg1 - 1]) {
			Static220.anIntArrayArrayArray9[arg3][arg4][arg1] = Static220.anIntArrayArrayArray9[arg3][arg4 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public static void method5667() {
		Static299.aClass1_Sub16_Sub2_3.method5798();
		@Pc(18) int local18 = Static299.aClass1_Sub16_Sub2_3.method5800(8);
		@Pc(23) int local23;
		if (local18 < Static49.anInt1559) {
			for (local23 = local18; local23 < Static49.anInt1559; local23++) {
				Static305.anIntArray489[Static15.anInt631++] = Static185.anIntArray309[local23];
			}
		}
		if (Static49.anInt1559 < local18) {
			throw new RuntimeException("gnpov1");
		}
		Static49.anInt1559 = 0;
		for (local23 = 0; local23 < local18; local23++) {
			@Pc(65) int local65 = Static185.anIntArray309[local23];
			@Pc(69) Class7_Sub1_Sub1_Sub1 local69 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local65];
			@Pc(74) int local74 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
			if (local74 == 0) {
				Static185.anIntArray309[Static49.anInt1559++] = local65;
				local69.anInt7079 = Static197.anInt4521;
			} else {
				@Pc(94) int local94 = Static299.aClass1_Sub16_Sub2_3.method5800(2);
				if (local94 == 0) {
					Static185.anIntArray309[Static49.anInt1559++] = local65;
					local69.anInt7079 = Static197.anInt4521;
					Static31.anIntArray61[Static318.anInt6552++] = local65;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local94 == 1) {
						Static185.anIntArray309[Static49.anInt1559++] = local65;
						local69.anInt7079 = Static197.anInt4521;
						local139 = Static299.aClass1_Sub16_Sub2_3.method5800(3);
						local69.method5977(local139, 1);
						local149 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
						if (local149 == 1) {
							Static31.anIntArray61[Static318.anInt6552++] = local65;
						}
					} else if (local94 == 2) {
						Static185.anIntArray309[Static49.anInt1559++] = local65;
						local69.anInt7079 = Static197.anInt4521;
						if (Static299.aClass1_Sub16_Sub2_3.method5800(1) == 1) {
							local139 = Static299.aClass1_Sub16_Sub2_3.method5800(3);
							local69.method5977(local139, 2);
							local149 = Static299.aClass1_Sub16_Sub2_3.method5800(3);
							local69.method5977(local149, 2);
						} else {
							local139 = Static299.aClass1_Sub16_Sub2_3.method5800(3);
							local69.method5977(local139, 0);
						}
						local139 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
						if (local139 == 1) {
							Static31.anIntArray61[Static318.anInt6552++] = local65;
						}
					} else if (local94 == 3) {
						Static305.anIntArray489[Static15.anInt631++] = local65;
					}
				}
			}
		}
	}
}
