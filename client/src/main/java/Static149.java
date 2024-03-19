import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
	public static int anInt3667;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "[I")
	public static final int[] anIntArray265 = new int[13];

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method3228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static199.method3942(arg1)) {
			Static293.method5170(arg5, arg3, arg0, arg2, arg7, Class1_Sub2_Sub10.lb[arg1], arg4, -1, arg6);
		} else if (arg2 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				Static230.aBooleanArray16[local14] = true;
			}
		} else {
			Static230.aBooleanArray16[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public static void method3229() {
		for (@Pc(3) int local3 = 0; local3 < Static185.aClass157ArrayArray1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static185.aClass157ArrayArray1[local3].length; local7++) {
				Static185.aClass157ArrayArray1[local3][local7] = Static316.aClass157_2;
			}
		}
	}
}
