import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public static int anInt3777;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!jd;")
	public static Sprite aClass13_13;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!cc;")
	public static PrivilegedRequest js5SocketRequest;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	public static int anInt3780;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	public static void method3721() {
		client.FloTypes.method2103();
		client.FluTypes.method6270();
		client.IdkTypes.method1782();
		client.LocTypes.method5159();
		client.NpcTypes.method5571();
		client.ObjTypes.method2761();
		client.SeqTypes.method2373();
		client.SpotAnimTypes.method5410();
		client.VarbitTypes.method3395();
		client.VarpTypes.method5108();
		client.BasTypes.method241();
		client.MsiType.method2707();
		client.aClass125_1.method3380();
		client.aClass233_1.method5881();
		client.ParamTypes.method563();
		client.aClass213_1.method5426();
		client.aClass160_1.method4033();
		client.LightTypes.method4885();
		client.aClass150_3.method3733();
		client.StructTypes.method3475();
		Static140.method2627();
		Static91.method1962();
		Static71.method6021();
		if (client.MODE_WHERE_LIVE != client.modeWhere) {
			for (@Pc(80) int local80 = 0; local80 < Static26.aByteArrayArray3.length; local80++) {
				Static26.aByteArrayArray3[local80] = null;
			}
			Static50.anInt1332 = 0;
		}
		Static286.method4921();
		Static273.method4627();
		Static369.method6217();
		Static192.method3508();
		Static161.method2969();
		Static198.aClass98_30.method2614();
		Static190.aClass19_8.method2903();
		Static261.aClass116_7.method3153();
		Static194.method3541();
		client.jsArchive0.discardUnpacked();
		client.jsArchive1.discardUnpacked();
		client.jsArchive2.discardUnpacked();
		client.jsArchive3.discardUnpacked();
		client.jsArchive4.discardUnpacked();
		client.jsArchive5.discardUnpacked();
		client.jsArchive6.discardUnpacked();
		client.jsArchive7.discardUnpacked();
		client.jsArchive8.discardUnpacked();
		client.jsArchive9.discardUnpacked();
		client.jsArchive10.discardUnpacked();
		client.jsArchive11.discardUnpacked();
		client.jsArchive12.discardUnpacked();
		client.jsArchive13.discardUnpacked();
		client.jsArchive14.discardUnpacked();
		client.jsArchive15.discardUnpacked();
		client.jsArchive16.discardUnpacked();
		client.jsArchive17.discardUnpacked();
		client.jsArchive18.discardUnpacked();
		client.jsArchive19.discardUnpacked();
		client.jsArchive20.discardUnpacked();
		client.jsArchive21.discardUnpacked();
		client.jsArchive22.discardUnpacked();
		client.jsArchive23.discardUnpacked();
		client.jsArchive24.discardUnpacked();
		client.jsArchive25.discardUnpacked();
		client.jsArchive26.discardUnpacked();
		client.jsArchive27.discardUnpacked();
		client.jsArchive28.discardUnpacked();
		Static306.aClass98_49.method2614();
		Static139.aClass98_18.method2614();
		Static61.aClass98_5.method2614();
		Static210.aClass98_31.method2614();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	public static void method3722(@OriginalArg(1) int arg0) {
		Static77.anInt1763 = -1;
		if (arg0 == 37) {
			Static344.aFloat73 = 3.0F;
		} else if (arg0 == 50) {
			Static344.aFloat73 = 4.0F;
		} else if (arg0 == 75) {
			Static344.aFloat73 = 6.0F;
		} else if (arg0 == 100) {
			Static344.aFloat73 = 8.0F;
		} else if (arg0 == 200) {
			Static344.aFloat73 = 16.0F;
		}
		Static77.anInt1763 = -1;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
	public static void method3725() {
		if (Static86.anInt1870 > 0) {
			LoginManager.logout();
		} else {
			Static246.aClass111_2 = Protocol.socket;
			Protocol.socket = null;
			Static336.method5705(40);
		}
	}
}
