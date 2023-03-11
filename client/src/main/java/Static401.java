import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "ping", descriptor = "(BBBBJ)I")
	public static int method2927(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) long arg4) throws Throwable {
		@Pc(6) int local6 = jagmisc.ping0(arg0, arg1, arg2, arg3, arg4);
		if (local6 < 0) {
			throw new Exception(String.valueOf(local6));
		}
		return local6;
	}
}
