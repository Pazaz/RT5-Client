import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public static int anInt1843;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!r;")
	public static Class197 aClass197_20;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!r;")
	public static Class197 aClass197_21;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "[I")
	public static final int[] anIntArray121 = new int[2048];

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLclient!nk;B)V")
	public static void method1911(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class161 arg1) {
		@Pc(12) int local12 = arg1.anInt4281 == 0 ? arg1.anInt4248 : arg1.anInt4281;
		@Pc(24) int local24 = arg1.anInt4266 == 0 ? arg1.anInt4261 : arg1.anInt4266;
		Static364.method6105(arg0, local24, arg1.anInt4317, Static26.aClass161ArrayArray1[arg1.anInt4317 >> 16], local12);
		if (arg1.aClass161Array2 != null) {
			Static364.method6105(arg0, local24, arg1.anInt4317, arg1.aClass161Array2, local12);
		}
		@Pc(57) Class2_Sub7 local57 = (Class2_Sub7) Static329.aClass4_130.method90((long) arg1.anInt4317);
		if (local57 != null) {
			Static129.method2435(local24, local57.anInt1370, arg0, local12);
		}
	}
}
