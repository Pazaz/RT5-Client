import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class SubInterface extends Node {

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!cu", name = "A", descriptor = "I")
	public int anInt1373;
}
