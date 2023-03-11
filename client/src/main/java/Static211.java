import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public static int anInt3777;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!jd;")
	public static Class13 aClass13_13;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!cc;")
	public static Class32 aClass32_8;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	public static int anInt3780;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray8 = new byte[250][];

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "[I")
	public static final int[] anIntArray230 = new int[1024];

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	public static void method3721() {
		Static39.aClass72_3.method2103();
		Static336.aClass241_5.method6270();
		Static21.aClass55_1.method1782();
		Static359.aClass202_4.method5159();
		Static6.aClass219_1.method5571();
		Static313.aClass107_2.method2761();
		Static39.aClass85_1.method2373();
		Static322.aClass211_2.method5410();
		Static322.aClass128_1.method3395();
		Static56.aClass199_1.method5108();
		Static59.aClass7_1.method241();
		Static320.aClass104_2.method2707();
		Static236.aClass125_1.method3380();
		Static287.aClass233_1.method5881();
		Static363.aClass18_2.method563();
		Static9.aClass213_1.method5426();
		Static278.aClass160_1.method4033();
		Static90.aClass190_3.method4885();
		Static221.aClass150_3.method3733();
		Static367.aClass132_1.method3475();
		Static140.method2627();
		Static91.method1962();
		Static71.method6021();
		if (Static189.aClass127_6 != Static121.aClass127_4) {
			for (@Pc(80) int local80 = 0; local80 < Static26.aByteArrayArray3.length; local80++) {
				Static26.aByteArrayArray3[local80] = null;
			}
			Static50.anInt1332 = 0;
		}
		Static286.method4921();
		Static273.method4627();
		Static369.method6217();
		Static192.method3508();
		Static161.method2969();
		Static198.aClass98_30.method2614();
		Static190.aClass19_8.method2903();
		Static261.aClass116_7.method3153();
		Static194.method3541();
		Static342.aClass197_77.method5068();
		Static34.aClass197_67.method5068();
		Static289.aClass197_71.method5068();
		Static354.aClass197_9.method5068();
		Static85.aClass197_21.method5068();
		Static288.aClass197_70.method5068();
		Static101.aClass197_23.method5068();
		Static237.aClass197_63.method5068();
		Static30.aClass197_5.method5068();
		Static324.aClass197_86.method5068();
		Static75.aClass197_18.method5068();
		Static216.aClass197_58.method5068();
		Static195.aClass197_54.method5068();
		Static255.aClass197_64.method5068();
		Static133.aClass197_32.method5068();
		Static120.aClass197_28.method5068();
		Static391.aClass197_96.method5068();
		Static226.aClass197_61.method5068();
		Static216.aClass197_57.method5068();
		Static61.aClass197_12.method5068();
		Static139.aClass197_35.method5068();
		Static173.aClass197_45.method5068();
		Static294.aClass197_75.method5068();
		Static389.aClass197_66.method5068();
		Static385.aClass197_94.method5068();
		Static139.aClass197_34.method5068();
		Static235.aClass197_47.method5068();
		Static61.aClass197_11.method5068();
		Static85.aClass197_20.method5068();
		Static306.aClass98_49.method2614();
		Static139.aClass98_18.method2614();
		Static61.aClass98_5.method2614();
		Static210.aClass98_31.method2614();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	public static void method3722(@OriginalArg(1) int arg0) {
		Static77.anInt1763 = -1;
		if (arg0 == 37) {
			Static344.aFloat73 = 3.0F;
		} else if (arg0 == 50) {
			Static344.aFloat73 = 4.0F;
		} else if (arg0 == 75) {
			Static344.aFloat73 = 6.0F;
		} else if (arg0 == 100) {
			Static344.aFloat73 = 8.0F;
		} else if (arg0 == 200) {
			Static344.aFloat73 = 16.0F;
		}
		Static77.anInt1763 = -1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ct;IILclient!nh;Lclient!oe;BII)V")
	public static void method3724(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub5_Sub2_Sub1 arg3, @OriginalArg(4) Class11_Sub5_Sub2_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub19 local7 = new Class2_Sub19();
		local7.anInt2905 = arg6;
		local7.anInt2899 = arg5 * 128;
		local7.anInt2910 = arg1 * 128;
		if (arg0 != null) {
			local7.aClass41_1 = arg0;
			@Pc(33) int local33 = arg0.anInt1356;
			@Pc(36) int local36 = arg0.anInt1327;
			if (arg2 == 1 || arg2 == 3) {
				local33 = arg0.anInt1327;
				local36 = arg0.anInt1356;
			}
			local7.anIntArray181 = arg0.anIntArray93;
			local7.anInt2903 = arg0.anInt1334;
			local7.anInt2896 = (arg5 + local33) * 128;
			local7.anInt2901 = arg0.anInt1307 * 128;
			local7.anInt2904 = (local36 + arg1) * 128;
			local7.anInt2906 = arg0.anInt1320;
			local7.anInt2894 = arg0.anInt1325;
			local7.anInt2897 = arg0.anInt1315;
			if (arg0.anIntArray94 != null) {
				local7.aBoolean204 = true;
				local7.method2941();
			}
			if (local7.anIntArray181 != null) {
				local7.anInt2907 = local7.anInt2903 + (int) ((double) (local7.anInt2897 - local7.anInt2903) * Math.random());
			}
			Static83.aClass135_14.method3540(local7);
		} else if (arg4 != null) {
			local7.aClass11_Sub5_Sub2_Sub2_1 = arg4;
			@Pc(131) Class71 local131 = arg4.aClass71_1;
			if (local131.anIntArray129 != null) {
				local7.aBoolean204 = true;
				local131 = local131.method2093(Static214.aClass226_1);
			}
			if (local131 != null) {
				local7.anInt2904 = (arg1 + local131.anInt2041) * 128;
				local7.anInt2896 = (arg5 + local131.anInt2041) * 128;
				local7.anInt2894 = Static340.method5764(arg4);
				local7.anInt2901 = local131.anInt2022 * 128;
				local7.anInt2906 = local131.anInt2051;
			}
			Static363.aClass135_39.method3540(local7);
		} else if (arg3 != null) {
			local7.aClass11_Sub5_Sub2_Sub1_2 = arg3;
			local7.anInt2896 = (arg5 + arg3.method4328()) * 128;
			local7.anInt2904 = (arg1 + arg3.method4328()) * 128;
			local7.anInt2894 = Static384.method6415(arg3);
			local7.anInt2906 = arg3.anInt4201;
			local7.anInt2901 = arg3.anInt4182 * 128;
			Static232.aClass4_86.method87(local7, (long) arg3.anInt4619);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
	public static void method3725() {
		if (Static86.anInt1870 > 0) {
			Static99.method2144();
		} else {
			Static246.aClass111_2 = Static335.aClass111_4;
			Static335.aClass111_4 = null;
			Static336.method5705(40);
		}
	}
}
