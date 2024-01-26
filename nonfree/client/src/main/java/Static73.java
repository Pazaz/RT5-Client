import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "Lclient!pc;")
	public static final Class287 aClass287_18 = new Class287(6, 16);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIILclient!kp;I)Z")
	public static boolean method9308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8_Sub2_Sub3 arg2, @OriginalArg(4) int arg3) {
		if (!Static18.aBoolean20 || !Static29.aBoolean60) {
			return false;
		} else if (Static432.anInt525 < 100) {
			return false;
		} else if (Static588.method7714(arg1, arg3, arg0)) {
			@Pc(31) int local31 = arg0 << Static52.anInt1066;
			@Pc(35) int local35 = arg1 << Static52.anInt1066;
			@Pc(45) int local45 = Static246.aClass178Array1[arg3].method7869(arg1, arg0) - 1;
			@Pc(51) int local51 = arg2.method9286(2) + local45;
			if (arg2.aShort58 == 1) {
				if (!Static172.method2674(local31, local35, local51, local51, local45, local35, Static340.anInt5586 + local35, local31, local31)) {
					return false;
				} else if (Static172.method2674(local31, local35, local51, local45, local45, local35 + Static340.anInt5586, local35 + Static340.anInt5586, local31, local31)) {
					Static679.anInt10278++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 == 2) {
				if (!Static172.method2674(local31 + Static340.anInt5586, local35 - -Static340.anInt5586, local51, local51, local45, local35 + Static340.anInt5586, Static340.anInt5586 + local35, local31, local31)) {
					return false;
				} else if (Static172.method2674(local31 + Static340.anInt5586, local35 - -Static340.anInt5586, local45, local51, local45, Static340.anInt5586 + local35, local35 + Static340.anInt5586, local31, local31 + Static340.anInt5586)) {
					Static679.anInt10278++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 == 4) {
				if (!Static172.method2674(Static340.anInt5586 + local31, local35, local51, local51, local45, local35, Static340.anInt5586 + local35, local31 - -Static340.anInt5586, Static340.anInt5586 + local31)) {
					return false;
				} else if (Static172.method2674(local31 + Static340.anInt5586, local35, local51, local45, local45, Static340.anInt5586 + local35, Static340.anInt5586 + local35, local31 + Static340.anInt5586, Static340.anInt5586 + local31)) {
					Static679.anInt10278++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 == 8) {
				if (!Static172.method2674(Static340.anInt5586 + local31, local35, local51, local51, local45, local35, local35, local31, local31)) {
					return false;
				} else if (Static172.method2674(Static340.anInt5586 + local31, local35, local45, local51, local45, local35, local35, local31, local31 + Static340.anInt5586)) {
					Static679.anInt10278++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 == 16) {
				if (Static318.method8557(Static247.anInt3993, local51, local31, Static247.anInt3993 + local35, local45, Static247.anInt3993)) {
					Static679.anInt10278++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 == 32) {
				if (Static318.method8557(Static247.anInt3993, local51, local31 + Static247.anInt3993, Static247.anInt3993 + local35, local45, Static247.anInt3993)) {
					Static679.anInt10278++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 == 64) {
				if (Static318.method8557(Static247.anInt3993, local51, Static247.anInt3993 + local31, local35, local45, Static247.anInt3993)) {
					Static679.anInt10278++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 != 128) {
				return true;
			} else if (Static318.method8557(Static247.anInt3993, local51, local31, local35, local45, Static247.anInt3993)) {
				Static679.anInt10278++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([[BBLclient!taa;)V")
	public static void method9312(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class306_Sub1 arg1) {
		@Pc(6) int local6 = arg0.length;
		@Pc(26) int local26;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(13) byte[] local13 = arg0[local8];
			if (local13 != null) {
				@Pc(20) Class2_Sub21 local20 = new Class2_Sub21(local13);
				local26 = Static89.anIntArray169[local8] >> 8;
				@Pc(32) int local32 = Static89.anIntArray169[local8] & 0xFF;
				@Pc(38) int local38 = local26 * 64 - Static691.anInt10367;
				@Pc(45) int local45 = local32 * 64 - Static116.anInt2270;
				Static557.method7331();
				arg1.method7879(local20, local45, Static577.aClass110Array1, Static116.anInt2270, Static691.anInt10367, local38);
				arg1.method7893(local45, local20, local38, Static163.aClass19_17);
			}
		}
		for (@Pc(78) int local78 = 0; local78 < local6; local78++) {
			@Pc(90) int local90 = (Static89.anIntArray169[local78] >> 8) * 64 - Static691.anInt10367;
			local26 = (Static89.anIntArray169[local78] & 0xFF) * 64 - Static116.anInt2270;
			@Pc(105) byte[] local105 = arg0[local78];
			if (local105 == null && Static525.anInt8907 < 800) {
				Static557.method7331();
				arg1.method7880(local90, local26);
			}
		}
	}
}
