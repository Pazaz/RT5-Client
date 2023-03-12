import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)I")
	public static int method4179(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIII)V")
	public static void method4181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 > arg2) {
			Static101.method2163(arg3, Static357.anIntArrayArray58[arg0], arg1, arg2);
		} else {
			Static101.method2163(arg2, Static357.anIntArrayArray58[arg0], arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!jg;Lclient!np;Lclient!wm;I)V")
	public static void method4184(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) Class19 arg2) {
		@Pc(10) Sprite local10 = arg1.method4183(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method6389();
		if (local10.method6382() > local16) {
			local16 = local10.method6382();
		}
		@Pc(28) int local28 = arg0.anInt2948;
		@Pc(31) int local31 = arg0.anInt2944;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(78) int local78;
		if (arg1.aString48 != null) {
			local33 = Static52.aClass239_1.method6119(Static287.aStringArray52, arg1.aString48, null, null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static287.aStringArray52[local51];
				if (local51 < local33 - 1) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local78 = Static2.aClass113_1.method2950(local57);
				if (local35 < local78) {
					local35 = local78;
				}
			}
			local37 = local33 * Static2.aClass113_1.method2948() + Static2.aClass113_1.method2947() / 2;
		}
		local51 = arg0.anInt2948 + local16 / 2;
		@Pc(112) int local112 = arg0.anInt2944;
		if (local28 < Static344.anInt6050 + local16) {
			local51 = Static344.anInt6050 + local16 / 2 + local35 / 2 + 10 + 5;
			local28 = Static344.anInt6050;
		} else if (Static344.anInt6051 - local16 < local28) {
			local51 = Static344.anInt6051 - local16 / 2 - local35 / 2 - 10 - 5;
			local28 = Static344.anInt6051 - local16;
		}
		if (local16 + Static344.anInt6053 > local31) {
			local112 = local16 / 2 + Static344.anInt6053 + 10;
			local31 = Static344.anInt6053;
		} else if (Static344.anInt6061 - local16 < local31) {
			local112 = Static344.anInt6061 - local37 - local16 / 2 - 10;
			local31 = Static344.anInt6061 - local16;
		}
		local78 = (int) (Math.atan2((double) (local28 - arg0.anInt2948), (double) (local31 - arg0.anInt2944)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6386((float) local16 / 2.0F + (float) local28, (float) local31 + (float) local16 / 2.0F, 4096, local78);
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		if (arg1.aString48 != null) {
			local263 = local112;
			local261 = local51 - local35 / 2 - 5;
			local265 = local261 + local35 + 10;
			local267 = local112 + Static2.aClass113_1.method2948() * local33 + 3;
			if (arg1.anInt4437 != 0) {
				arg2.method2868(local267 - local112, local261, local112, arg1.anInt4437, local265 - local261);
			}
			if (arg1.anInt4417 != 0) {
				arg2.method2837(local112, local261, local267 - local112, arg1.anInt4417, local265 - local261);
			}
			for (@Pc(335) int local335 = 0; local335 < local33; local335++) {
				@Pc(341) String local341 = Static287.aStringArray52[local335];
				if (local335 < local33 - 1) {
					local341 = local341.substring(0, local341.length() - 4);
				}
				Static2.aClass113_1.method2951(arg2, local341, local51, local112, arg1.anInt4431);
				local112 += Static2.aClass113_1.method2948();
			}
		}
		if (arg1.anInt4420 == -1 && arg1.aString48 == null) {
			return;
		}
		@Pc(385) Class2_Sub15 local385 = new Class2_Sub15(arg0);
		local16 >>= 0x1;
		local385.anInt2336 = local31 + local16;
		local385.anInt2335 = local261;
		local385.anInt2334 = local263;
		local385.anInt2342 = local265;
		local385.anInt2341 = local31 - local16;
		local385.anInt2343 = local267;
		local385.anInt2340 = local28 + local16;
		local385.anInt2338 = local28 - local16;
		Static197.aClass135_24.addTail(local385);
	}
}
