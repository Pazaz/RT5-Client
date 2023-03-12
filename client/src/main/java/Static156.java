import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "[Lclient!rk;")
	public static final Class37[] aClass37Array1 = new Class37[128];

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IBIII)V")
	public static void method2791(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static28.anInt675 <= arg3 && arg3 <= Static82.anInt1837) {
			@Pc(19) int local19 = Static25.method861(Static365.anInt6832, arg1, Static161.anInt2954);
			@Pc(25) int local25 = Static25.method861(Static365.anInt6832, arg0, Static161.anInt2954);
			Static363.method6090(local25, local19, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!hc;III)V")
	public static void method2796(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Scene.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt7113 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass2_Sub26_Sub1Array3[arg0.anInt7113++] = Scene.aClass2_Sub26_Sub1Array2[local21 - 1];
			local9 += 16L;
		}
		for (local21 = arg0.anInt7113; local21 < 4; local21++) {
			arg0.aClass2_Sub26_Sub1Array3[local21] = null;
		}
	}

}
