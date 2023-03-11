import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	public static int anInt2960;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "Lclient!df;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "[I")
	public static final int[] anIntArray188 = new int[50];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)I")
	public static int method2977(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(15) int local15 = local9 | local9 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)V")
	public static void method2979(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static128.aBooleanArray21[arg0]) {
			Static283.aClass197_68.method5095(arg0);
			Static26.aClass161ArrayArray1[arg0] = null;
			Static113.aClass161ArrayArray2[arg0] = null;
			Static128.aBooleanArray21[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!wm;I)V")
	public static void method2980(@OriginalArg(0) Class19 arg0) {
		if (Static375.aBoolean477) {
			Static34.method4810(arg0);
		} else {
			Static165.method3156(arg0);
		}
	}
}
