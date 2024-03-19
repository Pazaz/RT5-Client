import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "Lclient!qj;")
	public static Class162 aClass162_188;

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
	public static int anInt5290;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
	public static int anInt5285 = 0;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
	public static int anInt5288 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIBLclient!kr;)V")
	public static void method4507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub19 arg3) {
		@Pc(16) long local16 = (long) (arg2 | arg0 << 28 | arg1 << 14);
		@Pc(22) Class1_Sub11 local22 = (Class1_Sub11) Static208.aClass183_24.method5053(local16);
		if (local22 == null) {
			local22 = new Class1_Sub11();
			Static208.aClass183_24.method5055(local16, local22);
			local22.aClass130_11.method3760(arg3);
			return;
		}
		@Pc(44) Class36 local44 = Static165.method3446(arg3.anInt3991);
		@Pc(47) int local47 = local44.anInt1213;
		if (local44.anInt1219 == 1) {
			local47 *= arg3.anInt3986 + 1;
		}
		for (@Pc(66) Class1_Sub19 local66 = (Class1_Sub19) local22.aClass130_11.method3749(); local66 != null; local66 = (Class1_Sub19) local22.aClass130_11.method3756()) {
			local44 = Static165.method3446(local66.anInt3991);
			@Pc(76) int local76 = local44.anInt1213;
			if (local44.anInt1219 == 1) {
				local76 *= local66.anInt3986 + 1;
			}
			if (local76 < local47) {
				Static355.method3606(local66, arg3);
				return;
			}
		}
		local22.aClass130_11.method3760(arg3);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILclient!ro;)I")
	public static int method4508(@OriginalArg(1) int arg0, @OriginalArg(2) Class177 arg1) {
		if (arg1.anIntArrayArray39 == null || arg1.anIntArrayArray39.length <= arg0) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg1.anIntArrayArray39[arg0];
			@Pc(22) int local22 = 0;
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			while (true) {
				@Pc(31) int local31 = local20[local24++];
				@Pc(33) int local33 = 0;
				@Pc(35) byte local35 = 0;
				if (local31 == 0) {
					return local22;
				}
				if (local31 == 1) {
					local33 = Static3.anIntArray1[local20[local24++]];
				}
				if (local31 == 2) {
					local33 = Static241.anIntArray391[local20[local24++]];
				}
				if (local31 == 3) {
					local33 = Static4.anIntArray9[local20[local24++]];
				}
				@Pc(88) int local88;
				@Pc(99) Class177 local99;
				@Pc(104) int local104;
				@Pc(117) int local117;
				if (local31 == 4) {
					local88 = local20[local24++] << 16;
					@Pc(95) int local95 = local88 + local20[local24++];
					local99 = Static298.method5252(local95);
					local104 = local20[local24++];
					if (local104 != -1 && (!Static165.method3446(local104).aBoolean76 || Static109.aBoolean184)) {
						for (local117 = 0; local117 < local99.anIntArray439.length; local117++) {
							if (local104 + 1 == local99.anIntArray439[local117]) {
								local33 += local99.anIntArray441[local117];
							}
						}
					}
				}
				if (local31 == 5) {
					local33 = Static78.anIntArray137[local20[local24++]];
				}
				if (local31 == 6) {
					local33 = Class7_Sub1_Sub1_Sub2.anIntArray580[Static241.anIntArray391[local20[local24++]] - 1];
				}
				if (local31 == 7) {
					local33 = Static78.anIntArray137[local20[local24++]] * 100 / 46875;
				}
				if (local31 == 8) {
					local33 = Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7133;
				}
				if (local31 == 9) {
					for (local88 = 0; local88 < 25; local88++) {
						if (Static119.aBooleanArray7[local88]) {
							local33 += Static241.anIntArray391[local88];
						}
					}
				}
				if (local31 == 10) {
					local88 = local20[local24++] << 16;
					local88 += local20[local24++];
					local99 = Static298.method5252(local88);
					local104 = local20[local24++];
					if (local104 != -1 && (!Static165.method3446(local104).aBoolean76 || Static109.aBoolean184)) {
						for (local117 = 0; local117 < local99.anIntArray439.length; local117++) {
							if (local104 + 1 == local99.anIntArray439[local117]) {
								local33 = 999999999;
								break;
							}
						}
					}
				}
				if (local31 == 11) {
					local33 = Static221.anInt5016;
				}
				if (local31 == 12) {
					local33 = Static67.anInt203;
				}
				if (local31 == 13) {
					local88 = Static78.anIntArray137[local20[local24++]];
					@Pc(311) int local311 = local20[local24++];
					local33 = (local88 & 0x1 << local311) == 0 ? 0 : 1;
				}
				if (local31 == 15) {
					local35 = 1;
				}
				if (local31 == 14) {
					local88 = local20[local24++];
					local33 = Static95.method2034(local88);
				}
				if (local31 == 16) {
					local35 = 2;
				}
				if (local31 == 17) {
					local35 = 3;
				}
				if (local31 == 18) {
					local33 = (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 >> 7) + Static149.anInt3667;
				}
				if (local31 == 19) {
					local33 = (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 >> 7) + Static96.anInt2446;
				}
				if (local31 == 20) {
					local33 = local20[local24++];
				}
				if (local35 == 0) {
					if (local26 == 0) {
						local22 += local33;
					}
					if (local26 == 1) {
						local22 -= local33;
					}
					if (local26 == 2 && local33 != 0) {
						local22 /= local33;
					}
					if (local26 == 3) {
						local22 *= local33;
					}
					local26 = 0;
				} else {
					local26 = local35;
				}
			}
		} catch (@Pc(428) Exception local428) {
			return -1;
		}
	}
}
