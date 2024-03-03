import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt925;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_22 = new LocalizedString("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIB)I")
	public static int method1111(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Packet.getcrc(arg1, 0, arg0);
	}
}
