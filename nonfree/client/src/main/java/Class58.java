import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public abstract class Class58 {

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
	public int anInt6783;

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "Ljava/lang/String;")
	public String aString74;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)Ljava/net/Socket;")
	protected final Socket method6096() throws IOException {
		return new Socket(this.aString74, this.anInt6783);
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method6097() throws IOException;
}
