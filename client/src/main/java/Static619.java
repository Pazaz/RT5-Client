import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "Lclient!vka;")
	public static Class387 aClass387_2;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	public static int anInt1566;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_34 = new Class225(68, 1);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)V")
	public static void method1508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg1 * arg1;
		@Pc(22) int local22 = arg2 * arg2;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local18 << 1;
		@Pc(34) int local34 = arg2 << 1;
		@Pc(42) int local42 = local26 + local18 * (1 - local34);
		@Pc(51) int local51 = local22 - local30 * (local34 - 1);
		@Pc(55) int local55 = local18 << 2;
		@Pc(59) int local59 = local22 << 2;
		@Pc(67) int local67 = local26 * 3;
		@Pc(75) int local75 = ((arg2 << 1) - 3) * local30;
		@Pc(81) int local81 = local59;
		@Pc(87) int local87 = (arg2 - 1) * local55;
		@Pc(103) int local103;
		@Pc(112) int local112;
		if (arg0 >= Static724.anInt10930 && Static273.anInt4395 >= arg0) {
			local103 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg1 + arg3);
			local112 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 - arg1);
			Static696.method9037(local103, arg4, local112, Static723.anIntArrayArray266[arg0]);
		}
		while (local9 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local51 += local81;
					local42 += local67;
					local81 += local59;
					local7++;
					local67 += local59;
				}
			}
			if (local51 < 0) {
				local42 += local67;
				local51 += local81;
				local7++;
				local81 += local59;
				local67 += local59;
			}
			local42 += -local87;
			local51 += -local75;
			local9--;
			local87 -= local55;
			local75 -= local55;
			local103 = arg0 - local9;
			local112 = arg0 + local9;
			if (Static724.anInt10930 <= local112 && Static273.anInt4395 >= local103) {
				@Pc(224) int local224 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 + local7);
				@Pc(233) int local233 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3 - local7);
				if (Static724.anInt10930 <= local103) {
					Static696.method9037(local224, arg4, local233, Static723.anIntArrayArray266[local103]);
				}
				if (Static273.anInt4395 >= local112) {
					Static696.method9037(local224, arg4, local233, Static723.anIntArrayArray266[local112]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)Lclient!kp;")
	public static Class8_Sub2_Sub3 method1510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static334.aClass291ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub2_Sub3_1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
	public static void method1512(@OriginalArg(0) int arg0) {
		Static299.anInt4825 = 2;
		Static524.aClass153_3 = Static405.aClass153_2;
		Static470.anInt7113 = arg0;
		@Pc(18) String local18 = null;
		if (Static265.aByteArray44 != null) {
			@Pc(25) Class2_Sub21 local25 = new Class2_Sub21(Static265.aByteArray44);
			local18 = Static287.method4154(local25.method7398());
			Static430.aLong209 = local25.method7398();
		}
		if (local18 == null) {
			Static342.method4464(35);
		} else {
			Static238.method3471(false, local18, true, "");
		}
	}
}
