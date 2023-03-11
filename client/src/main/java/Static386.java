import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "[[S")
	public static final short[][] aShortArrayArray9 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	public static int anInt6737 = 0;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "Lclient!h;")
	public static final Class89 aClass89_236 = new Class89(67, -1);

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public static void method6029() {
		@Pc(7) int local7 = Static31.anInt751;
		@Pc(9) int[] local9 = Static85.anIntArray121;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class11_Sub5_Sub2_Sub1 local19 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static93.method1999(local19, local19.method4328());
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
	public static void method6031() {
		Static253.method4366();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static171.aClass46Array1[local8].method1626();
		}
		Static247.method4299();
		Static211.method3721();
		System.gc();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)I")
	public static int method6032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static365.aClass6Array4 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || Static373.anInt7033 - 1 < local11 || local15 > Static242.anInt4449 - 1) {
			return 0;
		}
		@Pc(51) int local51 = arg2;
		if (arg2 < 3 && (Static359.aByteArrayArrayArray16[1][local11][local15] & 0x2) != 0) {
			local51 = arg2 + 1;
		}
		return Static365.aClass6Array4[local51].method5728(arg0, arg1);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!qg;ZI)Z")
	public static boolean method6033(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.gBit(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(103) int local103;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(117) int local117;
		if (local8 == 0) {
			if (arg0.gBit(1) != 0) {
				method6033(arg0, arg1);
			}
			local31 = arg0.gBit(6);
			local36 = arg0.gBit(6);
			@Pc(48) boolean local48 = arg0.gBit(1) == 1;
			if (local48) {
				Static52.anIntArray100[Static325.anInt6079++] = arg1;
			}
			if (Static12.aClass11_Sub5_Sub2_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(75) Class11_Sub5_Sub2_Sub1 local75 = Static12.aClass11_Sub5_Sub2_Sub1Array1[arg1] = new Class11_Sub5_Sub2_Sub1();
			local75.anInt4619 = arg1;
			if (Static231.aClass2_Sub4Array1[arg1] != null) {
				local75.method4066(Static231.aClass2_Sub4Array1[arg1]);
			}
			local75.method4330(Static324.anIntArray410[arg1]);
			local75.anInt4611 = Static225.anIntArray260[arg1];
			local103 = Static360.anIntArray422[arg1];
			local107 = local103 >> 28;
			local113 = local103 >> 14 & 0xFF;
			local117 = local103 & 0xFF;
			local75.aByteArray51[0] = Static335.aByteArray92[arg1];
			local75.aByte78 = (byte) local107;
			local75.method4064(local31 + (local113 << 6) - Static164.anInt3140, -Static148.anInt2719 + local36 + (local117 << 6));
			local75.aBoolean276 = false;
			return true;
		} else if (local8 == 1) {
			local31 = arg0.gBit(2);
			local36 = Static360.anIntArray422[arg1];
			Static360.anIntArray422[arg1] = ((local31 + (local36 >> 28) & 0x3) << 28) + (local36 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(201) int local201;
			@Pc(205) int local205;
			if (local8 != 2) {
				local31 = arg0.gBit(18);
				local36 = local31 >> 16;
				local201 = local31 >> 8 & 0xFF;
				local205 = local31 & 0xFF;
				local103 = Static360.anIntArray422[arg1];
				local107 = local36 + (local103 >> 28) & 0x3;
				local113 = local201 + (local103 >> 14) & 0xFF;
				local117 = local205 + local103 & 0xFF;
				Static360.anIntArray422[arg1] = (local113 << 14) + (local107 << 28) + local117;
				return false;
			}
			local31 = arg0.gBit(5);
			local36 = local31 >> 3;
			local201 = local31 & 0x7;
			local205 = Static360.anIntArray422[arg1];
			local103 = (local205 >> 28) + local36 & 0x3;
			local107 = local205 >> 14 & 0xFF;
			local113 = local205 & 0xFF;
			if (local201 == 0) {
				local107--;
				local113--;
			}
			if (local201 == 1) {
				local113--;
			}
			if (local201 == 2) {
				local113--;
				local107++;
			}
			if (local201 == 3) {
				local107--;
			}
			if (local201 == 4) {
				local107++;
			}
			if (local201 == 5) {
				local107--;
				local113++;
			}
			if (local201 == 6) {
				local113++;
			}
			if (local201 == 7) {
				local107++;
				local113++;
			}
			Static360.anIntArray422[arg1] = (local107 << 14) + (local103 << 28) + local113;
			return false;
		}
	}
}
