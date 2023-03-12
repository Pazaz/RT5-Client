import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static312 {

	@OriginalMember(owner = "client!sa", name = "P", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_123 = new LocalizedString("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_124 = new LocalizedString("K", "T", "K", "K");

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
	public static int anInt5844 = -1;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg4) {
			Static97.method2096(arg4, arg2, arg6, arg1, arg3, arg0);
		} else if (arg0 - arg4 >= Static28.anInt675 && Static82.anInt1837 >= arg0 + arg4 && Static365.anInt6832 <= arg3 - arg5 && arg3 + arg5 <= Static161.anInt2954) {
			Static237.method4118(arg1, arg6, arg5, arg2, arg3, arg4, arg0);
		} else {
			Static123.method2412(arg3, arg1, arg2, arg6, arg0, arg5, arg4);
		}
	}
}
