import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
	public static int anInt6236;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_228 = new ClientProt(71, 0);

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
	public static int anInt6235 = 0;

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray58 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIII)V")
	public static void method5682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg4 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		@Pc(83) int local83 = local51 * (arg4 - 1);
		Static101.method2163(arg2 + arg0, Static357.anIntArrayArray58[arg1], arg3, arg0 - arg2);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local77;
					local63 += local55;
					local7++;
					local77 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local63 += local55;
				local77 += local55;
				local7++;
			}
			local47 += -local71;
			local38 += -local83;
			local9--;
			local83 -= local51;
			local71 -= local51;
			@Pc(170) int local170 = arg1 - local9;
			@Pc(174) int local174 = arg1 + local9;
			@Pc(178) int local178 = local7 + arg0;
			@Pc(183) int local183 = arg0 - local7;
			Static101.method2163(local178, Static357.anIntArrayArray58[local170], arg3, local183);
			Static101.method2163(local178, Static357.anIntArrayArray58[local174], arg3, local183);
		}
	}
}
