import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
	public static int anInt5697;

	@OriginalMember(owner = "client!ri", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!ri", name = "N", descriptor = "Lclient!nk;")
	public static Class161 aClass161_13 = null;

	@OriginalMember(owner = "client!ri", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[128][128];

	@OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
	public static int anInt5700 = 0;

	@OriginalMember(owner = "client!ri", name = "V", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(Z)V")
	public static void method5188() {
		for (@Pc(14) Class2_Sub2_Sub9 local14 = (Class2_Sub2_Sub9) Static332.aClass135_38.method3551(); local14 != null; local14 = (Class2_Sub2_Sub9) Static332.aClass135_38.method3552()) {
			@Pc(19) Class11_Sub5_Sub3 local19 = local14.aClass11_Sub5_Sub3_1;
			if (local19.aByte78 != Static355.anInt6585 || local19.anInt4722 < Static114.anInt2348) {
				local14.method6468();
				local19.method4391();
			} else if (Static114.anInt2348 >= local19.anInt4725) {
				if (local19.anInt4714 > 0) {
					@Pc(56) Class11_Sub5_Sub2_Sub2 local56 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local19.anInt4714 - 1];
					if (local56 != null && local56.anInt6781 >= 0 && local56.anInt6781 < Static373.anInt7033 * 128 && local56.anInt6783 >= 0 && Static242.anInt4449 * 128 > local56.anInt6783) {
						local19.method4397(Static386.method6032(local56.anInt6781, local56.anInt6783, local19.aByte78) - local19.anInt4736, local56.anInt6781, Static114.anInt2348, local56.anInt6783);
					}
				}
				if (local19.anInt4714 < 0) {
					@Pc(111) int local111 = -local19.anInt4714 - 1;
					@Pc(120) Class11_Sub5_Sub2_Sub1 local120;
					if (local111 == PlayerList.selfId) {
						local120 = Static17.aClass11_Sub5_Sub2_Sub1_3;
					} else {
						local120 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local111];
					}
					if (local120 != null && local120.anInt6781 >= 0 && local120.anInt6781 < Static373.anInt7033 * 128 && local120.anInt6783 >= 0 && local120.anInt6783 < Static242.anInt4449 * 128) {
						local19.method4397(Static386.method6032(local120.anInt6781, local120.anInt6783, local19.aByte78) - local19.anInt4736, local120.anInt6781, Static114.anInt2348, local120.anInt6783);
					}
				}
				local19.method4392(Static165.anInt3148);
				Static329.method5630(local19, true);
			}
		}
	}
}
