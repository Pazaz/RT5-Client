import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BIIII[BI)V")
	public static void method2680(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg7 >> 2);
		@Pc(9) int local9 = -(arg7 & 0x3);
		for (@Pc(12) int local12 = -arg0; local12 < 0; local12++) {
			@Pc(19) int local19;
			@Pc(23) int local23;
			for (local19 = local4; local19 < 0; local19++) {
				local23 = arg2++;
				arg6[local23] += arg1[arg5++];
				@Pc(35) int local35 = arg2++;
				arg6[local35] += arg1[arg5++];
				@Pc(47) int local47 = arg2++;
				arg6[local47] += arg1[arg5++];
				@Pc(59) int local59 = arg2++;
				arg6[local59] += arg1[arg5++];
			}
			for (local19 = local9; local19 < 0; local19++) {
				local23 = arg2++;
				arg6[local23] += arg1[arg5++];
			}
			arg2 += arg4;
			arg5 += arg3;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([BBIIIII)Z")
	public static boolean method2683(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(3) int local3 = arg4 % 8;
		@Pc(8) int local8;
		if (local3 == 0) {
			local8 = 0;
		} else {
			local8 = 8 - local3;
		}
		@Pc(24) int local24 = -((arg2 + 7) / 8);
		@Pc(34) int local34 = -((arg4 + 8 - 1) / 8);
		for (@Pc(41) int local41 = local24; local41 < 0; local41++) {
			for (@Pc(46) int local46 = local34; local46 < 0; local46++) {
				if (arg0[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local8;
			if (arg0[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([B[BIIIIIII)V")
	public static void method2686(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = -(arg2 >> 2);
		@Pc(13) int local13 = -(arg2 & 0x3);
		for (@Pc(16) int local16 = -arg7; local16 < 0; local16++) {
			@Pc(21) int local21;
			@Pc(25) int local25;
			for (local21 = local8; local21 < 0; local21++) {
				local25 = arg3++;
				arg0[local25] = (byte) (arg0[local25] - arg1[arg5++]);
				@Pc(38) int local38 = arg3++;
				arg0[local38] = (byte) (arg0[local38] - arg1[arg5++]);
				@Pc(51) int local51 = arg3++;
				arg0[local51] = (byte) (arg0[local51] - arg1[arg5++]);
				@Pc(64) int local64 = arg3++;
				arg0[local64] = (byte) (arg0[local64] - arg1[arg5++]);
			}
			for (local21 = local13; local21 < 0; local21++) {
				local25 = arg3++;
				arg0[local25] = (byte) (arg0[local25] - arg1[arg5++]);
			}
			arg5 += arg6;
			arg3 += arg4;
		}
	}
}
