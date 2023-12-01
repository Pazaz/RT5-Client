import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method2695() {
		@Pc(18) boolean local18 = Cs1ScriptRunner.aClass161_14 != null || InterfaceList.anInt6449 > 0;
		if (local18) {
			Static116.anInt2357 = 1;
		}
		if (Static148.shiftClickMod && Keyboard.instance.isPressed(81) && Static268.anInt4959 > 2) {
			if (local18) {
				Static32.aClass2_Sub5_2 = (Class2_Sub5) Static129.aClass135_19.aClass2_130.prev.prev;
			} else {
				Protocol.method4427((Class2_Sub5) Static129.aClass135_19.aClass2_130.prev.prev, Mouse.clickButton.getY(), Mouse.clickButton.getX());
			}
		} else if (local18) {
			Static32.aClass2_Sub5_2 = (Class2_Sub5) Static129.aClass135_19.aClass2_130.prev;
		} else {
			Protocol.method4427((Class2_Sub5) Static129.aClass135_19.aClass2_130.prev, Mouse.clickButton.getY(), Mouse.clickButton.getX());
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!tl;Lclient!tl;Z)V")
	public static void method2696(@OriginalArg(0) SecondaryNode arg0, @OriginalArg(1) SecondaryNode arg1) {
		if (arg1.secondaryPrev != null) {
			arg1.unlinkSecondary();
		}
		arg1.secondaryNext = arg0.secondaryNext;
		arg1.secondaryPrev = arg0;
		arg1.secondaryPrev.secondaryNext = arg1;
		arg1.secondaryNext.secondaryPrev = arg1;
	}
}
