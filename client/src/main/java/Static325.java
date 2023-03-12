import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static325 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "Lclient!o;")
	public static Interface9 anInterface9_1 = null;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_126 = new Class79("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public static int anInt6079 = 0;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_220 = new ClientProt(30, -1);

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "[I")
	public static final int[] anIntArray413 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "[I")
	public static final int[] anIntArray414 = new int[25];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!o;Lclient!r;Lclient!r;B)V")
	public static void method5544(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) Class197 arg2) {
		Static137.aClass197_33 = arg1;
		anInterface9_1 = arg0;
		Static308.aClass197_80 = arg2;
		if (Static137.aClass197_33 != null) {
			Static21.anInt554 = Static137.aClass197_33.method5081(1);
		}
		if (Static308.aClass197_80 != null) {
			Static361.anInt6769 = Static308.aClass197_80.method5081(1);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)Z")
	public static boolean method5545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static359.aByteArrayArrayArray16[1][arg1][arg0] & 0x2) != 0;
	}
}
