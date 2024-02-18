import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "D")
	public static double aDouble13;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "[Lclient!s;")
	public static Class178[] aClass178Array1;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
	public static int anInt3986;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "[Lclient!tea;")
	public static final Class350[] aClass350Array1 = new Class350[2048];

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Z")
	public static boolean method3521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method3522(@OriginalArg(1) String[] arg0) {
		@Pc(6) String[] local6 = new String[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			local6[local8] = local8 + ": ";
			if (arg0 != null && arg0[local8] != null) {
				local6[local8] = local6[local8] + arg0[local8];
			}
		}
		return local6;
	}
}
