import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "Lclient!pg;")
	public static Class2_Sub2_Sub16 aClass2_Sub2_Sub16_9;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "[Lclient!tn;")
	public static Class357[] aClass357Array2;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "Z")
	public static boolean aBoolean521 = true;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)I")
	public static int method6238(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return local17 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
	public static void method6239() {
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub19_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub19_2);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub4_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub4_2);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub6_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub23_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub27_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub8_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub7_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub12_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub30_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub24_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub26_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub16_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub13_2);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub13_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub28_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub5_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub20_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub2_1);
		Static376.method5313();
		Static400.aClass2_Sub34_28.method5104(2, Static400.aClass2_Sub34_28.aClass57_Sub18_1);
		Static400.aClass2_Sub34_28.method5104(2, Static400.aClass2_Sub34_28.aClass57_Sub15_1);
		Static296.method4362();
		Static218.method3187();
		Static284.aBoolean355 = true;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!ge;)Lclient!kk;")
	public static Class154_Sub2 method6240(@OriginalArg(1) Class2_Sub21 arg0) {
		return new Class154_Sub2(arg0.method7356(), arg0.method7356(), arg0.method7356(), arg0.method7356(), arg0.method7383(), arg0.method7383(), arg0.method7396());
	}
}
