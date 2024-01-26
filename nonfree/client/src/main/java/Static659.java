import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static659 {

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "F")
	public static float aFloat213;

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "I")
	public static int anInt9817 = 0;

	@OriginalMember(owner = "client!ut", name = "L", descriptor = "[I")
	public static final int[] anIntArray769 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)I")
	public static int method8604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 * 57 + arg1;
		@Pc(21) int local21 = local15 ^ local15 << 13;
		@Pc(35) int local35 = Integer.MAX_VALUE & local21 * (local21 * 15731 * local21 + 789221) + 1376312589;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "(B)Ljava/lang/String;")
	public static String method8605() {
		@Pc(15) String local15 = "www";
		if (Static2.aClass355_1 == Static704.aClass355_7) {
			local15 = "www-wtrc";
		} else if (Static2.aClass355_1 == Static713.aClass355_8) {
			local15 = "www-wtqa";
		} else if (Static2.aClass355_1 == Static425.aClass355_4) {
			local15 = "www-wtwip";
		}
		@Pc(44) String local44 = "";
		if (Static150.aString26 != null) {
			local44 = "/p=" + Static150.aString26;
		}
		return "http://" + local15 + "." + Static392.aClass377_4.aString114 + ".com/l=" + Static51.anInt1052 + "/a=" + Static323.anInt5121 + local44 + "/";
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(B)Lclient!ge;")
	public static Class2_Sub21 method8608() {
		@Pc(6) Class2_Sub21 local6 = Static570.method7552();
		local6.method7363(0L);
		local6.method7391(Static59.aString63);
		local6.method7363(Static430.aLong209);
		local6.method7363(Static571.aLong269);
		local6.method7385(Static374.aBigInteger2, Static262.aBigInteger1);
		return local6;
	}
}
