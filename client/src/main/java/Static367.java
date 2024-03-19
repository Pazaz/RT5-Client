import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!ih;[I[III)Lclient!pi;")
	public static Class142_Sub2 method4443(@OriginalArg(1) Class40_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg3 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			@Pc(24) int local24 = arg4 * local12 + arg1[local12];
			for (@Pc(26) int local26 = 0; local26 < arg2[local12]; local26++) {
				local10[local24++] = -1;
			}
		}
		return new Class142_Sub2(arg0, arg4, arg3, local10);
	}
}
