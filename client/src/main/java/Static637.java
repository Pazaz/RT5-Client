import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static637 {

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
	public static int anInt9536;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "[S")
	public static short[] aShortArray132;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;IILclient!vq;)Lclient!oba;")
	public static Class270 method8382(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class390 arg2) {
		return Static36.method980(arg2, arg0, "openjs", arg1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)Z")
	public static boolean method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static194.method2908(arg0, arg1) || Static198.method2957(arg0, arg1);
	}
}
