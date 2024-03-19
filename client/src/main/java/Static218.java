import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Lclient!qj;")
	public static Class162 aClass162_175;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "[I")
	public static int[] anIntArray365;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Lclient!we;")
	public static final Class215 aClass215_68 = new Class215(64);

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Z")
	public static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "Z")
	public static boolean aBoolean342 = true;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIIIIII)Lclient!j;")
	public static Class94 method4245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg5 * 475427L ^ (long) arg1 * 97549L ^ (long) arg4 * 67481L ^ (long) arg0 * 986053L ^ (long) arg3 * 32147369L ^ (long) arg2 * 76724863L;
		@Pc(39) Class94 local39 = (Class94) Static243.aClass215_75.method6057(local33);
		if (local39 == null) {
			local39 = Static344.aClass40_9.method2725(arg4, arg1, arg5, arg0, arg3, arg2);
			Static243.aClass215_75.method6050(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V")
	public static void method4246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static340.anInt7187 * arg1 >> 8;
		if (local10 != 0 && arg0 != -1) {
			Static179.method3629(arg0, local10, Static134.aClass162_119);
			Static46.aBoolean484 = true;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
	public static void method4247(@OriginalArg(1) int arg0) {
		@Pc(10) Class215 local10 = Static285.aClass215_84;
		synchronized (Static285.aClass215_84) {
			Static285.aClass215_84.method6060();
			Static285.aClass215_84 = new Class215(arg0);
		}
	}
}
