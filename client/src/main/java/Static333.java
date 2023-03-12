import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "Lclient!jd;")
	public static Sprite aClass13_21;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray67;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_65 = new LruHashTable(20);

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "Lclient!s;")
	public static final Class210 aClass210_17 = new Class210(10, 6);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Z")
	public static boolean method6318() {
		return Static14.aBoolean24;
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)I")
	public static int method6331() {
		if ((double) Static344.aFloat73 == 3.0D) {
			return 37;
		} else if ((double) Static344.aFloat73 == 4.0D) {
			return 50;
		} else if ((double) Static344.aFloat73 == 6.0D) {
			return 75;
		} else if ((double) Static344.aFloat73 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!r;)I")
	public static int method6333(@OriginalArg(1) Js5 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.isFileReady(Static75.anInt1736)) {
			local5++;
		}
		if (arg0.isFileReady(Static265.anInt4856)) {
			local5++;
		}
		return local5;
	}
}
