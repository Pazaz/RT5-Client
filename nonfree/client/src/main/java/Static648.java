import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "Lclient!al;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Z")
	public static final boolean aBoolean742 = false;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "[I")
	public static final int[] anIntArray754 = new int[8];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)V")
	public static void method8483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static693.anInt10382 == arg2 && Static138.anInt2512 == arg0 && arg1 == Static49.anInt1045) {
			return;
		}
		Static75.aBoolean521 = true;
		Static138.anInt2512 = arg0;
		Static693.anInt10382 = arg2;
		Static49.anInt1045 = arg1;
		@Pc(49) double local49 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(59) double local59 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(62) double local62 = Math.cos(local59);
		@Pc(65) double local65 = Math.sin(local59);
		@Pc(68) double local68 = Math.cos(local49);
		@Pc(71) double local71 = Math.sin(local49);
		Static683.aDouble24 = local62;
		Static118.aDouble11 = local68;
		Static614.aDouble22 = -local62 * local71;
		Static364.aDouble17 = local65;
		Static98.aDouble9 = local65 * local71;
		Static534.aDouble21 = local62 * local68;
		Static177.aDouble12 = local68 * -local65;
		Static398.aDouble20 = 0.0D;
		Static309.aDouble16 = local71;
	}
}
