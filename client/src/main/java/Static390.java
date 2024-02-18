import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!mda", name = "P", descriptor = "Lclient!rt;")
	public static Class327 aClass327_5;

	@OriginalMember(owner = "client!mda", name = "x", descriptor = "[I")
	public static final int[] anIntArray476 = new int[] { 1, 4, 1, 2, 1 };

	@OriginalMember(owner = "client!mda", name = "z", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_158 = new Class225(53, -1);

	@OriginalMember(owner = "client!mda", name = "H", descriptor = "I")
	public static int anInt6126 = 0;

	@OriginalMember(owner = "client!mda", name = "B", descriptor = "Lclient!hda;")
	public static Class158 aClass158_9 = null;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5492(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		while (local10 < local13 && Static19.method262(arg0.charAt(local10))) {
			local10++;
		}
		while (local10 < local13 && Static19.method262(arg0.charAt(local13 - 1))) {
			local13--;
		}
		@Pc(55) int local55 = local13 - local10;
		if (local55 < 1 || local55 > 12) {
			return null;
		}
		@Pc(75) StringBuffer local75 = new StringBuffer(local55);
		for (@Pc(77) int local77 = local10; local77 < local13; local77++) {
			@Pc(82) char local82 = arg0.charAt(local77);
			if (Static540.method6536(local82)) {
				@Pc(90) char local90 = Static146.method2413(local82);
				if (local90 != '\u0000') {
					local75.append(local90);
				}
			}
		}
		if (local75.length() == 0) {
			return null;
		} else {
			return local75.toString();
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZI)Lclient!rt;")
	public static Class327 method5493(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static30.aFloat105 == 3.0D) {
				return Static559.aClass327_7;
			}
			if ((double) Static30.aFloat105 == 4.0D) {
				return Static484.aClass327_6;
			}
			if ((double) Static30.aFloat105 == 6.0D) {
				return Static142.aClass327_1;
			}
			if ((double) Static30.aFloat105 >= 8.0D) {
				return Static651.aClass327_8;
			}
		} else if (arg0 == 1) {
			if ((double) Static30.aFloat105 == 3.0D) {
				return Static142.aClass327_1;
			}
			if ((double) Static30.aFloat105 == 4.0D) {
				return Static651.aClass327_8;
			}
			if ((double) Static30.aFloat105 == 6.0D) {
				return Static275.aClass327_2;
			}
			if ((double) Static30.aFloat105 >= 8.0D) {
				return aClass327_5;
			}
		} else if (arg0 == 2) {
			if ((double) Static30.aFloat105 == 3.0D) {
				return Static275.aClass327_2;
			}
			if ((double) Static30.aFloat105 == 4.0D) {
				return aClass327_5;
			}
			if ((double) Static30.aFloat105 == 6.0D) {
				return Static364.aClass327_4;
			}
			if ((double) Static30.aFloat105 >= 8.0D) {
				return Static359.aClass327_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IZIZI)I")
	public static int method5494(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(18) Class2_Sub22 local18 = Static556.method7303(arg2, false);
		if (local18 == null) {
			return 0;
		}
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18.anIntArray278.length; local27++) {
			if (local18.anIntArray278[local27] >= 0 && local18.anIntArray278[local27] < Static419.aClass112_1.anInt2670) {
				@Pc(54) Class382 local54 = Static419.aClass112_1.method2486(local18.anIntArray278[local27]);
				@Pc(64) int local64 = local54.method8794(arg1, Static386.aClass49_2.method1161(arg1).anInt7509);
				if (arg0) {
					local25 += local64 * local18.anIntArray279[local27];
				} else {
					local25 += local64;
				}
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)Z")
	public static boolean method5495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static483.method6488(arg1, arg0) | (arg0 & 0x60000) != 0 || Static198.method2957(arg0, arg1) || Static319.method4594(arg0, arg1);
	}
}
