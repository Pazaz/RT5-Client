import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!br", name = "V", descriptor = "Lclient!cf;")
	public static Class2_Sub5 aClass2_Sub5_2;

	@OriginalMember(owner = "client!br", name = "T", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_21 = new LocalizedString("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!wm;Lclient!hp;III)V")
	public static void method990(@OriginalArg(0) TextureProvider arg0, @OriginalArg(1) BaseEntity arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class67 local12;
		if (arg3 < Scene.anInt1684) {
			local12 = Scene.aClass67ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method6076()) {
				arg1.method6075(Scene.anInt4716, 0, 0, arg0, true, local12.aClass11_Sub2_2);
			}
		}
		if (arg4 < Scene.anInt1684) {
			local12 = Scene.aClass67ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method6076()) {
				arg1.method6075(0, Scene.anInt4716, 0, arg0, true, local12.aClass11_Sub2_2);
			}
		}
		if (arg3 < Scene.anInt1684 && arg4 < Scene.anInt3773) {
			local12 = Scene.aClass67ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method6076()) {
				arg1.method6075(Scene.anInt4716, Scene.anInt4716, 0, arg0, true, local12.aClass11_Sub2_2);
			}
		}
		if (arg3 < Scene.anInt1684 && arg4 > 0) {
			local12 = Scene.aClass67ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method6076()) {
				arg1.method6075(Scene.anInt4716, -Scene.anInt4716, 0, arg0, true, local12.aClass11_Sub2_2);
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(Z)I")
	public static int method991() {
		return 2;
	}
}
