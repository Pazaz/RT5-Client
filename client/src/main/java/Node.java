import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class Node {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!ag;")
	public Node next;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "J")
	public long key;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!ag;")
	public Node prev;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Z")
	public final boolean isLinked() {
		return this.prev != null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public final void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.prev = null;
			this.next = null;
		}
	}
}
