import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
	public static int anInt675 = 0;

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
	public static int anInt686 = 16777215;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Lclient!cj;")
	public static Class11_Sub3 method893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Scene.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub3_2;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(12) ChangeLocRequest local12 = null;
		for (@Pc(17) ChangeLocRequest local17 = (ChangeLocRequest) Static207.aClass135_26.head(); local17 != null; local17 = (ChangeLocRequest) Static207.aClass135_26.next()) {
			if (local17.anInt6481 == arg6 && local17.anInt6484 == arg3 && arg5 == local17.anInt6486 && local17.anInt6491 == arg1) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new ChangeLocRequest();
			local12.anInt6486 = arg5;
			local12.anInt6481 = arg6;
			local12.anInt6484 = arg3;
			local12.anInt6491 = arg1;
			Static83.method1906(local12);
			Static207.aClass135_26.addTail(local12);
		}
		local12.anInt6494 = arg4;
		local12.anInt6479 = arg2;
		local12.anInt6480 = arg0;
		local12.anInt6488 = 0;
		local12.anInt6485 = -1;
	}
}
