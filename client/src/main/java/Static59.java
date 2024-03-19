import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!se;")
	public static Class182 aClass182_5;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!op;")
	public static final Class143 aClass143_11 = new Class143(64);

	@OriginalMember(owner = "client!e", name = "h", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!e", name = "i", descriptor = "[I")
	public static final int[] anIntArray537 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString251 = "rating: ";

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)Z")
	public static boolean method5599(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = Static221.aClass40_6.method2719();
		if (local12 == arg0) {
			return true;
		}
		if (!arg0) {
			Static221.aClass40_6.method2786();
		} else if (!Static221.aClass40_6.method2760()) {
			arg0 = false;
		}
		if (local12 == arg0) {
			return false;
		} else {
			Static280.aBoolean419 = arg0;
			Static263.method4776(Static184.aClass199_12);
			return true;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)V")
	public static void method5601() {
		Static117.aClass215_48.method6063(5);
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	public static void method5605() {
		Static200.aClass1_Sub3_Sub1_1.method2213();
		Static254.aClass162_195 = null;
		Static344.anInt7239 = 1;
	}
}
