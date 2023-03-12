import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class ClientProt {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	private final int opcode;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V")
	public ClientProt(@OriginalArg(0) int opcode, @OriginalArg(1) int length) {
		this.opcode = opcode;
	}

	@OriginalMember(owner = "client!mc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)I")
	public int getOpcode() {
		return this.opcode;
	}
}
