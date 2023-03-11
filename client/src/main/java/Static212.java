import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	public static int anInt3788;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
	public static int anInt3785 = 0;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Lclient!qg;")
	public static final Class2_Sub4_Sub2 aClass2_Sub4_Sub2_3 = new Class2_Sub4_Sub2(5000);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!nk;III)V")
	public static void method3726(@OriginalArg(0) Class161 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class78 local8 = arg0.method4109(Static190.aClass19_8);
		if (local8 == null) {
			return;
		}
		Static190.aClass19_8.method2895(arg1, arg2, arg1 + arg0.anInt4248, arg2 + arg0.anInt4261);
		if (Static146.anInt2703 >= 3) {
			Static190.aClass19_8.method2811(local8, arg1, arg2);
		} else {
			Static12.aClass13_2.method6398((float) arg1 + (float) arg0.anInt4248 / 2.0F, (float) arg2 + (float) arg0.anInt4261 / 2.0F, ((int) -Static277.aFloat67 & 0x3FFF) << 2, local8, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILclient!je;Lclient!wm;Lclient!jg;Lclient!np;I)V")
	public static void method3727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) Class2_Sub20 arg5, @OriginalArg(6) Class164 arg6) {
		@Pc(14) int local14 = arg5.anInt2948 - arg0 / 2 - 5;
		@Pc(18) int local18 = arg2 + 2;
		if (arg6.anInt4437 != 0) {
			arg4.method2868(arg2 + arg1 * arg3.method2948() + 1 - local18, local14, local18, arg6.anInt4437, arg0 + 10);
		}
		if (arg6.anInt4417 != 0) {
			arg4.method2837(local18, local14, arg2 + arg3.method2948() * arg1 + 1 - local18, arg6.anInt4417, arg0 + 10);
		}
		@Pc(70) int local70 = arg6.anInt4431;
		if (arg5.aBoolean207 && arg6.anInt4406 != -1) {
			local70 = arg6.anInt4406;
		}
		for (@Pc(89) int local89 = 0; local89 < arg1; local89++) {
			@Pc(95) String local95 = Static287.aStringArray52[local89];
			if (arg1 - 1 > local89) {
				local95 = local95.substring(0, local95.length() - 4);
			}
			arg3.method2951(arg4, local95, arg5.anInt2948, arg2, local70);
			arg2 += arg3.method2948();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)Lclient!je;")
	public static Class113 method3729(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static344.aFloat72 == 3.0D) {
				return Static74.aClass113_4;
			}
			if ((double) Static344.aFloat72 == 4.0D) {
				return Static107.aClass113_5;
			}
			if ((double) Static344.aFloat72 == 6.0D) {
				return Static2.aClass113_1;
			}
			if ((double) Static344.aFloat72 >= 8.0D) {
				return Static175.aClass113_6;
			}
		} else if (arg0 == 1) {
			if ((double) Static344.aFloat72 == 3.0D) {
				return Static2.aClass113_1;
			}
			if ((double) Static344.aFloat72 == 4.0D) {
				return Static175.aClass113_6;
			}
			if ((double) Static344.aFloat72 == 6.0D) {
				return Static249.aClass113_8;
			}
			if ((double) Static344.aFloat72 >= 8.0D) {
				return Static30.aClass113_3;
			}
		} else if (arg0 == 2) {
			if ((double) Static344.aFloat72 == 3.0D) {
				return Static249.aClass113_8;
			}
			if ((double) Static344.aFloat72 == 4.0D) {
				return Static30.aClass113_3;
			}
			if ((double) Static344.aFloat72 == 6.0D) {
				return Static27.aClass113_2;
			}
			if ((double) Static344.aFloat72 >= 8.0D) {
				return Static369.aClass113_9;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZLclient!ac;Lclient!ac;IBZ)I")
	public static int method3730(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3_Sub1 arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static70.method1786(arg5, arg2, arg3, arg4);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(32) int local32 = Static70.method1786(arg1, arg2, arg3, arg0);
			return arg1 ? -local32 : local32;
		}
	}
}
