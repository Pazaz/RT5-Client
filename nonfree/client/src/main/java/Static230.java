import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_81 = new Class82(4);

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIIII)V")
	public static void method3370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static670.method8732(Static724.anInt10930, Static273.anInt4395, arg3);
		@Pc(19) int local19 = Static670.method8732(Static724.anInt10930, Static273.anInt4395, arg4);
		@Pc(25) int local25 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg0);
		@Pc(31) int local31 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg1);
		for (@Pc(37) int local37 = local11; local37 <= local19; local37++) {
			Static696.method9037(local31, arg2, local25, Static723.anIntArrayArray266[local37]);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
	public static boolean method3372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BI[I[JI)V")
	public static void method3373(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(22) int local22 = (arg3 + arg0) / 2;
		@Pc(24) int local24 = arg3;
		@Pc(28) long local28 = arg2[local22];
		arg2[local22] = arg2[arg0];
		arg2[arg0] = local28;
		@Pc(42) int local42 = arg1[local22];
		arg1[local22] = arg1[arg0];
		arg1[arg0] = local42;
		@Pc(63) int local63 = ~local28 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg3; local65 < arg0; local65++) {
			if (local28 + (long) (local63 & local65) > arg2[local65]) {
				@Pc(84) long local84 = arg2[local65];
				arg2[local65] = arg2[local24];
				arg2[local24] = local84;
				@Pc(98) int local98 = arg1[local65];
				arg1[local65] = arg1[local24];
				arg1[local24++] = local98;
			}
		}
		arg2[arg0] = arg2[local24];
		arg2[local24] = local28;
		arg1[arg0] = arg1[local24];
		arg1[local24] = local42;
		method3373(local24 - 1, arg1, arg2, arg3);
		method3373(arg0, arg1, arg2, local24 + 1);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
	public static void method3374() {
		Static631.aClass339_78 = new Class339();
	}
}
