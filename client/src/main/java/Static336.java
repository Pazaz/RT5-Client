import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "Lclient!r;")
	public static Class197 aClass197_90;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "Lclient!vq;")
	public static Class241 aClass241_5;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "Lclient!h;")
	public static final Class89 aClass89_225 = new Class89(45, 1);

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_130 = new Class79("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
	public static int anInt6313 = 0;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(IB)V")
	public static void method5705(@OriginalArg(0) int arg0) {
		if (LoginManager.reconnecting == arg0) {
			return;
		}
		if (LoginManager.reconnecting == 0) {
			Static103.method2177();
		}
		if (arg0 == 40) {
			Static230.method4014();
		}
		if (arg0 != 40 && Static246.aClass111_2 != null) {
			Static246.aClass111_2.close();
			Static246.aClass111_2 = null;
		}
		if (LoginManager.reconnecting == 25 || LoginManager.reconnecting == 28) {
			client.jsArchive2.anInt5558 = 2;
			client.jsArchive17.anInt5558 = 2;
			client.jsArchive16.anInt5558 = 2;
			client.jsArchive18.anInt5558 = 2;
			client.jsArchive19.anInt5558 = 2;
			client.jsArchive20.anInt5558 = 2;
			client.jsArchive21.anInt5558 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static305.anInt5742 = 0;
			Static144.anInt2694 = 0;
			Static65.anInt1588 = 1;
			Static246.anInt4505 = 0;
			Static190.anInt3541 = 1;
			Static241.method4192(true);
			client.jsArchive2.anInt5558 = 1;
			client.jsArchive17.anInt5558 = 1;
			client.jsArchive16.anInt5558 = 1;
			client.jsArchive18.anInt5558 = 1;
			client.jsArchive19.anInt5558 = 1;
			client.jsArchive20.anInt5558 = 1;
			client.jsArchive21.anInt5558 = 1;
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
		@Pc(165) boolean local165 = LoginManager.reconnecting == 5 || LoginManager.reconnecting == 10 || LoginManager.reconnecting == 28;
		if (local146 != local165) {
			if (local146) {
				Static171.anInt3268 = Static97.anInt2049;
				if (client.preferences.anInt4889 == 0) {
					Static174.method1507();
				} else {
					Static249.method4150(client.preferences.anInt4889, client.jsArchive6, Static97.anInt2049);
				}
				Static287.js5NetQueue.method4647(false);
			} else {
				Static174.method1507();
				Static287.js5NetQueue.method4647(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static190.aClass19_8.method2804();
		}
		LoginManager.reconnecting = arg0;
	}
}
