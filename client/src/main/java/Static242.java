import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	public static int anInt4446;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "Z")
	public static boolean aBoolean306;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "Lclient!s;")
	public static final Class210 aClass210_10 = new Class210(5, 2);

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
	public static int anInt4449 = 104;

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_159 = new Class145(44, 1);

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
	public static int anInt4450 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!mr;IILclient!mr;BIIIII)V")
	public static void method4195(@OriginalArg(0) Class11_Sub5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub5_Sub2 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg0.method4324();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class13 local21 = (Class13) Static61.aClass98_5.method2612((long) local7);
		if (local21 == null) {
			@Pc(28) Class48[] local28 = Static396.method1688(Static30.aClass197_5, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static190.aClass19_8.method2891(local28[0]);
			Static61.aClass98_5.method2624((long) local7, local21);
		}
		Static324.method5541(0, arg3.anInt6783, arg3.aByte78, arg3.method4328() * 64, arg4 >> 1, arg3.anInt6781, arg5 >> 1);
		@Pc(75) int local75 = arg2 + Static216.anIntArray231[0] - 18;
		@Pc(90) int local90 = arg1 + Static216.anIntArray231[1] - 54 - 16;
		@Pc(98) int local98 = local75 + arg6 / 4 * 18;
		@Pc(106) int local106 = local90 + arg6 % 4 * 18;
		local21.method6385(local98, local106);
		if (arg0 == arg3) {
			Static190.aClass19_8.method2837(local106 - 1, local98 - 1, 18, -256, 18);
		}
		@Pc(130) Class12_Sub6 local130 = Static315.method5383();
		local130.anInt4752 = local106;
		local130.anInt4753 = local98;
		local130.anInt4751 = local106 + 16;
		local130.aClass11_Sub5_Sub2_1 = arg0;
		local130.anInt4755 = local98 + 16;
		Static356.aClass36_10.method1418(local130);
	}
}
