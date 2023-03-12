import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "Z")
	public static boolean aBoolean208;

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_67 = new LocalizedString(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
	public static int anInt2954 = 100;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "[I")
	public static final int[] anIntArray187 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	public static void method2969() {
		Static119.aClass98_16.method2614();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BZ)V")
	public static void method2973(@OriginalArg(1) boolean arg0) {
		Static37.method1135();
		if (client.gameState != 30 && client.gameState != 25) {
			return;
		}
		Static367.anInt6876++;
		if (Static367.anInt6876 < 50 && !arg0) {
			return;
		}
		Static367.anInt6876 = 0;
		if (!Static101.aBoolean158 && Protocol.socket != null) {
			Protocol.method1960(Static326.aClass145_228);
			try {
				Protocol.socket.write(Protocol.outboundBuffer.pos, Protocol.outboundBuffer.data);
				Protocol.outboundBuffer.pos = 0;
			} catch (@Pc(57) IOException local57) {
				Static101.aBoolean158 = true;
			}
		}
		Static37.method1135();
	}
}
