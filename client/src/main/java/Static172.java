import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
	public static int anInt2888;

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "Lclient!mj;")
	public static Class243 aClass243_4;

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "Z")
	public static boolean aBoolean246 = false;

	@OriginalMember(owner = "client!ffa", name = "m", descriptor = "I")
	public static int anInt2890 = -1;

	@OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
	public static int anInt2893 = 0;

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "Lclient!eba;")
	public static final Class92 aClass92_8 = new Class92(4);

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "[I")
	public static final int[] anIntArray251 = new int[8];

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIBIIII)Z")
	public static boolean method2674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static706.method9224(arg1, arg4, arg7)) {
			return false;
		}
		@Pc(23) int local23 = Static35.anIntArray58[1];
		@Pc(27) int local27 = Static35.anIntArray58[2];
		@Pc(31) int local31 = Static35.anIntArray58[0];
		if (!Static706.method9224(arg5, arg2, arg0)) {
			return false;
		}
		@Pc(44) int local44 = Static35.anIntArray58[0];
		@Pc(48) int local48 = Static35.anIntArray58[1];
		@Pc(52) int local52 = Static35.anIntArray58[2];
		if (Static706.method9224(arg6, arg3, arg8)) {
			@Pc(65) int local65 = Static35.anIntArray58[1];
			@Pc(69) int local69 = Static35.anIntArray58[0];
			@Pc(73) int local73 = Static35.anIntArray58[2];
			return Static264.method9460(local31, local23, local73, local52, local65, local69, local48, local27, local44);
		} else {
			return false;
		}
	}
}
