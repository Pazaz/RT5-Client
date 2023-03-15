import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
	public static int anInt4896 = 0;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIII)V")
	public static void method4487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 + 1;
		Static101.method2163(arg1, Static357.anIntArrayArray58[arg2], arg4, arg0);
		@Pc(18) int local18 = arg3 - 1;
		Static101.method2163(arg1, Static357.anIntArrayArray58[arg3], arg4, arg0);
		for (@Pc(29) int local29 = local9; local29 <= local18; local29++) {
			@Pc(35) int[] local35 = Static357.anIntArrayArray58[local29];
			local35[arg0] = local35[arg1] = arg4;
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	public static void method4490() {
		Static286.method4921();
		Static65.aClass19_3 = null;
		Static24.aClass42_2 = null;
		Static332.aClass21ArrayArray3 = null;
		Static79.aClass42_4 = null;
		Static62.aClass42_5 = null;
	}
}
