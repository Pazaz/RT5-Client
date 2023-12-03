import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
	public static int anInt5359;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "[I")
	public static final int[] anIntArray367 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_7 = new Class36();

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	public static int anInt5362 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!ci;IIIILclient!wm;)V")
	public static void method4881(@OriginalArg(1) TextureProviderInterface arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) RasteriserBase arg5) {
		if (WorldMap.loadPercentage < 100) {
			Static209.method3714(arg5, arg0);
		}
		arg5.method2895(arg4, arg2, arg4 + arg3, arg2 - -arg1);
		@Pc(36) int local36;
		@Pc(47) int local47;
		if (WorldMap.loadPercentage < 100) {
			local36 = arg3 / 2 + arg4;
			local47 = arg1 / 2 + arg2 - 18 - 20;
			arg5.method2901(arg4, arg2, arg3, arg1, -16777216, 0);
			arg5.method2836(local36 - 152, local47, 304, 34, Static291.aColorArray4[client.gameId].getRGB(), 0);
			arg5.method2901(local36 - 150, local47 - -2, WorldMap.loadPercentage * 3, 30, Static174.aColorArray2[client.gameId].getRGB(), 0);
			Static52.aClass130_1.method5900(Static32.aClass79_21.getLocalized(client.language), -1, local47 + 20, Static286.aColorArray3[client.gameId].getRGB(), local36);
			return;
		}
		@Pc(111) int local111 = WorldMap.anInt2772 - (int) ((float) arg3 / MapList.aFloat72);
		local36 = (int) ((float) arg1 / MapList.aFloat72) + WorldMap.anInt2003;
		local47 = (int) ((float) arg3 / MapList.aFloat72) + WorldMap.anInt2772;
		WorldMap.anInt6930 = (int) ((float) (arg1 * 2) / MapList.aFloat72);
		Static21.anInt548 = WorldMap.anInt2003 - (int) ((float) arg1 / MapList.aFloat72);
		WorldMap.anInt1105 = (int) ((float) (arg3 * 2) / MapList.aFloat72);
		@Pc(160) int local160 = WorldMap.anInt2003 - (int) ((float) arg1 / MapList.aFloat72);
		Static178.anInt2317 = WorldMap.anInt2772 - (int) ((float) arg3 / MapList.aFloat72);
		MapList.method5530(local111 + WorldMap.originX, local36 - -WorldMap.originZ, WorldMap.originX + local47, WorldMap.originZ + local160, arg4, arg2, arg3 + arg4, arg2 - (-arg1 - 1));
		MapList.method5522(arg5);
		@Pc(203) LinkedList local203 = MapList.method5524(arg5);
		Static303.method5208(local203, arg5);
		if (Static243.anInt4495 > 0) {
			Static90.anInt6637--;
			if (Static90.anInt6637 == 0) {
				Static90.anInt6637 = 20;
				Static243.anInt4495--;
			}
		}
		if (!Cheat.displayfps) {
			return;
		}
		@Pc(237) int local237 = arg3 + arg4 - 5;
		@Pc(243) int local243 = arg1 + arg2 - 8;
		Static276.aClass130_4.method5898(local237, local243, "Fps:" + Static3.anInt62, 16776960);
		@Pc(258) int local258 = local243 - 15;
		@Pc(260) Runtime local260 = Runtime.getRuntime();
		@Pc(270) int local270 = (int) ((local260.totalMemory() - local260.freeMemory()) / 1024L);
		@Pc(272) int local272 = 16776960;
		if (local270 > 65536) {
			local272 = 16711680;
		}
		Static276.aClass130_4.method5898(local237, local258, "Mem:" + local270 + "k", local272);
		local243 = local258 - 15;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)Z")
	public static boolean setBloomEnabled(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Rasteriser.instance.method2892();
		if (arg0 == local11) {
			return true;
		}
		if (!arg0) {
			Rasteriser.instance.method2831();
		} else if (!Rasteriser.instance.method2847()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			client.preferences.bloomEnabled = arg0;
			client.preferences.write(GameShell.signlink);
			return true;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!nk;ZI)Ljava/lang/String;")
	public static String method4883(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1) {
		if (!InterfaceList.getServerActiveProperties(arg0).isButtonEnabled(arg1) && arg0.onOp == null) {
			return null;
		} else if (arg0.ops == null || arg1 >= arg0.ops.length || arg0.ops[arg1] == null || arg0.ops[arg1].trim().length() == 0) {
			return Static18.qa_op_test ? "Hidden-" + arg1 : null;
		} else {
			return arg0.ops[arg1];
		}
	}
}
