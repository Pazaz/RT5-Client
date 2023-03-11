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
				Static32.aClass2_Sub5_2 = (Class2_Sub5) Static129.aClass135_19.aClass2_130.aClass2_244.aClass2_244;
			} else {
				Static259.method4427((Class2_Sub5) Static129.aClass135_19.aClass2_130.aClass2_244.aClass2_244, Static370.aClass2_Sub24_1.method5243(), Static370.aClass2_Sub24_1.method5242());
			}
		} else if (local18) {
			Static32.aClass2_Sub5_2 = (Class2_Sub5) Static129.aClass135_19.aClass2_130.aClass2_244;
		} else {
			Static259.method4427((Class2_Sub5) Static129.aClass135_19.aClass2_130.aClass2_244, Static370.aClass2_Sub24_1.method5243(), Static370.aClass2_Sub24_1.method5242());
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!tl;Lclient!tl;Z)V")
	public static void method2696(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) Class2_Sub2 arg1) {
		if (arg1.aClass2_Sub2_52 != null) {
			arg1.method6143();
		}
		arg1.aClass2_Sub2_51 = arg0.aClass2_Sub2_51;
		arg1.aClass2_Sub2_52 = arg0;
		arg1.aClass2_Sub2_52.aClass2_Sub2_51 = arg1;
		arg1.aClass2_Sub2_51.aClass2_Sub2_52 = arg1;
	}
}
