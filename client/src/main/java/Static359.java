import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([BIIIBI)V")
	public static void method1627(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		arg1 += arg2;
		@Pc(14) int local14 = arg3 - arg2 >> 2;
		while (true) {
			local14--;
			if (local14 < 0) {
				local14 = arg3 - arg2 & 0x3;
				while (true) {
					local14--;
					if (local14 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(23) int local23 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(28) int local28 = local23 + 1;
			arg0[local23] = 1;
			@Pc(33) int local33 = local28 + 1;
			arg0[local28] = 1;
			arg1 = local33 + 1;
			arg0[local33] = 1;
		}
	}
}
