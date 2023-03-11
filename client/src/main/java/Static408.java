import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(II)I")
	public static int method5732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = (arg0 & 0xFF0000) * arg1 >> 23;
		if (local7 < 2) {
			local7 = 2;
		} else if (local7 > 253) {
			local7 = 253;
		}
		@Pc(26) int local26 = (arg0 & 0xFF00) * arg1 >> 15;
		if (local26 < 2) {
			local26 = 2;
		} else if (local26 > 253) {
			local26 = 253;
		}
		@Pc(45) int local45 = (arg0 & 0xFF) * arg1 >> 7;
		if (local45 < 2) {
			local45 = 2;
		} else if (local45 > 253) {
			local45 = 253;
		}
		return local7 << 16 | local26 << 8 | local45;
	}
}
