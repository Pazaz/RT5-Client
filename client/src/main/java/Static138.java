import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
	public static int anInt3429;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Ljava/lang/String;")
	public static final String aString119 = "red:";

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "Lclient!mi;")
	public static final Class130 aClass130_20 = new Class130();

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!tb;")
	public static final Class190 aClass190_1 = new Class190();

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "Lclient!sf;")
	public static final Class183 aClass183_12 = new Class183(16);

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
	public static int anInt3431 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Lclient!hn;")
	public static Class1_Sub1_Sub10 method3051() {
		@Pc(8) Class1_Sub1_Sub10 local8 = (Class1_Sub1_Sub10) Static165.aClass179_4.method4935();
		if (local8 != null) {
			local8.method6172();
			local8.method6158();
			return local8;
		}
		do {
			local8 = (Class1_Sub1_Sub10) Static44.aClass179_2.method4935();
			if (local8 == null) {
				return null;
			}
			if (local8.method2538() > Static325.method5658()) {
				return null;
			}
			local8.method6172();
			local8.method6158();
		} while ((local8.aLong234 & Long.MIN_VALUE) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)Z")
	public static boolean method3053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static24.method587(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static118.aClass77Array1[arg0].method3986(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static72.anInt1993) {
					if (!Static232.method4426(local10, local23, local14)) {
						return false;
					}
					if (!Static232.method4426(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static232.method4426(local10, local27, local14)) {
						return false;
					}
					if (!Static232.method4426(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static232.method4426(local10, local31, local14)) {
					return false;
				}
				if (!Static232.method4426(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static277.anInt5859) {
					if (!Static232.method4426(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static232.method4426(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static232.method4426(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static232.method4426(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static232.method4426(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static232.method4426(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static72.anInt1993) {
					if (!Static232.method4426(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static232.method4426(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static232.method4426(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static232.method4426(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static232.method4426(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static232.method4426(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static277.anInt5859) {
					if (!Static232.method4426(local10, local23, local14)) {
						return false;
					}
					if (!Static232.method4426(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static232.method4426(local10, local27, local14)) {
						return false;
					}
					if (!Static232.method4426(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static232.method4426(local10, local31, local14)) {
					return false;
				}
				if (!Static232.method4426(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static232.method4426(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static232.method4426(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static232.method4426(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static232.method4426(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static232.method4426(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method3054() {
		while (true) {
			@Pc(18) Class1_Sub40 local18 = (Class1_Sub40) Static166.aClass130_23.method3747();
			if (local18 == null) {
				return;
			}
			if (Static241.aClass154ArrayArrayArray2 != null) {
				@Pc(34) Class7_Sub1_Sub1 local34;
				@Pc(30) int local30;
				if (local18.anInt6728 >= 0) {
					local30 = local18.anInt6728 - 1;
					local34 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local30];
				} else {
					local30 = -local18.anInt6728 - 1;
					if (Static172.anInt6634 == local30) {
						local34 = Static264.aClass7_Sub1_Sub1_Sub2_2;
					} else {
						local34 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local30];
					}
				}
				if (local34 != null) {
					@Pc(60) Class189 local60 = Static83.method1840(local18.anInt6741);
					@Pc(73) int local73;
					@Pc(76) int local76;
					if (local18.anInt6736 == 1 || local18.anInt6736 == 3) {
						local76 = local60.anInt6195;
						local73 = local60.anInt6173;
					} else {
						local73 = local60.anInt6195;
						local76 = local60.anInt6173;
					}
					@Pc(92) int local92 = local18.anInt6738 + (local73 >> 1);
					@Pc(102) int local102 = local18.anInt6738 + (local73 + 1 >> 1);
					@Pc(109) int local109 = local18.anInt6735 + (local76 >> 1);
					@Pc(118) int local118 = local18.anInt6735 + (local76 + 1 >> 1);
					@Pc(123) Class77 local123 = Static118.aClass77Array1[local34.aByte72];
					@Pc(147) int local147 = local123.method3986(local92, local109) + local123.method3986(local102, local109) + local123.method3986(local92, local118) + local123.method3986(local102, local118) >> 2;
					@Pc(149) Interface6 local149 = null;
					@Pc(154) int local154 = Static81.anIntArray574[local18.anInt6729];
					if (local154 == 0) {
						local149 = (Interface6) Static56.method1394(local34.aByte72, local18.anInt6738, local18.anInt6735);
					} else if (local154 == 1) {
						local149 = (Interface6) Static169.method1651(local34.aByte72, local18.anInt6738, local18.anInt6735);
					} else if (local154 == 2) {
						local149 = (Interface6) Static95.method2029(local34.aByte72, local18.anInt6738, local18.anInt6735, Interface6.class);
					} else if (local154 == 3) {
						local149 = (Interface6) Static293.method5174(local34.aByte72, local18.anInt6738, local18.anInt6735);
					}
					if (local149 != null) {
						Static130.method5759(0, local18.anInt6738, local18.anInt6726, local154, local18.anInt6735, 0, local18.anInt6739 + 1, local34.aByte72, -1);
						local34.anInt7107 = local18.anInt6735 * 128 + local76 * 64;
						local34.anInt7112 = local18.anInt6726 + Static197.anInt4521;
						local34.anInt7110 = local18.anInt6738 * 128 + local73 * 64;
						local34.anInt7108 = local18.anInt6739 + Static197.anInt4521;
						local34.anInterface6_3 = local149;
						local34.anInt7109 = local147;
						@Pc(282) int local282 = local18.anInt6740;
						@Pc(285) int local285 = local18.anInt6730;
						@Pc(288) int local288 = local18.anInt6734;
						@Pc(297) int local297;
						if (local282 > local285) {
							local297 = local282;
							local282 = local285;
							local285 = local297;
						}
						@Pc(304) int local304 = local18.anInt6731;
						if (local288 > local304) {
							local297 = local288;
							local288 = local304;
							local304 = local297;
						}
						local34.anInt7102 = local282 + local18.anInt6738;
						local34.anInt7104 = local285 + local18.anInt6738;
						local34.anInt7114 = local18.anInt6735 + local304;
						local34.anInt7105 = local18.anInt6735 + local288;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZLclient!pp;)V")
	public static void method3055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class157 arg2) {
		Static185.aClass157ArrayArray1[arg0][arg1] = arg2;
	}
}
