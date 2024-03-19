import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "Lclient!fi;")
	public static Class63 aClass63_4;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "Lclient!qj;")
	public static Class162 aClass162_122;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
	public static int anInt3473;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	public static int anInt3458 = 0;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[100];

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
	public static int anInt3466 = 0;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[200];

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3078(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = local7 * (Static321.aShort88 - Static80.aShort28) / 100 + Static80.aShort28;
		@Pc(40) int local40 = arg1 * local34 >> 8;
		@Pc(46) int local46 = 16384 - arg2 & 0x3FFF;
		@Pc(53) int local53 = 16384 - arg3 & 0x3FFF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = local40;
		if (local46 != 0) {
			local57 = -local40 * Class39.anIntArray88[local46] >> 15;
			local59 = local40 * Class39.anIntArray87[local46] >> 15;
		}
		if (local53 != 0) {
			local55 = local59 * Class39.anIntArray88[local53] >> 15;
			local59 = Class39.anIntArray87[local53] * local59 >> 15;
		}
		Static88.anInt2339 = arg5 - local59;
		Static3.anInt92 = arg6 - local55;
		Static89.anInt2374 = arg3;
		Static138.anInt3429 = arg0 - local57;
		Static130.anInt6778 = arg2;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method3080(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!ro;Z)V")
	public static void method3081(@OriginalArg(1) Class177 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt5822 == 0 ? arg0.anInt5803 : arg0.anInt5822;
		@Pc(27) int local27 = arg0.anInt5842 == 0 ? arg0.anInt5816 : arg0.anInt5842;
		Static271.method4864(arg1, Class1_Sub2_Sub10.lb[arg0.anInt5828 >> 16], local15, local27, arg0.anInt5828);
		if (arg0.aClass177Array8 != null) {
			Static271.method4864(arg1, arg0.aClass177Array8, local15, local27, arg0.anInt5828);
		}
		@Pc(60) Class1_Sub35 local60 = (Class1_Sub35) Static135.aClass183_33.method5053((long) arg0.anInt5828);
		if (local60 != null) {
			Static87.method1940(local15, local27, arg1, local60.anInt6079);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I")
	public static int method3082(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public static void method3083() {
		Static237.anInt5285 = 0;
		Static97.aClass130_9.method3754();
		Static204.aBoolean329 = false;
	}
}
