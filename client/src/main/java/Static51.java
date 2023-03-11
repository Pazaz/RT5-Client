import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "Lclient!on;")
	public static Class14 aClass14_2;

	@OriginalMember(owner = "client!cu", name = "B", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_28 = new Class79("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
	public static int anInt1369 = 0;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIZII)V")
	public static void method1545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static19.anInt535 = arg0;
		Static348.anInt6446 = arg1;
		Static180.anInt3404 = arg4;
		Static359.anInt6702 = arg2;
		Static311.anInt5810 = arg5;
		if (arg3 && Static359.anInt6702 >= 100) {
			Static136.anInt6778 = Static311.anInt5810 * 128 + 64;
			Static211.anInt3777 = Static19.anInt535 * 128 + 64;
			Static102.anInt3592 = Static386.method6032(Static136.anInt6778, Static211.anInt3777, Static355.anInt6585) - Static180.anInt3404;
		}
		Static314.anInt5911 = 2;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method1546(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local16[local18] = (byte) local24;
			} else if (local24 == '€') {
				local16[local18] = -128;
			} else if (local24 == '‚') {
				local16[local18] = -126;
			} else if (local24 == 'ƒ') {
				local16[local18] = -125;
			} else if (local24 == '„') {
				local16[local18] = -124;
			} else if (local24 == '…') {
				local16[local18] = -123;
			} else if (local24 == '†') {
				local16[local18] = -122;
			} else if (local24 == '‡') {
				local16[local18] = -121;
			} else if (local24 == 'ˆ') {
				local16[local18] = -120;
			} else if (local24 == '‰') {
				local16[local18] = -119;
			} else if (local24 == 'Š') {
				local16[local18] = -118;
			} else if (local24 == '‹') {
				local16[local18] = -117;
			} else if (local24 == 'Œ') {
				local16[local18] = -116;
			} else if (local24 == 'Ž') {
				local16[local18] = -114;
			} else if (local24 == '‘') {
				local16[local18] = -111;
			} else if (local24 == '’') {
				local16[local18] = -110;
			} else if (local24 == '“') {
				local16[local18] = -109;
			} else if (local24 == '”') {
				local16[local18] = -108;
			} else if (local24 == '•') {
				local16[local18] = -107;
			} else if (local24 == '–') {
				local16[local18] = -106;
			} else if (local24 == '—') {
				local16[local18] = -105;
			} else if (local24 == '˜') {
				local16[local18] = -104;
			} else if (local24 == '™') {
				local16[local18] = -103;
			} else if (local24 == 'š') {
				local16[local18] = -102;
			} else if (local24 == '›') {
				local16[local18] = -101;
			} else if (local24 == 'œ') {
				local16[local18] = -100;
			} else if (local24 == 'ž') {
				local16[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIIIB)V")
	public static void method1547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(19) int local19 = arg5 + arg0;
		for (@Pc(21) int local21 = arg5; local21 < local19; local21++) {
			Static101.method2163(arg4, Static357.anIntArrayArray58[local21], arg3, arg1);
		}
		@Pc(46) int local46 = arg1 + arg0;
		for (@Pc(48) int local48 = arg2; local48 > local10; local48--) {
			Static101.method2163(arg4, Static357.anIntArrayArray58[local48], arg3, arg1);
		}
		@Pc(67) int local67 = arg4 - arg0;
		for (@Pc(69) int local69 = local19; local69 <= local10; local69++) {
			@Pc(75) int[] local75 = Static357.anIntArrayArray58[local69];
			Static101.method2163(local46, local75, arg3, arg1);
			Static101.method2163(arg4, local75, arg3, local67);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)I")
	public static int method1548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static314.aByteArrayArray17 == null ? 0 : Static314.aByteArrayArray17[arg0][arg1] & 0xFF;
	}
}
