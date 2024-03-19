import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
	public static int anInt2085;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
	public static int anInt2086;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString77 = " from your friend list first.";

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	public static int anInt2080 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZB)V")
	public static void method1751(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static295.anInt6177 != -1) {
				Static309.method5428(Static295.anInt6177);
			}
			for (@Pc(14) Class1_Sub35 local14 = (Class1_Sub35) Static135.aClass183_33.method5052(); local14 != null; local14 = (Class1_Sub35) Static135.aClass183_33.method5050()) {
				if (!local14.method6169()) {
					local14 = (Class1_Sub35) Static135.aClass183_33.method5052();
					if (local14 == null) {
						break;
					}
				}
				Static321.method5630(true, local14, false);
			}
			Static295.anInt6177 = -1;
			Static135.aClass183_33 = new Class183(8);
			Static157.method3356();
			Static295.anInt6177 = Static173.anInt4123;
			Static53.method1384(false);
			Static102.method2127();
			Static267.method4821(Static295.anInt6177);
		}
		Static271.method4870();
		Static161.anInt3951 = -1;
		Static50.method1357(Static77.anInt2093);
		Static264.aClass7_Sub1_Sub1_Sub2_2 = new Class7_Sub1_Sub1_Sub2();
		Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0] = 52;
		Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 = 6656;
		Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 = 6656;
		Static88.anInt2339 = 0;
		Static3.anInt92 = 0;
		Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0] = 52;
		if (Static303.anInt6342 == 2) {
			Static3.anInt92 = Static246.anInt6529 << 7;
			Static88.anInt2339 = Static151.anInt3704 << 7;
		} else {
			Static101.method2097();
		}
		Static206.method4105();
		if (Static3.anInt92 == 0 || Static88.anInt2339 == 0) {
			Static276.method4934(10);
		} else {
			Static179.method3635();
			Static276.method4934(28);
		}
	}
}
