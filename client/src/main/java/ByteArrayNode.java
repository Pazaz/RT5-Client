import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class ByteArrayNode extends Node {

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "[B")
	public final byte[] aByteArray99;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([B)V")
	public ByteArrayNode(@OriginalArg(0) byte[] arg0) {
		this.aByteArray99 = arg0;
	}
}
