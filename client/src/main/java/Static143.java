import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static143 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)V")
	public static void method2679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static116.anInt2357 == 1) {
			Protocol.method4427(Static32.aClass2_Sub5_2, arg1, arg0);
		} else if (Static116.anInt2357 == 2) {
			Static388.method6439(arg1, arg0);
		}
		Static116.anInt2357 = 0;
		Static32.aClass2_Sub5_2 = null;
	}
}
