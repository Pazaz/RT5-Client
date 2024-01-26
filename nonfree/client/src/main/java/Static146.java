import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "J")
	public static long aLong95;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	public static final int anInt2567 = 1401;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BC)C")
	public static char method2413(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2414(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub5 local16 = (Class2_Sub5) Static106.aClass28_11.method738((long) arg0);
		if (local16 != null) {
			@Pc(23) Class2_Sub28_Sub4 local23 = local16.aClass222_Sub1_1.method9178();
			if (local23 != null) {
				@Pc(32) double local32 = local16.aClass222_Sub1_1.method9185();
				if ((double) local23.method8561() <= local32 && local32 <= (double) local23.method8566()) {
					return local23.method8565();
				}
			}
		}
		return null;
	}
}
