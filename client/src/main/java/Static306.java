import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!rp", name = "J", descriptor = "[Lclient!nn;")
	public static Class2_Sub26_Sub1[] aClass2_Sub26_Sub1Array2;

	@OriginalMember(owner = "client!rp", name = "z", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_49 = new Class98(4);

	@OriginalMember(owner = "client!rp", name = "G", descriptor = "[I")
	public static final int[] anIntArray387 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)V")
	public static void method5250(@OriginalArg(0) byte arg0) {
		if (Static230.aByteArrayArrayArray13 == null) {
			Static230.aByteArrayArrayArray13 = new byte[4][Static373.anInt7033][Static242.anInt4449];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static373.anInt7033; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static242.anInt4449; local22++) {
					Static230.aByteArrayArrayArray13[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!id;)Z")
	public static boolean method5252(@OriginalArg(1) Interface6 arg0) {
		@Pc(10) Class41 local10 = Static359.aClass202_4.method5163(arg0.method6085());
		if (local10.anInt1316 == -1) {
			return true;
		} else {
			@Pc(22) Class146 local22 = Static320.aClass104_2.method2708(local10.anInt1316);
			return local22.anInt3751 == -1 ? true : local22.method3708();
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIBII)V")
	public static void method5253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(6) Class12_Sub3 local6 = (Class12_Sub3) Static284.aClass36_7.method1415(); local6 != null; local6 = (Class12_Sub3) Static284.aClass36_7.method1420()) {
			if (Static114.anInt2348 >= local6.anInt3201) {
				local6.method5684();
			} else {
				Static121.method2394(local6.anInt3207, arg2 >> 1, (local6.anInt3200 << 7) + 64, local6.anInt3204 * 2, arg1 >> 1, (local6.anInt3208 << 7) + 64);
				Static52.aClass130_1.method5900(local6.aString26, 0, arg0 + Static216.anIntArray231[1], local6.anInt3206 | 0xFF000000, Static216.anIntArray231[0] + arg3);
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIB)V")
	public static void method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static15.anInt366 = arg3;
		Static315.anInt5930 = arg1;
		Static153.anInt2792 = arg0;
		Static75.anInt1737 = arg2;
	}
}
