import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
	public static int[] anIntArray582;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "[Lclient!ul;")
	public static Class204[] aClass204Array2;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	public static int anInt7192 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method6030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg4;
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = arg6 - arg0;
		@Pc(25) int local25 = arg4 - arg0;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = arg4 * arg4;
		@Pc(37) int local37 = local20 * local20;
		@Pc(41) int local41 = local25 * local25;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg4 << 1;
		@Pc(65) int local65 = local25 << 1;
		@Pc(73) int local73 = (1 - local61) * local29 + local45;
		@Pc(82) int local82 = local33 - (local61 - 1) * local49;
		@Pc(92) int local92 = local37 * (1 - local65) + local53;
		@Pc(100) int local100 = local41 - local57 * (local65 - 1);
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 << 2;
		@Pc(120) int local120 = local45 * 3;
		@Pc(126) int local126 = (local61 - 3) * local49;
		@Pc(130) int local130 = local53 * 3;
		@Pc(136) int local136 = (local65 - 3) * local57;
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = (arg4 - 1) * local104;
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = local112 * (local25 - 1);
		@Pc(156) int[] local156 = Static87.anIntArrayArray9[arg5];
		Static12.method349(arg2 - local20, local156, arg3, arg2 - arg6);
		Static12.method349(arg2 + local20, local156, arg1, arg2 - local20);
		Static12.method349(arg2 + arg6, local156, arg3, arg2 + local20);
		while (local13 > 0) {
			@Pc(200) boolean local200 = local25 >= local13;
			if (local73 < 0) {
				while (local73 < 0) {
					local82 += local138;
					local73 += local120;
					local120 += local108;
					local138 += local108;
					local7++;
				}
			}
			if (local200) {
				if (local92 < 0) {
					while (local92 < 0) {
						local100 += local146;
						local92 += local130;
						local15++;
						local130 += local116;
						local146 += local116;
					}
				}
				if (local100 < 0) {
					local100 += local146;
					local92 += local130;
					local146 += local116;
					local15++;
					local130 += local116;
				}
				local100 += -local136;
				local92 += -local152;
				local152 -= local112;
				local136 -= local112;
			}
			if (local82 < 0) {
				local73 += local120;
				local82 += local138;
				local7++;
				local138 += local108;
				local120 += local108;
			}
			local73 += -local144;
			local82 += -local126;
			local144 -= local104;
			local13--;
			local126 -= local104;
			@Pc(331) int local331 = arg5 - local13;
			@Pc(335) int local335 = arg5 + local13;
			@Pc(339) int local339 = arg2 + local7;
			@Pc(343) int local343 = arg2 - local7;
			if (local200) {
				@Pc(349) int local349 = local15 + arg2;
				@Pc(353) int local353 = arg2 - local15;
				Static12.method349(local353, Static87.anIntArrayArray9[local331], arg3, local343);
				Static12.method349(local349, Static87.anIntArrayArray9[local331], arg1, local353);
				Static12.method349(local339, Static87.anIntArrayArray9[local331], arg3, local349);
				Static12.method349(local353, Static87.anIntArrayArray9[local335], arg3, local343);
				Static12.method349(local349, Static87.anIntArrayArray9[local335], arg1, local353);
				Static12.method349(local339, Static87.anIntArrayArray9[local335], arg3, local349);
			} else {
				Static12.method349(local339, Static87.anIntArrayArray9[local331], arg3, local343);
				Static12.method349(local339, Static87.anIntArrayArray9[local335], arg3, local343);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	public static void method6031() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static330.aClass154ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static330.aClass154ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static328.anInt6717; local6++) {
					for (local9 = 0; local9 < Static200.anInt4590; local9++) {
						if (Static330.aClass154ArrayArrayArray3[local3][local6][local9] != null) {
							Static330.aClass154ArrayArrayArray3[local3][local6][local9].method4505();
						}
						Static330.aClass154ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static330.aClass154ArrayArrayArray3 = null;
		Static336.aClass77Array3 = null;
		if (Static134.aClass154ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static134.aClass154ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static328.anInt6717; local6++) {
					for (local9 = 0; local9 < Static200.anInt4590; local9++) {
						if (Static134.aClass154ArrayArrayArray1[local3][local6][local9] != null) {
							Static134.aClass154ArrayArrayArray1[local3][local6][local9].method4505();
						}
						Static134.aClass154ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static134.aClass154ArrayArrayArray1 = null;
		Static137.aClass77Array2 = null;
		Static241.aClass154ArrayArrayArray2 = null;
		Static118.aClass77Array1 = null;
		Static62.anInt1710 = 0;
		if (aClass204Array2 != null) {
			for (local3 = 0; local3 < Static62.anInt1710; local3++) {
				aClass204Array2[local3] = null;
			}
		}
		if (Static283.aClass7_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static144.anInt3573; local3++) {
				Static283.aClass7_Sub1Array3[local3] = null;
			}
			Static144.anInt3573 = 0;
		}
		if (Static68.aClass1_Sub9_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static273.anInt5747; local3++) {
				Static68.aClass1_Sub9_Sub1Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static214.anInt4867; local6++) {
				for (local9 = 0; local9 < Static328.anInt6717; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static200.anInt4590; local160++) {
						Static96.anIntArrayArrayArray3[local6][local9][local160] = 0;
					}
				}
			}
			Static273.anInt5747 = 0;
		}
		Static261.anIntArrayArrayArray11 = null;
		Static98.method909();
		Static216.aClass58_8.method1673();
		Static110.aClass23_2 = null;
		Static350.anIntArrayArray58 = null;
		Static192.aClass11_9 = null;
		Static332.aClass40_8 = null;
	}
}
