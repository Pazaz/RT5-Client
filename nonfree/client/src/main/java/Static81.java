import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cka", name = "x", descriptor = "[Lclient!hv;")
	public static Class8_Sub5[] aClass8_Sub5Array1;

	@OriginalMember(owner = "client!cka", name = "q", descriptor = "I")
	public static int anInt1644;

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IB)V")
	public static void method1586(@OriginalArg(0) int arg0) {
		if (Static283.anInt4574 == arg0) {
			return;
		}
		if (arg0 == 14 || arg0 == 15) {
			Static670.method8735();
		}
		if (arg0 != 14 && Static467.aClass348_2 != null) {
			Static467.aClass348_2.method7926();
			Static467.aClass348_2 = null;
		}
		if (arg0 == 3) {
			Static456.method6228(Static65.aClass3_1.anInt88 != Static377.anInt5930);
		}
		if (arg0 == 7) {
			Static25.method688(Static65.aClass3_1.anInt82 != Static377.anInt5930);
		}
		if (arg0 == 5 || arg0 == 13) {
			Static369.method3852();
		} else if (arg0 == 6 || arg0 == 9 && Static283.anInt4574 != 10) {
			Static670.method8735();
		}
		if (Static594.method7782(Static283.anInt4574)) {
			Static6.aClass330_1.anInt8555 = 2;
			Static20.aClass330_3.anInt8555 = 2;
			Static459.aClass330_91.anInt8555 = 2;
			Static333.aClass330_66.anInt8555 = 2;
			Static380.aClass330_79.anInt8555 = 2;
			Static668.aClass330_119.anInt8555 = 2;
			Static271.aClass330_59.anInt8555 = 2;
		}
		if (Static594.method7782(arg0)) {
			Static593.anInt8763 = 0;
			Static357.anInt6508 = 1;
			Static440.anInt6683 = 1;
			Static213.anInt3472 = 0;
			Static13.anInt150 = 0;
			Static668.method8700(true);
			Static6.aClass330_1.anInt8555 = 1;
			Static20.aClass330_3.anInt8555 = 1;
			Static459.aClass330_91.anInt8555 = 1;
			Static333.aClass330_66.anInt8555 = 1;
			Static380.aClass330_79.anInt8555 = 1;
			Static668.aClass330_119.anInt8555 = 1;
			Static271.aClass330_59.anInt8555 = 1;
		}
		if (arg0 == 12 || arg0 == 3) {
			Static314.method4562();
		}
		@Pc(213) boolean local213 = arg0 == 2 || Static41.method1027(arg0) || Static620.method8321(arg0);
		@Pc(235) boolean local235 = Static283.anInt4574 == 2 || Static41.method1027(Static283.anInt4574) || Static620.method8321(Static283.anInt4574);
		if (local235 != local213) {
			if (local213) {
				Static588.anInt8692 = Static597.anInt8821;
				if (Static400.aClass2_Sub34_28.aClass57_Sub25_4.method7208() == 0) {
					Static312.method4541();
				} else {
					Static57.method1225(Static597.anInt8821, Static400.aClass2_Sub34_28.aClass57_Sub25_4.method7208(), Static398.aClass330_81);
					Static550.method7266();
				}
				Static500.aClass295_3.method6626(false);
			} else {
				Static312.method4541();
				Static500.aClass295_3.method6626(true);
			}
		}
		if (Static594.method7782(arg0) || arg0 == 14 || arg0 == 15) {
			Static163.aClass19_17.method7969();
		}
		Static283.anInt4574 = arg0;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)Lclient!aj;")
	public static Class2_Sub2_Sub2 method1587() {
		@Pc(17) Class2_Sub2_Sub2 local17 = (Class2_Sub2_Sub2) Static138.aClass192_6.method4352();
		if (local17 != null) {
			local17.method9457();
			local17.method9260();
			return local17;
		}
		do {
			local17 = (Class2_Sub2_Sub2) Static59.aClass192_9.method4352();
			if (local17 == null) {
				return null;
			}
			if (local17.method201() > Static588.method7715()) {
				return null;
			}
			local17.method9457();
			local17.method9260();
		} while ((local17.aLong325 & Long.MIN_VALUE) == 0L);
		return local17;
	}

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "(I)V")
	public static void method1589() {
		Static345.method5049();
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ZI)V")
	public static void method1591(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class2_Sub19 local8 = Static273.method3962();
		local8.aClass2_Sub21_Sub2_1.method7389(Static572.aClass167_58.anInt3973);
		local8.aClass2_Sub21_Sub2_1.method7373(0);
		@Pc(25) int local25 = local8.aClass2_Sub21_Sub2_1.anInt8388;
		local8.aClass2_Sub21_Sub2_1.method7373(667);
		@Pc(38) int[] local38 = Static664.method8652(local8);
		@Pc(42) int local42 = local8.aClass2_Sub21_Sub2_1.anInt8388;
		local8.aClass2_Sub21_Sub2_1.method7391(arg0);
		local8.aClass2_Sub21_Sub2_1.method7373(Static323.anInt5121);
		local8.aClass2_Sub21_Sub2_1.method7391(arg2);
		local8.aClass2_Sub21_Sub2_1.method7363(Static416.aLong208);
		local8.aClass2_Sub21_Sub2_1.method7389(Static51.anInt1052);
		local8.aClass2_Sub21_Sub2_1.method7389(Static392.aClass377_4.anInt9720);
		Static176.method6690(local8.aClass2_Sub21_Sub2_1);
		@Pc(81) String local81 = Static389.aString64;
		local8.aClass2_Sub21_Sub2_1.method7389(local81 == null ? 0 : 1);
		if (local81 != null) {
			local8.aClass2_Sub21_Sub2_1.method7391(local81);
		}
		local8.aClass2_Sub21_Sub2_1.method7389(arg1);
		local8.aClass2_Sub21_Sub2_1.method7389(arg3 ? 1 : 0);
		local8.aClass2_Sub21_Sub2_1.anInt8388 += 7;
		local8.aClass2_Sub21_Sub2_1.method7366(local38, local42, local8.aClass2_Sub21_Sub2_1.anInt8388);
		local8.aClass2_Sub21_Sub2_1.method7357(local8.aClass2_Sub21_Sub2_1.anInt8388 - local25);
		Static405.aClass153_1.method3275(local8);
		Static720.anInt10865 = 0;
		Static580.anInt8621 = -3;
		Static654.anInt9739 = 0;
		Static6.anInt95 = 1;
		if (arg1 < 13) {
			Static477.aBoolean543 = true;
			Static358.method9190();
		}
	}
}
