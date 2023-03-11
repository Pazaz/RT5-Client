import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "[I")
	public static int[] anIntArray386;

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
	public static int anInt5743;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "Lclient!h;")
	public static final Class89 aClass89_204 = new Class89(36, 8);

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
	public static int anInt5742 = 0;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static165.anIntArrayArrayArray9[arg0][local16][local20] == -Static193.anInt3556) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static322.anInt6029) + 1;
			@Pc(142) int local142 = (arg3 << Static322.anInt6029) + 2;
			@Pc(151) int local151 = Static365.aClass6Array4[arg0].method5719(arg1, arg3) + arg5;
			if (!Static46.method1423(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static322.anInt6029) - 1;
			if (!Static46.method1423(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static322.anInt6029) - 1;
			if (!Static46.method1423(local20, local151, local177)) {
				return false;
			} else if (Static46.method1423(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static35.method1106(arg0, arg1, arg3)) {
			local16 = arg1 << Static322.anInt6029;
			local20 = arg3 << Static322.anInt6029;
			return Static46.method1423(local16 + 1, Static365.aClass6Array4[arg0].method5719(arg1, arg3) + arg5, local20 + 1) && Static46.method1423(local16 + Static256.anInt4716 - 1, Static365.aClass6Array4[arg0].method5719(arg1 + 1, arg3) + arg5, local20 + 1) && Static46.method1423(local16 + Static256.anInt4716 - 1, Static365.aClass6Array4[arg0].method5719(arg1 + 1, arg3 + 1) + arg5, local20 + Static256.anInt4716 - 1) && Static46.method1423(local16 + 1, Static365.aClass6Array4[arg0].method5719(arg1, arg3 + 1) + arg5, local20 + Static256.anInt4716 - 1);
		} else {
			return false;
		}
	}
}
