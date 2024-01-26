import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static728 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!sb;II)Lclient!bn;")
	public static Class2_Sub8 method1153(@OriginalArg(0) Class330 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method7595(arg2, arg1);
		return local5 == null ? null : new Class2_Sub8(new Class2_Sub21(local5));
	}
}
