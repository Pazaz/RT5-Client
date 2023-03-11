import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class InboundPacket {

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	public final int size;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	private final int opcode;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V")
	public InboundPacket(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.size = arg1;
		this.opcode = arg0;
	}

	@OriginalMember(owner = "client!h", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)I")
	public int getOpcode() {
		return this.opcode;
	}
}
