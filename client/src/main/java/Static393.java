import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "F")
	public static float aFloat117;

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
	public static int anInt6145;

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
	public static int anInt6147;

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!ha;IBLclient!hda;II)V")
	public static void method5509(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class158 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(10) int local10 = 7; local10 >= 0; local10--) {
			for (@Pc(16) int local16 = 127; local16 >= 0; local16--) {
				Static198.method2954(true, false);
				@Pc(40) int local40 = (arg1 & 0x3F) << 10 | (local10 & 0x7) << 7 | local16 & 0x7F;
				@Pc(44) int local44 = Static154.anIntArray237[local40];
				Static300.method4390(false, true);
				arg0.aa(arg3 + (arg2.anInt3802 * local16 >> 7), arg4 + ((-local10 + 7) * arg2.anInt3746 >> 3), (arg2.anInt3802 >> 7) + 1, (arg2.anInt3746 >> 3) - -1, local44, 0);
			}
		}
		anInt6147++;
	}
}
