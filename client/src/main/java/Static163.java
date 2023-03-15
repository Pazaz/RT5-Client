import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!jj", name = "R", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_68 = new LocalizedString("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
	public static int anInt3086 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIIIZ)V")
	public static void method3100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg4) {
			Static335.method5694();
		}
		if (GameShell.fullScreenFrame != null && (arg3 != 3 || arg0 != client.preferences.fullScreenWidth || client.preferences.fullScreenHeight != arg1)) {
			Static17.method4215(GameShell.fullScreenFrame, GameShell.signlink);
			GameShell.fullScreenFrame = null;
		}
		if (arg3 == 3 && GameShell.fullScreenFrame == null) {
			GameShell.fullScreenFrame = Static5.method85(arg1, GameShell.signlink, arg0, 0);
			if (GameShell.fullScreenFrame != null) {
				client.preferences.fullScreenHeight = arg1;
				client.preferences.fullScreenWidth = arg0;
				client.preferences.write(GameShell.signlink);
			}
		}
		if (arg3 == 3 && GameShell.fullScreenFrame == null) {
			method3100(-1, -1, arg2, client.preferences.favoriteWorlds, true);
			return;
		}
		@Pc(81) Container local81;
		@Pc(88) Insets local88;
		if (GameShell.fullScreenFrame != null) {
			Static142.anInt2663 = arg0;
			Static178.anInt2319 = arg1;
			local81 = GameShell.fullScreenFrame;
		} else if (GameShell.frame == null) {
			local81 = GameShell.signlink.applet;
			Static142.anInt2663 = local81.getSize().width;
			Static178.anInt2319 = local81.getSize().height;
		} else {
			local88 = GameShell.frame.getInsets();
			@Pc(96) int local96 = local88.left + local88.right;
			Static142.anInt2663 = GameShell.frame.getSize().width - local96;
			Static178.anInt2319 = GameShell.frame.getSize().height - local88.bottom - local88.top;
			local81 = GameShell.frame;
		}
		@Pc(159) int local159;
		if (arg3 == 1) {
			Static84.anInt1842 = (Static142.anInt2663 - Static254.anInt4701) / 2;
			GameShell.canvasWidth = Static254.anInt4701;
			GameShell.canvasHeight = Static263.anInt4834;
			Static68.anInt1646 = 0;
		} else if (GameShell.maxMemory < 96 && Static77.anInt1762 == 0) {
			local159 = Static142.anInt2663 > 1024 ? 1024 : Static142.anInt2663;
			GameShell.canvasWidth = local159;
			@Pc(170) int local170 = Static178.anInt2319 <= 768 ? Static178.anInt2319 : 768;
			Static84.anInt1842 = (Static142.anInt2663 - local159) / 2;
			Static68.anInt1646 = 0;
			GameShell.canvasHeight = local170;
		} else {
			GameShell.canvasWidth = Static142.anInt2663;
			Static84.anInt1842 = 0;
			GameShell.canvasHeight = Static178.anInt2319;
			Static68.anInt1646 = 0;
		}
		if (client.MODE_WHERE_LIVE != client.modeWhere) {
			@Pc(206) boolean local206;
			if (GameShell.canvasWidth < 1024 && GameShell.canvasHeight < 768) {
				local206 = true;
			} else {
				local206 = false;
			}
		}
		if (arg4) {
			Static78.method5701(Static77.anInt1762);
		} else {
			GameShell.canvas.setSize(GameShell.canvasWidth, GameShell.canvasHeight);
			if (Rasteriser.textureProvider != null) {
				Rasteriser.textureProvider.method2803();
			}
			if (GameShell.frame == local81) {
				local88 = GameShell.frame.getInsets();
				GameShell.canvas.setLocation(Static84.anInt1842 + local88.left, local88.top + Static68.anInt1646);
			} else {
				GameShell.canvas.setLocation(Static84.anInt1842, Static68.anInt1646);
			}
		}
		if (arg3 >= 2) {
			Static363.aBoolean464 = true;
		} else {
			Static363.aBoolean464 = false;
		}
		if (Static139.anInt2595 != -1) {
			Static60.method891(true);
		}
		if (Protocol.socket != null && (client.gameState == 30 || client.gameState == 25)) {
			Protocol.method2002();
		}
		for (local159 = 0; local159 < 100; local159++) {
			Static357.aBooleanArray59[local159] = true;
		}
		Static328.aBoolean412 = true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!nk;)Ljava/lang/String;")
	public static String method3104(@OriginalArg(1) Class161 arg0) {
		if (Static45.method1404(arg0).getTargetMask() == 0) {
			return null;
		} else if (arg0.aString44 == null || arg0.aString44.trim().length() == 0) {
			return Static18.qa_op_test ? "Hidden-use" : null;
		} else {
			return arg0.aString44;
		}
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V")
	public static void method3105() {
		if (Static3.aBoolean5) {
			return;
		}
		Static175.method3325(Scene.aClass67ArrayArrayArray5);
		if (Scene.aClass67ArrayArrayArray4 != null) {
			Static175.method3325(Scene.aClass67ArrayArrayArray4);
		}
		Static3.aBoolean5 = true;
	}
}
