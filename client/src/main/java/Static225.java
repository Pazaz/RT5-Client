import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!n", name = "w", descriptor = "[I")
	public static final int[] anIntArray259 = new int[14];

	@OriginalMember(owner = "client!n", name = "x", descriptor = "I")
	public static int anInt3979 = -1;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "[I")
	public static final int[] anIntArray260 = new int[2048];

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!wm;IILclient!on;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method3954(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static16.aClass19_10 = arg0;
		Static292.anInt5512 = arg1;
		Static51.aClass14_2 = arg3;
		Static161.aBoolean208 = Static16.aClass19_10.method2886() > 0;
		Static248.anInt4650 = arg4 >> Static322.anInt6029;
		Static211.anInt3780 = arg6 >> Static322.anInt6029;
		Static353.anInt6532 = arg4;
		Static359.anInt6697 = arg6;
		Static117.anInt2375 = arg5;
		Static162.anInt2960 = Static248.anInt4650 - Static212.anInt3788;
		if (Static162.anInt2960 < 0) {
			Static77.anInt1756 = -Static162.anInt2960;
			Static162.anInt2960 = 0;
		} else {
			Static77.anInt1756 = 0;
		}
		Static222.anInt3949 = Static211.anInt3780 - Static212.anInt3788;
		if (Static222.anInt3949 < 0) {
			Static329.anInt6167 = -Static222.anInt3949;
			Static222.anInt3949 = 0;
		} else {
			Static329.anInt6167 = 0;
		}
		Static221.anInt4637 = Static248.anInt4650 + Static212.anInt3788;
		if (Static221.anInt4637 > Static72.anInt1684) {
			Static221.anInt4637 = Static72.anInt1684;
		}
		Static29.anInt722 = Static211.anInt3780 + Static212.anInt3788;
		if (Static29.anInt722 > Static210.anInt3773) {
			Static29.anInt722 = Static210.anInt3773;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static212.anInt3788 + Static212.anInt3788 + 2; local74++) {
			for (local77 = 0; local77 < Static212.anInt3788 + Static212.anInt3788 + 2; local77++) {
				local84 = Static248.anInt4650 + local74 - Static212.anInt3788;
				local90 = Static211.anInt3780 + local77 - Static212.anInt3788;
				if (local84 >= 0 && local90 >= 0 && local84 < Static72.anInt1684 && local90 < Static210.anInt3773) {
					@Pc(104) int local104 = local84 << Static322.anInt6029;
					@Pc(108) int local108 = local90 << Static322.anInt6029;
					@Pc(120) int local120 = Static330.aClass6Array3[Static330.aClass6Array3.length - 1].method5719(local84, local90) - 1000;
					@Pc(140) int local140 = Static186.aClass6Array2 == null ? Static330.aClass6Array3[0].method5719(local84, local90) + Static256.anInt4716 : Static186.aClass6Array2[0].method5719(local84, local90) + Static256.anInt4716;
					Static364.aBooleanArrayArray5[local74][local77] = Static16.aClass19_10.method2841(local104, local120, local108, local104, local140, local108);
				} else {
					Static364.aBooleanArrayArray5[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static212.anInt3788 + Static212.anInt3788 + 1; local77++) {
			for (local84 = 0; local84 < Static212.anInt3788 + Static212.anInt3788 + 1; local84++) {
				Static6.aBooleanArrayArray1[local77][local84] = Static364.aBooleanArrayArray5[local77][local84] || Static364.aBooleanArrayArray5[local77 + 1][local84] || Static364.aBooleanArrayArray5[local77][local84 + 1] || Static364.aBooleanArrayArray5[local77 + 1][local84 + 1];
			}
		}
		Static182.anIntArray205 = arg8;
		Static160.anIntArray185 = arg9;
		Static375.anIntArray483 = arg10;
		Static96.anIntArray126 = arg11;
		Static356.anIntArray462 = arg12;
		Static79.method1869();
		Static286.method4920();
		for (@Pc(256) Class12_Sub4 local256 = (Class12_Sub4) Static34.aClass36_6.method1415(); local256 != null; local256 = (Class12_Sub4) Static34.aClass36_6.method1420()) {
			local256.method5684();
			Static73.method1822(local256);
		}
		if (Static161.aBoolean208) {
			for (local90 = 0; local90 < Static164.anInt3139; local90++) {
				Static306.aClass2_Sub26_Sub1Array2[local90].method4153(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static16.aClass19_10.method2865(0);
			if (Static163.aClass15_1 == null || Static163.aClass15_1 instanceof Class15_Sub2) {
				Static163.aClass15_1 = new Class15_Sub1();
			}
		} else if (Static163.aClass15_1 == null || Static163.aClass15_1 instanceof Class15_Sub1) {
			Static163.aClass15_1 = new Class15_Sub2();
		}
		Static163.aClass15_1.method1582(arg2);
		Static163.aClass15_1.method1586();
		if (Static90.aClass67ArrayArrayArray4 != null) {
			Static341.method5767(true);
			Static163.aClass15_1.method1578(22);
			Static391.method6458(arg2, null, 0, (byte) 0, arg15, arg16);
			Static163.aClass15_1.method1586();
			Static163.aClass15_1.method1578(23);
			Static341.method5767(false);
		}
		Static391.method6458(arg2, arg7, arg13, arg14, arg15, arg16);
		Static163.aClass15_1.method1586();
		Static163.aClass15_1.method1585();
		Static163.aClass15_1.method1586();
		if (arg2 > 1) {
			Static16.aClass19_10.method2893(0);
		}
		Static16.aClass19_10.method2834(0, null);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	public static void method3955(@OriginalArg(0) int arg0) {
		anInt3979 = arg0;
		Static236.anInt4301 = -1;
		Static90.anInt6637 = 100;
		Static243.anInt4495 = 3;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZIIIFII)[[I")
	public static int[][] method3956(@OriginalArg(6) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub3_Sub6 local13 = new Class2_Sub3_Sub6();
		local13.anInt1051 = 8;
		local13.anInt1043 = 3;
		local13.aBoolean85 = false;
		local13.anInt1049 = (int) (arg0 * 4096.0F);
		local13.anInt1050 = 4;
		local13.method6480();
		Static155.method2789(64, 256);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method1308(local9[local40], local40);
		}
		return local9;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void method3957() {
		@Pc(1) Class98 local1 = Static92.aClass98_9;
		synchronized (Static92.aClass98_9) {
			Static92.aClass98_9.method2621();
		}
		local1 = Static349.aClass98_58;
		synchronized (Static349.aClass98_58) {
			Static349.aClass98_58.method2621();
		}
	}
}
