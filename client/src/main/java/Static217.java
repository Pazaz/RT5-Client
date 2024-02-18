import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "Lclient!bg;")
	public static final Class38 aClass38_3 = new Class38();

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "[I")
	public static final int[] anIntArray285 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([B[BIIIIIII)V")
	public static void method3185(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) int local17 = -(arg6 >> 2);
		@Pc(22) int local22 = -(arg6 & 0x3);
		for (@Pc(25) int local25 = -arg7; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local17; local29 < 0; local29++) {
				local33 = arg2++;
				arg0[local33] += arg1[arg5++];
				@Pc(45) int local45 = arg2++;
				arg0[local45] += arg1[arg5++];
				@Pc(57) int local57 = arg2++;
				arg0[local57] += arg1[arg5++];
				@Pc(69) int local69 = arg2++;
				arg0[local69] += arg1[arg5++];
			}
			for (@Pc(86) int local86 = local22; local86 < 0; local86++) {
				local33 = arg2++;
				arg0[local33] += arg1[arg5++];
			}
			arg5 += arg4;
			arg2 += arg3;
		}
	}
}
