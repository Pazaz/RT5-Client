import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	public static int anInt6515;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void method5512() {
		for (@Pc(8) Class1_Sub20 local8 = (Class1_Sub20) Static268.aClass130_35.method3749(); local8 != null; local8 = (Class1_Sub20) Static268.aClass130_35.method3756()) {
			if (local8.aBoolean284) {
				local8.method3451();
			}
		}
		for (@Pc(36) Class1_Sub20 local36 = (Class1_Sub20) Static24.aClass130_4.method3749(); local36 != null; local36 = (Class1_Sub20) Static24.aClass130_4.method3756()) {
			if (local36.aBoolean284) {
				local36.method3451();
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	public static void method5516() {
		if (Static305.aClass37_2 != null) {
			Static305.aClass37_2.method5864();
		}
		if (Static37.aClass37_1 != null) {
			Static37.aClass37_1.method5864();
		}
		Static73.method1726(Static90.aBoolean156);
		Static305.aClass37_2 = Static120.method2587(Static86.aCanvas2, Static184.aClass199_12, 22050, 0);
		Static305.aClass37_2.method5871(Static334.aClass1_Sub3_Sub1_3);
		Static37.aClass37_1 = Static120.method2587(Static86.aCanvas2, Static184.aClass199_12, 2048, 1);
		Static37.aClass37_1.method5871(Static127.aClass1_Sub3_Sub3_1);
	}
}
