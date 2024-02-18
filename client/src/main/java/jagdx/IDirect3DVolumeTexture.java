package jagdx;

import jaclib.peer.ti;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVolumeTexture")
public final class IDirect3DVolumeTexture extends IDirect3DBaseTexture {

	@OriginalMember(owner = "client!jagdx/IDirect3DVolumeTexture", name = "<init>", descriptor = "(Lclient!jaclib/peer/ti;)V")
	public IDirect3DVolumeTexture(@OriginalArg(0) ti arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DVolumeTexture", name = "LockBox", descriptor = "(IIIIIIIILclient!jagdx/PixelBuffer;)I")
	public native int LockBox(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) PixelBuffer arg8);

	@OriginalMember(owner = "client!jagdx/IDirect3DVolumeTexture", name = "UnlockBox", descriptor = "(I)Z")
	public native boolean UnlockBox(@OriginalArg(0) int arg0);
}
