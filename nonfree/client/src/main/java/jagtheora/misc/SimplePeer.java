package jagtheora.misc;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/misc/SimplePeer")
public abstract class SimplePeer {

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "peer", descriptor = "J")
	private long peer;

	static {
		init();
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "init", descriptor = "()V")
	protected static native void init();

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "clear", descriptor = "()V")
	protected abstract void clear();

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "b", descriptor = "()Z")
	public final boolean b() {
		return this.peer == 0L;
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "setPeer", descriptor = "(J)V")
	private void setPeer(@OriginalArg(0) long arg0) {
		this.peer = arg0;
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "a", descriptor = "()V")
	public final void a() {
		if (!this.b()) {
			this.clear();
		}
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (!this.b()) {
			this.a();
		}
		super.finalize();
	}
}
