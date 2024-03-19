import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "[I")
	public static int[] anIntArray563;

	@OriginalMember(owner = "client!vm", name = "G", descriptor = "I")
	public static int anInt6946;

	@OriginalMember(owner = "client!vm", name = "I", descriptor = "Lclient!hb;")
	public static Class1_Sub3_Sub1 aClass1_Sub3_Sub1_3;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
	public static int anInt6936 = 0;

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "[I")
	public static final int[] anIntArray564 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V")
	public static void method5892() {
		Static185.method3740();
		Static248.aClass94_3 = null;
		Static185.aClass157ArrayArray1 = null;
		Static307.aClass94_4 = null;
		Static139.aClass94_1 = null;
		Static344.aClass40_9 = null;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5893(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(22) int local22 = 0; local22 < local8; local22++) {
			@Pc(28) char local28 = arg0.charAt(local22);
			if (local13 == 0) {
				local28 = Character.toLowerCase(local28);
			} else if (local13 == 2 || Character.isUpperCase(local28)) {
				local28 = Static17.method458(local28);
			}
			if (Character.isLetter(local28)) {
				local13 = 0;
			} else if (local28 == '.' || local28 == '?' || local28 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local28)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local22] = local28;
		}
		return new String(local11);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!ro;Lclient!nr;)V")
	public static void method5894(@OriginalArg(1) Class177 arg0, @OriginalArg(2) Class40 arg1) {
		Static176.method3564(0, 0, arg1, arg0);
	}
}
