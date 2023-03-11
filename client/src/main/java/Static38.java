import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cb", name = "Nb", descriptor = "I")
	public static int anInt988 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!j;[Lclient!cb;)Lclient!cb;")
	public static Class31_Sub1 method1259(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Class31_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class31_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class31_Sub1(arg0, arg1);
		}
	}
}
