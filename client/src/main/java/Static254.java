import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public static int anInt4698;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_39 = new LruHashTable(8);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[S)[S")
	public static short[] method4371(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static404.method4606(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public static void method4372() {
		Static343.anInt6389 = -1;
		Static312.anInt5844 = -1;
		Static146.anInt2703 = 0;
		Static358.anInt6550 = -1;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)I")
	public static int method4375() {
		return 16;
	}
}
