import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
	public static int anInt2787;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "[I")
	public static final int[] anIntArray245 = new int[5];

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
	public static int anInt2788 = 0;

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "Lclient!sia;")
	public static Class339 aClass339_15 = new Class339();

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)I")
	public static int method2572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) double local17 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(24) double local24 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(33) double local33 = local24 + Math.random() * (local17 - local24);
		return (int) (Math.pow(2.0D, local33) + 0.5D);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method2574(@OriginalArg(0) Class19 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static137.aBoolean210) {
			local7 = Static130.method2283();
			local9 = Static422.method5771();
		}
		Static97.method1905(Static84.anInt1775 + local9, Static71.anInt1576 - -local7, Static407.anInt6288, arg0, Static682.anInt10295);
		Static180.aClass14_3.method8829(Static71.anInt1576 + local7 + 3, Static84.anInt1775 - (-local9 + -14), Static32.aClass32_24.method877(Static51.anInt1052), -1, -10660793);
		@Pc(69) int local69 = Static189.aClass120_1.method8853() + local7;
		@Pc(76) int local76 = Static189.aClass120_1.method8854() + local9;
		@Pc(80) int local80;
		@Pc(101) int local101;
		if (Static236.aBoolean304) {
			local80 = 0;
			for (@Pc(137) Class2_Sub2_Sub4 local137 = (Class2_Sub2_Sub4) Static350.aClass192_8.method4352(); local137 != null; local137 = (Class2_Sub2_Sub4) Static350.aClass192_8.method4350()) {
				local101 = local9 + Static84.anInt1775 + local80 * 16 + 31;
				if (local137.anInt1534 == 1) {
					Static232.method3387(arg0, Static682.anInt10295, Static407.anInt6288, Static84.anInt1775 + local9, local101, -256, (Class2_Sub2_Sub16) local137.aClass192_3.aClass2_Sub2_36.aClass2_Sub2_66, -1, local76, local7 + Static71.anInt1576, local69);
				} else {
					Static515.method6799(local76, Static682.anInt10295, local101, -256, arg0, local69, -1, Static84.anInt1775 + local9, local7 + Static71.anInt1576, Static407.anInt6288, local137);
				}
				local80++;
			}
			if (Static139.aClass2_Sub2_Sub4_1 != null) {
				Static97.method1905(Static493.anInt7364, Static692.anInt10375, Static25.anInt598, arg0, Static85.anInt10675);
				local80 = 0;
				Static180.aClass14_3.method8829(Static692.anInt10375 + 3, Static493.anInt7364 + 14, Static139.aClass2_Sub2_Sub4_1.aString10, -1, -10660793);
				for (@Pc(239) Class2_Sub2_Sub16 local239 = (Class2_Sub2_Sub16) Static139.aClass2_Sub2_Sub4_1.aClass192_3.method4352(); local239 != null; local239 = (Class2_Sub2_Sub16) Static139.aClass2_Sub2_Sub4_1.aClass192_3.method4350()) {
					@Pc(251) int local251 = local80 * 16 + Static493.anInt7364 + 31;
					local80++;
					Static232.method3387(arg0, Static85.anInt10675, Static25.anInt598, Static493.anInt7364, local251, -256, local239, -1, local76, Static692.anInt10375, local69);
				}
				Static422.method5773(Static692.anInt10375, Static493.anInt7364, Static85.anInt10675, Static25.anInt598);
			}
		} else {
			local80 = 0;
			for (@Pc(85) Class2_Sub2_Sub16 local85 = (Class2_Sub2_Sub16) Static693.aClass339_79.method7699(65280); local85 != null; local85 = (Class2_Sub2_Sub16) Static693.aClass339_79.method7706()) {
				local101 = (Static594.anInt8777 - local80 - 1) * 16 + local9 + Static84.anInt1775 + 31;
				local80++;
				Static232.method3387(arg0, Static682.anInt10295, Static407.anInt6288, Static84.anInt1775 + local9, local101, -256, local85, -1, local76, local7 + Static71.anInt1576, local69);
			}
		}
		Static422.method5773(local7 + Static71.anInt1576, local9 + Static84.anInt1775, Static682.anInt10295, Static407.anInt6288);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)V")
	public static void method2575() {
		if (Static41.method1027(Static283.anInt4574) || Static620.method8321(Static283.anInt4574)) {
			Static127.method2243(Static412.anInt6358, Static170.anInt2864 >> 12, Static110.anInt2186 >> 12);
		} else {
			@Pc(20) int local20 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray879[0] >> 3;
			@Pc(27) int local27 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray878[0] >> 3;
			if (local20 >= 0 && Static720.anInt10859 >> 3 > local20 && local27 >= 0 && Static501.anInt7568 >> 3 > local27) {
				Static127.method2243(Static412.anInt6358, local20, local27);
			} else {
				Static127.method2243(0, Static720.anInt10859 >> 4, Static501.anInt7568 >> 4);
			}
		}
		Static506.method8313();
		Static588.method7713();
		Static683.method8928();
		Static442.method5969();
	}
}
