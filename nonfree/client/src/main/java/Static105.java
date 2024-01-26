import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!df", name = "p", descriptor = "Lclient!fma;")
	public static final Class131 aClass131_3 = new Class131();

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "[Lclient!ho;")
	public static final Class171[] aClass171Array1 = new Class171[6];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method2042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(29) int local29 = -((arg0 + 8 - 1) / 8);
		@Pc(38) int local38 = -((arg4 + 8 - 1) / 8);
		for (@Pc(40) int local40 = local29; local40 < 0; local40++) {
			for (@Pc(46) int local46 = local38; local46 < 0; local46++) {
				if (arg3[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local16;
			if (arg3[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg2;
		}
		if (-1941613085 != -1941613085) {
			aBoolean196 = false;
		}
		return false;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)S")
	public static short method2043(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(21) int local21 = arg0 >> 3 & 0x70;
		@Pc(25) int local25 = arg0 & 0x7F;
		@Pc(46) int local46 = local25 <= 64 ? local25 * local21 >> 7 : local21 * (127 - local25) >> 7;
		@Pc(50) int local50 = local46 + local25;
		@Pc(58) int local58;
		if (local50 == 0) {
			local58 = local46 << 1;
		} else {
			local58 = (local46 << 8) / local50;
		}
		return (short) (local58 >> 4 << 7 | local9 << 10 | local50);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method2044() {
		Static519.aClass144_1 = new Class144(8);
		Static654.anInt9740 = 0;
		for (@Pc(20) Class8_Sub5 local20 = (Class8_Sub5) Static342.aClass130_7.method2790(); local20 != null; local20 = (Class8_Sub5) Static342.aClass130_7.method2785()) {
			local20.method3652();
		}
	}
}
