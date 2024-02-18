import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!op", name = "l", descriptor = "[Lclient!eo;")
	public static Class8_Sub2[] aClass8_Sub2Array10;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_212 = new Class225(77, -2);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZIII)V")
	public static void method7641(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 + Static691.anInt10367;
		@Pc(12) int local12 = Static116.anInt2270 + arg1;
		if (Static334.aClass291ArrayArrayArray1 == null || arg2 < 0 || arg1 < 0 || arg2 >= Static720.anInt10859 || Static501.anInt7568 <= arg1 || Static400.aClass2_Sub34_28.aClass57_Sub19_2.method5960() == 0 && arg0 != Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144) {
			return;
		}
		@Pc(67) long local67 = (long) (local12 << 14 | arg0 << 28 | local8);
		@Pc(73) Class2_Sub17 local73 = (Class2_Sub17) Static497.aClass28_35.method738(local67);
		if (local73 == null) {
			Static638.method8398(arg0, arg2, arg1);
			return;
		}
		@Pc(88) Class2_Sub15 local88 = (Class2_Sub15) local73.aClass339_12.method7699(65280);
		if (local88 == null) {
			Static638.method8398(arg0, arg2, arg1);
			return;
		}
		@Pc(103) Class8_Sub2_Sub5_Sub1 local103 = (Class8_Sub2_Sub5_Sub1) Static638.method8398(arg0, arg2, arg1);
		if (local103 == null) {
			local103 = new Class8_Sub2_Sub5_Sub1(arg2 << 9, Static246.aClass178Array1[arg0].method7869(arg1, arg2), arg1 << 9, arg0, arg0);
		} else {
			local103.anInt8878 = local103.anInt8876 = -1;
		}
		local103.anInt8873 = local88.anInt1959;
		local103.anInt8867 = local88.anInt1958;
		label56: while (true) {
			@Pc(146) Class2_Sub15 local146 = (Class2_Sub15) local73.aClass339_12.method7706();
			if (local146 == null) {
				break;
			}
			if (local146.anInt1958 != local103.anInt8867) {
				local103.anInt8874 = local146.anInt1959;
				local103.anInt8878 = local146.anInt1958;
				while (true) {
					@Pc(171) Class2_Sub15 local171 = (Class2_Sub15) local73.aClass339_12.method7706();
					if (local171 == null) {
						break label56;
					}
					if (local103.anInt8867 != local171.anInt1958 && local171.anInt1958 != local103.anInt8878) {
						local103.anInt8872 = local171.anInt1959;
						local103.anInt8876 = local171.anInt1958;
					}
				}
			}
		}
		@Pc(209) int local209 = Static102.method2025(arg0, -29754, (arg1 << 9) + 256, (arg2 << 9) - -256);
		local103.aByte144 = (byte) arg0;
		local103.anInt10691 = local209;
		local103.aByte143 = (byte) arg0;
		local103.anInt10694 = arg1 << 9;
		local103.anInt8885 = 0;
		local103.anInt10690 = arg2 << 9;
		if (Static441.method5968(arg1, arg2)) {
			local103.aByte143++;
		}
		Static157.method2564(arg0, arg2, arg1, local209, local103);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZZ)V")
	public static void method7643() {
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub19_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub19_2);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub4_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub4_2);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub6_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub16_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub23_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub27_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub8_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub7_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub12_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub30_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub24_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub26_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub13_2);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub13_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub28_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub5_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub20_1);
		Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub2_1);
		Static376.method5313();
		Static400.aClass2_Sub34_28.method5104(2, Static400.aClass2_Sub34_28.aClass57_Sub18_1);
		Static400.aClass2_Sub34_28.method5104(1, Static400.aClass2_Sub34_28.aClass57_Sub15_1);
		Static296.method4362();
		Static218.method3187();
		Static284.aBoolean355 = true;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLclient!eba;)I")
	public static int method7644(@OriginalArg(1) Class92 arg0) {
		if (arg0 == Static685.aClass92_16) {
			return 6407;
		} else if (arg0 == Static172.aClass92_8) {
			return 6408;
		} else if (arg0 == Static679.aClass92_15) {
			return 6406;
		} else if (arg0 == Static661.aClass92_10) {
			return 6409;
		} else if (arg0 == Static482.aClass92_13) {
			return 6410;
		} else if (arg0 == Static42.aClass92_3) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!gu;Lclient!ka;Lclient!gu;B)V")
	public static void method7645(@OriginalArg(0) Class152 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class152 arg2) {
		if (arg0.method9111() && arg2.method9111()) {
			@Pc(12) Class69 local12 = arg0.aClass69_4;
			@Pc(15) Class69 local15 = arg2.aClass69_4;
			arg1.method7477(arg2.anInt10478, arg0.aClass257_8.anInt6448, arg0.aClass257_8.aClass2_Sub2_Sub18_2, arg2.aClass257_8.anInt6450, arg0.aClass257_8.anInt6450, arg2.aClass257_8.aClass2_Sub2_Sub18_2, arg0.aClass257_8.aClass2_Sub2_Sub18_1, arg0.anInt10478, local12.aBoolean140 | local15.aBoolean140, local15.anIntArray157[arg2.anInt10489], arg2.aClass257_8.aClass2_Sub2_Sub18_1, local12.aBooleanArray3, local12.anIntArray157[arg0.anInt10489], arg2.aClass257_8.anInt6448);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIB)I")
	public static int method7648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
