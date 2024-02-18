import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!mba", name = "D", descriptor = "I")
	public static int anInt6062;

	@OriginalMember(owner = "client!mba", name = "E", descriptor = "Lclient!sb;")
	public static Class330 aClass330_80;

	@OriginalMember(owner = "client!mba", name = "F", descriptor = "Lclient!bo;")
	public static Class49 aClass49_2;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)Z")
	public static boolean method5436(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5439(@OriginalArg(0) String arg0) {
		@Pc(5) String local5 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local5 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(51) int local51 = arg0.indexOf(" ", "directlogin ".length());
			if (local51 >= 0) {
				@Pc(56) int local56 = arg0.length();
				arg0 = arg0.substring(0, local51) + " ";
				for (@Pc(72) int local72 = local51 + 1; local72 < local56; local72++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local5 == null ? arg0 : local5 + arg0;
	}
}
