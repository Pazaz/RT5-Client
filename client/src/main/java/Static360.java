import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
	public static int anInt5820;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "Lclient!hw;")
	public static final Class172 aClass172_3 = new Class172();

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(II)Z")
	public static boolean method5230(@OriginalArg(0) int arg0) {
		if (Static5.anInt92 != arg0 || Static178.aClass247_1 == null) {
			Static298.method4385();
			Static5.anInt92 = arg0;
			Static178.aClass247_1 = Static403.aClass247_2;
		}
		@Pc(53) int local53;
		if (Static403.aClass247_2 == Static178.aClass247_1) {
			@Pc(36) byte[] local36 = Static504.aClass330_95.method7589(arg0);
			if (local36 == null) {
				return false;
			}
			@Pc(46) Class2_Sub21 local46 = new Class2_Sub21(local36);
			Static12.method5164(local46);
			local53 = local46.method7396();
			for (@Pc(55) int local55 = 0; local55 < local53; local55++) {
				Static391.aClass339_34.method7711(new Class2_Sub35(local46));
			}
			@Pc(78) int local78 = local46.method7390();
			Static75.aClass357Array2 = new Class357[local78];
			for (@Pc(83) int local83 = 0; local83 < local78; local83++) {
				Static75.aClass357Array2[local83] = new Class357(local46);
			}
			@Pc(108) int local108 = local46.method7390();
			Static219.aClass236Array1 = new Class236[local108];
			for (@Pc(113) int local113 = 0; local113 < local108; local113++) {
				Static219.aClass236Array1[local113] = new Class236(local46, local113);
			}
			@Pc(139) int local139 = local46.method7390();
			Static507.aClass394Array1 = new Class394[local139];
			for (@Pc(144) int local144 = 0; local144 < local139; local144++) {
				Static507.aClass394Array1[local144] = new Class394(local46);
			}
			@Pc(169) int local169 = local46.method7390();
			Static183.aClass231Array1 = new Class231[local169];
			for (@Pc(174) int local174 = 0; local174 < local169; local174++) {
				Static183.aClass231Array1[local174] = new Class231(local46);
			}
			@Pc(195) int local195 = local46.method7390();
			Static401.aClass39Array1 = new Class39[local195];
			for (@Pc(200) int local200 = 0; local200 < local195; local200++) {
				Static401.aClass39Array1[local200] = Static235.method3425(local46);
			}
			Static178.aClass247_1 = Static403.aClass247_3;
		}
		if (Static178.aClass247_1 == Static403.aClass247_3) {
			@Pc(227) boolean local227 = true;
			@Pc(229) Class39[] local229 = Static401.aClass39Array1;
			for (local53 = 0; local53 < local229.length; local53++) {
				@Pc(237) Class39 local237 = local229[local53];
				if (!local237.method9158()) {
					local227 = false;
				}
			}
			if (!local227) {
				return false;
			}
			Static178.aClass247_1 = Static403.aClass247_4;
		}
		return true;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ca;IZBI)V")
	public static void method5232(@OriginalArg(0) Class8_Sub2_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray879[0];
		@Pc(15) int local15 = arg0.anIntArray878[0];
		if (local10 < 0 || local10 >= Static720.anInt10859 || local15 < 0 || Static501.anInt7568 <= local15 || (arg1 < 0 || arg1 >= Static720.anInt10859 || arg2 < 0 || Static501.anInt7568 <= arg2)) {
			return;
		}
		@Pc(76) int local76 = Static521.method6870(arg2, arg0.method9302((byte) 65), true, 0, local10, 0, Static480.anIntArray583, 0, local15, -4, Static577.aClass110Array1[arg0.aByte144], Static70.anIntArray147, arg1, 0);
		if (local76 >= 1 && local76 <= 3) {
			for (@Pc(92) int local92 = 0; local92 < local76 - 1; local92++) {
				arg0.method1418(Static480.anIntArray583[local92], Static70.anIntArray147[local92], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method5233(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static32.aClass32_33.method877(Static51.anInt1052) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static32.aClass32_35.method877(Static51.anInt1052) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
