import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "Lclient!bg;")
	public static final Class38 aClass38_2 = new Class38();

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "[I")
	public static int[] anIntArray153 = new int[1];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
	public static void method1583(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub2_Sub2 local9 = Static440.method5963(17, (long) arg0);
		local9.method205();
	}
}
