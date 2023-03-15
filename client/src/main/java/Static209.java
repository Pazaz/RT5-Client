import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!wm;Lclient!ci;)V")
	public static void method3714(@OriginalArg(1) TextureProvider arg0, @OriginalArg(2) TextureProviderInterface arg1) {
		if (MapList.aClass2_Sub2_Sub17_3 == null) {
			return;
		}
		if (WorldMap.loadPercentage < 10) {
			if (!MapList.aClass197_85.isGroupReady(MapList.aClass2_Sub2_Sub17_3.aString67)) {
				WorldMap.loadPercentage = client.jsArchive23.getPercentageComplete(MapList.aClass2_Sub2_Sub17_3.aString67) / 10;
				return;
			}
			Static386.method6031();
			WorldMap.loadPercentage = 10;
		}
		if (WorldMap.loadPercentage == 10) {
			MapList.anInt6057 = MapList.aClass2_Sub2_Sub17_3.anInt6870 >> 6 << 6;
			MapList.anInt6055 = MapList.aClass2_Sub2_Sub17_3.anInt6863 >> 6 << 6;
			MapList.anInt6056 = (MapList.aClass2_Sub2_Sub17_3.anInt6868 >> 6 << 6) + 64 - MapList.anInt6057;
			MapList.anInt6052 = (MapList.aClass2_Sub2_Sub17_3.anInt6874 >> 6 << 6) + 64 - MapList.anInt6055;
			@Pc(80) int[] local80 = new int[3];
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = -1;
			if (MapList.aClass2_Sub2_Sub17_3.method6145(PlayerList.self.plane, local80, Camera.originX + (PlayerList.self.xFine >> 7), Camera.originZ + (PlayerList.self.zFine >> 7))) {
				local82 = local80[1] - MapList.anInt6057;
				local84 = local80[2] - MapList.anInt6055;
			}
			if (!Static299.aBoolean399 && local82 >= 0 && MapList.anInt6056 > local82 && local84 >= 0 && MapList.anInt6052 > local84) {
				local84 += (int) (Math.random() * 10.0D) - 5;
				local82 += (int) (Math.random() * 10.0D) - 5;
				WorldMap.anInt2003 = local84;
				WorldMap.anInt2772 = local82;
			} else if (Static184.anInt3436 == -1 || Static18.anInt519 == -1) {
				MapList.aClass2_Sub2_Sub17_3.method6151(MapList.aClass2_Sub2_Sub17_3.anInt6872 >> 14 & 0x3FFF, MapList.aClass2_Sub2_Sub17_3.anInt6872 & 0x3FFF, local80);
				WorldMap.anInt2003 = local80[2] - MapList.anInt6055;
				WorldMap.anInt2772 = local80[1] - MapList.anInt6057;
			} else {
				MapList.aClass2_Sub2_Sub17_3.method6151(Static184.anInt3436, Static18.anInt519, local80);
				Static18.anInt519 = -1;
				Static184.anInt3436 = -1;
				Static299.aBoolean399 = false;
				if (local80 != null) {
					WorldMap.anInt2003 = local80[2] - MapList.anInt6055;
					WorldMap.anInt2772 = local80[1] - MapList.anInt6057;
				}
			}
			if (MapList.aClass2_Sub2_Sub17_3.anInt6875 == 37) {
				MapList.aFloat72 = 3.0F;
				MapList.aFloat73 = 3.0F;
			} else if (MapList.aClass2_Sub2_Sub17_3.anInt6875 == 50) {
				MapList.aFloat72 = 4.0F;
				MapList.aFloat73 = 4.0F;
			} else if (MapList.aClass2_Sub2_Sub17_3.anInt6875 == 75) {
				MapList.aFloat72 = 6.0F;
				MapList.aFloat73 = 6.0F;
			} else if (MapList.aClass2_Sub2_Sub17_3.anInt6875 == 100) {
				MapList.aFloat72 = 8.0F;
				MapList.aFloat73 = 8.0F;
			} else if (MapList.aClass2_Sub2_Sub17_3.anInt6875 == 200) {
				MapList.aFloat72 = 16.0F;
				MapList.aFloat73 = 16.0F;
			} else {
				MapList.aFloat72 = 8.0F;
				MapList.aFloat73 = 8.0F;
			}
			MapList.anInt6047 = (int) MapList.aFloat72 >> 1;
			MapList.aByteArrayArrayArray15 = Static260.method6018(MapList.anInt6047);
			Static298.method2422();
			MapList.method5519();
			Static197.aClass135_24 = new LinkedList();
			MapList.anInt6048 += (int) (Math.random() * 5.0D) - 2;
			if (MapList.anInt6048 < -8) {
				MapList.anInt6048 = -8;
			}
			MapList.anInt6049 += (int) (Math.random() * 5.0D) - 2;
			if (MapList.anInt6048 > 8) {
				MapList.anInt6048 = 8;
			}
			if (MapList.anInt6049 < -16) {
				MapList.anInt6049 = -16;
			}
			if (MapList.anInt6049 > 16) {
				MapList.anInt6049 = 16;
			}
			MapList.method5528(arg1, MapList.anInt6048 >> 2 << 10, MapList.anInt6049 >> 1);
			MapList.aClass125_4.method3377(256, 1024);
			MapList.aClass104_4.method2702(256, 256);
			MapList.aClass202_3.method5161(4096);
			client.VarbitTypes.method3392(256);
			WorldMap.loadPercentage = 20;
		} else if (WorldMap.loadPercentage == 20) {
			Protocol.method2973(true);
			MapList.method5521(arg0, MapList.anInt6048, MapList.anInt6049);
			WorldMap.loadPercentage = 60;
			Protocol.method2973(true);
			GameShell.resetTimer();
		} else if (WorldMap.loadPercentage == 60) {
			if (MapList.aClass197_85.isGroupNameValid(MapList.aClass2_Sub2_Sub17_3.aString67 + "_staticelements")) {
				if (!MapList.aClass197_85.isGroupReady(MapList.aClass2_Sub2_Sub17_3.aString67 + "_staticelements")) {
					return;
				}
				MapList.aClass103_5 = Static317.method5552(MapList.aClass197_85, MapList.aClass2_Sub2_Sub17_3.aString67 + "_staticelements", LoginManager.mapMembers);
			} else {
				MapList.aClass103_5 = new Class103(0);
			}
			MapList.method5511();
			WorldMap.loadPercentage = 70;
			Protocol.method2973(true);
			GameShell.resetTimer();
		} else if (WorldMap.loadPercentage == 70) {
			Static74.aClass113_4 = new Class113(arg0, 11, true, GameShell.canvas);
			WorldMap.loadPercentage = 73;
			Protocol.method2973(true);
			GameShell.resetTimer();
		} else if (WorldMap.loadPercentage == 73) {
			Static107.aClass113_5 = new Class113(arg0, 12, true, GameShell.canvas);
			WorldMap.loadPercentage = 76;
			Protocol.method2973(true);
			GameShell.resetTimer();
		} else if (WorldMap.loadPercentage == 76) {
			Static2.aClass113_1 = new Class113(arg0, 14, true, GameShell.canvas);
			WorldMap.loadPercentage = 79;
			Protocol.method2973(true);
			GameShell.resetTimer();
		} else if (WorldMap.loadPercentage == 79) {
			Static175.aClass113_6 = new Class113(arg0, 17, true, GameShell.canvas);
			WorldMap.loadPercentage = 82;
			Protocol.method2973(true);
			GameShell.resetTimer();
		} else if (WorldMap.loadPercentage == 82) {
			Static249.aClass113_8 = new Class113(arg0, 19, true, GameShell.canvas);
			WorldMap.loadPercentage = 85;
			Protocol.method2973(true);
			GameShell.resetTimer();
		} else if (WorldMap.loadPercentage == 85) {
			Static30.aClass113_3 = new Class113(arg0, 22, true, GameShell.canvas);
			WorldMap.loadPercentage = 88;
			Protocol.method2973(true);
			GameShell.resetTimer();
		} else if (WorldMap.loadPercentage == 88) {
			Static27.aClass113_2 = new Class113(arg0, 26, true, GameShell.canvas);
			WorldMap.loadPercentage = 91;
			Protocol.method2973(true);
			GameShell.resetTimer();
		} else {
			Static369.aClass113_9 = new Class113(arg0, 30, true, GameShell.canvas);
			WorldMap.loadPercentage = 100;
			Protocol.method2973(true);
			GameShell.resetTimer();
			System.gc();
		}
	}
}
