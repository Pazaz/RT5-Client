import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "Gc", descriptor = "Lclient!qj;")
	public static Class162 aClass162_23;

	@OriginalMember(owner = "client!ai", name = "Mc", descriptor = "Lclient!qj;")
	public static Class162 aClass162_24;

	@OriginalMember(owner = "client!ai", name = "Ic", descriptor = "Lclient!we;")
	public static final Class215 aClass215_7 = new Class215(200);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method329(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static43.anInt1459; local11++) {
			if (arg0.equalsIgnoreCase(Static46.aStringArray42[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static264.aClass7_Sub1_Sub1_Sub2_2.aString266);
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(II)V")
	public static void method333(@OriginalArg(1) int arg0) {
		Static166.anInt4026 = arg0;
		Static3.aClass215_1.method6060();
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(IIII)V")
	public static void method336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static150.aClass1_Sub16_Sub2_2.method5793(119);
		}
		if (arg1 == 1) {
			Static150.aClass1_Sub16_Sub2_2.method5793(163);
		}
		Static150.aClass1_Sub16_Sub2_2.method5734(arg0 + Static96.anInt2446);
		Static150.aClass1_Sub16_Sub2_2.method5783(Static345.aBooleanArray30[82] ? 1 : 0);
		Static150.aClass1_Sub16_Sub2_2.method5757(Static149.anInt3667 + arg2);
		Static47.anInt1523 = arg2;
		Static268.anInt5668 = arg0;
		Static127.aBoolean231 = false;
		Static239.method4514();
	}
}
