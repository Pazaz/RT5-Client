import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([I[IIILclient!am;I)Lclient!jv;")
	public static Class1_Sub2 method7113(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19_Sub1 arg3, @OriginalArg(5) int arg4) {
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (!arg3.method8071(Static679.aClass92_15, Static702.aClass397_16)) {
			@Pc(73) int[] local73 = new int[arg2 * arg4];
			for (local24 = 0; local24 < arg4; local24++) {
				local34 = local24 * arg2 + arg0[local24];
				for (local36 = 0; local36 < arg1[local24]; local36++) {
					local73[local34++] = -16777216;
				}
			}
			return new Class1_Sub2(arg3, arg2, arg4, local73);
		}
		@Pc(22) byte[] local22 = new byte[arg4 * arg2];
		for (local24 = 0; local24 < arg4; local24++) {
			local34 = arg0[local24] + local24 * arg2;
			for (local36 = 0; local36 < arg1[local24]; local36++) {
				local22[local34++] = -1;
			}
		}
		return new Class1_Sub2(arg3, arg2, arg4, local22);
	}
}
