import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
	public static int anInt7265;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "[I")
	public static final int[] anIntArray585 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ak", name = "G", descriptor = "Z")
	public static volatile boolean aBoolean516 = false;

	@OriginalMember(owner = "client!ak", name = "I", descriptor = "Lclient!we;")
	public static Class215 aClass215_99 = new Class215(64);

	@OriginalMember(owner = "client!ak", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString269 = " has logged out.";

	@OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
	public static int anInt7274 = 0;

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V")
	public static void method6076() {
		if (Static112.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static108.anInt2685;
		@Pc(10) int local10 = Static88.anInt2337;
		@Pc(23) int local23 = Static264.anInt5603 - local8 - Static107.anInt2674;
		@Pc(30) int local30 = Static222.anInt5038 - Static350.anInt7318 - local10;
		if (local8 <= 0 && local23 <= 0 && local10 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(49) Container local49;
			if (Static252.aFrame2 == null) {
				local49 = Static184.aClass199_12.anApplet1;
			} else {
				local49 = Static252.aFrame2;
			}
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			if (local49 == Static252.aFrame2) {
				@Pc(63) Insets local63 = Static252.aFrame2.getInsets();
				local57 = local63.top;
				local55 = local63.left;
			}
			@Pc(72) Graphics local72 = local49.getGraphics();
			local72.setColor(Color.black);
			if (local8 > 0) {
				local72.fillRect(local55, local57, local8, Static222.anInt5038);
			}
			if (local10 > 0) {
				local72.fillRect(local55, local57, Static264.anInt5603, local10);
			}
			if (local23 > 0) {
				local72.fillRect(Static264.anInt5603 + local55 - local23, local57, local23, Static222.anInt5038);
			}
			if (local30 > 0) {
				local72.fillRect(local55, Static222.anInt5038 + local57 - local30, Static264.anInt5603, local30);
				return;
			}
		} catch (@Pc(122) Exception local122) {
			return;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
	public static void method6077(@OriginalArg(1) boolean arg0) {
		Static150.aClass1_Sub16_Sub2_2.method5793(91);
		for (@Pc(18) Class1_Sub35 local18 = (Class1_Sub35) Static135.aClass183_33.method5052(); local18 != null; local18 = (Class1_Sub35) Static135.aClass183_33.method5050()) {
			if (!local18.method6169()) {
				local18 = (Class1_Sub35) Static135.aClass183_33.method5052();
				if (local18 == null) {
					break;
				}
			}
			if (local18.anInt6078 == 0) {
				Static321.method5630(true, local18, arg0);
			}
		}
		if (Static262.aClass177_15 != null) {
			Static145.method3188(Static262.aClass177_15);
			Static262.aClass177_15 = null;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLclient!ro;)Lclient!ro;")
	public static Class177 method6084(@OriginalArg(1) Class177 arg0) {
		@Pc(14) Class177 local14 = Static37.method917(arg0);
		if (local14 == null) {
			local14 = arg0.aClass177_18;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!nr;I)V")
	public static void method6086(@OriginalArg(0) Class40 arg0) {
		if (Static237.anInt5285 < 2 && Static234.anInt5231 == 0 && !Static246.aBoolean472) {
			return;
		}
		@Pc(42) String local42;
		if (Static234.anInt5231 == 1 && Static237.anInt5285 < 2) {
			local42 = Static252.aString195 + Static319.aString252 + Static238.aString187 + " ->";
		} else if (Static246.aBoolean472 && Static237.anInt5285 < 2) {
			local42 = Static49.aString57 + Static319.aString252 + Static174.aString153 + " ->";
		} else if (Static326.aBoolean478 && Static345.aBooleanArray30[81] && Static237.anInt5285 > 2) {
			local42 = Static37.method928((Class1_Sub22) Static97.aClass130_9.aClass1_138.aClass1_248.aClass1_248);
		} else {
			@Pc(78) Class1_Sub22 local78 = (Class1_Sub22) Static97.aClass130_9.aClass1_138.aClass1_248;
			local42 = Static37.method928(local78);
			@Pc(86) int[] local86 = null;
			if (Static137.method3041(local78.anInt4308)) {
				local86 = Static165.method3446((int) local78.aLong126).anIntArray78;
			} else if (Static114.method5269(local78.anInt4308)) {
				@Pc(131) Class7_Sub1_Sub1_Sub1 local131 = Static84.aClass7_Sub1_Sub1_Sub1Array1[(int) local78.aLong126];
				if (local131 != null) {
					local86 = local131.aClass75_1.anIntArray157;
				}
			} else if (Static91.method1996(local78.anInt4308)) {
				if (local78.anInt4308 == 1009) {
					local86 = Static83.method1840((int) local78.aLong126).anIntArray471;
				} else {
					local86 = Static83.method1840((int) (local78.aLong126 >>> 32 & 0x7FFFFFFFL)).anIntArray471;
				}
			}
			if (local86 != null) {
				local42 = local42 + Static118.method2581(local86);
			}
		}
		if (Static237.anInt5285 > 2) {
			local42 = local42 + "<col=ffffff> / " + (Static237.anInt5285 - 2) + Static86.aString87;
		}
		if (Static302.aClass177_20 != null) {
			@Pc(230) Class30 local230 = Static302.aClass177_20.method4917(arg0);
			if (local230 == null) {
				local230 = Static150.aClass30_2;
			}
			local230.method4833(Static302.aClass177_20.anInt5816, Static302.aClass177_20.anInt5748, Static127.anInt3239, Static302.aClass177_20.anInt5803, local42, Static166.anInt4022, Static51.aRandom1, Static124.anIntArray227, Static302.aClass177_20.anInt5758, Static302.aClass177_20.anInt5765, Static294.anInt6162, Static302.aClass177_20.anInt5836, Static341.anIntArray582, Static265.aClass29Array12);
			Static16.method455(Static124.anIntArray227[0], Static124.anIntArray227[3], Static124.anIntArray227[1], Static124.anIntArray227[2]);
		} else if (Static120.aClass177_7 != null && Static199.anInt4559 == 0) {
			@Pc(211) int local211 = Static150.aClass30_2.method4843(Static51.aRandom1, Static294.anInt6162, Static139.anInt3447 + 4, Static265.aClass29Array12, Static351.anInt7329 + 16, local42, Static341.anIntArray582);
			Static16.method455(Static139.anInt3447 + 4, 16, Static351.anInt7329, Static140.aClass63_4.method1849(local42) + local211);
			return;
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(IBI)I")
	public static int method6087(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return local21 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!qj;I)V")
	public static void method6088(@OriginalArg(0) Class162 arg0) {
		Static110.aClass162_113 = arg0;
		Static110.aClass162_113.method4640(35);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V")
	public static void method6089(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(7, arg0);
		local8.method2536();
	}
}
