import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
	public static int anInt5197 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;Lclient!ml;BZZ)V")
	public static void openUrl(@OriginalArg(0) String arg0, @OriginalArg(1) Signlink arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static234.method4095(arg1, 3, arg0);
			return;
		}
		if (Signlink.osName.startsWith("win") && Static215.anInt3795 != 3) {
			@Pc(32) String local32 = null;
			if (arg1.applet != null) {
				local32 = arg1.applet.getParameter("haveie6");
			}
			if (local32 == null || !local32.equals("1")) {
				@Pc(52) PrivilegedRequest local52 = Static234.method4095(arg1, 0, arg0);
				Static257.aString39 = arg0;
				Static18.aClass32_2 = local52;
				Static17.aClass152_4 = arg1;
				return;
			}
		}
		Static234.method4095(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BZZ)V")
	public static void method4766(@OriginalArg(1) boolean arg0) {
		Static173.anInt3338++;
		Static140.method2622();
		if (arg0) {
			Static81.anInt3709++;
			Static111.method2276();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)I")
	public static int method4767(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static359.aByteArrayArrayArray16[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static359.aByteArrayArrayArray16[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
