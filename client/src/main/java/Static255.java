import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
	public static int anInt4703;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIBII)I")
	public static int method4377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - RasteriserBase.anIntArray177[arg0 * 8192 / arg2] >> 1;
		return (arg1 * (65536 - local21) >> 16) + (arg3 * local21 >> 16);
	}
}
