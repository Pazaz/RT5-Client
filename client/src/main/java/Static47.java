import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!co", name = "p", descriptor = "[Lclient!sk;")
	public static Class214[] aClass214Array1;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_27 = new LocalizedString("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!co", name = "s", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!co", name = "t", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_43 = new ClientProt(75, 11);

	@OriginalMember(owner = "client!co", name = "u", descriptor = "[I")
	public static final int[] anIntArray90 = new int[4096];

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1464(@OriginalArg(1) int arg0) {
		@Pc(12) String local12 = Integer.toString(arg0);
		for (@Pc(17) int local17 = local12.length() - 3; local17 > 0; local17 -= 3) {
			local12 = local12.substring(0, local17) + "," + local12.substring(local17);
		}
		if (local12.length() > 9) {
			return " <col=00ff80>" + local12.substring(0, local12.length() - 8) + Static70.aClass79_37.method2267(client.language) + " (" + local12 + ")</col>";
		} else if (local12.length() > 6) {
			return " <col=ffffff>" + local12.substring(0, local12.length() - 4) + Static312.aClass79_124.method2267(client.language) + " (" + local12 + ")</col>";
		} else {
			return " <col=ffff00>" + local12 + "</col>";
		}
	}
}
