import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

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
		@Pc(15) LocType local15 = client.LocTypes.get(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local15.method1521(arg1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!nk;IIB)V")
	public static void method4939(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.yMode == 0) {
			arg0.anInt4254 = arg0.baseY;
		} else if (arg0.yMode == 1) {
			arg0.anInt4254 = arg0.baseY + (arg2 - arg0.height) / 2;
		} else if (arg0.yMode == 2) {
			arg0.anInt4254 = arg2 - arg0.height - arg0.baseY;
		} else if (arg0.yMode == 3) {
			arg0.anInt4254 = arg2 * arg0.baseY >> 14;
		} else if (arg0.yMode == 4) {
			arg0.anInt4254 = (arg0.baseY * arg2 >> 14) + (arg2 - arg0.height) / 2;
		} else {
			arg0.anInt4254 = arg2 - (arg0.baseY * arg2 >> 14) - arg0.height;
		}
		if (arg0.xMode == 0) {
			arg0.anInt4305 = arg0.baseX;
		} else if (arg0.xMode == 1) {
			arg0.anInt4305 = (arg1 - arg0.width) / 2 + arg0.baseX;
		} else if (arg0.xMode == 2) {
			arg0.anInt4305 = arg1 - arg0.baseX - arg0.width;
		} else if (arg0.xMode == 3) {
			arg0.anInt4305 = arg0.baseX * arg1 >> 14;
		} else if (arg0.xMode == 4) {
			arg0.anInt4305 = (arg1 * arg0.baseX >> 14) + (arg1 - arg0.width) / 2;
		} else {
			arg0.anInt4305 = arg1 - arg0.width - (arg1 * arg0.baseX >> 14);
		}
		if (!Static18.qa_op_test) {
			return;
		}
		if (Static45.method1404(arg0).events == 0 && arg0.type != 0) {
			return;
		}
		if (arg0.anInt4254 < 0) {
			arg0.anInt4254 = 0;
		} else if (arg0.height + arg0.anInt4254 > arg2) {
			arg0.anInt4254 = arg2 - arg0.height;
		}
		if (arg0.anInt4305 < 0) {
			arg0.anInt4305 = 0;
			return;
		}
		if (arg0.anInt4305 + arg0.width > arg1) {
			arg0.anInt4305 = arg1 - arg0.width;
			return;
		}
	}
}
