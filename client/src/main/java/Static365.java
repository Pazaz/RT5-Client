import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "F")
	public static float aFloat112;

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
	public static int anInt5849;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "[[F")
	public static final float[][] aFloatArrayArray12 = new float[2][8];

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray144 = new int[2][8];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(F)F")
	public static float method5259(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
