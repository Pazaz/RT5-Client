import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString197 = null;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
	public static int anInt5508 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V")
	public static void method4690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) Class1_Sub20 local8 = (Class1_Sub20) Static268.aClass130_35.method3749(); local8 != null; local8 = (Class1_Sub20) Static268.aClass130_35.method3756()) {
			Static200.method3961(arg0, arg1, local8, arg3, arg2);
		}
		for (@Pc(35) Class1_Sub20 local35 = (Class1_Sub20) Static24.aClass130_4.method3749(); local35 != null; local35 = (Class1_Sub20) Static24.aClass130_4.method3756()) {
			@Pc(39) byte local39 = 1;
			@Pc(46) Class83 local46 = local35.aClass7_Sub1_Sub1_Sub1_1.method5982();
			if (local35.aClass7_Sub1_Sub1_Sub1_1.aBoolean506) {
				local39 = 0;
			} else if (local46.anInt2847 == local35.aClass7_Sub1_Sub1_Sub1_1.anInt7053 || local46.anInt2833 == local35.aClass7_Sub1_Sub1_Sub1_1.anInt7053 || local46.anInt2831 == local35.aClass7_Sub1_Sub1_Sub1_1.anInt7053 || local35.aClass7_Sub1_Sub1_Sub1_1.anInt7053 == local46.anInt2853) {
				local39 = 2;
			} else if (local46.anInt2845 == local35.aClass7_Sub1_Sub1_Sub1_1.anInt7053 || local35.aClass7_Sub1_Sub1_Sub1_1.anInt7053 == local46.anInt2855 || local46.anInt2848 == local35.aClass7_Sub1_Sub1_Sub1_1.anInt7053 || local35.aClass7_Sub1_Sub1_Sub1_1.anInt7053 == local46.anInt2854) {
				local39 = 3;
			}
			if (local39 != local35.anInt4009) {
				@Pc(135) int local135 = Static352.method6141(local35.aClass7_Sub1_Sub1_Sub1_1);
				if (local135 != local35.anInt4008) {
					if (local35.aClass1_Sub3_Sub2_3 != null) {
						Static127.aClass1_Sub3_Sub3_1.method3522(local35.aClass1_Sub3_Sub2_3);
						local35.aClass1_Sub3_Sub2_3 = null;
					}
					local35.anInt4008 = local135;
				}
				local35.anInt4009 = local39;
			}
			local35.anInt4018 = local35.aClass7_Sub1_Sub1_Sub1_1.anInt7027;
			local35.anInt4015 = local35.aClass7_Sub1_Sub1_Sub1_1.anInt7027 + local35.aClass7_Sub1_Sub1_Sub1_1.method5973() * 64;
			local35.anInt4012 = local35.aClass7_Sub1_Sub1_Sub1_1.anInt7032;
			local35.anInt4017 = local35.aClass7_Sub1_Sub1_Sub1_1.anInt7032 + local35.aClass7_Sub1_Sub1_Sub1_1.method5973() * 64;
			Static200.method3961(arg0, arg1, local35, arg3, arg2);
		}
		for (@Pc(211) Class1_Sub20 local211 = (Class1_Sub20) Static195.aClass183_22.method5052(); local211 != null; local211 = (Class1_Sub20) Static195.aClass183_22.method5050()) {
			@Pc(215) byte local215 = 1;
			@Pc(220) Class83 local220 = local211.aClass7_Sub1_Sub1_Sub2_1.method5982();
			if (local211.aClass7_Sub1_Sub1_Sub2_1.aBoolean506) {
				local215 = 0;
			} else if (local211.aClass7_Sub1_Sub1_Sub2_1.anInt7053 == local220.anInt2847 || local220.anInt2833 == local211.aClass7_Sub1_Sub1_Sub2_1.anInt7053 || local220.anInt2831 == local211.aClass7_Sub1_Sub1_Sub2_1.anInt7053 || local211.aClass7_Sub1_Sub1_Sub2_1.anInt7053 == local220.anInt2853) {
				local215 = 2;
			} else if (local211.aClass7_Sub1_Sub1_Sub2_1.anInt7053 == local220.anInt2845 || local211.aClass7_Sub1_Sub1_Sub2_1.anInt7053 == local220.anInt2855 || local211.aClass7_Sub1_Sub1_Sub2_1.anInt7053 == local220.anInt2848 || local220.anInt2854 == local211.aClass7_Sub1_Sub1_Sub2_1.anInt7053) {
				local215 = 3;
			}
			if (local215 != local211.anInt4009) {
				@Pc(303) int local303 = Static256.method4724(local211.aClass7_Sub1_Sub1_Sub2_1);
				if (local303 != local211.anInt4008) {
					if (local211.aClass1_Sub3_Sub2_3 != null) {
						Static127.aClass1_Sub3_Sub3_1.method3522(local211.aClass1_Sub3_Sub2_3);
						local211.aClass1_Sub3_Sub2_3 = null;
					}
					local211.anInt4008 = local303;
				}
				local211.anInt4009 = local215;
			}
			local211.anInt4018 = local211.aClass7_Sub1_Sub1_Sub2_1.anInt7027;
			local211.anInt4015 = local211.aClass7_Sub1_Sub1_Sub2_1.anInt7027 + local211.aClass7_Sub1_Sub1_Sub2_1.method5973() * 64;
			local211.anInt4012 = local211.aClass7_Sub1_Sub1_Sub2_1.anInt7032;
			local211.anInt4017 = local211.aClass7_Sub1_Sub1_Sub2_1.anInt7032 + local211.aClass7_Sub1_Sub1_Sub2_1.method5973() * 64;
			Static200.method3961(arg0, arg1, local211, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)V")
	public static void method4691(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub14 local10 = (Class1_Sub14) Static143.aClass183_13.method5053((long) arg0);
		if (local10 != null) {
			local10.method6172();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZZI)V")
	public static void method4693(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static19.anInt667--;
			if (Static19.anInt667 == 0) {
				Static336.anIntArray571 = null;
			}
		}
		Static180.anInt4247--;
		if (Static180.anInt4247 == 0) {
			Static139.anIntArray247 = null;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(IIII)V")
	public static void method4694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(11, arg2);
		local8.method2539();
		local8.anInt2960 = arg0;
		local8.anInt2952 = arg1;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)I")
	public static int method4695(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIII)V")
	public static void method4696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static209.method4125(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg1;
		@Pc(32) int local32 = -arg1;
		@Pc(34) int local34 = local15;
		@Pc(37) int local37 = -local15;
		@Pc(39) int local39 = -1;
		@Pc(41) int local41 = -1;
		@Pc(63) int local63;
		@Pc(71) int local71;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (Static180.anInt4240 <= arg0 && Static197.anInt4520 >= arg0) {
			@Pc(55) int[] local55 = Static87.anIntArrayArray9[arg0];
			local63 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3 - arg1);
			local71 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3 + arg1);
			local79 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3 - local15);
			local88 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3 + local15);
			Static12.method349(local79, local55, arg4, local63);
			Static12.method349(local88, local55, arg5, local79);
			Static12.method349(local71, local55, arg4, local88);
		}
		while (local24 > local10) {
			local39 += 2;
			local41 += 2;
			local37 += local41;
			local32 += local39;
			if (local37 >= 0 && local34 >= 1) {
				local34--;
				Static175.anIntArray292[local34] = local10;
				local37 -= local34 << 1;
			}
			local10++;
			@Pc(242) int local242;
			@Pc(251) int local251;
			@Pc(262) int[] local262;
			@Pc(152) int local152;
			if (local32 >= 0) {
				local24--;
				local32 -= local24 << 1;
				local152 = arg0 - local24;
				local63 = local24 + arg0;
				if (Static180.anInt4240 <= local63 && local152 <= Static197.anInt4520) {
					if (local24 >= local15) {
						local71 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, local10 + arg3);
						local79 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3 - local10);
						if (Static197.anInt4520 >= local63) {
							Static12.method349(local71, Static87.anIntArrayArray9[local63], arg4, local79);
						}
						if (Static180.anInt4240 <= local152) {
							Static12.method349(local71, Static87.anIntArrayArray9[local152], arg4, local79);
						}
					} else {
						local71 = Static175.anIntArray292[local24];
						local79 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, local10 + arg3);
						local88 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3 - local10);
						local242 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3 + local71);
						local251 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3 - local71);
						if (local63 <= Static197.anInt4520) {
							local262 = Static87.anIntArrayArray9[local63];
							Static12.method349(local251, local262, arg4, local88);
							Static12.method349(local242, local262, arg5, local251);
							Static12.method349(local79, local262, arg4, local242);
						}
						if (Static180.anInt4240 <= local152) {
							local262 = Static87.anIntArrayArray9[local152];
							Static12.method349(local251, local262, arg4, local88);
							Static12.method349(local242, local262, arg5, local251);
							Static12.method349(local79, local262, arg4, local242);
						}
					}
				}
			}
			local152 = arg0 - local10;
			local63 = arg0 + local10;
			if (local63 >= Static180.anInt4240 && Static197.anInt4520 >= local152) {
				local71 = arg3 + local24;
				local79 = arg3 - local24;
				if (local71 >= Static239.anInt5299 && local79 <= Static179.anInt4229) {
					local71 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, local71);
					local79 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, local79);
					if (local15 > local10) {
						local88 = local10 > local34 ? Static175.anIntArray292[local10] : local34;
						local242 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3 + local88);
						local251 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3 - local88);
						if (local63 <= Static197.anInt4520) {
							local262 = Static87.anIntArrayArray9[local63];
							Static12.method349(local251, local262, arg4, local79);
							Static12.method349(local242, local262, arg5, local251);
							Static12.method349(local71, local262, arg4, local242);
						}
						if (local152 >= Static180.anInt4240) {
							local262 = Static87.anIntArrayArray9[local152];
							Static12.method349(local251, local262, arg4, local79);
							Static12.method349(local242, local262, arg5, local251);
							Static12.method349(local71, local262, arg4, local242);
						}
					} else {
						if (local63 <= Static197.anInt4520) {
							Static12.method349(local71, Static87.anIntArrayArray9[local63], arg4, local79);
						}
						if (Static180.anInt4240 <= local152) {
							Static12.method349(local71, Static87.anIntArrayArray9[local152], arg4, local79);
						}
					}
				}
			}
		}
	}
}
