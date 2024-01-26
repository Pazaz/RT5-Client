import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!tt;")
	public static Class73 aClass73_4;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZII)I")
	public static int method3066(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(52) int local52 = (arg0 & 0x7F) * 96 >> 7;
			if (local52 < 2) {
				local52 = 2;
			} else if (local52 > 126) {
				local52 = 126;
			}
			return local52 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method3068() {
		Static441.aClass23Array10 = null;
		Static558.aClass23Array7 = null;
		Static174.aClass23Array4 = null;
		Static665.aClass14_12 = null;
		Static437.aClass14_9 = null;
		Static12.aClass23_27 = null;
		Static119.aClass23Array3 = null;
		Static291.aClass23Array8 = null;
		Static471.aClass23Array11 = null;
		Static34.aClass23Array2 = null;
		Static517.aClass23_32 = null;
		Static355.aClass23Array9 = null;
		Static180.aClass14_3 = null;
		Static679.aClass23Array14 = null;
		Static691.aClass23Array15 = null;
		Static28.aClass23Array1 = null;
		Static493.aClass23Array12 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIBI)V")
	public static void method3069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) float local16 = (float) Static30.anInt5644 / (float) Static30.anInt5650;
		@Pc(18) int local18 = arg0;
		@Pc(20) int local20 = arg3;
		if (local16 < 1.0F) {
			local20 = (int) ((float) arg0 * local16);
		} else {
			local18 = (int) ((float) arg3 / local16);
		}
		@Pc(47) int local47 = arg2 - (arg3 - local20) / 2;
		@Pc(56) int local56 = arg1 - (arg0 - local18) / 2;
		Static164.anInt2809 = local56 * Static30.anInt5650 / local18;
		Static615.anInt9389 = Static30.anInt5644 - Static30.anInt5644 * local47 / local20;
		Static558.anInt3181 = -1;
		Static180.anInt3001 = -1;
		Static387.method5440();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Z")
	public static boolean method3070() {
		return Static96.anInt10171 != 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method3071(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) long local17 = 0L;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			local17 = (long) arg0.charAt(local19) + (local17 << 5) - local17;
		}
		return local17;
	}
}
