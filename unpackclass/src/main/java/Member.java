import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("unpackclass!g")
public final class Member {

	@OriginalMember(owner = "unpackclass!g", name = "a", descriptor = "I")
	public int accessFlags;

	@OriginalMember(owner = "unpackclass!g", name = "b", descriptor = "Lunpackclass!s;")
	public ConstantPoolEntry nameAndType;

	@OriginalMember(owner = "unpackclass!g", name = "c", descriptor = "[Lunpackclass!j;")
	public Attribute[] attributes;
}
