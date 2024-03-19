import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!nr;")
	public static Class40 aClass40_9;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Lclient!qj;")
	public static Class162 aClass162_237;

	@OriginalMember(owner = "client!we", name = "v", descriptor = "Lclient!qa;")
	public static Class29 aClass29_24;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	public static int anInt7238 = 0;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "I")
	public static int anInt7239 = 0;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray45 = null;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ro;I)Z")
	public static boolean method6049(@OriginalArg(0) Class177 arg0) {
		if (arg0.anInt5819 == 205) {
			Static43.anInt1466 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	public static void method6053() {
		@Pc(17) int local17;
		for (@Pc(8) int local8 = -1; local8 < Static329.anInt6733; local8++) {
			if (local8 == -1) {
				local17 = 2047;
			} else {
				local17 = Static238.anIntArray389[local8];
			}
			@Pc(25) Class7_Sub1_Sub1_Sub2 local25 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local17];
			if (local25 != null && local25.anInt7072 > 0) {
				local25.anInt7072--;
				if (local25.anInt7072 == 0) {
					local25.aString265 = null;
				}
			}
		}
		for (local17 = 0; local17 < Static49.anInt1559; local17++) {
			@Pc(61) int local61 = Static185.anIntArray309[local17];
			@Pc(65) Class7_Sub1_Sub1_Sub1 local65 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local61];
			if (local65 != null && local65.anInt7072 > 0) {
				local65.anInt7072--;
				if (local65.anInt7072 == 0) {
					local65.aString265 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
	public static void method6056() {
		Static20.aClass215_11.method6060();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)C")
	public static char method6059(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(43) char local43 = Static259.aCharArray15[local12 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local12 = local43;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method6064(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static186.anInt4356; local11++) {
			if (arg0.equalsIgnoreCase(Static19.aStringArray5[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static347.aStringArray43[local11])) {
				return true;
			}
		}
		return false;
	}
}
