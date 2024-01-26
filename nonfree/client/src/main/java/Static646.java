import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "I")
	public static int anInt9621;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(II)V")
	public static void method8453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class291 local7 = Static334.aClass291ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class291 local28 = Static334.aClass291ArrayArrayArray1[local9][arg0][arg1] = Static334.aClass291ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class286 local33 = local28.aClass286_2; local33 != null; local33 = local33.aClass286_1) {
					@Pc(37) Class8_Sub2_Sub1 local37 = local33.aClass8_Sub2_Sub1_1;
					if (local37.aShort131 == arg0 && local37.aShort132 == arg1) {
						local37.aByte144--;
					}
				}
				if (local28.aClass8_Sub2_Sub2_1 != null) {
					local28.aClass8_Sub2_Sub2_1.aByte144--;
				}
				if (local28.aClass8_Sub2_Sub3_2 != null) {
					local28.aClass8_Sub2_Sub3_2.aByte144--;
				}
				if (local28.aClass8_Sub2_Sub3_1 != null) {
					local28.aClass8_Sub2_Sub3_1.aByte144--;
				}
				if (local28.aClass8_Sub2_Sub4_1 != null) {
					local28.aClass8_Sub2_Sub4_1.aByte144--;
				}
				if (local28.aClass8_Sub2_Sub4_2 != null) {
					local28.aClass8_Sub2_Sub4_2.aByte144--;
				}
			}
		}
		if (Static334.aClass291ArrayArrayArray1[0][arg0][arg1] == null) {
			Static334.aClass291ArrayArrayArray1[0][arg0][arg1] = new Class291(0);
			Static334.aClass291ArrayArrayArray1[0][arg0][arg1].aByte116 = 1;
		}
		Static334.aClass291ArrayArrayArray1[0][arg0][arg1].aClass291_1 = local7;
		Static334.aClass291ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lclient!hda;III)V")
	public static void method8454(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class159 local8 = arg0.method3393(Static163.aClass19_17);
		if (local8 == null) {
			return;
		}
		Static163.aClass19_17.KA(arg1, arg2, arg1 + arg0.anInt3802, arg2 + arg0.anInt3746);
		if (Static578.anInt8595 >= 3) {
			Static163.aClass19_17.A(-16777216, local8.aClass1_1, arg1, arg2);
		} else {
			Static12.aClass23_27.method8183((float) arg0.anInt3802 / 2.0F + (float) arg1, (float) arg0.anInt3746 / 2.0F + (float) arg2, ((int) -Static171.aFloat64 & 0x3FFF) << 2, local8.aClass1_1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BII)Z")
	public static boolean method8457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IB)I")
	public static int method8458(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
