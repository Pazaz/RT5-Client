import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([IIII)V")
	public static void method2012(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = arg1 + arg2 - 7;
		while (arg1 < local5) {
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
		}
		local5 += 7;
		while (arg1 < local5) {
			arg0[arg1++] = arg3;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BI[BII)V")
	public static void method2013(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15;
		if (arg0 == arg2) {
			if (arg1 == arg3) {
				return;
			}
			if (arg3 > arg1 && arg3 < arg1 + arg4) {
				local15 = arg4 - 1;
				@Pc(19) int local19 = arg1 + local15;
				@Pc(23) int local23 = arg3 + local15;
				local15 = local19 - local15;
				local15 += 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
				}
				local15 -= 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
				}
				return;
			}
		}
		local15 = arg4 + arg1;
		@Pc(115) int local115 = local15 - 7;
		while (arg1 < local115) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		local15 = local115 + 7;
		while (arg1 < local15) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([FI[FII)V")
	public static void method2014(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == arg2) {
			return;
		}
		@Pc(114) int local114 = arg4;
		@Pc(115) int local115 = local114 - 7;
		while (arg1 < local115) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		local114 = local115 + 7;
		while (arg1 < local114) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([Ljava/lang/Object;I[Ljava/lang/Object;II)V")
	public static void method2015(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15;
		if (arg0 == arg2) {
			if (arg3 == 0) {
				return;
			}
			if (arg3 > 0 && arg3 < arg4) {
				local15 = arg4 - 1;
				@Pc(19) int local19 = local15;
				@Pc(23) int local23 = arg3 + local15;
				local15 = local19 - local15;
				local15 += 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
				}
				local15 -= 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
				}
				return;
			}
		}
		local15 = arg4;
		@Pc(115) int local115 = local15 - 7;
		while (arg1 < local115) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		local15 = local115 + 7;
		while (arg1 < local15) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([SI[SII)V")
	public static void method2016(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == arg2) {
			return;
		}
		@Pc(114) int local114 = arg4;
		@Pc(115) int local115 = local114 - 7;
		while (arg1 < local115) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		local114 = local115 + 7;
		while (arg1 < local114) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([III)V")
	public static void method2017(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg2 - 7;
		while (arg1 < local5) {
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
		}
		local5 += 7;
		while (arg1 < local5) {
			arg0[arg1++] = 0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([II[III)V")
	public static void method2018(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == arg2) {
			return;
		}
		@Pc(114) int local114 = arg4;
		@Pc(115) int local115 = local114 - 7;
		while (arg1 < local115) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		local114 = local115 + 7;
		while (arg1 < local114) {
			arg2[arg3++] = arg0[arg1++];
		}
	}
}
