import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_20 = new Class225(96, 7);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)Z")
	public static boolean method1027(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(CB)B")
	public static byte method1028(@OriginalArg(0) char arg0) {
		@Pc(36) byte local36;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local36 = (byte) arg0;
		} else if (arg0 == '€') {
			local36 = -128;
		} else if (arg0 == '‚') {
			local36 = -126;
		} else if (arg0 == 'ƒ') {
			local36 = -125;
		} else if (arg0 == '„') {
			local36 = -124;
		} else if (arg0 == '…') {
			local36 = -123;
		} else if (arg0 == '†') {
			local36 = -122;
		} else if (arg0 == '‡') {
			local36 = -121;
		} else if (arg0 == 'ˆ') {
			local36 = -120;
		} else if (arg0 == '‰') {
			local36 = -119;
		} else if (arg0 == 'Š') {
			local36 = -118;
		} else if (arg0 == '‹') {
			local36 = -117;
		} else if (arg0 == 'Œ') {
			local36 = -116;
		} else if (arg0 == 'Ž') {
			local36 = -114;
		} else if (arg0 == '‘') {
			local36 = -111;
		} else if (arg0 == '’') {
			local36 = -110;
		} else if (arg0 == '“') {
			local36 = -109;
		} else if (arg0 == '”') {
			local36 = -108;
		} else if (arg0 == '•') {
			local36 = -107;
		} else if (arg0 == '–') {
			local36 = -106;
		} else if (arg0 == '—') {
			local36 = -105;
		} else if (arg0 == '˜') {
			local36 = -104;
		} else if (arg0 == '™') {
			local36 = -103;
		} else if (arg0 == 'š') {
			local36 = -102;
		} else if (arg0 == '›') {
			local36 = -101;
		} else if (arg0 == 'œ') {
			local36 = -100;
		} else if (arg0 == 'ž') {
			local36 = -98;
		} else if (arg0 == 'Ÿ') {
			local36 = -97;
		} else {
			local36 = 63;
		}
		return local36;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)V")
	public static void method1029(@OriginalArg(1) int arg0) {
		Static391.anInt6133 = arg0;
		Static186.aClass82_67.method2157();
	}
}
