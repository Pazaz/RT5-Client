import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "Lclient!op;")
	public static final Class143 aClass143_8 = new Class143(16);

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString144 = "red:";

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
	public static int anInt3904 = 0;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
	public static int anInt3905 = -1;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3365(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static75.method1741(Static274.method4904(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
