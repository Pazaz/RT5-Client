import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
	public static int anInt1256;

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
	public static int anInt1254 = 0;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "J")
	public static volatile long aLong37 = 0L;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "Lclient!kk;")
	public static final Class127 aClass127_3 = new Class127("WTI", 5);

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "Lclient!h;")
	public static final Class89 aClass89_43 = new Class89(24, 12);

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_3 = new Class98(10);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1465(@OriginalArg(0) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static56.anInt1454 > 0) {
			local19 = Static286.aByteArrayArray16[--Static56.anInt1454];
			Static286.aByteArrayArray16[Static56.anInt1454] = null;
			return local19;
		} else if (arg0 == 5000 && Static270.anInt4968 > 0) {
			local19 = Static211.aByteArrayArray8[--Static270.anInt4968];
			Static211.aByteArrayArray8[Static270.anInt4968] = null;
			return local19;
		} else if (arg0 == 30000 && Static360.anInt6190 > 0) {
			local19 = Static247.aByteArrayArray12[--Static360.anInt6190];
			Static247.aByteArrayArray12[Static360.anInt6190] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIII)I")
	public static int method1467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}
}
