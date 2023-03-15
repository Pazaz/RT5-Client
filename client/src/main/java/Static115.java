import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	public static int anInt3837;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "[I")
	public static final int[] anIntArray234 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)Lclient!jg;")
	public static Class2_Sub20 method3829() {
		if (MapList.aClass135_36 == null || Static116.aClass75_1 == null) {
			return null;
		}
		for (@Pc(16) Class2_Sub20 local16 = (Class2_Sub20) Static116.aClass75_1.method2178(); local16 != null; local16 = (Class2_Sub20) Static116.aClass75_1.method2178()) {
			@Pc(24) MelType local24 = MapList.aClass125_4.method3379(local16.anInt2947);
			if (local24 != null && local24.aBoolean302 && local24.method4180(MapList.anInterface11_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[Lclient!nk;I)V")
	public static void method3847(@OriginalArg(0) int arg0, @OriginalArg(1) Class161[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class161 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.type == 0) {
					if (local9.activeComponents != null) {
						method3847(arg0, local9.activeComponents);
					}
					@Pc(30) Class2_Sub7 local30 = (Class2_Sub7) Static329.aClass4_130.get((long) local9.id);
					if (local30 != null) {
						Static392.method6460(local30.anInt1370, arg0);
					}
				}
				@Pc(49) Class2_Sub13 local49;
				if (arg0 == 0 && local9.anObjectArray34 != null) {
					local49 = new Class2_Sub13();
					local49.aClass161_3 = local9;
					local49.anObjectArray4 = local9.anObjectArray34;
					ScriptRunner.method3591(local49);
				}
				if (arg0 == 1 && local9.anObjectArray11 != null) {
					if (local9.activeComponentId >= 0) {
						@Pc(75) Class161 local75 = InterfaceList.getComponent(local9.id);
						if (local75 == null || local75.activeComponents == null || local75.activeComponents.length <= local9.activeComponentId || local75.activeComponents[local9.activeComponentId] != local9) {
							continue;
						}
					}
					local49 = new Class2_Sub13();
					local49.anObjectArray4 = local9.anObjectArray11;
					local49.aClass161_3 = local9;
					ScriptRunner.method3591(local49);
				}
			}
		}
	}
}
