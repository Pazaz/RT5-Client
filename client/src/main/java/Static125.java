import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!kk;")
	public static final Class127 aClass127_8 = new Class127("WTRC", 1);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([III[II)V")
	public static void method6343(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg1) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) int local25 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local25;
		@Pc(39) int local39 = arg3[local19];
		arg3[local19] = arg3[arg1];
		arg3[arg1] = local39;
		for (@Pc(51) int local51 = arg2; local51 < arg1; local51++) {
			if (local25 + (local51 & 0x1) > arg0[local51]) {
				@Pc(71) int local71 = arg0[local51];
				arg0[local51] = arg0[local21];
				arg0[local21] = local71;
				@Pc(85) int local85 = arg3[local51];
				arg3[local51] = arg3[local21];
				arg3[local21++] = local85;
			}
		}
		arg0[arg1] = arg0[local21];
		arg0[local21] = local25;
		arg3[arg1] = arg3[local21];
		arg3[local21] = local39;
		method6343(arg0, local21 - 1, arg2, arg3);
		method6343(arg0, arg1, local21 + 1, arg3);
	}
}
