import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!vg", name = "Kb", descriptor = "[[[Lclient!pm;")
	public static Class154[][][] aClass154ArrayArrayArray3;

	@OriginalMember(owner = "client!vg", name = "Lb", descriptor = "I")
	public static int anInt6823;

	@OriginalMember(owner = "client!vg", name = "Wb", descriptor = "Lclient!r;")
	public static Class167 aClass167_7;

	@OriginalMember(owner = "client!vg", name = "Xb", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!vg", name = "Qb", descriptor = "I")
	public static int anInt6828 = 0;

	@OriginalMember(owner = "client!vg", name = "Vb", descriptor = "I")
	public static int anInt6833 = -1;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)I")
	public static int method5788(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static325.method5658();
		for (@Pc(20) Class1_Sub34 local20 = arg0 ? (Class1_Sub34) Static72.aClass183_6.method5052() : (Class1_Sub34) Static72.aClass183_6.method5050(); local20 != null; local20 = (Class1_Sub34) Static72.aClass183_6.method5050()) {
			if ((local20.aLong190 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local20.aLong190 & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) local20.aLong235;
					Static78.anIntArray137[local42] = Static128.anIntArray239[local42];
					local20.method6172();
					return local42;
				}
				local20.method6172();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(JI)V")
	public static void method5790(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static341.anInt7192 + Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027;
		@Pc(20) int local20 = Static205.anInt4774 + Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032;
		if (Static142.anInt3529 - local10 < -500 || Static142.anInt3529 - local10 > 500 || Static12.anInt536 - local20 < -500 || Static12.anInt536 - local20 > 500) {
			Static12.anInt536 = local20;
			Static142.anInt3529 = local10;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (local10 != Static142.anInt3529) {
			local67 = local10 - Static142.anInt3529;
			local75 = (int) (arg0 * (long) local67 / 320L);
			if (local67 > 0) {
				if (local75 == 0) {
					local75 = 1;
				} else if (local75 > local67) {
					local75 = local67;
				}
			} else if (local75 == 0) {
				local75 = -1;
			} else if (local67 > local75) {
				local75 = local67;
			}
			Static142.anInt3529 += local75;
		}
		if (Static12.anInt536 != local20) {
			local67 = local20 - Static12.anInt536;
			local75 = (int) ((long) local67 * arg0 / 320L);
			if (local67 <= 0) {
				if (local75 == 0) {
					local75 = -1;
				} else if (local75 < local67) {
					local75 = local67;
				}
			} else if (local75 == 0) {
				local75 = 1;
			} else if (local75 > local67) {
				local75 = local67;
			}
			Static12.anInt536 += local75;
		}
		if (!Static69.aBoolean133) {
			Static189.aFloat55 += (float) arg0 * Static220.aFloat63 / 6.0F;
			Static188.aFloat17 += (float) arg0 * Static164.aFloat50 / 6.0F;
		}
		Static273.method4900();
	}

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "(B)V")
	public static void method5795() {
		Static318.anInt6552 = 0;
		Static15.anInt631 = 0;
		Static326.method5667();
		Static221.method4301();
		Static296.method5228();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static15.anInt631; local21++) {
			local27 = Static305.anIntArray489[local21];
			if (Static84.aClass7_Sub1_Sub1_Sub1Array1[local27].anInt7079 != Static197.anInt4521) {
				if (Static84.aClass7_Sub1_Sub1_Sub1Array1[local27].aClass75_1.method2058()) {
					Static305.method5378(Static84.aClass7_Sub1_Sub1_Sub1Array1[local27]);
				}
				Static84.aClass7_Sub1_Sub1_Sub1Array1[local27].method330(null);
				Static84.aClass7_Sub1_Sub1_Sub1Array1[local27] = null;
			}
		}
		if (Static299.aClass1_Sub16_Sub2_3.anInt6813 != Static200.anInt4591) {
			throw new RuntimeException("gnp1 pos:" + Static299.aClass1_Sub16_Sub2_3.anInt6813 + " psize:" + Static200.anInt4591);
		}
		for (local27 = 0; local27 < Static49.anInt1559; local27++) {
			if (Static84.aClass7_Sub1_Sub1_Sub1Array1[Static185.anIntArray309[local27]] == null) {
				throw new RuntimeException("gnp2 pos:" + local27 + " size:" + Static49.anInt1559);
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIZLclient!ro;)V")
	public static void method5796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class177 arg3) {
		@Pc(8) int local8 = arg3.anInt5803;
		if (arg3.aByte55 == 0) {
			arg3.anInt5803 = arg3.anInt5818;
		} else if (arg3.aByte55 == 1) {
			arg3.anInt5803 = arg1 - arg3.anInt5818;
		} else if (arg3.aByte55 == 2) {
			arg3.anInt5803 = arg1 * arg3.anInt5818 >> 14;
		} else if (arg3.aByte55 == 3) {
			if (arg3.anInt5838 == 2) {
				arg3.anInt5803 = arg3.anInt5818 * 32 + arg3.anInt5766 * (arg3.anInt5818 - 1);
			} else if (arg3.anInt5838 == 7) {
				arg3.anInt5803 = arg3.anInt5818 * 115 + (arg3.anInt5818 - 1) * arg3.anInt5766;
			}
		}
		@Pc(101) int local101 = arg3.anInt5816;
		if (arg3.aByte54 == 0) {
			arg3.anInt5816 = arg3.anInt5763;
		} else if (arg3.aByte54 == 1) {
			arg3.anInt5816 = arg0 - arg3.anInt5763;
		} else if (arg3.aByte54 == 2) {
			arg3.anInt5816 = arg3.anInt5763 * arg0 >> 14;
		} else if (arg3.aByte54 == 3) {
			if (arg3.anInt5838 == 2) {
				arg3.anInt5816 = arg3.anInt5763 * 32 + (arg3.anInt5763 - 1) * arg3.anInt5805;
			} else if (arg3.anInt5838 == 7) {
				arg3.anInt5816 = (arg3.anInt5763 - 1) * arg3.anInt5805 + arg3.anInt5763 * 12;
			}
		}
		if (arg3.aByte55 == 4) {
			arg3.anInt5803 = arg3.anInt5817 * arg3.anInt5816 / arg3.anInt5797;
		}
		if (arg3.aByte54 == 4) {
			arg3.anInt5816 = arg3.anInt5803 * arg3.anInt5797 / arg3.anInt5817;
		}
		if (Static278.aBoolean279 && (Static37.method930(arg3).anInt6604 != 0 || arg3.anInt5838 == 0)) {
			if (arg3.anInt5816 < 5 && arg3.anInt5803 < 5) {
				arg3.anInt5816 = 5;
				arg3.anInt5803 = 5;
			} else {
				if (arg3.anInt5803 <= 0) {
					arg3.anInt5803 = 5;
				}
				if (arg3.anInt5816 <= 0) {
					arg3.anInt5816 = 5;
				}
			}
		}
		if (arg3.anInt5819 == 1337) {
			Static206.aClass177_14 = arg3;
		}
		if (arg2 && arg3.anObjectArray18 != null && (local8 != arg3.anInt5803 || local101 != arg3.anInt5816)) {
			@Pc(288) Class1_Sub15 local288 = new Class1_Sub15();
			local288.anObjectArray4 = arg3.anObjectArray18;
			local288.aClass177_9 = arg3;
			Static138.aClass130_20.method3760(local288);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ro;I)V")
	public static void method5799(@OriginalArg(0) Class177 arg0) {
		@Pc(7) Class177 local7 = Static14.method411(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = Static350.anInt7318;
			local13 = Static107.anInt2674;
		} else {
			local13 = local7.anInt5803;
			local11 = local7.anInt5816;
		}
		method5796(local11, local13, false, arg0);
		Static284.method5097(local13, local11, arg0);
	}
}
