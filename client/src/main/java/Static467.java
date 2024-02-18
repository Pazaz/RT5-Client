import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "[I")
	public static int[] anIntArray568;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "Lclient!ef;")
	public static Class96 aClass96_3;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "Lclient!vn;")
	public static Class348 aClass348_2;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method6350(@OriginalArg(1) String arg0) {
		return Static702.method9167(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)Lclient!pba;")
	public static Class286 method6351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static334.aClass291ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass286_2;
	}
}
