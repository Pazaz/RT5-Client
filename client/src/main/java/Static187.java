import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "[I")
	public static final int[] anIntArray311 = new int[50];

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(CI)Z")
	public static boolean method3755(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static95.method2028(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static2.aCharArray19;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(38) char[] local38 = Static22.aCharArray4;
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				@Pc(46) char local46 = local38[local40];
				if (local46 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "(I)V")
	public static void method3761() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static25.anInt850; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static219.anInt4987; local13++) {
				if (Static347.method5870(local7, true, Static241.aClass154ArrayArrayArray2, local13, local9)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
