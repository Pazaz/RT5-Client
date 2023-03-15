import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class BrokenInputStream extends InputStream {

	@OriginalMember(owner = "client!mk", name = "read", descriptor = "()I")
	@Override
	public int read() {
		ThreadUtils.sleep(30000L);
		return -1;
	}
}
