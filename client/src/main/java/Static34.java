import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bt", name = "F", descriptor = "Lclient!r;")
	public static Class197 aClass197_67;

	@OriginalMember(owner = "client!bt", name = "xb", descriptor = "Lclient!ih;")
	public static Class103 aClass103_3;

	@OriginalMember(owner = "client!bt", name = "Ab", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_6 = new Class36();

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method4810(@OriginalArg(1) Class19 arg0) {
		if (Static270.aBoolean371) {
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

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4828(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(26) String local26 = Static135.method2537(arg0);
		if (local26 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static384.anInt7178; local31++) {
			@Pc(37) String local37 = Static17.aStringArray43[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static135.method2537(local37);
			if (local37 != null && local37.equals(local26)) {
				Static384.anInt7178--;
				for (@Pc(61) int local61 = local31; local61 < Static384.anInt7178; local61++) {
					Static17.aStringArray43[local61] = Static17.aStringArray43[local61 + 1];
					Static319.aStringArray54[local61] = Static319.aStringArray54[local61 + 1];
					Static265.anIntArray333[local61] = Static265.anIntArray333[local61 + 1];
					Static209.aStringArray32[local61] = Static209.aStringArray32[local61 + 1];
					Static114.anIntArray148[local61] = Static114.anIntArray148[local61 + 1];
					Static302.aBooleanArray13[local61] = Static302.aBooleanArray13[local61 + 1];
				}
				Static53.anInt3971 = Static88.anInt1876;
				Static91.method1960(Static2.aClass145_3);
				Protocol.outboundBuffer.p1(Static27.method872(arg0));
				Protocol.outboundBuffer.method4822(arg0);
				return;
			}
		}
	}
}
