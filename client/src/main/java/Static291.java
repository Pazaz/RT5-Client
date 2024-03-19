import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
	public static int anInt6085;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "[[F")
	public static final float[][] aFloatArrayArray5 = new float[2][8];

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray40 = new int[2][8];

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(F)F")
	public static float method5139(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
