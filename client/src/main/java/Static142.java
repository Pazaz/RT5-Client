import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!r;")
	public static Class197 aClass197_37;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	public static int anInt2663;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_21 = new Class135();

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!h;")
	public static final InboundPacket aClass89_110 = new InboundPacket(8, 2);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static359.aByteArrayArrayArray16[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static359.aByteArrayArrayArray16[arg2][arg3][arg0] & 0x10) == 0) {
			return Static280.method4767(arg0, arg3, arg2) == arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method2662() {
		Static316.aClass5_1.method4408();
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			Static357.aLongArray12[local12] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static292.aLongArray9[local24] = 0L;
		}
		Static10.anInt247 = 0;
	}

}
