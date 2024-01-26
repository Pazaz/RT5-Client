import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static111 {

	@OriginalMember(owner = "client!dia", name = "o", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_21 = new Class345(84, 6);

	@OriginalMember(owner = "client!dia", name = "q", descriptor = "I")
	public static int anInt2219 = 100;

	@OriginalMember(owner = "client!dia", name = "n", descriptor = "I")
	public static int anInt2220 = 0;

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IBI)Z")
	public static boolean method2100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static433.method5601(arg1, arg0) | (arg0 & 0x40000) != 0 || Static519.method6832(-100, arg0, arg1);
	}
}
