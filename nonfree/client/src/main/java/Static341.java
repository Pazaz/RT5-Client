import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!ko", name = "J", descriptor = "[[I")
	public static int[][] anIntArrayArray133;

	@OriginalMember(owner = "client!ko", name = "H", descriptor = "Lclient!ts;")
	public static final Class361 aClass361_1 = new Class361(64);

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)V")
	public static void method5033(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static32.anInt772 == 2) {
				Static226.aClass46Array7[0].method1105(Static684.aClass302Array1[0]);
				Static226.aClass46Array7[1].method1105(Static684.aClass302Array1[1]);
			} else if (Static32.anInt772 == 3) {
				Static226.aClass46Array7[0].method1105(Static684.aClass302Array1[0]);
				Static226.aClass46Array7[1].method1105(Static684.aClass302Array1[1]);
				Static226.aClass46Array7[2].method1105(Static684.aClass302Array1[2]);
			} else {
				Static226.aClass46Array7[0].method1105(Static684.aClass302Array1[0]);
				Static226.aClass46Array7[1].method1105(Static684.aClass302Array1[1]);
				Static226.aClass46Array7[2].method1105(Static684.aClass302Array1[2]);
				Static226.aClass46Array7[3].method1105(Static684.aClass302Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static32.anInt772 == 2) {
				Static226.aClass46Array7[0].method1105(Static684.aClass302Array1[2]);
			} else if (Static32.anInt772 == 3) {
				Static226.aClass46Array7[0].method1105(Static684.aClass302Array1[3]);
				Static226.aClass46Array7[1].method1105(Static684.aClass302Array1[4]);
			} else {
				Static226.aClass46Array7[0].method1105(Static684.aClass302Array1[4]);
				Static226.aClass46Array7[1].method1105(Static684.aClass302Array1[5]);
				Static226.aClass46Array7[2].method1105(Static684.aClass302Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static32.anInt772 == 2) {
				Static226.aClass46Array7[0].method1105(Static684.aClass302Array1[3]);
				return;
			}
			if (Static32.anInt772 == 3) {
				Static226.aClass46Array7[0].method1105(Static684.aClass302Array1[5]);
				return;
			}
			Static226.aClass46Array7[0].method1105(Static684.aClass302Array1[7]);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZIIIII)V")
	public static void method5034(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(20) long local20 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg4);
		@Pc(26) Class2_Sub22 local26 = (Class2_Sub22) Static286.aClass28_23.method738(local20);
		if (local26 == null) {
			local26 = new Class2_Sub22();
			Static286.aClass28_23.method735(local20, local26);
		}
		if (arg2 >= local26.anIntArray278.length) {
			@Pc(47) int[] local47 = new int[arg2 + 1];
			@Pc(52) int[] local52 = new int[arg2 + 1];
			for (@Pc(54) int local54 = 0; local54 < local26.anIntArray278.length; local54++) {
				local47[local54] = local26.anIntArray278[local54];
				local52[local54] = local26.anIntArray279[local54];
			}
			for (@Pc(86) int local86 = local26.anIntArray278.length; local86 < arg2; local86++) {
				local47[local86] = -1;
				local52[local86] = 0;
			}
			local26.anIntArray279 = local52;
			local26.anIntArray278 = local47;
		}
		local26.anIntArray278[arg2] = arg3;
		local26.anIntArray279[arg2] = arg1;
	}
}
