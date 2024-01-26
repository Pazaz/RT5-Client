import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static707 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public static int anInt10641;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_256 = new Class225(107, 4);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public static void method9227() {
		Static284.anInt4583 = -2;
		Static169.anInt2855 = -2;
		Static135.anInt8223 = 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[ILclient!qha;[III)Lclient!wl;")
	public static Class1_Sub3 method9228(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class19_Sub3 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg3 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			@Pc(24) int local24 = local12 * arg4 + arg2[local12];
			for (@Pc(26) int local26 = 0; local26 < arg0[local12]; local26++) {
				local10[local24++] = -1;
			}
		}
		if (17787 != 17787) {
			anInt10641 = 5;
		}
		return new Class1_Sub3(arg1, arg4, arg3, local10);
	}
}
