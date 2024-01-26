import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
	public static int anInt3123 = -1;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!cba;B)Ljava/lang/String;")
	public static String method2874(@OriginalArg(0) Class2_Sub2_Sub4 arg0) {
		return arg0.aString10 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!cba;I)I")
	public static int method2875(@OriginalArg(0) Class2_Sub2_Sub4 arg0) {
		@Pc(14) String local14 = method2874(arg0);
		return Static42.aClass381_4.method8742(Static186.aClass23Array5, local14);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)Lclient!aea;")
	public static Class8_Sub1 method2876() {
		@Pc(14) Class8_Sub1 local14 = (Class8_Sub1) Static129.aClass130_3.method2783();
		if (local14 == null) {
			return new Class8_Sub1();
		} else {
			Static6.anInt94--;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method2877(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		Static524.aClass153_3 = Static405.aClass153_2;
		Static299.anInt4825 = 2;
		Static470.anInt7113 = arg1;
		Static238.method3471(false, arg2, false, arg0);
	}
}
