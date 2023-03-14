import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method2695() {
		@Pc(18) boolean local18 = Static375.aClass161_14 != null || Static348.anInt6449 > 0;
		if (local18) {
			Static116.anInt2357 = 1;
		}
		if (Static148.aBoolean192 && Static174.aClass123_2.method3343(81) && Static268.anInt4959 > 2) {
			if (local18) {
				Static32.aClass2_Sub5_2 = (Class2_Sub5) Static129.aClass135_19.aClass2_130.prev.prev;
			} else {
				Protocol.method4427((Class2_Sub5) Static129.aClass135_19.aClass2_130.prev.prev, Static370.aClass2_Sub24_1.method5243(), Static370.aClass2_Sub24_1.method5242());
			}
		} else if (local18) {
			Static32.aClass2_Sub5_2 = (Class2_Sub5) Static129.aClass135_19.aClass2_130.prev;
		} else {
			Protocol.method4427((Class2_Sub5) Static129.aClass135_19.aClass2_130.prev, Static370.aClass2_Sub24_1.method5243(), Static370.aClass2_Sub24_1.method5242());
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
