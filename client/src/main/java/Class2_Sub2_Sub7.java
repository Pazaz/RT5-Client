import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dca", name = "u", descriptor = "[B")
	public final byte[] aByteArray21;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray21 = arg0;
	}
}
