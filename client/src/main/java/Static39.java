import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "Lclient!mia;")
	public static final Class242 aClass242_3 = new Class242("", 11);

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
	public static int anInt949 = 0;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
	public static int anInt950 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)I")
	public static int method1020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local5 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local5 * arg1;
		} else {
			return local5;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method1022(@OriginalArg(1) Class19 arg0) {
		if (Static60.aBoolean87) {
			Static149.method2449(arg0);
		} else {
			Static159.method2574(arg0);
		}
	}
}
