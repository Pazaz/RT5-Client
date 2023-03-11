import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!f")
public final class LinkedList {

	@OriginalMember(owner = "unpackclass!f", name = "b", descriptor = "Lunpackclass!w;")
	private Node cursor;

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "Lunpackclass!w;")
	private final Node sentinel = new Node();

	@OriginalMember(owner = "unpackclass!f", name = "<init>", descriptor = "()V")
	public LinkedList() {
		this.sentinel.next = this.sentinel;
		this.sentinel.prev = this.sentinel;
	}

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "(Lunpackclass!w;)V")
	public void addTail(@OriginalArg(0) Node arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.sentinel.prev;
		arg0.next = this.sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "()Lunpackclass!w;")
	public Node method6594() {
		@Pc(3) Node local3 = this.sentinel.next;
		if (local3 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = local3.next;
			return local3;
		}
	}

	@OriginalMember(owner = "unpackclass!f", name = "b", descriptor = "()Lunpackclass!w;")
	public Node method6595() {
		@Pc(2) Node local2 = this.cursor;
		if (local2 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = local2.next;
			return local2;
		}
	}
}
