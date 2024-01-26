import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "J")
	public static long aLong282 = 0L;

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
	public static int anInt9424 = 1;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!qf;Z)V")
	public static void method8293(@OriginalArg(0) Class8_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort131; local2 <= arg0.aShort134; local2++) {
			for (@Pc(6) int local6 = arg0.aShort132; local6 <= arg0.aShort133; local6++) {
				@Pc(16) Class291 local16 = Static334.aClass291ArrayArrayArray1[arg0.aByte144][local2][local6];
				if (local16 != null) {
					@Pc(21) Class286 local21 = local16.aClass286_2;
					@Pc(23) Class286 local23 = null;
					while (local21 != null) {
						if (local21.aClass8_Sub2_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass286_2 = local21.aClass286_1;
							} else {
								local23.aClass286_1 = local21.aClass286_1;
							}
							local21.method6459();
							break;
						}
						local23 = local21;
						local21 = local21.aClass286_1;
					}
				}
			}
		}
		if (!arg1) {
			Static109.method2068(arg0);
		}
	}
}
