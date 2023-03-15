import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
	public static int anInt366;

	@OriginalMember(owner = "client!ar", name = "U", descriptor = "[Lclient!jd;")
	public static Sprite[] aClass13Array3;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method393(@OriginalArg(1) long arg0) {
		Static376.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static376.aCalendar2.get(7);
		@Pc(24) int local24 = Static376.aCalendar2.get(5);
		@Pc(28) int local28 = Static376.aCalendar2.get(2);
		@Pc(32) int local32 = Static376.aCalendar2.get(1);
		@Pc(36) int local36 = Static376.aCalendar2.get(11);
		@Pc(40) int local40 = Static376.aCalendar2.get(12);
		@Pc(44) int local44 = Static376.aCalendar2.get(13);
		return Static326.aStringArray58[local13 - 1] + ", " + local24 / 10 + local24 % 10 + "-" + Static3.aStringArray1[local28] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(IIB)V")
	public static void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static77.anInt1763 = arg0 - MapList.anInt6055;
		Static238.anInt4328 = arg1 - MapList.anInt6057;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!ct;IILclient!wm;Z)V")
	public static void method395(@OriginalArg(0) int arg0, @OriginalArg(1) LocType arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) TextureProvider arg4) {
		@Pc(9) MsiType local9 = client.MsiType.method2708(arg1.anInt1316);
		if (local9.anInt3751 == -1) {
			return;
		}
		if (arg1.aBoolean115) {
			@Pc(27) int local27 = arg0 + arg1.anInt1309;
			arg0 = local27 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(39) Sprite local39 = local9.method3711(arg1.aBoolean118, arg0, arg4);
		if (local39 == null) {
			return;
		}
		@Pc(45) int local45 = arg1.anInt1356;
		@Pc(48) int local48 = arg1.anInt1327;
		if ((arg0 & 0x1) == 1) {
			local45 = arg1.anInt1327;
			local48 = arg1.anInt1356;
		}
		@Pc(62) int local62 = local39.method6399();
		@Pc(65) int local65 = local39.method6384();
		if (local9.aBoolean243) {
			local65 = local48 * 4;
			local62 = local45 * 4;
		}
		if (local9.anInt3752 == 0) {
			local39.method6388(arg3, arg2 - (local48 - 1) * 4, local62, local65);
		} else {
			local39.method6395(arg3, arg2 + 4 - local48 * 4, local62, local65, 1, local9.anInt3752 | 0xFF000000, 1);
		}
	}
}
