import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("unpackclass!s")
public final class ConstantPoolEntry extends Node {

	@OriginalMember(owner = "unpackclass!s", name = "d", descriptor = "Lunpackclass!s;")
	public ConstantPoolEntry name;

	@OriginalMember(owner = "unpackclass!s", name = "e", descriptor = "Lunpackclass!s;")
	public ConstantPoolEntry descriptor;

	@OriginalMember(owner = "unpackclass!s", name = "f", descriptor = "J")
	public long longValue;

	@OriginalMember(owner = "unpackclass!s", name = "g", descriptor = "[B")
	public byte[] bytesValue;

	@OriginalMember(owner = "unpackclass!s", name = "h", descriptor = "I")
	public int tag;

	@OriginalMember(owner = "unpackclass!s", name = "i", descriptor = "I")
	public int index;
}
