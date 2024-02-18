import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!qda", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString96;

	@OriginalMember(owner = "client!qda", name = "l", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray2 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!qda", name = "t", descriptor = "Lclient!kda;")
	public static final Class204 aClass204_10 = new Class204(0, 1);

	@OriginalMember(owner = "client!qda", name = "x", descriptor = "Lclient!mia;")
	public static final Class242 aClass242_12 = new Class242("", 13);

	@OriginalMember(owner = "client!qda", name = "p", descriptor = "Lclient!nka;")
	public static final Class22 aClass22_1 = Static433.method5595();

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIILclient!ha;IIIIILclient!cba;)V")
	public static void method6799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class2_Sub2_Sub4 arg10) {
		if (arg8 < arg5 && arg5 < arg1 + arg8 && arg2 - 13 < arg0 && arg0 < arg2 + 3) {
			arg6 = arg3;
		}
		@Pc(41) String local41 = Static192.method2874(arg10);
		Static180.aClass14_3.method8827(arg6, arg2, local41, arg8 + 3, Static186.aClass23Array5, Static460.anIntArray554);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BILclient!ha;III)V")
	public static void method6801(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.KA(arg3, arg4, arg3 + arg0, arg2 + arg4);
		arg1.method7971(arg0, arg2, arg4, arg3, -16777216);
		if (Static273.anInt4403 < 100) {
			return;
		}
		@Pc(44) float local44 = (float) Static30.anInt5644 / (float) Static30.anInt5650;
		@Pc(46) int local46 = arg0;
		@Pc(48) int local48 = arg2;
		if (local44 < 1.0F) {
			local48 = (int) (local44 * (float) arg0);
		} else {
			local46 = (int) ((float) arg2 / local44);
		}
		@Pc(75) int local75 = arg3 + (arg0 - local46) / 2;
		@Pc(84) int local84 = arg4 + (arg2 - local48) / 2;
		if (Static13.aClass23_4 == null || Static13.aClass23_4.method8199() != arg0 || Static13.aClass23_4.method8182() != arg2) {
			Static30.method5062(Static30.anInt5655, Static30.anInt5648 + Static30.anInt5644, Static30.anInt5650 + Static30.anInt5655, Static30.anInt5648, local75, local84, local75 + local46, local84 - -local48);
			Static30.method5060(arg1);
			Static13.aClass23_4 = arg1.method7964(local75, local84, local46, local48, false);
		}
		Static13.aClass23_4.method8202(local75, local84);
		@Pc(138) int local138 = local46 * Static329.anInt1750 / Static30.anInt5650;
		@Pc(144) int local144 = Static588.anInt8690 * local48 / Static30.anInt5644;
		@Pc(152) int local152 = Static534.anInt8111 * local46 / Static30.anInt5650 + local75;
		@Pc(166) int local166 = local48 + local84 - local144 - Static510.anInt7639 * local48 / Static30.anInt5644;
		@Pc(168) int local168 = -1996554240;
		if (Static392.aClass377_4 == Static723.aClass377_9) {
			local168 = -1996488705;
		}
		arg1.aa(local152, local166, local138, local144, local168, 1);
		arg1.method7976(local152, local166, local138, local144, local168, 0);
		if (Static320.anInt5084 <= 0) {
			return;
		}
		@Pc(202) int local202;
		if (Static212.anInt3467 > 50) {
			local202 = (100 - Static212.anInt3467) * 5;
		} else {
			local202 = Static212.anInt3467 * 5;
		}
		for (@Pc(213) Class2_Sub20 local213 = (Class2_Sub20) Static30.aClass339_31.method7699(65280); local213 != null; local213 = (Class2_Sub20) Static30.aClass339_31.method7706()) {
			@Pc(221) Class105 local221 = Static30.aClass246_3.method5584(local213.anInt3131);
			if (Static408.method5634(local221)) {
				@Pc(256) int local256;
				@Pc(269) int local269;
				if (Static475.anInt7168 == local213.anInt3131) {
					local256 = local75 + local213.anInt3129 * local46 / Static30.anInt5650;
					local269 = local84 + local48 * (Static30.anInt5644 - local213.anInt3124) / Static30.anInt5644;
					arg1.method7971(4, 4, local269 - 2, local256 - 2, local202 << 24 | 0xFFFF00);
				} else if (Static409.anInt6318 != -1 && Static409.anInt6318 == local221.anInt2597) {
					local256 = local75 + local46 * local213.anInt3129 / Static30.anInt5650;
					local269 = local84 + (Static30.anInt5644 - local213.anInt3124) * local48 / Static30.anInt5644;
					arg1.method7971(4, 4, local269 - 2, local256 + -2, local202 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZIII)V")
	public static void method6802(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static106.aClass28_11.method738((long) arg1) != null) {
			return;
		}
		if (Static234.aBoolean303) {
			@Pc(34) Class2_Sub5 local34 = new Class2_Sub5(arg1, new Class222_Sub1(4096, Static709.aClass330_127, arg1), arg2, arg0);
			local34.aClass222_Sub1_1.method9183(Static384.aStringArray31[Static51.anInt1052]);
			Static106.aClass28_11.method735((long) arg1, local34);
		} else {
			Static635.method8380(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!ge;B)Lclient!no;")
	public static Class160 method6803(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(15) int local15 = arg0.method7382();
		@Pc(22) Class403 local22 = Static33.method882()[arg0.method7396()];
		@Pc(29) Class103 local29 = Static313.method4544()[arg0.method7396()];
		@Pc(35) int local35 = arg0.method7356();
		@Pc(39) int local39 = arg0.method7356();
		return new Class160(local15, local22, local29, local35, local39);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)Z")
	public static boolean method6804(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static77.method1560(arg0, arg1) || Static519.method6832(-97, arg1, arg0);
	}
}
