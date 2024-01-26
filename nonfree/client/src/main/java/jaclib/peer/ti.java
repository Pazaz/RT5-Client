package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/ti")
public final class ti {

	@OriginalMember(owner = "client!jaclib/peer/ti", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/ti", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/ti", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/ti", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.b.poll();
			if (local3 == null) {
				return;
			}
			@Pc(9) PeerReference local9 = (PeerReference) local3;
			this.a(local9, arg0 ^ 0x35DD);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/ti", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.b = this.a;
		arg0.a = null;
		if (this.c == null) {
			this.c = arg0;
		} else {
			this.a.a = arg0;
		}
		this.a = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/ti", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.b(0);
		if (this.c == arg0) {
			this.c = arg0.a;
		}
		if (this.a == arg0) {
			this.a = arg0.b;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/ti", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a(26588);
		while (this.a != null) {
			this.a(this.a, (int) 20993);
		}
		this.a(26588);
	}

	@OriginalMember(owner = "client!jaclib/peer/ti", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		this.a(26588);
	}
}
