import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II[BIII)V")
	public static void method1512(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		arg0 += arg2;
		@Pc(19) int local19 = arg3 - arg2 >> 2;
		while (true) {
			local19--;
			if (local19 < 0) {
				local19 = arg3 - arg2 & 0x3;
				while (true) {
					local19--;
					if (local19 < 0) {
						return;
					}
					arg1[arg0++] = 1;
				}
			}
			@Pc(26) int local26 = arg0 + 1;
			arg1[arg0] = 1;
			@Pc(31) int local31 = local26 + 1;
			arg1[local26] = 1;
			@Pc(36) int local36 = local31 + 1;
			arg1[local31] = 1;
			arg0 = local36 + 1;
			arg1[local36] = 1;
		}
	}
}
