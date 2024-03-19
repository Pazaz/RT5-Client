import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString140 = "flash3:";

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BI)Z")
	public static boolean method3287(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub16 local8 = new Class1_Sub16(arg0);
		@Pc(16) int local16 = local8.method5761();
		if (local16 != 1) {
			return false;
		}
		@Pc(34) boolean local34 = local8.method5761() == 1;
		if (local34) {
			Static119.method1989(local8);
		}
		Static135.method6045(local8);
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[S[Ljava/lang/String;)V")
	public static void method3290(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static158.method3370(0, arg1.length - 1, arg0, arg1);
	}
}
