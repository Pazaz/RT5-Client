import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class120 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[16384];

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "[F")
	public static final float[] aFloatArray15 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray15[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray14[local9] = (float) Math.cos((double) local9 * local7);
		}
	}
}
