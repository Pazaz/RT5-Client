import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString57;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_121 = new Class79("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
	public static int anInt5780 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)V")
	public static void method5255(@OriginalArg(0) int arg0) {
		if (!client.preferences.aBoolean363) {
			arg0 = -1;
		}
		if (Static29.anInt721 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class220 local25 = Static221.aClass150_3.method3731(arg0);
			@Pc(29) Class48 local29 = local25.method5658();
			if (local29 == null) {
				arg0 = -1;
			} else {
				GameShell.signlink.setCursor(local29.method1680(), new Point(local25.anInt6203, local25.anInt6200), local29.method1685(), Static21.aCanvas1, local29.method1683());
				Static29.anInt721 = arg0;
			}
		}
		if (arg0 == -1 && Static29.anInt721 != -1) {
			GameShell.signlink.setCursor(-1, new Point(), null, Static21.aCanvas1, -1);
			Static29.anInt721 = -1;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILclient!oe;BI)V")
	public static void method5256(@OriginalArg(0) int arg0, @OriginalArg(1) Npc arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt4597 && arg0 != -1) {
			@Pc(78) Class157 local78 = Static39.aClass85_1.method2371(arg0);
			@Pc(81) int local81 = local78.anInt4022;
			if (local81 == 1) {
				arg1.anInt4592 = 1;
				arg1.anInt4624 = 0;
				arg1.anInt4607 = 0;
				arg1.anInt4590 = arg2;
				arg1.anInt4598 = 0;
				Static1.method4(local78, false, arg1.aByte78, arg1.anInt6781, arg1.anInt6783, arg1.anInt4607);
			}
			if (local81 == 2) {
				arg1.anInt4598 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt4597 == -1 || Static39.aClass85_1.method2371(arg0).anInt4023 >= Static39.aClass85_1.method2371(arg1.anInt4597).anInt4023) {
			arg1.anInt4597 = arg0;
			arg1.anInt4598 = 0;
			arg1.anInt4607 = 0;
			arg1.anInt4624 = 0;
			arg1.anInt4592 = 1;
			arg1.anInt4590 = arg2;
			arg1.anInt4642 = arg1.anInt4643;
			if (arg1.anInt4597 != -1) {
				Static1.method4(Static39.aClass85_1.method2371(arg1.anInt4597), false, arg1.aByte78, arg1.anInt6781, arg1.anInt6783, arg1.anInt4607);
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)J")
	public static long method5257() {
		return Static316.aClass5_1.method4405();
	}
}
