import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "I")
	public static int anInt5828;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "[I")
	public static final int[] anIntArray450 = new int[5];

	@OriginalMember(owner = "client!lha", name = "f", descriptor = "Lclient!mia;")
	public static final Class242 aClass242_10 = new Class242("", 19);

	@OriginalMember(owner = "client!lha", name = "j", descriptor = "I")
	public static final int anInt5831 = 1407;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5241(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return false;
		}
		for (@Pc(10) int local10 = arg0; local10 < Static327.anInt5392; local10++) {
			if (arg1.equalsIgnoreCase(Static330.aStringArray25[local10])) {
				return true;
			}
		}
		return arg1.equalsIgnoreCase(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9);
	}
}
