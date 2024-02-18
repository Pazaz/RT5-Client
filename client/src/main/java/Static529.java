import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!qla", name = "a", descriptor = "Lclient!hf;")
	public static Class161 aClass161_1;

	@OriginalMember(owner = "client!qla", name = "d", descriptor = "I")
	public static int anInt8089 = -1;

	@OriginalMember(owner = "client!qla", name = "a", descriptor = "(ZB)Z")
	public static boolean method7094(@OriginalArg(1) byte arg0) {
		@Pc(16) int local16 = arg0 & 0xFF;
		if (local16 == 0) {
			return false;
		} else {
			return local16 < 128 || local16 >= 160 || Static376.aCharArray7[local16 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!qla", name = "a", descriptor = "(ILclient!sb;Lclient!vq;)V")
	public static void method7096(@OriginalArg(1) Class330 arg0, @OriginalArg(2) Class390 arg1) {
		Static442.aClass330_90 = arg0;
		Static185.aString34 = "";
		Static93.aClass390_1 = arg1;
		if (Class254.aString70.startsWith("win")) {
			Static185.aString34 = Static185.aString34 + "windows/";
		} else if (Class254.aString70.startsWith("linux")) {
			Static185.aString34 = Static185.aString34 + "linux/";
		} else if (Class254.aString70.startsWith("mac")) {
			Static185.aString34 = Static185.aString34 + "macos/";
		}
		if (Static93.aClass390_1.aBoolean779) {
			Static185.aString34 = Static185.aString34 + "msjava/";
		} else if (Class254.aString69.startsWith("amd64") || Class254.aString69.startsWith("x86_64")) {
			Static185.aString34 = Static185.aString34 + "x86_64/";
		} else if (Class254.aString69.startsWith("i386") || Class254.aString69.startsWith("i486") || Class254.aString69.startsWith("i586") || Class254.aString69.startsWith("x86")) {
			Static185.aString34 = Static185.aString34 + "x86/";
		} else if (Class254.aString69.startsWith("ppc")) {
			Static185.aString34 = Static185.aString34 + "ppc/";
		} else {
			Static185.aString34 = Static185.aString34 + "universal/";
		}
	}
}
