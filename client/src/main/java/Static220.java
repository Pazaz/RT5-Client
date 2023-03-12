import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_83 = new LocalizedString("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "Lclient!ad;")
	public static final HashTable aClass4_83 = new HashTable(8);

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BIIII)V")
	public static void method3870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg0;
		@Pc(16) int local16 = -arg0;
		@Pc(18) int local18 = -1;
		Static101.method2163(arg3 + arg0, Static357.anIntArrayArray58[arg1], arg2, arg3 - arg0);
		while (local13 > local11) {
			local18 += 2;
			local11++;
			local16 += local18;
			if (local16 >= 0) {
				local13--;
				local16 -= local13 << 1;
				@Pc(56) int[] local56 = Static357.anIntArrayArray58[local13 + arg1];
				@Pc(63) int[] local63 = Static357.anIntArrayArray58[arg1 - local13];
				@Pc(67) int local67 = local11 + arg3;
				@Pc(72) int local72 = arg3 - local11;
				Static101.method2163(local67, local56, arg2, local72);
				Static101.method2163(local67, local63, arg2, local72);
			}
			@Pc(89) int local89 = arg3 + local13;
			@Pc(94) int local94 = arg3 - local13;
			@Pc(100) int[] local100 = Static357.anIntArrayArray58[local11 + arg1];
			@Pc(107) int[] local107 = Static357.anIntArrayArray58[arg1 - local11];
			Static101.method2163(local89, local100, arg2, local94);
			Static101.method2163(local89, local107, arg2, local94);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
	public static void method3874(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static291.anIntArray373[local3] = Static291.anIntArray373[local3 - 1];
			Static18.anIntArray27[local3] = Static18.anIntArray27[local3 - 1];
			Static42.aStringArray59[local3] = Static42.aStringArray59[local3 - 1];
			Static169.aStringArray26[local3] = Static169.aStringArray26[local3 - 1];
			Static88.aStringArray13[local3] = Static88.aStringArray13[local3 - 1];
			Static135.aStringArray20[local3] = Static135.aStringArray20[local3 - 1];
			Static132.anIntArray162[local3] = Static132.anIntArray162[local3 - 1];
		}
		Static291.anIntArray373[0] = arg4;
		Static42.aStringArray59[0] = arg6;
		Static18.anIntArray27[0] = arg0;
		Static169.aStringArray26[0] = arg5;
		Static88.aStringArray13[0] = arg2;
		Static21.anInt551 = Static88.transmitTimer;
		Static226.anInt4016++;
		Static135.aStringArray20[0] = arg1;
		Static132.anIntArray162[0] = arg3;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZII)I")
	public static int method3876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (local7 + arg0) / arg1 - local7;
	}
}
