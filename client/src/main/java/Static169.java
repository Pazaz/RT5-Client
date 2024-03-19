import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!or;")
	public static Class145 aClass145_6 = null;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)Lclient!de;")
	public static Class7_Sub3 method1651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class154 local7 = Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass7_Sub3_2;
	}
}
