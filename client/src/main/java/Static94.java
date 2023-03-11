import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
	public static int anInt1979 = 0;

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "Lclient!h;")
	public static final InboundPacket aClass89_79 = new InboundPacket(53, -1);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIZILclient!r;)V")
	public static void method2042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class197 arg2) {
		Static341.anInt6376 = 0;
		Static105.anInt2183 = arg1;
		Static28.anInt672 = 10000;
		Static384.aBoolean485 = false;
		Static116.aClass197_26 = arg2;
		Static235.anInt3365 = 1;
		Static356.anInt6641 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIILclient!cj;Lclient!cj;)V")
	public static void method2044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub3 arg3, @OriginalArg(4) Class11_Sub3 arg4) {
		@Pc(4) Class67 local4 = Static266.method4500(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub3_2 = arg3;
			local4.aClass11_Sub3_3 = arg4;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
	public static void method2045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static91.method1960(Static126.aClass145_229);
		Protocol.outboundBuffer.p4(arg0);
		Protocol.outboundBuffer.ip2add(arg1);
	}
}
