import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "Lclient!uf;")
	public static final Class370 aClass370_5 = new Class370();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method5822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static571.method7566(arg7)) {
			return;
		}
		if (Static148.aClass158ArrayArray1[arg7] == null) {
			Static84.method1669(Static453.aClass158ArrayArray2[arg7], -1, arg10, arg2, arg5, arg0, arg6, arg1, arg8, arg3, arg9, arg4);
		} else {
			Static84.method1669(Static148.aClass158ArrayArray1[arg7], -1, arg10, arg2, arg5, arg0, arg6, arg1, arg8, arg3, arg9, arg4);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!cka;ILclient!eo;B)V")
	public static void method5827(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub2 arg2) {
		if (Static33.anInt779 >= 50 || (arg0 == null || arg0.anIntArrayArray38 == null || arg0.anIntArrayArray38.length <= arg1 || arg0.anIntArrayArray38[arg1] == null)) {
			return;
		}
		@Pc(51) int local51 = arg0.anIntArrayArray38[arg1][0];
		@Pc(55) int local55 = local51 >> 8;
		@Pc(61) int local61 = local51 >> 5 & 0x7;
		@Pc(80) int local80;
		if (arg0.anIntArrayArray38[arg1].length > 1) {
			local80 = (int) (Math.random() * (double) arg0.anIntArrayArray38[arg1].length);
			if (local80 > 0) {
				local55 = arg0.anIntArrayArray38[arg1][local80];
			}
		}
		@Pc(93) int local93 = local51 & 0x1F;
		local80 = 256;
		if (arg0.anIntArray154 != null && arg0.anIntArray155 != null) {
			local80 = arg0.anIntArray154[arg1] + (int) ((double) (arg0.anIntArray155[arg1] - arg0.anIntArray154[arg1]) * Math.random());
		}
		@Pc(134) int local134 = arg0.anIntArray156 == null ? 255 : arg0.anIntArray156[arg1];
		if (local93 == 0) {
			if (arg2 == Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2) {
				if (!arg0.aBoolean141) {
					Static161.method2586(local80, 0, local55, local61, local134);
					return;
				}
				Static186.method2818(local55, local61, local80, 0, local134, false);
			}
		} else if (Static400.aClass2_Sub34_28.aClass57_Sub25_1.method7208() != 0) {
			@Pc(184) int local184 = arg2.anInt10690 - 256 >> 9;
			@Pc(191) int local191 = arg2.anInt10694 - 256 >> 9;
			@Pc(212) int local212 = arg2 == Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 ? 0 : local93 + (local191 << 8) + (local184 << 16) + (arg2.aByte144 << 24);
			Static409.aClass104Array1[Static33.anInt779++] = new Class104((byte) (arg0.aBoolean141 ? 2 : 1), local55, local61, 0, local134, local212, local80, arg2);
		}
	}
}
