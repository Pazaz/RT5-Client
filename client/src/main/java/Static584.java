import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!sga", name = "i", descriptor = "I")
	public static int anInt8634;

	@OriginalMember(owner = "client!sga", name = "k", descriptor = "I")
	public static int anInt8635;

	@OriginalMember(owner = "client!sga", name = "g", descriptor = "Z")
	public static boolean aBoolean658 = false;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIILclient!kp;Lclient!kp;)V")
	public static void method7665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub2_Sub3 arg3, @OriginalArg(4) Class8_Sub2_Sub3 arg4) {
		@Pc(4) Class291 local4 = Static347.method5095(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass8_Sub2_Sub3_2 = arg3;
		local4.aClass8_Sub2_Sub3_1 = arg4;
		@Pc(22) int local22 = Static246.aClass178Array1 == Static693.aClass178Array2 ? 1 : 0;
		if (!arg3.method9283()) {
			arg3.aClass8_Sub2_25 = Static468.aClass8_Sub2Array10[local22];
			Static468.aClass8_Sub2Array10[local22] = arg3;
		} else if (arg3.method9282(0)) {
			arg3.aClass8_Sub2_25 = Static398.aClass8_Sub2Array7[local22];
			Static398.aClass8_Sub2Array7[local22] = arg3;
		} else {
			arg3.aClass8_Sub2_25 = Static576.aClass8_Sub2Array9[local22];
			Static576.aClass8_Sub2Array9[local22] = arg3;
			Static75.aBoolean521 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9283()) {
			if (arg4.method9282(0)) {
				arg4.aClass8_Sub2_25 = Static398.aClass8_Sub2Array7[local22];
				Static398.aClass8_Sub2Array7[local22] = arg4;
				return;
			}
			arg4.aClass8_Sub2_25 = Static576.aClass8_Sub2Array9[local22];
			Static576.aClass8_Sub2Array9[local22] = arg4;
			Static75.aBoolean521 = true;
			return;
		}
		arg4.aClass8_Sub2_25 = Static468.aClass8_Sub2Array10[local22];
		Static468.aClass8_Sub2Array10[local22] = arg4;
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(Z)V")
	public static void method7666() {
		Static186.aClass82_67.method2157();
	}
}
