import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "Lclient!sb;")
	public static Class330 aClass330_81;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "D")
	public static double aDouble20;

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "[Lclient!eo;")
	public static Class8_Sub2[] aClass8_Sub2Array7;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)I")
	public static int method5560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class361.anIntArray740[arg3 * 8192 / arg0] >> 1;
		return (local15 * arg2 >> 16) + (arg1 * (65536 - local15) >> 16);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BII)Z")
	public static boolean method5562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static604.method7904(arg1, arg0) || Static42.method1054(arg0, arg1);
	}
}
