import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static297 {

	@OriginalMember(owner = "client!jha", name = "n", descriptor = "Z")
	public static boolean aBoolean368;

	@OriginalMember(owner = "client!jha", name = "o", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_59 = new Class345(9, 3);

	@OriginalMember(owner = "client!jha", name = "g", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_125 = new Class225(66, 10);

	@OriginalMember(owner = "client!jha", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[8];

	@OriginalMember(owner = "client!jha", name = "i", descriptor = "J")
	public static long aLong153 = 0L;

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIIII)V")
	public static void method4371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			Static696.method9037(arg1, arg2, arg3, Static723.anIntArrayArray266[arg0]);
		} else {
			Static696.method9037(arg3, arg2, arg1, Static723.anIntArrayArray266[arg0]);
		}
	}
}
