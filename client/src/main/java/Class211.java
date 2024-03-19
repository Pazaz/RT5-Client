import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class211 {

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "[Lclient!ep;")
	public static final Class58[] aClass58Array1 = new Class58[5];

	static {
		for (@Pc(9) int local9 = 0; local9 < aClass58Array1.length; local9++) {
			aClass58Array1[local9] = new Class58();
		}
	}
}
