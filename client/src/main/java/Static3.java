import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "[I")
	public static int[] anIntArray13;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!pc;")
	public static final Class287 aClass287_1 = new Class287(10, 19);

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
	public static void method87(@OriginalArg(0) int arg0) {
		Static296.anInt4792 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static619.anInt1566; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static662.anInt9843; local6++) {
				if (Static334.aClass291ArrayArrayArray1[arg0][local3][local6] == null) {
					Static334.aClass291ArrayArrayArray1[arg0][local3][local6] = new Class291(arg0);
				}
			}
		}
	}
}
