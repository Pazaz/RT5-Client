import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
	public static int anInt6817;

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "[I")
	public static final int[] anIntArray477 = new int[4096];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIIII)V")
	public static void method6103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static28.anInt675 <= arg1 - arg3 && arg3 + arg1 <= Static82.anInt1837 && arg2 - arg3 >= Static365.anInt6832 && Static161.anInt2954 >= arg2 + arg3) {
			Static220.method3870(arg3, arg2, arg0, arg1);
		} else {
			Static230.method4012(arg3, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZII[Lclient!nk;ZI)V")
	public static void method6105(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) Component local9 = arg3[local3];
			if (local9 != null && arg2 == local9.overlayer) {
				Static371.method6256(arg1, arg4, arg0, local9);
				Static287.method4939(local9, arg4, arg1);
				if (local9.scrollMaxH - local9.width < local9.scrollX) {
					local9.scrollX = local9.scrollMaxH - local9.width;
				}
				if (local9.scrollX < 0) {
					local9.scrollX = 0;
				}
				if (local9.scrollY > local9.scrollMaxV - local9.height) {
					local9.scrollY = local9.scrollMaxV - local9.height;
				}
				if (local9.scrollY < 0) {
					local9.scrollY = 0;
				}
				if (local9.type == 0) {
					DelayedStateChange.method1911(arg0, local9);
				}
			}
		}
	}
}
