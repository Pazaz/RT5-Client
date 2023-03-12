import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!to", name = "G", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!to", name = "K", descriptor = "Lclient!jd;")
	public static Sprite aClass13_18;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "(I)V")
	public static void method5759() {
		@Pc(7) Class36[] local7 = ColorImageCacheEntry.aClass36Array1;
		synchronized (ColorImageCacheEntry.aClass36Array1) {
			for (@Pc(11) int local11 = 0; local11 < ColorImageCacheEntry.aClass36Array1.length; local11++) {
				ColorImageCacheEntry.aClass36Array1[local11] = new Class36();
				Static206.anIntArray224[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIZIIIII)V")
	public static void method5760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg5 && arg0 == arg2 && arg1 == arg4 && arg8 == arg6) {
			Static327.method5576(arg4, arg3, arg6, arg2, arg7);
			return;
		}
		@Pc(28) int local28 = arg3;
		@Pc(30) int local30 = arg2;
		@Pc(34) int local34 = arg3 * 3;
		@Pc(38) int local38 = arg2 * 3;
		@Pc(42) int local42 = arg5 * 3;
		@Pc(46) int local46 = arg0 * 3;
		@Pc(50) int local50 = arg1 * 3;
		@Pc(54) int local54 = arg8 * 3;
		@Pc(63) int local63 = local42 + arg4 - local50 - arg3;
		@Pc(72) int local72 = local46 + arg6 - arg2 - local54;
		@Pc(82) int local82 = local34 + local50 - local42 - local42;
		@Pc(91) int local91 = local38 + local54 - local46 - local46;
		@Pc(96) int local96 = local42 - local34;
		@Pc(101) int local101 = local46 - local38;
		for (@Pc(103) int local103 = 128; local103 <= 4096; local103 += 128) {
			@Pc(111) int local111 = local103 * local103 >> 12;
			@Pc(117) int local117 = local111 * local103 >> 12;
			@Pc(121) int local121 = local63 * local117;
			@Pc(125) int local125 = local117 * local72;
			@Pc(129) int local129 = local82 * local111;
			@Pc(133) int local133 = local91 * local111;
			@Pc(137) int local137 = local103 * local96;
			@Pc(141) int local141 = local103 * local101;
			@Pc(152) int local152 = arg3 + (local137 + local129 + local121 >> 12);
			@Pc(162) int local162 = (local141 + local133 + local125 >> 12) + arg2;
			Static327.method5576(local152, local28, local162, local30, arg7);
			local28 = local152;
			local30 = local162;
		}
	}
}
