import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "Lclient!nr;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "Lclient!um;")
	public static final Class1_Sub39 aClass1_Sub39_1 = new Class1_Sub39(0, -1);

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString27 = "Loaded update list";

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "[B")
	public static final byte[] aByteArray3 = new byte[520];

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "[I")
	public static final int[] anIntArray50 = new int[14];

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString28 = "Stellar Dawn is loading - please wait...";

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V")
	public static void method512(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(6, arg0);
		local8.method2536();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!qj;I)V")
	public static void method513(@OriginalArg(0) Class162 arg0) {
		Static323.aClass162_226 = arg0;
		Static49.anInt1560 = Static323.aClass162_226.method4640(19);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIBII)V")
	public static void method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static239.anInt5299 <= arg1 - arg4 && Static179.anInt4229 >= arg1 + arg4 && arg3 - arg4 >= Static180.anInt4240 && arg4 + arg3 <= Static197.anInt4520) {
			Static235.method4609(arg4, arg0, arg3, arg1, arg5, arg2);
		} else {
			Static255.method4696(arg3, arg4, arg2, arg1, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!fg;IIBI)V")
	public static void method524(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class83 local17 = arg0.method5982();
		@Pc(27) int local27 = arg0.anInt7059 - arg0.aClass175_7.anInt5701 & 0x3FFF;
		if (arg3 == -1) {
			if (local27 != 0 || arg0.anInt7085 > 25) {
				arg0.aBoolean506 = false;
				if (arg1 < 0 && local17.anInt2832 != -1) {
					arg0.anInt7053 = local17.anInt2832;
				} else if (arg1 <= 0 || local17.anInt2828 == -1) {
					arg0.anInt7053 = local17.anInt2836;
				} else {
					arg0.anInt7053 = local17.anInt2828;
				}
			} else if (!arg0.aBoolean506 || !local17.method2373(arg0.anInt7053)) {
				arg0.anInt7053 = local17.method2370();
				arg0.aBoolean506 = arg0.anInt7053 != -1;
			}
		} else if (arg0.anInt7054 != -1 && (local27 >= 10240 || local27 <= 2048)) {
			@Pc(275) int local275 = Static120.anIntArray223[arg2] - arg0.aClass175_7.anInt5701 & 0x3FFF;
			arg0.aBoolean506 = false;
			if (arg3 == 2 && local17.anInt2847 != -1) {
				if (local275 > 2048 && local275 <= 6144 && local17.anInt2831 != -1) {
					arg0.anInt7053 = local17.anInt2831;
				} else if (local275 >= 10240 && local275 < 14336 && local17.anInt2853 != -1) {
					arg0.anInt7053 = local17.anInt2853;
				} else if (local275 <= 6144 || local275 >= 10240 || local17.anInt2833 == -1) {
					arg0.anInt7053 = local17.anInt2847;
				} else {
					arg0.anInt7053 = local17.anInt2833;
				}
			} else if (arg3 == 0 && local17.anInt2845 != -1) {
				if (local275 > 2048 && local275 <= 6144 && local17.anInt2848 != -1) {
					arg0.anInt7053 = local17.anInt2848;
				} else if (local275 >= 10240 && local275 < 14336 && local17.anInt2854 != -1) {
					arg0.anInt7053 = local17.anInt2854;
				} else if (local275 <= 6144 || local275 >= 10240 || local17.anInt2855 == -1) {
					arg0.anInt7053 = local17.anInt2845;
				} else {
					arg0.anInt7053 = local17.anInt2855;
				}
			} else if (local275 > 2048 && local275 <= 6144 && local17.anInt2850 != -1) {
				arg0.anInt7053 = local17.anInt2850;
			} else if (local275 >= 10240 && local275 < 14336 && local17.anInt2827 != -1) {
				arg0.anInt7053 = local17.anInt2827;
			} else if (local275 <= 6144 || local275 >= 10240 || local17.anInt2823 == -1) {
				arg0.anInt7053 = local17.anInt2836;
			} else {
				arg0.anInt7053 = local17.anInt2823;
			}
		} else if (local27 == 0 && arg0.anInt7085 <= 25) {
			arg0.aBoolean506 = false;
			if (arg3 == 2 && local17.anInt2847 != -1) {
				arg0.anInt7053 = local17.anInt2847;
			} else if (arg3 == 0 && local17.anInt2845 != -1) {
				arg0.anInt7053 = local17.anInt2845;
			} else {
				arg0.anInt7053 = local17.anInt2836;
			}
		} else {
			if (arg3 == 2 && local17.anInt2847 != -1) {
				if (arg1 < 0 && local17.anInt2857 != -1) {
					arg0.anInt7053 = local17.anInt2857;
				} else if (arg1 <= 0 || local17.anInt2826 == -1) {
					arg0.anInt7053 = local17.anInt2847;
				} else {
					arg0.anInt7053 = local17.anInt2826;
				}
			} else if (arg3 == 0 && local17.anInt2845 != -1) {
				if (arg1 < 0 && local17.anInt2851 != -1) {
					arg0.anInt7053 = local17.anInt2851;
				} else if (arg1 <= 0 || local17.anInt2839 == -1) {
					arg0.anInt7053 = local17.anInt2845;
				} else {
					arg0.anInt7053 = local17.anInt2839;
				}
			} else if (arg1 < 0 && local17.anInt2858 != -1) {
				arg0.anInt7053 = local17.anInt2858;
			} else if (arg1 <= 0 || local17.anInt2835 == -1) {
				arg0.anInt7053 = local17.anInt2836;
			} else {
				arg0.anInt7053 = local17.anInt2835;
			}
			arg0.aBoolean506 = false;
		}
	}
}
