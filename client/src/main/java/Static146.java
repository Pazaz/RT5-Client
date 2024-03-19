import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "Lclient!ud;")
	public static Class199 aClass199_9;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
	public static int anInt3617;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
	public static int anInt3618;

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "Lclient!pp;")
	public static Class157 aClass157_1;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	public static int anInt3615 = 0;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Z")
	public static boolean aBoolean257 = true;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	public static int anInt3616 = 0;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
	public static int anInt3619 = 2;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBI)Z")
	public static boolean method3193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static62.aByteArrayArrayArray3[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZLclient!fg;Z)V")
	public static void method3194(@OriginalArg(1) Class7_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class83 local9 = arg0.method5982();
		if (arg0.anInt7113 == 0) {
			Static285.anInt6032 = -1;
			Static355.anInt4214 = 0;
			arg0.anInt7106 = 0;
			return;
		}
		if (arg0.anInt7046 != -1 && arg0.anInt7055 == 0) {
			@Pc(40) Class165 local40 = Static231.method4385(arg0.anInt7046);
			if (arg0.anInt7111 > 0 && local40.anInt5567 == 0) {
				Static355.anInt4214 = 0;
				Static285.anInt6032 = -1;
				arg0.anInt7106++;
				return;
			}
			if (arg0.anInt7111 <= 0 && local40.anInt5580 == 0) {
				arg0.anInt7106++;
				Static285.anInt6032 = -1;
				Static355.anInt4214 = 0;
				return;
			}
		}
		if (arg0.anInt7052 != -1 && arg0.anInt7081 <= Static197.anInt4521) {
			@Pc(93) Class122 local93 = Static243.method4561(arg0.anInt7052);
			if (local93.aBoolean295 && local93.anInt4135 != -1) {
				@Pc(105) Class165 local105 = Static231.method4385(local93.anInt4135);
				if (arg0.anInt7111 > 0 && local105.anInt5567 == 0) {
					arg0.anInt7106++;
					Static355.anInt4214 = 0;
					Static285.anInt6032 = -1;
					return;
				}
				if (arg0.anInt7111 <= 0 && local105.anInt5580 == 0) {
					Static355.anInt4214 = 0;
					Static285.anInt6032 = -1;
					arg0.anInt7106++;
					return;
				}
			}
		}
		@Pc(145) int local145 = arg0.anInt7027;
		@Pc(148) int local148 = arg0.anInt7032;
		@Pc(165) int local165 = arg0.anIntArray578[arg0.anInt7113 - 1] * 128 + arg0.method5973() * 64;
		@Pc(181) int local181 = arg0.anIntArray579[arg0.anInt7113 - 1] * 128 + arg0.method5973() * 64;
		if (!arg1 && (local165 - local145 > 256 || local165 - local145 < -256 || local181 - local148 > 256 || local181 - local148 < -256)) {
			Static355.anInt4214 = 0;
			arg0.anInt7027 = local165;
			arg0.anInt7032 = local181;
			Static285.anInt6032 = -1;
			return;
		}
		if (local145 >= local165) {
			if (local165 < local145) {
				if (local181 > local148) {
					arg0.method5985(6144);
				} else if (local181 >= local148) {
					arg0.method5985(4096);
				} else {
					arg0.method5985(2048);
				}
			} else if (local181 > local148) {
				arg0.method5985(8192);
			} else if (local181 < local148) {
				arg0.method5985(0);
			}
		} else if (local148 < local181) {
			arg0.method5985(10240);
		} else if (local148 <= local181) {
			arg0.method5985(12288);
		} else {
			arg0.method5985(14336);
		}
		@Pc(302) int local302 = 4;
		@Pc(304) boolean local304 = true;
		if (arg0 instanceof Class7_Sub1_Sub1_Sub1) {
			local304 = ((Class7_Sub1_Sub1_Sub1) arg0).aClass75_1.aBoolean166;
		}
		if (local304) {
			@Pc(321) int local321 = arg0.anInt7059 - arg0.aClass175_7.anInt5701;
			if (local321 != 0 && arg0.anInt7054 == -1 && arg0.anInt7100 != 0) {
				local302 = 2;
			}
			if (!arg1 && arg0.anInt7113 > 2) {
				local302 = 6;
			}
			if (!arg1 && arg0.anInt7113 > 3) {
				local302 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt7113 > 1) {
				local302 = 6;
			}
			if (!arg1 && arg0.anInt7113 > 2) {
				local302 = 8;
			}
		}
		if (arg0.anInt7106 > 0 && arg0.anInt7113 > 1) {
			arg0.anInt7106--;
			local302 = 8;
		}
		@Pc(400) byte local400 = arg0.aByteArray96[arg0.anInt7113 - 1];
		if (local400 == 2) {
			local302 <<= 0x1;
		} else if (local400 == 0) {
			local302 >>= 0x1;
		}
		if (local9.anInt2825 != -1) {
			local302 <<= 0x7;
			if (arg0.anInt7113 == 1) {
				@Pc(483) int local483 = arg0.anInt7103 * arg0.anInt7103;
				@Pc(505) int local505 = (local165 >= arg0.anInt7027 ? local165 - arg0.anInt7027 : -local165 + arg0.anInt7027) << 7;
				@Pc(527) int local527 = (local181 < arg0.anInt7032 ? arg0.anInt7032 - local181 : -arg0.anInt7032 + local181) << 7;
				@Pc(538) int local538 = local505 <= local527 ? local527 : local505;
				@Pc(545) int local545 = local9.anInt2825 * 2 * local538;
				if (local483 > local545) {
					arg0.anInt7103 /= 2;
				} else if (local483 / 2 > local538) {
					arg0.anInt7103 -= local9.anInt2825;
					if (arg0.anInt7103 < 0) {
						arg0.anInt7103 = 0;
					}
				} else if (arg0.anInt7103 < local302) {
					arg0.anInt7103 += local9.anInt2825;
					if (arg0.anInt7103 > local302) {
						arg0.anInt7103 = local302;
					}
				}
			} else if (arg0.anInt7103 < local302) {
				arg0.anInt7103 += local9.anInt2825;
				if (arg0.anInt7103 > local302) {
					arg0.anInt7103 = local302;
				}
			} else if (arg0.anInt7103 > 0) {
				arg0.anInt7103 -= local9.anInt2825;
				if (arg0.anInt7103 < 0) {
					arg0.anInt7103 = 0;
				}
			}
			local302 = arg0.anInt7103 >> 7;
			if (local302 < 1) {
				local302 = 1;
			}
		}
		Static355.anInt4214 = 0;
		if (local165 > local145) {
			arg0.anInt7027 += local302;
			Static355.anInt4214 |= 0x4;
			if (arg0.anInt7027 > local165) {
				arg0.anInt7027 = local165;
			}
		} else if (local145 > local165) {
			Static355.anInt4214 |= 0x8;
			arg0.anInt7027 -= local302;
			if (local165 > arg0.anInt7027) {
				arg0.anInt7027 = local165;
			}
		}
		if (local181 > local148) {
			arg0.anInt7032 += local302;
			Static355.anInt4214 |= 0x1;
			if (arg0.anInt7032 > local181) {
				arg0.anInt7032 = local181;
			}
		} else if (local148 > local181) {
			Static355.anInt4214 |= 0x2;
			arg0.anInt7032 -= local302;
			if (arg0.anInt7032 < local181) {
				arg0.anInt7032 = local181;
			}
		}
		if (local302 >= 8) {
			Static285.anInt6032 = 2;
		} else {
			Static285.anInt6032 = local400;
		}
		if (local165 == arg0.anInt7027 && local181 == arg0.anInt7032) {
			if (arg0.anInt7111 > 0) {
				arg0.anInt7111--;
			}
			arg0.anInt7113--;
		}
	}
}
