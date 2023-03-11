import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
	public static int anInt2594;

	@OriginalMember(owner = "client!hs", name = "w", descriptor = "Lclient!r;")
	public static Class197 aClass197_34;

	@OriginalMember(owner = "client!hs", name = "y", descriptor = "Lclient!r;")
	public static Class197 aClass197_35;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "Lclient!h;")
	public static final Class89 aClass89_108 = new Class89(59, -2);

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_60 = new Class79("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_61 = new Class79("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
	public static int anInt2593 = -50;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_62 = new Class79("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
	public static int anInt2595 = -1;

	@OriginalMember(owner = "client!hs", name = "A", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_18 = new Class98(4);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)V")
	public static void method2585(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub2_Sub7 local13 = Static316.method5413(11, arg0);
		local13.method2312();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method2594(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(50) char[] local50 = new char[local34];
		local50[0] = '+';
		for (@Pc(58) int local58 = local34 - 1; local58 > 0; local58--) {
			@Pc(62) int local62 = arg0;
			arg0 /= 10;
			@Pc(73) int local73 = local62 - arg0 * 10;
			if (local73 >= 10) {
				local50[local58] = (char) (local73 + 87);
			} else {
				local50[local58] = (char) (local73 + 48);
			}
		}
		return new String(local50);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BII)V")
	public static void method2595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub2_Sub7 local14 = Static316.method5413(16, arg0);
		local14.method2311();
		local14.anInt2289 = arg1;
	}
}
