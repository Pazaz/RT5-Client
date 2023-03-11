import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
	public static int anInt4338;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
	public static int anInt4328 = -1;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "Lclient!h;")
	public static final Class89 aClass89_167 = new Class89(4, 1);

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "Z")
	public static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Lclient!kk;")
	public static Class127 method4120(@OriginalArg(0) int arg0) {
		@Pc(13) Class127[] local13 = Static150.method2740();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class127 local21 = local13[local15];
			if (local21.anInt3427 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZI)I")
	public static int method4121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static70.anIntArray112[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII)V")
	public static void method4123(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 > Static161.anInt2954 || Static365.anInt6832 > arg3) {
			return;
		}
		@Pc(23) boolean local23;
		if (arg4 < Static28.anInt675) {
			local23 = false;
			arg4 = Static28.anInt675;
		} else if (arg4 > Static82.anInt1837) {
			local23 = false;
			arg4 = Static82.anInt1837;
		} else {
			local23 = true;
		}
		@Pc(42) boolean local42;
		if (Static28.anInt675 > arg0) {
			arg0 = Static28.anInt675;
			local42 = false;
		} else if (arg0 > Static82.anInt1837) {
			local42 = false;
			arg0 = Static82.anInt1837;
		} else {
			local42 = true;
		}
		if (Static365.anInt6832 <= arg1) {
			Static101.method2163(arg0, Static357.anIntArrayArray58[arg1++], arg2, arg4);
		} else {
			arg1 = Static365.anInt6832;
		}
		if (arg3 <= Static161.anInt2954) {
			Static101.method2163(arg0, Static357.anIntArrayArray58[arg3--], arg2, arg4);
		} else {
			arg3 = Static161.anInt2954;
		}
		@Pc(95) int local95;
		if (local23 && local42) {
			for (local95 = arg1; local95 <= arg3; local95++) {
				@Pc(101) int[] local101 = Static357.anIntArrayArray58[local95];
				local101[arg4] = local101[arg0] = arg2;
			}
		} else if (local23) {
			for (local95 = arg1; local95 <= arg3; local95++) {
				Static357.anIntArrayArray58[local95][arg4] = arg2;
			}
		} else if (local42) {
			for (local95 = arg1; local95 <= arg3; local95++) {
				Static357.anIntArrayArray58[local95][arg0] = arg2;
			}
		}
	}
}
