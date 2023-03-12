import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!nh", name = "ad", descriptor = "I")
	public static int anInt4199;

	@OriginalMember(owner = "client!nh", name = "bd", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!nh", name = "qc", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_37 = new LruHashTable(64);

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(ZI)I")
	public static int method4063(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}

}
