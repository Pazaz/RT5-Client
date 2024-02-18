import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!iba;")
	public static Class174 aClass174_1;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Lclient!ok;")
	public static Class278 method1487(@OriginalArg(1) int arg0) {
		@Pc(10) Class278 local10 = (Class278) Static713.aClass82_231.method2156((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static309.aClass330_62.method7595(arg0, 1);
		local10 = new Class278();
		local10.anInt6980 = arg0;
		if (local21 != null) {
			local10.method6274(new Class2_Sub21(local21));
		}
		local10.method6273();
		if (local10.anInt6982 == 2 && Static503.aClass28_38.method738((long) arg0) == null) {
			Static503.aClass28_38.method735((long) arg0, new Class2_Sub38(Static370.anInt5881));
			Static367.aClass278Array1[Static370.anInt5881++] = local10;
		}
		Static713.aClass82_231.method2150(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method1488() {
		if (Static135.anInt8223 == 10) {
			Static135.anInt8223 = 11;
		}
	}
}
