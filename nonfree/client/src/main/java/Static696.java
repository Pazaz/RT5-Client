import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static696 {

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Z")
	public static boolean aBoolean784 = false;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)I")
	public static int method9034() {
		return Static470.anInt7113;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method9035() {
		for (@Pc(1) int local1 = 0; local1 < Static33.anInt779; local1++) {
			@Pc(6) Class104 local6 = Static409.aClass104Array1[local1];
			if (local6.aByte49 == 3) {
				if (local6.aClass2_Sub6_Sub2_2 == null) {
					local6.anInt2571 = Integer.MIN_VALUE;
				} else {
					Static336.aClass2_Sub6_Sub3_1.method5883(local6.aClass2_Sub6_Sub2_2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)Z")
	public static boolean method9036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static280.aByteArrayArrayArray3[0][arg2][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static280.aByteArrayArrayArray3[arg3][arg2][arg0] & 0x10) == 0) {
			return Static705.method9198(arg0, arg2, arg3) == arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III[II)V")
	public static void method9037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg2--;
		@Pc(12) int local12 = arg0 - 1;
		@Pc(15) int local15 = local12 - 7;
		while (local15 > arg2) {
			@Pc(18) int local18 = arg2 + 1;
			arg3[local18] = arg1;
			@Pc(23) int local23 = local18 + 1;
			arg3[local23] = arg1;
			@Pc(28) int local28 = local23 + 1;
			arg3[local28] = arg1;
			@Pc(33) int local33 = local28 + 1;
			arg3[local33] = arg1;
			@Pc(38) int local38 = local33 + 1;
			arg3[local38] = arg1;
			@Pc(43) int local43 = local38 + 1;
			arg3[local43] = arg1;
			@Pc(48) int local48 = local43 + 1;
			arg3[local48] = arg1;
			arg2 = local48 + 1;
			arg3[arg2] = arg1;
		}
		while (local12 > arg2) {
			arg2++;
			arg3[arg2] = arg1;
		}
	}
}
