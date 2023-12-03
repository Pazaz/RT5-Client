import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!so", name = "m", descriptor = "[I")
	public static int[] anIntArray404;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_125 = new LocalizedString("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V")
	public static void method5481(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) DelayedStateChange local12 = Static316.method5413(1, arg0);
		local12.method2311();
		local12.intArg1 = arg1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZIIIIIIII)Z")
	public static boolean method5482(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = PlayerList.self.movementQueueX[0];
		@Pc(18) int local18 = PlayerList.self.movementQueueZ[0];
		if (local13 < 0 || Static373.buildAreaLimitX <= local13 || local18 < 0 || Static242.buildAreaLimitZ <= local18) {
			return false;
		} else if (arg5 >= 0 && arg5 < Static373.buildAreaLimitX && arg2 >= 0 && arg2 < Static242.buildAreaLimitZ) {
			@Pc(88) int local88 = Static141.method2654(arg0, Static52.anIntArray99, arg6, arg1, arg7, arg3, Static171.collisionMaps[PlayerList.self.plane], local13, arg4, arg5, Static59.anIntArray105, PlayerList.self.getSize(), arg2, local18);
			if (local88 < 1) {
				return false;
			}
			Static358.anInt6550 = Static52.anIntArray99[local88 - 1];
			Static312.anInt5844 = Static59.anIntArray105[local88 - 1];
			Static370.aBoolean474 = false;
			Static359.method6009();
			return true;
		} else {
			return false;
		}
	}

}
