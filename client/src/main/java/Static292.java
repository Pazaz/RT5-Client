import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!sq", name = "R", descriptor = "I")
	public static int anInt6117;

	@OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
	public static int anInt6119;

	@OriginalMember(owner = "client!sq", name = "S", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!sq", name = "W", descriptor = "I")
	public static int anInt6121 = 0;

	@OriginalMember(owner = "client!sq", name = "X", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)Lclient!kb;")
	public static Class107 method5169(@OriginalArg(0) int arg0) {
		@Pc(10) Class107 local10 = (Class107) Static352.aClass215_102.method6057((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static222.aClass162_181.method4636(arg0, 36);
		local10 = new Class107();
		local10.anInt3768 = arg0;
		if (local25 != null) {
			local10.method3289(new Class1_Sub16(local25));
		}
		local10.method3286();
		Static352.aClass215_102.method6050(local10, (long) arg0);
		return local10;
	}
}
