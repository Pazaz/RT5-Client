import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
	public static int anInt3901 = 1;

	@OriginalMember(owner = "client!kj", name = "M", descriptor = "[B")
	public static final byte[] aByteArray34 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!nr;Lclient!qj;)V")
	public static void method3355(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class162 arg1) {
		if (Static46.aBoolean483) {
			return;
		}
		arg0.method2735(0);
		Static134.aClass29_12 = arg0.method2722(Static363.method3881(arg1, Static314.anInt6502));
		Static134.aClass29_12.method5845((Static107.anInt2674 - Static134.aClass29_12.method5850()) / 2, (Static350.anInt7318 - Static134.aClass29_12.method5832()) / 2);
		Static22.aClass29_1 = arg0.method2722(Static363.method3881(arg1, Static14.anInt586));
		Static22.aClass29_1.method5845((Static107.anInt2674 - Static22.aClass29_1.method5850()) / 2, 18);
		Static46.aBoolean483 = true;
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
	public static void method3356() {
		Class1_Sub2_Sub10.lb = new Class177[Static240.aClass162_190.method4633()][];
		Static99.aBooleanArray8 = new boolean[Static240.aClass162_190.method4633()];
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
	public static void method3359(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static78.anIntArray137[arg0] = arg1;
		@Pc(19) Class1_Sub34 local19 = (Class1_Sub34) Static72.aClass183_6.method5053((long) arg0);
		if (local19 == null) {
			local19 = new Class1_Sub34(Static325.method5658() + 500L);
			Static72.aClass183_6.method5055((long) arg0, local19);
		} else {
			local19.aLong190 = Static325.method5658() + 500L;
		}
	}
}
