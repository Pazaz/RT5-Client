import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
	public static int anInt87;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
	public static int anInt89;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "Lclient!nl;")
	public static Class162 aClass162_1 = new Class162();

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
	public static int anInt88 = -1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg8 && arg5 == arg3 && arg4 == arg7 && arg1 == arg2) {
			Static384.method6416(arg2, arg7, arg8, arg5, arg6);
			return;
		}
		@Pc(27) int local27 = arg8;
		@Pc(29) int local29 = arg5;
		@Pc(33) int local33 = arg8 * 3;
		@Pc(37) int local37 = arg5 * 3;
		@Pc(41) int local41 = arg0 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg4 * 3;
		@Pc(53) int local53 = arg1 * 3;
		@Pc(61) int local61 = arg7 + local41 - local49 - arg8;
		@Pc(71) int local71 = arg2 + local45 - local53 - arg5;
		@Pc(80) int local80 = local33 + local49 - local41 - local41;
		@Pc(89) int local89 = local37 + local53 - local45 - local45;
		@Pc(94) int local94 = local41 - local33;
		@Pc(99) int local99 = local45 - local37;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(109) int local109 = local101 * local101 >> 12;
			@Pc(115) int local115 = local109 * local101 >> 12;
			@Pc(119) int local119 = local115 * local61;
			@Pc(123) int local123 = local115 * local71;
			@Pc(127) int local127 = local109 * local80;
			@Pc(131) int local131 = local109 * local89;
			@Pc(135) int local135 = local101 * local94;
			@Pc(139) int local139 = local99 * local101;
			@Pc(149) int local149 = (local135 + local127 + local119 >> 12) + arg8;
			@Pc(159) int local159 = (local139 + local131 + local123 >> 12) + arg5;
			Static384.method6416(local159, local149, local27, local29, arg6);
			local29 = local159;
			local27 = local149;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILclient!gq;Lclient!gq;)V")
	public static void method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub1 arg3, @OriginalArg(4) Class11_Sub1 arg4) {
		@Pc(4) Class67 local4 = Static266.method4500(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub1_3 = arg3;
			local4.aClass11_Sub1_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
	public static void method77() {
		Static337.aClass135_37 = new LinkedList();
	}
}
