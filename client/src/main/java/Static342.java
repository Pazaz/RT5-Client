import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static342 {

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
	public static int anInt5657;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
	public static int anInt5655 = 0;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "[I")
	public static final int[] anIntArray384 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5153(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static200.method3647(arg0, "\n", "%0a"));
	}
}
