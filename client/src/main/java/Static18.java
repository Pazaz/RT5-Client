import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static18 {

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "Lclient!rq;")
	public static Cache aClass207_1;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "Lclient!cc;")
	public static PrivilegedRequest aClass32_2;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Lclient!ti;")
	public static final BasType aClass222_1 = new BasType();

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	public static int anInt519 = -1;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "Z")
	public static boolean qa_op_test = false;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
	public static final int[] anIntArray27 = new int[100];

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
	public static int anInt530 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!nj;")
	public static Class123 method556(@OriginalArg(1) Component arg0) {
		return new Class123_Sub1(arg0);
	}
}
