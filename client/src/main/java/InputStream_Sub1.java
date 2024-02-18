import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!mo", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static638.method8395(30000L);
		return -1;
	}
}
