import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "[I")
	public static int[] anIntArray169;

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_9 = new Class155(2);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!ca;IILclient!wj;Lclient!c;BI)V")
	public static void method1714(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub2_Sub1_Sub2_Sub2 arg4, @OriginalArg(5) Class54 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub51 local7 = new Class2_Sub51();
		local7.anInt9350 = arg0;
		local7.anInt9357 = arg2 << 9;
		local7.anInt9352 = arg3 << 9;
		if (arg5 != null) {
			local7.aClass54_1 = arg5;
			@Pc(173) int local173 = arg5.anInt1270;
			@Pc(176) int local176 = arg5.anInt1229;
			if (arg6 == 1 || arg6 == 3) {
				local176 = arg5.anInt1270;
				local173 = arg5.anInt1229;
			}
			local7.anInt9358 = arg5.anInt1253;
			local7.anInt9356 = arg5.anInt1244 << 9;
			local7.anInt9353 = arg5.anInt1246;
			local7.anInt9354 = arg5.anInt1219;
			local7.anInt9349 = arg3 + local176 << 9;
			local7.anInt9360 = arg5.anInt1249;
			local7.aBoolean714 = arg5.aBoolean88;
			local7.aBoolean715 = arg5.aBoolean92;
			local7.anInt9355 = arg5.anInt1221 << 9;
			local7.anInt9365 = arg5.anInt1231;
			local7.anInt9359 = arg5.anInt1268;
			local7.anIntArray718 = arg5.anIntArray116;
			local7.anInt9362 = arg2 + local173 << 9;
			if (arg5.anIntArray113 != null) {
				local7.aBoolean713 = true;
				local7.method8236();
			}
			if (local7.anIntArray718 != null) {
				local7.anInt9351 = (int) ((double) (local7.anInt9354 - local7.anInt9365) * Math.random()) + local7.anInt9365;
			}
			Static460.aClass339_40.method7711(local7);
			return;
		}
		if (arg4 != null) {
			local7.aClass8_Sub2_Sub1_Sub2_Sub2_3 = arg4;
			@Pc(37) Class268 local37 = arg4.aClass268_1;
			if (local37.anIntArray532 != null) {
				local7.aBoolean713 = true;
				local37 = local37.method5985(65535, Static34.aClass304_1);
			}
			if (local37 != null) {
				local7.anInt9362 = local37.anInt6713 + arg2 << 9;
				local7.anInt9349 = arg3 + local37.anInt6713 << 9;
				local7.anInt9353 = Static497.method6629(arg4);
				local7.anInt9355 = local37.anInt6741 << 9;
				local7.anInt9358 = local37.anInt6721;
				local7.anInt9359 = local37.anInt6729;
				local7.aBoolean714 = local37.aBoolean508;
				local7.anInt9356 = local37.anInt6742 << 9;
				local7.anInt9360 = local37.anInt6736;
			}
			Static717.aClass339_81.method7711(local7);
			return;
		}
		if (arg1 == null) {
			return;
		}
		local7.aClass8_Sub2_Sub1_Sub2_Sub1_3 = arg1;
		local7.anInt9362 = arg2 + arg1.method9302((byte) 46) << 9;
		local7.anInt9349 = arg1.method9302((byte) 77) + arg3 << 9;
		local7.anInt9353 = Static326.method4870(arg1);
		local7.anInt9356 = arg1.anInt1452 << 9;
		local7.anInt9360 = 256;
		local7.anInt9359 = 256;
		local7.anInt9358 = arg1.anInt1460;
		local7.anInt9355 = 0;
		local7.aBoolean714 = arg1.aBoolean126;
		Static113.aClass28_12.method735((long) arg1.anInt10740, local7);
		return;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "([FFIII[FFIIIII)V")
	public static void method1715(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg3 - arg10;
		@Pc(9) int local9 = arg9 - arg2;
		@Pc(20) int local20 = arg8 - arg7;
		@Pc(45) float local45 = (float) local9 * arg0[2] + arg0[1] * (float) local20 + (float) local5 * arg0[0];
		@Pc(66) float local66 = (float) local9 * arg0[5] + (float) local20 * arg0[4] + arg0[3] * (float) local5;
		@Pc(87) float local87 = arg0[6] * (float) local5 + (float) local20 * arg0[7] + arg0[8] * (float) local9;
		@Pc(98) float local98 = (float) Math.atan2((double) local45, (double) local87) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local98 *= arg6;
		}
		@Pc(112) float local112 = arg1 + local66 + 0.5F;
		@Pc(131) float local131;
		if (arg4 == 1) {
			local131 = local98;
			local98 = -local112;
			local112 = local131;
		} else if (arg4 == 2) {
			local112 = -local112;
			local98 = -local98;
		} else if (arg4 == 3) {
			local131 = local98;
			local98 = local112;
			local112 = -local131;
		}
		arg5[1] = local112;
		arg5[0] = local98;
	}
}
