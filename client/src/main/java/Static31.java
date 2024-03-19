import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!c", name = "p", descriptor = "Lclient!qj;")
	public static Class162 aClass162_48;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "Lclient!db;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "I")
	public static int anInt933 = 0;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	public static final int[] anIntArray60 = new int[14];

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[100];

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	public static final int[] anIntArray61 = new int[250];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public static void method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static150.aClass1_Sub16_Sub2_2.method5793(112);
		Static150.aClass1_Sub16_Sub2_2.method5768(arg0);
		Static150.aClass1_Sub16_Sub2_2.method5757(arg3);
		Static150.aClass1_Sub16_Sub2_2.method5782(arg1);
		Static150.aClass1_Sub16_Sub2_2.method5780(arg2);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
	public static void method699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class154 local7 = Static241.aClass154ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class154 local28 = Static241.aClass154ArrayArrayArray2[local9][arg0][arg1] = Static241.aClass154ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte45--;
				for (@Pc(40) Class93 local40 = local28.aClass93_3; local40 != null; local40 = local40.aClass93_2) {
					@Pc(44) Class7_Sub1 local44 = local40.aClass7_Sub1_1;
					if (local44.aShort93 == arg0 && local44.aShort91 == arg1) {
						local44.aByte72--;
					}
				}
			}
		}
		if (Static241.aClass154ArrayArrayArray2[0][arg0][arg1] == null) {
			Static241.aClass154ArrayArrayArray2[0][arg0][arg1] = new Class154(0, arg0, arg1);
			Static241.aClass154ArrayArrayArray2[0][arg0][arg1].aByte46 = 1;
		}
		Static241.aClass154ArrayArrayArray2[0][arg0][arg1].aClass154_1 = local7;
		Static241.aClass154ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
