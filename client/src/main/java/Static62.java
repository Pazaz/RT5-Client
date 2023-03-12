import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
	public static int anInt2395;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "[I")
	public static int[] underwaterLocGroupIds;

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "Lclient!rc;")
	public static Class42 aClass42_5;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array9;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLclient!r;)V")
	public static void method2390(@OriginalArg(1) Class197 arg0) {
		Static183.anInt80 = arg0.getGroupId("p11_full");
		Static371.anInt7014 = arg0.getGroupId("p12_full");
		Static80.anInt6679 = arg0.getGroupId("b12_full");
		Static373.anInt7028 = arg0.getGroupId("hitmarks");
		Static192.anInt3545 = arg0.getGroupId("hitbar_default");
		Static256.anInt4745 = arg0.getGroupId("timerbar_default");
		Static382.anInt7140 = arg0.getGroupId("headicons_pk");
		Static166.anInt3193 = arg0.getGroupId("headicons_prayer");
		Static390.anInt7206 = arg0.getGroupId("hint_headicons");
		Static363.anInt6792 = arg0.getGroupId("hint_mapmarkers");
		Static237.anInt4324 = arg0.getGroupId("mapflag");
		Static155.anInt2811 = arg0.getGroupId("cross");
		Static326.anInt6236 = arg0.getGroupId("mapdots");
		Static169.anInt3205 = arg0.getGroupId("scrollbar");
		Static102.anInt3590 = arg0.getGroupId("name_icons");
		Static32.anInt798 = arg0.getGroupId("floorshadows");
		Static139.anInt2594 = arg0.getGroupId("compass");
		Static322.anInt6031 = arg0.getGroupId("otherlevel");
		Static373.anInt7030 = arg0.getGroupId("hint_mapedge");
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBIIIZ)V")
	public static void method2391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) (arg2 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class2_Sub41 local20 = (Class2_Sub41) Static353.aClass4_136.method90(local14);
		if (local20 == null) {
			local20 = new Class2_Sub41();
			Static353.aClass4_136.method87(local20, local14);
		}
		if (local20.anIntArray489.length <= arg0) {
			@Pc(50) int[] local50 = new int[arg0 + 1];
			@Pc(55) int[] local55 = new int[arg0 + 1];
			for (@Pc(57) int local57 = 0; local57 < local20.anIntArray489.length; local57++) {
				local50[local57] = local20.anIntArray489[local57];
				local55[local57] = local20.anIntArray488[local57];
			}
			for (@Pc(83) int local83 = local20.anIntArray489.length; local83 < arg0; local83++) {
				local50[local83] = -1;
				local55[local83] = 0;
			}
			local20.anIntArray488 = local55;
			local20.anIntArray489 = local50;
		}
		local20.anIntArray489[arg0] = arg3;
		local20.anIntArray488[arg0] = arg1;
	}
}
