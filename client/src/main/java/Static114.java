import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "[I")
	public static int[] anIntArray483;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "[Lclient!be;")
	public static final Class19[] aClass19Array2 = new Class19[50];

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V")
	public static void method5268() {
		Static344.aClass40_9.method2705(((float) Static216.anInt4909 * 0.1F + 0.7F) * 1.1523438F);
		Static344.aClass40_9.method2776(Static125.anInt3170, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static344.aClass40_9.method2756(Static210.anInt4841, -1);
		Static344.aClass40_9.method2716(Static139.aClass94_1);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)Z")
	public static boolean method5269(@OriginalArg(1) int arg0) {
		if (arg0 == 43 || arg0 == 8 || arg0 == 41 || arg0 == 14 || arg0 == 1) {
			return true;
		} else {
			return arg0 == 23 || arg0 == 13 || arg0 == 1008;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([[[Lclient!pm;I)V")
	public static void method5270(@OriginalArg(0) Class154[][][] arg0) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class154[][] local18 = arg0[local12];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(24) int local24 = 0; local24 < local18[local20].length; local24++) {
					@Pc(32) Class154 local32 = local18[local20][local24];
					if (local32 != null) {
						if (local32.aClass7_Sub5_1 instanceof Interface6) {
							((Interface6) local32.aClass7_Sub5_1).method5688();
						}
						if (local32.aClass7_Sub3_2 instanceof Interface6) {
							((Interface6) local32.aClass7_Sub3_2).method5688();
						}
						if (local32.aClass7_Sub3_1 instanceof Interface6) {
							((Interface6) local32.aClass7_Sub3_1).method5688();
						}
						if (local32.aClass7_Sub2_1 instanceof Interface6) {
							((Interface6) local32.aClass7_Sub2_1).method5688();
						}
						if (local32.aClass7_Sub2_2 instanceof Interface6) {
							((Interface6) local32.aClass7_Sub2_2).method5688();
						}
						for (@Pc(82) Class93 local82 = local32.aClass93_3; local82 != null; local82 = local82.aClass93_2) {
							@Pc(87) Class7_Sub1 local87 = local82.aClass7_Sub1_1;
							if (local87 instanceof Interface6) {
								((Interface6) local87).method5688();
							}
						}
					}
				}
			}
		}
	}
}
