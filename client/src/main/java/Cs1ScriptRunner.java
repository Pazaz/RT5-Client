import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Cs1ScriptRunner {

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "Lclient!nk;")
	public static Component aClass161_14 = null;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIILclient!nk;)V")
	public static void method6335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		if (aClass161_14 != null || Static375.aBoolean477 || (arg2 == null || Static207.method3703(arg2) == null)) {
			return;
		}
		aClass161_14 = arg2;
		Static301.aClass161_13 = Static207.method3703(arg2);
		Static129.anInt2458 = 0;
		Static57.aBoolean124 = false;
		Static392.anInt7228 = arg1;
		Static18.anInt530 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method2398() {
		InterfaceList.redraw(aClass161_14);
		Static129.anInt2458++;
		if (Static301.aBoolean403 && Static278.aBoolean377) {
			@Pc(26) int local26 = Mouse.instance.method3304();
			@Pc(30) int local30 = Mouse.instance.method3313();
			local26 -= Static18.anInt530;
			local30 -= Static392.anInt7228;
			if (local26 < Static4.anInt88) {
				local26 = Static4.anInt88;
			}
			if (local30 < Static100.anInt2111) {
				local30 = Static100.anInt2111;
			}
			if (aClass161_14.width + local26 > Static301.aClass161_13.width + Static4.anInt88) {
				local26 = Static301.aClass161_13.width + Static4.anInt88 - aClass161_14.width;
			}
			if (local30 + aClass161_14.height > Static100.anInt2111 + Static301.aClass161_13.height) {
				local30 = Static301.aClass161_13.height + Static100.anInt2111 - aClass161_14.height;
			}
			@Pc(105) int local105 = local26 + Static301.aClass161_13.scrollX - Static4.anInt88;
			@Pc(113) int local113 = local30 + Static301.aClass161_13.scrollY - Static100.anInt2111;
			@Pc(128) HookRequest local128;
			if (Mouse.instance.method3305()) {
				if (aClass161_14.dragDeadTime < Static129.anInt2458) {
					@Pc(205) int local205 = local26 - Static168.anInt7248;
					@Pc(210) int local210 = local30 - Static3.anInt61;
					if (aClass161_14.dragDeadZone < local205 || -aClass161_14.dragDeadZone > local205 || local210 > aClass161_14.dragDeadZone || local210 < -aClass161_14.dragDeadZone) {
						Static57.aBoolean124 = true;
					}
				}
				if (aClass161_14.onDrag != null && Static57.aBoolean124) {
					local128 = new HookRequest();
					local128.anInt2117 = local113;
					local128.source = aClass161_14;
					local128.anObjectArray4 = aClass161_14.onDrag;
					local128.anInt2116 = local105;
					ScriptRunner.execute(local128);
				}
			} else {
				if (Static57.aBoolean124) {
					Static207.method3699();
					if (aClass161_14.onDragComplete != null) {
						local128 = new HookRequest();
						local128.anInt2116 = local105;
						local128.aClass161_4 = Static182.aClass161_7;
						local128.source = aClass161_14;
						local128.anObjectArray4 = aClass161_14.onDragComplete;
						local128.anInt2117 = local113;
						ScriptRunner.execute(local128);
					}
					if (Static182.aClass161_7 != null && Static45.method1413(aClass161_14) != null) {
						Protocol.method5096(Static182.aClass161_7, aClass161_14);
					}
				} else if ((Static232.anInt4087 == 1 || Static208.method3710()) && Static268.anInt4959 > 2) {
					Static143.method2679(Static392.anInt7228 + Static3.anInt61, Static168.anInt7248 + Static18.anInt530);
				} else if (Static270.method4555()) {
					Static143.method2679(Static392.anInt7228 + Static3.anInt61, Static168.anInt7248 + Static18.anInt530);
				}
				aClass161_14 = null;
			}
		} else if (Static129.anInt2458 > 1) {
			aClass161_14 = null;
		}
	}

}
