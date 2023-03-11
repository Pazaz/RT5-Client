import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("unpackclass!n")
public final class ExceptionTableEntry {

	@OriginalMember(owner = "unpackclass!n", name = "a", descriptor = "I")
	public int startPc;

	@OriginalMember(owner = "unpackclass!n", name = "b", descriptor = "I")
	public int endPcToHandlerPc;

	@OriginalMember(owner = "unpackclass!n", name = "c", descriptor = "I")
	public int reverseHandlerPc;

	@OriginalMember(owner = "unpackclass!n", name = "d", descriptor = "Lunpackclass!s;")
	public ConstantPoolEntry catchType;
}
