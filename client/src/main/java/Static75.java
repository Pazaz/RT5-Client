import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static75 {

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "Lclient!jd;")
	public static Sprite aClass13_5;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public static int anInt1737;

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
	public static int anInt1736 = -1;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I")
	public static int method1837(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
