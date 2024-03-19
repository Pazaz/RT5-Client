import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!up", name = "a", descriptor = "([B[BBIIIIII)V")
	public static void method5638(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg6 >> 2);
		@Pc(9) int local9 = -(arg6 & 0x3);
		for (@Pc(12) int local12 = -arg2; local12 < 0; local12++) {
			@Pc(19) int local19;
			@Pc(23) int local23;
			for (local19 = local4; local19 < 0; local19++) {
				local23 = arg3++;
				arg0[local23] = (byte) (arg0[local23] - arg1[arg5++]);
				@Pc(36) int local36 = arg3++;
				arg0[local36] = (byte) (arg0[local36] - arg1[arg5++]);
				@Pc(49) int local49 = arg3++;
				arg0[local49] = (byte) (arg0[local49] - arg1[arg5++]);
				@Pc(62) int local62 = arg3++;
				arg0[local62] = (byte) (arg0[local62] - arg1[arg5++]);
			}
			for (local19 = local9; local19 < 0; local19++) {
				local23 = arg3++;
				arg0[local23] = (byte) (arg0[local23] - arg1[arg5++]);
			}
			arg3 += arg7;
			arg5 += arg4;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "([BIZI[BIIII)V")
	public static void method5641(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg7 >> 2);
		@Pc(9) int local9 = -(arg7 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(30) int local30;
			@Pc(35) int local35;
			for (local30 = local4; local30 < 0; local30++) {
				local35 = arg2++;
				arg0[local35] += arg3[arg5++];
				@Pc(47) int local47 = arg2++;
				arg0[local47] += arg3[arg5++];
				@Pc(59) int local59 = arg2++;
				arg0[local59] += arg3[arg5++];
				@Pc(71) int local71 = arg2++;
				arg0[local71] += arg3[arg5++];
			}
			for (local30 = local9; local30 < 0; local30++) {
				local35 = arg2++;
				arg0[local35] += arg3[arg5++];
			}
			arg5 += arg1;
			arg2 += arg4;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method5646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(3) int local3 = arg0 % 8;
		@Pc(10) int local10;
		if (local3 == 0) {
			local10 = 0;
		} else {
			local10 = 8 - local3;
		}
		@Pc(25) int local25 = -((arg3 + 8 - 1) / 8);
		@Pc(35) int local35 = -((arg0 + 7) / 8);
		for (@Pc(45) int local45 = local25; local45 < 0; local45++) {
			for (@Pc(52) int local52 = local35; local52 < 0; local52++) {
				if (arg2[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local10;
			if (arg2[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}
}
