import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!gu", name = "u", descriptor = "[I")
	public static int[] anIntArray156;

	@OriginalMember(owner = "client!gu", name = "x", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!gu", name = "w", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_53 = new LocalizedString("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)I")
	public static int method2393(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static324.method5541(arg3, arg2, arg0, 0, arg1, arg5, arg4);
	}

}
