import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "F")
	public static float aFloat198;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Z")
	public static boolean aBoolean727 = false;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	public static int anInt9461 = -1;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Lclient!hh;")
	public static Class162 method8329(@OriginalArg(1) int arg0) {
		@Pc(15) Class162[] local15 = Static660.method8619();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class162 local23 = local15[local17];
			if (local23.anInt3922 == arg0) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIB)V")
	public static void method8330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static180.anInt2995 <= arg1 && Static111.anInt2219 >= arg0 && arg4 >= Static724.anInt10930 && Static273.anInt4395 >= arg3) {
			Static561.method7437(arg4, arg2, arg1, arg3, arg0);
		} else {
			Static230.method3370(arg1, arg0, arg2, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZIII)V")
	public static void method8331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(37) String local37 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local37);
		Static231.method3381(true, false, local37);
	}
}
