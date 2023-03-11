import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
	public static int anInt2718;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public static int anInt2719;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "[I")
	public static final int[] anIntArray172 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_104 = new Class145(18, -1);

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "Z")
	public static boolean aBoolean192 = false;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void method2709() {
		Static284.anInt5359 = Static113.aClass239_2.anInt6836 + Static113.aClass239_2.anInt6846 + 2;
		Static124.aStringArray65 = new String[500];
		Static78.anInt6309 = Static165.aClass239_3.anInt6846 + Static165.aClass239_3.anInt6836 + 2;
		for (@Pc(34) int local34 = 0; local34 < Static124.aStringArray65.length; local34++) {
			Static124.aStringArray65[local34] = "";
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIII)V")
	public static void method2710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static154.anInt2806; local8++) {
			@Pc(14) Rectangle local14 = Class55.aRectangleArray1[local8];
			if (arg1 < local14.x + local14.width && local14.x < arg3 + arg1 && local14.y + local14.height > arg0 && arg0 + arg2 > local14.y) {
				Static375.aBooleanArray64[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII)I")
	public static int method2711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}
