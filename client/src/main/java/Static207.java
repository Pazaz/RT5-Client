import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	public static int anInt3746;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!ld;")
	public static final LinkedList aClass135_25 = new LinkedList();

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
		@Pc(11) Class161 local11 = InterfaceList.method3705(Static337.anInt6317, Static214.anInt3792);
		if (local11 != null && local11.anObjectArray32 != null) {
			@Pc(20) Class2_Sub13 local20 = new Class2_Sub13();
			local20.aClass161_3 = local11;
			local20.anObjectArray4 = local11.anObjectArray32;
			ScriptRunner.method3591(local20);
		}
		Static330.aBoolean419 = false;
		Static107.anInt2219 = -1;
		Static196.anInt3317 = -1;
		if (local11 != null) {
			InterfaceList.redraw(local11);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!nk;B)Lclient!nk;")
	public static Class161 method3703(@OriginalArg(0) Class161 arg0) {
		@Pc(11) Class161 local11 = Static45.method1413(arg0);
		if (local11 == null) {
			local11 = arg0.aClass161_12;
		}
		return local11;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)[Lclient!oj;")
	public static Class170[] method3704() {
		return new Class170[] { Static171.aClass170_3, Static329.aClass170_4, Static12.aClass170_1 };
	}

}
