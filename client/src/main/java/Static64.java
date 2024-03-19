import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "Lclient!rc;")
	public static Class170 aClass170_1;

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString62;

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
	public static int anInt1755;

	@OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
	public static int anInt1763;

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
	public static int anInt1754 = 999999;

	@OriginalMember(owner = "client!ef", name = "X", descriptor = "[I")
	public static final int[] anIntArray117 = new int[128];

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
	public static void method1500() {
		if (Static318.anInt6553 < 0) {
			return;
		}
		@Pc(5) long local5 = Static325.method5658();
		Static318.anInt6553 = (int) ((long) Static318.anInt6553 + Static2.aLong214 - local5);
		if (Static318.anInt6553 > 0) {
			@Pc(22) int local22 = (Static318.anInt6553 << 8) / Static259.anInt4934;
			@Pc(26) int local26 = 255 - local22;
			@Pc(31) float local31 = (float) local22 / 255.0F;
			@Pc(36) float local36 = 1.0F - local31;
			Static179.anInt4232 = ((Static38.anInt1205 & 0xFF00FF) * local22 + (Static146.aClass157_1.anInt5303 & 0xFF00FF) * local26 & 0xFF00FF00) + ((Static38.anInt1205 & 0xFF00) * local22 + ((Static146.aClass157_1.anInt5303 & 0xFF00) * local26) & 0xFF0000) >>> 8;
			Static239.aFloat64 = Static295.aFloat75 + local36 * (Static146.aClass157_1.aFloat70 - Static295.aFloat75);
			Static276.aFloat73 = Static262.aFloat71 + local36 * (Static146.aClass157_1.aFloat66 - Static262.aFloat71);
			Static137.aFloat45 = (Static146.aClass157_1.aFloat69 - Static156.aFloat48) * local36 + Static156.aFloat48;
			Static353.aFloat78 = local36 * (Static146.aClass157_1.aFloat68 - Static330.aFloat76) + Static330.aFloat76;
			Static219.anInt4983 = (local26 * (Static146.aClass157_1.anInt5307 & 0xFF00) + local22 * (Static26.anInt888 & 0xFF00) & 0xFF0000) + (local22 * (Static26.anInt888 & 0xFF00FF) + (Static146.aClass157_1.anInt5307 & 0xFF00FF) * local26 & 0xFF00FF00) >>> 8;
			Static278.aFloat49 = Static214.aFloat62 + (Static146.aClass157_1.aFloat67 - Static214.aFloat62) * local36;
			Static350.aFloat77 = Static101.aFloat19 + local36 * (Static146.aClass157_1.aFloat65 - Static101.aFloat19);
			Static173.anInt4118 = local22 * Static274.anInt5833 + local26 * Static146.aClass157_1.anInt5308 >> 8;
			if (Static248.aClass94_3 != Static146.aClass157_1.aClass94_2) {
				Static307.aClass94_4 = Static344.aClass40_9.method2728(Static248.aClass94_3, Static146.aClass157_1.aClass94_2, local36, Static307.aClass94_4);
			}
		} else {
			Static179.anInt4232 = Static146.aClass157_1.anInt5303;
			Static307.aClass94_4 = Static146.aClass157_1.aClass94_2;
			Static239.aFloat64 = Static146.aClass157_1.aFloat70;
			Static353.aFloat78 = Static146.aClass157_1.aFloat68;
			Static318.anInt6553 = -1;
			Static137.aFloat45 = Static146.aClass157_1.aFloat69;
			Static278.aFloat49 = Static146.aClass157_1.aFloat67;
			Static219.anInt4983 = Static146.aClass157_1.anInt5307;
			Static350.aFloat77 = Static146.aClass157_1.aFloat65;
			Static173.anInt4118 = Static146.aClass157_1.anInt5308;
			Static276.aFloat73 = Static146.aClass157_1.aFloat66;
		}
		Static2.aLong214 = local5;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIZZ)V")
	public static void method1505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static328.anInt6717 = arg0;
		Static200.anInt4590 = arg1;
		Static292.anInt6117 = arg2;
		Static330.aClass154ArrayArrayArray3 = new Class154[4][Static328.anInt6717][Static200.anInt4590];
		Static336.aClass77Array3 = new Class77[4];
		if (arg3) {
			Static134.aClass154ArrayArrayArray1 = new Class154[1][Static328.anInt6717][Static200.anInt4590];
			Static350.anIntArrayArray58 = new int[Static328.anInt6717][Static200.anInt4590];
			Static137.aClass77Array2 = new Class77[1];
		} else {
			Static134.aClass154ArrayArrayArray1 = null;
			Static350.anIntArrayArray58 = null;
			Static137.aClass77Array2 = null;
		}
		if (arg4) {
			Static96.anIntArrayArrayArray3 = new int[4][arg0][arg1];
			Static68.aClass1_Sub9_Sub1Array1 = new Class1_Sub9_Sub1[255];
			Static174.aBooleanArray11 = new boolean[255];
			Static273.anInt5747 = 0;
		} else {
			Static96.anIntArrayArrayArray3 = null;
			Static68.aClass1_Sub9_Sub1Array1 = null;
			Static174.aBooleanArray11 = null;
			Static273.anInt5747 = 0;
		}
		Static203.method693(false);
		Static341.aClass204Array2 = new Class204[500];
		Static62.anInt1710 = 0;
		Static304.aClass204Array1 = new Class204[500];
		Static355.anInt4216 = 0;
		Static261.anIntArrayArrayArray11 = new int[4][Static328.anInt6717 + 1][Static200.anInt4590 + 1];
		Static283.aClass7_Sub1Array3 = new Class7_Sub1[5000];
		Static144.anInt3573 = 0;
		Static100.aBooleanArrayArray7 = new boolean[Static292.anInt6117 + Static292.anInt6117 + 1][Static292.anInt6117 + Static292.anInt6117 + 1];
		Static161.aBooleanArrayArray5 = new boolean[Static292.anInt6117 + Static292.anInt6117 + 2][Static292.anInt6117 + Static292.anInt6117 + 2];
		Static110.aClass23_2 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([III)V")
	public static void method1506(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 31; local7 > 0; local7--) {
			@Pc(13) int local13 = local7 * 36;
			for (@Pc(15) int local15 = 35; local15 > 0; local15--) {
				if (arg0[local15 + local13] == 0 && arg0[local15 + local13 - 1 - 36] != 0) {
					arg0[local13 + local15] = arg1;
				}
			}
		}
	}
}
