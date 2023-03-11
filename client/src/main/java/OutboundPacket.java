import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class OutboundPacket {

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public final int opcode;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(II)V")
	public OutboundPacket(@OriginalArg(0) int opcode, @OriginalArg(1) int length) {
		this.opcode = opcode;
	}

	@OriginalMember(owner = "client!vr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
