import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "Lclient!r;")
	public static Js5 aClass197_73;

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "Z")
	public static final boolean aBoolean391 = false;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)I")
	public static int method5019(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)I")
	public static int method5020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(31) int local31 = (arg1 & 0x7F) * arg0 + local17 * (arg2 & 0x7F) >> 7;
		@Pc(46) int local46 = (arg2 & 0x380) * local17 + arg0 * (arg1 & 0x380) >> 7;
		@Pc(65) int local65 = local17 * (arg2 & 0xFC00) + (arg1 & 0xFC00) * arg0 >> 7;
		return local65 & 0xFC00 | local46 & 0x380 | local31 & 0x7F;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!bh;IB)V")
	public static void method5021(@OriginalArg(0) int arg0, @OriginalArg(1) Environment arg1, @OriginalArg(2) int arg2) {
		Static332.aClass21ArrayArray3[arg2][arg0] = arg1;
	}
}
