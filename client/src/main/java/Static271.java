import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)I")
	public static int fade(@OriginalArg(0) int t) {
		@Pc(13) int depth = t * (t * t >> 12) >> 12;
		@Pc(19) int x = t * 6 - 61440;
		@Pc(32) int y = (t * x >> 12) + 40960;
		return y * depth >> 12;
	}
}
