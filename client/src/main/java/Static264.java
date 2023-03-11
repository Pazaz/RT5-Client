import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public static int anInt4839;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "[[F")
	public static final float[][] aFloatArrayArray8 = new float[2][8];

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray40 = new int[2][8];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(F)F")
	public static float method4472(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
