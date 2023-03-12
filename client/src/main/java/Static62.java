import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
	public static int anInt2395;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "[I")
	public static int[] underwaterLocGroupIds;

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "Lclient!rc;")
	public static Class42 aClass42_5;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "[Lclient!jd;")
	public static Sprite[] aClass13Array9;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBIIIZ)V")
	public static void method2391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) (arg2 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class2_Sub41 local20 = (Class2_Sub41) Static353.aClass4_136.get(local14);
		if (local20 == null) {
			local20 = new Class2_Sub41();
			Static353.aClass4_136.put(local20, local14);
		}
		if (local20.anIntArray489.length <= arg0) {
			@Pc(50) int[] local50 = new int[arg0 + 1];
			@Pc(55) int[] local55 = new int[arg0 + 1];
			for (@Pc(57) int local57 = 0; local57 < local20.anIntArray489.length; local57++) {
				local50[local57] = local20.anIntArray489[local57];
				local55[local57] = local20.anIntArray488[local57];
			}
			for (@Pc(83) int local83 = local20.anIntArray489.length; local83 < arg0; local83++) {
				local50[local83] = -1;
				local55[local83] = 0;
			}
			local20.anIntArray488 = local55;
			local20.anIntArray489 = local50;
		}
		local20.anIntArray489[arg0] = arg3;
		local20.anIntArray488[arg0] = arg1;
	}
}
