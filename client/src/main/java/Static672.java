import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static672 {

	@OriginalMember(owner = "client!vea", name = "J", descriptor = "Lclient!nk;")
	public static Class263 aClass263_2;

	@OriginalMember(owner = "client!vea", name = "G", descriptor = "J")
	public static long aLong305;

	@OriginalMember(owner = "client!vea", name = "I", descriptor = "Lclient!it;")
	public static final Class184 aClass184_18 = new Class184(2, 4, 4, 0);

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(III[BI[BIII)V")
	public static void method8765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
			@Pc(32) int local32;
			for (@Pc(28) int local28 = local10; local28 < 0; local28++) {
				local32 = arg2++;
				arg3[local32] = (byte) (arg3[local32] - arg5[arg4++]);
				@Pc(45) int local45 = arg2++;
				arg3[local45] = (byte) (arg3[local45] - arg5[arg4++]);
				@Pc(58) int local58 = arg2++;
				arg3[local58] = (byte) (arg3[local58] - arg5[arg4++]);
				@Pc(71) int local71 = arg2++;
				arg3[local71] = (byte) (arg3[local71] - arg5[arg4++]);
			}
			for (@Pc(92) int local92 = local15; local92 < 0; local92++) {
				local32 = arg2++;
				arg3[local32] = (byte) (arg3[local32] - arg5[arg4++]);
			}
			arg2 += arg1;
			arg4 += arg0;
		}
	}
}
