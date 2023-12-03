import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static274 {

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "Lclient!ci;")
	public static TextureProviderInterface anInterface2_7;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "[I")
	public static int[] anIntArray352;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLclient!nk;I)I")
	public static int method4631(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1) {
		if (!InterfaceList.getServerActiveProperties(arg0).isButtonEnabled(arg1) && arg0.onOp == null) {
			return -1;
		} else if (arg0.anIntArray279 == null || arg0.anIntArray279.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray279[arg1];
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I")
	public static int method4641(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
