import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public static int anInt1946;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!h;")
	public static final Class89 aClass89_76 = new Class89(29, 3);

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
	public static int anInt1950 = 0;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
	public static int anInt1951 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!mr;II)V")
	public static void method1999(@OriginalArg(0) Class11_Sub5_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg0.anInt4622 > Static114.anInt2348) {
			Static297.method5113(arg0);
		} else if (arg0.anInt4584 < Static114.anInt2348) {
			Static317.method5548(arg0, false);
			local9 = Static16.anInt4756;
			local7 = Static170.anInt3229;
		} else {
			Static277.method4682(arg0);
		}
		if (arg0.anInt6781 < 128 || arg0.anInt6783 < 128 || Static373.anInt7033 * 128 - 128 <= arg0.anInt6781 || arg0.anInt6783 >= (Static242.anInt4449 - 1) * 128) {
			arg0.anInt4597 = -1;
			arg0.anInt4622 = 0;
			local7 = -1;
			arg0.anInt4584 = 0;
			local9 = 0;
			arg0.anInt4594 = -1;
			arg0.anInt6781 = arg0.anIntArray316[0] * 128 + arg0.method4328() * 64;
			arg0.anInt6783 = arg0.anIntArray317[0] * 128 + arg0.method4328() * 64;
			arg0.method4331();
		}
		if (Static17.aClass11_Sub5_Sub2_Sub1_3 == arg0 && (arg0.anInt6781 < 1536 || arg0.anInt6783 < 1536 || Static373.anInt7033 * 128 - 1536 <= arg0.anInt6781 || arg0.anInt6783 >= (Static242.anInt4449 - 12) * 128)) {
			arg0.anInt4594 = -1;
			arg0.anInt4597 = -1;
			local9 = 0;
			local7 = -1;
			arg0.anInt4584 = 0;
			arg0.anInt4622 = 0;
			arg0.anInt6781 = arg0.anIntArray316[0] * 128 + arg0.method4328() * 64;
			arg0.anInt6783 = arg0.anIntArray317[0] * 128 + arg0.method4328() * 64;
			arg0.method4331();
		}
		@Pc(209) int local209 = Static71.method6019(arg0);
		Static100.method2160(local209, local9, local7, arg0);
		Static173.method3315(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZCLjava/lang/String;)I")
	public static int method2000(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Lclient!cj;")
	public static Class11_Sub3 method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static330.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub3_3;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method2002() {
		Static91.method1960(Static101.aClass145_75);
		Protocol.outboundBuffer.p1(Static144.getWindowMode());
		Protocol.outboundBuffer.p2(GameShell.canvasWidth);
		Protocol.outboundBuffer.p2(GameShell.canvasHeight);
		Protocol.outboundBuffer.p1(client.preferences.anInt4885);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	public static void method2003() {
		Static285.method4893(Static92.anInt1914);
	}
}
