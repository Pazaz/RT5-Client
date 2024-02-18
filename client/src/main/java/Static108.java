import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dga", name = "n", descriptor = "I")
	public static int anInt2168;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIBLclient!uc;)V")
	public static void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class367 arg2) {
		Static665.aClass367ArrayArray1[arg1][arg0] = arg2;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/String;ZC)I")
	public static int method2065(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			if (arg0.charAt(local17) == arg1) {
				local5++;
			}
		}
		return local5;
	}
}
