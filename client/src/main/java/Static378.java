import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static378 {

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt7079;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_146 = new LocalizedString("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Lclient!vj;")
	public static Map method6312() {
		return MapList.aClass2_Sub2_Sub17_3;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z")
	public static boolean method6314(@OriginalArg(1) int arg0) {
		Static1.aBoolean1 = true;
		Protocol.verifyId = arg0 + 1 & 0xFFFF;
		return true;
	}
}
