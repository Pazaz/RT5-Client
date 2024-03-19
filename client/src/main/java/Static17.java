import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	public static int anInt647;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString23 = "glow3:";

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!mi;")
	public static final Class130 aClass130_3 = new Class130();

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public static int anInt646 = 0;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public static int anInt650 = 0;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString24 = "Loading - please wait.";

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	public static int anInt652 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)Lclient!ie;")
	public static Class1_Sub1_Sub12 method457(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub12 local10 = (Class1_Sub1_Sub12) Static236.aClass143_9.method4323((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(23) byte[] local23;
		if (arg0 < 32768) {
			local23 = Static67.aClass162_13.method4636(arg0, 1);
		} else {
			local23 = Static308.aClass162_221.method4636(arg0 & 0x7FFF, 1);
		}
		local10 = new Class1_Sub1_Sub12();
		if (local23 != null) {
			local10.method2683(new Class1_Sub16(local23));
		}
		if (arg0 >= 32768) {
			local10.method2690();
		}
		Static236.aClass143_9.method4322(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(CZ)C")
	public static char method458(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public static void method459() {
		Static234.aClass215_72.method6052();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!qj;ZLclient!qj;)V")
	public static void method460(@OriginalArg(0) Class162 arg0, @OriginalArg(2) Class162 arg1) {
		Static266.aClass162_202 = arg0;
		Static120.aClass162_103 = arg1;
	}
}
