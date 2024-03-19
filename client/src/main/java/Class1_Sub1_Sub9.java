import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gr", name = "M", descriptor = "[B")
	public final byte[] aByteArray16;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray16 = arg0;
	}
}
