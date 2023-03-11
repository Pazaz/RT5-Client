import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "Lclient!vi;")
	public static Class239 aClass239_3;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!h;")
	public static final Class89 aClass89_131 = new Class89(44, 8);

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
	public static int anInt3148 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBLclient!hb;)Lclient!bi;")
	public static Class22 method3149(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub5 arg1) {
		@Pc(9) Class22 local9;
		if (Static290.aClass22_3 == null) {
			local9 = new Class22();
		} else {
			local9 = Static290.aClass22_3;
			Static290.aClass22_3 = Static290.aClass22_3.aClass22_1;
			Static222.anInt3944--;
			local9.aClass22_1 = null;
		}
		local9.aClass11_Sub5_1 = arg1;
		local9.anInt645 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIZZI)I")
	public static int method3150(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class2_Sub41 local10 = Static374.method6275(false, arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray489.length; local18++) {
			if (local10.anIntArray489[local18] >= 0 && local10.anIntArray489[local18] < Static313.aClass107_2.anInt2779) {
				@Pc(44) Class188 local44 = Static313.aClass107_2.method2759(local10.anIntArray489[local18]);
				@Pc(54) int local54 = local44.method4772(Static363.aClass18_2.method565(arg0).anInt7023, arg0);
				if (arg1) {
					local16 += local10.anIntArray488[local18] * local54;
				} else {
					local16 += local54;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)V")
	public static void method3154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static330.aClass67ArrayArrayArray3 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 | arg1 << 28 | arg2 << 14);
		@Pc(27) Class2_Sub32 local27 = (Class2_Sub32) Static120.aClass4_49.method90(local19);
		if (local27 == null) {
			Static166.method3190(arg1, arg0, arg2);
			return;
		}
		@Pc(41) Class2_Sub8 local41 = (Class2_Sub8) local27.aClass135_34.method3551();
		if (local41 == null) {
			Static166.method3190(arg1, arg0, arg2);
			return;
		}
		@Pc(55) Class11_Sub4_Sub1 local55 = (Class11_Sub4_Sub1) Static166.method3190(arg1, arg0, arg2);
		if (local55 == null) {
			local55 = new Class11_Sub4_Sub1();
		} else {
			local55.anInt3980 = local55.anInt3981 = -1;
		}
		local55.anInt3984 = local41.anInt1719;
		local55.anInt3985 = local41.anInt1717;
		label44: while (true) {
			@Pc(85) Class2_Sub8 local85 = (Class2_Sub8) local27.aClass135_34.method3552();
			if (local85 == null) {
				break;
			}
			if (local55.anInt3985 != local85.anInt1717) {
				local55.anInt3978 = local85.anInt1719;
				local55.anInt3980 = local85.anInt1717;
				while (true) {
					@Pc(110) Class2_Sub8 local110 = (Class2_Sub8) local27.aClass135_34.method3552();
					if (local110 == null) {
						break label44;
					}
					if (local110.anInt1717 != local55.anInt3985 && local55.anInt3980 != local110.anInt1717) {
						local55.anInt3982 = local110.anInt1719;
						local55.anInt3981 = local110.anInt1717;
					}
				}
			}
		}
		@Pc(155) int local155 = Static386.method6032((arg0 << 7) + 64, (arg2 << 7) + 64, arg1);
		Static26.method866(arg1, arg0, arg2, local155, local55);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method3156(@OriginalArg(1) Class19 arg0) {
		if (Static268.anInt4959 < 2 && !Static330.aBoolean419 || Static375.aClass161_14 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static330.aBoolean419 && Static268.anInt4959 < 2) {
			local41 = Static91.aString18 + Static161.aClass79_67.method2267(client.language) + Static371.aString68 + " ->";
		} else if (Static148.aBoolean192 && Static174.aClass123_2.method3343(81) && Static268.anInt4959 > 2) {
			local41 = Static318.method5421((Class2_Sub5) Static129.aClass135_19.aClass2_130.aClass2_244.aClass2_244);
		} else {
			@Pc(68) Class2_Sub5 local68 = (Class2_Sub5) Static129.aClass135_19.aClass2_130.aClass2_244;
			local41 = Static318.method5421(local68);
			@Pc(74) int[] local74 = null;
			if (Static298.method2425(local68.anInt1005)) {
				local74 = Static313.aClass107_2.method2759((int) local68.aLong30).anIntArray364;
			} else if (local68.anInt1008 != -1) {
				local74 = Static313.aClass107_2.method2759(local68.anInt1008).anIntArray364;
			} else if (Static297.method5111(local68.anInt1005)) {
				@Pc(140) Class11_Sub5_Sub2_Sub2 local140 = Static365.aClass11_Sub5_Sub2_Sub2Array1[(int) local68.aLong30];
				if (local140 != null) {
					@Pc(145) Class71 local145 = local140.aClass71_1;
					if (local145.anIntArray129 != null) {
						local145 = local145.method2093(Static214.aClass226_1);
					}
					if (local145 != null) {
						local74 = local145.anIntArray131;
					}
				}
			} else if (Static241.method4190(local68.anInt1005)) {
				@Pc(108) Class41 local108;
				if (local68.anInt1005 == 1010) {
					local108 = Static359.aClass202_4.method5163((int) local68.aLong30);
				} else {
					local108 = Static359.aClass202_4.method5163((int) (local68.aLong30 >>> 32 & 0x7FFFFFFFL));
				}
				if (local108.anIntArray94 != null) {
					local108 = local108.method1533(Static214.aClass226_1);
				}
				if (local108 != null) {
					local74 = local108.anIntArray96;
				}
			}
			if (local74 != null) {
				local41 = local41 + Static158.method2939(local74);
			}
		}
		if (Static268.anInt4959 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static268.anInt4959 - 2) + Static328.aClass79_127.method2267(client.language);
		}
		if (Static164.aClass161_5 != null) {
			@Pc(218) Class130 local218 = Static164.aClass161_5.method4101(arg0);
			if (local218 == null) {
				local218 = Static52.aClass130_1;
			}
			local218.method5903(Static129.anInt2460, local41, Static288.anInt5464, Static61.aRandom1, Static164.aClass161_5.anInt4293, Static210.anIntArray229, Static164.aClass161_5.anInt4252, Static164.aClass161_5.anInt4248, Static164.aClass161_5.anInt4290, Static283.anInt5352, Static134.aClass13Array12, Static164.aClass161_5.anInt4261, Static164.aClass161_5.anInt4298, Static72.anIntArray114);
			Static369.method6221(Static210.anIntArray229[2], Static210.anIntArray229[0], Static210.anIntArray229[3], Static210.anIntArray229[1]);
		} else if (Static179.aClass161_6 != null && client.GAME_RS == client.game) {
			@Pc(287) int local287 = Static52.aClass130_1.method5899(Static290.anInt5498 + 4, Static283.anInt5352, Static134.aClass13Array12, Static61.aRandom1, Static63.anInt1549 + 16, Static72.anIntArray114, local41);
			Static369.method6221(Static113.aClass239_2.method6126(local41) + local287, Static290.anInt5498 + 4, 16, Static63.anInt1549);
		}
	}
}
