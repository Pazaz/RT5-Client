import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!co", name = "p", descriptor = "[Lclient!sk;")
	public static Class214[] aClass214Array1;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_27 = new Class79("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!co", name = "l", descriptor = "I")
	public static int anInt1248 = 0;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!co", name = "t", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_43 = new Class145(75, 11);

	@OriginalMember(owner = "client!co", name = "u", descriptor = "[I")
	public static final int[] anIntArray90 = new int[4096];

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method1462(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(28) int local28 = arg1[arg0 + local17] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(44) char local44 = Static172.aCharArray2[local28 - 128];
					if (local44 == '\u0000') {
						local44 = '?';
					}
					local28 = local44;
				}
				local8[local15++] = (char) local28;
			}
		}
		return new String(local8, 0, local15);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1464(@OriginalArg(1) int arg0) {
		@Pc(12) String local12 = Integer.toString(arg0);
		for (@Pc(17) int local17 = local12.length() - 3; local17 > 0; local17 -= 3) {
			local12 = local12.substring(0, local17) + "," + local12.substring(local17);
		}
		if (local12.length() > 9) {
			return " <col=00ff80>" + local12.substring(0, local12.length() - 8) + Static70.aClass79_37.method2267(Static295.anInt5581) + " (" + local12 + ")</col>";
		} else if (local12.length() > 6) {
			return " <col=ffffff>" + local12.substring(0, local12.length() - 4) + Static312.aClass79_124.method2267(Static295.anInt5581) + " (" + local12 + ")</col>";
		} else {
			return " <col=ffff00>" + local12 + "</col>";
		}
	}
}
