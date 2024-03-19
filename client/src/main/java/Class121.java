import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class121 implements Interface3 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
	@Override
	public String method3529(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		if (arg1 == 0) {
			@Pc(19) Class1_Sub1_Sub16 local19 = Static260.method4759(arg0[0]);
			return local19.method4212((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(36) Class36 local36 = Static165.method3446((int) arg2);
			return local36.aString51;
		} else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
			return Static260.method4759(arg0[0]).method4212((int) arg2);
		} else {
			return null;
		}
	}
}
