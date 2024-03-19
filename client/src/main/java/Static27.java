import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Lclient!qj;")
	public static Class162 aClass162_42;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Lclient!sf;")
	public static final Class183 aClass183_3 = new Class183(16);

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "[I")
	public static final int[] anIntArray56 = new int[200];

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "[I")
	public static final int[] anIntArray57 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)V")
	public static void method654() {
		@Pc(1) Class215 local1 = Static304.aClass215_91;
		synchronized (Static304.aClass215_91) {
			Static304.aClass215_91.method6063(5);
		}
		local1 = Static80.aClass215_34;
		synchronized (Static80.aClass215_34) {
			Static80.aClass215_34.method6063(5);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
	public static void method656() {
		Static72.aClass184_1 = new Class184(8);
		Static185.anInt4350 = 0;
		for (@Pc(22) Class2_Sub7 local22 = (Class2_Sub7) Static55.aClass58_4.method1672(); local22 != null; local22 = (Class2_Sub7) Static55.aClass58_4.method1675()) {
			local22.method4741();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZILclient!c;ZLclient!c;)I")
	public static int method657(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class27_Sub1 arg2, @OriginalArg(4) Class27_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local11 = arg3.anInt927;
			local14 = arg2.anInt927;
			if (!arg0) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return Static81.method5967(arg3.method701().aString118, Static60.anInt6011, arg2.method701().aString118);
		} else if (arg1 == 3) {
			if (arg3.aString43.equals("-")) {
				if (arg2.aString43.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString43.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static81.method5967(arg3.aString43, Static60.anInt6011, arg2.aString43);
			}
		} else if (arg1 == 4) {
			if (arg3.method691()) {
				return arg2.method691() ? 0 : 1;
			} else if (arg2.method691()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg3.method696()) {
				return arg2.method696() ? 0 : 1;
			} else if (arg2.method696()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg3.method697()) {
				return arg2.method697() ? 0 : 1;
			} else if (arg2.method697()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg3.method692()) {
				return arg2.method692() ? 0 : 1;
			} else if (arg2.method692()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local11 = arg3.anInt934;
			local14 = arg2.anInt934;
			if (arg0) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg3.anInt936 - arg2.anInt936;
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	public static void method658() {
		@Pc(9) int local9 = Static246.anInt6529 * 128 + 64;
		@Pc(15) int local15 = Static151.anInt3704 * 128 + 64;
		@Pc(23) int local23 = Static309.method5429(local15, local9, Static39.anInt1215) - Static329.anInt6732;
		if (Static64.anInt1763 >= 100) {
			Static3.anInt92 = Static246.anInt6529 * 128 + 64;
			Static88.anInt2339 = Static151.anInt3704 * 128 + 64;
			Static138.anInt3429 = Static309.method5429(Static88.anInt2339, Static3.anInt92, Static39.anInt1215) - Static329.anInt6732;
		} else {
			if (Static3.anInt92 < local9) {
				Static3.anInt92 += Static62.anInt1703 + (local9 - Static3.anInt92) * Static64.anInt1763 / 1000;
				if (local9 < Static3.anInt92) {
					Static3.anInt92 = local9;
				}
			}
			if (Static138.anInt3429 < local23) {
				Static138.anInt3429 += (local23 - Static138.anInt3429) * Static64.anInt1763 / 1000 + Static62.anInt1703;
				if (Static138.anInt3429 > local23) {
					Static138.anInt3429 = local23;
				}
			}
			if (Static3.anInt92 > local9) {
				Static3.anInt92 -= Static64.anInt1763 * (Static3.anInt92 - local9) / 1000 + Static62.anInt1703;
				if (Static3.anInt92 < local9) {
					Static3.anInt92 = local9;
				}
			}
			if (local15 > Static88.anInt2339) {
				Static88.anInt2339 += Static64.anInt1763 * (local15 - Static88.anInt2339) / 1000 + Static62.anInt1703;
				if (local15 < Static88.anInt2339) {
					Static88.anInt2339 = local15;
				}
			}
			if (Static138.anInt3429 > local23) {
				Static138.anInt3429 -= Static64.anInt1763 * (Static138.anInt3429 - local23) / 1000 + Static62.anInt1703;
				if (local23 > Static138.anInt3429) {
					Static138.anInt3429 = local23;
				}
			}
			if (local15 < Static88.anInt2339) {
				Static88.anInt2339 -= (Static88.anInt2339 - local15) * Static64.anInt1763 / 1000 + Static62.anInt1703;
				if (local15 > Static88.anInt2339) {
					Static88.anInt2339 = local15;
				}
			}
		}
		local15 = Static339.anInt7358 * 128 + 64;
		local9 = Static32.anInt7023 * 128 + 64;
		local23 = Static309.method5429(local15, local9, Static39.anInt1215) - Static304.anInt6381;
		@Pc(217) int local217 = local9 - Static3.anInt92;
		@Pc(221) int local221 = local23 - Static138.anInt3429;
		@Pc(226) int local226 = local15 - Static88.anInt2339;
		@Pc(237) int local237 = (int) Math.sqrt((double) (local226 * local226 + local217 * local217));
		@Pc(248) int local248 = (int) (Math.atan2((double) local221, (double) local237) * 2607.5945876176133D) & 0x3FFF;
		@Pc(259) int local259 = (int) (Math.atan2((double) local217, (double) local226) * -2607.5945876176133D) & 0x3FFF;
		if (local248 < 1024) {
			local248 = 1024;
		}
		if (local248 > 3072) {
			local248 = 3072;
		}
		if (Static130.anInt6778 < local248) {
			Static130.anInt6778 += Static264.anInt5616 * (local248 - Static130.anInt6778 >> 3) / 1000 + Static350.anInt7319 << 3;
			if (Static130.anInt6778 > local248) {
				Static130.anInt6778 = local248;
			}
		}
		if (Static130.anInt6778 > local248) {
			Static130.anInt6778 -= Static350.anInt7319 + (Static130.anInt6778 - local248 >> 3) * Static264.anInt5616 / 1000 << 3;
			if (local248 > Static130.anInt6778) {
				Static130.anInt6778 = local248;
			}
		}
		@Pc(341) int local341 = local259 - Static89.anInt2374;
		if (local341 > 8192) {
			local341 -= 16384;
		}
		if (local341 < -8192) {
			local341 += 16384;
		}
		local341 >>= 0x3;
		if (local341 > 0) {
			Static89.anInt2374 += local341 * Static264.anInt5616 / 1000 + Static350.anInt7319 << 3;
			Static89.anInt2374 &= 0x3FFF;
		}
		if (local341 < 0) {
			Static89.anInt2374 -= -local341 * Static264.anInt5616 / 1000 + Static350.anInt7319 << 3;
			Static89.anInt2374 &= 0x3FFF;
		}
		@Pc(402) int local402 = local259 - Static89.anInt2374;
		if (local402 > 8192) {
			local402 -= 16384;
		}
		if (local402 < -8192) {
			local402 += 16384;
		}
		if (local402 < 0 && local341 > 0 || local402 > 0 && local341 < 0) {
			Static89.anInt2374 = local259;
		}
	}
}
