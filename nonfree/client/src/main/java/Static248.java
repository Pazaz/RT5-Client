import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static248 {

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "[I")
	public static final int[] anIntArray313 = new int[13];

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLclient!wda;)I")
	public static int method3526(@OriginalArg(1) Class397 arg0) {
		if (Static702.aClass397_13 == arg0) {
			return 5120;
		} else if (arg0 == Static702.aClass397_14) {
			return 5122;
		} else if (arg0 == Static702.aClass397_15) {
			return 5124;
		} else if (Static702.aClass397_16 == arg0) {
			return 5121;
		} else if (arg0 == Static702.aClass397_17) {
			return 5123;
		} else if (arg0 == Static702.aClass397_18) {
			return 5125;
		} else if (Static702.aClass397_19 == arg0) {
			return 5131;
		} else if (Static702.aClass397_20 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
