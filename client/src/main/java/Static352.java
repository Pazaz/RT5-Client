import java.awt.Container;
import java.awt.Insets;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "[Lclient!jd;")
	public static Sprite[] aClass13Array25;

	@OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
	public static int anInt6519;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_9 = new Class36();

	@OriginalMember(owner = "client!uh", name = "V", descriptor = "J")
	public static long aLong202 = -1L;

	@OriginalMember(owner = "client!uh", name = "W", descriptor = "Z")
	public static boolean aBoolean446 = false;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method5877() {
		if (GameShell.fullScreenFrame != null) {
			return;
		}
		@Pc(13) Container local13;
		if (GameShell.frame == null) {
			local13 = GameShell.signlink.applet;
		} else {
			local13 = GameShell.frame;
		}
		GameShell.frameWidth = local13.getSize().width;
		GameShell.frameHeight = local13.getSize().height;
		@Pc(31) Insets local31;
		if (local13 == GameShell.frame) {
			local31 = GameShell.frame.getInsets();
			GameShell.frameHeight -= local31.bottom + local31.top;
			GameShell.frameWidth -= local31.right + local31.left;
		}
		if (DisplayMode.getWindowMode() == 1) {
			GameShell.canvasHeight = client.gameHeight;
			GameShell.canvasWidth = client.gameWidth;
			GameShell.topMargin = 0;
			GameShell.leftMargin = (GameShell.frameWidth - client.gameWidth) / 2;
		} else if (GameShell.maxMemory < 96 && Static77.anInt1762 == 0) {
			@Pc(70) int local70 = GameShell.frameWidth > 1024 ? 1024 : GameShell.frameWidth;
			@Pc(79) int local79 = GameShell.frameHeight > 768 ? 768 : GameShell.frameHeight;
			GameShell.canvasWidth = local70;
			GameShell.leftMargin = (GameShell.frameWidth - local70) / 2;
			GameShell.topMargin = 0;
			GameShell.canvasHeight = local79;
		} else {
			GameShell.canvasHeight = GameShell.frameHeight;
			GameShell.canvasWidth = GameShell.frameWidth;
			GameShell.topMargin = 0;
			GameShell.leftMargin = 0;
		}
		if (ModeWhere.MODE_WHERE_LIVE != client.modeWhere) {
			@Pc(130) boolean local130;
			if (GameShell.canvasWidth < 1024 && GameShell.canvasHeight < 768) {
				local130 = true;
			} else {
				local130 = false;
			}
		}
		GameShell.canvas.setSize(GameShell.canvasWidth, GameShell.canvasHeight);
		if (Rasteriser.instance != null) {
			Rasteriser.instance.method2803();
		}
		if (local13 == GameShell.frame) {
			local31 = GameShell.frame.getInsets();
			GameShell.canvas.setLocation(GameShell.leftMargin + local31.left, local31.top - -GameShell.topMargin);
		} else {
			GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
		}
		if (Static139.topLevelInterface != -1) {
			Static60.method891(true);
		}
		Static372.method6260();
	}

}
