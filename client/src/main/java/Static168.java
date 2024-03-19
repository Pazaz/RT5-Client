import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	public static int anInt4067;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt4070 = 0;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[Lclient!vp;")
	public static final Class7_Sub1_Sub1_Sub2[] aClass7_Sub1_Sub1_Sub2Array1 = new Class7_Sub1_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public static int anInt4073 = -1;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public static int anInt4074 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
	public static void method3490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = Static283.method5049(Static197.anInt4520, Static180.anInt4240, arg2);
		@Pc(25) int local25 = Static283.method5049(Static197.anInt4520, Static180.anInt4240, arg3);
		@Pc(31) int local31 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg1);
		@Pc(37) int local37 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg4);
		@Pc(45) int local45 = Static283.method5049(Static197.anInt4520, Static180.anInt4240, arg5 + arg2);
		@Pc(54) int local54 = Static283.method5049(Static197.anInt4520, Static180.anInt4240, arg3 - arg5);
		for (@Pc(56) int local56 = local19; local56 < local45; local56++) {
			Static12.method349(local37, Static87.anIntArrayArray9[local56], arg0, local31);
		}
		for (@Pc(76) int local76 = local25; local76 > local54; local76--) {
			Static12.method349(local37, Static87.anIntArrayArray9[local76], arg0, local31);
		}
		@Pc(98) int local98 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg1 + arg5);
		@Pc(106) int local106 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg4 - arg5);
		for (@Pc(108) int local108 = local45; local108 <= local54; local108++) {
			@Pc(114) int[] local114 = Static87.anIntArrayArray9[local108];
			Static12.method349(local98, local114, arg0, local31);
			Static12.method349(local37, local114, arg0, local106);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[II[JI)V")
	public static void method3491(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg1) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) long local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) int local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg1; local46++) {
			if ((long) (local46 & 0x1) + local20 > arg2[local46]) {
				@Pc(67) long local67 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local67;
				@Pc(81) int local81 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local81;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method3491(arg0, local16 - 1, arg2, arg3);
		method3491(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method3492() {
		@Pc(1) Class215 local1 = Static94.aClass215_39;
		synchronized (Static94.aClass215_39) {
			Static94.aClass215_39.method6060();
		}
		local1 = Static256.aClass215_79;
		synchronized (Static256.aClass215_79) {
			Static256.aClass215_79.method6060();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!qj;)V")
	public static void method3493(@OriginalArg(1) Class162 arg0) {
		Static36.aClass162_50 = arg0;
		Static186.anInt4355 = Static36.aClass162_50.method4640(4);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method3494() {
		@Pc(5) Class215 local5 = Static274.aClass215_83;
		synchronized (Static274.aClass215_83) {
			Static274.aClass215_83.method6060();
		}
		local5 = Static245.aClass215_50;
		synchronized (Static245.aClass215_50) {
			Static245.aClass215_50.method6060();
		}
		local5 = Static256.aClass215_78;
		synchronized (Static256.aClass215_78) {
			Static256.aClass215_78.method6060();
		}
		local5 = Static301.aClass215_89;
		synchronized (Static301.aClass215_89) {
			Static301.aClass215_89.method6060();
		}
	}
}
