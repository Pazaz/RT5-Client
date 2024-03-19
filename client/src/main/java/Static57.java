import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Lclient!qa;")
	public static Class29 aClass29_17;

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
	public static int anInt5676;

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString206 = "flash1:";

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ro;B)Z")
	public static boolean method4835(@OriginalArg(0) Class177 arg0) {
		if (arg0.anIntArray437 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray437.length; local17++) {
			@Pc(24) int local24 = Static237.method4508(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray440[local17];
			if (arg0.anIntArray437[local17] == 2) {
				if (local24 >= local29) {
					return false;
				}
			} else if (arg0.anIntArray437[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray437[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILclient!fl;Ljava/awt/Canvas;ILclient!ud;)Lclient!nr;")
	public static Class40 method4841(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class199 arg4) {
		try {
			@Pc(14) Class local14 = Class.forName("Class40_Sub2");
			@Pc(60) Constructor local60 = local14.getConstructor(Canvas.class, Interface4.class, Integer.TYPE, Integer.TYPE, Class199.class);
			return (Class40) local60.newInstance(arg2, arg1, Integer.valueOf(arg0), new Integer(arg3), arg4);
		} catch (@Pc(93) Exception local93) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(CZ)B")
	public static byte method4845(@OriginalArg(0) char arg0) {
		@Pc(30) byte local30;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local30 = (byte) arg0;
		} else if (arg0 == '€') {
			local30 = -128;
		} else if (arg0 == '‚') {
			local30 = -126;
		} else if (arg0 == 'ƒ') {
			local30 = -125;
		} else if (arg0 == '„') {
			local30 = -124;
		} else if (arg0 == '…') {
			local30 = -123;
		} else if (arg0 == '†') {
			local30 = -122;
		} else if (arg0 == '‡') {
			local30 = -121;
		} else if (arg0 == 'ˆ') {
			local30 = -120;
		} else if (arg0 == '‰') {
			local30 = -119;
		} else if (arg0 == 'Š') {
			local30 = -118;
		} else if (arg0 == '‹') {
			local30 = -117;
		} else if (arg0 == 'Œ') {
			local30 = -116;
		} else if (arg0 == 'Ž') {
			local30 = -114;
		} else if (arg0 == '‘') {
			local30 = -111;
		} else if (arg0 == '’') {
			local30 = -110;
		} else if (arg0 == '“') {
			local30 = -109;
		} else if (arg0 == '”') {
			local30 = -108;
		} else if (arg0 == '•') {
			local30 = -107;
		} else if (arg0 == '–') {
			local30 = -106;
		} else if (arg0 == '—') {
			local30 = -105;
		} else if (arg0 == '˜') {
			local30 = -104;
		} else if (arg0 == '™') {
			local30 = -103;
		} else if (arg0 == 'š') {
			local30 = -102;
		} else if (arg0 == '›') {
			local30 = -101;
		} else if (arg0 == 'œ') {
			local30 = -100;
		} else if (arg0 == 'ž') {
			local30 = -98;
		} else if (arg0 == 'Ÿ') {
			local30 = -97;
		} else {
			local30 = 63;
		}
		return local30;
	}
}
