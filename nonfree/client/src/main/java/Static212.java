import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!gka", name = "m", descriptor = "I")
	public static int anInt3467;

	@OriginalMember(owner = "client!gka", name = "v", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_16 = new Class155(255);

	@OriginalMember(owner = "client!gka", name = "n", descriptor = "I")
	public static int anInt3466 = -1;

	@OriginalMember(owner = "client!gka", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray86 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!gka", name = "p", descriptor = "I")
	public static int anInt3468 = 0;

	@OriginalMember(owner = "client!gka", name = "u", descriptor = "[I")
	public static final int[] anIntArray283 = new int[500];

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(II)[I")
	public static int[] method3135(@OriginalArg(0) int arg0) {
		@Pc(6) int[] local6 = new int[3];
		Static551.method7276(Static38.method1003(arg0));
		local6[0] = Static260.aCalendar2.get(5);
		local6[1] = Static260.aCalendar2.get(2);
		local6[2] = Static260.aCalendar2.get(1);
		return local6;
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lclient!hda;IBILclient!ha;)V")
	public static void method3136(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19 arg3) {
		for (@Pc(16) int local16 = 63; local16 >= 0; local16--) {
			Static198.method2954(true, false);
			@Pc(42) int local42 = (local16 & 0x3F) << 10 | 0x3F | 0x380;
			@Pc(46) int local46 = Static154.anIntArray237[local42];
			Static300.method4390(false, true);
			arg3.aa(arg1, ((63 - local16) * arg0.anInt3746 >> 6) + arg2, arg0.anInt3802, (arg0.anInt3746 >> 6) + 1, local46, 0);
		}
	}
}
