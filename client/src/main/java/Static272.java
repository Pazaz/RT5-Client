import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!rm", name = "ab", descriptor = "I")
	public static int anInt5743;

	@OriginalMember(owner = "client!rm", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString209 = "Loaded sprites";

	@OriginalMember(owner = "client!rm", name = "Z", descriptor = "I")
	public static volatile int anInt5742 = -1;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIZIIIIIIII)V")
	public static void method4896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class1_Sub40 local7 = new Class1_Sub40();
		local7.anInt6728 = arg4;
		local7.anInt6731 = arg10;
		local7.anInt6741 = arg11;
		local7.anInt6739 = arg5;
		local7.anInt6726 = arg3;
		local7.anInt6736 = arg8;
		local7.anInt6729 = arg7;
		local7.anInt6740 = arg9;
		local7.anInt6734 = arg2;
		local7.anInt6738 = arg0;
		local7.anInt6735 = arg6;
		local7.anInt6730 = arg1;
		Static166.aClass130_23.method3760(local7);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIB)V")
	public static void method4898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < arg0) {
			Static12.method349(arg0, Static87.anIntArrayArray9[arg1], arg3, arg2);
		} else {
			Static12.method349(arg2, Static87.anIntArrayArray9[arg1], arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)Z")
	public static boolean method4899(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}
}
