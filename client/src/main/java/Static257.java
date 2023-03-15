import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString39;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!on", name = "e", descriptor = "Lclient!jm;")
	public static final Class116 aClass116_5 = new Class116(64);

	@OriginalMember(owner = "client!on", name = "h", descriptor = "[I")
	public static final int[] anIntArray257 = new int[4096];

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method3927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static222.method3916(arg6)) {
			return;
		}
		if (Static113.aClass161ArrayArray2[arg6] == null) {
			Static45.method1400(Static26.aClass161ArrayArray1[arg6], -1, arg8, arg3, arg2, arg1, arg0, arg4, arg5, arg7);
		} else {
			Static45.method1400(Static113.aClass161ArrayArray2[arg6], -1, arg8, arg3, arg2, arg1, arg0, arg4, arg5, arg7);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIILclient!wm;)V")
	public static void method3928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) TextureProvider arg4) {
		arg4.method2895(arg0, arg2, arg0 + arg3, arg1 + arg2);
		arg4.method2868(arg1, arg0, arg2, -16777216, arg3);
		if (WorldMap.loadPercentage < 100) {
			return;
		}
		@Pc(40) float local40 = (float) MapList.anInt6052 / (float) MapList.anInt6056;
		@Pc(42) int local42 = arg3;
		@Pc(44) int local44 = arg1;
		if (local40 < 1.0F) {
			local44 = (int) ((float) arg3 * local40);
		} else {
			local42 = (int) ((float) arg1 / local40);
		}
		@Pc(71) int local71 = arg0 + (arg3 - local42) / 2;
		@Pc(80) int local80 = arg2 + (arg1 - local44) / 2;
		if (Static371.aClass13_20 == null || Static371.aClass13_20.method6389() != arg3 || Static371.aClass13_20.method6382() != arg1) {
			MapList.method5530(MapList.anInt6057, MapList.anInt6055 + MapList.anInt6052, MapList.anInt6056 + MapList.anInt6057, MapList.anInt6055, local71, local80, local71 + local42, local44 + local80);
			MapList.method5522(arg4);
			Static371.aClass13_20 = arg4.method2818(local71, local80, local42, local44, false);
		}
		Static371.aClass13_20.method6385(local71, local80);
		@Pc(127) int local127 = local42 * WorldMap.anInt1105 / MapList.anInt6056;
		@Pc(133) int local133 = local44 * WorldMap.anInt6930 / MapList.anInt6052;
		@Pc(141) int local141 = Static178.anInt2317 * local42 / MapList.anInt6056 + local71;
		@Pc(155) int local155 = local44 + local80 - local133 - Static21.anInt548 * local44 / MapList.anInt6052;
		@Pc(157) int local157 = -1996554240;
		if (client.game == client.GAME_SD) {
			local157 = -1996488705;
		}
		arg4.method2901(local141, local155, local127, local133, local157, 1);
		arg4.method2836(local141, local155, local127, local133, local157, 0);
		if (Static243.anInt4495 <= 0) {
			return;
		}
		@Pc(194) int local194;
		if (Static90.anInt6637 > 50) {
			local194 = 500 - Static90.anInt6637 * 5;
		} else {
			local194 = Static90.anInt6637 * 5;
		}
		for (@Pc(205) Class2_Sub20 local205 = (Class2_Sub20) MapList.aClass135_36.head(); local205 != null; local205 = (Class2_Sub20) MapList.aClass135_36.next()) {
			@Pc(213) MelType local213 = MapList.aClass125_4.method3379(local205.anInt2947);
			if (Static101.method2164(local213)) {
				@Pc(242) int local242;
				@Pc(255) int local255;
				if (local205.anInt2947 == Static225.anInt3979) {
					local242 = local42 * local205.anInt2949 / MapList.anInt6056 + local71;
					local255 = (MapList.anInt6052 - local205.anInt2952) * local44 / MapList.anInt6052 + local80;
					arg4.method2868(4, local242 - 2, local255 + -2, local194 << 24 | 0xFFFF00, 4);
				} else if (Static236.anInt4301 != -1 && local213.anInt4424 == Static236.anInt4301) {
					local242 = local71 + local205.anInt2949 * local42 / MapList.anInt6056;
					local255 = local80 + (MapList.anInt6052 - local205.anInt2952) * local44 / MapList.anInt6052;
					arg4.method2868(4, local242 - 2, local255 + -2, local194 << 24 | 0xFFFF00, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "(I)V")
	public static void method3937() {
		for (@Pc(6) Class12_Sub6 local6 = (Class12_Sub6) Static356.aClass36_10.method1424(); local6 != null; local6 = (Class12_Sub6) Static356.aClass36_10.method1424()) {
			Static385.method6430(local6);
		}
		@Pc(31) int local31;
		@Pc(30) int local30;
		if (client.preferences.method4495(Static77.anInt1762)) {
			local31 = 0;
			local30 = 3;
		} else {
			local30 = Static44.anInt1115;
			local31 = Static44.anInt1115;
		}
		Static45.method1398();
		for (@Pc(40) int local40 = local31; local40 <= local30; local40++) {
			Static45.method1396();
			Static45.method1408(local40);
			Static45.method1409(local40);
		}
		Static45.method1407();
		Static45.method1410();
	}
}
