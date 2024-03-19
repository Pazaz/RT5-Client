import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "[B")
	public final byte[] aByteArray64;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "([B)V")
	public Class1_Sub23(@OriginalArg(0) byte[] arg0) {
		this.aByteArray64 = arg0;
	}
}
