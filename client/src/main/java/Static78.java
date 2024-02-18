import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
	public static int anInt1624;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	public static int anInt1622 = 0;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
	public static int anInt1626 = -2;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "Z")
	public static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBII)I")
	public static int method1570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg0 & arg1 - 1;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg2 & arg1 - 1;
		@Pc(30) int local30 = Static343.method5036(local17, local7);
		@Pc(39) int local39 = Static343.method5036(local17, local7 + 1);
		@Pc(46) int local46 = Static343.method5036(local17 + 1, local7);
		@Pc(64) int local64 = Static343.method5036(local17 + 1, local7 + 1);
		@Pc(73) int local73 = Static398.method5560(arg1, local30, local39, local13);
		@Pc(80) int local80 = Static398.method5560(arg1, local46, local64, local13);
		return Static398.method5560(arg1, local73, local80, local23);
	}
}
