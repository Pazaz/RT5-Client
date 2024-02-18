import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "[I")
	public static final int[] anIntArray556 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "[Lclient!ge;")
	public static final Class2_Sub21[] aClass2_Sub21Array1 = new Class2_Sub21[2048];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)I")
	public static int method6270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(25) int local25 = ((arg0 & 0xFF00FF) * local7 & 0xFF00FF00 | (arg0 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		@Pc(40) int local40 = 255 - local7;
		return local25 + ((local40 * (arg1 & 0xFF00) & 0xFF0000 | local40 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}
}
