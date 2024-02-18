import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static401 {

	@OriginalMember(owner = "client!mka", name = "d", descriptor = "[Lclient!pi;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(III)Z")
	public static boolean method5575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
