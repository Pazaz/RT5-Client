import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIZIIII)V")
	public static void method7252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(25) int local25 = Static670.method8732(Static724.anInt10930, Static273.anInt4395, arg3);
		@Pc(31) int local31 = Static670.method8732(Static724.anInt10930, Static273.anInt4395, arg0);
		@Pc(37) int local37 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg1);
		@Pc(43) int local43 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg4);
		@Pc(51) int local51 = Static670.method8732(Static724.anInt10930, Static273.anInt4395, arg3 + arg5);
		@Pc(60) int local60 = Static670.method8732(Static724.anInt10930, Static273.anInt4395, arg0 - arg5);
		for (@Pc(62) int local62 = local25; local62 < local51; local62++) {
			Static696.method9037(local43, arg2, local37, Static723.anIntArrayArray266[local62]);
		}
		for (@Pc(84) int local84 = local31; local84 > local60; local84--) {
			Static696.method9037(local43, arg2, local37, Static723.anIntArrayArray266[local84]);
		}
		@Pc(114) int local114 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg5 + arg1);
		@Pc(123) int local123 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg4 - arg5);
		for (@Pc(125) int local125 = local51; local125 <= local60; local125++) {
			@Pc(133) int[] local133 = Static723.anIntArrayArray266[local125];
			Static696.method9037(local114, arg2, local37, local133);
			Static696.method9037(local123, arg6, local114, local133);
			Static696.method9037(local43, arg2, local123, local133);
		}
	}
}
