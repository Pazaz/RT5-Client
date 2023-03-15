import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static146 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_63 = new LocalizedString("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	public static int anInt2703 = 0;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public static int anInt2705 = 2;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
	public static int anInt2706 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(CI)Z")
	public static boolean method2697(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

}
