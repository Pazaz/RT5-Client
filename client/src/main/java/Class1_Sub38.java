import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class1_Sub38 extends Class1 {

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "[S")
	public final short[] aShortArray108;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "[B")
	public final byte[] aByteArray78;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub38(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray108 = arg0;
		this.aByteArray78 = arg1;
	}
}
