import org.openrs2.deob.annotation.OriginalMember;

public final class Static355 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
	public static int anInt6565;

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
	public static int anInt6585;

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
	public static int anInt6581 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Z")
	public static boolean method5934() {
		return client.modeWhere != client.MODE_WHERE_LIVE || LoginManager.staffModLevel >= 2;
	}
}
