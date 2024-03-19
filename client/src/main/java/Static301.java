import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "[S")
	public static short[] aShortArray97 = new short[256];

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Lclient!fj;")
	public static Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
	public static volatile int anInt6298 = 0;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Lclient!we;")
	public static final Class215 aClass215_89 = new Class215(50);

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString236 = "Connecting to update server";

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5274(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static236.method4504(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static236.method4504(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(50) int local50 = local14 - local11;
		if (local50 < 1 || local50 > 12) {
			return null;
		}
		@Pc(67) StringBuffer local67 = new StringBuffer(local50);
		for (@Pc(69) int local69 = local11; local69 < local14; local69++) {
			@Pc(75) char local75 = arg0.charAt(local69);
			if (Static187.method3755(local75)) {
				@Pc(83) char local83 = Static161.method3409(local75);
				if (local83 != '\u0000') {
					local67.append(local83);
				}
			}
		}
		if (local67.length() == 0) {
			return null;
		} else {
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public static void method5275() {
		Static310.method5439();
	}
}
