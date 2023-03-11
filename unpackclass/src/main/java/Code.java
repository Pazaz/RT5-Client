import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("unpackclass!r")
public final class Code {

	@OriginalMember(owner = "unpackclass!r", name = "a", descriptor = "I")
	public int maxStack;

	@OriginalMember(owner = "unpackclass!r", name = "b", descriptor = "I")
	public int maxLocals;

	@OriginalMember(owner = "unpackclass!r", name = "c", descriptor = "I")
	public int length;

	@OriginalMember(owner = "unpackclass!r", name = "d", descriptor = "[Lunpackclass!n;")
	public ExceptionTableEntry[] exceptionTable;

	@OriginalMember(owner = "unpackclass!r", name = "e", descriptor = "[Lunpackclass!o;")
	public LineNumberTableEntry[] lineNumberTable;
}
