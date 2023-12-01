import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "[I")
	public static int[] anIntArray412;

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "[I")
	public static int[] anIntArray409 = new int[2];

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "[I")
	public static final int[] anIntArray410 = new int[2048];

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!hc;IIIII)V")
	public static void method5536(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7113 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Scene.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class2_Sub26_Sub1 local35 = Scene.aClass2_Sub26_Sub1Array2[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt7113; local37++) {
							if (arg0.aClass2_Sub26_Sub1Array3[local37] == local35) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass2_Sub26_Sub1Array3[arg0.anInt7113++] = local35;
						if (arg0.anInt7113 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt7113; local7 < 4; local7++) {
			arg0.aClass2_Sub26_Sub1Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)I")
	public static int method5540(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method5541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(9) int arg6) {
		if (arg5 < 128 || arg1 < 128 || (Static373.anInt7033 - 2) * 128 < arg5 || (Static242.anInt4449 - 2) * 128 < arg1) {
			Static216.anIntArray231[0] = Static216.anIntArray231[1] = -1;
			return;
		}
		@Pc(49) int local49 = Scene.getTileHeight(arg5, arg1, arg2) - arg0;
		Static76.aClass14_3.method3936(arg3, 0, 0);
		Rasteriser.instance.method2896(Static76.aClass14_3);
		Rasteriser.instance.method2902(arg5, local49, arg1, Static216.anIntArray231);
		Static76.aClass14_3.method3936(-arg3, 0, 0);
		Rasteriser.instance.method2896(Static76.aClass14_3);
	}

}
