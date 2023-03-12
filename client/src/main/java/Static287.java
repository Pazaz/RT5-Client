import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!ui;")
	public static Class233 aClass233_1;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray52 = new String[5];

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "[I")
	public static final int[] anIntArray369 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)I")
	public static int method4929(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)Z")
	public static boolean method4931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(15) Class41 local15 = Static359.LocTypeList.method5163(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local15.method1521(arg1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!nk;IIB)V")
	public static void method4939(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByte46 == 0) {
			arg0.anInt4254 = arg0.anInt4249;
		} else if (arg0.aByte46 == 1) {
			arg0.anInt4254 = arg0.anInt4249 + (arg2 - arg0.anInt4261) / 2;
		} else if (arg0.aByte46 == 2) {
			arg0.anInt4254 = arg2 - arg0.anInt4261 - arg0.anInt4249;
		} else if (arg0.aByte46 == 3) {
			arg0.anInt4254 = arg2 * arg0.anInt4249 >> 14;
		} else if (arg0.aByte46 == 4) {
			arg0.anInt4254 = (arg0.anInt4249 * arg2 >> 14) + (arg2 - arg0.anInt4261) / 2;
		} else {
			arg0.anInt4254 = arg2 - (arg0.anInt4249 * arg2 >> 14) - arg0.anInt4261;
		}
		if (arg0.aByte45 == 0) {
			arg0.anInt4305 = arg0.anInt4241;
		} else if (arg0.aByte45 == 1) {
			arg0.anInt4305 = (arg1 - arg0.anInt4248) / 2 + arg0.anInt4241;
		} else if (arg0.aByte45 == 2) {
			arg0.anInt4305 = arg1 - arg0.anInt4241 - arg0.anInt4248;
		} else if (arg0.aByte45 == 3) {
			arg0.anInt4305 = arg0.anInt4241 * arg1 >> 14;
		} else if (arg0.aByte45 == 4) {
			arg0.anInt4305 = (arg1 * arg0.anInt4241 >> 14) + (arg1 - arg0.anInt4248) / 2;
		} else {
			arg0.anInt4305 = arg1 - arg0.anInt4248 - (arg1 * arg0.anInt4241 >> 14);
		}
		if (!Static18.aBoolean30) {
			return;
		}
		if (Static45.method1404(arg0).anInt1758 == 0 && arg0.anInt4272 != 0) {
			return;
		}
		if (arg0.anInt4254 < 0) {
			arg0.anInt4254 = 0;
		} else if (arg0.anInt4261 + arg0.anInt4254 > arg2) {
			arg0.anInt4254 = arg2 - arg0.anInt4261;
		}
		if (arg0.anInt4305 < 0) {
			arg0.anInt4305 = 0;
			return;
		}
		if (arg0.anInt4305 + arg0.anInt4248 > arg1) {
			arg0.anInt4305 = arg1 - arg0.anInt4248;
			return;
		}
	}
}
