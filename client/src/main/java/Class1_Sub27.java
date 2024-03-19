import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "S")
	public short aShort61;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	private Class1_Sub27() {
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(S)V")
	public Class1_Sub27(@OriginalArg(0) short arg0) {
		this.aShort61 = arg0;
	}
}
