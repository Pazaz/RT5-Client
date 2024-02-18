import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!cla", name = "a", descriptor = "(IILclient!ge;)V")
	public static void method1608(@OriginalArg(1) int arg0, @OriginalArg(2) Packet arg1) {
		if (Static690.aClass243_5 == null) {
			return;
		}
		try {
			Static690.aClass243_5.method5568(0L);
			Static690.aClass243_5.method5561(arg0, 24, arg1.data);
		} catch (@Pc(23) Exception local23) {
		}
	}
}
