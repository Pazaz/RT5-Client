import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!ui", name = "nb", descriptor = "I")
	public static int anInt6543 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!cs;[Lclient!ui;)Lclient!ui;")
	public static Class86_Sub2 method5591(@OriginalArg(0) Class40_Sub1 arg0, @OriginalArg(1) Class86_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class86_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class86_Sub2(arg0, arg1);
		}
	}
}
