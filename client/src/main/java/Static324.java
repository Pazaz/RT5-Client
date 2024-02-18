import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!qk;")
	public static Class307 aClass307_1;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	public static int anInt5129;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Z")
	public static boolean aBoolean388 = true;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "[I")
	public static final int[] anIntArray390 = new int[500];

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "J")
	public static long aLong164 = 20000000L;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZZIILclient!ha;)Lclient!da;")
	public static Class14 method4628(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class19 arg3) {
		@Pc(17) Class70 local17 = Static502.method6719(arg0, arg3, arg1, arg2);
		return local17 == null ? null : local17.aClass14_1;
	}
}
