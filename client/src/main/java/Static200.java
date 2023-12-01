import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "Lclient!ur;")
	public static BitmapFont aClass130_3;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
	public static int anInt3698;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method3643(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static93.method2000(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0 != arg1.charAt(local25); local25++) {
			}
			local15[local17++] = arg1.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
	public static void method3644() {
		if (Static215.anInt3795 != 3) {
			Player.worldId = -1;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIBII)V")
	public static void method3646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) MapList.anInt6052 / (float) MapList.anInt6056;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg3;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(48) int local48 = arg2 - (arg1 - local11) / 2;
		@Pc(57) int local57 = arg0 - (arg3 - local13) / 2;
		Static77.anInt1763 = -1;
		WorldMap.anInt2772 = local48 * MapList.anInt6056 / local11;
		WorldMap.anInt2003 = MapList.anInt6052 - local57 * MapList.anInt6052 / local13;
		Static238.anInt4328 = -1;
		Static298.method2422();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method3647(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg0.indexOf(arg2); local9 != -1; local9 = arg0.indexOf(arg2, local9 + arg1.length())) {
			arg0 = arg0.substring(0, local9) + arg1 + arg0.substring(local9 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String getWebsiteUrl() {
		@Pc(7) String local7 = "www";
		if (client.modeWhere == ModeWhere.aClass127_8) {
			local7 = "www-wtrc";
		} else if (client.modeWhere == ModeWhere.aClass127_1) {
			local7 = "www-wtqa";
		} else if (ModeWhere.aClass127_2 == client.modeWhere) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (client.settings != null) {
			local28 = "/p=" + client.settings;
		}
		return "http://" + local7 + "." + client.game.name + ".com/l=" + client.language + "/a=" + client.affiliate + local28 + "/";
	}
}
