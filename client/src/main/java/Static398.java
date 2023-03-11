import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!bf;I[I[II)Lclient!gj;")
	public static Class78_Sub2 method2345(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(4) byte[] local4 = new byte[arg0 * arg4];
		for (@Pc(6) int local6 = 0; local6 < arg4; local6++) {
			@Pc(21) int local21 = local6 * arg0 + arg3[local6];
			for (@Pc(23) int local23 = 0; local23 < arg2[local6]; local23++) {
				local4[local21++] = -1;
			}
		}
		return new Class78_Sub2(arg1, arg0, arg4, local4);
	}
}
