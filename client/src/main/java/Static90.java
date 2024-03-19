import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "Lclient!qa;")
	public static Class29 aClass29_9;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public static int anInt2382 = 0;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "Z")
	public static boolean aBoolean156 = true;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "[I")
	public static final int[] anIntArray150 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	public static void method1976(@OriginalArg(1) int arg0) {
		Static274.aClass215_83 = new Class215(arg0);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIII)V")
	public static void method1977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static197.anInt4520 < arg4 || Static180.anInt4240 > arg2) {
			return;
		}
		@Pc(31) boolean local31;
		if (Static239.anInt5299 > arg1) {
			arg1 = Static239.anInt5299;
			local31 = false;
		} else if (Static179.anInt4229 < arg1) {
			local31 = false;
			arg1 = Static179.anInt4229;
		} else {
			local31 = true;
		}
		@Pc(55) boolean local55;
		if (arg3 < Static239.anInt5299) {
			local55 = false;
			arg3 = Static239.anInt5299;
		} else if (Static179.anInt4229 < arg3) {
			local55 = false;
			arg3 = Static179.anInt4229;
		} else {
			local55 = true;
		}
		if (Static180.anInt4240 > arg4) {
			arg4 = Static180.anInt4240;
		} else {
			Static12.method349(arg3, Static87.anIntArrayArray9[arg4++], arg0, arg1);
		}
		if (arg2 > Static197.anInt4520) {
			arg2 = Static197.anInt4520;
		} else {
			Static12.method349(arg3, Static87.anIntArrayArray9[arg2--], arg0, arg1);
		}
		@Pc(113) int local113;
		if (local31 && local55) {
			for (local113 = arg4; local113 <= arg2; local113++) {
				@Pc(119) int[] local119 = Static87.anIntArrayArray9[local113];
				local119[arg1] = local119[arg3] = arg0;
			}
		} else if (local31) {
			for (local113 = arg4; local113 <= arg2; local113++) {
				Static87.anIntArrayArray9[local113][arg1] = arg0;
			}
		} else if (local55) {
			for (local113 = arg4; local113 <= arg2; local113++) {
				Static87.anIntArrayArray9[local113][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)B")
	public static byte method1978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!nr;ZI[[I)V")
	public static void method1979(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int[][] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			@Pc(23) int[][] local23;
			@Pc(25) int local25;
			@Pc(29) int local29;
			if (arg3 == null) {
				local23 = null;
			} else {
				local23 = new int[Static25.anInt850 + 1][Static219.anInt4987 + 1];
				for (local25 = 0; local25 <= Static219.anInt4987; local25++) {
					for (local29 = 0; local29 <= Static25.anInt850; local29++) {
						local23[local29][local25] = Static220.anIntArrayArrayArray9[local11][local29][local25] - arg3[local29][local25];
					}
				}
			}
			local25 = 0;
			local29 = 0;
			if (!arg2) {
				if (Static265.aBoolean396) {
					local25 = 2;
				}
				if (Static307.aBoolean465) {
					local29 = 8;
				}
				if (Static102.anInt2545 != 0) {
					if (local11 == 0 || Static207.anInt4798 >= 96) {
						local29 |= 0x10;
					}
					local25 |= 0x1;
				}
			}
			if (Static265.aBoolean396) {
				local29 |= 0x7;
			}
			@Pc(125) Class77 local125 = arg1.method2781(Static25.anInt850, Static219.anInt4987, Static220.anIntArrayArrayArray9[local11], local23, local25, local29);
			Static79.method3951(local11, local125);
		}
	}
}
