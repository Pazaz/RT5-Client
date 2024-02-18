import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_47 = new Class345(5, 4);

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_48 = new Class345(45, 7);

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_49 = new Class345(75, 4);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < 1 || arg0 < 1 || Static720.anInt10859 - 2 < arg3 || Static501.anInt7568 - 2 < arg0) {
			return;
		}
		@Pc(39) int local39 = arg6;
		if (arg6 < 3 && Static441.method5968(arg0, arg3)) {
			local39 = arg6 + 1;
		}
		if (Static400.aClass2_Sub34_28.aClass57_Sub19_2.method5960() == 0 && !Static696.method9036(arg0, Static164.anInt2808, arg3, local39)) {
			return;
		}
		if (Static334.aClass291ArrayArrayArray1 == null) {
			return;
		}
		Static2.aClass306_Sub1_1.method7901(arg5, arg0, Static577.aClass110Array1[arg6], arg6, arg3, Static163.aClass19_17);
		if (arg7 >= 0) {
			@Pc(93) int local93 = Static400.aClass2_Sub34_28.aClass57_Sub6_1.method2714();
			Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub6_1);
			Static2.aClass306_Sub1_1.method7894(arg1, arg7, Static577.aClass110Array1[arg6], arg0, Static163.aClass19_17, arg3, arg2, local39, arg6, arg4);
			Static400.aClass2_Sub34_28.method5104(local93, Static400.aClass2_Sub34_28.aClass57_Sub6_1);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)Z")
	public static boolean method3424(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(19) Class54 local19 = Static354.aClass142_4.method3063(arg0, 61);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local19.method1304(arg1);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ge;B)Lclient!pi;")
	public static Class39 method3425(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(7) int local7 = arg0.method7396();
		@Pc(19) Class155 local19 = Static471.method6409(local7);
		@Pc(21) Class39 local21 = null;
		if (Static458.aClass155_31 == local19) {
			local21 = new Class39_Sub16(arg0);
		} else if (Static569.aClass155_38 == local19) {
			local21 = new Class39_Sub3(arg0);
		} else if (Static204.aClass155_14 == local19) {
			local21 = new Class39_Sub7(arg0);
		} else if (local19 == Static586.aClass155_40) {
			local21 = new Class39_Sub13(arg0);
		} else if (Static432.aClass155_3 == local19) {
			local21 = new Class39_Sub14(arg0);
		} else if (Static177.aClass155_13 == local19) {
			local21 = new Class39_Sub9(arg0);
		} else if (local19 == Static418.aClass155_42) {
			local21 = new Class39_Sub15(arg0);
		} else if (local19 == Static205.aClass155_15) {
			local21 = new Class39_Sub1_Sub1(arg0);
		} else if (local19 == Static119.aClass155_11) {
			local21 = new Class39_Sub6(arg0);
		} else if (local19 == Static512.aClass155_35) {
			local21 = new Class39_Sub5(arg0);
		} else if (Static289.aClass155_19 == local19) {
			local21 = new Class39_Sub18(arg0);
		} else if (local19 == Static557.aClass155_37) {
			local21 = new Class39_Sub11(arg0);
		} else if (Static512.aClass155_34 == local19) {
			local21 = new Class39_Sub4(arg0);
		} else if (local19 == Static65.aClass155_8) {
			local21 = new Class39_Sub20(arg0);
		} else if (Static357.aClass155_30 == local19) {
			local21 = new Class39_Sub21(arg0);
		} else if (local19 == Static12.aClass155_24) {
			local21 = new Class39_Sub2(arg0);
		} else if (local19 == Static384.aClass155_26) {
			local21 = new Class39_Sub17(arg0);
		} else if (local19 == Static517.aClass155_36) {
			local21 = new Class39_Sub10(arg0);
		} else if (Static233.aClass155_17 == local19) {
			local21 = new Class39_Sub12(arg0);
		} else if (Static418.aClass155_41 == local19) {
			local21 = new Class39_Sub1_Sub2(arg0);
		} else if (Static470.aClass155_32 == local19) {
			local21 = new Class39_Sub23(arg0, 1, 1);
		} else if (local19 == Static488.aClass155_33) {
			local21 = new Class39_Sub23(arg0, 0, 1);
		} else if (local19 == Static126.aClass155_12) {
			local21 = new Class39_Sub23(arg0, 0, 0);
		} else if (local19 == Static308.aClass155_21) {
			local21 = new Class39_Sub23(arg0, 1, 0);
		} else if (Static719.aClass155_45 == local19) {
			local21 = new Class39_Sub19(arg0, false);
		} else if (Static682.aClass155_43 == local19) {
			local21 = new Class39_Sub19(arg0, true);
		} else if (Static330.aClass155_23 == local19) {
			local21 = new Class39_Sub8(arg0);
		} else if (local19 == Static212.aClass155_16) {
			local21 = new Class39_Sub22(arg0);
		}
		return local21;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)I")
	public static int method3427(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 >>> 31;
		return (local13 + arg1) / arg0 - local13;
	}
}
