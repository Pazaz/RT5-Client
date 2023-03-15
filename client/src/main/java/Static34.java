import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bt", name = "xb", descriptor = "Lclient!ih;")
	public static Class103 aClass103_3;

	@OriginalMember(owner = "client!bt", name = "Ab", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_6 = new Class36();

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method4810(@OriginalArg(1) TextureProvider arg0) {
		if (InterfaceList.aBoolean371) {
			Static117.method2367(arg0);
		} else {
			Static361.method6055(arg0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(14) int local14 = arg2 + arg5;
		for (@Pc(24) int local24 = arg5; local24 < local14; local24++) {
			Static101.method2163(arg3, Static357.anIntArrayArray58[local24], arg6, arg1);
		}
		@Pc(47) int local47 = arg3 - arg2;
		@Pc(51) int local51 = arg1 + arg2;
		for (@Pc(53) int local53 = arg0; local53 > local10; local53--) {
			Static101.method2163(arg3, Static357.anIntArrayArray58[local53], arg6, arg1);
		}
		for (@Pc(73) int local73 = local14; local73 <= local10; local73++) {
			@Pc(79) int[] local79 = Static357.anIntArrayArray58[local73];
			Static101.method2163(local51, local79, arg6, arg1);
			Static101.method2163(local47, local79, arg4, local51);
			Static101.method2163(arg3, local79, arg6, local47);
		}
	}

}
