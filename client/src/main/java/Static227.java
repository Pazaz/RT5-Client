import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Lclient!nk;")
	public static Class161 aClass161_11;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_90 = new LocalizedString("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public static void method3989() {
		for (@Pc(6) Class2_Sub5 local6 = (Class2_Sub5) Static129.aClass135_19.head(); local6 != null; local6 = (Class2_Sub5) Static129.aClass135_19.next()) {
			if (Static304.method5213(local6.anInt1005)) {
				Static391.method6454(local6);
			}
		}
		if (Static268.anInt4959 == 1) {
			Static375.aBoolean477 = false;
			Static369.method6221(Static107.anInt2220, Static305.anInt5743, Static352.anInt6519, Static363.anInt6801);
			return;
		}
		Static369.method6221(Static107.anInt2220, Static305.anInt5743, Static352.anInt6519, Static363.anInt6801);
		@Pc(51) int local51 = Static113.aClass239_2.method6126(Static180.aClass79_74.getLocalized(client.language));
		for (@Pc(56) Class2_Sub5 local56 = (Class2_Sub5) Static129.aClass135_19.head(); local56 != null; local56 = (Class2_Sub5) Static129.aClass135_19.next()) {
			@Pc(62) int local62 = Static218.method1096(local56);
			if (local62 > local51) {
				local51 = local62;
			}
		}
		Static107.anInt2220 = local51 + 8;
		Static352.anInt6519 = Static268.anInt4959 * 16 + (Static270.aBoolean371 ? 26 : 22);
	}
}
