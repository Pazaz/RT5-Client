import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
	public static int anInt3505;

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString122 = "cyan:";

	@OriginalMember(owner = "client!jh", name = "T", descriptor = "Z")
	public static boolean aBoolean243 = true;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V")
	public static void method3109() {
		if (Static46.aBoolean483) {
			Static46.aBoolean483 = false;
			Static22.aClass29_1 = null;
			Static134.aClass29_12 = null;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V")
	public static void method3110() {
		@Pc(5) Class215 local5 = Static223.aClass215_70;
		synchronized (Static223.aClass215_70) {
			Static223.aClass215_70.method6063(5);
		}
		local5 = Static67.aClass215_6;
		synchronized (Static67.aClass215_6) {
			Static67.aClass215_6.method6063(5);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!fg;Lclient!fg;IIIIIIII)V")
	public static void method3112(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) Class7_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg1.method5984();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class29 local20 = (Class29) Static70.aClass215_29.method6057((long) local7);
		if (local20 == null) {
			@Pc(27) Class133[] local27 = Static363.method3883(Static203.aClass162_47, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static221.aClass40_6.method2722(local27[0]);
			Static70.aClass215_29.method6050(local20, (long) local7);
		}
		Static19.method472(arg6 >> 1, arg0.anInt7032, arg0.anInt7027, arg3 >> 1, arg0.method5973() * 64, 0);
		@Pc(71) int local71 = arg2 + Static47.anIntArray96[0] - 18;
		@Pc(79) int local79 = local71 + arg4 / 4 * 18;
		@Pc(87) int local87 = Static47.anIntArray96[1] + arg5 - 70;
		@Pc(95) int local95 = local87 + arg4 % 4 * 18;
		local20.method5845(local79, local95);
		if (arg1 == arg0) {
			Static221.aClass40_6.method2806(18, local79 - 1, 18, local95 - 1, -256);
		}
		@Pc(117) Class2_Sub5 local117 = Static51.method1362();
		local117.aClass7_Sub1_Sub1_1 = arg1;
		local117.anInt4794 = local95 + 16;
		local117.anInt4799 = local79;
		local117.anInt4797 = local79 + 16;
		local117.anInt4796 = local95;
		Static19.aClass58_1.method1670(local117);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[Ljava/lang/String;IB)Ljava/lang/String;")
	public static String method3113(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(24) String local24 = arg1[arg0];
			return local24 == null ? "null" : local24.toString();
		} else {
			@Pc(35) int local35 = arg2 + arg0;
			@Pc(37) int local37 = 0;
			for (@Pc(39) int local39 = arg0; local39 < local35; local39++) {
				@Pc(45) String local45 = arg1[local39];
				if (local45 == null) {
					local37 += 4;
				} else {
					local37 += local45.length();
				}
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local37);
			for (@Pc(66) int local66 = arg0; local66 < local35; local66++) {
				@Pc(72) String local72 = arg1[local66];
				if (local72 == null) {
					local64.append("null");
				} else {
					local64.append(local72);
				}
			}
			return local64.toString();
		}
	}
}
