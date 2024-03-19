import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!vq", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(II)Lclient!wp;")
	public static Class1_Sub1_Sub21 method6021(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub21 local12 = (Class1_Sub1_Sub21) Static159.aClass215_63.method6057((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(24) byte[] local24 = Static15.aClass162_30.method4636(arg0, 26);
		local12 = new Class1_Sub1_Sub21();
		if (local24 != null) {
			local12.method6161(new Class1_Sub16(local24));
		}
		Static159.aClass215_63.method6050(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IJ)V")
	public static void method6022(@OriginalArg(1) long arg0) {
		if (Static241.aClass154ArrayArrayArray2 != null) {
			if (Static303.anInt6342 == 1 || Static303.anInt6342 == 5) {
				Static330.method5790(arg0);
			} else if (Static303.anInt6342 == 4) {
				Static342.method6040(arg0);
			}
		}
		Static79.method3956((long) Static197.anInt4521, Static221.aClass40_6);
		if (Static295.anInt6177 != -1) {
			Static219.method4285(Static295.anInt6177);
		}
		for (@Pc(42) int local42 = 0; local42 < Static266.anInt5654; local42++) {
			if (Static230.aBooleanArray16[local42]) {
				Static31.aBooleanArray2[local42] = true;
			}
			Static323.aBooleanArray26[local42] = Static230.aBooleanArray16[local42];
			Static230.aBooleanArray16[local42] = false;
		}
		Static234.anInt5226 = Static197.anInt4521;
		if (Static221.aClass40_6.method2767()) {
			Static38.aBoolean74 = true;
		}
		Static122.aClass177_8 = null;
		if (Static295.anInt6177 != -1) {
			Static266.anInt5654 = 0;
			Static68.method1589();
		}
		Static221.aClass40_6.method2788();
		Static15.method446(Static221.aClass40_6);
		@Pc(95) int local95 = Static100.method3991();
		if (local95 == -1) {
			local95 = Static77.anInt2093;
		}
		Static50.method1357(local95);
		Static255.method4690(Static39.anInt1215, Static55.anInt1622, Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032, Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027);
		Static55.anInt1622 = 0;
	}

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "(II)V")
	public static void method6024(@OriginalArg(0) int arg0) {
		Static236.method4501();
		Static202.method4037();
		Static209.method4129(arg0, true);
		Static186.method3744(Static203.aClass162_47, Static251.aClass162_194, Static221.aClass40_6);
		Static264.method4778(Static221.aClass40_6, Static203.aClass162_47);
		Static210.method4144(Static316.aClass29Array15);
		Static84.method1870();
		Static102.method2127();
		if (Static214.anInt4865 == 10) {
			Static76.method1751(false);
		} else if (Static214.anInt4865 == 30) {
			Static276.method4934(25);
		} else if (Static214.anInt4865 == 5) {
			Static157.method3355(Static221.aClass40_6, Static203.aClass162_47);
			return;
		}
	}

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "(B)V")
	public static void method6025() {
		for (@Pc(10) Class1_Sub35 local10 = (Class1_Sub35) Static135.aClass183_33.method5052(); local10 != null; local10 = (Class1_Sub35) Static135.aClass183_33.method5050()) {
			@Pc(15) int local15 = local10.anInt6079;
			if (Static199.method3942(local15)) {
				@Pc(21) boolean local21 = true;
				@Pc(25) Class177[] local25 = Class1_Sub2_Sub10.lb[local15];
				for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
					if (local25[local27] != null) {
						local21 = local25[local27].aBoolean404;
						break;
					}
				}
				if (!local21) {
					@Pc(55) int local55 = (int) local10.aLong235;
					@Pc(59) Class177 local59 = Static298.method5252(local55);
					if (local59 != null) {
						Static145.method3188(local59);
					}
				}
			}
		}
	}
}
