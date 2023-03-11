import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public static int anInt2437;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method2422() {
		if (Static151.anInt2772 < 0) {
			Static77.anInt1763 = -1;
			Static238.anInt4328 = -1;
			Static151.anInt2772 = 0;
		}
		if (Static344.anInt6056 < Static151.anInt2772) {
			Static77.anInt1763 = -1;
			Static238.anInt4328 = -1;
			Static151.anInt2772 = Static344.anInt6056;
		}
		if (Static96.anInt2003 < 0) {
			Static77.anInt1763 = -1;
			Static96.anInt2003 = 0;
			Static238.anInt4328 = -1;
		}
		if (Static96.anInt2003 > Static344.anInt6052) {
			Static77.anInt1763 = -1;
			Static96.anInt2003 = Static344.anInt6052;
			Static238.anInt4328 = -1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!nh;)V")
	public static void method2423(@OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg0) {
		@Pc(11) Class2_Sub19 local11 = (Class2_Sub19) Static232.aClass4_86.method90((long) arg0.anInt4619);
		if (local11 == null) {
			return;
		}
		if (local11.aClass2_Sub12_Sub4_3 != null) {
			Static227.aClass2_Sub12_Sub2_2.method2081(local11.aClass2_Sub12_Sub4_3);
			local11.aClass2_Sub12_Sub4_3 = null;
		}
		local11.method6468();
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
	public static Class185 method2426(@OriginalArg(2) Class197 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method5089(0, arg1);
		return local9 == null ? null : new Class185(local9);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)I")
	public static int method2427(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
