import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_40 = new Class135();

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!nk;I)V")
	public static void method6129(@OriginalArg(0) Class161 arg0) {
		if (!Static330.aBoolean419) {
			return;
		}
		Static91.method1960(Static105.aClass145_79);
		Protocol.outboundBuffer.p4(arg0.anInt4317);
		Protocol.outboundBuffer.p2add(arg0.anInt4297);
		Protocol.outboundBuffer.p2add(Static214.anInt3792);
		Protocol.outboundBuffer.p2(Static196.anInt3317);
		Protocol.outboundBuffer.mp4(Static337.anInt6317);
		Protocol.outboundBuffer.p2(arg0.anInt4300);
	}
}
