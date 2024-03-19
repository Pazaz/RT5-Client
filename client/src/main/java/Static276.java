import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V")
	public static void method4928() {
		Static6.method170();
		Static158.method3376();
		Static320.method5627();
		Static122.method2619();
		Static122.method2621();
		Static101.method2099();
		Static47.method1322();
		Static104.method2152();
		Static133.method3028();
		Static43.method1262();
		Static39.method961();
		Static239.method4517();
		Static54.method1388();
		Static86.method1932();
		Static228.method4359();
		Static17.method459();
		Static289.method4441();
		Static336.method5946();
		Static296.method5224();
		Static265.method4790();
		Static160.method6130();
		Static100.method3990();
		Static312.method5079();
		Static286.aClass215_85.method6052();
		Static43.aClass215_20.method6052();
		Static70.aClass215_29.method6052();
		Static213.aClass215_28.method6052();
		Static267.aClass215_80.method6052();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIZ)I")
	public static int method4931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class1_Sub14 local12 = (Class1_Sub14) Static143.aClass183_13.method5053((long) arg1);
		if (local12 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local12.anIntArray224.length; local20++) {
			if (local12.anIntArray224[local20] >= 0 && Static124.anInt3120 > local12.anIntArray224[local20]) {
				@Pc(47) Class36 local47 = Static165.method3446(local12.anIntArray224[local20]);
				@Pc(58) int local58 = local47.method957(Static231.method4389(arg0).anInt5129, arg0);
				if (arg2) {
					local18 += local12.anIntArray226[local20] * local58;
				} else {
					local18 += local58;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
	public static void method4933() {
		Static177.aClass130_26.method3754();
		for (@Pc(17) Class1_Sub22 local17 = (Class1_Sub22) Static97.aClass130_9.method3749(); local17 != null; local17 = (Class1_Sub22) Static97.aClass130_9.method3756()) {
			if (local17.anInt4308 < 1000) {
				local17.method6172();
				Static177.aClass130_26.method3760(local17);
			}
		}
		Static177.aClass130_26.method3751(Static97.aClass130_9);
		if (Static204.aClass177_13 != null || (Static158.aClass177_11 != null || Static161.anInt3962 > 0)) {
			return;
		}
		@Pc(56) int local56 = Static195.anInt4494;
		@Pc(65) int local65;
		if (!Static204.aBoolean329) {
			if (local56 == 1 && Static237.anInt5285 > 0) {
				local65 = ((Class1_Sub22) Static97.aClass130_9.aClass1_138.aClass1_248).anInt4308;
				if (local65 == 6 || local65 == 3 || local65 == 48 || local65 == 15 || local65 == 19 || local65 == 30 || local65 == 26 || local65 == 42 || local65 == 31 || local65 == 2 || local65 == 11 || local65 == 1012) {
					@Pc(325) Class1_Sub22 local325 = (Class1_Sub22) Static97.aClass130_9.aClass1_138.aClass1_248;
					@Pc(330) Class177 local330 = Static298.method5252(local325.anInt4307);
					@Pc(333) Class1_Sub39 local333 = Static37.method930(local330);
					if (local333.method5620()) {
						Static67.aBoolean11 = false;
						Static249.anInt5419 = 0;
						if (Static204.aClass177_13 != null) {
							Static145.method3188(Static204.aClass177_13);
						}
						Static204.aClass177_13 = Static298.method5252(local325.anInt4307);
						Static140.anInt3458 = Static121.anInt3045;
						Static228.anInt5098 = Static324.anInt6648;
						Static280.anInt5957 = local325.anInt4310;
						Static145.method3188(Static204.aClass177_13);
						return;
					}
				}
			}
			if (local56 <= 0 && Static314.anInt6504 > 0) {
				local56 = Static314.anInt6504;
			}
			Static314.anInt6504 = 0;
			if (local56 == 1 && (Static255.anInt5508 == 1 && Static237.anInt5285 > 2 || Static353.method6159())) {
				local56 = 2;
			}
			if (local56 == 2 && Static237.anInt5285 > 0) {
				Static296.method5234(Static324.anInt6648, Static121.anInt3045);
			}
			if (local56 != 1 || Static237.anInt5285 <= 0) {
				return;
			}
			Static98.method900();
			return;
		}
		@Pc(67) int local67;
		if (local56 != 1) {
			local65 = Static229.anInt5102;
			local67 = Static85.anInt2268;
			if (Static234.anInt5225 - 10 > local65 || local65 > Static234.anInt5225 + Static140.anInt3473 + 10 || Static52.anInt1577 - 10 > local67 || Static52.anInt1577 + Static259.anInt4930 + 10 < local67) {
				Static204.aBoolean329 = false;
				Static16.method455(Static234.anInt5225, Static259.anInt4930, Static52.anInt1577, Static140.anInt3473);
			}
		}
		if (local56 != 1) {
			return;
		}
		local65 = Static234.anInt5225;
		local67 = Static52.anInt1577;
		@Pc(119) int local119 = Static140.anInt3473;
		@Pc(121) int local121 = Static324.anInt6648;
		@Pc(123) int local123 = Static121.anInt3045;
		@Pc(125) int local125 = -1;
		@Pc(144) int local144;
		for (@Pc(127) int local127 = 0; local127 < Static237.anInt5285; local127++) {
			if (Static236.aBoolean367) {
				local144 = (Static237.anInt5285 - local127 - 1) * 16 + local67 + 33;
				if (local121 > local65 && local65 + local119 > local121 && local123 > local144 - 13 && local123 < local144 + 3) {
					local125 = local127;
				}
			} else {
				local144 = (Static237.anInt5285 - local127 - 1) * 16 + local67 + 31;
				if (local121 > local65 && local119 + local65 > local121 && local123 > local144 - 13 && local123 < local144 + 3) {
					local125 = local127;
				}
			}
		}
		if (local125 != -1) {
			local144 = 0;
			@Pc(225) Class195 local225 = new Class195(Static97.aClass130_9);
			for (@Pc(230) Class1_Sub22 local230 = (Class1_Sub22) local225.method5278(); local230 != null; local230 = (Class1_Sub22) local225.method5279()) {
				if (local125 == local144) {
					Static3.method62(local230);
				}
				local144++;
			}
		}
		Static204.aBoolean329 = false;
		Static16.method455(Static234.anInt5225, Static259.anInt4930, Static52.anInt1577, Static140.anInt3473);
		return;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IB)V")
	public static void method4934(@OriginalArg(0) int arg0) {
		if (Static214.anInt4865 == arg0) {
			return;
		}
		if (Static214.anInt4865 == 0) {
			Static238.method4511();
		}
		if (arg0 == 40) {
			Static245.method2661();
		}
		if (arg0 != 40 && Static289.aClass42_5 != null) {
			Static289.aClass42_5.method1271();
			Static289.aClass42_5 = null;
		}
		if (Static214.anInt4865 == 25 || Static214.anInt4865 == 28) {
			Static180.aClass162_146.anInt5438 = 2;
			Static205.aClass162_166.anInt5438 = 2;
			Static191.aClass162_153.anInt5438 = 2;
			Static339.aClass162_244.anInt5438 = 2;
			Static4.aClass162_14.anInt5438 = 2;
			Static171.aClass162_138.anInt5438 = 2;
			Static25.aClass162_40.anInt5438 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static138.anInt3431 = 0;
			Static1.anInt87 = 0;
			Static200.anInt4589 = 0;
			Static157.anInt3901 = 1;
			Static265.anInt5622 = 1;
			Static314.method5510(true);
			Static180.aClass162_146.anInt5438 = 1;
			Static205.aClass162_166.anInt5438 = 1;
			Static191.aClass162_153.anInt5438 = 1;
			Static339.aClass162_244.anInt5438 = 1;
			Static4.aClass162_14.anInt5438 = 1;
			Static171.aClass162_138.anInt5438 = 1;
			Static25.aClass162_40.anInt5438 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static223.method4330();
		}
		if (arg0 == 5) {
			Static157.method3355(Static221.aClass40_6, Static203.aClass162_47);
		} else {
			Static141.method3109();
		}
		@Pc(147) boolean local147 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(162) boolean local162 = Static214.anInt4865 == 5 || Static214.anInt4865 == 10 || Static214.anInt4865 == 28;
		if (local162 != local147) {
			if (local147) {
				Static67.anInt204 = Static226.anInt5077;
				if (Static340.anInt7187 == 0) {
					Static46.method5678();
				} else {
					Static176.method3563(255, Static250.aClass162_193, Static226.anInt5077);
				}
				Static59.aClass182_5.method5032(false);
			} else {
				Static46.method5678();
				Static59.aClass182_5.method5032(true);
				if (Static64.aClass170_1 != null) {
					Static64.aClass170_1.method4786();
					Static64.aClass170_1 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static221.aClass40_6.method2794();
		}
		Static214.anInt4865 = arg0;
	}
}
