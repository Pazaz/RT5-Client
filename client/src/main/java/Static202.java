import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static202 {

	@OriginalMember(owner = "client!lq", name = "J", descriptor = "[I")
	public static int[] anIntArray220;

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
	public static int anInt3714 = -1;

	@OriginalMember(owner = "client!lq", name = "t", descriptor = "Lclient!h;")
	public static final InboundPacket aClass89_153 = new InboundPacket(28, 6);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V")
	public static void method3678(@OriginalArg(1) int arg0) {
		Static25.anInt648 = arg0;
		Static48.aClass98_3.method2614();
	}
}
