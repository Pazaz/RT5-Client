import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "Lclient!fb;")
	public static Class120 aClass120_1;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "Lclient!hla;")
	public static final Class168 aClass168_2 = new Class168();

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "Lclient!kda;")
	public static final Class204 aClass204_7 = new Class204(7, 2);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method2861(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(8) int local8 = Static108.method2065(arg0, arg1);
		@Pc(13) String[] local13 = new String[local8 + 1];
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local8; local27++) {
			@Pc(30) int local30;
			for (local30 = local25; arg1 != arg0.charAt(local30); local30++) {
			}
			local13[local23++] = arg0.substring(local25, local30);
			local25 = local30 + 1;
		}
		local13[local8] = arg0.substring(local25);
		return local13;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IC)Z")
	public static boolean method2862(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(38) char[] local38 = Static376.aCharArray7;
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				@Pc(46) char local46 = local38[local40];
				if (local46 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)Lclient!om;")
	public static Class280 method2864(@OriginalArg(0) int arg0) {
		@Pc(6) Class280[] local6 = Static400.method7112();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			@Pc(19) Class280 local19 = local6[local8];
			if (arg0 == local19.anInt7039) {
				return local19;
			}
		}
		return null;
	}
}
