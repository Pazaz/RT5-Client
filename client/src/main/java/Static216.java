import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Lclient!ep;")
	public static final Class58 aClass58_8 = new Class58();

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	public static int anInt4909 = 3;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	public static void method4217() {
		if (Static332.aClass35_1 != null) {
			@Pc(7) Class35 local7 = Static332.aClass35_1;
			synchronized (Static332.aClass35_1) {
				Static332.aClass35_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!qj;I)Lclient!m;")
	public static Class126 method4218(@OriginalArg(0) int arg0, @OriginalArg(2) Class162 arg1) {
		@Pc(9) byte[] local9 = arg1.method4636(0, arg0);
		return local9 == null ? null : new Class126(local9);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Z")
	public static boolean method4220() {
		return Static232.aBoolean357;
	}
}
