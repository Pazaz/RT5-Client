import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
	public static int anInt2095;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)Lclient!gq;")
	public static Class11_Sub1 method2143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static330.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_2;
	}

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "(I)V")
	public static void logout() {
		if (Protocol.socket != null) {
			Protocol.socket.close();
			Protocol.socket = null;
		}
		Static211.method3721();
		Static253.method4366();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static171.aClass46Array1[local17].method1626();
		}
		Static241.method4192(false);
		System.gc();
		Static174.method1507();
		Static393.aBoolean486 = false;
		Static171.anInt3268 = -1;
		Static239.method4152(true);
		Static164.anInt3140 = 0;
		Static9.anInt212 = 0;
		Static220.aBoolean252 = false;
		Static105.anInt2187 = 0;
		Static148.anInt2719 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static50.aClass84Array1.length; local56++) {
			Static50.aClass84Array1[local56] = null;
		}
		Static358.method5888();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static12.aClass11_Sub5_Sub2_Sub1Array1[local75] = null;
		}
		NpcList.size = 0;
		for (@Pc(91) int local91 = 0; local91 < 32768; local91++) {
			NpcList.npcs[local91] = null;
		}
		Static120.aClass4_49.method81();
		Static117.method2369();
		Protocol.verifyId = 0;
		Static214.aClass226_1.method5781();
		Static114.method2362();
		Static360.method5646();
		Static50.method1525(true);
		try {
			BrowserControl.call(GameShell.signlink.applet, "loggedout");
		} catch (@Pc(128) Throwable local128) {
		}
		Static375.aLong222 = 0L;
		Static385.aClass2_Sub16_2 = null;
	}

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "(I)V")
	public static void method2146() {
		Static65.aClass19_3.method2838(((float) client.preferences.anInt4879 * 0.1F + 0.7F) * 1.1523438F);
		Static65.aClass19_3.method2832(Static28.anInt686, 0.69921875F, 1.2F, -50.0F, (float) -60, -50.0F);
		Static65.aClass19_3.method2879(Static279.anInt5161, -1);
		Static65.aClass19_3.method2870(Static62.aClass42_5);
	}
}
