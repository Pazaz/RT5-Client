import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt925;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_34 = new Class145(2, 8);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!h;")
	public static final Class89 aClass89_31 = new Class89(3, 3);

	@OriginalMember(owner = "client!c", name = "f", descriptor = "[B")
	public static final byte[] aByteArray7 = new byte[2048];

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_22 = new Class79("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIB)I")
	public static int method1111(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static80.method5981(arg1, 0, arg0);
	}
}
