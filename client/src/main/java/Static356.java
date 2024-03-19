import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!qj;II)Lclient!be;")
	public static Class19 method468(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4636(arg2, arg1);
		return local5 == null ? null : new Class19(new Class1_Sub16(local5));
	}
}
