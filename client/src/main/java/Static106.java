import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!fu", name = "T", descriptor = "I")
	public static int anInt2218;

	@OriginalMember(owner = "client!fu", name = "U", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!fu", name = "P", descriptor = "Lclient!dn;")
	public static final Class50 aClass50_1 = new Class50("stellardawn", 1);

	@OriginalMember(owner = "client!fu", name = "V", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!fu", name = "W", descriptor = "[I")
	public static final int[] anIntArray135 = new int[32];

	@OriginalMember(owner = "client!fu", name = "X", descriptor = "Lclient!h;")
	public static final Class89 aClass89_88 = new Class89(17, 2);

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIII)I")
	public static int method2235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg1 & arg0 - 1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg2 & arg0 - 1;
		@Pc(28) int local28 = Static138.method2579(local17, local7);
		@Pc(35) int local35 = Static138.method2579(local17, local7 + 1);
		@Pc(42) int local42 = Static138.method2579(local17 + 1, local7);
		@Pc(51) int local51 = Static138.method2579(local17 + 1, local7 + 1);
		@Pc(58) int local58 = Static255.method4377(local13, local28, arg0, local35);
		@Pc(65) int local65 = Static255.method4377(local13, local42, arg0, local51);
		return Static255.method4377(local23, local58, arg0, local65);
	}
}
