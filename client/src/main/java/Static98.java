import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!gk", name = "M", descriptor = "Z")
	private static boolean aBoolean70;

	@OriginalMember(owner = "client!gk", name = "N", descriptor = "Z")
	private static boolean aBoolean71;

	@OriginalMember(owner = "client!gk", name = "O", descriptor = "Z")
	private static boolean aBoolean72;

	@OriginalMember(owner = "client!gk", name = "P", descriptor = "Z")
	private static boolean aBoolean73;

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
	public static int anInt1150 = 0;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
	public static void method900() {
		if (Static326.aBoolean478 && Static345.aBooleanArray30[81] && Static237.anInt5285 > 2) {
			Static3.method62((Class1_Sub22) Static97.aClass130_9.aClass1_138.aClass1_248.aClass1_248);
		} else {
			Static3.method62((Class1_Sub22) Static97.aClass130_9.aClass1_138.aClass1_248);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)I")
	public static int method902(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return 7 - arg1;
		} else if (local12 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)V")
	public static void method909() {
		@Pc(12) Class58[] local12 = Class211.aClass58Array1;
		synchronized (Class211.aClass58Array1) {
			for (@Pc(16) int local16 = 0; local16 < Class211.aClass58Array1.length; local16++) {
				Class211.aClass58Array1[local16] = new Class58();
				Static235.anIntArray398[local16] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "providesignlink", descriptor = "(Lclient!ud;)V")
	private static void method913(@OriginalArg(0) Class199 arg0) {
		Static184.aClass199_12 = arg0;
		Static122.aClass199_7 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)Z")
	public static boolean method916() {
		if (Static208.aBoolean333) {
			try {
				if ((Boolean) Static358.method1001(Static184.aClass199_12.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}
}
