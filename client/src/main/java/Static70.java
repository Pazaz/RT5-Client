import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Lclient!hc;")
	public static Class81 aClass81_1;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	public static int anInt1961;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Lclient!we;")
	public static final Class215 aClass215_29 = new Class215(8);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIB)I")
	public static int method1646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg2 & 0x3;
		if (local16 == 0) {
			return arg0;
		} else if (local16 == 1) {
			return arg1;
		} else if (local16 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg1;
		}
	}
}
