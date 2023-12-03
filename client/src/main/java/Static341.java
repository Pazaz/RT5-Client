import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static341 {

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
	public static int anInt6376;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "[I")
	public static final int[] anIntArray429 = new int[14];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I")
	public static int method5768(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

}
