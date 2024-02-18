import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static662 {

	@OriginalMember(owner = "client!v", name = "n", descriptor = "I")
	public static int anInt9843;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "I")
	public static int anInt9845;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V")
	public static void method8625(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(7) Class283 local7 = Static489.aClass283Array1[99];
		for (@Pc(9) int local9 = 99; local9 > 0; local9--) {
			Static489.aClass283Array1[local9] = Static489.aClass283Array1[local9 - 1];
		}
		if (local7 == null) {
			local7 = new Class283(arg7, arg5, arg1, arg0, arg6, arg4, arg2, arg3);
		} else {
			local7.method6444(arg2, arg5, arg1, arg3, arg7, arg0, arg4, arg6);
		}
		Static489.aClass283Array1[0] = local7;
		Static716.anInt10815 = Static642.anInt9599;
		Static129.anInt2406++;
	}
}
