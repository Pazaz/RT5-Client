import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static19 {

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_8 = new Class225(106, 8);

	@OriginalMember(owner = "client!al", name = "k", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(CI)Z")
	public static boolean method262(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Z")
	public static boolean method264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static340.method5011(arg1, arg0) | (arg1 & 0x70000) != 0 || Static598.method7828(arg1, arg0);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIII)V")
	public static void method265(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static571.method7566(arg1)) {
			Static220.method3200(arg3, arg0, arg2, Static453.aClass158ArrayArray2[arg1], -1);
		}
	}
}
