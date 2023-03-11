import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("unpackclass!j")
public final class Attribute {

	@OriginalMember(owner = "unpackclass!j", name = "a", descriptor = "Lunpackclass!s;")
	public ConstantPoolEntry name;

	@OriginalMember(owner = "unpackclass!j", name = "b", descriptor = "Lunpackclass!s;")
	public ConstantPoolEntry constantValue;

	@OriginalMember(owner = "unpackclass!j", name = "c", descriptor = "Lunpackclass!r;")
	public Code code;

	@OriginalMember(owner = "unpackclass!j", name = "d", descriptor = "[Lunpackclass!s;")
	public ConstantPoolEntry[] exceptions;
}
