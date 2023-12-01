import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	public static int anInt3746;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!ld;")
	public static LinkedList aClass135_26 = new LinkedList();

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "[I")
	public static final int[] anIntArray225 = new int[8];

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method3699() {
		if (!Static330.aBoolean419) {
			return;
		}
		@Pc(11) Component local11 = InterfaceList.getCreatedComponent(Static337.anInt6317, Static214.anInt3792);
		if (local11 != null && local11.onTargetLeave != null) {
			@Pc(20) HookRequest local20 = new HookRequest();
			local20.source = local11;
			local20.anObjectArray4 = local11.onTargetLeave;
			ScriptRunner.execute(local20);
		}
		Static330.aBoolean419 = false;
		Static107.anInt2219 = -1;
		Static196.anInt3317 = -1;
		if (local11 != null) {
			InterfaceList.redraw(local11);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!nk;B)Lclient!nk;")
	public static Component method3703(@OriginalArg(0) Component arg0) {
		@Pc(11) Component local11 = Static45.method1413(arg0);
		if (local11 == null) {
			local11 = arg0.dragComponent;
		}
		return local11;
	}

}
