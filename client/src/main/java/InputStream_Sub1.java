import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!md", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static295.method5212(30000L);
		return -1;
	}
}
