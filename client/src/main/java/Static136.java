import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
	public static int anInt3402 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method3039(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static4.aClass162_14.anInt5438 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static124.anInt3120; local18++) {
			@Pc(24) Class36 local24 = Static165.method3446(local18);
			if ((!arg1 || local24.aBoolean75) && local24.anInt1231 == -1 && local24.anInt1224 == -1 && local24.anInt1206 == 0 && local24.aString51.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static220.aShortArray89 = null;
					Static194.anInt4478 = -1;
					return;
				}
				if (local14.length <= local16) {
					@Pc(75) short[] local75 = new short[local14.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local16; local77++) {
						local75[local77] = local14[local77];
					}
					local14 = local75;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static194.anInt4478 = local16;
		Static220.aShortArray89 = local14;
		Static139.anInt3448 = 0;
		@Pc(110) String[] local110 = new String[Static194.anInt4478];
		for (@Pc(112) int local112 = 0; local112 < Static194.anInt4478; local112++) {
			local110[local112] = Static165.method3446(local14[local112]).aString51;
		}
		Static153.method3290(Static220.aShortArray89, local110);
		Static4.aClass162_14.method4628();
		Static4.aClass162_14.anInt5438 = 2;
	}
}
