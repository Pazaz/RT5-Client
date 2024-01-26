import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
	public static int anInt8828;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
	public static int anInt8832;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "Lclient!hh;")
	public static Class162 aClass162_5;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_219 = new Class225(119, 6);

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "S")
	public static short aShort120 = 32767;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)Z")
	public static boolean method7825(@OriginalArg(0) int arg0) {
		if (arg0 == 49 || arg0 == 59 || arg0 == 47 || arg0 == 57 || arg0 == 3 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 23;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
	public static void method7827() {
		for (@Pc(13) Class2_Sub2_Sub20 local13 = (Class2_Sub2_Sub20) Static346.aClass28_29.method736(); local13 != null; local13 = (Class2_Sub2_Sub20) Static346.aClass28_29.method740()) {
			@Pc(18) Class8_Sub2_Sub1_Sub5 local18 = local13.aClass8_Sub2_Sub1_Sub5_1;
			local18.method6598();
			if (local18.method6603()) {
				local13.method9457();
				local18.method6600();
			} else if (Static334.aClass291ArrayArrayArray1 != null && local18.method6595()) {
				Static102.method2026(local18, true);
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBI)Z")
	public static boolean method7828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static646.method8457(arg1, arg0) | Static58.method1257(arg1, arg0) | Static340.method5011(arg0, arg1)) & Static277.method4044(arg0, arg1);
	}
}
