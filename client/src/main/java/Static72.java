import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static72 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt1683;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	public static int anInt1684;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
	public static int[] anIntArray114;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[B")
	public static final byte[] aByteArray23 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!s;")
	public static final Class210 aClass210_3 = new Class210(4, 3);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(JB)V")
	public static void method1809(@OriginalArg(0) long arg0) {
		Protocol.outboundBuffer.pos = 0;
		Protocol.outboundBuffer.p1(Static43.VALIDATE_USERNAME.opcode);
		Protocol.outboundBuffer.p8(arg0);
		Static141.anInt2652 = 1;
		Static327.anInt6109 = 0;
		Static66.anInt1625 = 0;
		Static318.anInt5968 = -3;
	}
}
