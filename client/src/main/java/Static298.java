import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public static int anInt2437;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method2422() {
		if (WorldMap.anInt2772 < 0) {
			Static77.anInt1763 = -1;
			Static238.anInt4328 = -1;
			WorldMap.anInt2772 = 0;
		}
		if (MapList.anInt6056 < WorldMap.anInt2772) {
			Static77.anInt1763 = -1;
			Static238.anInt4328 = -1;
			WorldMap.anInt2772 = MapList.anInt6056;
		}
		if (WorldMap.anInt2003 < 0) {
			Static77.anInt1763 = -1;
			WorldMap.anInt2003 = 0;
			Static238.anInt4328 = -1;
		}
		if (WorldMap.anInt2003 > MapList.anInt6052) {
			Static77.anInt1763 = -1;
			WorldMap.anInt2003 = MapList.anInt6052;
			Static238.anInt4328 = -1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
	public static boolean method2425(@OriginalArg(0) int arg0) {
		if (arg0 == 15 || arg0 == 46 || arg0 == 58 || arg0 == 6 || arg0 == 21) {
			return true;
		} else {
			return arg0 == 13 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZLclient!r;I)Lclient!pr;")
	public static Class185 method2426(@OriginalArg(2) Js5 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.fetchFile(0, arg1);
		return local9 == null ? null : new Class185(local9);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)I")
	public static int method2427(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
