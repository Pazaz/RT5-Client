package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknownReference")
public final class IUnknownReference extends PeerReference {

	@OriginalMember(owner = "client!jaclib/peer/IUnknownReference", name = "<init>", descriptor = "(Lclient!jaclib/peer/IUnknown;Lclient!jaclib/peer/ti;)V")
	public IUnknownReference(@OriginalArg(0) IUnknown arg0, @OriginalArg(1) ti arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jaclib/peer/IUnknownReference", name = "releasePeer", descriptor = "(J)J")
	protected native long releasePeer(@OriginalArg(0) long arg0);
}
