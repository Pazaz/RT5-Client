import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	public static int anInt4353;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
	public static int anInt4355;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "[I")
	public static final int[] anIntArray310 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
	public static int anInt4356 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!oq;IIIII)V")
	public static void method3742(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5348 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static96.anIntArrayArrayArray3[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class1_Sub9_Sub1 local33 = Static68.aClass1_Sub9_Sub1Array1[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt5348; local35++) {
							if (arg0.aClass1_Sub9_Sub1Array3[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass1_Sub9_Sub1Array3[arg0.anInt5348++] = local33;
						if (arg0.anInt5348 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt5348; local7 < 4; local7++) {
			arg0.aClass1_Sub9_Sub1Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!il;)V")
	public static void method3743(@OriginalArg(1) Class1_Sub16 arg0) {
		if (arg0.aByteArray86.length - arg0.anInt6813 < 1) {
			return;
		}
		@Pc(24) int local24 = arg0.method5761();
		if (local24 < 0 || local24 > 1 || arg0.aByteArray86.length - arg0.anInt6813 < 2) {
			return;
		}
		@Pc(48) int local48 = arg0.method5749();
		if (local48 * 6 != arg0.aByteArray86.length - arg0.anInt6813) {
			return;
		}
		while (true) {
			@Pc(64) int local64;
			@Pc(68) int local68;
			do {
				do {
					do {
						if (arg0.anInt6813 >= arg0.aByteArray86.length) {
							return;
						}
						local64 = arg0.method5749();
						local68 = arg0.method5730();
					} while (local64 >= Static294.anIntArray469.length);
				} while (!Static56.aBooleanArray5[local64]);
			} while (Static75.method1742(local64).aChar1 == '1' && (local68 < -1 || local68 > 1));
			Static294.anIntArray469[local64] = local68;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!qj;ILclient!qj;Lclient!nr;)V")
	public static void method3744(@OriginalArg(0) Class162 arg0, @OriginalArg(2) Class162 arg1, @OriginalArg(3) Class40 arg2) {
		Static268.aClass63_7 = Static230.method4379(arg1, Static292.anInt6119);
		Static321.aClass30_4 = arg2.method2768(Static268.aClass63_7, Static363.method3883(arg0, Static292.anInt6119));
		Static208.aClass63_6 = Static230.method4379(arg1, Static203.anInt926);
		Static290.aClass30_3 = arg2.method2768(Static208.aClass63_6, Static363.method3883(arg0, Static203.anInt926));
		Static140.aClass63_4 = Static230.method4379(arg1, Static202.anInt4679);
		Static150.aClass30_2 = arg2.method2768(Static140.aClass63_4, Static363.method3883(arg0, Static202.anInt4679));
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[I[Ljava/lang/Object;II)V")
	public static void method3746(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg0) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) int local24 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local24;
		@Pc(38) Object local38 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local38;
		for (@Pc(50) int local50 = arg3; local50 < arg0; local50++) {
			if ((local50 & 0x1) + local24 > arg1[local50]) {
				@Pc(65) int local65 = arg1[local50];
				arg1[local50] = arg1[local20];
				arg1[local20] = local65;
				@Pc(79) Object local79 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20++] = local79;
			}
		}
		arg1[arg0] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg0] = arg2[local20];
		arg2[local20] = local38;
		method3746(local20 - 1, arg1, arg2, arg3);
		method3746(arg0, arg1, arg2, local20 + 1);
	}
}
