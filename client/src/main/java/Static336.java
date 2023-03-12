import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "Lclient!r;")
	public static Js5 aClass197_90;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "Lclient!vq;")
	public static Class241 aClass241_5;

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_130 = new LocalizedString("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
	public static int anInt6313 = 0;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(IB)V")
	public static void method5705(@OriginalArg(0) int arg0) {
		if (client.gameState == arg0) {
			return;
		}
		if (client.gameState == 0) {
			Static103.method2177();
		}
		if (arg0 == 40) {
			Static230.method4014();
		}
		if (arg0 != 40 && Static246.aClass111_2 != null) {
			Static246.aClass111_2.close();
			Static246.aClass111_2 = null;
		}
		if (client.gameState == 25 || client.gameState == 28) {
			client.jsArchive2.discardUnpacked = 2;
			client.jsArchive17.discardUnpacked = 2;
			client.jsArchive16.discardUnpacked = 2;
			client.jsArchive18.discardUnpacked = 2;
			client.jsArchive19.discardUnpacked = 2;
			client.jsArchive20.discardUnpacked = 2;
			client.jsArchive21.discardUnpacked = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static305.anInt5742 = 0;
			Static144.anInt2694 = 0;
			Static65.anInt1588 = 1;
			Static246.anInt4505 = 0;
			Static190.anInt3541 = 1;
			Static241.method4192(true);
			client.jsArchive2.discardUnpacked = 1;
			client.jsArchive17.discardUnpacked = 1;
			client.jsArchive16.discardUnpacked = 1;
			client.jsArchive18.discardUnpacked = 1;
			client.jsArchive19.discardUnpacked = 1;
			client.jsArchive20.discardUnpacked = 1;
			client.jsArchive21.discardUnpacked = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static322.method5485();
		}
		if (arg0 == 5) {
			Static348.method5830(client.jsArchive8, Static190.aClass19_8);
		} else {
			Static67.method1772();
		}
		@Pc(146) boolean local146 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(165) boolean local165 = client.gameState == 5 || client.gameState == 10 || client.gameState == 28;
		if (local146 != local165) {
			if (local146) {
				Static171.anInt3268 = MusicPlayer.titleSong;
				if (client.preferences.anInt4889 == 0) {
					Static174.method1507();
				} else {
					Static249.method4150(client.preferences.anInt4889, client.jsArchive6, MusicPlayer.titleSong);
				}
				client.js5NetQueue.writeLoggedIn(false);
			} else {
				Static174.method1507();
				client.js5NetQueue.writeLoggedIn(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static190.aClass19_8.method2804();
		}
		client.gameState = arg0;
	}
}
