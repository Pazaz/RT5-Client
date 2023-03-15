import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean176 = false;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_54 = new LocalizedString("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method2398() {
		InterfaceList.redraw(Static375.aClass161_14);
		Static129.anInt2458++;
		if (Static301.aBoolean403 && Static278.aBoolean377) {
			@Pc(26) int local26 = Static226.aClass119_1.method3304();
			@Pc(30) int local30 = Static226.aClass119_1.method3313();
			local26 -= Static18.anInt530;
			local30 -= Static392.anInt7228;
			if (local26 < Static4.anInt88) {
				local26 = Static4.anInt88;
			}
			if (local30 < Static100.anInt2111) {
				local30 = Static100.anInt2111;
			}
			if (Static375.aClass161_14.width + local26 > Static301.aClass161_13.width + Static4.anInt88) {
				local26 = Static301.aClass161_13.width + Static4.anInt88 - Static375.aClass161_14.width;
			}
			if (local30 + Static375.aClass161_14.height > Static100.anInt2111 + Static301.aClass161_13.height) {
				local30 = Static301.aClass161_13.height + Static100.anInt2111 - Static375.aClass161_14.height;
			}
			@Pc(105) int local105 = local26 + Static301.aClass161_13.scrollX - Static4.anInt88;
			@Pc(113) int local113 = local30 + Static301.aClass161_13.scrollY - Static100.anInt2111;
			@Pc(128) Class2_Sub13 local128;
			if (Static226.aClass119_1.method3305()) {
				if (Static375.aClass161_14.anInt4271 < Static129.anInt2458) {
					@Pc(205) int local205 = local26 - Static168.anInt7248;
					@Pc(210) int local210 = local30 - Static3.anInt61;
					if (Static375.aClass161_14.anInt4239 < local205 || -Static375.aClass161_14.anInt4239 > local205 || local210 > Static375.aClass161_14.anInt4239 || local210 < -Static375.aClass161_14.anInt4239) {
						Static57.aBoolean124 = true;
					}
				}
				if (Static375.aClass161_14.anObjectArray31 != null && Static57.aBoolean124) {
					local128 = new Class2_Sub13();
					local128.anInt2117 = local113;
					local128.aClass161_3 = Static375.aClass161_14;
					local128.anObjectArray4 = Static375.aClass161_14.anObjectArray31;
					local128.anInt2116 = local105;
					ScriptRunner.method3591(local128);
				}
			} else {
				if (Static57.aBoolean124) {
					Static207.method3699();
					if (Static375.aClass161_14.anObjectArray8 != null) {
						local128 = new Class2_Sub13();
						local128.anInt2116 = local105;
						local128.aClass161_4 = Static182.aClass161_7;
						local128.aClass161_3 = Static375.aClass161_14;
						local128.anObjectArray4 = Static375.aClass161_14.anObjectArray8;
						local128.anInt2117 = local113;
						ScriptRunner.method3591(local128);
					}
					if (Static182.aClass161_7 != null && Static45.method1413(Static375.aClass161_14) != null) {
						Protocol.method5096(Static182.aClass161_7, Static375.aClass161_14);
					}
				} else if ((Static232.anInt4087 == 1 || Static208.method3710()) && Static268.anInt4959 > 2) {
					Static143.method2679(Static392.anInt7228 + Static3.anInt61, Static168.anInt7248 + Static18.anInt530);
				} else if (Static270.method4555()) {
					Static143.method2679(Static392.anInt7228 + Static3.anInt61, Static168.anInt7248 + Static18.anInt530);
				}
				Static375.aClass161_14 = null;
			}
		} else if (Static129.anInt2458 > 1) {
			Static375.aClass161_14 = null;
		}
	}
}
