import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "[I")
	public static final int[] anIntArray574 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method5967(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(61) char local61;
			if (local17 == '\u0000') {
				local61 = arg0.charAt(local13++);
			} else {
				local61 = local17;
			}
			@Pc(71) char local71;
			if (local19 == '\u0000') {
				local71 = arg2.charAt(local15++);
			} else {
				local71 = local19;
			}
			local17 = Static205.method4096(local61);
			local19 = Static205.method4096(local71);
			local61 = Static183.method3716(local61, arg1);
			local71 = Static183.method3716(local71, arg1);
			if (local71 != local61 && Character.toUpperCase(local61) != Character.toUpperCase(local71)) {
				local61 = Character.toLowerCase(local61);
				local71 = Character.toLowerCase(local71);
				if (local71 != local61) {
					return Static285.method5101(arg1, local61) - Static285.method5101(arg1, local71);
				}
			}
		}
		@Pc(141) int local141 = Math.min(local8, local11);
		for (@Pc(143) int local143 = 0; local143 < local141; local143++) {
			if (arg1 == 2) {
				local15 = local11 - local143 - 1;
				local13 = local8 - local143 - 1;
			} else {
				local15 = local143;
				local13 = local143;
			}
			@Pc(173) char local173 = arg0.charAt(local13);
			@Pc(177) char local177 = arg2.charAt(local15);
			if (local173 != local177 && Character.toUpperCase(local173) != Character.toUpperCase(local177)) {
				local173 = Character.toLowerCase(local173);
				local177 = Character.toLowerCase(local177);
				if (local173 != local177) {
					return Static285.method5101(arg1, local173) - Static285.method5101(arg1, local177);
				}
			}
		}
		@Pc(217) int local217 = local8 - local11;
		if (local217 != 0) {
			return local217;
		}
		for (@Pc(226) int local226 = 0; local226 < local141; local226++) {
			@Pc(232) char local232 = arg0.charAt(local226);
			@Pc(236) char local236 = arg2.charAt(local226);
			if (local232 != local236) {
				return Static285.method5101(arg1, local232) - Static285.method5101(arg1, local236);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIJ)V")
	public static void method5971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		@Pc(15) int local15 = (int) arg2 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg2 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static328.method5704(local15, arg0, 0, arg1, 0, Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], local22, 0, true);
			return;
		}
		@Pc(64) Class189 local64 = Static83.method1840(local29);
		@Pc(75) int local75;
		@Pc(72) int local72;
		if (local22 == 0 || local22 == 2) {
			local75 = local64.anInt6195;
			local72 = local64.anInt6173;
		} else {
			local72 = local64.anInt6195;
			local75 = local64.anInt6173;
		}
		@Pc(86) int local86 = local64.anInt6192;
		if (local22 != 0) {
			local86 = (local86 << local22 & 0xF) + (local86 >> 4 - local22);
		}
		Static328.method5704(0, arg0, local86, arg1, local72, Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0], Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], 0, local75, true);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BII)I")
	public static int method5980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local5 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local5 * arg0;
		} else {
			return local5;
		}
	}
}
