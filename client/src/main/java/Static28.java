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

}
