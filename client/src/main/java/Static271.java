import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)I")
	public static int method4567(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local19 >> 12) + 40960;
		return local32 * local13 >> 12;
	}
}
