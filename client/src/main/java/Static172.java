import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString254 = "scroll:";

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	public static int anInt6632 = 0;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "I")
	public static int anInt6634 = -1;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!c;ZIILclient!c;IZ)I")
	public static int method5647(@OriginalArg(0) Class27_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class27_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static27.method657(arg1, arg3, arg0, arg4);
		if (local10 != 0) {
			return arg1 ? -local10 : local10;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(37) int local37 = Static27.method657(arg5, arg2, arg0, arg4);
			return arg5 ? -local37 : local37;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!qj;)V")
	public static void method5651(@OriginalArg(1) Class162 arg0) {
		Static156.aClass162_133 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
	public static void method5653() {
		@Pc(5) Class215 local5 = Static286.aClass215_86;
		synchronized (Static286.aClass215_86) {
			Static286.aClass215_86.method6060();
		}
	}
}
