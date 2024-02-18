import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
	public static int anInt8595 = 0;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!qf;")
	public static Class8_Sub2_Sub1 method7623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class291 local7 = Static334.aClass291ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(15) Class286 local15 = local7.aClass286_2; local15 != null; local15 = local15.aClass286_1) {
			@Pc(19) Class8_Sub2_Sub1 local19 = local15.aClass8_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local19.getClass()) && local19.aShort131 == arg1 && local19.aShort132 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(BIII)V")
	public static void method7624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1003) {
			Static472.method6429(Static298.aClass242_8, arg1, arg0);
		} else if (arg2 == 1001) {
			Static472.method6429(Static39.aClass242_3, arg1, arg0);
			return;
		} else if (arg2 == 1006) {
			Static472.method6429(Static337.aClass242_9, arg1, arg0);
			return;
		} else if (arg2 == 1009) {
			Static472.method6429(Static515.aClass242_12, arg1, arg0);
			return;
		} else if (arg2 == 1004) {
			Static472.method6429(Static31.aClass242_2, arg1, arg0);
			return;
		}
	}
}
