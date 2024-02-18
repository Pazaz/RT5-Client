import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLclient!sb;Lclient!sb;[I)V")
	public static void method1592(@OriginalArg(1) Class330 arg0, @OriginalArg(2) Class330 arg1, @OriginalArg(3) int[] arg2) {
		Static555.aClass330_106 = arg1;
		Static237.aClass330_87 = arg0;
		if (arg2 != null) {
			Static552.anIntArray753 = arg2;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
	public static void method1593() {
		@Pc(7) int local7 = Static338.anInt5564;
		@Pc(9) int[] local9 = Static210.anIntArray280;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class8_Sub2_Sub1_Sub2_Sub1 local24 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local9[local16]];
			if (local24 != null) {
				Static489.method6547(false, local24);
			}
		}
	}
}
