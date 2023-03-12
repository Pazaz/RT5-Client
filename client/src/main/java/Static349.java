import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_58 = new LruHashTable(5);

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
	public static int anInt6455 = -1;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "[I")
	public static final int[] anIntArray444 = new int[32];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I")
	public static int method5831(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method5833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = Static271.aShort79 + local7 * (Static120.aShort36 - Static271.aShort79) / 100;
		@Pc(39) int local39 = local33 * arg0 >> 8;
		@Pc(46) int local46 = 16384 - arg6 & 0x3FFF;
		@Pc(53) int local53 = 16384 - arg5 & 0x3FFF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = local39;
		if (local46 != 0) {
			local57 = Class19.anIntArray178[local46] * -local39 >> 15;
			local59 = local39 * Class19.anIntArray177[local46] >> 15;
		}
		if (local53 != 0) {
			local55 = local59 * Class19.anIntArray178[local53] >> 15;
			local59 = Class19.anIntArray177[local53] * local59 >> 15;
		}
		Static4.anInt87 = arg5;
		Static102.anInt3592 = arg3 - local57;
		Static265.anInt4857 = arg6;
		Static211.anInt3777 = arg4 - local59;
		Static136.anInt6778 = arg1 - local55;
		Static342.anInt5657 = 0;
	}
}
