package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.ti;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DBaseTexture")
public class IDirect3DBaseTexture extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DBaseTexture", name = "<init>", descriptor = "(Lclient!jaclib/peer/ti;)V")
	public IDirect3DBaseTexture(@OriginalArg(0) ti arg0) {
		super(arg0);
	}
}
