import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "Lclient!ro;")
	public static Class177 aClass177_11 = null;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method3369(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static332.aClass35_1);
		arg0.removeFocusListener(Static332.aClass35_1);
		Static62.anInt1707 = -1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III[S[Ljava/lang/String;)V")
	public static void method3370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg1) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) String local16 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local16;
		@Pc(30) short local30 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local30;
		for (@Pc(42) int local42 = arg0; local42 < arg1; local42++) {
			if (local16 == null || arg3[local42] != null && (local42 & 0x1) > arg3[local42].compareTo(local16)) {
				@Pc(67) String local67 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12] = local67;
				@Pc(81) short local81 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12++] = local81;
			}
		}
		arg3[arg1] = arg3[local12];
		arg3[local12] = local16;
		arg2[arg1] = arg2[local12];
		arg2[local12] = local30;
		method3370(arg0, local12 - 1, arg2, arg3);
		method3370(local12 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(Z)V")
	public static void method3372() {
		Static143.aClass183_13.method5051();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)Lclient!jq;")
	public static Class104 method3373(@OriginalArg(0) int arg0) {
		@Pc(10) Class104 local10 = (Class104) Static117.aClass215_48.method6057((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static110.aClass162_113.method4636(arg0, 35);
		local10 = new Class104();
		if (local20 != null) {
			local10.method3227(new Class1_Sub16(local20));
		}
		local10.method3224();
		Static117.aClass215_48.method6050(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	public static void method3376() {
		Static20.aClass215_11.method6052();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ[[B[BI[I[[B[I)I")
	public static int method3378(@OriginalArg(0) int arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg0];
		@Pc(15) int local15 = arg4[arg0] + local9;
		@Pc(28) int local28 = arg6[arg3];
		@Pc(34) int local34 = arg4[arg3] + local28;
		@Pc(36) int local36 = local9;
		if (local28 > local9) {
			local36 = local28;
		}
		@Pc(47) int local47 = local15;
		if (local15 > local34) {
			local47 = local34;
		}
		@Pc(62) int local62 = arg2[arg0] & 0xFF;
		if (local62 > (arg2[arg3] & 0xFF)) {
			local62 = arg2[arg3] & 0xFF;
		}
		@Pc(83) byte[] local83 = arg1[arg0];
		@Pc(87) byte[] local87 = arg5[arg3];
		@Pc(92) int local92 = local36 - local9;
		@Pc(97) int local97 = local36 - local28;
		for (@Pc(99) int local99 = local36; local99 < local47; local99++) {
			@Pc(111) int local111 = local87[local97++] + local83[local92++];
			if (local62 > local111) {
				local62 = local111;
			}
		}
		return -local62;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIII)V")
	public static void method3381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(22) int local22 = -1;
		Static12.method349(arg0 + arg3, Static87.anIntArrayArray9[arg1], arg2, arg0 - arg3);
		while (local7 < local9) {
			local22 += 2;
			local7++;
			local12 += local22;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(58) int[] local58 = Static87.anIntArrayArray9[local9 + arg1];
				@Pc(64) int[] local64 = Static87.anIntArrayArray9[arg1 - local9];
				@Pc(68) int local68 = arg0 + local7;
				@Pc(72) int local72 = arg0 - local7;
				Static12.method349(local68, local58, arg2, local72);
				Static12.method349(local68, local64, arg2, local72);
			}
			@Pc(88) int local88 = arg0 + local9;
			@Pc(93) int local93 = arg0 - local9;
			@Pc(99) int[] local99 = Static87.anIntArrayArray9[local7 + arg1];
			@Pc(106) int[] local106 = Static87.anIntArrayArray9[arg1 - local7];
			Static12.method349(local88, local99, arg2, local93);
			Static12.method349(local88, local106, arg2, local93);
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)I")
	public static int method3383(@OriginalArg(0) int arg0) {
		if (Static31.aClass42_1 != null) {
			Static31.aClass42_1.method1271();
			Static31.aClass42_1 = null;
		}
		Static221.anInt5015++;
		if (Static221.anInt5015 > 4) {
			Static221.anInt5015 = 0;
			Static97.anInt2479 = 0;
			return arg0;
		}
		Static97.anInt2479 = 0;
		if (Static237.anInt5290 == Static353.anInt7369) {
			Static237.anInt5290 = Static146.anInt3618;
		} else {
			Static237.anInt5290 = Static353.anInt7369;
		}
		return -1;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(IB)V")
	public static void method3384() {
		Static20.aClass215_11.method6063(5);
	}
}
