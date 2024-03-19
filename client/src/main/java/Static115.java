import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "Lclient!qj;")
	public static Class162 aClass162_99;

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "Lclient!fl;")
	public static Interface4 anInterface4_4;

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString105 = "Loaded wordpack";

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString106 = "flash2:";

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)V")
	public static void method2522(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub1_Sub10 local16 = Static122.method2624(2, arg0);
		local16.method2536();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
	public static void method2523(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static186.method3746(arg0.length - 1, arg0, arg1, 0);
	}
}
