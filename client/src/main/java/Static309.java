import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_7 = new Class16("", 17);

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
	public static int js5ConnectState = 0;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
	public static int anInt5801 = 0;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
	public static int anInt5802 = 64;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)I")
	public static int method5277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = (local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public static void method5278() {
		if (Static139.anInt2595 == -1) {
			return;
		}
		@Pc(20) int local20 = Static226.aClass119_1.method3304();
		@Pc(24) int local24 = Static226.aClass119_1.method3313();
		if (Static370.aClass2_Sub24_1 != null) {
			local20 = Static370.aClass2_Sub24_1.method5243();
			local24 = Static370.aClass2_Sub24_1.method5242();
		}
		Static257.method3927(0, Static172.anInt3299, Static250.anInt4665, 0, 0, local20, Static139.anInt2595, local24, 0);
		if (Static227.aClass161_11 != null) {
			Static12.method280(local20, local24);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method5279(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static301.anInt5700 >= 100) {
			Static207.method3700(Static322.aClass79_125.method2267(client.language));
			return;
		}
		@Pc(22) String local22 = Static135.method2537(arg0);
		if (local22 == null) {
			return;
		}
		@Pc(65) String local65;
		for (@Pc(27) int local27 = 0; local27 < Static301.anInt5700; local27++) {
			@Pc(35) String local35 = Static135.method2537(Static226.aStringArray35[local27]);
			if (local35 != null && local35.equals(local22)) {
				Static207.method3700(arg0 + Static44.aClass79_26.method2267(client.language));
				return;
			}
			if (Static371.aStringArray66[local27] != null) {
				local65 = Static135.method2537(Static371.aStringArray66[local27]);
				if (local65 != null && local65.equals(local22)) {
					Static207.method3700(arg0 + Static44.aClass79_26.method2267(client.language));
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Static384.anInt7178; local95++) {
			local65 = Static135.method2537(Static17.aStringArray43[local95]);
			if (local65 != null && local65.equals(local22)) {
				Static207.method3700(Static261.aClass79_107.method2267(client.language) + arg0 + Static120.aClass79_50.method2267(client.language));
				return;
			}
			if (Static319.aStringArray54[local95] != null) {
				@Pc(138) String local138 = Static135.method2537(Static319.aStringArray54[local95]);
				if (local138 != null && local138.equals(local22)) {
					Static207.method3700(Static261.aClass79_107.method2267(client.language) + arg0 + Static120.aClass79_50.method2267(client.language));
					return;
				}
			}
		}
		if (Static135.method2537(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41).equals(local22)) {
			Static207.method3700(Static47.aClass79_27.method2267(client.language));
		} else {
			Static91.method1960(Static192.aClass145_139);
			Protocol.outboundBuffer.p1(Static27.method872(arg0) + 1);
			Protocol.outboundBuffer.pjstr(arg0);
			Protocol.outboundBuffer.p1(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
	public static void method5280() {
		Static146.anInt2703 = 0;
		Static312.anInt5844 = -1;
		Static358.anInt6550 = -1;
	}
}
