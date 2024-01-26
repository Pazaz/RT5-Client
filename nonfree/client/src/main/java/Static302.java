import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
	public static int anInt4854;

	@OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
	public static int anInt4851 = 765;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(III)Lclient!kp;")
	public static Class8_Sub2_Sub3 method4414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static334.aClass291ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub2_Sub3_2;
	}
}
