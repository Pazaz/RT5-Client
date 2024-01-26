import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
	public static int anInt1474;

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "Lclient!st;")
	public static Class23 aClass23_8;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIII)V")
	public static void method1427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 * Static400.aClass2_Sub34_28.aClass57_Sub25_2.method7208() >> 8;
		if (arg1 == -1 && !Static501.aBoolean575) {
			Static100.method1988();
		} else if (arg1 != -1 && (Static588.anInt8692 != arg1 || !Static52.method1157(-122)) && local12 != 0 && !Static501.aBoolean575) {
			Static618.method8318(Static398.aClass330_81, local12, arg1, arg2);
			Static550.method7266();
		}
		if (Static588.anInt8692 != arg1) {
			Static8.aClass2_Sub6_Sub1_1 = null;
		}
		Static588.anInt8692 = arg1;
	}
}
