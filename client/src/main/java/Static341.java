import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
	public static int anInt6376;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "[I")
	public static final int[] anIntArray429 = new int[14];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I")
	public static int method5768(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;")
	public static String method5770(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (Static325.anInterface9_1 != null) {
			@Pc(17) String local17 = Static325.anInterface9_1.method2360(arg2, arg0, arg1);
			if (local17 != null) {
				return local17;
			}
		}
		return Long.toString(arg2);
	}
}
