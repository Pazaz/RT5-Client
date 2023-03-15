import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class LinkedList {

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!ag;")
	private Node aClass2_131;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!ag;")
	public final Node aClass2_130 = new Node();

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public LinkedList() {
		this.aClass2_130.prev = this.aClass2_130;
		this.aClass2_130.next = this.aClass2_130;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ag;B)V")
	public void addTail(@OriginalArg(0) Node arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.next = this.aClass2_130;
		arg0.prev = this.aClass2_130.prev;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ld;I)V")
	public void method3542(@OriginalArg(0) LinkedList arg0) {
		this.method3546(arg0, this.aClass2_130.next);
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)I")
	public int method3543() {
		@Pc(11) int local11 = 0;
		@Pc(15) Node local15 = this.aClass2_130.next;
		while (this.aClass2_130 != local15) {
			local15 = local15.next;
			local11++;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void clear() {
		while (true) {
			@Pc(5) Node local5 = this.aClass2_130.next;
			if (local5 == this.aClass2_130) {
				this.aClass2_131 = null;
				return;
			}
			local5.unlink();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ag;)V")
	public void addHead(@OriginalArg(1) Node arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.next = this.aClass2_130.next;
		arg0.prev = this.aClass2_130;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ld;BLclient!ag;)V")
	private void method3546(@OriginalArg(0) LinkedList arg0, @OriginalArg(2) Node arg1) {
		@Pc(7) Node local7 = this.aClass2_130.prev;
		this.aClass2_130.prev = arg1.prev;
		arg1.prev.next = this.aClass2_130;
		if (arg1 != this.aClass2_130) {
			arg1.prev = arg0.aClass2_130.prev;
			arg1.prev.next = arg1;
			arg0.aClass2_130.prev = local7;
			local7.next = arg0.aClass2_130;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)Lclient!ag;")
	public Node method3547() {
		@Pc(6) Node local6 = this.aClass2_131;
		if (this.aClass2_130 == local6) {
			this.aClass2_131 = null;
			return null;
		} else {
			this.aClass2_131 = local6.prev;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)Lclient!ag;")
	public Node tail() {
		@Pc(12) Node local12 = this.aClass2_130.prev;
		if (local12 == this.aClass2_130) {
			this.aClass2_131 = null;
			return null;
		} else {
			this.aClass2_131 = local12.prev;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)Lclient!ag;")
	public Node method3549() {
		@Pc(7) Node local7 = this.aClass2_130.next;
		if (this.aClass2_130 == local7) {
			return null;
		} else {
			local7.unlink();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)Z")
	public boolean method3550() {
		return this.aClass2_130 == this.aClass2_130.next;
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(B)Lclient!ag;")
	public Node head() {
		@Pc(14) Node local14 = this.aClass2_130.next;
		if (local14 == this.aClass2_130) {
			this.aClass2_131 = null;
			return null;
		} else {
			this.aClass2_131 = local14.next;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)Lclient!ag;")
	public Node next() {
		@Pc(13) Node local13 = this.aClass2_131;
		if (local13 == this.aClass2_130) {
			this.aClass2_131 = null;
			return null;
		} else {
			this.aClass2_131 = local13.next;
			return local13;
		}
	}
}
