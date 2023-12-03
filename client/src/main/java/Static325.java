import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static325 {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_126 = new LocalizedString("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public static int anInt6079 = 0;

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "[I")
	public static final int[] anIntArray413 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)Z")
	public static boolean method5545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static359.aByteArrayArrayArray16[1][arg1][arg0] & 0x2) != 0;
	}
}
