import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "Lclient!sb;")
	public static Class330 aClass330_25;

	@OriginalMember(owner = "client!eha", name = "d", descriptor = "Lclient!rt;")
	public static Class327 aClass327_1;

	@OriginalMember(owner = "client!eha", name = "e", descriptor = "[I")
	public static final int[] anIntArray225 = new int[32];

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIIII)V")
	public static void method2379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg3 >= Static180.anInt2995 && Static111.anInt2219 >= arg2 + arg3 && arg0 - arg3 >= Static724.anInt10930 && arg0 + arg3 <= Static273.anInt4395) {
			Static265.method3858(arg2, arg1, arg3, arg0);
		} else {
			Static158.method2571(arg0, arg3, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IBI[Ljava/lang/String;)Ljava/lang/String;")
	public static String method2381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(18) String local18 = arg2[arg1];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(32) int local32 = arg0 + arg1;
			@Pc(34) int local34 = 0;
			for (@Pc(44) int local44 = arg1; local44 < local32; local44++) {
				@Pc(49) String local49 = arg2[local44];
				if (local49 == null) {
					local34 += 4;
				} else {
					local34 += local49.length();
				}
			}
			@Pc(71) StringBuffer local71 = new StringBuffer(local34);
			for (@Pc(73) int local73 = arg1; local73 < local32; local73++) {
				@Pc(78) String local78 = arg2[local73];
				if (local78 == null) {
					local71.append("null");
				} else {
					local71.append(local78);
				}
			}
			return local71.toString();
		}
	}
}
