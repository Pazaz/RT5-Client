import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public static int anInt3556;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_78 = new Class79("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!h;")
	public static final Class89 aClass89_146 = new Class89(63, -1);

	@OriginalMember(owner = "client!la", name = "j", descriptor = "I")
	public static int anInt3555 = 0;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static int anInt3557 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[BIII)Z")
	public static boolean method3511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class2_Sub4 local17 = new Class2_Sub4(arg2);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.method4839();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local17.method4817();
					if (local39 == 0) {
						continue label56;
					}
					local31 += local39 - 1;
					@Pc(66) int local66 = local31 & 0x3F;
					@Pc(72) int local72 = local31 >> 6 & 0x3F;
					@Pc(78) int local78 = local17.method4815() >> 2;
					@Pc(82) int local82 = arg1 + local72;
					@Pc(86) int local86 = local66 + arg0;
					if (local82 > 0 && local86 > 0 && local82 < arg4 - 1 && arg3 - 1 > local86) {
						@Pc(112) Class41 local112 = Static359.aClass202_4.method5163(local19);
						if (local78 != 22 || Static218.aClass177_Sub1_2.aBoolean359 || local112.anInt1335 != 0 || local112.anInt1324 == 1 || local112.aBoolean117) {
							if (!local112.method1529()) {
								Static305.anInt5742++;
								local7 = false;
							}
							local33 = true;
						}
					}
				}
				local39 = local17.method4817();
				if (local39 == 0) {
					break;
				}
				local17.method4815();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!wm;Lclient!ur;ZIII)V")
	public static void method3512(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class130 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3) {
			Static252.aClass13_14.method6385((Static250.anInt4665 - Static252.aClass13_14.method6399()) / 2, (Static172.anInt3299 - Static252.aClass13_14.method6384()) / 2);
			Static333.aClass13_21.method6385((Static250.anInt4665 - Static333.aClass13_21.method6399()) / 2, 18);
		}
		arg2.method5900((Static249.aClass50_3 == Static343.aClass50_4 ? Static221.aClass79_99 : Static221.aClass79_98).method2267(Static295.anInt5581), -1, Static172.anInt3299 / 2 - 26, arg0, Static250.anInt4665 / 2);
		@Pc(58) int local58 = Static172.anInt3299 / 2 - 18;
		arg1.method2836(Static250.anInt4665 / 2 - 152, local58, 304, 34, arg4, 0);
		arg1.method2836(Static250.anInt4665 / 2 - 151, local58 + 1, 302, 32, 0, 0);
		arg1.method2901(Static250.anInt4665 / 2 - 150, local58 + 2, Static141.anInt2650 * 3, 30, arg5, 0);
		arg1.method2901(Static250.anInt4665 / 2 + Static141.anInt2650 * 3 - 150, local58 + 2, 300 - Static141.anInt2650 * 3, 30, 0, 0);
		arg2.method5900(Static56.aString13, -1, Static172.anInt3299 / 2 + 4, arg0, Static250.anInt4665 / 2);
	}
}
