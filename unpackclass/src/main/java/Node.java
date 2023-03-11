import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("unpackclass!w")
public class Node {

	@OriginalMember(owner = "unpackclass!w", name = "a", descriptor = "Lunpackclass!w;")
	public Node next;

	@OriginalMember(owner = "unpackclass!w", name = "b", descriptor = "Lunpackclass!w;")
	public Node prev;

	@OriginalMember(owner = "unpackclass!w", name = "a", descriptor = "()V")
	public final void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.next = null;
			this.prev = null;
		}
	}

	@OriginalMember(owner = "unpackclass!w", name = "b", descriptor = "()Z")
	public final boolean isLinked() {
		return this.prev != null;
	}
}
