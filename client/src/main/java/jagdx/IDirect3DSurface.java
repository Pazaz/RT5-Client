package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.ti;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSurface")
public final class IDirect3DSurface extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DSurface", name = "<init>", descriptor = "(Lclient!jaclib/peer/ti;)V")
	public IDirect3DSurface(@OriginalArg(0) ti arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DSurface", name = "LockRect", descriptor = "(IIIIILclient!jagdx/PixelBuffer;)I")
	public native int LockRect(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) PixelBuffer arg5);

	@OriginalMember(owner = "client!jagdx/IDirect3DSurface", name = "UnlockRect", descriptor = "()Z")
	public native boolean UnlockRect();
}
