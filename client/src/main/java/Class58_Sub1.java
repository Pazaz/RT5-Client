import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method6097() throws IOException {
		return this.method6096();
	}
}
