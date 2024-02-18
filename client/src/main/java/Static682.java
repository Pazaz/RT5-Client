import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static682 {

	@OriginalMember(owner = "client!vka", name = "c", descriptor = "I")
	public static int anInt10295;

	@OriginalMember(owner = "client!vka", name = "h", descriptor = "B")
	public static byte aByte142;

	@OriginalMember(owner = "client!vka", name = "f", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_43 = new Class155(61);

	@OriginalMember(owner = "client!vka", name = "i", descriptor = "[I")
	public static int[] anIntArray817 = new int[2];

	@OriginalMember(owner = "client!vka", name = "b", descriptor = "Lclient!tka;")
	public static final Class355 aClass355_6 = new Class355("INTBETA", "office", "_intbeta", 6);

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method8923(@OriginalArg(1) String arg0) {
		@Pc(17) String local17 = Static99.method1977(Static306.method4476(arg0, -120));
		if (local17 == null) {
			local17 = "";
		}
		return local17;
	}

	@OriginalMember(owner = "client!vka", name = "b", descriptor = "(II)V")
	public static void method8926(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub2_Sub2 local17 = Static440.method5963(20, (long) arg0);
		local17.method205();
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(IIIBI)V")
	public static void method8927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static448.anInt6796 != 1) {
			return;
		}
		@Pc(14) int local14 = arg2 / Static437.anInt6628;
		@Pc(18) int local18 = arg3 / Static437.anInt6628;
		@Pc(22) int local22 = arg0 / Static714.anInt10802;
		@Pc(26) int local26 = arg1 / Static714.anInt10802;
		if (local14 >= Static211.anInt5574 || local18 < 0 || local22 >= Static617.anInt9434 || local26 < 0) {
			return;
		}
		if (local14 < 0) {
			local14 = 0;
		}
		if (local22 < 0) {
			local22 = 0;
		}
		if (Static617.anInt9434 <= local26) {
			local26 = Static617.anInt9434 - 1;
		}
		if (Static211.anInt5574 <= local18) {
			local18 = Static211.anInt5574 - 1;
		}
		for (@Pc(94) int local94 = local22; local94 <= local26; local94++) {
			@Pc(105) int local105 = Static719.method9118(local94 + Static482.anInt7265, 16939, Static617.anInt9434) * Static211.anInt5574;
			for (@Pc(107) int local107 = local14; local107 <= local18; local107++) {
				@Pc(117) int local117 = Static719.method9118(Static632.anInt9503 + local107, 16939, Static211.anInt5574) + local105;
				Static173.anIntArray252[local117] = Static420.anInt6436;
			}
		}
	}
}
