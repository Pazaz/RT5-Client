import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!w", name = "o", descriptor = "Lclient!qj;")
	public static Class162 aClass162_244;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	public static int anInt7353;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	public static int anInt7356;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	public static int anInt7358;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "I")
	public static int anInt7350 = 0;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	public static int anInt7355 = 0;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
	public static void method6154() {
		Static237.anInt5285 = 0;
		Static97.aClass130_9.method3754();
		Static97.aClass130_9.method3760(Static13.aClass1_Sub22_3);
		Static237.anInt5285++;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!il;)Lclient!ak;")
	public static Class1_Sub2 method6156(@OriginalArg(1) Class1_Sub16 arg0) {
		arg0.method5761();
		@Pc(13) int local13 = arg0.method5761();
		@Pc(17) Class1_Sub2 local17 = Static109.method2261(local13);
		local17.anInt7266 = arg0.method5761();
		@Pc(28) int local28 = arg0.method5761();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(38) int local38 = arg0.method5761();
			local17.method6074(local38, arg0);
		}
		local17.method6090();
		return local17;
	}
}
