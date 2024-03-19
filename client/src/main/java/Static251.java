import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!qj;")
	public static Class162 aClass162_194;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public static int anInt5422 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
	public static void method4613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class154 local7 = Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass7_Sub2_1 != null) {
			local7.aClass7_Sub2_1 = null;
		}
		if (local7.aClass7_Sub2_2 != null) {
			local7.aClass7_Sub2_2 = null;
		}
	}
}
