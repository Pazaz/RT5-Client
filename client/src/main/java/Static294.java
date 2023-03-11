import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "Lclient!r;")
	public static Class197 aClass197_75;

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_117 = new Class79("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!qt", name = "E", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILclient!r;)Lclient!ne;")
	public static Class2_Sub25 method5062(@OriginalArg(0) int arg0, @OriginalArg(2) Class197 arg1) {
		@Pc(15) byte[] local15 = arg1.method5082(arg0);
		return local15 == null ? null : new Class2_Sub25(local15);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!bt;II)V")
	public static void method5065(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (Static317.aClass205_6 == null) {
			return;
		}
		try {
			Static317.aClass205_6.method5214(0L);
			Static317.aClass205_6.method5215(arg1, arg0.aByteArray73, 24);
		} catch (@Pc(23) Exception local23) {
		}
	}
}
