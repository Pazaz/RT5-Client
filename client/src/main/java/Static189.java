import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "F")
	public static float aFloat55 = 1024.0F;

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString162 = "";

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
	public static int anInt4387 = 0;

	@OriginalMember(owner = "client!mk", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
	public static int anInt4391 = -1;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Z")
	public static boolean method3782(@OriginalArg(1) int arg0) {
		Static121.anInt3034 = arg0 + 1 & 0xFFFF;
		Static289.aBoolean359 = true;
		return true;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIZIILclient!ro;)V")
	public static void method3783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class177 arg6) {
		if (arg6.anInt5838 == 2) {
			@Pc(7) int local7 = 99999;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg6.anInt5763; local13++) {
				for (@Pc(17) int local17 = 0; local17 < arg6.anInt5818; local17++) {
					@Pc(29) int local29 = local17 * (arg6.anInt5766 + 32) + arg1;
					@Pc(38) int local38 = local13 * (arg6.anInt5805 + 32) + arg4;
					if (local11 < 20) {
						local38 += arg6.anIntArray434[local11];
						local29 += arg6.anIntArray433[local11];
					}
					if (arg6.anIntArray439[local11] > 0 && (arg0 < local29 + 32 && local29 < arg3 && arg5 < local38 + 32 && arg2 > local38 || arg6 == Static204.aClass177_13 && local11 == Static280.anInt5957)) {
						if (local11 > local9) {
							local9 = local11;
						}
						if (local7 > local11) {
							local7 = local11;
						}
					}
					local11++;
				}
			}
			Static176.method3564(local9, local7, Static221.aClass40_6, arg6);
		} else if (arg6.anInt5838 == 5 && arg6.anInt5808 != -1) {
			Static334.method5894(arg6, Static221.aClass40_6);
		}
	}
}
