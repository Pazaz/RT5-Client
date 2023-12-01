import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	public static int anInt3837;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "[I")
	public static final int[] anIntArray234 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[Lclient!nk;I)V")
	public static void method3847(@OriginalArg(0) int arg0, @OriginalArg(1) Component[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Component local9 = arg1[local3];
			if (local9 != null) {
				if (local9.type == 0) {
					if (local9.activeComponents != null) {
						method3847(arg0, local9.activeComponents);
					}
					@Pc(30) SubInterface local30 = (SubInterface) InterfaceList.subInterfaces.get((long) local9.id);
					if (local30 != null) {
						Static392.method6460(local30.id, arg0);
					}
				}
				@Pc(49) HookRequest local49;
				if (arg0 == 0 && local9.onDialogAbort != null) {
					local49 = new HookRequest();
					local49.source = local9;
					local49.anObjectArray4 = local9.onDialogAbort;
					ScriptRunner.execute(local49);
				}
				if (arg0 == 1 && local9.onSubChange != null) {
					if (local9.activeComponentId >= 0) {
						@Pc(75) Component local75 = InterfaceList.getComponent(local9.id);
						if (local75 == null || local75.activeComponents == null || local75.activeComponents.length <= local9.activeComponentId || local75.activeComponents[local9.activeComponentId] != local9) {
							continue;
						}
					}
					local49 = new HookRequest();
					local49.anObjectArray4 = local9.onSubChange;
					local49.source = local9;
					ScriptRunner.execute(local49);
				}
			}
		}
	}
}
