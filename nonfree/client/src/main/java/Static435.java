import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
	public static int anInt6594;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
	public static int anInt6597;

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)V")
	public static void method5862(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub2_Sub2 local9 = Static440.method5963(12, (long) arg0);
		local9.method205();
	}
}
