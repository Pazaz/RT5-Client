import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ho", name = "jb", descriptor = "Lclient!we;")
	public static final Class215 aClass215_48 = new Class215(64);

	@OriginalMember(owner = "client!ho", name = "mb", descriptor = "S")
	public static short aShort49 = 1;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "(B)V")
	public static void method2571() {
		@Pc(3) Class35 local3 = Static332.aClass35_1;
		synchronized (Static332.aClass35_1) {
			Static321.anInt6613 = Static17.anInt646;
			Static342.anInt7214++;
			@Pc(19) int local19;
			if (Static62.anInt1707 >= 0) {
				while (Static62.anInt1707 != Static15.anInt627) {
					local19 = Static16.anIntArray39[Static15.anInt627];
					Static15.anInt627 = Static15.anInt627 + 1 & 0x7F;
					if (local19 < 0) {
						Static345.aBooleanArray30[~local19] = false;
					} else {
						Static345.aBooleanArray30[local19] = true;
					}
				}
			} else {
				for (local19 = 0; local19 < 112; local19++) {
					Static345.aBooleanArray30[local19] = false;
				}
				Static62.anInt1707 = Static15.anInt627;
			}
			Static17.anInt646 = Static38.anInt1197;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!ro;B)Ljava/lang/String;")
	public static String method2573(@OriginalArg(0) Class177 arg0) {
		if (Static37.method930(arg0).method5626() == 0) {
			return null;
		} else if (arg0.aString217 == null || arg0.aString217.trim().length() == 0) {
			return Static278.aBoolean279 ? "Hidden-use" : null;
		} else {
			return arg0.aString217;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!g;Z)V")
	public static void method2576(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.aClass7_1 = null;
		@Pc(12) int local12 = arg0.aClass2_Sub6Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			arg0.aClass2_Sub6Array1[local18].aBoolean334 = false;
		}
		@Pc(32) Class58[] local32 = Class211.aClass58Array1;
		synchronized (Class211.aClass58Array1) {
			if (local12 < Class211.aClass58Array1.length && Static235.anIntArray398[local12] < 200) {
				Class211.aClass58Array1[local12].method1670(arg0);
				@Pc(57) int local57 = Static235.anIntArray398[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V")
	public static void method2578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = ((arg2 << 1) - 3) * local25;
		@Pc(81) int local81 = local54;
		Static12.method349(arg1 + arg0, Static87.anIntArrayArray9[arg4], arg3, arg0 - arg1);
		@Pc(100) int local100 = (arg2 - 1) * local50;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local67;
					local46 += local81;
					local67 += local54;
					local81 += local54;
					local7++;
				}
			}
			if (local46 < 0) {
				local38 += local67;
				local46 += local81;
				local81 += local54;
				local67 += local54;
				local7++;
			}
			local46 += -local75;
			local38 += -local100;
			local9--;
			local75 -= local50;
			local100 -= local50;
			@Pc(168) int local168 = arg4 - local9;
			@Pc(172) int local172 = arg4 + local9;
			@Pc(176) int local176 = local7 + arg0;
			@Pc(181) int local181 = arg0 - local7;
			Static12.method349(local176, Static87.anIntArrayArray9[local168], arg3, local181);
			Static12.method349(local176, Static87.anIntArrayArray9[local172], arg3, local181);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIBIIII)V")
	public static void method2579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg2;
		@Pc(20) int local20 = arg6 - arg2;
		@Pc(24) int local24 = arg5 * arg5;
		@Pc(28) int local28 = arg6 * arg6;
		@Pc(37) int local37 = local16 * local16;
		@Pc(41) int local41 = local20 * local20;
		@Pc(45) int local45 = local28 << 1;
		@Pc(49) int local49 = local24 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg6 << 1;
		@Pc(65) int local65 = local20 << 1;
		@Pc(73) int local73 = (1 - local61) * local24 + local45;
		@Pc(82) int local82 = local28 - local49 * (local61 - 1);
		@Pc(90) int local90 = local53 + local37 * (1 - local65);
		@Pc(99) int local99 = local41 - local57 * (local65 - 1);
		@Pc(103) int local103 = local24 << 2;
		@Pc(107) int local107 = local28 << 2;
		@Pc(111) int local111 = local37 << 2;
		@Pc(115) int local115 = local41 << 2;
		@Pc(119) int local119 = local45 * 3;
		@Pc(125) int local125 = local49 * (local61 - 3);
		@Pc(129) int local129 = local53 * 3;
		@Pc(135) int local135 = (local65 - 3) * local57;
		@Pc(137) int local137 = local107;
		@Pc(143) int local143 = local103 * (arg6 - 1);
		@Pc(145) int local145 = local115;
		@Pc(164) int local164;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(191) int local191;
		if (arg3 >= Static180.anInt4240 && arg3 <= Static197.anInt4520) {
			@Pc(155) int[] local155 = Static87.anIntArrayArray9[arg3];
			local164 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg4 - arg5);
			local172 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg5 + arg4);
			local183 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg4 - local16);
			local191 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg4 + local16);
			Static12.method349(local183, local155, arg0, local164);
			Static12.method349(local191, local155, arg1, local183);
			Static12.method349(local172, local155, arg0, local191);
		}
		@Pc(215) int local215 = (local20 - 1) * local111;
		while (local9 > 0) {
			@Pc(224) boolean local224 = local20 >= local9;
			if (local73 < 0) {
				while (local73 < 0) {
					local73 += local119;
					local82 += local137;
					local7++;
					local137 += local107;
					local119 += local107;
				}
			}
			if (local224) {
				if (local90 < 0) {
					while (local90 < 0) {
						local90 += local129;
						local99 += local145;
						local145 += local115;
						local11++;
						local129 += local115;
					}
				}
				if (local99 < 0) {
					local99 += local145;
					local90 += local129;
					local11++;
					local129 += local115;
					local145 += local115;
				}
				local90 += -local215;
				local99 += -local135;
				local215 -= local111;
				local135 -= local111;
			}
			if (local82 < 0) {
				local82 += local137;
				local73 += local119;
				local137 += local107;
				local119 += local107;
				local7++;
			}
			local82 += -local125;
			local73 += -local143;
			local125 -= local103;
			local9--;
			local143 -= local103;
			local164 = arg3 - local9;
			local172 = arg3 + local9;
			if (Static180.anInt4240 <= local172 && local164 <= Static197.anInt4520) {
				local183 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, local7 + arg4);
				local191 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg4 - local7);
				if (local224) {
					@Pc(415) int local415 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, local11 + arg4);
					@Pc(424) int local424 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg4 - local11);
					@Pc(431) int[] local431;
					if (local164 >= Static180.anInt4240) {
						local431 = Static87.anIntArrayArray9[local164];
						Static12.method349(local424, local431, arg0, local191);
						Static12.method349(local415, local431, arg1, local424);
						Static12.method349(local183, local431, arg0, local415);
					}
					if (local172 <= Static197.anInt4520) {
						local431 = Static87.anIntArrayArray9[local172];
						Static12.method349(local424, local431, arg0, local191);
						Static12.method349(local415, local431, arg1, local424);
						Static12.method349(local183, local431, arg0, local415);
					}
				} else {
					if (Static180.anInt4240 <= local164) {
						Static12.method349(local183, Static87.anIntArrayArray9[local164], arg0, local191);
					}
					if (Static197.anInt4520 >= local172) {
						Static12.method349(local183, Static87.anIntArrayArray9[local172], arg0, local191);
					}
				}
			}
		}
	}
}
