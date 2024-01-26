import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!taa", name = "O", descriptor = "Ljava/lang/Class;")
	public static Class aClass22;

	@OriginalMember(owner = "client!taa", name = "H", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray18 = new int[2][][];

	@OriginalMember(owner = "client!taa", name = "E", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_109 = new Class345(29, -1);

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(Z)V")
	public static void method7899() {
		Static178.method2729(Static109.aClass158_3);
		Static181.anInt3003++;
		if (Static702.aBoolean797 && Static343.aBoolean428) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static137.aBoolean210) {
				local30 = Static130.method2283();
				local32 = Static422.method5771();
			}
			@Pc(46) int local46 = local30 + Static189.aClass120_1.method8853();
			@Pc(52) int local52 = Static189.aClass120_1.method8854() + local32;
			local46 -= Static378.anInt5941;
			local52 -= Static150.anInt2631;
			if (Static123.anInt2341 > local46) {
				local46 = Static123.anInt2341;
			}
			if (Static109.aClass158_3.anInt3802 + local46 > Static123.anInt2341 - -Static354.aClass158_8.anInt3802) {
				local46 = Static354.aClass158_8.anInt3802 + Static123.anInt2341 - Static109.aClass158_3.anInt3802;
			}
			if (local52 < Static169.anInt2853) {
				local52 = Static169.anInt2853;
			}
			if (Static169.anInt2853 + Static354.aClass158_8.anInt3746 < local52 - -Static109.aClass158_3.anInt3746) {
				local52 = Static169.anInt2853 + Static354.aClass158_8.anInt3746 - Static109.aClass158_3.anInt3746;
			}
			@Pc(119) int local119 = Static354.aClass158_8.anInt3809 + local46 - Static123.anInt2341;
			@Pc(127) int local127 = Static354.aClass158_8.anInt3768 + local52 - Static169.anInt2853;
			@Pc(197) Class2_Sub42 local197;
			if (Static189.aClass120_1.method8844()) {
				if (Static109.aClass158_3.anInt3797 < Static181.anInt3003) {
					@Pc(141) int local141 = local46 - Static655.anInt9763;
					@Pc(146) int local146 = local52 - Static115.anInt2258;
					if (Static109.aClass158_3.anInt3754 < local141 || -Static109.aClass158_3.anInt3754 > local141 || Static109.aClass158_3.anInt3754 < local146 || local146 < -Static109.aClass158_3.anInt3754) {
						Static172.aBoolean246 = true;
					}
				}
				if (Static109.aClass158_3.anObjectArray30 != null && Static172.aBoolean246) {
					local197 = new Class2_Sub42();
					local197.aClass158_14 = Static109.aClass158_3;
					local197.anInt7218 = local119;
					local197.anInt7214 = local127;
					local197.anObjectArray36 = Static109.aClass158_3.anObjectArray30;
					Static472.method6420(local197);
					return;
				}
			} else {
				if (Static172.aBoolean246) {
					Static470.method6384();
					if (Static109.aClass158_3.anObjectArray5 != null) {
						local197 = new Class2_Sub42();
						local197.aClass158_13 = Static327.aClass158_7;
						local197.anInt7218 = local119;
						local197.aClass158_14 = Static109.aClass158_3;
						local197.anInt7214 = local127;
						local197.anObjectArray36 = Static109.aClass158_3.anObjectArray5;
						Static472.method6420(local197);
					}
					if (Static327.aClass158_7 != null && Static84.method1657(Static109.aClass158_3) != null) {
						Static710.method6710(Static109.aClass158_3, Static327.aClass158_7);
					}
				} else if ((Static219.anInt3549 == 1 || Static204.method3084()) && Static594.anInt8777 > 2) {
					Static455.method6223(Static378.anInt5941 + Static655.anInt9763, Static115.anInt2258 + Static150.anInt2631);
				} else if (Static77.method1559()) {
					Static455.method6223(Static655.anInt9763 + Static378.anInt5941, Static115.anInt2258 + Static150.anInt2631);
				}
				Static109.aClass158_3 = null;
			}
		} else if (Static181.anInt3003 > 1) {
			Static109.aClass158_3 = null;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BLclient!fu;Lclient!ha;Lclient!el;)V")
	public static void method7902(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(8) Class23 local8 = arg2.method2428(arg1);
		if (local8 == null) {
			return;
		}
		@Pc(15) int local15 = local8.method8199();
		if (local8.method8182() > local15) {
			local15 = local8.method8182();
		}
		@Pc(31) int local31 = arg0.anInt3130;
		@Pc(34) int local34 = arg0.anInt3122;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(56) int local56;
		@Pc(78) int local78;
		if (arg2.aString25 != null) {
			local36 = Static154.aClass381_6.method8740(Static37.aStringArray5, (int[]) null, (Class23[]) null, arg2.aString25);
			for (local56 = 0; local56 < local36; local56++) {
				@Pc(61) String local61 = Static37.aStringArray5[local56];
				if (local56 < local36 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local78 = Static142.aClass327_1.method7539(local61);
				if (local78 > local38) {
					local38 = local78;
				}
			}
			local40 = Static142.aClass327_1.method7536() * local36 + Static142.aClass327_1.method7538() / 2;
		}
		local56 = local15 / 2 + arg0.anInt3130;
		if (local31 < Static30.anInt5649 + local15) {
			local56 = local15 / 2 + Static30.anInt5649 + local38 / 2 + 15;
			local31 = Static30.anInt5649;
		} else if (Static30.anInt5651 - local15 < local31) {
			local31 = Static30.anInt5651 - local15;
			local56 = Static30.anInt5651 - local15 / 2 - local38 / 2 - 10 - 5;
		}
		@Pc(163) int local163 = arg0.anInt3122;
		if (local15 + Static30.anInt5653 > local34) {
			local163 = Static30.anInt5653 + local15 / 2 + 10;
			local34 = Static30.anInt5653;
		} else if (Static30.anInt5646 - local15 < local34) {
			local163 = Static30.anInt5646 - local15 / 2 - local40 - 10;
			local34 = Static30.anInt5646 - local15;
		}
		local78 = (int) (Math.atan2((double) (local31 - arg0.anInt3130), (double) (local34 - arg0.anInt3122)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local8.method8186((float) local31 + (float) local15 / 2.0F, (float) local34 + (float) local15 / 2.0F, 4096, local78);
		@Pc(246) int local246 = -2;
		@Pc(248) int local248 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		if (arg2.aString25 != null) {
			local246 = local56 - local38 / 2 - 5;
			local248 = local163;
			local257 = local38 + local246 + 10;
			local259 = Static142.aClass327_1.method7536() * local36 + local163 + 3;
			if (arg2.anInt2605 != 0) {
				arg1.method7971(local257 - local246, local259 - local163, local163, local246, arg2.anInt2605);
			}
			if (arg2.anInt2608 != 0) {
				arg1.method7945(local163, arg2.anInt2608, local257 - local246, local259 - local163, local246);
			}
			for (@Pc(333) int local333 = 0; local333 < local36; local333++) {
				@Pc(338) String local338 = Static37.aStringArray5[local333];
				if (local36 - 1 > local333) {
					local338 = local338.substring(0, local338.length() - 4);
				}
				Static142.aClass327_1.method7540(arg1, local338, local56, local163, arg2.anInt2592);
				local163 += Static142.aClass327_1.method7536();
			}
		}
		if (arg2.anInt2596 == -1 && arg2.aString25 == null) {
			return;
		}
		local15 >>= 0x1;
		@Pc(393) Class2_Sub37 local393 = new Class2_Sub37(arg0);
		local393.anInt6190 = local15 + local31;
		local393.anInt6187 = local259;
		local393.anInt6192 = local246;
		local393.anInt6195 = local31 - local15;
		local393.anInt6191 = local34 + local15;
		local393.anInt6186 = local34 - local15;
		local393.anInt6184 = local248;
		local393.anInt6185 = local257;
		Static551.aClass339_54.method7711(local393);
	}
}
