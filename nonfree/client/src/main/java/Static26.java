import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!at", name = "j", descriptor = "Lclient!st;")
	public static Class23 aClass23_5;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
	public static void method716(@OriginalArg(1) int arg0) {
		if (Static571.method7566(arg0)) {
			Static643.method8444(-1, Static453.aClass158ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(III)V")
	public static void method717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static334.aClass291ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static109.method2068(local7.aClass8_Sub2_Sub3_2);
		Static109.method2068(local7.aClass8_Sub2_Sub3_1);
		if (local7.aClass8_Sub2_Sub3_2 != null) {
			local7.aClass8_Sub2_Sub3_2 = null;
		}
		if (local7.aClass8_Sub2_Sub3_1 != null) {
			local7.aClass8_Sub2_Sub3_1 = null;
		}
	}
}
