import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
	public static int anInt3850 = 0;

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "Lclient!op;")
	public static final Class143 aClass143_7 = new Class143(128);

	@OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
	public static int anInt3855 = 0;

	@OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
	public static int anInt3856 = 0;

	@OriginalMember(owner = "client!kh", name = "Z", descriptor = "Ljava/lang/String;")
	public static final String aString143 = "flash1:";

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(BI)Lclient!f;")
	public static Class59 method3333(@OriginalArg(1) int arg0) {
		@Pc(10) Class59 local10 = (Class59) Static250.aClass215_76.method6057((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static290.aClass162_212.method4636(arg0, 34);
		local10 = new Class59();
		if (local20 != null) {
			local10.method1740(new Class1_Sub16(local20), arg0);
		}
		Static250.aClass215_76.method6050(local10, (long) arg0);
		return local10;
	}
}
