import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString204 = "Hidden";

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
	public static int anInt5598 = 0;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public static int anInt5600 = -1;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Z")
	public static boolean aBoolean395 = false;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)I")
	public static int method4775(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ud;B)V")
	public static void method4776(@OriginalArg(0) Class199 arg0) {
		@Pc(7) Class10 local7 = null;
		try {
			@Pc(11) Class145 local11 = arg0.method5485();
			while (local11.anInt5065 == 0) {
				Static295.method5212(1L);
			}
			if (local11.anInt5065 == 1) {
				local7 = (Class10) local11.anObject6;
				@Pc(32) Class1_Sub16 local32 = Static262.method4773();
				local7.method358(local32.aByteArray86, 0, local32.anInt6813);
			}
		} catch (@Pc(42) Exception local42) {
		}
		try {
			if (local7 != null) {
				local7.method356();
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)V")
	public static void method4777(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static297.method5241();
		} else if (arg0 == 2) {
			Static89.method1963();
		} else if (arg0 == 3) {
			Static109.method2259();
		} else {
			throw new RuntimeException();
		}
	}
}
