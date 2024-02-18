import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "Lclient!lja;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "Lclient!sb;")
	public static Class330 aClass330_73;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_144 = new Class225(92, 4);

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
	public static int anInt5617 = -50;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
	public static int anInt5621 = 0;

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "J")
	public static long aLong169 = 0L;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
	public static void method5043() {
		Static695.anIntArray868 = Static265.method3857(0.4F);
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V")
	public static void method5046() {
		if (Static625.anInt9472 <= 0) {
			Static110.aString19 = "";
			return;
		}
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < Static393.aStringArray32.length; local21++) {
			if (Static393.aStringArray32[local21].indexOf("--> ") != -1) {
				local19++;
				if (Static625.anInt9472 == local19) {
					Static110.aString19 = Static393.aStringArray32[local21].substring(Static393.aStringArray32[local21].indexOf(">") + 2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZIIII)Lclient!gm;")
	public static Class148 method5047(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(31) long local31 = (long) arg1 & 0xFFFFL | ((long) arg3 & 0xFFFFL) << 16 | (long) arg2 << 48 & 0xFFFFL << 48 | ((long) arg0 & 0xFFFFL) << 32;
		@Pc(43) Class148 local43 = (Class148) Static123.aClass82_53.method2156(local31);
		if (local43 == null) {
			local43 = Static324.aClass307_1.method7072(Static99.aClass78_1, arg3, arg1, arg0, arg2);
			Static123.aClass82_53.method2150(local43, local31);
		}
		return local43;
	}
}
