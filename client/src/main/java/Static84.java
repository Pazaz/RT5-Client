import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_65 = new Class145(10, 8);

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_40 = new Class79("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "Lclient!h;")
	public static final Class89 aClass89_70 = new Class89(21, 3);

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
	public static int anInt1842 = 0;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(CB)Z")
	public static boolean method1908(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(37) char[] local37 = Static172.aCharArray2;
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				@Pc(45) char local45 = local37[local39];
				if (arg0 == local45) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZIIZ)V")
	public static void method1909(@OriginalArg(3) boolean arg0) {
		Static354.aBoolean93 = arg0;
		Static200.anInt3698 = 2;
		Static356.anInt6643 = 22050;
	}
}
