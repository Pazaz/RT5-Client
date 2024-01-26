import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!js", name = "P", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!bn;I)Z")
	public static boolean method4537(@OriginalArg(0) Class2_Sub8 arg0) {
		if (arg0 == null) {
			return true;
		}
		Static62.aClass2_Sub8_3 = null;
		Static96.anInt10171 = 0;
		Static12.aClass123_4 = null;
		Static117.aClass2_Sub6_Sub1_2 = null;
		if (arg0 != Static62.aClass2_Sub8_2) {
			Static159.anInt2788 = 0;
			Static62.aClass2_Sub8_2 = arg0;
		}
		Static676.aClass330_121 = null;
		if (Static159.anInt2788 == 0) {
			Static270.aClass123_2 = new Class123(Static91.aClass330_117, Static296.aClass330_61);
			Static581.aClass2_Sub6_Sub1_3.method927();
			Static159.anInt2788 = 1;
		}
		if (Static159.anInt2788 == 1) {
			if (!Static581.aClass2_Sub6_Sub1_3.method944(Static270.aClass123_2, Static86.aClass330_13, arg0)) {
				return false;
			}
			Static270.aClass123_2 = null;
			Static62.aClass2_Sub8_2 = null;
			Static159.anInt2788 = 0;
		}
		return true;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZBZIILjava/lang/String;Ljava/lang/String;)V")
	public static void method4538(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static380.aClass330_79.anInt8555 = 1;
		@Pc(9) String local9 = arg4.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = -1;
		@Pc(16) String local16 = null;
		if (arg3 != -1) {
			@Pc(25) Class296 local25 = Static386.aClass49_2.method1161(arg3);
			if (local25 == null || local25.method6672() != arg0) {
				return;
			}
			if (local25.method6672()) {
				local16 = local25.aString89;
			} else {
				local14 = local25.anInt7509;
			}
		}
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static419.aClass112_1.anInt2670; local56++) {
			@Pc(62) Class382 local62 = Static419.aClass112_1.method2486(local56);
			if ((!arg1 || local62.aBoolean771) && local62.anInt10087 == -1 && local62.anInt10083 == -1 && local62.anInt10144 == -1 && local62.anInt10101 == 0 && local62.aString118.toLowerCase().indexOf(local9) != -1) {
				if (arg3 != -1) {
					if (arg0) {
						if (!arg5.equals(local62.method8800(local16, arg3))) {
							continue;
						}
					} else if (arg2 != local62.method8794(arg3, local14)) {
						continue;
					}
				}
				if (local54 >= 250) {
					Static256.aShortArray63 = null;
					Static606.anInt8947 = -1;
					return;
				}
				if (local12.length <= local54) {
					@Pc(164) short[] local164 = new short[local12.length * 2];
					for (@Pc(166) int local166 = 0; local166 < local54; local166++) {
						local164[local166] = local12[local166];
					}
					local12 = local164;
				}
				local12[local54++] = (short) local56;
			}
		}
		Static606.anInt8947 = local54;
		Static143.anInt4054 = 0;
		Static256.aShortArray63 = local12;
		@Pc(203) String[] local203 = new String[Static606.anInt8947];
		for (@Pc(205) int local205 = 0; local205 < Static606.anInt8947; local205++) {
			local203[local205] = Static419.aClass112_1.method2486(local12[local205]).aString118;
		}
		Static554.method7292(local203, Static256.aShortArray63);
		Static380.aClass330_79.method7592();
		Static380.aClass330_79.anInt8555 = 2;
	}
}
