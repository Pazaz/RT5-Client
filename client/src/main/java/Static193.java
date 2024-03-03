import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public static int anInt3556;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_78 = new LocalizedString("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!la", name = "j", descriptor = "I")
	public static int messageCounter = 0;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static int anInt3557 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[BIII)Z")
	public static boolean method3511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Packet local17 = new Packet(arg2);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.gExtended1or2();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local17.gsmart();
					if (local39 == 0) {
						continue label56;
					}
					local31 += local39 - 1;
					@Pc(66) int local66 = local31 & 0x3F;
					@Pc(72) int local72 = local31 >> 6 & 0x3F;
					@Pc(78) int local78 = local17.g1() >> 2;
					@Pc(82) int local82 = arg1 + local72;
					@Pc(86) int local86 = local66 + arg0;
					if (local82 > 0 && local86 > 0 && local82 < arg4 - 1 && arg3 - 1 > local86) {
						@Pc(112) LocType local112 = client.LocTypes.get(local19);
						if (local78 != 22 || client.preferences.groundDecoration || local112.anInt1335 != 0 || local112.anInt1324 == 1 || local112.aBoolean117) {
							if (!local112.method1529()) {
								Static305.anInt5742++;
								local7 = false;
							}
							local33 = true;
						}
					}
				}
				local39 = local17.gsmart();
				if (local39 == 0) {
					break;
				}
				local17.g1();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!wm;Lclient!ur;ZIII)V")
	public static void method3512(@OriginalArg(0) int arg0, @OriginalArg(1) RasteriserBase arg1, @OriginalArg(2) BitmapFont arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3) {
			Static252.aClass13_14.method6385((GameShell.canvasWidth - Static252.aClass13_14.method6399()) / 2, (GameShell.canvasHeight - Static252.aClass13_14.method6384()) / 2);
			Static333.aClass13_21.method6385((GameShell.canvasWidth - Static333.aClass13_21.method6399()) / 2, 18);
		}
		arg2.method5900((client.GAME_RS == client.game ? Static221.aClass79_99 : Static221.aClass79_98).getLocalized(client.language), -1, GameShell.canvasHeight / 2 - 26, arg0, GameShell.canvasWidth / 2);
		@Pc(58) int local58 = GameShell.canvasHeight / 2 - 18;
		arg1.method2836(GameShell.canvasWidth / 2 - 152, local58, 304, 34, arg4, 0);
		arg1.method2836(GameShell.canvasWidth / 2 - 151, local58 + 1, 302, 32, 0, 0);
		arg1.method2901(GameShell.canvasWidth / 2 - 150, local58 + 2, client.mainLoadPercentage * 3, 30, arg5, 0);
		arg1.method2901(GameShell.canvasWidth / 2 + client.mainLoadPercentage * 3 - 150, local58 + 2, 300 - client.mainLoadPercentage * 3, 30, 0, 0);
		arg2.method5900(client.mainLoadSecondaryText, -1, GameShell.canvasHeight / 2 + 4, arg0, GameShell.canvasWidth / 2);
	}
}
